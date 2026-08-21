/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class amf<R extends dqs<?>> {
    private static final int a = -1;
    private final ddl b;
    private final a<R> c;
    private final boolean d;
    private final int e;
    private final int f;
    private final List<dji> g;
    private final List<dji> h;

    public static <I extends dqy, R extends dqs<I>> diz.a a(a<R> $$0, int $$1, int $$2, List<dji> $$3, List<dji> $$4, ddl $$5, dqx<R> $$6, boolean $$7, boolean $$8) {
        amf<R> $$9 = new amf<R>($$0, $$5, $$7, $$1, $$2, $$3, $$4);
        if (!$$8 && !$$9.b()) {
            return diz.a.a;
        }
        ddu $$10 = new ddu();
        $$5.a($$10);
        $$0.a($$10);
        return $$9.a($$6, $$10);
    }

    private amf(a<R> $$0, ddl $$1, boolean $$2, int $$3, int $$4, List<dji> $$5, List<dji> $$6) {
        this.c = $$0;
        this.b = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    private diz.a a(dqx<R> $$0, ddu $$1) {
        if ($$1.a((dqs<?>)$$0.b(), null)) {
            this.b($$0, $$1);
            this.b.e();
            return diz.a.a;
        }
        this.a();
        this.b.e();
        return diz.a.b;
    }

    private void a() {
        for (dji $$0 : this.h) {
            dlt $$1 = $$0.g().v();
            this.b.a($$1, false);
            $$0.f($$1);
        }
        this.c.a();
    }

    private void b(dqx<R> $$0, ddu $$1) {
        boolean $$22 = this.c.a($$0);
        int $$32 = $$1.b((dqs<?>)$$0.b(), null);
        if ($$22) {
            for (dji $$42 : this.g) {
                dlt $$52 = $$42.g();
                if ($$52.f() || Math.min($$32, $$52.k()) >= $$52.N() + 1) continue;
                return;
            }
        }
        int $$6 = this.a($$32, $$22);
        ArrayList<jd<dlp>> $$7 = new ArrayList<jd<dlp>>();
        if (!$$1.a((dqs<?>)$$0.b(), $$6, $$7::add)) {
            return;
        }
        int $$8 = amf.a($$6, $$7);
        if ($$8 != $$6) {
            $$7.clear();
            if (!$$1.a((dqs<?>)$$0.b(), $$8, $$7::add)) {
                return;
            }
        }
        this.a();
        ame.a(this.e, this.f, $$0.b(), $$0.b().aq_().a(), ($$2, $$3, $$4, $$5) -> {
            if ($$2 == -1) {
                return;
            }
            dji $$6 = this.g.get($$3);
            jd $$7 = (jd)$$7.get((int)$$2);
            int $$8 = $$8;
            while ($$8 > 0) {
                if (($$8 = this.a($$6, $$7, $$8)) != -1) continue;
                return;
            }
        });
    }

    private static int a(int $$0, List<jd<dlp>> $$1) {
        for (jd<dlp> $$2 : $$1) {
            $$0 = Math.min($$0, $$2.a().g());
        }
        return $$0;
    }

    private int a(int $$0, boolean $$1) {
        if (this.d) {
            return $$0;
        }
        if ($$1) {
            int $$2 = Integer.MAX_VALUE;
            for (dji $$3 : this.g) {
                dlt $$4 = $$3.g();
                if ($$4.f() || $$2 <= $$4.N()) continue;
                $$2 = $$4.N();
            }
            if ($$2 != Integer.MAX_VALUE) {
                ++$$2;
            }
            return $$2;
        }
        return 1;
    }

    private int a(dji $$0, jd<dlp> $$1, int $$2) {
        dlt $$7;
        dlt $$3 = $$0.g();
        int $$4 = this.b.a($$1, $$3);
        if ($$4 == -1) {
            return -1;
        }
        dlt $$5 = this.b.a($$4);
        if ($$2 < $$5.N()) {
            dlt $$6 = this.b.a($$4, $$2);
        } else {
            $$7 = this.b.b($$4);
        }
        int $$8 = $$7.N();
        if ($$3.f()) {
            $$0.f($$7);
        } else {
            $$3.g($$8);
        }
        return $$2 - $$8;
    }

    private boolean b() {
        ArrayList $$0 = Lists.newArrayList();
        int $$1 = this.c();
        for (dji $$2 : this.g) {
            dlt $$3 = $$2.g().v();
            if ($$3.f()) continue;
            int $$4 = this.b.f($$3);
            if ($$4 == -1 && $$0.size() <= $$1) {
                for (dlt $$5 : $$0) {
                    if (!dlt.b($$5, $$3) || $$5.N() == $$5.k() || $$5.N() + $$3.N() > $$5.k()) continue;
                    $$5.g($$3.N());
                    $$3.e(0);
                    break;
                }
                if ($$3.f()) continue;
                if ($$0.size() < $$1) {
                    $$0.add($$3);
                    continue;
                }
                return false;
            }
            if ($$4 != -1) continue;
            return false;
        }
        return true;
    }

    private int c() {
        int $$0 = 0;
        for (dlt $$1 : this.b.j()) {
            if (!$$1.f()) continue;
            ++$$0;
        }
        return $$0;
    }

    public static interface a<T extends dqs<?>> {
        public void a(ddu var1);

        public void a();

        public boolean a(dqx<T> var1);
    }
}

