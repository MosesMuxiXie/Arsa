/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class hus
implements hug.a {
    private static final int a = 30;
    private static final float b = 0.32f;
    private static final int c = -23296;
    private final hua d;

    public hus(hua $$0) {
        this.d = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$22, bxg $$32, htx $$4, float $$5) {
        is $$6 = is.a($$0, $$1, $$22);
        $$32.b(bxf.i, ($$2, $$3) -> {
            if ($$6.a((jy)$$2, 30.0)) {
                hus.a($$2);
                this.a((bxc)$$3, $$32);
            }
        });
        this.d.a($$32).forEach(($$2, $$3) -> {
            if ($$32.a(bxf.i, (is)$$2) != null) {
                return;
            }
            if ($$6.a((jy)$$2, 30.0)) {
                this.a((is)$$2, (List<String>)$$3);
            }
        });
    }

    private static void a(is $$0) {
        float $$1 = 0.05f;
        um.a($$0, 0.05f, ul.b(bel.a(0.3f, 0.2f, 0.2f, 1.0f)));
    }

    private void a(is $$0, List<String> $$1) {
        float $$2 = 0.05f;
        um.a($$0, 0.05f, ul.b(bel.a(0.3f, 0.2f, 0.2f, 1.0f)));
        um.a($$1.toString(), $$0, 0, -256, 0.32f);
        um.a("Ghost POI", $$0, 1, -65536, 0.32f);
    }

    private void a(bxc $$0, bxg $$1) {
        int $$2 = 0;
        if (w.Q) {
            List<String> $$3 = this.a($$0, false, $$1);
            if ($$3.size() < 4) {
                hus.a("Owners: " + String.valueOf($$3), $$0, $$2, -256);
            } else {
                hus.a($$3.size() + " ticket holders", $$0, $$2, -256);
            }
            ++$$2;
            List<String> $$4 = this.a($$0, true, $$1);
            if ($$4.size() < 4) {
                hus.a("Candidates: " + String.valueOf($$4), $$0, $$2, -23296);
            } else {
                hus.a($$4.size() + " potential owners", $$0, $$2, -23296);
            }
            ++$$2;
        }
        hus.a("Free tickets: " + $$0.c(), $$0, $$2, -256);
        hus.a($$0.b().g(), $$0, ++$$2, -1);
    }

    private static void a(String $$0, bxc $$1, int $$2, int $$3) {
        um.a($$0, $$1.a(), $$2, $$3, 0.32f);
    }

    private List<String> a(bxc $$0, boolean $$1, bxg $$2) {
        ArrayList<String> $$32 = new ArrayList<String>();
        $$2.c(bxf.c, ($$3, $$4) -> {
            boolean $$5;
            boolean bl2 = $$5 = $$1 ? $$4.b($$0.a()) : $$4.a($$0.a());
            if ($$5) {
                $$32.add(ahy.a($$3.cY()));
            }
        });
        return $$32;
    }
}

