package net.fire_horse27.morestairs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fire_horse27.morestairs.util.ModTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

private static final List<Item> MATERIAL = List.of(Items.OAK_PLANKS, Items.SPRUCE_PLANKS, Items.BIRCH_PLANKS,
        Items.JUNGLE_PLANKS, Items.ACACIA_PLANKS, Items.DARK_OAK_PLANKS, Items.MANGROVE_PLANKS, Items.CHERRY_PLANKS,
        Items.BAMBOO_PLANKS, Items.CRIMSON_PLANKS, Items.WARPED_PLANKS, Items.BAMBOO_MOSAIC, Items.STONE,
        Items.COBBLESTONE, Items.MOSSY_COBBLESTONE, Items.STONE_BRICKS, Items.MOSSY_STONE_BRICKS, Items.GRANITE,
        Items.POLISHED_GRANITE, Items.DIORITE, Items.POLISHED_DIORITE, Items.ANDESITE, Items.POLISHED_ANDESITE,
        Items.COBBLED_DEEPSLATE, Items.POLISHED_DEEPSLATE, Items.DEEPSLATE_BRICKS, Items.DEEPSLATE_TILES, Items.TUFF,
        Items.POLISHED_TUFF, Items.TUFF_BRICKS, Items.BRICKS, Items.MUD_BRICKS, Items.SANDSTONE, Items.SMOOTH_SANDSTONE,
        Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, Items.PRISMARINE, Items.PRISMARINE_BRICKS,
        Items.DARK_PRISMARINE, Items.NETHER_BRICKS, Items.RED_NETHER_BRICKS, Items.BLACKSTONE,
        Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BRICKS, Items.END_STONE_BRICKS, Items.PURPUR_BLOCK,
        Items.QUARTZ_BLOCK, Items.SMOOTH_QUARTZ, Items.CUT_COPPER, Items.EXPOSED_CUT_COPPER, Items.WEATHERED_CUT_COPPER,
        Items.OXIDIZED_CUT_COPPER, Items.WAXED_CUT_COPPER, Items.WAXED_EXPOSED_CUT_COPPER,
        Items.WAXED_WEATHERED_CUT_COPPER, Items.WAXED_OXIDIZED_CUT_COPPER);

private static final List<Item> STAIR = List.of(Items.OAK_STAIRS, Items.SPRUCE_STAIRS, Items.BIRCH_STAIRS,
        Items.JUNGLE_STAIRS, Items.ACACIA_STAIRS, Items.DARK_OAK_STAIRS, Items.MANGROVE_STAIRS, Items.CHERRY_STAIRS,
        Items.BAMBOO_STAIRS, Items.CRIMSON_STAIRS, Items.WARPED_STAIRS, Items.BAMBOO_MOSAIC_STAIRS, Items.STONE_STAIRS,
        Items.COBBLESTONE_STAIRS, Items.MOSSY_COBBLESTONE_STAIRS, Items.STONE_BRICK_STAIRS,
        Items.MOSSY_STONE_BRICK_STAIRS, Items.GRANITE_STAIRS, Items.POLISHED_GRANITE_STAIRS, Items.DIORITE_STAIRS,
        Items.POLISHED_DIORITE_STAIRS, Items.ANDESITE_STAIRS, Items.POLISHED_ANDESITE_STAIRS,
        Items.COBBLED_DEEPSLATE_STAIRS, Items.POLISHED_DEEPSLATE_STAIRS, Items.DEEPSLATE_BRICK_STAIRS,
        Items.DEEPSLATE_TILE_STAIRS, Items.TUFF_STAIRS, Items.POLISHED_TUFF_STAIRS, Items.TUFF_BRICK_STAIRS,
        Items.BRICK_STAIRS, Items.MUD_BRICK_STAIRS, Items.SANDSTONE_STAIRS, Items.SMOOTH_SANDSTONE_STAIRS,
        Items.RED_SANDSTONE_STAIRS, Items.SMOOTH_RED_SANDSTONE_STAIRS, Items.PRISMARINE_STAIRS,
        Items.PRISMARINE_BRICK_STAIRS, Items.DARK_PRISMARINE_STAIRS, Items.NETHER_BRICK_STAIRS,
        Items.RED_NETHER_BRICK_STAIRS, Items.BLACKSTONE_STAIRS, Items.POLISHED_BLACKSTONE_STAIRS,
        Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.END_STONE_BRICK_STAIRS, Items.PURPUR_STAIRS, Items.QUARTZ_STAIRS,
        Items.SMOOTH_QUARTZ_STAIRS, Items.CUT_COPPER_STAIRS, Items.EXPOSED_CUT_COPPER_STAIRS,
        Items.WEATHERED_CUT_COPPER_STAIRS, Items.OXIDIZED_CUT_COPPER_STAIRS, Items.WAXED_CUT_COPPER_STAIRS,
        Items.WAXED_EXPOSED_CUT_COPPER_STAIRS, Items.WAXED_WEATHERED_CUT_COPPER_STAIRS,
        Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

    @Override
    public void generate(RecipeExporter exporter) {
        for(int i = 0; i < 11; i++) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, STAIR.get(i), 6)
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .group("wooden_stairs")
                    .input('#', MATERIAL.get(i))
                    .criterion(hasItem(MATERIAL.get(i)), conditionsFromItem(MATERIAL.get(i)))
                    .offerTo(exporter);
        }

        for(int i = 11; i < 48; i++) {
            if(i == 46) {
                ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, STAIR.get(i), 6)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', ModTags.Items.QUARTZ_BLOCK)
                        .criterion(hasItem(MATERIAL.get(i)), conditionsFromItem(MATERIAL.get(i)))
                        .offerTo(exporter);
            }
            else {
                ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, STAIR.get(i), 6)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', MATERIAL.get(i))
                        .criterion(hasItem(MATERIAL.get(i)), conditionsFromItem(MATERIAL.get(i)))
                        .offerTo(exporter);
            }
        }



        for(int i = 48; i < 52; i++) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, STAIR.get(i), 6)
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .group("cut_copper_stairs")
                    .input('#', MATERIAL.get(i))
                    .criterion(hasItem(MATERIAL.get(i)), conditionsFromItem(MATERIAL.get(i)))
                    .offerTo(exporter);
        }

        for(int i = 52; i < 56; i++) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, STAIR.get(i), 6)
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .group("waxed_cut_copper_stairs")
                    .input('#', MATERIAL.get(i))
                    .criterion(hasItem(MATERIAL.get(i)), conditionsFromItem(MATERIAL.get(i)))
                    .offerTo(exporter);
            System.out.println(STAIR.get(i).toString()
                    .replace("minecraft:", "") + "_from_honeycomb");
            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, STAIR.get(i))
                    .group("waxed_cut_copper_stairs_from_honeycomb")
                    .input(STAIR.get(i-4))
                    .input(Items.HONEYCOMB)
                    .criterion(hasItem(MATERIAL.get(i-4)), conditionsFromItem(MATERIAL.get(i)))
                    .offerTo(exporter, STAIR.get(i).toString()
                            .replace("minecraft:", "") + "_from_honeycomb");
        }
    }
}
