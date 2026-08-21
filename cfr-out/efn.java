/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class efn
extends ecb
implements dzt {
    public static final MapCodec<efn> c = efn.b(efn::new);
    public static final int d = 4;
    public static final eph e = eox.ax;
    public static final epf<epd> f = ecb.b;
    private static final int g = 3;
    private static final int h = 1;
    private static final fug i = dzq.b(6.0, -1.0, 3.0);
    private static final fug D = dzq.b(10.0, -1.0, 5.0);
    private final Function<eoh, fug> R = this.b();

    public MapCodec<efn> a() {
        return c;
    }

    public efn(eog.d $$0) {
        super($$0);
    }

    private Function<eoh, fug> b() {
        int[] $$0 = new int[]{0, 9, 11, 22, 26};
        return this.a((eoh $$1) -> {
            int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
            int $$3 = $$1.c(e) == 0 ? 6 : 10;
            return switch ($$1.c(f)) {
                default -> throw new MatchException(null, null);
                case epd.b -> dzq.b($$3, -1.0, Math.min(16, -1 + $$2));
                case epd.a -> dzq.b($$3, 0.0, Math.max(0, -1 + $$2 - 16));
            };
        });
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        return this.m();
    }

    @Override
    public fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.R.apply($$0);
    }

    @Override
    public fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        if ($$0.c(f) == epd.b) {
            return $$0.c(e) == 0 ? i : D;
        }
        return fud.a();
    }

    @Override
    public eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (efn.b($$0.c(e))) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
        return $$0.a($$1, $$3) ? $$0 : dzs.a.m();
    }

    @Override
    public boolean a(eoh $$0, dwr $$1, is $$2) {
        if (efn.p($$0) && !efn.b($$1, $$2)) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(dzs.cZ);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{e});
        super.a($$0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1 instanceof axf) {
            axf $$6 = (axf)$$1;
            if ($$3 instanceof dad && $$6.U().a(eua.F).booleanValue()) {
                $$6.a($$2, true, $$3);
            }
        }
    }

    @Override
    public boolean a(eoh $$0, dpu $$1) {
        return false;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
    }

    @Override
    public boolean f(eoh $$0) {
        return $$0.c(f) == epd.b && !this.r($$0);
    }

    @Override
    public void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        boolean $$5;
        float $$4 = ebp.a(this, $$1, $$2);
        boolean bl2 = $$5 = $$3.a((int)(25.0f / $$4) + 1) == 0;
        if ($$5) {
            this.a($$1, $$0, $$2, 1);
        }
    }

    private void a(axf $$0, eoh $$1, is $$2, int $$3) {
        int $$4 = Math.min($$1.c(e) + $$3, 4);
        if (!this.a((dwr)$$0, $$2, $$1, $$4)) {
            return;
        }
        eoh $$5 = (eoh)$$1.b(e, $$4);
        $$0.a($$2, $$5, 2);
        if (efn.b($$4)) {
            $$0.a($$2.d(), (eoh)$$5.b(f, epd.a), 3);
        }
    }

    private static boolean a(dwr $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        return $$2.l() || $$2.a(dzs.lx);
    }

    private static boolean b(dwr $$0, is $$1) {
        return ebp.a($$0, $$1);
    }

    private static boolean p(eoh $$0) {
        return $$0.a(dzs.lx) && $$0.c(f) == epd.b;
    }

    private static boolean b(int $$0) {
        return $$0 >= 3;
    }

    private boolean a(dwr $$0, is $$1, eoh $$2, int $$3) {
        return !this.r($$2) && efn.b($$0, $$1) && (!efn.b($$3) || efn.a($$0, $$1.d()));
    }

    private boolean r(eoh $$0) {
        return $$0.c(e) >= 4;
    }

    private @Nullable a c(dwr $$0, is $$1, eoh $$2) {
        if (efn.p($$2)) {
            return new a($$1, $$2);
        }
        is $$3 = $$1.e();
        eoh $$4 = $$0.a_($$3);
        if (efn.p($$4)) {
            return new a($$3, $$4);
        }
        return null;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        a $$3 = this.c($$0, $$1, $$2);
        if ($$3 == null) {
            return false;
        }
        return this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        a $$4 = this.c($$0, $$2, $$3);
        if ($$4 == null) {
            return;
        }
        this.a($$0, $$4.b, $$4.a, 1);
    }

    static final class a
    extends Record {
        final is a;
        final eoh b;

        a(is $$0, eoh $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;state", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;state", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;state", "a", "b"}, this, $$0);
        }

        public is a() {
            return this.a;
        }

        public eoh b() {
            return this.b;
        }
    }
}

