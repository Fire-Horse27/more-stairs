package net.fire_horse27.morestairs.util;

import net.fire_horse27.morestairs.MoreStairs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreStairs.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> QUARTZ_BLOCK = createTag("quartz_blocks");

        private static TagKey<Item> createTag(String name) {


            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreStairs.MOD_ID, name));
        }
    }
}
