package nekonesse.cubiestoolkit.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {
    public KilnBlockEntity(BlockPos pos, BlockState blockState) {
        super(CubiesToolkitBlockEntities.KILN_BE.get(), pos, blockState, RecipeType.SMOKING);
    }

    protected Component getDefaultName() {
        return Component.translatable("container.kiln");
    }

    protected int getBurnDuration(ItemStack fuel) {
        return super.getBurnDuration(fuel) / 2;
    }

    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new SmokerMenu(id, player, this, this.dataAccess);
    }
}
