/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class elu
extends elb
implements cdj,
fuy.a {
    public static final String d = "sherds";
    public static final String e = "item";
    public static final int f = 1;
    public long g;
    public @Nullable a h;
    private eml k;
    private dlt l = dlt.l;
    protected @Nullable amt<fof> i;
    protected long j;

    public elu(is $$0, eoh $$1) {
        super(eld.Q, $$0, $$1);
        this.k = eml.a;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.k.equals(eml.a)) {
            $$0.a(d, eml.b, this.k);
        }
        if (!this.d_($$0) && !this.l.f()) {
            $$0.a(e, dlt.b, this.l);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.k = $$0.a(d, eml.b).orElse(eml.a);
        this.l = !this.c_($$0) ? $$0.a(e, dlt.b).orElse(dlt.l) : dlt.l;
    }

    public adh k() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public iz l() {
        return this.o().c(eox.T);
    }

    public eml m() {
        return this.k;
    }

    public static dlt a(eml $$0) {
        dlt $$1 = dlx.fh.m();
        $$1.b(ki.av, $$0);
        return $$1;
    }

    @Override
    public @Nullable amt<fof> az_() {
        return this.i;
    }

    @Override
    public void a(@Nullable amt<fof> $$0) {
        this.i = $$0;
    }

    @Override
    public long aC_() {
        return this.j;
    }

    @Override
    public void a(long $$0) {
        this.j = $$0;
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.av, this.k);
        $$0.a(ki.aw, doo.a(List.of(this.l)));
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.k = $$0.a(ki.av, eml.a);
        this.l = $$0.a(ki.aw, doo.a).a();
    }

    @Override
    public void b(fns $$0) {
        super.b($$0);
        $$0.c(d);
        $$0.c(e);
    }

    @Override
    public dlt g() {
        this.f_((ddm)null);
        return this.l;
    }

    @Override
    public dlt d(int $$0) {
        this.f_((ddm)null);
        dlt $$1 = this.l.a($$0);
        if (this.l.f()) {
            this.l = dlt.l;
        }
        return $$1;
    }

    @Override
    public void b(dlt $$0) {
        this.f_((ddm)null);
        this.l = $$0;
    }

    @Override
    public elb w() {
        return this;
    }

    public void a(a $$0) {
        if (this.n == null || this.n.B_()) {
            return;
        }
        this.n.a(this.aD_(), this.o().b(), 1, $$0.ordinal());
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < a.values().length) {
            this.g = this.n.au();
            this.h = a.values()[$$1];
            return true;
        }
        return super.a_($$0, $$1);
    }

    public /* synthetic */ aay ax_() {
        return this.k();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(7);
        public static final /* enum */ a b = new a(10);
        public final int c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.c = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = elu$a.a();
        }
    }
}

