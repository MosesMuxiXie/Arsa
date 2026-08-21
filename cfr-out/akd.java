/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.IntFunction;

public final class akd
extends Record
implements aay<aib> {
    private final is b;
    private final a c;
    private final emz.a d;
    public static final aao<xq, akd> a = aao.a(is.b, akd::b, akd$a.h, akd::e, emz.a.b, akd::f, akd::new);

    public akd(is $$0, a $$1, Optional<amt<tb>> $$2, jy $$3, egm $$4, boolean $$5) {
        this($$0, $$1, new emz.a($$2, $$3, $$4, $$5, emz.c.a, Optional.empty()));
    }

    public akd(is $$0, a $$1, emz.a $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public aba<akd> a() {
        return ahz.cq;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{akd.class, "pos;action;data", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{akd.class, "pos;action;data", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{akd.class, "pos;action;data", "b", "c", "d"}, this, $$0);
    }

    public is b() {
        return this.b;
    }

    public a e() {
        return this.c;
    }

    public emz.a f() {
        return this.d;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0);
        public static final /* enum */ a b = new a(1);
        public static final /* enum */ a c = new a(2);
        public static final /* enum */ a d = new a(3);
        public static final /* enum */ a e = new a(4);
        public static final /* enum */ a f = new a(5);
        public static final /* enum */ a g = new a(6);
        private static final IntFunction<a> i;
        public static final aao<ByteBuf, a> h;
        private final int j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.j = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            k = akd$a.a();
            i = beu.a($$0 -> $$0.j, akd$a.values(), beu.a.a);
            h = aam.a(i, $$0 -> $$0.j);
        }
    }
}

