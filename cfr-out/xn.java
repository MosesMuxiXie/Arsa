/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import org.jspecify.annotations.Nullable;

public interface xn<T extends xk> {
    public wv a();

    public aaz b();

    public aao<ByteBuf, aay<? super T>> c();

    public @Nullable aaw d();

    public static interface b {
        public a a();
    }

    public static interface xn$a {
        public wv a();

        public aaz b();

        @bht
        public void a(a var1);

        @FunctionalInterface
        public static interface a {
            public void accept(aba<?> var1, int var2);
        }
    }
}

