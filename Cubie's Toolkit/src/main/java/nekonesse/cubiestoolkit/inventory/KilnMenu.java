package nekonesse.cubiestoolkit.inventory;

import nekonesse.cubiestoolkit.CubiesToolkitContainerMenus;
import nekonesse.cubiestoolkit.recipe.CubiesToolkitRecipeRegistry;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
SmokerMenu

public class KilnMenu extends AbstractFurnaceMenu {
    public KilnMenu(int containerId, Inventory playerInventory) {
        super(CubiesToolkitContainerMenus.KILN_MENU.get(), CubiesToolkitRecipeRegistry.FIRING, RecipeBookType.SMOKER, containerId, playerInventory);
    }

    public KilnMenu(int containerId, Inventory playerInventory, Container kilnContainer, ContainerData smokerData) {
        super(CubiesToolkitContainerMenus.KILN_MENU.get(), CubiesToolkitRecipeRegistry.FIRING, RecipeBookType.SMOKER, containerId, playerInventory, kilnContainer, smokerData);
    }
}
