/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class gjn
extends gjc {
    private static final gku f = new gku(amo.b("widget/text_field"), amo.b("widget/text_field_highlighted"));
    public static final int a = -1;
    public static final int b = 1;
    private static final int n = 1;
    private static final String o = "_";
    public static final int c = -2039584;
    public static final zf d = zf.a.a(l.i);
    public static final zf e = zf.a.a(l.h, l.u);
    private static final int p = 300;
    private final gio q;
    private String r = "";
    private int s = 32;
    private boolean t = true;
    private boolean u = true;
    private boolean v = true;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    private int z;
    private int A;
    private int B;
    private int C = -2039584;
    private int D = -9408400;
    private @Nullable String E;
    private @Nullable Consumer<String> F;
    private Predicate<String> G = Objects::nonNull;
    private final List<a> H = new ArrayList<a>();
    private @Nullable yh I;
    private long J = bhs.c();
    private int K;
    private int L;

    public gjn(gio $$0, int $$1, int $$2, yh $$3) {
        this($$0, 0, 0, $$1, $$2, $$3);
    }

    public gjn(gio $$0, int $$1, int $$2, int $$3, int $$4, yh $$5) {
        this($$0, $$1, $$2, $$3, $$4, null, $$5);
    }

    public gjn(gio $$0, int $$1, int $$2, int $$3, int $$4, @Nullable gjn $$5, yh $$6) {
        super($$1, $$2, $$3, $$4, $$6);
        this.q = $$0;
        if ($$5 != null) {
            this.a($$5.a());
        }
        this.k();
    }

    public void b(Consumer<String> $$0) {
        this.F = $$0;
    }

    public void a(a $$0) {
        this.H.add($$0);
    }

    @Override
    protected yw f() {
        yh $$0 = this.B();
        return yh.a("gui.narrate.editBox", $$0, this.r);
    }

    public void a(String $$0) {
        if (!this.G.test($$0)) {
            return;
        }
        this.r = $$0.length() > this.s ? $$0.substring(0, this.s) : $$0;
        this.c(false);
        this.n(this.A);
        this.d($$0);
    }

    public String a() {
        return this.r;
    }

    public String c() {
        int $$0 = Math.min(this.A, this.B);
        int $$1 = Math.max(this.A, this.B);
        return this.r.substring($$0, $$1);
    }

    @Override
    public void f(int $$0) {
        super.f($$0);
        this.k();
    }

    @Override
    public void g(int $$0) {
        super.g($$0);
        this.k();
    }

    public void a(Predicate<String> $$0) {
        this.G = $$0;
    }

    public void b(String $$0) {
        String $$6;
        int $$1 = Math.min(this.A, this.B);
        int $$2 = Math.max(this.A, this.B);
        int $$3 = this.s - this.r.length() - ($$1 - $$2);
        if ($$3 <= 0) {
            return;
        }
        String $$4 = bhi.g($$0);
        int $$5 = $$4.length();
        if ($$3 < $$5) {
            if (Character.isHighSurrogate($$4.charAt($$3 - 1))) {
                --$$3;
            }
            $$4 = $$4.substring(0, $$3);
            $$5 = $$3;
        }
        if (!this.G.test($$6 = new StringBuilder(this.r).replace($$1, $$2, $$4).toString())) {
            return;
        }
        this.r = $$6;
        this.j($$1 + $$5);
        this.n(this.A);
        this.d(this.r);
    }

    private void d(String $$0) {
        if (this.F != null) {
            this.F.accept($$0);
        }
        this.k();
    }

    private void c(int $$0, boolean $$1) {
        if ($$1) {
            this.a($$0);
        } else {
            this.b($$0);
        }
    }

    public void a(int $$0) {
        if (this.r.isEmpty()) {
            return;
        }
        if (this.B != this.A) {
            this.b("");
            return;
        }
        this.h(this.i($$0));
    }

    public void b(int $$0) {
        this.h(this.p($$0));
    }

    public void h(int $$0) {
        int $$2;
        if (this.r.isEmpty()) {
            return;
        }
        if (this.B != this.A) {
            this.b("");
            return;
        }
        int $$1 = Math.min($$0, this.A);
        if ($$1 == ($$2 = Math.max($$0, this.A))) {
            return;
        }
        String $$3 = new StringBuilder(this.r).delete($$1, $$2).toString();
        if (!this.G.test($$3)) {
            return;
        }
        this.r = $$3;
        this.b($$1, false);
    }

    public int i(int $$0) {
        return this.a($$0, this.e());
    }

    private int a(int $$0, int $$1) {
        return this.a($$0, $$1, true);
    }

    private int a(int $$0, int $$1, boolean $$2) {
        int $$3 = $$1;
        boolean $$4 = $$0 < 0;
        int $$5 = Math.abs($$0);
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            if ($$4) {
                while ($$2 && $$3 > 0 && this.r.charAt($$3 - 1) == ' ') {
                    --$$3;
                }
                while ($$3 > 0 && this.r.charAt($$3 - 1) != ' ') {
                    --$$3;
                }
                continue;
            }
            int $$7 = this.r.length();
            if (($$3 = this.r.indexOf(32, $$3)) == -1) {
                $$3 = $$7;
                continue;
            }
            while ($$2 && $$3 < $$7 && this.r.charAt($$3) == ' ') {
                ++$$3;
            }
        }
        return $$3;
    }

    public void a(int $$0, boolean $$1) {
        this.b(this.p($$0), $$1);
    }

    private int p(int $$0) {
        return bhs.a(this.r, this.A, $$0);
    }

    public void b(int $$0, boolean $$1) {
        this.j($$0);
        if (!$$1) {
            this.n(this.A);
        }
        this.d(this.r);
    }

    public void j(int $$0) {
        this.A = bgj.a($$0, 0, this.r.length());
        this.q(this.A);
    }

    public void a(boolean $$0) {
        this.b(0, $$0);
    }

    public void c(boolean $$0) {
        this.b(this.r.length(), $$0);
    }

    @Override
    public boolean a(gzb $$0) {
        if (!this.b() || !this.aP_()) {
            return false;
        }
        switch ($$0.t()) {
            case 263: {
                if ($$0.o()) {
                    this.b(this.i(-1), $$0.m());
                } else {
                    this.a(-1, $$0.m());
                }
                return true;
            }
            case 262: {
                if ($$0.o()) {
                    this.b(this.i(1), $$0.m());
                } else {
                    this.a(1, $$0.m());
                }
                return true;
            }
            case 259: {
                if (this.v) {
                    this.c(-1, $$0.o());
                }
                return true;
            }
            case 261: {
                if (this.v) {
                    this.c(1, $$0.o());
                }
                return true;
            }
            case 268: {
                this.a($$0.m());
                return true;
            }
            case 269: {
                this.c($$0.m());
                return true;
            }
        }
        if ($$0.p()) {
            this.c(false);
            this.n(0);
            return true;
        }
        if ($$0.q()) {
            gfj.V().o.a(this.c());
            return true;
        }
        if ($$0.r()) {
            if (this.m()) {
                this.b(gfj.V().o.a());
            }
            return true;
        }
        if ($$0.s()) {
            gfj.V().o.a(this.c());
            if (this.m()) {
                this.b("");
            }
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.b() && this.aP_() && this.m();
    }

    @Override
    public boolean a(gyy $$0) {
        if (!this.d()) {
            return false;
        }
        if ($$0.b()) {
            if (this.v) {
                this.b($$0.a());
            }
            return true;
        }
        return false;
    }

    private int c(gzc $$0) {
        int $$1 = Math.min(bgj.c($$0.u()) - this.K, this.i());
        String $$2 = this.r.substring(this.z);
        return this.z + this.q.a($$2, $$1).length();
    }

    private void d(gzc $$0) {
        int $$1 = this.c($$0);
        int $$2 = this.a(-1, $$1);
        int $$3 = this.a(1, $$1);
        this.b($$2, false);
        this.b($$3, true);
    }

    @Override
    public void b(gzc $$0, boolean $$1) {
        if ($$1) {
            this.d($$0);
        } else {
            this.b(this.c($$0), $$0.m());
        }
    }

    @Override
    protected void b(gzc $$0, double $$1, double $$2) {
        this.b(this.c($$0), true);
    }

    @Override
    public void a(iqr $$0) {
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        if (!this.j()) {
            return;
        }
        if (this.h()) {
            amo $$4 = f.a(this.b(), this.aP_());
            $$0.a(hpa.at, $$4, this.aT_(), this.aU_(), this.aS_(), this.aR_());
        }
        int $$5 = this.v ? this.C : this.D;
        int $$6 = this.A - this.z;
        String $$7 = this.q.a(this.r.substring(this.z), this.i());
        boolean $$8 = $$6 >= 0 && $$6 <= $$7.length();
        boolean $$9 = this.aP_() && (bhs.c() - this.J) / 300L % 2L == 0L && $$8;
        int $$10 = this.K;
        int $$11 = bgj.a(this.B - this.z, 0, $$7.length());
        if (!$$7.isEmpty()) {
            String $$12 = $$8 ? $$7.substring(0, $$6) : $$7;
            bfr $$13 = this.a($$12, this.z);
            $$0.a(this.q, $$13, $$10, this.L, $$5, this.x);
            $$10 += this.q.a($$13) + 1;
        }
        boolean $$14 = this.A < this.r.length() || this.r.length() >= this.l();
        int $$15 = $$10;
        if (!$$8) {
            $$15 = $$6 > 0 ? this.K + this.g : this.K;
        } else if ($$14) {
            --$$15;
            --$$10;
        }
        if (!$$7.isEmpty() && $$8 && $$6 < $$7.length()) {
            $$0.a(this.q, this.a($$7.substring($$6), this.A), $$10, this.L, $$5, this.x);
        }
        if (this.I != null && $$7.isEmpty() && !this.aP_()) {
            $$0.b(this.q, this.I, $$10, this.L, $$5);
        }
        if (!$$14 && this.E != null) {
            $$0.a(this.q, this.E, $$15 - 1, this.L, -8355712, this.x);
        }
        if ($$11 != $$6) {
            int $$16 = this.K + this.q.b($$7.substring(0, $$11));
            $$0.a(Math.min($$15, this.aT_() + this.g), this.L - 1, Math.min($$16 - 1, this.aT_() + this.g), this.L + 1 + this.q.b, this.y);
        }
        if ($$9) {
            if ($$14) {
                $$0.a($$15, this.L - 1, $$15 + 1, this.L + 1 + this.q.b, $$5);
            } else {
                $$0.a(this.q, o, $$15, this.L, $$5, this.x);
            }
        }
        if (this.C()) {
            $$0.a(this.m() ? fyn.b : fyn.h);
        }
    }

    private bfr a(String $$0, int $$1) {
        for (a $$2 : this.H) {
            bfr $$3 = $$2.format($$0, $$1);
            if ($$3 == null) continue;
            return $$3;
        }
        return bfr.forward($$0, zf.a);
    }

    private void k() {
        if (this.q == null) {
            return;
        }
        String $$0 = this.q.a(this.r.substring(this.z), this.i());
        this.K = this.aT_() + (this.n() ? (this.aS_() - this.q.b($$0)) / 2 : (this.t ? 4 : 0));
        this.L = this.t ? this.aU_() + (this.h - 8) / 2 : this.aU_();
    }

    public void k(int $$0) {
        this.s = $$0;
        if (this.r.length() > $$0) {
            this.r = this.r.substring(0, $$0);
            this.d(this.r);
        }
    }

    private int l() {
        return this.s;
    }

    public int e() {
        return this.A;
    }

    public boolean h() {
        return this.t;
    }

    public void d(boolean $$0) {
        this.t = $$0;
        this.k();
    }

    public void l(int $$0) {
        this.C = $$0;
    }

    public void m(int $$0) {
        this.D = $$0;
    }

    @Override
    public void b(boolean $$0) {
        if (!this.u && !$$0) {
            return;
        }
        super.b($$0);
        if ($$0) {
            this.J = bhs.c();
        }
    }

    private boolean m() {
        return this.v;
    }

    public void e(boolean $$0) {
        this.v = $$0;
    }

    private boolean n() {
        return this.w;
    }

    public void f(boolean $$0) {
        this.w = $$0;
        this.k();
    }

    public void g(boolean $$0) {
        this.x = $$0;
    }

    public void h(boolean $$0) {
        this.y = $$0;
    }

    public int i() {
        return this.h() ? this.g - 8 : this.g;
    }

    public void n(int $$0) {
        this.B = bgj.a($$0, 0, this.r.length());
        this.q(this.B);
    }

    private void q(int $$0) {
        if (this.q == null) {
            return;
        }
        this.z = Math.min(this.z, this.r.length());
        int $$1 = this.i();
        String $$2 = this.q.a(this.r.substring(this.z), $$1);
        int $$3 = $$2.length() + this.z;
        if ($$0 == this.z) {
            this.z -= this.q.a(this.r, $$1, true).length();
        }
        if ($$0 > $$3) {
            this.z += $$0 - $$3;
        } else if ($$0 <= this.z) {
            this.z -= this.z - $$0;
        }
        this.z = bgj.a(this.z, 0, this.r.length());
    }

    public void i(boolean $$0) {
        this.u = $$0;
    }

    public boolean j() {
        return this.l;
    }

    public void j(boolean $$0) {
        this.l = $$0;
    }

    public void c(@Nullable String $$0) {
        this.E = $$0;
    }

    public int o(int $$0) {
        if ($$0 > this.r.length()) {
            return this.aT_();
        }
        return this.aT_() + this.q.b(this.r.substring(0, $$0));
    }

    @Override
    public void a(gpd $$0) {
        $$0.a(gpc.a, (yh)this.f());
    }

    public void c(yh $$0) {
        boolean $$1 = $$0.a().equals(zf.a);
        this.I = $$1 ? $$0.f().c(d) : $$0;
    }

    @FunctionalInterface
    public static interface a {
        public @Nullable bfr format(String var1, int var2);
    }
}

