package nekonesse.cubiestoolkit.blocks.entity;

import nekonesse.cubiestoolkit.CubiesToolkit;
import nekonesse.cubiestoolkit.blocks.CubiesToolkitBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SmokerBlockEntity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CubiesToolkitBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CubiesToolkit.MODID);

    public static final Supplier<BlockEntityType<ItemCubbyEntity>> ITEM_CUBBY_BE =
            BLOCK_ENTITIES.register("item_cubby_be", () -> BlockEntityType.Builder.of(
                    ItemCubbyEntity::new, CubiesToolkitBlocks.ITEM_CUBBY.get()).build(null));

    public static final Supplier<BlockEntityType<KilnBlockEntity>> KILN_BE =
            BLOCK_ENTITIES.register("kiln_be", () -> BlockEntityType.Builder.of(
                    KilnBlockEntity::new, CubiesToolkitBlocks.KILN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
