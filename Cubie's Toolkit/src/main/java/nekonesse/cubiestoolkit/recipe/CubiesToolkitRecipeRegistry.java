package nekonesse.cubiestoolkit.recipe;

import nekonesse.cubiestoolkit.CubiesToolkit;
import nekonesse.cubiestoolkit.crafting.FiringRecipe;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CubiesToolkitRecipeRegistry {
    private static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(CubiesToolkit.MODID, BuiltInRegistries.RECIPE_SERIALIZER);
    private static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(CubiesToolkit.MODID, BuiltInRegistries.RECIPE_TYPE);

    public static final DeferredRegister<RecipeType<FiringRecipe>> FIRING = create("firing");
    public static final DeferredRegister<RecipeSerializer<FiringRecipe>> FIRING_SERIALIZER = create("firing", FiringRecipe::new);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }

    private static <T extends Recipe<?>> DeferredHolder<RecipeType<?>, RecipeType<T>> create(String name) {
        Supplier<RecipeType<T>> type = () -> new RecipeType<>() {
            @Override
            public String toString() {
                return name;
            }
        };
        return RECIPE_TYPES.register(name, type);
    }

    private static <T extends Recipe<?>> DeferredHolder<RecipeSerializer<?>, RecipeSerializer<T>> create(String name, Supplier<RecipeSerializer<T>> serializer) {
        return RECIPE_SERIALIZERS.register(name, serializer);
    }
}
