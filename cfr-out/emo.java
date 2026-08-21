/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class emo
extends elb
implements etm.b<ett.b>,
ett {
    private static final int a = 0;
    private ett.a b;
    private final ett.b c;
    private final ett.d d = this.a();
    private int e = 0;

    protected emo(eld<?> $$0, is $$1, eoh $$2) {
        super($$0, $$1, $$2);
        this.b = new ett.a();
        this.c = new ett.b(this);
    }

    public emo(is $$0, eoh $$1) {
        this(eld.J, $$0, $$1);
    }

    public ett.d a() {
        return new a(this.aD_());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e = $$0.a("last_vibration_frequency", 0);
        this.b = $$0.a("listener", ett.a.a).orElseGet(ett.a::new);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("last_vibration_frequency", this.e);
        $$0.a("listener", ett.a.a, this.b);
    }

    @Override
    public ett.a gS() {
        return this.b;
    }

    @Override
    public ett.d gT() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public void a(int $$0) {
        this.e = $$0;
    }

    public ett.b f() {
        return this.c;
    }

    @Override
    public /* synthetic */ etm c() {
        return this.f();
    }

    protected class a
    implements ett.d {
        public static final int b = 8;
        protected final is c;
        private final eto a;

        public a(is $$1) {
            this.c = $$1;
            this.a = new etg($$1);
        }

        @Override
        public int a() {
            return 8;
        }

        @Override
        public eto b() {
            return this.a;
        }

        @Override
        public boolean d() {
            return true;
        }

        @Override
        public boolean a(axf $$0, is $$1, jd<etk> $$2, @Nullable etk.a $$3) {
            if ($$1.equals(this.c) && ($$2.a(etk.f) || $$2.a(etk.i))) {
                return false;
            }
            if (ett.a_($$2) == 0) {
                return false;
            }
            return egt.r(emo.this.o());
        }

        @Override
        public void a(axf $$0, is $$1, jd<etk> $$2, @Nullable cgk $$3, @Nullable cgk $$4, float $$5) {
            eoh $$6 = emo.this.o();
            if (egt.r($$6)) {
                int $$7 = ett.a_($$2);
                emo.this.a($$7);
                int $$8 = ett.a_($$5, this.a());
                dzq dzq2 = $$6.b();
                if (dzq2 instanceof egt) {
                    egt $$9 = (egt)dzq2;
                    $$9.a($$3, (dwo)$$0, this.c, $$6, $$8, $$7);
                }
            }
        }

        @Override
        public void e() {
            emo.this.e();
        }

        @Override
        public boolean f() {
            return true;
        }
    }
}

