/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.joml.Vector2i
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFWDropCallback
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;

public class gfk {
    private static final Logger c = LogUtils.getLogger();
    public static final long a = 250L;
    private final gfj d;
    private boolean e;
    private boolean f;
    private boolean g;
    private double h;
    private double i;
    private @Nullable a j;
    @gzd.b
    protected int b;
    private int k;
    private @Nullable gzd l = null;
    private boolean m = true;
    private int n;
    private double o;
    private final bha p = new bha();
    private final bha q = new bha();
    private double r;
    private double s;
    private final gft t;
    private double u = Double.MIN_VALUE;
    private boolean v;

    public gfk(gfj $$0) {
        this.d = $$0;
        this.t = new gft();
    }

    private void a(long $$0, gzd $$1, @gzd.a int $$2) {
        gzd $$5;
        boolean $$4;
        block25: {
            fyk $$3 = this.d.aR();
            if ($$0 != $$3.h()) {
                return;
            }
            this.d.aS().d();
            if (this.d.x != null) {
                this.d.a(gfg.b);
            }
            $$4 = $$2 == 1;
            $$5 = this.a($$1, $$4);
            if ($$4) {
                if (this.d.k.an().b().booleanValue() && this.n++ > 0) {
                    return;
                }
                this.l = $$5;
                this.o = fvz.b();
            } else if (this.l != null) {
                if (this.d.k.an().b().booleanValue() && --this.n > 0) {
                    return;
                }
                this.l = null;
            }
            if (this.d.aP() == null) {
                if (this.d.x == null) {
                    if (!this.v && $$4) {
                        this.i();
                    }
                } else {
                    double $$6 = this.b($$3);
                    double $$7 = this.c($$3);
                    gsb $$8 = this.d.x;
                    gzc $$9 = new gzc($$6, $$7, $$5);
                    if ($$4) {
                        $$8.x();
                        try {
                            boolean $$11;
                            long $$10 = bhs.c();
                            boolean bl2 = $$11 = this.j != null && $$10 - this.j.a() < 250L && this.j.b() == $$8 && this.b == $$9.t();
                            if ($$8.a($$9, $$11)) {
                                this.j = new a($$10, $$8);
                                this.b = $$5.t();
                                return;
                            }
                            break block25;
                        }
                        catch (Throwable $$12) {
                            m $$13 = m.a($$12, "mouseClicked event handler");
                            $$8.a($$13);
                            n $$14 = $$13.a("Mouse");
                            this.a($$14, $$3);
                            $$14.a("Button", $$9.t());
                            throw new v($$13);
                        }
                    }
                    try {
                        if ($$8.b($$9)) {
                            return;
                        }
                    }
                    catch (Throwable $$15) {
                        m $$16 = m.a($$15, "mouseReleased event handler");
                        $$8.a($$16);
                        n $$17 = $$16.a("Mouse");
                        this.a($$17, $$3);
                        $$17.a("Button", $$9.t());
                        throw new v($$16);
                    }
                }
            }
        }
        if (this.d.x == null && this.d.aP() == null) {
            if ($$5.t() == 0) {
                this.e = $$4;
            } else if ($$5.t() == 2) {
                this.f = $$4;
            } else if ($$5.t() == 1) {
                this.g = $$4;
            }
            fyc.a $$18 = fyc.b.c.a($$5.t());
            gfh.a($$18, $$4);
            if ($$4) {
                gfh.a($$18);
            }
        }
    }

    private gzd a(gzd $$0, boolean $$1) {
        if (gyz.c && $$0.t() == 0) {
            if ($$1) {
                if (($$0.b() & 2) == 2) {
                    ++this.k;
                    return new gzd(1, $$0.b());
                }
            } else if (this.k > 0) {
                --this.k;
                return new gzd(1, $$0.b());
            }
        }
        return $$0;
    }

    public void a(n $$0, fyk $$1) {
        $$0.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%f, %f). Absolute: (%f, %f)", gfk.a($$1, this.h), gfk.b($$1, this.i), this.h, this.i));
        $$0.a("Screen size", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", $$1.o(), $$1.p(), $$1.k(), $$1.l(), $$1.s()));
    }

