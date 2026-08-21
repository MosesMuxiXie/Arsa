/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.renderer.item.ClientItem$Properties
 *  net.minecraft.client.renderer.item.ItemModel
 *  net.minecraft.client.renderer.item.ItemStackRenderState
 *  net.minecraft.client.resources.model.ModelManager
 *  net.minecraft.core.component.DataComponents
 *  net.minecraft.resources.Identifier
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.ItemOwner
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemDisplayContext
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  org.jspecify.annotations.Nullable
 */
package net.minecraft.client.renderer.item;

import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class ItemModelResolver {
    private final Function<Identifier, ItemModel> modelGetter = arg_0 -> ((ModelManager)modelManager).getItemModel(arg_0);
    private final Function<Identifier, ClientItem.Properties> clientProperties = arg_0 -> ((ModelManager)modelManager).getItemProperties(arg_0);

    public ItemModelResolver(ModelManager modelManager) {
    }

    public void updateForLiving(ItemStackRenderState itemStackRenderState, ItemStack itemStack, ItemDisplayContext itemDisplayContext, LivingEntity livingEntity) {
        this.updateForTopItem(itemStackRenderState, itemStack, itemDisplayContext, livingEntity.level(), (ItemOwner)livingEntity, livingEntity.getId() + itemDisplayContext.ordinal());
    }

    public void updateForNonLiving(ItemStackRenderState itemStackRenderState, ItemStack itemStack, ItemDisplayContext itemDisplayContext, Entity entity) {
        this.updateForTopItem(itemStackRenderState, itemStack, itemDisplayContext, entity.level(), null, entity.getId());
    }

    public void updateForTopItem(ItemStackRenderState itemStackRenderState, ItemStack itemStack, ItemDisplayContext itemDisplayContext, @Nullable Level level, @Nullable ItemOwner itemOwner, int i) {
        itemStackRenderState.clear();
        if (!itemStack.isEmpty()) {
            itemStackRenderState.displayContext = itemDisplayContext;
            this.appendItemLayers(itemStackRenderState, itemStack, itemDisplayContext, level, itemOwner, i);
        }
    }

    public void appendItemLayers(ItemStackRenderState itemStackRenderState, ItemStack itemStack, ItemDisplayContext itemDisplayContext, @Nullable Level level, @Nullable ItemOwner itemOwner, int i) {
        ClientLevel clientLevel;
        Identifier identifier = (Identifier)itemStack.get(DataComponents.ITEM_MODEL);
        if (identifier == null) {
            return;
        }
        itemStackRenderState.setOversizedInGui(this.clientProperties.apply(identifier).oversizedInGui());
        this.modelGetter.apply(identifier).update(itemStackRenderState, itemStack, this, itemDisplayContext, level instanceof ClientLevel ? (clientLevel = (ClientLevel)level) : null, itemOwner, i);
    }

    public boolean shouldPlaySwapAnimation(ItemStack itemStack) {
        Identifier identifier = (Identifier)itemStack.get(DataComponents.ITEM_MODEL);
        if (identifier == null) {
            return true;
        }
        return this.clientProperties.apply(identifier).handAnimationOnSwap();
    }

    public float swapAnimationScale(ItemStack itemStack) {
        Identifier identifier = (Identifier)itemStack.get(DataComponents.ITEM_MODEL);
        if (identifier == null) {
            return 1.0f;
        }
        return this.clientProperties.apply(identifier).swapAnimationScale();
    }
}
