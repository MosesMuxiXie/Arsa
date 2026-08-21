/*
 * Decompiled with CFR 0.152.
 */
public interface duf {
    public static final amt<dtz> a = duf.a("mob_spawn_equipment");
    public static final amt<dtz> b = duf.a("pillager_spawn_crossbow");
    public static final amt<dtz> c = duf.a("raid/pillager_post_wave_3");
    public static final amt<dtz> d = duf.a("raid/pillager_post_wave_5");
    public static final amt<dtz> e = duf.a("raid/vindicator");
    public static final amt<dtz> f = duf.a("raid/vindicator_post_wave_5");
    public static final amt<dtz> g = duf.a("enderman_loot_drop");

    public static void a(qr<dtz> $$0) {
        je<dso> $$1 = $$0.a(mj.bf);
        $$0.a(a, new duc($$1.b(bds.l), 5, 17));
        $$0.a(b, new dud($$1.b(dst.K), cce.a(1)));
        $$0.a(c, new dud($$1.b(dst.J), cce.a(1)));
        $$0.a(d, new dud($$1.b(dst.J), cce.a(2)));
        $$0.a(e, new dud($$1.b(dst.n), cce.a(1)));
        $$0.a(f, new dud($$1.b(dst.n), cce.a(2)));
        $$0.a(g, new dud($$1.b(dst.v), cce.a(1)));
    }

    public static amt<dtz> a(String $$0) {
        return amt.a(mj.be, amo.b($$0));
    }
}

