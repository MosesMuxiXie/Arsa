/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class elb
implements bxh {
    private static final Codec<eld<?>> d = mi.k.q();
    private static final Logger e = LogUtils.getLogger();
    private final eld<?> f;
    protected @Nullable dwo n;
    protected final is o;
    protected boolean p;
    private eoh g;
    private kf h = kf.a;

    public elb(eld<?> $$0, is $$1, eoh $$2) {
        this.f = $$0;
        this.o = $$1.j();
        this.a($$2);
        this.g = $$2;
    }

    private void a(eoh $$0) {
        if (!this.b($$0)) {
            throw new IllegalStateException("Invalid block entity " + this.r() + " state at " + String.valueOf(this.o) + ", got " + String.valueOf($$0));
        }
    }

    public boolean b(eoh $$0) {
        return this.f.a($$0);
    }

    public static is a(dvu $$0, uz $$1) {
        int $$2 = $$1.b("x", 0);
        int $$3 = $$1.b("y", 0);
        int $$4 = $$1.b("z", 0);
        int $$5 = jw.a($$2);
        int $$6 = jw.a($$4);
        if ($$5 != $$0.h || $$6 != $$0.i) {
            e.warn("Block entity {} found in a wrong chunk, expected position from chunk {}", (Object)$$1, (Object)$$0);
            $$2 = $$0.a(jw.b($$2));
            $$4 = $$0.b(jw.b($$4));
        }
        return new is($$2, $$3, $$4);
    }

    public @Nullable dwo j() {
        return this.n;
    }

    public void a(dwo $$0) {
        this.n = $$0;
    }

    public boolean n() {
        return this.n != null;
    }

    protected void a(fnq $$0) {
    }

    public final void b(fnq $$0) {
        this.a($$0);
        this.h = $$0.a("components", kf.b).orElse(kf.a);
    }

    public final void c(fnq $$0) {
        this.a($$0);
    }

    protected void a(fns $$0) {
    }

    public final uz b(jf.a $$0) {
        try (bgp.j $$1 = new bgp.j(this.v(), e);){
            fnp $$2 = fnp.a($$1, $$0);
            this.c($$2);
            uz uz2 = $$2.b();
            return uz2;
        }
    }

    public void c(fns $$0) {
        this.e($$0);
        this.h($$0);
    }

    public void d(fns $$0) {
        this.e($$0);
        this.g($$0);
    }

    public final uz c(jf.a $$0) {
        try (bgp.j $$1 = new bgp.j(this.v(), e);){
            fnp $$2 = fnp.a($$1, $$0);
            this.e($$2);
            uz uz2 = $$2.b();
            return uz2;
        }
    }

    public void e(fns $$0) {
        this.a($$0);
        $$0.a("components", kf.b, this.h);
    }

    public final uz d(jf.a $$0) {
        try (bgp.j $$1 = new bgp.j(this.v(), e);){
            fnp $$2 = fnp.a($$1, $$0);
            this.f($$2);
            uz uz2 = $$2.b();
            return uz2;
        }
    }

    public void f(fns $$0) {
        this.a($$0);
    }

    private void g(fns $$0) {
        elb.a($$0, this.s());
    }

    public static void a(fns $$0, eld<?> $$1) {
        $$0.a("id", d, $$1);
    }

    private void h(fns $$0) {
        this.g($$0);
        $$0.a("x", this.o.u());
        $$0.a("y", this.o.v());
        $$0.a("z", this.o.w());
    }

    /*
     * WARNING - void declaration
     */
    public static @Nullable elb a(is $$0, eoh $$1, uz $$2, jf.a $$3) {
        void $$7;
        eld $$4 = $$2.a("id", d).orElse(null);
        if ($$4 == null) {
            e.error("Skipping block entity with invalid type: {}", (Object)$$2.a("id"));
            return null;
        }
        try {
            Object $$5 = $$4.a($$0, $$1);
        }
        catch (Throwable $$6) {
            e.error("Failed to create block entity {} for block {} at position {} ", new Object[]{$$4, $$0, $$1, $$6});
            return null;
        }
        bgp.j $$8 = new bgp.j($$7.v(), e);
        try {
            $$7.b(fno.a((bgp)$$8, $$3, $$2));
            void var7_9 = $$7;
            $$8.close();
            return var7_9;
        }
        catch (Throwable throwable) {
            try {
                try {
                    $$8.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Throwable $$9) {
                e.error("Failed to load data for block entity {} for block {} at position {}", new Object[]{$$4, $$0, $$1, $$9});
                return null;
            }
        }
    }

    public void e() {
        if (this.n != null) {
            elb.a(this.n, this.o, this.g);
        }
    }

    protected static void a(dwo $$0, is $$1, eoh $$2) {
        $$0.u($$1);
        if (!$$2.l()) {
            $$0.b($$1, $$2.b());
        }
    }

    public is aD_() {
        return this.o;
    }

    public eoh o() {
        return this.g;
    }

    public @Nullable aay<adb> ax_() {
        return null;
    }

    public uz a(jf.a $$0) {
        return new uz();
    }

    public boolean p() {
        return this.p;
    }

    public void ay_() {
        this.p = true;
    }

    public void q() {
        this.p = false;
    }

    public void a(is $$0, eoh $$1) {
        elb elb2 = this;
        if (elb2 instanceof ccv) {
            ccv $$2 = (ccv)((Object)elb2);
            if (this.n != null) {
                ccy.a(this.n, $$0, $$2);
            }
        }
    }

    public boolean a_(int $$0, int $$1) {
        return false;
    }

    public void a(n $$0) {
        $$0.a("Name", this::r);
        $$0.a("Cached block", this.o()::toString);
        if (this.n == null) {
            $$0.a("Block location", () -> String.valueOf(this.o) + " (world missing)");
        } else {
            $$0.a("Actual block", this.n.a_(this.o)::toString);
            n.a($$0, this.n, this.o);
        }
    }

    public String r() {
        return String.valueOf(mi.k.b(this.s())) + " // " + this.getClass().getCanonicalName();
    }

    public eld<?> s() {
        return this.f;
    }

    @Deprecated
    public void c(eoh $$0) {
        this.a($$0);
        this.g = $$0;
    }

    protected void a(kd $$0) {
    }

    public final void a(dlt $$0) {
        this.a($$0.c(), $$0.d());
    }

    public final void a(kf $$0, kg $$1) {
        final HashSet<kh<dpe>> $$2 = new HashSet<kh<dpe>>();
        $$2.add(ki.ah);
        $$2.add(ki.ax);
        final kj $$3 = kj.a($$0, $$1);
        this.a(new kd(){

            @Override
            public <T> @Nullable T a(kh<? extends T> $$0) {
                $$2.add($$0);
                return $$3.a($$0);
            }

            @Override
            public <T> T a(kh<? extends T> $$0, T $$1) {
                $$2.add($$0);
                return $$3.a($$0, $$1);
            }
        });
        kg $$4 = $$1.a($$2::contains);
        this.h = $$4.e().a();
    }

    protected void a(kf.a $$0) {
    }

    @Deprecated
    public void b(fns $$0) {
    }

    public final kf t() {
        kf.a $$0 = kf.a();
        $$0.a(this.h);
        this.a($$0);
        return $$0.a();
    }

    public kf u() {
        return this.h;
    }

    public void a(kf $$0) {
        this.h = $$0;
    }

    public static @Nullable yh a(fnq $$0, String $$1) {
        return $$0.a($$1, yj.a).orElse(null);
    }

    public bgp.f v() {
        return new a(this);
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
    }

    record a(elb a) implements bgp.f
    {
        @Override
        public String get() {
            return this.a.r() + "@" + String.valueOf(this.a.aD_());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockEntity", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockEntity", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockEntity", "a"}, this, $$0);
        }
    }
}

