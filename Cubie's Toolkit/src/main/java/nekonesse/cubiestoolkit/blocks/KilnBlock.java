package nekonesse.cubiestoolkit.blocks;

import com.mojang.serialization.MapCodec;
import nekonesse.cubiestoolkit.blocks.entity.KilnBlockEntity;
import nekonesse.cubiestoolkit.blocks.entity.CubiesToolkitBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

//SmokerBlock
public class KilnBlock extends AbstractFurnaceBlock {
    protected KilnBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends AbstractFurnaceBlock> codec() {
        return null;
    }

    @Override
    protected void openContainer(Level level, BlockPos blockPos, Player player) {
        BlockEntity blockentity = level.getBlockEntity(blockPos);
        if (blockentity instanceof KilnBlockEntity) {
            // SmokerBlockEntity
            player.openMenu((MenuProvider)blockentity);
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new KilnBlockEntity(blockPos, blockState);
    }

    public <T extends BlockEntity> BlockEntityTicker getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return createFurnaceTicker(level, blockEntityType, CubiesToolkitBlockEntities.KILN_BE.get());
    }
}
