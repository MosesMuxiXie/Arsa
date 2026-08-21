/*
 * Decompiled with CFR 0.152.
 */
public class hut
implements hug.a {
    private static final int a = 160;
    private static final float b = 0.64f;
    private final gfj c;

    public hut(gfj $$0) {
        this.c = $$0;
    }

    @Override
    public void a(double $$0, double $$12, double $$22, bxg $$3, htx $$4, float $$5) {
        is $$6 = this.a().d();
        $$3.a(bxf.l, ($$1, $$2) -> {
            for (is $$3 : $$2) {
                if (!$$6.a($$3, 160.0)) continue;
                hut.a($$3);
            }
        });
    }

    private static void a(is $$0) {
        um.a($$0, ul.b(bel.a(0.15f, 1.0f, 0.0f, 0.0f)));
        hut.a("Raid center", $$0, -65536);
    }

    private static void a(String $$0, is $$1, int $$2) {
        um.a($$0, ftm.a($$1, 0.5, 1.3, 0.5), ur.a.b($$2).a(0.64f)).a();
    }

    private ger a() {
        return this.c.i.p();
    }
}

