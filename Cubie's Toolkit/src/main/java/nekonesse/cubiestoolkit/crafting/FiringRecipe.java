package nekonesse.cubiestoolkit.crafting;

import nekonesse.cubiestoolkit.blocks.CubiesToolkitBlocks;
import nekonesse.cubiestoolkit.recipe.CubiesToolkitRecipeRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class FiringRecipe extends AbstractCookingRecipe {
    public FiringRecipe(String group, CookingBookCategory category, Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        super((RecipeType<?>) CubiesToolkitRecipeRegistry.FIRING, group, category, ingredient, result, experience, cookingTime);
    }

    public ItemStack getToastSymbol() {
        return new ItemStack(CubiesToolkitBlocks.KILN);
    }

    public RecipeSerializer<?> getSerializer() {
        return (RecipeSerializer<?>) CubiesToolkitRecipeRegistry.FIRING_SERIALIZER;
    }
}
