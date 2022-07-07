package com.kyanite.deeperdarker.world.otherside;

import com.kyanite.deeperdarker.DeeperDarker;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class OthersideDimension {
    public static final ResourceKey<Level> OTHERSIDE_LEVEL = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(DeeperDarker.MOD_ID, "otherside"));
    public static final ResourceKey<DimensionType> OTHERSIDE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(DeeperDarker.MOD_ID, "otherside"));

    public static void init() {
        DeeperDarker.LOGGER.debug("Otherside loaded");
    }
}
