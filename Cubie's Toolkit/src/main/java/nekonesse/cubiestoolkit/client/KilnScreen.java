package nekonesse.cubiestoolkit.client;

import nekonesse.cubiestoolkit.CubiesToolkit;
import nekonesse.cubiestoolkit.inventory.KilnMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmokingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class KilnScreen extends AbstractFurnaceScreen<KilnMenu> {
    private static final ResourceLocation LIT_PROGRESS_SPRITE = ResourceLocation.fromNamespaceAndPath(CubiesToolkit.MODID, "container/kiln/lit_progress");
    private static final ResourceLocation BURN_PROGRESS_SPRITE =  ResourceLocation.fromNamespaceAndPath(CubiesToolkit.MODID, "container/kiln/burn_progress");
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(CubiesToolkit.MODID, "textures/gui/container/kiln.png");

    public KilnScreen(KilnMenu menu, Inventory playerInventory, Component title) {
        super(menu, new SmokingRecipeBookComponent(), playerInventory, title, TEXTURE, LIT_PROGRESS_SPRITE, BURN_PROGRESS_SPRITE);
    }
}
