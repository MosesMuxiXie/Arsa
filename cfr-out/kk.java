/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class kk<T>
extends Record {
    private final kh<T> b;
    private final T c;
    public static final aao<xq, kk<?>> a = new aao<xq, kk<?>>(){

        public kk<?> a(xq $$0) {
            kh $$1 = (kh)kh.b.decode($$0);
            return 1.a($$0, $$1);
        }

        private static <T> kk<T> a(xq $$0, kh<T> $$1) {
            return new kk<T>($$1, $$1.f().decode($$0));
        }

        public void a(xq $$0, kk<?> $$1) {
            1.b($$0, $$1);
        }

        private static <T> void b(xq $$0, kk<T> $$1) {
            kh.b.encode($$0, $$1.a());
            $$1.a().f().encode($$0, $$1.b());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((xq)((Object)object), (kk)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((xq)((Object)object));
        }
    };

    public kk(kh<T> $$0, T $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    static kk<?> a(Map.Entry<kh<?>, Object> $$0) {
        return kk.a($$0.getKey(), $$0.getValue());
    }

    public static <T> kk<T> a(kh<T> $$0, Object $$1) {
        return new kk<Object>($$0, $$1);
    }

    public void a(kj $$0) {
        $$0.b(this.b, this.c);
    }

    public <D> DataResult<D> a(DynamicOps<D> $$0) {
        Codec<T> $$1 = this.b.b();
        if ($$1 == null) {
            return DataResult.error(() -> "Component of type " + String.valueOf(this.b) + " is not encodable");
        }
        return $$1.encodeStart($$0, this.c);
    }

    @Override
    public String toString() {
        return String.valueOf(this.b) + "=>" + String.valueOf(this.c);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kk.class, "type;value", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kk.class, "type;value", "b", "c"}, this, $$0);
    }

    public kh<T> a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }
}

