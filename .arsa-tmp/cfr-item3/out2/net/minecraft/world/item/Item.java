/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  net.fabricmc.fabric.api.item.v1.FabricItem
 *  net.minecraft.SharedConstants
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.Holder$Reference
 *  net.minecraft.core.component.DataComponentMap
 *  net.minecraft.core.component.DataComponents
 *  net.minecraft.core.registries.BuiltInRegistries
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.RegistryFriendlyByteBuf
 *  net.minecraft.network.chat.CommonComponents
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.codec.ByteBufCodecs
 *  net.minecraft.network.codec.StreamCodec
 *  net.minecraft.resources.Identifier
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.Mth
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.SlotAccess
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.flag.FeatureElement
 *  net.minecraft.world.flag.FeatureFlagSet
 *  net.minecraft.world.inventory.ClickAction
 *  net.minecraft.world.inventory.Slot
 *  net.minecraft.world.inventory.tooltip.TooltipComponent
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.Item$TooltipContext
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.ItemUseAnimation
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.component.Consumable
 *  net.minecraft.world.item.component.KineticWeapon
 *  net.minecraft.world.item.component.Tool
 *  net.minecraft.world.item.component.TooltipDisplay
 *  net.minecraft.world.item.context.UseOnContext
 *  net.minecraft.world.item.equipment.Equippable
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.Vec3
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package net.minecraft.world.item;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.SharedConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.KineticWeapon;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class Item
implements FeatureElement,
ItemLike,
FabricItem {
    public static final Codec<Holder<Item>> CODEC = BuiltInRegistries.ITEM.holderByNameCodec().validate(holder -> holder.is(Items.AIR.builtInRegistryHolder()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success((Object)holder));
    public static final StreamCodec<RegistryFriendlyByteBuf, Holder<Item>> STREAM_CODEC = ByteBufCodecs.holderRegistry((ResourceKey)Registries.ITEM);
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final Map<Block, Item> BY_BLOCK = Maps.newHashMap();
    public static final Identifier BASE_ATTACK_DAMAGE_ID = Identifier.withDefaultNamespace((String)"base_attack_damage");
    public static final Identifier BASE_ATTACK_SPEED_ID = Identifier.withDefaultNamespace((String)"base_attack_speed");
    public static final int DEFAULT_MAX_STACK_SIZE = 64;
    public static final int ABSOLUTE_MAX_STACK_SIZE = 99;
    public static final int MAX_BAR_WIDTH = 13;
    protected static final int APPROXIMATELY_INFINITE_USE_DURATION = 72000;
    private final Holder.Reference<Item> builtInRegistryHolder = BuiltInRegistries.ITEM.createIntrusiveHolder((Object)this);
    private final DataComponentMap components;
    private final @Nullable Item craftingRemainingItem;
    protected final String descriptionId;
    private final FeatureFlagSet requiredFeatures;

    public static int getId(Item item) {
        return item == null ? 0 : BuiltInRegistries.ITEM.getId((Object)item);
    }

    public static Item byId(int i) {
        return (Item)BuiltInRegistries.ITEM.byId(i);
    }

    @Deprecated
    public static Item byBlock(Block block) {
        return BY_BLOCK.getOrDefault(block, Items.AIR);
    }

    public Item(Properties properties) {
        String string;
        this.descriptionId = properties.effectiveDescriptionId();
        this.components = properties.buildAndValidateComponents((Component)Component.translatable((String)this.descriptionId), properties.effectiveModel());
        this.craftingRemainingItem = properties.craftingRemainingItem;
        this.requiredFeatures = properties.requiredFeatures;
        if (SharedConstants.IS_RUNNING_IN_IDE && !(string = this.getClass().getSimpleName()).endsWith("Item")) {
            LOGGER.error("Item classes should end with Item and {} doesn't.", (Object)string);
        }
    }

    @Deprecated
    public Holder.Reference<Item> builtInRegistryHolder() {
        return this.builtInRegistryHolder;
    }

    public DataComponentMap components() {
        return this.components;
    }

    public int getDefaultMaxStackSize() {
        return (Integer)this.components.getOrDefault(DataComponents.MAX_STACK_SIZE, (Object)1);
    }

    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack itemStack, int i) {
    }

    public void onDestroyed(ItemEntity itemEntity) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean canDestroyBlock(ItemStack itemStack, BlockState blockState, Level level, BlockPos blockPos, LivingEntity livingEntity) {
        Tool tool = (Tool)itemStack.get(DataComponents.TOOL);
        if (tool == null) return true;
        if (tool.canDestroyBlocksInCreative()) return true;
        if (!(livingEntity instanceof Player)) return true;
        Player player = (Player)livingEntity;
        if (player.getAbilities().instabuild) return false;
        return true;
    }

    public Item asItem() {
        return this;
    }

    public InteractionResult useOn(UseOnContext useOnContext) {
        return InteractionResult.PASS;
    }

    public float getDestroySpeed(ItemStack itemStack, BlockState blockState) {
        Tool tool = (Tool)itemStack.get(DataComponents.TOOL);
        return tool != null ? tool.getMiningSpeed(blockState) : 1.0f;
    }

    public InteractionResult use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        Consumable consumable = (Consumable)itemStack.get(DataComponents.CONSUMABLE);
        if (consumable != null) {
            return consumable.startConsuming((LivingEntity)player, itemStack, interactionHand);
        }
        Equippable equippable = (Equippable)itemStack.get(DataComponents.EQUIPPABLE);
        if (equippable != null && equippable.swappable()) {
            return equippable.swapWithEquipmentSlot(itemStack, player);
        }
        if (itemStack.has(DataComponents.BLOCKS_ATTACKS)) {
            player.startUsingItem(interactionHand);
            return InteractionResult.CONSUME;
        }
        KineticWeapon kineticWeapon = (KineticWeapon)itemStack.get(DataComponents.KINETIC_WEAPON);
        if (kineticWeapon != null) {
            player.startUsingItem(interactionHand);
            kineticWeapon.makeSound((Entity)player);
            return InteractionResult.CONSUME;
        }
        return InteractionResult.PASS;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        Consumable consumable = (Consumable)itemStack.get(DataComponents.CONSUMABLE);
        if (consumable != null) {
            return consumable.onConsume(level, livingEntity, itemStack);
        }
        return itemStack;
    }

    public boolean isBarVisible(ItemStack itemStack) {
        return itemStack.isDamaged();
    }

    public int getBarWidth(ItemStack itemStack) {
        return Mth.clamp((int)Math.round(13.0f - (float)itemStack.getDamageValue() * 13.0f / (float)itemStack.getMaxDamage()), (int)0, (int)13);
    }

    public int getBarColor(ItemStack itemStack) {
        int i = itemStack.getMaxDamage();
        float f = Math.max(0.0f, ((float)i - (float)itemStack.getDamageValue()) / (float)i);
        return Mth.hsvToRgb((float)(f / 3.0f), (float)1.0f, (float)1.0f);
    }

    public boolean overrideStackedOnOther(ItemStack itemStack, Slot slot, ClickAction clickAction, Player player) {
        return false;
    }

    public boolean overrideOtherStackedOnMe(ItemStack itemStack, ItemStack itemStack2, Slot slot, ClickAction clickAction, Player player, SlotAccess slotAccess) {
        return false;
    }

    public float getAttackDamageBonus(Entity entity, float f, DamageSource damageSource) {
        return 0.0f;
    }

    @Deprecated
    public @Nullable DamageSource getItemDamageSource(LivingEntity livingEntity) {
        return null;
    }

    public void hurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity livingEntity2) {
    }

    public void postHurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity livingEntity2) {
    }

    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        Tool tool = (Tool)itemStack.get(DataComponents.TOOL);
        if (tool == null) {
            return false;
        }
        if (!level.isClientSide() && blockState.getDestroySpeed((BlockGetter)level, blockPos) != 0.0f && tool.damagePerBlock() > 0) {
            itemStack.hurtAndBreak(tool.damagePerBlock(), livingEntity, EquipmentSlot.MAINHAND);
        }
        return true;
    }

    public boolean isCorrectToolForDrops(ItemStack itemStack, BlockState blockState) {
        Tool tool = (Tool)itemStack.get(DataComponents.TOOL);
        return tool != null && tool.isCorrectForDrops(blockState);
    }

    public InteractionResult interactLivingEntity(ItemStack itemStack, Player player, LivingEntity livingEntity, InteractionHand interactionHand) {
        return InteractionResult.PASS;
    }

    public String toString() {
        return BuiltInRegistries.ITEM.wrapAsHolder((Object)this).getRegisteredName();
    }

    public final ItemStack getCraftingRemainder() {
        return this.craftingRemainingItem == null ? ItemStack.EMPTY : new ItemStack((ItemLike)this.craftingRemainingItem);
    }

    public void inventoryTick(ItemStack itemStack, ServerLevel serverLevel, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
    }

    public void onCraftedBy(ItemStack itemStack, Player player) {
        this.onCraftedPostProcess(itemStack, player.level());
    }

    public void onCraftedPostProcess(ItemStack itemStack, Level level) {
    }

    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
        Consumable consumable = (Consumable)itemStack.get(DataComponents.CONSUMABLE);
        if (consumable != null) {
            return consumable.animation();
        }
        if (itemStack.has(DataComponents.BLOCKS_ATTACKS)) {
            return ItemUseAnimation.BLOCK;
        }
        if (itemStack.has(DataComponents.KINETIC_WEAPON)) {
            return ItemUseAnimation.SPEAR;
        }
        return ItemUseAnimation.NONE;
    }

    public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
        Consumable consumable = (Consumable)itemStack.get(DataComponents.CONSUMABLE);
        if (consumable != null) {
            return consumable.consumeTicks();
        }
        if (itemStack.has(DataComponents.BLOCKS_ATTACKS) || itemStack.has(DataComponents.KINETIC_WEAPON)) {
            return 72000;
        }
        return 0;
    }

    public boolean releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        return false;
    }

    @Deprecated
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, TooltipDisplay tooltipDisplay, Consumer<Component> consumer, TooltipFlag tooltipFlag) {
    }

    public Optional<TooltipComponent> getTooltipImage(ItemStack itemStack) {
        return Optional.empty();
    }

    @VisibleForTesting
    public final String getDescriptionId() {
        return this.descriptionId;
    }

    public final Component getName() {
        return (Component)this.components.getOrDefault(DataComponents.ITEM_NAME, (Object)CommonComponents.EMPTY);
    }

    public Component getName(ItemStack itemStack) {
        return (Component)itemStack.getComponents().getOrDefault(DataComponents.ITEM_NAME, (Object)CommonComponents.EMPTY);
    }

    public boolean isFoil(ItemStack itemStack) {
        return itemStack.isEnchanted();
    }

    protected static BlockHitResult getPlayerPOVHitResult(Level level, Player player, ClipContext.Fluid fluid) {
        Vec3 vec3 = player.getEyePosition();
        Vec3 vec32 = vec3.add(player.calculateViewVector(player.getXRot(), player.getYRot()).scale(player.blockInteractionRange()));
        return level.clip(new ClipContext(vec3, vec32, ClipContext.Block.OUTLINE, fluid, (Entity)player));
    }

    public boolean useOnRelease(ItemStack itemStack) {
        return false;
    }

    public ItemStack getDefaultInstance() {
        return new ItemStack((ItemLike)this);
    }

    public boolean canFitInsideContainerItems() {
        return true;
    }

    public FeatureFlagSet requiredFeatures() {
        return this.requiredFeatures;
    }

    public boolean shouldPrintOpWarning(ItemStack itemStack, @Nullable Player player) {
        return false;
    }
}
