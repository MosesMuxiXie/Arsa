/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cvj
extends cvg {
    private static final alw<Integer> e = ama.a(cvj.class, aly.b);
    int f;
    int cv;
    private static final csk.a cw = ($$0, $$1) -> {
        ddm $$2;
        if ($$0 instanceof ddm && ($$2 = (ddm)$$0).ha()) {
            return false;
        }
        return !$$0.ay().a(bdt.B);
    };
    static final csk cx = csk.b().e().d().a(cw);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final int cy = 0;

    public cvj(cgu<? extends cvj> $$0, dwo $$1) {
        super((cgu<? extends cvg>)$$0, $$1);
        this.j_();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(e, 0);
    }

    public int gQ() {
        return this.az.a(e);
    }

    public void a(int $$0) {
        this.az.a(e, $$0);
    }

    @Override
    public void a(alw<?> $$0) {
        if (e.equals($$0)) {
            this.j_();
        }
        super.a($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("PuffState", this.gQ());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a(Math.min($$0.a("PuffState", 0), 2));
    }

    @Override
    public dlt b() {
        return new dlt(dlx.sr);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(1, new a(this));
    }

    @Override
    public void g() {
        if (!this.ao().B_() && this.cb() && this.dy()) {
            if (this.f > 0) {
                if (this.gQ() == 0) {
                    this.b(bda.xC);
                    this.a(1);
                } else if (this.f > 40 && this.gQ() == 1) {
                    this.b(bda.xC);
                    this.a(2);
                }
                ++this.f;
            } else if (this.gQ() != 0) {
                if (this.cv > 60 && this.gQ() == 2) {
                    this.b(bda.xB);
                    this.a(1);
                } else if (this.cv > 100 && this.gQ() == 1) {
                    this.b(bda.xB);
                    this.a(0);
                }
                ++this.cv;
            }
        }
        super.g();
    }

    @Override
    public void d_() {
        super.d_();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            if (this.cb() && this.gQ() > 0) {
                List<chn> $$12 = this.ao().a(chn.class, this.dj().g(0.3), (? super T $$1) -> cx.a($$0, this, (chl)$$1));
                for (chn $$2 : $$12) {
                    if (!$$2.cb()) continue;
                    this.a($$0, $$2);
                }
            }
        }
    }

    private void a(axf $$0, chn $$1) {
        int $$2 = this.gQ();
        if ($$1.a($$0, this.en().b(this), (float)(1 + $$2))) {
            $$1.b(new cfm(cfo.s, 60 * $$2, 0), (cgk)this);
            this.a(bda.xG, 1.0f, 1.0f);
        }
    }

    @Override
    public void a_(ddm $$0) {
        int $$1 = this.gQ();
        if ($$0 instanceof axg) {
            axg $$2 = (axg)$$0;
            if ($$1 > 0 && $$0.a($$2.A(), this.en().b(this), (float)(1 + $$1))) {
                if (!this.bq()) {
                    $$2.g.b(new aem(aem.k, 0.0f));
                }
                $$0.b(new cfm(cfo.s, 60 * $$1, 0), (cgk)this);
            }
        }
    }

    @Override
    protected bcz fd() {
        return bda.xD;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.xF;
    }

    @Override
    protected bcz gP() {
        return bda.xE;
    }

    @Override
    public cgn b(chx $$0) {
        return super.b($$0).a(cvj.b(this.gQ()));
    }

    private static float b(int $$0) {
        switch ($$0) {
            case 1: {
                return 0.7f;
            }
            case 0: {
                return 0.5f;
            }
        }
        return 1.0f;
    }

    static class a
    extends cop {
        private final cvj a;

        public a(cvj $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            List<chl> $$02 = this.a.ao().a(chl.class, this.a.dj().g(2.0), $$0 -> cx.a(cvj$a.a(this.a), this.a, (chl)$$0));
            return !$$02.isEmpty();
        }

        @Override
        public void d() {
            this.a.f = 1;
            this.a.cv = 0;
        }

        @Override
        public void e() {
            this.a.f = 0;
        }
    }
}

