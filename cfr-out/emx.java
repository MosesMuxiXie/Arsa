/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class emx
extends elb
implements ele {
    private static final int d = 5;
    public static final int a = 48;
    public static final int b = 48;
    public static final String c = "author";
    private static final String e = "";
    private static final String f = "";
    private static final is g = new is(0, 1, 0);
    private static final jy h = jy.i;
    private static final egm i = egm.a;
    private static final eev j = eev.a;
    private static final boolean k = true;
    private static final boolean l = false;
    private static final boolean m = false;
    private static final boolean q = false;
    private static final boolean r = true;
    private static final float s = 1.0f;
    private static final long t = 0L;
    private @Nullable amo u;
    private String v = "";
    private String w = "";
    private is x = g;
    private jy y = h;
    private eev z = eev.a;
    private egm A = egm.a;
    private eps B;
    private boolean C = true;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = true;
    private float H = 1.0f;
    private long I = 0L;

    public emx(is $$0, eoh $$1) {
        super(eld.v, $$0, $$1);
        this.B = $$1.c(eid.b);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("name", this.d());
        $$0.a(c, this.v);
        $$0.a("metadata", this.w);
        $$0.a("posX", this.x.u());
        $$0.a("posY", this.x.v());
        $$0.a("posZ", this.x.w());
        $$0.a("sizeX", this.y.u());
        $$0.a("sizeY", this.y.v());
        $$0.a("sizeZ", this.y.w());
        $$0.a("rotation", egm.h, this.A);
        $$0.a("mirror", eev.e, this.z);
        $$0.a("mode", eps.e, this.B);
        $$0.a("ignoreEntities", this.C);
        $$0.a("strict", this.D);
        $$0.a("powered", this.E);
        $$0.a("showair", this.F);
        $$0.a("showboundingbox", this.G);
        $$0.a("integrity", this.H);
        $$0.a("seed", this.I);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("name", ""));
        this.v = $$0.a(c, "");
        this.w = $$0.a("metadata", "");
        int $$1 = bgj.a($$0.a("posX", g.u()), -48, 48);
        int $$2 = bgj.a($$0.a("posY", g.v()), -48, 48);
        int $$3 = bgj.a($$0.a("posZ", g.w()), -48, 48);
        this.x = new is($$1, $$2, $$3);
        int $$4 = bgj.a($$0.a("sizeX", h.u()), 0, 48);
        int $$5 = bgj.a($$0.a("sizeY", h.v()), 0, 48);
        int $$6 = bgj.a($$0.a("sizeZ", h.w()), 0, 48);
        this.y = new jy($$4, $$5, $$6);
        this.A = $$0.a("rotation", egm.h).orElse(i);
        this.z = $$0.a("mirror", eev.e).orElse(j);
        this.B = $$0.a("mode", eps.e).orElse(eps.d);
        this.C = $$0.a("ignoreEntities", true);
        this.D = $$0.a("strict", false);
        this.E = $$0.a("powered", false);
        this.F = $$0.a("showair", false);
        this.G = $$0.a("showboundingbox", true);
        this.H = $$0.a("integrity", 1.0f);
        this.I = $$0.a("seed", 0L);
        this.J();
    }

    private void J() {
        if (this.n == null) {
            return;
        }
        is $$0 = this.aD_();
        eoh $$1 = this.n.a_($$0);
        if ($$1.a(dzs.pY)) {
            this.n.a($$0, (eoh)$$1.b(eid.b, this.B), 2);
        }
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public boolean a(ddm $$0) {
        if (!$$0.hi()) {
            return false;
        }
        if ($$0.ao().B_()) {
            $$0.a(this);
        }
        return true;
    }

    public String d() {
        return this.u == null ? "" : this.u.toString();
    }

    public boolean f() {
        return this.u != null;
    }

    public void a(@Nullable String $$0) {
        this.a(bhi.b($$0) ? null : amo.c($$0));
    }

    public void a(@Nullable amo $$0) {
        this.u = $$0;
    }

    public void a(chl $$0) {
        this.v = $$0.aq();
    }

    public is h() {
        return this.x;
    }

    public void a(is $$0) {
        this.x = $$0;
    }

    public jy k() {
        return this.y;
    }

    public void a(jy $$0) {
        this.y = $$0;
    }

    public eev l() {
        return this.z;
    }

    public void a(eev $$0) {
        this.z = $$0;
    }

    public egm m() {
        return this.A;
    }

    public void a(egm $$0) {
        this.A = $$0;
    }

    public String w() {
        return this.w;
    }

    public void b(String $$0) {
        this.w = $$0;
    }

    public eps x() {
        return this.B;
    }

    public void a(eps $$0) {
        this.B = $$0;
        eoh $$1 = this.n.a_(this.aD_());
        if ($$1.a(dzs.pY)) {
            this.n.a(this.aD_(), (eoh)$$1.b(eid.b, $$0), 2);
        }
    }

    public boolean y() {
        return this.C;
    }

    public boolean z() {
        return this.D;
    }

    public void a(boolean $$0) {
        this.C = $$0;
    }

    public void b(boolean $$0) {
        this.D = $$0;
    }

    public float A() {
        return this.H;
    }

    public void a(float $$0) {
        this.H = $$0;
    }

    public long B() {
        return this.I;
    }

    public void a(long $$0) {
        this.I = $$0;
    }

    public boolean C() {
        if (this.B != eps.a) {
            return false;
        }
        is $$0 = this.aD_();
        int $$12 = 80;
        is $$2 = new is($$0.u() - 80, this.n.K_(), $$0.w() - 80);
        is $$3 = new is($$0.u() + 80, this.n.aw(), $$0.w() + 80);
        Stream<is> $$4 = this.a($$2, $$3);
        return emx.a($$0, $$4).filter($$1 -> {
            int $$2 = $$1.k() - $$1.h();
            int $$3 = $$1.l() - $$1.i();
            int $$4 = $$1.m() - $$1.j();
            if ($$2 > 1 && $$3 > 1 && $$4 > 1) {
                this.x = new is($$1.h() - $$0.u() + 1, $$1.i() - $$0.v() + 1, $$1.j() - $$0.w() + 1);
                this.y = new jy($$2 - 1, $$3 - 1, $$4 - 1);
                this.e();
                eoh $$5 = this.n.a_($$0);
                this.n.a($$0, $$5, $$5, 3);
                return true;
            }
            return false;
        }).isPresent();
    }

    private Stream<is> a(is $$02, is $$1) {
        return is.d($$02, $$1).filter($$0 -> this.n.a_((is)$$0).a(dzs.pY)).map(this.n::c_).filter($$0 -> $$0 instanceof emx).map($$0 -> (emx)$$0).filter($$0 -> $$0.B == eps.c && Objects.equals(this.u, $$0.u)).map(elb::aD_);
    }

    private static Optional<ffg> a(is $$0, Stream<is> $$1) {
        Iterator $$2 = $$1.iterator();
        if (!$$2.hasNext()) {
            return Optional.empty();
        }
        is $$3 = (is)$$2.next();
        ffg $$4 = new ffg($$3);
        if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
        } else {
            $$4.a($$0);
        }
        return Optional.of($$4);
    }

    public boolean D() {
        if (this.B != eps.a) {
            return false;
        }
        return this.c(true);
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(boolean $$0) {
        void $$2;
        dwo dwo2;
        if (this.u == null || !((dwo2 = this.n) instanceof axf)) {
            return false;
        }
        axf $$1 = (axf)dwo2;
        is $$3 = this.aD_().a(this.x);
        return emx.a((axf)$$2, this.u, $$3, this.y, this.C, this.v, $$0, List.of());
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(axf $$0, amo $$1, is $$2, jy $$3, boolean $$4, String $$5, boolean $$6, List<dzq> $$7) {
        void $$11;
        fjr $$8 = $$0.u();
        try {
            fjq $$9 = $$8.a($$1);
        }
        catch (s $$10) {
            return false;
        }
        $$11.a($$0, $$2, $$3, !$$4, Stream.concat($$7.stream(), Stream.of(dzs.lJ)).toList());
        $$11.a($$5);
        if ($$6) {
            try {
                return $$8.c($$1);
            }
            catch (s $$12) {
                return false;
            }
        }
        return true;
    }

    public static bgr b(long $$0) {
        if ($$0 == 0L) {
            return bgr.a(bhs.c());
        }
        return bgr.a($$0);
    }

    public boolean a(axf $$0) {
        if (this.B != eps.b || this.u == null) {
            return false;
        }
        fjq $$1 = $$0.u().b(this.u).orElse(null);
        if ($$1 == null) {
            return false;
        }
        if ($$1.a().equals(this.y)) {
            this.a($$0, $$1);
            return true;
        }
        this.a($$1);
        return false;
    }

    public boolean b(axf $$0) {
        fjq $$1 = this.d($$0);
        if ($$1 == null) {
            return false;
        }
        this.a($$1);
        return true;
    }

    private void a(fjq $$0) {
        this.v = !bhi.b($$0.b()) ? $$0.b() : "";
        this.y = $$0.a();
        this.e();
    }

    public void c(axf $$0) {
        fjq $$1 = this.d($$0);
        if ($$1 != null) {
            this.a($$0, $$1);
        }
    }

    private @Nullable fjq d(axf $$0) {
        if (this.u == null) {
            return null;
        }
        return $$0.u().b(this.u).orElse(null);
    }

    private void a(axf $$0, fjq $$12) {
        this.a($$12);
        fjm $$2 = new fjm().a(this.z).a(this.A).a(this.C).b(this.D);
        if (this.H < 1.0f) {
            $$2.b().a(new fit(bgj.a(this.H, 0.0f, 1.0f))).a(emx.b(this.I));
        }
        is $$3 = this.aD_().a(this.x);
        if (w.J) {
            is.c($$3, $$3.a(this.y)).forEach($$1 -> $$0.a((is)$$1, dzs.lJ.m(), 2));
        }
        $$12.a($$0, $$3, $$3, $$2, emx.b(this.I), 2 | (this.D ? 816 : 0));
    }

    public void E() {
        if (this.u == null) {
            return;
        }
        axf $$0 = (axf)this.n;
        fjr $$1 = $$0.u();
        $$1.d(this.u);
    }

    public boolean F() {
        if (this.B != eps.b || this.n.B_() || this.u == null) {
            return false;
        }
        axf $$0 = (axf)this.n;
        fjr $$1 = $$0.u();
        try {
            return $$1.b(this.u).isPresent();
        }
        catch (s $$2) {
            return false;
        }
    }

    public boolean G() {
        return this.E;
    }

    public void d(boolean $$0) {
        this.E = $$0;
    }

    public boolean H() {
        return this.F;
    }

    public void e(boolean $$0) {
        this.F = $$0;
    }

    public boolean I() {
        return this.G;
    }

    public void f(boolean $$0) {
        this.G = $$0;
    }

    @Override
    public ele.a b() {
        if (this.B != eps.a && this.B != eps.b) {
            return ele.a.a;
        }
        if (this.B == eps.a && this.F) {
            return ele.a.c;
        }
        if (this.B == eps.a || this.G) {
            return ele.a.b;
        }
        return ele.a.a;
    }

    @Override
    public ele.b c() {
        int $$27;
        int $$26;
        int $$25;
        int $$24;
        int $$11;
        int $$10;
        is $$0 = this.h();
        jy $$1 = this.k();
        int $$2 = $$0.u();
        int $$3 = $$0.w();
        int $$4 = $$0.v();
        int $$5 = $$4 + $$1.v();
        switch (this.z) {
            case b: {
                int $$6 = $$1.u();
                int $$7 = -$$1.w();
                break;
            }
            case c: {
                int $$8 = -$$1.u();
                int $$9 = $$1.w();
                break;
            }
            default: {
                $$10 = $$1.u();
                $$11 = $$1.w();
            }
        }
        switch (this.A) {
            case b: {
                int $$12 = $$11 < 0 ? $$2 : $$2 + 1;
                int $$13 = $$10 < 0 ? $$3 + 1 : $$3;
                int $$14 = $$12 - $$11;
                int $$15 = $$13 + $$10;
                break;
            }
            case c: {
                int $$16 = $$10 < 0 ? $$2 : $$2 + 1;
                int $$17 = $$11 < 0 ? $$3 : $$3 + 1;
                int $$18 = $$16 - $$10;
                int $$19 = $$17 - $$11;
                break;
            }
            case d: {
                int $$20 = $$11 < 0 ? $$2 + 1 : $$2;
                int $$21 = $$10 < 0 ? $$3 : $$3 + 1;
                int $$22 = $$20 + $$11;
                int $$23 = $$21 - $$10;
                break;
            }
            default: {
                $$24 = $$10 < 0 ? $$2 + 1 : $$2;
                $$25 = $$11 < 0 ? $$3 + 1 : $$3;
                $$26 = $$24 + $$10;
                $$27 = $$25 + $$11;
            }
        }
        return ele.b.a($$24, $$4, $$25, $$26, $$5, $$27);
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }

    public static final class a
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
            e = emx$a.a();
        }
    }
}

