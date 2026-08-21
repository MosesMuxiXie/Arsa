/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class ceu {
    public static final int a = 100;
    public static final int b = 300;
    private static final zf c = zf.a.a(new yf.f(bez.w)).a(new yo.e(yh.b("MCPE-28723")));
    private final List<ces> d = Lists.newArrayList();
    private final chl e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;

    public ceu(chl $$0) {
        this.e = $$0;
    }

    public void a(cex $$0, float $$1) {
        this.c();
        cfc $$2 = cfc.a(this.e);
        ces $$3 = new ces($$0, $$1, $$2, (float)this.e.an);
        this.d.add($$3);
        this.f = this.e.at;
        this.j = true;
        if (!this.i && this.e.cb() && ceu.a($$0)) {
            this.i = true;
            this.h = this.g = this.e.at;
            this.e.g_();
        }
    }

    private static boolean a(cex $$0) {
        return $$0.d() instanceof chl;
    }

    private yh a(cgk $$0, yh $$1, String $$2, String $$3) {
        dlt $$5;
        if ($$0 instanceof chl) {
            chl $$4 = (chl)$$0;
            v0 = $$4.fx();
        } else {
            v0 = $$5 = dlt.l;
        }
        if (!$$5.f() && $$5.c(ki.h)) {
            return yh.a($$2, this.e.R_(), $$1, $$5.K());
        }
        return yh.a($$3, this.e.R_(), $$1);
    }

    private yh a(ces $$0, @Nullable cgk $$1) {
        cex $$2 = $$0.a();
        if ($$2.a(bdq.m) || $$2.a(bdq.s)) {
            cfc $$3 = Objects.requireNonNullElse($$0.c(), cfc.a);
            return yh.a($$3.a(), this.e.R_());
        }
        yh $$4 = ceu.a($$1);
        cgk $$5 = $$2.d();
        yh $$6 = ceu.a($$5);
        if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
        }
        if ($$4 != null) {
            return this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish");
        }
        return yh.a("death.fell.killer", this.e.R_());
    }

    private static @Nullable yh a(@Nullable cgk $$0) {
        return $$0 == null ? null : $$0.R_();
    }

    public yh a() {
        if (this.d.isEmpty()) {
            return yh.a("death.attack.generic", this.e.R_());
        }
        ces $$0 = this.d.get(this.d.size() - 1);
        cex $$1 = $$0.a();
        ces $$2 = this.d();
        cfb $$3 = $$1.k().e();
        if ($$3 == cfb.b && $$2 != null) {
            return this.a($$2, $$1.d());
        }
        if ($$3 == cfb.c) {
            String $$4 = "death.attack." + $$1.f();
            yw $$5 = yk.a(yh.c($$4 + ".link")).c(c);
            return yh.a($$4 + ".message", this.e.R_(), $$5);
        }
        return $$1.a(this.e);
    }

    private @Nullable ces d() {
        ces $$0 = null;
        ces $$1 = null;
        float $$2 = 0.0f;
        float $$3 = 0.0f;
        for (int $$4 = 0; $$4 < this.d.size(); ++$$4) {
            float $$9;
            ces $$5 = this.d.get($$4);
            ces $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
            cex $$7 = $$5.a();
            boolean $$8 = $$7.a(bdq.s);
            float f2 = $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
            if (($$7.a(bdq.m) || $$8) && $$9 > 0.0f && ($$0 == null || $$9 > $$3)) {
                $$0 = $$4 > 0 ? $$6 : $$5;
                $$3 = $$9;
            }
            if ($$5.c() == null || $$1 != null && !($$5.b() > $$2)) continue;
            $$1 = $$5;
            $$2 = $$5.b();
        }
        if ($$3 > 5.0f && $$0 != null) {
            return $$0;
        }
        if ($$2 > 5.0f && $$1 != null) {
            return $$1;
        }
        return null;
    }

    public int b() {
        if (this.i) {
            return this.e.at - this.g;
        }
        return this.h - this.g;
    }

    public void c() {
        int $$0;
        int n2 = $$0 = this.i ? 300 : 100;
        if (this.j && (!this.e.cb() || this.e.at - this.f > $$0)) {
            boolean $$1 = this.i;
            this.j = false;
            this.i = false;
            this.h = this.e.at;
            if ($$1) {
                this.e.P_();
            }
            this.d.clear();
        }
    }
}

