/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fdl<P extends fdk> {
    public static final fdl<fdj> a = fdl.a("straight_trunk_placer", fdj.a);
    public static final fdl<fdg> b = fdl.a("forking_trunk_placer", fdg.a);
    public static final fdl<fdh> c = fdl.a("giant_trunk_placer", fdh.a);
    public static final fdl<fdi> d = fdl.a("mega_jungle_trunk_placer", fdi.b);
    public static final fdl<fde> e = fdl.a("dark_oak_trunk_placer", fde.a);
    public static final fdl<fdf> f = fdl.a("fancy_trunk_placer", fdf.a);
    public static final fdl<fdc> g = fdl.a("bending_trunk_placer", fdc.a);
    public static final fdl<fdm> h = fdl.a("upwards_branching_trunk_placer", fdm.a);
    public static final fdl<fdd> i = fdl.a("cherry_trunk_placer", fdd.a);
    private final MapCodec<P> j;

    private static <P extends fdk> fdl<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.V, $$0, new fdl<P>($$1));
    }

    private fdl(MapCodec<P> $$0) {
        this.j = $$0;
    }

    public MapCodec<P> a() {
        return this.j;
    }
}

