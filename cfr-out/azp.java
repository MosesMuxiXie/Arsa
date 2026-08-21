/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class azp
implements azl {
    private static final Logger c = LogUtils.getLogger();
    private final azk d;
    private final azd e;
    private final Set<String> f;
    private final List<Path> g;
    private final Map<azn, List<Path>> h;

    azp(azk $$0, azd $$1, Set<String> $$2, List<Path> $$3, Map<azn, List<Path>> $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    @Override
    public @Nullable bar<InputStream> a(String ... $$0) {
        bfp.a($$0);
        List<String> $$1 = List.of($$0);
        for (Path $$2 : this.g) {
            Path $$3 = bfp.a($$2, $$1);
            if (!Files.exists($$3, new LinkOption[0]) || !azo.a($$3)) continue;
            return bar.create($$3);
        }
        return null;
    }

    public void a(azn $$0, amo $$12, Consumer<Path> $$2) {
        bfp.e($$12.a()).ifSuccess($$3 -> {
            String $$4 = $$12.b();
            for (Path $$5 : this.h.get((Object)$$0)) {
                Path $$6 = $$5.resolve($$4);
                $$2.accept(bfp.a($$6, $$3));
            }
        }).ifError($$1 -> c.error("Invalid path {}: {}", (Object)$$12, (Object)$$1.message()));
    }

    @Override
    public void a(azn $$0, String $$12, String $$2, azl.a $$32) {
        bfp.e($$2).ifSuccess($$3 -> {
            List<Path> $$4 = this.h.get((Object)$$0);
            int $$5 = $$4.size();
            if ($$5 == 1) {
                azp.a($$32, $$12, $$4.get(0), $$3);
            } else if ($$5 > 1) {
                HashMap<amo, bar<InputStream>> $$6 = new HashMap<amo, bar<InputStream>>();
                for (int $$7 = 0; $$7 < $$5 - 1; ++$$7) {
                    azp.a($$6::putIfAbsent, $$12, $$4.get($$7), $$3);
                }
                Path $$8 = $$4.get($$5 - 1);
                if ($$6.isEmpty()) {
                    azp.a($$32, $$12, $$8, $$3);
                } else {
                    azp.a($$6::putIfAbsent, $$12, $$8, $$3);
                    $$6.forEach($$32);
                }
            }
        }).ifError($$1 -> c.error("Invalid path {}: {}", (Object)$$2, (Object)$$1.message()));
    }

    private static void a(azl.a $$0, String $$1, Path $$2, List<String> $$3) {
        Path $$4 = $$2.resolve($$1);
        azo.a($$1, $$4, $$3, $$0);
    }

    @Override
    public @Nullable bar<InputStream> a(azn $$0, amo $$12) {
        return (bar)bfp.e($$12.a()).mapOrElse($$2 -> {
            String $$3 = $$12.b();
            for (Path $$4 : this.h.get((Object)$$0)) {
                Path $$5 = bfp.a($$4.resolve($$3), $$2);
                if (!Files.exists($$5, new LinkOption[0]) || !azo.a($$5)) continue;
                return bar.create($$5);
            }
            return null;
        }, $$1 -> {
            c.error("Invalid path {}: {}", (Object)$$12, (Object)$$1.message());
            return null;
        });
    }

    @Override
    public Set<String> a(azn $$0) {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> @Nullable T a(azy<T> $$0) {
        bar<InputStream> $$1 = this.a("pack.mcmeta");
        if ($$1 == null) return this.e.a($$0);
        try (InputStream $$2 = $$1.get();){
            T $$3 = azc.a($$0, $$2, this.d);
            if ($$3 == null) return this.e.a($$0);
            T t2 = $$3;
            return t2;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this.e.a($$0);
    }

    @Override
    public azk a() {
        return this.d;
    }

    @Override
    public void close() {
    }

    public bbc d() {
        return $$02 -> Optional.ofNullable(this.a(azn.a, $$02)).map($$0 -> new bax(this, (bar<InputStream>)$$0));
    }
}

