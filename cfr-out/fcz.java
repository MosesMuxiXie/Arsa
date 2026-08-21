/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fcz<P extends fcy> {
    public static final fcz<fda> a = fcz.a("trunk_vine", fda.a);
    public static final fcz<fcv> b = fcz.a("leave_vine", fcv.a);
    public static final fcz<fcw> c = fcz.a("pale_moss", fcw.a);
    public static final fcz<fcu> d = fcz.a("creaking_heart", fcu.a);
    public static final fcz<fct> e = fcz.a("cocoa", fct.a);
    public static final fcz<fcs> f = fcz.a("beehive", fcs.a);
    public static final fcz<fcp> g = fcz.a("alter_ground", fcp.a);
    public static final fcz<fcq> h = fcz.a("attached_to_leaves", fcq.a);
    public static final fcz<fcx> i = fcz.a("place_on_ground", fcx.a);
    public static final fcz<fcr> j = fcz.a("attached_to_logs", fcr.a);
    private final MapCodec<P> k;

    private static <P extends fcy> fcz<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.X, $$0, new fcz<P>($$1));
    }

    private fcz(MapCodec<P> $$0) {
        this.k = $$0;
    }

    public MapCodec<P> a() {
        return this.k;
    }
}

