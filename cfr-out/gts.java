/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class gts
extends gsb {
    public static final int a = 16;
    public static final int b = 36;
    public static final int c = 30;
    private static final int w = 256;
    private static final int x = 256;
    private static final yh y = yh.c("book.view.title");
    private static final zf z = zf.a.m().a(-16777216);
    public static final a d = new a(List.of());
    public static final amo e = amo.b("textures/gui/book.png");
    protected static final int f = 114;
    protected static final int t = 128;
    protected static final int u = 192;
    private static final int A = 148;
    protected static final int v = 192;
    private static final int B = 157;
    private static final int C = 43;
    private static final int D = 116;
    private a E;
    private int F;
    private List<bfr> G = Collections.emptyList();
    private int H = -1;
    private yh I = yg.a;
    private guu J;
    private guu K;
    private final boolean L;

    public gts(a $$0) {
        this($$0, true);
    }

    public gts() {
        this(d, false);
    }

    private gts(a $$0, boolean $$1) {
        super(y);
        this.E = $$0;
        this.L = $$1;
    }

    public void a(a $$0) {
        this.E = $$0;
        this.F = bgj.a(this.F, 0, $$0.a());
        this.N();
        this.H = -1;
    }

    public boolean a(int $$0) {
        int $$1 = bgj.a($$0, 0, this.E.a() - 1);
        if ($$1 != this.F) {
            this.F = $$1;
            this.N();
            this.H = -1;
            return true;
        }
        return false;
    }

    protected boolean b(int $$0) {
        return this.a($$0);
    }

    @Override
    protected void bg_() {
        this.o();
        this.p();
    }

    @Override
    public yh i() {
        return yg.b(super.i(), this.F(), this.E.a(this.F));
    }

    private yh F() {
        return yh.a("book.pageIndicator", this.F + 1, Math.max(this.M(), 1)).c(z);
    }

    protected void o() {
        this.c(gje.a(yg.d, (gje $$0) -> this.aX_()).a((this.o - 200) / 2, this.K()).a(200).a());
    }

    protected void p() {
        int $$02 = this.O();
        int $$1 = this.P();
        this.J = this.c(new guu($$02 + 116, $$1 + 157, true, $$0 -> this.J(), this.L));
        this.K = this.c(new guu($$02 + 43, $$1 + 157, false, $$0 -> this.I(), this.L));
        this.N();
    }

    private int M() {
        return this.E.a();
    }

    protected void I() {
        if (this.F > 0) {
            --this.F;
        }
        this.N();
    }

    protected void J() {
        if (this.F < this.M() - 1) {
            ++this.F;
        }
        this.N();
    }

    private void N() {
        this.J.l = this.F < this.M() - 1;
        this.K.l = this.F > 0;
    }

    @Override
    public boolean a(gzb $$0) {
        if (super.a($$0)) {
            return true;
        }
        return switch ($$0.t()) {
            case 266 -> {
                this.K.a((gza)$$0);
                yield true;
            }
            case 267 -> {
                this.J.a((gza)$$0);
                yield true;
            }
            default -> false;
        };
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.a($$0.a(gir.a.c), false);
    }

    private void a(gil $$0, boolean $$1) {
        if (this.H != this.F) {
            yh $$2 = yk.a(this.E.a(this.F), z);
            this.G = this.q.c($$2, 114);
            this.I = this.F();
            this.H = this.F;
        }
        int $$3 = this.O();
        int $$4 = this.P();
        if (!$$1) {
            $$0.a(git.c, $$3 + 148, $$4 + 16, this.I);
        }
        int $$5 = Math.min(128 / this.q.b, this.G.size());
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            bfr $$7 = this.G.get($$6);
            $$0.a($$3 + 36, $$4 + 30 + $$6 * this.q.b, $$7);
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        super.b($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, e, this.O(), this.P(), 0.0f, 0.0f, 192, 192, 256, 256);
    }

    private int O() {
        return (this.o - 192) / 2;
    }

    private int P() {
        return 2;
    }

    protected int K() {
        return this.P() + 192 + 2;
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if ($$0.t() == 0) {
            gil.a $$2 = new gil.a(this.q, (int)$$0.u(), (int)$$0.v());
            this.a($$2, true);
            zf $$3 = $$2.b();
            if ($$3 != null && this.a($$3.i())) {
                return true;
            }
        }
        return super.a($$0, $$1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected boolean a(@Nullable yf $$0) {
        if ($$0 == null) {
            return false;
        }
        hnh $$1 = Objects.requireNonNull(this.n.s, "Player not available");
        yf yf2 = $$0;
        Objects.requireNonNull(yf2);
        yf yf3 = yf2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{yf.b.class, yf.g.class}, (Object)yf3, n2)) {
            case 0: {
                yf.b b2 = (yf.b)yf3;
                try {
                    int n3;
                    int $$2 = n3 = b2.b();
                    this.b($$2 - 1);
                    return true;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                String $$3;
                yf.g g2 = (yf.g)yf3;
                {
                    String string;
                    $$3 = string = g2.b();
                    this.L();
                }
                gts.a($$1, $$3, null);
                return true;
            }
        }
        gts.a($$0, this.n, (gsb)this);
        return true;
    }

    protected void L() {
    }

    @Override
    public boolean v() {
        return true;
    }

    public record a(List<yh> a) {
        private final List<yh> a;

        public int a() {
            return this.a.size();
        }

        public yh a(int $$0) {
            if ($$0 >= 0 && $$0 < this.a()) {
                return this.a.get($$0);
            }
            return yg.a;
        }

        public static @Nullable a a(dlt $$0) {
            boolean $$1 = gfj.V().aW();
            dpl $$2 = $$0.a(ki.ac);
            if ($$2 != null) {
                return new a($$2.a($$1));
            }
            dpk $$3 = $$0.a(ki.ab);
            if ($$3 != null) {
                return new a($$3.a($$1).map(yh::b).toList());
            }
            return null;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pages", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pages", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pages", "a"}, this, $$0);
        }

        public List<yh> b() {
            return this.a;
        }
    }
}

