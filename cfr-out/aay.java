/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public interface aay<T extends xk> {
    public aba<? extends aay<T>> a();

    public void a(T var1);

    default public boolean c() {
        return false;
    }

    default public boolean d() {
        return false;
    }

    public static <B extends ByteBuf, T extends aay<?>> aao<B, T> a(aar<B, T> $$0, aap<B, T> $$1) {
        return aao.a($$0, $$1);
    }
}

