/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import org.apache.commons.lang3.mutable.MutableInt;

public class huq
implements hug.a {
    private final gfj a;

    public huq(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$12, double $$22, bxg $$32, htx $$42, float $$5) {
        hoo $$6 = this.a.e.x().c();
        MutableInt $$7 = new MutableInt(0);
        $$6.a(($$1, $$2, $$3, $$4) -> this.a($$1, $$3, $$2, $$7, $$4), $$42, 32);
    }

    private void a(hoo.d $$0, int $$1, boolean $$2, MutableInt $$3, boolean $$4) {
        fth $$5 = $$0.b();
        double $$6 = $$5.b();
        long $$7 = Math.round($$6 / 16.0);
        if ($$7 == 1L) {
            $$3.add(1);
            int $$8 = $$4 ? -16711936 : -1;
            um.a(String.valueOf($$3.intValue()), $$5.f(), ur.a.a($$8).a(4.8f));
        }
        long $$9 = $$7 + 5L;
        um.a($$5.h(0.1 * (double)$$1), ul.a(bel.a($$2 ? 0.4f : 1.0f, huq.a($$9, 0.3f), huq.a($$9, 0.8f), huq.a($$9, 0.5f))));
    }

    private static float a(long $$0, float $$1) {
        float $$2 = 0.1f;
        return bgj.g($$1 * (float)$$0) * 0.9f + 0.1f;
    }
}

