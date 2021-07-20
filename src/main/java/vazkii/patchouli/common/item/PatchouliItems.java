package vazkii.patchouli.common.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import vazkii.patchouli.common.base.Patchouli;
import vazkii.patchouli.common.recipe.BookRecipe;
import vazkii.patchouli.common.recipe.ShapedBookRecipe;
import vazkii.patchouli.common.recipe.ShapelessBookRecipe;

public class PatchouliItems {

	public static final Identifier BOOK_ID = new Identifier(Patchouli.MOD_ID, "guide_book");
	public static Item book;

	public static void init() {
		book = new ItemModBook();
		Registry.register(Registry.ITEM, BOOK_ID, book);

		Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Patchouli.MOD_ID, "shaped_book_recipe"), ShapedBookRecipe.SERIALIZER);
		Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Patchouli.MOD_ID, "shapeless_book_recipe"), ShapelessBookRecipe.SERIALIZER);
	}
}
