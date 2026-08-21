/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public interface azl
extends AutoCloseable {
    public static final String a = ".mcmeta";
    public static final String b = "pack.mcmeta";

    public @Nullable bar<InputStream> a(String ... var1);

    public @Nullable bar<InputStream> a(azn var1, amo var2);

    public void a(azn var1, String var2, String var3, a var4);

    public Set<String> a(azn var1);

    public <T> @Nullable T a(azy<T> var1) throws IOException;

    public azk a();

    default public String b() {
        return this.a().a();
    }

    default public Optional<bag> c() {
        return this.a().d();
    }

    @Override
    public void close();

    @FunctionalInterface
    public static interface a
    extends BiConsumer<amo, bar<InputStream>> {
    }
}

