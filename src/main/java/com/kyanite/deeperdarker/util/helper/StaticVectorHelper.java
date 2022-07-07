package com.kyanite.deeperdarker.util.helper;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.Util;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class StaticVectorHelper {
    public static final Codec<Vector3f> CODEC;
    public static Vector3f XN;
    public static Vector3f XP;
    public static Vector3f YN;
    public static Vector3f YP;
    public static Vector3f ZN;
    public static Vector3f ZP;
    public static Vector3f ZERO;

    public static Quaternionf rotationDegrees(Vector3f vector3, float f){
        Quaternionf quaternionf = new Quaternionf();
        return quaternionf.rotationAxis(f, vector3);
    }

    static {
        CODEC = Codec.FLOAT.listOf().comapFlatMap((list) -> Util.fixedSize(list, 3).map((listx) -> new Vector3f((Float)listx.get(0), (Float)listx.get(1), (Float)listx.get(2))), (Vector3f) -> ImmutableList.of(Vector3f.x, Vector3f.y, Vector3f.z));
        XN = new Vector3f(-1.0F, 0.0F, 0.0F);
        XP = new Vector3f(1.0F, 0.0F, 0.0F);
        YN = new Vector3f(0.0F, -1.0F, 0.0F);
        YP = new Vector3f(0.0F, 1.0F, 0.0F);
        ZN = new Vector3f(0.0F, 0.0F, -1.0F);
        ZP = new Vector3f(0.0F, 0.0F, 1.0F);
        ZERO = new Vector3f(0.0F, 0.0F, 0.0F);
    }
}
