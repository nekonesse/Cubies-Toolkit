package nekonesse.cubiestoolkit.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ItemCubbyBlock extends BaseEntityBlock {
    public static final MapCodec<ItemCubbyBlock> CODEC = simpleCodec(ItemCubbyBlock::new);

    protected ItemCubbyBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }

    /*@Override
    protected void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if (state.getBlock() != newState.getBlock()) {
            if (level.getBlockEntity(pos) instanceof ItemCubbyBlockEntity itemCubbyBlockEntity) {
                itemCubbyBlockEntity.drops();
                level.updateNeighbourForOutputSignal(pos, this);
            }
        }
    }*/
}
