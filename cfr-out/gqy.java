/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class gqy
extends gsb {
    public static final double a = 7.0;
    private static final yh f = yh.c("chat_screen.usage");
    private String t = "";
    private int u = -1;
    protected gjn b;
    protected String c;
    protected boolean d;
    protected b e = gqy$b.b;
    gjh v;

    public gqy(String $$0, boolean $$1) {
        super(yh.c("chat_screen.title"));
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    protected void bg_() {
        this.u = this.n.j.e().c().size();
        this.b = new gjn(this.n.h, 4, this.p - 12, this.o - 4, 12, (yh)yh.c("chat.editBox")){

            @Override
            protected yw f() {
                return super.f().b(gqy.this.v.e());
            }
        };
        this.b.k(256);
        this.b.d(false);
        this.b.a(this.c);
        this.b.b(this::b);
        this.b.a(this::a);
        this.b.i(false);
        this.c(this.b);
        this.v = new gjh(this.n, this, this.b, this.q, false, false, 1, 10, true, -805306368);
        this.v.b(false);
        this.v.a(false);
        this.v.d();
    }

    @Override
    protected void aI_() {
        this.b(this.b);
    }

    @Override
    public void a(int $$0, int $$1) {
        this.c = this.b.a();
        this.b($$0, $$1);
    }

    @Override
    public void aX_() {
        this.e = gqy$b.a;
        super.aX_();
    }

    @Override
    public void aZ_() {
        this.n.j.e().d();
        this.c = this.b.a();
        if (this.l() || StringUtils.isBlank((CharSequence)this.c)) {
            this.n.j.e().h();
        } else if (!this.d) {
            this.n.j.e().b(this.c);
        }
    }

    protected boolean l() {
        return this.e != gqy$b.b && (this.e != gqy$b.a || this.n.k.ay().b() == false);
    }

    private void b(String $$0) {
        this.v.a(true);
        this.v.d();
        this.d = false;
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.v.a($$0)) {
            return true;
        }
        if (this.d && $$0.t() == 259) {
            this.b.a("");
            this.d = false;
            return true;
        }
        if (super.a($$0)) {
            return true;
        }
        if ($$0.d()) {
            this.b(this.b.a(), true);
            this.e = gqy$b.c;
            this.n.a((gsb)null);
            return true;
        }
        switch ($$0.t()) {
            case 265: {
                this.a(-1);
                break;
            }
            case 264: {
                this.a(1);
                break;
            }
            case 266: {
                this.n.j.e().a(this.n.j.e().g() - 1);
                break;
            }
            case 267: {
                this.n.j.e().a(-this.n.j.e().g() + 1);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (this.v.a($$3 = bgj.a($$3, -1.0, 1.0))) {
            return true;
        }
        if (!this.n.c()) {
            $$3 *= 7.0;
        }
        this.n.j.e().a((int)$$3);
        return true;
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.v.a($$0)) {
            return true;
        }
        if ($$0.t() == 0) {
            int $$2 = this.n.aR().p();
            gil.a $$3 = new gil.a(this.C(), (int)$$0.u(), (int)$$0.v()).a(this.o());
            this.n.j.e().a($$3, $$2, this.n.j.f(), true);
            zf $$4 = $$3.b();
            if ($$4 != null && this.a($$4, this.o())) {
                this.c = this.b.a();
                return true;
            }
        }
        return super.a($$0, $$1);
    }

    private boolean o() {
        return this.n.c();
    }

    private boolean a(zf $$0, boolean $$1) {
        yf $$2 = $$0.i();
        if ($$1) {
            if ($$0.k() != null) {
                this.a_($$0.k(), false);
            }
        } else if ($$2 != null) {
            yf.d $$3;
            if ($$2 instanceof yf.d && ($$3 = (yf.d)$$2).b().equals(gjf.b)) {
                hiy $$4 = this.n.ba();
                if ($$4.c() != 0L) {
                    $$4.b();
                }
            } else {
                gqy.a($$2, this.n, (gsb)this);
            }
            return true;
        }
        return false;
    }

    @Override
    public void a_(String $$0, boolean $$1) {
        if ($$1) {
            this.b.a($$0);
        } else {
            this.b.b($$0);
        }
    }

    public void a(int $$0) {
        int $$1 = this.u + $$0;
        int $$2 = this.n.j.e().c().size();
        if (($$1 = bgj.a($$1, 0, $$2)) == this.u) {
            return;
        }
        if ($$1 == $$2) {
            this.u = $$2;
            this.b.a(this.t);
            return;
        }
        if (this.u == $$2) {
            this.t = this.b.a();
        }
        this.b.a(this.n.j.e().c().get($$1));
        this.v.a(false);
        this.u = $$1;
    }

    private @Nullable bfr a(String $$0, int $$1) {
        if (this.d) {
            return bfr.forward($$0, zf.a.a(l.h).b(true));
        }
        return null;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        $$0.a(2, this.p - 14, this.o - 2, this.p - 2, this.n.k.a(Integer.MIN_VALUE));
        this.n.j.e().a($$0, this.q, this.n.j.f(), $$1, $$2, true, this.o());
        super.a($$0, $$1, $$2, $$3);
        this.v.a($$0, $$1, $$2);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean bb_() {
        return true;
    }

    @Override
    protected void a(gpd $$0) {
        $$0.a(gpc.a, this.q());
        $$0.a(gpc.d, f);
        String $$1 = this.b.a();
        if (!$$1.isEmpty()) {
            $$0.a().a(gpc.a, (yh)yh.a("chat_screen.message", new Object[]{$$1}));
        }
    }

    public void b(String $$0, boolean $$1) {
        if (($$0 = this.a($$0)).isEmpty()) {
            return;
        }
        if ($$1) {
            this.n.j.e().a($$0);
        }
        if ($$0.startsWith("/")) {
            this.n.s.b.d($$0.substring(1));
        } else {
            this.n.s.b.c($$0);
        }
    }

    public String a(String $$0) {
        return bhi.e(StringUtils.normalizeSpace((String)$$0.trim()));
    }

    protected static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = gqy$b.a();
        }
    }

    @FunctionalInterface
    public static interface a<T extends gqy> {
        public T create(String var1, boolean var2);
    }
}

