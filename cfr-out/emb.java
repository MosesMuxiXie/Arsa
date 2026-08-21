/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntSortedMap
 */
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class emb {
    private final Object2IntSortedMap<dlp> a;

    emb(Object2IntSortedMap<dlp> $$0) {
        this.a = $$0;
    }

    public boolean a(dlt $$0) {
        return this.a.containsKey((Object)$$0.h());
    }

    public SequencedSet<dlp> a() {
        return Collections.unmodifiableSequencedSet(this.a.keySet());
    }

    public int b(dlt $$0) {
        if ($$0.f()) {
            return 0;
        }
        return this.a.getInt((Object)$$0.h());
    }

    public static emb a(jf.a $$0, dgz $$1) {
        return emb.a($$0, $$1, 200);
    }

    public static emb a(jf.a $$0, dgz $$1, int $$2) {
        return new a($$0, $$1).a(dlx.sm, $$2 * 100).a(dzs.jt, $$2 * 8 * 10).a(dlx.uk, $$2 * 12).a(dlx.pY, $$2 * 8).a(dlx.pZ, $$2 * 8).a(bdy.E, $$2 * 3 / 2).a(bdy.q, $$2 * 3 / 2).a(bdy.b, $$2 * 3 / 2).a(dzs.y, $$2 * 3 / 2).a(bdy.i, $$2 * 3 / 2).a(dzs.iM, $$2 * 3 / 2).a(bdy.j, $$2 * 3 / 4).a(dzs.kv, $$2 * 3 / 4).a(bdy.N, $$2 * 3 / 2).a(bdy.m, $$2 * 3 / 2).a(bdy.n, $$2 * 3 / 2).a(bdy.k, $$2 * 3 / 2).a(bdy.l, $$2 * 3 / 2).a(dzs.bf, $$2 * 3 / 2).a(dzs.cv, $$2 * 3 / 2).a(dzs.cw, $$2 * 3 / 2).a(dzs.oX, $$2 * 3 / 2).a(dzs.ew, $$2 * 3 / 2).a(dzs.cS, $$2 * 3 / 2).a(dzs.hM, $$2 * 3 / 2).a(dzs.cX, $$2 * 3 / 2).a(dzs.hQ, $$2 * 3 / 2).a(bdy.as, $$2 * 3 / 2).a(dlx.pW, $$2 * 3 / 2).a(dlx.sZ, $$2 * 3 / 2).a(dzs.dm, $$2 * 3 / 2).a(bdy.ap, $$2).a(bdy.aq, $$2 * 4).a(dlx.qo, $$2).a(dlx.qn, $$2).a(dlx.xI, $$2).a(dlx.qr, $$2).a(dlx.qq, $$2).a(dlx.qp, $$2).a(bdy.h, $$2).a(bdy.bm, $$2 * 6).a(bdy.a, $$2 / 2).a(bdy.d, $$2 / 2).a(dlx.qW, $$2 / 2).a(bdy.p, $$2 / 2).a(dlx.pU, $$2 / 2).a(bdy.g, 1 + $$2 / 3).a(dzs.na, 1 + $$2 * 20).a(dlx.yz, $$2 * 3 / 2).a(dzs.nW, $$2 / 4).a(dzs.bC, $$2 / 2).a(dzs.bE, $$2 / 2).a(dzs.bF, $$2 / 2).a(dzs.oP, $$2 / 4).a(dzs.oQ, $$2 * 3 / 2).a(dzs.oR, $$2 * 3 / 2).a(dzs.oU, $$2 * 3 / 2).a(dzs.oV, $$2 * 3 / 2).a(dzs.oY, $$2 * 3 / 2).a(dzs.qc, $$2 * 3 / 2).a(dzs.tV, $$2 / 2).a(dzs.tW, $$2 / 2).a(dzs.ag, $$2 * 3 / 2).a(dzs.ua, $$2 / 2).a(bdy.bl).a();
    }

    public static class a {
        private final jf<dlp> a;
        private final dgz b;
        private final Object2IntSortedMap<dlp> c = new Object2IntLinkedOpenHashMap();

        public a(jf.a $$0, dgz $$1) {
            this.a = $$0.e(mj.R);
            this.b = $$1;
        }

        public emb a() {
            return new emb(this.c);
        }

        public a a(bef<dlp> $$0) {
            this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
            return this;
        }

        public a a(bef<dlp> $$0, int $$12) {
            this.a.a($$0).ifPresent($$1 -> {
                for (jd $$2 : $$1) {
                    this.a($$12, (dlp)$$2.a());
                }
            });
            return this;
        }

        public a a(dwn $$0, int $$1) {
            dlp $$2 = $$0.h();
            this.a($$1, $$2);
            return this;
        }

        private void a(int $$0, dlp $$1) {
            if ($$1.a(this.b)) {
                this.c.put((Object)$$1, $$0);
            }
        }
    }
}

