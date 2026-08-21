/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 */
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class hun
implements hug.a {
    private final gfj a;
    private final boolean b;
    private final boolean c;
    private static final int d = 10;

    public hun(gfj $$0, boolean $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        hif $$6 = this.a.r;
        is $$7 = is.a($$0, $$1, $$2);
        LongOpenHashSet $$8 = new LongOpenHashSet();
        for (is $$9 : is.c($$7.b(-10, -10, -10), $$7.b(10, 10, 10))) {
            int $$13;
            int $$10 = $$6.a(dww.a, $$9);
            long $$11 = jw.e($$9.a());
            if ($$8.add($$11)) {
                um.a($$6.ac().r().a(dww.a, jw.a($$11)), new ftm(jw.a(jw.b($$11), 8), jw.a(jw.c($$11), 8), jw.a(jw.d($$11), 8)), ur.a.a(-65536).a(4.8f));
            }
            if ($$10 != 15 && this.c) {
                int $$12 = bel.a((float)$$10 / 15.0f, -16776961, -16711681);
                um.a(String.valueOf($$10), ftm.a($$9, 0.5, 0.25, 0.5), ur.a.a($$12));
            }
            if (!this.b || ($$13 = $$6.a(dww.b, $$9)) == 0) continue;
            int $$14 = bel.a((float)$$13 / 15.0f, -5636096, -256);
            um.a(String.valueOf($$6.a(dww.b, $$9)), ftm.b($$9), ur.a.a($$14));
        }
    }
}

