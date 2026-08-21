/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface fjl<P extends fjk> {
    public static final fjl<fin> a = fjl.a("always_true", fin.a);
    public static final fjl<fis> b = fjl.a("block_match", fis.a);
    public static final fjl<fiu> c = fjl.a("blockstate_match", fiu.a);
    public static final fjl<fjs> d = fjl.a("tag_match", fjs.a);
    public static final fjl<fjh> e = fjl.a("random_block_match", fjh.a);
    public static final fjl<fji> f = fjl.a("random_blockstate_match", fji.a);

    public MapCodec<P> codec();

    public static <P extends fjk> fjl<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.n, $$0, () -> $$1);
    }
}

