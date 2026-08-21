/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cjm<E extends chn, T extends chl>
extends cjd<E> {
    private static final int c = 1200;
    private int d;
    private a e = cjm$a.a;

    public cjm() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.o, (Object)((Object)cqx.c), cqw.p, (Object)((Object)cqx.a)), 1200);
    }

    @Override
    protected boolean a(axf $$0, E $$1) {
        chl $$2 = cjm.b($$1);
        return ((chl)$$1).b(dlx.yz) && cjf.b($$1, $$2) && cjf.a($$1, $$2, 0);
    }

    @Override
    protected boolean a(axf $$0, E $$1, long $$2) {
        return ((chl)$$1).ev().a(cqw.p) && this.a($$0, $$1);
    }

    @Override
    protected void b(axf $$0, E $$1, long $$2) {
        chl $$3 = cjm.b($$1);
        this.b((chn)$$1, $$3);
        this.a($$1, $$3);
    }

    @Override
    protected void c(axf $$0, E $$1, long $$2) {
        if (((chl)$$1).fZ()) {
            ((chl)$$1).gf();
        }
        if (((chl)$$1).b(dlx.yz)) {
            ((czq)$$1).b(false);
            ((chl)$$1).gb().b(ki.W, doa.a);
        }
    }

    private void a(E $$0, chl $$1) {
        if (this.e == cjm$a.a) {
            ((chl)$$0).c(dee.a($$0, dlx.yz));
            this.e = cjm$a.b;
            ((czq)$$0).b(true);
        } else if (this.e == cjm$a.b) {
            dlt $$3;
            int $$2;
            if (!((chl)$$0).fZ()) {
                this.e = cjm$a.a;
            }
            if (($$2 = ((chl)$$0).gd()) >= dkm.b($$3 = ((chl)$$0).gb(), $$0)) {
                ((chl)$$0).ge();
                this.e = cjm$a.c;
                this.d = 20 + ((cgk)$$0).ep().a(20);
                ((czq)$$0).b(false);
            }
        } else if (this.e == cjm$a.c) {
            --this.d;
            if (this.d == 0) {
                this.e = cjm$a.d;
            }
        } else if (this.e == cjm$a.d) {
            ((dac)$$0).a($$1, 1.0f);
            this.e = cjm$a.a;
        }
    }

    private void b(chn $$0, chl $$1) {
        $$0.ev().a(cqw.o, new cjp($$1, true));
    }

    private static chl b(chl $$0) {
        return $$0.ev().c(cqw.p).get();
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (E)((chn)chl2), l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.b(axf2, (E)((chn)chl2), l2);
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
            e = cjm$a.a();
        }
    }
}

