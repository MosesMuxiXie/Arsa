/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aaf(yh b) implements aag
{
    public static final aah<aaf> a = new aah<aaf>(){
        private static final MapCodec<aaf> a = yj.a.fieldOf("value").xmap(aaf::new, aaf::b);
        private static final aao<xq, aaf> b = aao.a(yj.d, aaf::b, aaf::new);

        @Override
        public MapCodec<aaf> a() {
            return a;
        }

        @Override
        public aao<xq, aaf> b() {
            return b;
        }
    };

    @Override
    public yw a(int $$0) {
        return this.b.f();
    }

    public aah<aaf> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aaf.class, "value", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aaf.class, "value", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aaf.class, "value", "b"}, this, $$0);
    }
}

