/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class daa
extends czz {
    private static final boolean a = false;
    private static final boolean b = false;
    private @Nullable is c;
    private boolean d = false;
    private boolean e = false;

    protected daa(cgu<? extends daa> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(4, new a<daa>(this, 0.7, 0.595));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b("patrol_target", is.a, this.c);
        $$0.a("PatrolLeader", this.d);
        $$0.a("Patrolling", this.e);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.c = $$0.a("patrol_target", is.a).orElse(null);
        this.d = $$0.a("PatrolLeader", false);
        this.e = $$0.a("Patrolling", false);
    }

    public boolean k() {
        return true;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$2 != cgt.p && $$2 != cgt.h && $$2 != cgt.d && $$0.G_().i() < 0.06f && this.k()) {
            this.d = true;
        }
        if (this.gR()) {
            this.a(cgv.f, dfh.a(this.eo().f(mj.aR)));
            this.a(cgv.f, 2.0f);
        }
        if ($$2 == cgt.p) {
            this.e = true;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public static boolean b(cgu<? extends daa> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        if ($$1.a(dww.b, $$3) > 8) {
            return false;
        }
        return daa.c($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean i(double $$0) {
        return !this.e || $$0 > 16384.0;
    }

    public void h(is $$0) {
        this.c = $$0;
        this.e = true;
    }

    public @Nullable is p() {
        return this.c;
    }

    public boolean gQ() {
        return this.c != null;
    }

    public void x(boolean $$0) {
        this.d = $$0;
        this.e = true;
    }

    public boolean gR() {
        return this.d;
    }

    public boolean gS() {
        return true;
    }

    public void gT() {
        this.c = this.dK().b(-500 + this.as.a(1000), 0, -500 + this.as.a(1000));
        this.e = true;
    }

    protected boolean gU() {
        return this.e;
    }

    protected void y(boolean $$0) {
        this.e = $$0;
    }

    public static class a<T extends daa>
    extends cop {
        private static final int a = 200;
        private final T b;
        private final double c;
        private final double d;
        private long e;

        public a(T $$0, double $$1, double $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = -1L;
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            boolean $$0 = ((cgk)this.b).ao().au() < this.e;
            return ((daa)this.b).gU() && ((chn)this.b).ag_() == null && !((cgk)this.b).dm() && ((daa)this.b).gQ() && !$$0;
        }

        @Override
        public void d() {
        }

        @Override
        public void e() {
        }

        @Override
        public void a() {
            boolean $$0 = ((daa)this.b).gR();
            cre $$1 = ((chn)this.b).N();
            if ($$1.l()) {
                List<daa> $$2 = this.h();
                if (((daa)this.b).gU() && $$2.isEmpty()) {
                    ((daa)this.b).y(false);
                } else if (!$$0 || !((daa)this.b).p().a(((cgk)this.b).dI(), 10.0)) {
                    ftm $$3 = ftm.c(((daa)this.b).p());
                    ftm $$4 = ((cgk)this.b).dI();
                    ftm $$5 = $$4.d($$3);
                    $$3 = $$5.b(90.0f).c(0.4).e($$3);
                    ftm $$6 = $$3.d($$4).d().c(10.0).e($$4);
                    is $$7 = is.a($$6);
                    $$7 = ((cgk)this.b).ao().a(euq.a.f, $$7);
                    if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                        this.i();
                        this.e = ((cgk)this.b).ao().au() + 200L;
                    } else if ($$0) {
                        for (daa $$8 : $$2) {
                            $$8.h($$7);
                        }
                    }
                } else {
                    ((daa)this.b).gT();
                }
            }
        }

        private List<daa> h() {
            return ((cgk)this.b).ao().a(daa.class, ((cgk)this.b).dj().g(16.0), $$0 -> $$0.gS() && !$$0.v((cgk)this.b));
        }

        private boolean i() {
            bgr $$0 = ((cgk)this.b).ep();
            is $$1 = ((cgk)this.b).ao().a(euq.a.f, ((cgk)this.b).dK().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
            return ((chn)this.b).N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
        }
    }
}

