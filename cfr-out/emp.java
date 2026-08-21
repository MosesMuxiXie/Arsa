/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class emp
extends elb
implements etm.b<ett.b>,
ett {
    private static final int a = 10;
    private static final int b = 20;
    private static final int c = 5;
    private static final int d = 6;
    private static final int e = 40;
    private static final int f = 90;
    private static final Int2ObjectMap<bcz> j = (Int2ObjectMap)bhs.a(new Int2ObjectOpenHashMap(), (? super T $$0) -> {
        $$0.put(1, (Object)bda.Fj);
        $$0.put(2, (Object)bda.Fk);
        $$0.put(3, (Object)bda.Fl);
        $$0.put(4, (Object)bda.Fi);
    });
    private static final int k = 0;
    private int l = 0;
    private final ett.d m = new a();
    private ett.a q = new ett.a();
    private final ett.b r = new ett.b(this);

    public emp(is $$0, eoh $$1) {
        super(eld.M, $$0, $$1);
    }

    @Override
    public ett.a gS() {
        return this.q;
    }

    @Override
    public ett.d gT() {
        return this.m;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.l = $$0.a("warning_level", 0);
        this.q = $$0.a("listener", ett.a.a).orElseGet(ett.a::new);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("warning_level", this.l);
        $$0.a("listener", ett.a.a, this.q);
    }

    public static @Nullable axg a(@Nullable cgk $$0) {
        czl $$5;
        dec $$3;
        cgk cgk2;
        chl chl2;
        if ($$0 instanceof axg) {
            axg $$1 = (axg)$$0;
            return $$1;
        }
        if ($$0 != null && (chl2 = $$0.dl()) instanceof axg) {
            axg $$2 = (axg)chl2;
            return $$2;
        }
        if ($$0 instanceof dec && (cgk2 = ($$3 = (dec)$$0).p()) instanceof axg) {
            axg $$4 = (axg)cgk2;
            return $$4;
        }
        if ($$0 instanceof czl && (cgk2 = ($$5 = (czl)$$0).p()) instanceof axg) {
            axg $$6 = (axg)cgk2;
            return $$6;
        }
        return null;
    }

    public void a(axf $$0, @Nullable axg $$1) {
        if ($$1 == null) {
            return;
        }
        eoh $$2 = this.o();
        if ($$2.c(egu.b).booleanValue()) {
            return;
        }
        this.l = 0;
        if (this.b($$0) && !this.b($$0, $$1)) {
            return;
        }
        this.a($$0, (cgk)$$1);
    }

    private boolean b(axf $$02, axg $$1) {
        OptionalInt $$2 = dcj.a($$02, this.aD_(), $$1);
        $$2.ifPresent($$0 -> {
            this.l = $$0;
        });
        return $$2.isPresent();
    }

    private void a(axf $$0, @Nullable cgk $$1) {
        is $$2 = this.aD_();
        eoh $$3 = this.o();
        $$0.a($$2, (eoh)$$3.b(egu.b, true), 2);
        $$0.a($$2, $$3.b(), 90);
        $$0.c(3007, $$2, 0);
        $$0.a(etk.N, $$2, etk.a.a($$1));
    }

    private boolean b(axf $$0) {
        return this.o().c(egu.d) != false && $$0.av() != ccz.a && $$0.U().a(eua.aa) != false;
    }

    @Override
    public void a(is $$0, eoh $$1) {
        dwo dwo2;
        if ($$1.c(egu.b).booleanValue() && (dwo2 = this.n) instanceof axf) {
            axf $$2 = (axf)dwo2;
            this.a($$2);
        }
    }

    public void a(axf $$0) {
        if (this.b($$0) && this.l > 0) {
            if (!this.c($$0)) {
                this.b((dwo)$$0);
            }
            dch.a($$0, ftm.b(this.aD_()), null, 40);
        }
    }

    private void b(dwo $$0) {
        bcz $$1 = (bcz)j.get(this.l);
        if ($$1 != null) {
            is $$2 = this.aD_();
            int $$3 = $$2.u() + bgj.b($$0.y, -10, 10);
            int $$4 = $$2.v() + bgj.b($$0.y, -10, 10);
            int $$5 = $$2.w() + bgj.b($$0.y, -10, 10);
            $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, bdb.f, 5.0f, 1.0f);
        }
    }

    private boolean c(axf $$0) {
        if (this.l < 4) {
            return false;
        }
        return bhc.a(cgu.bO, cgt.k, $$0, this.aD_(), 20, 5, 6, bhc.a.b, false).isPresent();
    }

    public ett.b a() {
        return this.r;
    }

    @Override
    public /* synthetic */ etm c() {
        return this.a();
    }

    class a
    implements ett.d {
        private static final int b = 8;
        private final eto c;

        public a() {
            this.c = new etg(emp.this.o);
        }

        @Override
        public int a() {
            return 8;
        }

        @Override
        public eto b() {
            return this.c;
        }

        @Override
        public bef<etk> c() {
            return bdw.c;
        }

        @Override
        public boolean a(axf $$0, is $$1, jd<etk> $$2, etk.a $$3) {
            return emp.this.o().c(egu.b) == false && emp.a($$3.a()) != null;
        }

        @Override
        public void a(axf $$0, is $$1, jd<etk> $$2, @Nullable cgk $$3, @Nullable cgk $$4, float $$5) {
            emp.this.a($$0, emp.a($$4 != null ? $$4 : $$3));
        }

        @Override
        public void e() {
            emp.this.e();
        }

        @Override
        public boolean f() {
            return true;
        }
    }
}