    private void a(long $$0, double $$1, double $$2) {
        if ($$0 == this.d.aR().h()) {
            this.d.aS().d();
            boolean $$3 = this.d.k.ag().b();
            double $$4 = this.d.k.Q().b();
            double $$5 = ($$3 ? Math.signum($$1) : $$1) * $$4;
            double $$6 = ($$3 ? Math.signum($$2) : $$2) * $$4;
            if (this.d.aP() == null) {
                if (this.d.x != null) {
                    double $$7 = this.b(this.d.aR());
                    double $$8 = this.c(this.d.aR());
                    this.d.x.a($$7, $$8, $$5, $$6);
                    this.d.x.x();
                } else if (this.d.s != null) {
                    int $$10;
                    Vector2i $$9 = this.t.a($$5, $$6);
                    if ($$9.x == 0 && $$9.y == 0) {
                        return;
                    }
                    int n2 = $$10 = $$9.y == 0 ? -$$9.x : $$9.y;
                    if (this.d.s.au()) {
                        if (this.d.j.h().a()) {
                            this.d.j.h().b(-$$10);
                        } else {
                            float $$11 = bgj.a(this.d.s.gL().a() + (float)$$9.y * 0.005f, 0.0f, 0.2f);
                            this.d.s.gL().a($$11);
                        }
                    } else {
                        ddl $$12 = this.d.s.gK();
                        $$12.d(gft.a($$10, $$12.g(), ddl.i()));
                    }
                }
            }
        }
    }

    private void a(long $$0, List<Path> $$1, int $$2) {
        this.d.aS().d();
        if (this.d.x != null) {
            this.d.x.a($$1);
        }
        if ($$2 > 0) {
            gna.a(this.d, $$2);
        }
    }

    public void a(fyk $$02) {
        fyc.a($$02, ($$0, $$1, $$2) -> this.d.execute(() -> this.b($$0, $$1, $$2)), ($$0, $$1, $$2, $$3) -> {
            gzd $$4 = new gzd($$1, $$3);
            this.d.execute(() -> this.a($$0, $$4, $$2));
        }, ($$0, $$1, $$2) -> this.d.execute(() -> this.a($$0, $$1, $$2)), ($$0, $$1, $$2) -> {
            ArrayList<Path> $$3 = new ArrayList<Path>($$1);
            int $$4 = 0;
            for (int $$5 = 0; $$5 < $$1; ++$$5) {
                String $$6 = GLFWDropCallback.getName((long)$$2, (int)$$5);
                try {
                    $$3.add(Paths.get($$6, new String[0]));
                    continue;
                }
                catch (InvalidPathException $$7) {
                    ++$$4;
                    c.error("Failed to parse path '{}'", (Object)$$6, (Object)$$7);
                }
            }
            if (!$$3.isEmpty()) {
                int $$8 = $$4;
                this.d.execute(() -> this.a($$0, $$3, $$8));
            }
        });
    }

    private void b(long $$0, double $$1, double $$2) {
        if ($$0 != this.d.aR().h()) {
            return;
        }
        if (this.m) {
            this.h = $$1;
            this.i = $$2;
            this.m = false;
            return;
        }
        if (this.d.aI()) {
            this.r += $$1 - this.h;
            this.s += $$2 - this.i;
        }
        this.h = $$1;
        this.i = $$2;
    }

