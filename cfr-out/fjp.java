/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface fjp<P extends fjn> {
    public static final Codec<fjn> a = mi.af.q().dispatch("processor_type", fjn::a, fjp::codec);
    public static final Codec<fjo> b = a.listOf().xmap(fjo::new, fjo::a);
    public static final Codec<fjo> c = Codec.withAlternative((Codec)b.fieldOf("processors").codec(), b);
    public static final Codec<jd<fjo>> d = amq.a(mj.bq, c);
    public static final fjp<fir> e = fjp.a("block_ignore", fir.a);
    public static final fjp<fit> f = fjp.a("block_rot", fit.a);
    public static final fjp<fiw> g = fjp.a("gravity", fiw.a);
    public static final fjp<fix> h = fjp.a("jigsaw_replacement", fix.a);
    public static final fjp<fjj> i = fjp.a("rule", fjj.a);
    public static final fjp<fjb> j = fjp.a("nop", fjb.a);
    public static final fjp<fiq> k = fjp.a("block_age", fiq.a);
    public static final fjp<fip> l = fjp.a("blackstone_replace", fip.a);
    public static final fjp<fiy> m = fjp.a("lava_submerged_block", fiy.a);
    public static final fjp<fjg> n = fjp.a("protected_blocks", fjg.b);
    public static final fjp<fiv> o = fjp.a("capped", fiv.a);

    public MapCodec<P> codec();

    public static <P extends fjn> fjp<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.af, $$0, () -> $$1);
    }
}

