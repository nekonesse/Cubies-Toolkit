package nekonesse.cubiestoolkit.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;

public class ItemCubbyEntity extends BlockEntity {
    public final ItemStackHandler inventory = new ItemStackHandler(1) {
        @Override
        protected int getStackLimit(int slot, ItemStack stack) {
            return 5120;
        }
    };

    public ItemCubbyEntity(BlockPos pos, BlockState blockState) {
            super(CubiesToolkitBlockEntities.ITEM_CUBBY_BE.get(), pos, blockState);
    }

    public void clearContents() {
        inventory.setStackInSlot(0, ItemStack.EMPTY);
    }
}
