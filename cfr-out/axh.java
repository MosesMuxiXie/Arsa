/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class axh {
    private static final double a = 1.0;
    private static final Logger b = LogUtils.getLogger();
    protected axf c;
    protected final axg d;
    private dwl e = dwl.e;
    private @Nullable dwl f;
    private boolean g;
    private int h;
    private is i = is.c;
    private int j;
    private boolean k;
    private is l = is.c;
    private int m;
    private int n = -1;

    public axh(axg $$0) {
        this.d = $$0;
        this.c = $$0.A();
    }

    public boolean a(dwl $$0) {
        if ($$0 == this.e) {
            return false;
        }
        ddi $$1 = this.d.gL();
        this.a($$0, this.e);
        if ($$1.b && $$0 != dwl.d && this.f()) {
            $$1.b = false;
        }
        this.d.z();
        this.c.s().aj().a(new afn(afn.a.c, this.d));
        this.c.h();
        if ($$0 == dwl.b) {
            this.d.hr();
        }
        return true;
    }

    protected void a(dwl $$0, @Nullable dwl $$1) {
        this.f = $$1;
        this.e = $$0;
        ddi $$2 = this.d.gL();
        $$0.a($$2);
    }

    private boolean f() {
        List<fug> $$0 = cgk.a((cgk)this.d, this.c, this.d.dj());
        return $$0.isEmpty() && this.d.b(1.0) < 1.0;
    }

    public dwl b() {
        return this.e;
    }

    public @Nullable dwl c() {
        return this.f;
    }

    public boolean d() {
        return this.e.h();
    }

    public boolean e() {
        return this.e.g();
    }

    public void a() {
        ++this.j;
        if (this.k) {
            eoh $$0 = this.c.a_(this.l);
            if ($$0.l()) {
                this.k = false;
            } else {
                float $$1 = this.a($$0, this.l, this.m);
                if ($$1 >= 1.0f) {
                    this.k = false;
                    this.a(this.l);
                }
            }
        } else if (this.g) {
            eoh $$2 = this.c.a_(this.i);
            if ($$2.l()) {
                this.c.a(this.d.aA(), this.i, -1);
                this.n = -1;
                this.g = false;
            } else {
                this.a($$2, this.i, this.h);
            }
        }
    }

    private float a(eoh $$0, is $$1, int $$2) {
        int $$3 = this.j - $$2;
        float $$4 = $$0.a(this.d, this.d.A(), $$1) * (float)($$3 + 1);
        int $$5 = (int)($$4 * 10.0f);
        if ($$5 != this.n) {
            this.c.a(this.d.aA(), $$1, $$5);
            this.n = $$5;
        }
        return $$4;
    }

    private void a(is $$0, boolean $$1, int $$2, String $$3) {
        if (w.U) {
            b.debug("Server ACK {} {} {} {}", new Object[]{$$2, $$0, $$1, $$3});
        }
    }

    public void a(is $$02, aji.a $$1, iz $$2, int $$3, int $$4) {
        if (!this.d.a($$02, 1.0)) {
            this.a($$02, false, $$4, "too far");
            return;
        }
        if ($$02.v() > $$3) {
            this.d.g.b(new adj($$02, this.c.a_($$02)));
            this.a($$02, false, $$4, "too high");
            return;
        }
        if ($$1 == aji.a.a) {
            if (!this.c.a((cgk)this.d, $$02)) {
                this.d.g.b(new adj($$02, this.c.a_($$02)));
                this.a($$02, false, $$4, "may not interact");
                return;
            }
            if (this.d.gL().d) {
                this.a($$02, $$4, "creative destroy");
                return;
            }
            if (this.d.a((dwo)this.c, $$02, this.e)) {
                this.d.g.b(new adj($$02, this.c.a_($$02)));
                this.a($$02, false, $$4, "block action restricted");
                return;
            }
            this.h = this.j;
            float $$5 = 1.0f;
            eoh $$6 = this.c.a_($$02);
            if (!$$6.l()) {
                dsq.a(this.c, this.d.fx(), this.d, this.d, cgv.a, ftm.b($$02), $$6, $$0 -> this.d.a((dlp)$$0, cgv.a));
                $$6.a((dwo)this.c, $$02, this.d);
                $$5 = $$6.a(this.d, this.d.A(), $$02);
            }
            if (!$$6.l() && $$5 >= 1.0f) {
                this.a($$02, $$4, "insta mine");
            } else {
                if (this.g) {
                    this.d.g.b(new adj(this.i, this.c.a_(this.i)));
                    this.a($$02, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
                }
                this.g = true;
                this.i = $$02.j();
                int $$7 = (int)($$5 * 10.0f);
                this.c.a(this.d.aA(), $$02, $$7);
                this.a($$02, true, $$4, "actual start of destroying");
                this.n = $$7;
            }
        } else if ($$1 == aji.a.c) {
            if ($$02.equals(this.i)) {
                int $$8 = this.j - this.h;
                eoh $$9 = this.c.a_($$02);
                if (!$$9.l()) {
                    float $$10 = $$9.a(this.d, this.d.A(), $$02) * (float)($$8 + 1);
                    if ($$10 >= 0.7f) {
                        this.g = false;
                        this.c.a(this.d.aA(), $$02, -1);
                        this.a($$02, $$4, "destroyed");
                        return;
                    }
                    if (!this.k) {
                        this.g = false;
                        this.k = true;
                        this.l = $$02;
                        this.m = this.h;
                    }
                }
            }
            this.a($$02, true, $$4, "stopped destroying");
        } else if ($$1 == aji.a.b) {
            this.g = false;
            if (!Objects.equals(this.i, $$02)) {
                b.warn("Mismatch in destroy block pos: {} {}", (Object)this.i, (Object)$$02);
                this.c.a(this.d.aA(), this.i, -1);
                this.a($$02, true, $$4, "aborted mismatched destroying");
            }
            this.c.a(this.d.aA(), $$02, -1);
            this.a($$02, true, $$4, "aborted destroying");
        }
    }

    public void a(is $$0, int $$1, String $$2) {
        if (this.a($$0)) {
            this.a($$0, true, $$1, $$2);
        } else {
            this.d.g.b(new adj($$0, this.c.a_($$0)));
            this.a($$0, false, $$1, $$2);
        }
    }

    public boolean a(is $$0) {
        eoh $$1 = this.c.a_($$0);
        if (!this.d.fx().a($$1, (dwo)this.c, $$0, (ddm)this.d)) {
            return false;
        }
        elb $$2 = this.c.c_($$0);
        dzq $$3 = $$1.b();
        if ($$3 instanceof ede && !this.d.hi()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
        }
        if (this.d.a((dwo)this.c, $$0, this.e)) {
            return false;
        }
        eoh $$4 = $$3.a((dwo)this.c, $$0, $$1, this.d);
        boolean $$5 = this.c.a($$0, false);
        if (w.U) {
            b.info("server broke {} {} -> {}", new Object[]{$$0, $$4, this.c.a_($$0)});
        }
        if ($$5) {
            $$3.a((dwp)this.c, $$0, $$4);
        }
        if (this.d.gM()) {
            return true;
        }
        dlt $$6 = this.d.fx();
        dlt $$7 = $$6.v();
        boolean $$8 = this.d.d($$4);
        $$6.a(this.c, $$4, $$0, (ddm)this.d);
        if ($$5 && $$8) {
            $$3.a(this.c, this.d, $$0, $$4, $$2, $$7);
        }
        return true;
    }

    public cdc a(axg $$0, dwo $$1, dlt $$2, cdb $$3) {
        dlt $$9;
        if (this.e == dwl.d) {
            return cdc.e;
        }
        if ($$0.hh().a($$2)) {
            return cdc.e;
        }
        int $$4 = $$2.N();
        int $$5 = $$2.o();
        cdc $$6 = $$2.a($$1, (ddm)$$0, $$3);
        if ($$6 instanceof cdc.d) {
            cdc.d $$7 = (cdc.d)$$6;
            dlt $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
        } else {
            $$9 = $$0.b($$3);
        }
        if ($$9 == $$2 && $$9.N() == $$4 && $$9.a($$0) <= 0 && $$9.o() == $$5) {
            return $$6;
        }
        if ($$6 instanceof cdc.a && $$9.a($$0) > 0 && !$$0.fZ()) {
            return $$6;
        }
        if ($$2 != $$9) {
            $$0.a($$3, $$9);
        }
        if ($$9.f()) {
            $$0.a($$3, dlt.l);
        }
        if (!$$0.fZ()) {
            $$0.cm.b();
        }
        return $$6;
    }

    public cdc a(axg $$0, dwo $$1, dlt $$2, cdb $$3, fti $$4) {
        cdc $$16;
        is $$5 = $$4.b();
        eoh $$6 = $$1.a_($$5);
        if (!$$6.b().a($$1.Q())) {
            return cdc.d;
        }
        if (this.e == dwl.d) {
            cdf $$7 = $$6.a($$1, $$5);
            if ($$7 != null) {
                $$0.a($$7);
                return cdc.c;
            }
            return cdc.e;
        }
        boolean $$8 = !$$0.fx().f() || !$$0.fy().f();
        boolean $$9 = $$0.gA() && $$8;
        dlt $$10 = $$2.v();
        if (!$$9) {
            cdc $$12;
            cdc $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
                aj.O.a($$0, $$5, $$10);
                return $$11;
            }
            if ($$11 instanceof cdc.f && $$3 == cdb.a && ($$12 = $$6.a($$1, $$0, $$4)).a()) {
                aj.P.a($$0, $$5);
                return $$12;
            }
        }
        if ($$2.f() || $$0.hh().a($$2)) {
            return cdc.e;
        }
        dpw $$13 = new dpw($$0, $$3, $$4);
        if ($$0.gv()) {
            int $$14 = $$2.N();
            cdc $$15 = $$2.a($$13);
            $$2.e($$14);
        } else {
            $$16 = $$2.a($$13);
        }
        if ($$16.a()) {
            aj.O.a($$0, $$5, $$10);
        }
        return $$16;
    }

    public void a(axf $$0) {
        this.c = $$0;
    }
}

