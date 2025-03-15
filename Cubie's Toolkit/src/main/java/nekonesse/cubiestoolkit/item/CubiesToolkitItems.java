package nekonesse.cubiestoolkit.item;

import nekonesse.cubiestoolkit.CubiesToolkit;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CubiesToolkitItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CubiesToolkit.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
