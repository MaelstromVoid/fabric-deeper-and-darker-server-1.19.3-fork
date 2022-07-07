package com.kyanite.deeperdarker.util;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.stream.Stream;

public class DDCreativeTab
{
    private static final CreativeModeTab DEEPER_AND_DARKER =
            FabricItemGroup.builder(
                                   new ResourceLocation(DeeperDarker.MOD_ID, "deeper_and_darker"))
                           .title(Component.translatable(
                                   "Deeper and Darker"))
                           .icon(() -> new ItemStack(DDItems.WARDEN_SWORD))
                           .build();


    public static void init()
    {
        ItemGroupEvents.modifyEntriesEvent(DEEPER_AND_DARKER).register(content -> content.acceptAll(
                Stream.of(
                        DDItems.WARDEN_HELMET,
                        DDItems.WARDEN_CHESTPLATE,
                        DDItems.WARDEN_LEGGINGS,
                        DDItems.WARDEN_BOOTS,
                        DDItems.WARDEN_SWORD,
                        DDItems.WARDEN_PICKAXE,
                        DDItems.WARDEN_AXE,
                        DDItems.WARDEN_SHOVEL,
                        DDItems.WARDEN_HOE,
                        DDItems.SOUL_ELYTRA,
                        DDItems.REINFORCED_ECHO_SHARD,
                        DDItems.WARDEN_CARAPACE,
                        DDItems.HEART_OF_THE_DEEP,
                        DDItems.SOUL_CRYSTAL,
                        DDItems.SOUL_DUST,
                        DDItems.SCULK_BONE,
                        DDBlocks.ECHO_LOG,
                        DDBlocks.ECHO_WOOD,
                        DDBlocks.STRIPPED_ECHO_LOG,
                        DDBlocks.STRIPPED_ECHO_WOOD,
                        DDBlocks.ECHO_BUTTON,
                        DDBlocks.ECHO_DOOR,
                        DDBlocks.ECHO_FENCE_GATE,
                        DDBlocks.ECHO_FENCE,
                        DDBlocks.ECHO_LEAVES,
                        DDBlocks.ECHO_PLANKS,
                        DDBlocks.ECHO_PRESSURE_PLATE,
                        DDBlocks.ECHO_SAPLING,
                        DDItems.ECHO_SIGN,
                        DDBlocks.ECHO_SLAB,
                        DDBlocks.ECHO_STAIRS,
                        DDBlocks.ECHO_TRAPDOOR,
                        DDItems.ECHO_BOAT,
                        DDItems.ECHO_CHEST_BOAT,
                        DDBlocks.SCULK_STONE,
                        DDBlocks.SCULK_STONE_STAIRS,
                        DDBlocks.SCULK_STONE_SLAB,
                        DDBlocks.SCULK_STONE_WALL,
                        DDBlocks.COBBLED_SCULK_STONE,
                        DDBlocks.COBBLED_SCULK_STONE_STAIRS,
                        DDBlocks.COBBLED_SCULK_STONE_SLAB,
                        DDBlocks.COBBLED_SCULK_STONE_WALL,
                        DDBlocks.POLISHED_SCULK_STONE,
                        DDBlocks.POLISHED_SCULK_STONE_STAIRS,
                        DDBlocks.POLISHED_SCULK_STONE_SLAB,
                        DDBlocks.POLISHED_SCULK_STONE_WALL,
                        DDBlocks.SCULK_STONE_BRICKS,
                        DDBlocks.SCULK_STONE_BRICK_STAIRS,
                        DDBlocks.SCULK_STONE_BRICK_SLAB,
                        DDBlocks.SCULK_STONE_BRICK_WALL,
                        DDBlocks.SCULK_STONE_TILES,
                        DDBlocks.SCULK_STONE_TILE_STAIRS,
                        DDBlocks.SCULK_STONE_TILE_SLAB,
                        DDBlocks.SCULK_STONE_TILE_WALL,
                        DDBlocks.SMOOTH_SCULK_STONE,
                        DDBlocks.SMOOTH_SCULK_STONE_STAIRS,
                        DDBlocks.SMOOTH_SCULK_STONE_SLAB,
                        DDBlocks.SMOOTH_SCULK_STONE_WALL,
                        DDBlocks.CUT_SCULK_STONE,
                        DDBlocks.CUT_SCULK_STONE_STAIRS,
                        DDBlocks.CUT_SCULK_STONE_SLAB,
                        DDBlocks.CUT_SCULK_STONE_WALL,
                        DDBlocks.CHISELED_SCULK_STONE,
                        DDBlocks.GLOOMSLATE,
                        DDBlocks.GLOOMSLATE_STAIRS,
                        DDBlocks.GLOOMSLATE_SLAB,
                        DDBlocks.GLOOMSLATE_WALL,
                        DDBlocks.COBBLED_GLOOMSLATE,
                        DDBlocks.COBBLED_GLOOMSLATE_STAIRS,
                        DDBlocks.COBBLED_GLOOMSLATE_SLAB,
                        DDBlocks.COBBLED_GLOOMSLATE_WALL,
                        DDBlocks.POLISHED_GLOOMSLATE,
                        DDBlocks.POLISHED_GLOOMSLATE_STAIRS,
                        DDBlocks.POLISHED_GLOOMSLATE_SLAB,
                        DDBlocks.POLISHED_GLOOMSLATE_WALL,
                        DDBlocks.GLOOMSLATE_BRICKS,
                        DDBlocks.GLOOMSLATE_BRICK_STAIRS,
                        DDBlocks.GLOOMSLATE_BRICK_SLAB,
                        DDBlocks.GLOOMSLATE_BRICK_WALL,
                        DDBlocks.GLOOMSLATE_TILES,
                        DDBlocks.GLOOMSLATE_TILE_STAIRS,
                        DDBlocks.GLOOMSLATE_TILE_SLAB,
                        DDBlocks.GLOOMSLATE_TILE_WALL,
                        DDBlocks.SMOOTH_GLOOMSLATE,
                        DDBlocks.SMOOTH_GLOOMSLATE_STAIRS,
                        DDBlocks.SMOOTH_GLOOMSLATE_SLAB,
                        DDBlocks.SMOOTH_GLOOMSLATE_WALL,
                        DDBlocks.CUT_GLOOMSLATE,
                        DDBlocks.CUT_GLOOMSLATE_STAIRS,
                        DDBlocks.CUT_GLOOMSLATE_SLAB,
                        DDBlocks.CUT_GLOOMSLATE_WALL,
                        DDBlocks.CHISELED_GLOOMSLATE,
                        DDBlocks.SCULK_GRIME,
                        DDBlocks.SCULK_GRIME_BRICKS,
                        DDBlocks.SCULK_GRIME_BRICK_STAIRS,
                        DDBlocks.SCULK_GRIME_BRICK_SLAB,
                        DDBlocks.SCULK_GRIME_BRICK_WALL,
                        DDBlocks.ECHO_SOIL,
                        DDBlocks.SCULK_GLEAM,
                        DDBlocks.SCULK_STONE_COAL_ORE,
                        DDBlocks.SCULK_STONE_IRON_ORE,
                        DDBlocks.SCULK_STONE_COPPER_ORE,
                        DDBlocks.SCULK_STONE_GOLD_ORE,
                        DDBlocks.SCULK_STONE_REDSTONE_ORE,
                        DDBlocks.SCULK_STONE_EMERALD_ORE,
                        DDBlocks.SCULK_STONE_LAPIS_ORE,
                        DDBlocks.SCULK_STONE_DIAMOND_ORE,
                        DDBlocks.GLOOMSLATE_COAL_ORE,
                        DDBlocks.GLOOMSLATE_IRON_ORE,
                        DDBlocks.GLOOMSLATE_COPPER_ORE,
                        DDBlocks.GLOOMSLATE_GOLD_ORE,
                        DDBlocks.GLOOMSLATE_REDSTONE_ORE,
                        DDBlocks.GLOOMSLATE_EMERALD_ORE,
                        DDBlocks.GLOOMSLATE_LAPIS_ORE,
                        DDBlocks.GLOOMSLATE_DIAMOND_ORE,
                        DDItems.GRIME_BALL,
                        DDItems.GRIME_BRICK,
                        DDBlocks.SCULK_TENDRILS,
                        DDBlocks.SCULK_VINES,
                        DDBlocks.INFESTED_SCULK,
                        DDBlocks.SCULK_JAW,
                        DDBlocks.GLOOMY_CACTUS,
                        DDBlocks.GLOOMY_GRASS,
                        DDBlocks.GLOOMY_SCULK,
                        DDBlocks.GLOOMY_GEYSER,
                        DDBlocks.CRYSTALLIZED_AMBER,
                        DDBlocks.ANCIENT_VASE,
                        DDItems.SCULK_TRANSMITTER,
                        DDItems.SCULK_SNAPPER_SPAWN_EGG,
                        DDItems.SHATTERED_SPAWN_EGG,
                        DDItems.SCULK_LEECH_SPAWN_EGG,
                        DDItems.SHRIEK_WORM_SPAWN_EGG,
                        DDItems.STALKER_SPAWN_EGG,
                        DDItems.SCULK_CENTIPEDE_SPAWN_EGG
                ).map(item -> item.asItem().getDefaultInstance()).toList()
        ));
        DeeperDarker.LOGGER.debug("Registering creative tab");
    }


}
