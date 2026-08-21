package name.modid.template;

import name.modid.ArsaItems;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.ItemEnchantments;

/**
 * 附魔模板的核心数据读写与合法性校验。
 * 所有“模板能否应用”的规则都收口在这里，供锻造台配方与 GUI 槽位判定复用。
 */
public final class TemplateEnchantments {
	private TemplateEnchantments() {
	}

	public static boolean isTemplate(ItemStack stack) {
		return stack.is(ArsaItems.ENCHANTMENT_TEMPLATE);
	}

	/** 模板自身的附魔数据（minecraft:enchantments 组件）。 */
	public static ItemEnchantments get(ItemStack stack) {
		return stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
	}

	/**
	 * 附魔书 -> 模板；只复制书上的全部附魔（stored_enchantments 由原版助手方法自动处理）。
	 * 不复制附魔书的 repair_cost、名字、Lore 或其他组件，因此新模板的铁砧 penalty 始终为零。
	 */
	public static ItemStack fromBook(ItemStack book) {
		ItemStack template = new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE);
		// 防御性显式移除：模板输出绝不携带输入附魔书累积的铁砧 penalty。
		template.remove(DataComponents.REPAIR_COST);
		ItemEnchantments enchantments = EnchantmentHelper.getEnchantmentsForCrafting(book);
		if (!enchantments.isEmpty()) {
			template.set(DataComponents.ENCHANTMENTS, enchantments);
		}
		return template;
	}

	/**
	 * 锻造台基底槽是否允许放入该物品（槽位判定用，比 canApply 宽松）：
	 * 任意非空、且不是附魔书 / 普通书 / 附魔模板。
	 */
	public static boolean isValidBase(ItemStack stack) {
		return !stack.isEmpty()
			&& !stack.is(Items.ENCHANTED_BOOK)
			&& !stack.is(Items.BOOK)
			&& !isTemplate(stack);
	}

	/**
	 * 严格合法性检查：任一条件不满足即返回 false，锻造台结果槽显示为空。
	 */
	public static boolean canApply(ItemStack template, ItemStack base) {
		if (!isTemplate(template) || !isValidBase(base)) {
			return false;
		}

		ItemEnchantments toAdd = get(template);
		if (toAdd.isEmpty()) {
			return false;
		}

		ItemEnchantments existing = base.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);

		// 1) 每条附魔必须适用于基底；基底已有同种附魔（不论等级）一律拒绝。
		for (Holder<Enchantment> holder : toAdd.keySet()) {
			if (!holder.value().canEnchant(base)) {
				return false;
			}
			if (existing.getLevel(holder.value()) > 0) {
				return false;
			}
		}

		// 2) 模板内部两两互斥。
		for (Holder<Enchantment> a : toAdd.keySet()) {
			for (Holder<Enchantment> b : toAdd.keySet()) {
				if (a != b && !a.value().isCompatibleWith(b.value())) {
					return false;
				}
			}
		}

		// 3) 与基底已有附魔互斥（双向检查，防御性）。
		for (Holder<Enchantment> a : toAdd.keySet()) {
			for (Holder<Enchantment> b : existing.keySet()) {
				if (!a.value().isCompatibleWith(b.value()) || !b.value().isCompatibleWith(a.value())) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * 基底复制品 + 模板附魔合并；名字 / Lore / 耐久 / repair_cost 等组件原样保留。
	 */
	public static ItemStack applyTo(ItemStack template, ItemStack base) {
		ItemStack result = base.copy();
		// 锻造台只消耗 1 个基底；若基底是可堆叠的可附魔物品，结果也必须只有 1 个，
		// 否则 base.copy() 会把整组数量带到结果槽，形成物品复制。
		result.setCount(1);
		ItemEnchantments existing = result.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
		ItemEnchantments toAdd = get(template);
		ItemEnchantments.Mutable mutable = new ItemEnchantments.Mutable(existing);

		for (Holder<Enchantment> holder : toAdd.keySet()) {
			mutable.upgrade(holder.value(), toAdd.getLevel(holder.value()));
		}

		result.set(DataComponents.ENCHANTMENTS, mutable.toImmutable());
		return result;
	}
}
