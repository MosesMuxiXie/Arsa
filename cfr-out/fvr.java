/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  org.apache.commons.lang3.function.TriFunction
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import org.apache.commons.lang3.function.TriFunction;
import org.slf4j.Logger;

public abstract class fvr
implements fvt {
    static final Logger c = LogUtils.getLogger();
    public static final aao<ByteBuf, fvr> a = aao.a(fvr::a, fvr::c);
    protected final Either<UUID, String> b;
    private final fvt.a d;
    private final g e;

    fvr(Either<UUID, String> $$0, fvt.a $$1, g $$2) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public Either<UUID, String> a() {
        return this.b;
    }

    public abstract void a(fvr var1);

    public void a(ByteBuf $$0) {
        wx $$1 = new wx($$0);
        $$1.a(this.b, jx.g, wx::a);
        fvt.a.b.encode($$1, this.d);
        $$1.a(this.e);
        this.b($$0);
    }

    public abstract void b(ByteBuf var1);

    private static fvr c(ByteBuf $$0) {
        wx $$1 = new wx($$0);
        Either<UUID, String> $$2 = $$1.b(jx.g, wx::p);
        fvt.a $$3 = (fvt.a)fvt.a.b.decode($$1);
        g $$4 = $$1.b(g.class);
        return (fvr)$$4.e.apply($$2, (Object)$$3, (Object)$$1);
    }

    public static fvr a(UUID $$0, fvt.a $$1, jy $$2) {
        return new h($$0, $$1, $$2);
    }

    public static fvr a(UUID $$0, fvt.a $$1, dvu $$2) {
        return new c($$0, $$1, $$2);
    }

    public static fvr a(UUID $$0, fvt.a $$1, float $$2) {
        return new a($$0, $$1, $$2);
    }

    public static fvr a(UUID $$0) {
        return new d($$0);
    }

    public abstract double a(dwo var1, b var2, fvq var3);

    public abstract e a(dwo var1, f var2, fvq var3);

    public abstract double a(cgk var1);

    public fvt.a b() {
        return this.d;
    }

    static final class g
    extends Enum<g> {
        public static final /* enum */ g a = new g((TriFunction<Either<UUID, String>, fvt.a, wx, fvr>)((TriFunction)d::new));
        public static final /* enum */ g b = new g((TriFunction<Either<UUID, String>, fvt.a, wx, fvr>)((TriFunction)h::new));
        public static final /* enum */ g c = new g((TriFunction<Either<UUID, String>, fvt.a, wx, fvr>)((TriFunction)c::new));
        public static final /* enum */ g d = new g((TriFunction<Either<UUID, String>, fvt.a, wx, fvr>)((TriFunction)a::new));
        final TriFunction<Either<UUID, String>, fvt.a, wx, fvr> e;
        private static final /* synthetic */ g[] f;

        public static g[] values() {
            return (g[])f.clone();
        }

        public static g valueOf(String $$0) {
            return Enum.valueOf(g.class, $$0);
        }

        private g(TriFunction<Either<UUID, String>, fvt.a, wx, fvr> $$0) {
            this.e = $$0;
        }

        private static /* synthetic */ g[] a() {
            return new g[]{a, b, c, d};
        }

        static {
            f = g.a();
        }
    }

    static class h
    extends fvr {
        private jy c;

        public h(UUID $$0, fvt.a $$1, jy $$2) {
            super((Either<UUID, String>)Either.left((Object)$$0), $$1, g.b);
            this.c = $$2;
        }

        public h(Either<UUID, String> $$0, fvt.a $$1, wx $$2) {
            super($$0, $$1, g.b);
            this.c = new jy($$2.l(), $$2.l(), $$2.l());
        }

        @Override
        public void a(fvr $$0) {
            if ($$0 instanceof h) {
                h $$1 = (h)$$0;
                this.c = $$1.c;
            } else {
                c.warn("Unsupported Waypoint update operation: {}", $$0.getClass());
            }
        }

        @Override
        public void b(ByteBuf $$0) {
            xy.a($$0, this.c.u());
            xy.a($$0, this.c.v());
            xy.a($$0, this.c.w());
        }

        private ftm a(dwo $$0, fvq $$12) {
            return this.b.left().map($$0::d).map($$1 -> {
                if ($$1.dK().k(this.c) > 3) {
                    return null;
                }
                return $$1.n($$12.apply((cgk)$$1));
            }).orElseGet(() -> ftm.b(this.c));
        }

        @Override
        public double a(dwo $$0, b $$1, fvq $$2) {
            ftm $$3 = $$1.b().d(this.a($$0, $$2)).k();
            float $$4 = (float)bgj.d($$3.c(), $$3.a()) * 57.295776f;
            return bgj.d($$1.a(), $$4);
        }

        @Override
        public e a(dwo $$0, f $$1, fvq $$2) {
            double $$5;
            ftm $$3 = $$1.a(this.a($$0, $$2));
            boolean $$4 = $$3.i > 1.0;
            double d2 = $$5 = $$4 ? -$$3.h : $$3.h;
            if ($$5 < -1.0) {
                return fvr$e.c;
            }
            if ($$5 > 1.0) {
                return fvr$e.b;
            }
            if ($$4) {
                if ($$3.h > 0.0) {
                    return fvr$e.b;
                }
                if ($$3.h < 0.0) {
                    return fvr$e.c;
                }
            }
            return fvr$e.a;
        }

        @Override
        public double a(cgk $$0) {
            return $$0.g(ftm.b(this.c));
        }
    }

    static class c
    extends fvr {
        private dvu c;

        public c(UUID $$0, fvt.a $$1, dvu $$2) {
            super((Either<UUID, String>)Either.left((Object)$$0), $$1, g.c);
            this.c = $$2;
        }

        public c(Either<UUID, String> $$0, fvt.a $$1, wx $$2) {
            super($$0, $$1, g.c);
            this.c = new dvu($$2.l(), $$2.l());
        }

        @Override
        public void a(fvr $$0) {
            if ($$0 instanceof c) {
                c $$1 = (c)$$0;
                this.c = $$1.c;
            } else {
                c.warn("Unsupported Waypoint update operation: {}", $$0.getClass());
            }
        }

        @Override
        public void b(ByteBuf $$0) {
            xy.a($$0, this.c.h);
            xy.a($$0, this.c.i);
        }

        private ftm a(double $$0) {
            return ftm.b(this.c.c((int)$$0));
        }

        @Override
        public double a(dwo $$0, b $$1, fvq $$2) {
            ftm $$3 = $$1.b();
            ftm $$4 = $$3.d(this.a($$3.b())).k();
            float $$5 = (float)bgj.d($$4.c(), $$4.a()) * 57.295776f;
            return bgj.d($$1.a(), $$5);
        }

        @Override
        public e a(dwo $$0, f $$1, fvq $$2) {
            double $$3 = $$1.a();
            if ($$3 < -1.0) {
                return fvr$e.c;
            }
            if ($$3 > 1.0) {
                return fvr$e.b;
            }
            return fvr$e.a;
        }

        @Override
        public double a(cgk $$0) {
            return $$0.g(ftm.b(this.c.c($$0.dQ())));
        }
    }

    static class a
    extends fvr {
        private float c;

        public a(UUID $$0, fvt.a $$1, float $$2) {
            super((Either<UUID, String>)Either.left((Object)$$0), $$1, g.d);
            this.c = $$2;
        }

        public a(Either<UUID, String> $$0, fvt.a $$1, wx $$2) {
            super($$0, $$1, g.d);
            this.c = $$2.readFloat();
        }

        @Override
        public void a(fvr $$0) {
            if ($$0 instanceof a) {
                a $$1 = (a)$$0;
                this.c = $$1.c;
            } else {
                c.warn("Unsupported Waypoint update operation: {}", $$0.getClass());
            }
        }

        @Override
        public void b(ByteBuf $$0) {
            $$0.writeFloat(this.c);
        }

        @Override
        public double a(dwo $$0, b $$1, fvq $$2) {
            return bgj.d($$1.a(), this.c * 57.295776f);
        }

        @Override
        public e a(dwo $$0, f $$1, fvq $$2) {
            double $$3 = $$1.a();
            if ($$3 < -1.0) {
                return fvr$e.c;
            }
            if ($$3 > 1.0) {
                return fvr$e.b;
            }
            return fvr$e.a;
        }

        @Override
        public double a(cgk $$0) {
            return Double.POSITIVE_INFINITY;
        }
    }

    static class d
    extends fvr {
        private d(Either<UUID, String> $$0, fvt.a $$1, wx $$2) {
            super($$0, $$1, g.a);
        }

        d(UUID $$0) {
            super((Either<UUID, String>)Either.left((Object)$$0), fvt.a.c, g.a);
        }

        @Override
        public void a(fvr $$0) {
        }

        @Override
        public void b(ByteBuf $$0) {
        }

        @Override
        public double a(dwo $$0, b $$1, fvq $$2) {
            return Double.NaN;
        }

        @Override
        public e a(dwo $$0, f $$1, fvq $$2) {
            return fvr$e.a;
        }

        @Override
        public double a(cgk $$0) {
            return Double.POSITIVE_INFINITY;
        }
    }

    public static interface b {
        public float a();

        public ftm b();
    }

    public static interface f {
        public ftm a(ftm var1);

        public double a();
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e a = new e();
        public static final /* enum */ e b = new e();
        public static final /* enum */ e c = new e();
        private static final /* synthetic */ e[] d;

        public static e[] values() {
            return (e[])d.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        private static /* synthetic */ e[] a() {
            return new e[]{a, b, c};
        }

        static {
            d = fvr$e.a();
        }
    }
}

