/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bxf<T> {
    public static final bxe<?> a = bxf.a("dedicated_server_tick_time");
    public static final bxe<bwt> b = bxf.a("bees", bwt.a);
    public static final bxe<bwu> c = bxf.a("brains", bwu.a);
    public static final bxe<bwv> d = bxf.a("breezes", bwv.a);
    public static final bxe<bwz> e = bxf.a("goal_selectors", bwz.a);
    public static final bxe<bxb> f = bxf.a("entity_paths", bxb.a);
    public static final bxe<bww> g = bxf.a("entity_block_intersections", bww.d, 100);
    public static final bxe<bxa> h = bxf.a("bee_hives", bxa.a);
    public static final bxe<bxc> i = bxf.a("pois", bxc.a);
    public static final bxe<fmj> j = bxf.a("redstone_wire_orientations", fmj.a, 200);
    public static final bxe<bhr> k = bxf.a("village_sections", bhr.c);
    public static final bxe<List<is>> l = bxf.a("raids", is.b.a(aam.a()));
    public static final bxe<List<bxd>> m = bxf.a("structures", bxd.a.a(aam.a()));
    public static final bxe<bwy> n = bxf.a("game_event_listeners", bwy.a);
    public static final bxe<is> o = bxf.a("neighbor_updates", is.b, 200);
    public static final bxe<bwx> p = bxf.a("game_events", bwx.a, 60);

    public static bxe<?> a(jq<bxe<?>> $$0) {
        return a;
    }

    private static bxe<?> a(String $$0) {
        return jq.a(mi.f, amo.b($$0), new bxe(null));
    }

    private static <T> bxe<T> a(String $$0, aao<? super xq, T> $$1) {
        return jq.a(mi.f, amo.b($$0), new bxe<T>($$1));
    }

    private static <T> bxe<T> a(String $$0, aao<? super xq, T> $$1, int $$2) {
        return jq.a(mi.f, amo.b($$0), new bxe<T>($$1, $$2));
    }
}

