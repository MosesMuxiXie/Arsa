/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public interface fns {
    public <T> void a(String var1, Codec<T> var2, T var3);

    public <T> void b(String var1, Codec<T> var2, @Nullable T var3);

    @Deprecated
    public <T> void a(MapCodec<T> var1, T var2);

    public void a(String var1, boolean var2);

    public void a(String var1, byte var2);

    public void a(String var1, short var2);

    public void a(String var1, int var2);

    public void a(String var1, long var2);

    public void a(String var1, float var2);

    public void a(String var1, double var2);

    public void a(String var1, String var2);

    public void a(String var1, int[] var2);

    public fns a(String var1);

    public b b(String var1);

    public <T> a<T> a(String var1, Codec<T> var2);

    public void c(String var1);

    public boolean a();

    public static interface a<T> {
        public void a(T var1);

        public boolean a();
    }

    public static interface b {
        public fns a();

        public void b();

        public boolean c();
    }
}

