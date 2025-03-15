package nekonesse.cubiestoolkit.blocks;

import nekonesse.cubiestoolkit.CubiesToolkit;
import nekonesse.cubiestoolkit.item.CubiesToolkitItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CubiesToolkitBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CubiesToolkit.MODID);

    public static final DeferredBlock<Block> ITEM_CUBBY = registerBlock("item_cubby",
            () -> new ItemCubbyBlock(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> KILN = registerBlock("kiln",
            () -> new KilnBlock(BlockBehaviour.Properties.of()));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        CubiesToolkitItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
