/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;

public final class foc<T>
extends Record {
    private final amt<jq<T>> d;
    private final Codec<T> e;
    private final a<T> f;
    public static final foc<frm> a = new foc<frm>(mj.bI, frm.e, foc.e());
    public static final foc<fpr> b = new foc<fpr>(mj.bH, fpt.c, foc.e());
    public static final foc<fof> c = new foc<fof>(mj.bG, fof.d, foc.f());

    public foc(amt<jq<T>> $$0, Codec<T> $$1, a<T> $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public void a(fog $$0, amt<T> $$1, T $$2) {
        this.f.run($$0, $$1, $$2);
    }

    public static Stream<foc<?>> a() {
        return Stream.of(a, b, c);
    }

    private static <T extends fob> a<T> e() {
        return ($$0, $$1, $$2) -> $$2.a($$0.a(new bgp.h($$1), $$1));
    }

    private static a<fof> f() {
        return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a(new bgp.h($$1), $$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{foc.class, "registryKey;codec;validator", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{foc.class, "registryKey;codec;validator", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{foc.class, "registryKey;codec;validator", "d", "e", "f"}, this, $$0);
    }

    public amt<jq<T>> b() {
        return this.d;
    }

    public Codec<T> c() {
        return this.e;
    }

    public a<T> d() {
        return this.f;
    }

    @FunctionalInterface
    public static interface a<T> {
        public void run(fog var1, amt<T> var2, T var3);
    }
}

