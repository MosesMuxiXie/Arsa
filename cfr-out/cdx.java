/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public interface cdx {
    public static final cdw<Boolean> a = cdx.a("boolean", cdw.a(Codec.BOOL, cel.a));
    public static final cdw<bhp> b = cdx.a("tri_state", cdw.a(bhp.d));
    public static final cdw<Float> c = cdx.a("float", cdw.a(Codec.FLOAT, cel.b, cei.a()));
    public static final cdw<Float> d = cdx.a("angle_degrees", cdw.a(Codec.FLOAT, cel.b, cei.a(), cei.a(90.0f)));
    public static final cdw<Integer> e = cdx.a("rgb_color", cdw.a(bfm.n, cel.c, cei.c()));
    public static final cdw<Integer> f = cdx.a("argb_color", cdw.a(bfm.o, cel.d, cei.c()));
    public static final cdw<dwy> g = cdx.a("moon_phase", cdw.a(dwy.i));
    public static final cdw<dfl> h = cdx.a("activity", cdw.a(mi.C.q()));
    public static final cdw<cdz> i = cdx.a("bed_rule", cdw.a(cdz.c));
    public static final cdw<lw> j = cdx.a("particle", cdw.a(ly.bl));
    public static final cdw<List<cdt>> k = cdx.a("ambient_particles", cdw.a(cdt.a.listOf()));
    public static final cdw<cdy> l = cdx.a("background_music", cdw.a(cdy.c));
    public static final cdw<cdu> m = cdx.a("ambient_sounds", cdw.a(cdu.c));
    public static final Codec<cdw<?>> n = mi.aO.q();

    public static cdw<?> a(jq<cdw<?>> $$0) {
        return a;
    }

    public static <Value> cdw<Value> a(String $$0, cdw<Value> $$1) {
        jq.a(mi.aO, amo.b($$0), $$1);
        return $$1;
    }
}

