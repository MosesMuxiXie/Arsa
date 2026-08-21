/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.stream.Stream;

public interface fnq {
    public <T> Optional<T> a(String var1, Codec<T> var2);

    @Deprecated
    public <T> Optional<T> a(MapCodec<T> var1);

    public Optional<fnq> a(String var1);

    public fnq b(String var1);

    public Optional<b> c(String var1);

    public b d(String var1);

    public <T> Optional<a<T>> b(String var1, Codec<T> var2);

    public <T> a<T> c(String var1, Codec<T> var2);

    public boolean a(String var1, boolean var2);

    public byte a(String var1, byte var2);

    public int a(String var1, short var2);

    public Optional<Integer> e(String var1);

    public int a(String var1, int var2);

    public long a(String var1, long var2);

    public Optional<Long> f(String var1);

    public float a(String var1, float var2);

    public double a(String var1, double var2);

    public Optional<String> g(String var1);

    public String a(String var1, String var2);

    public Optional<int[]> h(String var1);

    @Deprecated
    public jf.a a();

    public static interface a<T>
    extends Iterable<T> {
        public boolean a();

        public Stream<T> b();
    }

    public static interface b
    extends Iterable<fnq> {
        public boolean a();

        public Stream<fnq> b();
    }
}

