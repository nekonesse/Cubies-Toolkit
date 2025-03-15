package nekonesse.cubiestoolkit;

import nekonesse.cubiestoolkit.client.KilnScreen;
import nekonesse.cubiestoolkit.inventory.KilnMenu;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CubiesToolkitContainerMenus {
    public static final DeferredRegister<MenuType<?>> CONTAINER_MENUS = DeferredRegister.create(Registries.MENU, CubiesToolkit.MODID);

    public static final Supplier<MenuType<KilnMenu>> KILN_MENU = CONTAINER_MENUS.register("kiln_menu", () -> new MenuType<>(KilnMenu::new, FeatureFlags.VANILLA_SET));

    private static <T extends AbstractFurnaceMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return CONTAINER_MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }
}
