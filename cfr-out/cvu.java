/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class cvu
extends cjd<cvq> {
    public static final int c = 100;
    public static final int d = 6;
    public static final int e = 10;
    private static final float h = 1.75f;
    private static final float i = 0.75f;
    public static final int f = 100;
    public static final int g = 5;
    private int j;
    private int k;
    private final bcz l;
    private final bcz m;
    private a n = cvu$a.d;

    public cvu(bcz $$0, bcz $$1) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b), cqw.o, (Object)((Object)cqx.c), cqw.p, (Object)((Object)cqx.a), cqw.aa, (Object)((Object)cqx.b)), 100);
        this.l = $$0;
        this.m = $$1;
    }

    @Override
    protected boolean a(axf $$0, cvq $$1) {
        chl $$2 = $$1.ev().c(cqw.p).get();
        boolean $$3 = this.a($$1, $$2);
        if (!$$3) {
            $$1.ev().b(cqw.p);
            this.b($$1, $$2);
        }
        return $$3 && $$1.aF() != chx.i && cvq.i($$2);
    }

    @Override
    protected boolean a(axf $$0, cvq $$1, long $$2) {
        return $$1.ev().a(cqw.p) && this.n != cvu$a.d && !$$1.ev().a(cqw.aa);
    }

    @Override
    protected void b(axf $$0, cvq $$1, long $$2) {
        chl $$3 = $$1.ev().c(cqw.p).get();
        cjf.a((chl)$$1, $$3);
        $$1.H($$3);
        $$1.ev().a(cqw.n, new cqz($$3.dI(), 2.0f, 0));
        this.k = 10;
        this.n = cvu$a.a;
    }

    @Override
    protected void c(axf $$0, cvq $$1, long $$2) {
        $$1.ev().b(cqw.p);
        $$1.p();
        $$1.c(chx.a);
    }

    private void b(axf $$0, cvq $$1) {
        cgk $$3;
        $$0.a(null, $$1, this.m, bdb.g, 2.0f, 1.0f);
        Optional<cgk> $$2 = $$1.gP();
        if ($$2.isPresent() && ($$3 = $$2.get()).cb()) {
            $$1.c($$0, $$3);
            if (!$$3.cb()) {
                $$3.a(cgk.e.a);
            }
        }
    }

    @Override
    protected void d(axf $$0, cvq $$1, long $$2) {
        chl $$3 = $$1.ev().c(cqw.p).get();
        $$1.H($$3);
        switch (this.n.ordinal()) {
            case 0: {
                if ($$3.f((cgk)$$1) < 1.75f) {
                    $$0.a(null, $$1, this.l, bdb.g, 2.0f, 1.0f);
                    $$1.c(chx.j);
                    $$3.k($$3.dI().a($$1.dI()).d().c(0.75));
                    this.j = 0;
                    this.n = cvu$a.b;
                    break;
                }
                if (this.k <= 0) {
                    $$1.ev().a(cqw.n, new cqz($$3.dI(), 2.0f, 0));
                    this.k = 10;
                    break;
                }
                --this.k;
                break;
            }
            case 1: {
                if (this.j++ < 6) break;
                this.n = cvu$a.c;
                this.b($$0, $$1);
                break;
            }
            case 2: {
                if (this.j >= 10) {
                    this.n = cvu$a.d;
                    break;
                }
                ++this.j;
                break;
            }
        }
    }

    private boolean a(cvq $$0, chl $$1) {
        flp $$2 = $$0.N().a((cgk)$$1, 0);
        return $$2 != null && $$2.m() < 1.75f;
    }

    private void b(cvq $$0, chl $$1) {
        boolean $$3;
        List $$2 = $$0.ev().c(cqw.ab).orElseGet(ArrayList::new);
        boolean bl2 = $$3 = !$$2.contains($$1.cY());
        if ($$2.size() == 5 && $$3) {
            $$2.remove(0);
        }
        if ($$3) {
            $$2.add($$1.cY());
        }
        $$0.ev().a(cqw.ab, $$2, 100L);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (cvq)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cvq)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (cvq)chl2, l2);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cvu$a.a();
        }
    }
}

