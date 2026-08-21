/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;

public final class ahs
extends Record
implements aay<adb> {
    private final a b;
    private final fvr c;
    public static final aao<xq, ahs> a = aao.a(ahs$a.e, ahs::b, fvr.a, ahs::e, ahs::new);

    public ahs(a $$0, fvr $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static ahs a(UUID $$0) {
        return new ahs(ahs$a.b, fvr.a($$0));
    }

    public static ahs a(UUID $$0, fvt.a $$1, jy $$2) {
        return new ahs(ahs$a.a, fvr.a($$0, $$1, $$2));
    }

    public static ahs b(UUID $$0, fvt.a $$1, jy $$2) {
        return new ahs(ahs$a.c, fvr.a($$0, $$1, $$2));
    }

    public static ahs a(UUID $$0, fvt.a $$1, dvu $$2) {
        return new ahs(ahs$a.a, fvr.a($$0, $$1, $$2));
    }

    public static ahs b(UUID $$0, fvt.a $$1, dvu $$2) {
        return new ahs(ahs$a.c, fvr.a($$0, $$1, $$2));
    }

    public static ahs a(UUID $$0, fvt.a $$1, float $$2) {
        return new ahs(ahs$a.a, fvr.a($$0, $$1, $$2));
    }

    public static ahs b(UUID $$0, fvt.a $$1, float $$2) {
        return new ahs(ahs$a.c, fvr.a($$0, $$1, $$2));
    }

    @Override
    public aba<ahs> a() {
        return ahz.bp;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public void a(fvs $$0) {
        this.b.f.accept($$0, this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahs.class, "operation;waypoint", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahs.class, "operation;waypoint", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahs.class, "operation;waypoint", "b", "c"}, this, $$0);
    }

    public a b() {
        return this.b;
    }

    public fvr e() {
        return this.c;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(fvu::c);
        public static final /* enum */ a b = new a(fvu::a);
        public static final /* enum */ a c = new a(fvu::b);
        final BiConsumer<fvs, fvr> f;
        public static final IntFunction<a> d;
        public static final aao<ByteBuf, a> e;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(BiConsumer<fvs, fvr> $$0) {
            this.f = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            g = ahs$a.a();
            d = beu.a(Enum::ordinal, ahs$a.values(), beu.a.b);
            e = aam.a(d, Enum::ordinal);
        }
    }
}