    public void a() {
        double $$0 = fvz.b();
        double $$1 = $$0 - this.u;
        this.u = $$0;
        if (this.d.aI()) {
            boolean $$3;
            gsb $$2 = this.d.x;
            boolean bl2 = $$3 = this.r != 0.0 || this.s != 0.0;
            if ($$3) {
                this.d.aS().d();
            }
            if ($$2 != null && this.d.aP() == null && $$3) {
                fyk $$4 = this.d.aR();
                double $$5 = this.b($$4);
                double $$6 = this.c($$4);
                try {
                    $$2.d($$5, $$6);
                }
                catch (Throwable $$7) {
                    m $$8 = m.a($$7, "mouseMoved event handler");
                    $$2.a($$8);
                    n $$9 = $$8.a("Mouse");
                    this.a($$9, $$4);
                    throw new v($$8);
                }
                if (this.l != null && this.o > 0.0) {
                    double $$10 = gfk.a($$4, this.r);
                    double $$11 = gfk.b($$4, this.s);
                    try {
                        $$2.a(new gzc($$5, $$6, this.l), $$10, $$11);
                    }
                    catch (Throwable $$12) {
                        m $$13 = m.a($$12, "mouseDragged event handler");
                        $$2.a($$13);
                        n $$14 = $$13.a("Mouse");
                        this.a($$14, $$4);
                        throw new v($$13);
                    }
                }
                $$2.w();
            }
            if (this.h() && this.d.s != null) {
                this.a($$1);
            }
        }
        this.r = 0.0;
        this.s = 0.0;
    }

    public static double a(fyk $$0, double $$1) {
        return $$1 * (double)$$0.o() / (double)$$0.m();
    }

    public double b(fyk $$0) {
        return gfk.a($$0, this.h);
    }

    public static double b(fyk $$0, double $$1) {
        return $$1 * (double)$$0.p() / (double)$$0.n();
    }

    public double c(fyk $$0) {
        return gfk.b($$0, this.i);
    }

    private void a(double $$0) {
        double $$11;
        double $$10;
        double $$1 = this.d.k.d().b() * (double)0.6f + (double)0.2f;
        double $$2 = $$1 * $$1 * $$1;
        double $$3 = $$2 * 8.0;
        if (this.d.k.aw) {
            double $$4 = this.p.a(this.r * $$3, $$0 * $$3);
            double $$5 = this.q.a(this.s * $$3, $$0 * $$3);
            double $$6 = $$4;
            double $$7 = $$5;
        } else if (this.d.k.aV().a() && this.d.s.hj()) {
            this.p.a();
            this.q.a();
            double $$8 = this.r * $$2;
            double $$9 = this.s * $$2;
        } else {
            this.p.a();
            this.q.a();
            $$10 = this.r * $$3;
            $$11 = this.s * $$3;
        }
        this.d.aH().a($$10, $$11);
        if (this.d.s != null) {
            this.d.s.b(this.d.k.ae().b() != false ? -$$10 : $$10, this.d.k.af().b() != false ? -$$11 : $$11);
        }
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }

    public boolean d() {
        return this.g;
    }

    public double e() {
        return this.h;
    }

    public double f() {
        return this.i;
    }

    public void g() {
        this.m = true;
    }

    public boolean h() {
        return this.v;
    }

    public void i() {
        if (!this.d.aI()) {
            return;
        }
        if (this.v) {
            return;
        }
        if (gyz.d) {
            gfh.a();
        }
        this.v = true;
        this.h = this.d.aR().m() / 2;
        this.i = this.d.aR().n() / 2;
        fyc.a(this.d.aR(), 212995, this.h, this.i);
        this.d.a((gsb)null);
        this.d.v = 10000;
        this.m = true;
    }

    public void j() {
        if (!this.v) {
            return;
        }
        this.v = false;
        this.h = this.d.aR().m() / 2;
        this.i = this.d.aR().n() / 2;
        fyc.a(this.d.aR(), 212993, this.h, this.i);
    }

    public void k() {
        this.m = true;
    }

    public void a(gio $$0, gir $$1) {
        fyk $$2 = this.d.aR();
        double $$3 = this.b($$2);
        double $$4 = this.c($$2) - 8.0;
        String $$5 = String.format(Locale.ROOT, "%.0f,%.0f", $$3, $$4);
        $$1.b($$0, $$5, (int)$$3, (int)$$4, -1);
    }

    record a(long a, gsb b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "time;screen", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "time;screen", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "time;screen", "a", "b"}, this, $$0);
        }
    }
}

