/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gam {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 20;
    private final fzz c = fzz.a();
    private final Path d;
    private final gbk e;
    private final gfx f;
    private final long g;
    private final gan h;
    private volatile boolean i;
    private volatile @Nullable CompletableFuture<?> j;

    public gam(Path $$0, gbk $$1, gfx $$2, long $$3, gan $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    public CompletableFuture<?> a() {
        return CompletableFuture.runAsync(() -> {
            File $$0 = null;
            try {
                gbw $$1 = this.c();
                $$0 = gal.a(this.d, () -> this.i);
                this.h.d();
                try (fzx $$2 = new fzx($$0, this.g, this.e.a, $$1, this.f, w.b().c(), this.e.b.e, this.h.b());){
                    void $$6;
                    CompletableFuture<gde> $$3 = $$2.a();
                    this.j = $$3;
                    if (this.i) {
                        $$3.cancel(true);
                        return;
                    }
                    try {
                        gde $$4 = $$3.join();
                    }
                    catch (CompletionException $$5) {
                        throw $$5.getCause();
                    }
                    String $$7 = $$6.a();
                    if ($$7 != null) {
                        throw new gai($$7);
                    }
                    geb.b(this.g);
                    this.c.a(this.g, this.e.a, this.e.b, this.e.c);
                }
            }
            catch (gce $$8) {
                throw new gai($$8.a.b());
            }
            catch (InterruptedException | CancellationException $$9) {
                throw new gag();
            }
            catch (gah $$10) {
                throw $$10;
            }
            catch (Throwable $$11) {
                if ($$11 instanceof Error) {
                    Error $$12 = (Error)$$11;
                    throw $$12;
                }
                throw new gai($$11.getMessage());
            }
            finally {
                if ($$0 != null) {
                    b.debug("Deleting file {}", (Object)$$0.getAbsolutePath());
                    $$0.delete();
                }
            }
        }, bhs.h());
    }

    public void b() {
        this.i = true;
        CompletableFuture<?> $$0 = this.j;
        if ($$0 != null) {
            $$0.cancel(true);
        }
    }

    private gbw c() throws gce, InterruptedException {
        for (int $$0 = 0; $$0 < 20; ++$$0) {
            try {
                gbw $$1 = this.c.h(this.g);
                if (this.i) {
                    throw new gag();
                }
                if ($$1 == null) continue;
                if (!$$1.a()) {
                    throw new gak();
                }
                return $$1;
            }
            catch (gcf $$2) {
                Thread.sleep((long)$$2.c * 1000L);
            }
        }
        throw new gak();
    }
}

