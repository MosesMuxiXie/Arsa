/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gyk {
    private static final Logger a = LogUtils.getLogger();
    private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
    private final gfj c;
    private final fni d;

    public gyk(gfj $$0, fni $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public void a(String $$0, dws $$1, evo $$2, Function<jf.a, evl> $$32, gsb $$4) {
        this.c.c(new grm(yh.c("selectWorld.data_read")));
        fni.c $$5 = this.a($$0);
        if ($$5 == null) {
            return;
        }
        bak $$6 = ban.a($$5);
        dxm $$7 = $$1.g();
        try {
            anr.d $$8 = new anr.d($$6, $$7, false, false);
            ans $$9 = this.a($$8, (anr.a $$3) -> {
                evl.b $$4 = ((evl)$$32.apply($$3.c())).a($$3.d().f(mj.bF));
                return new anr.b<fnm>(new fnm($$1, $$2, $$4.d(), $$4.a()), $$4.b());
            }, ans::new);
            this.c.a($$5, $$6, $$9, true);
        }
        catch (Exception $$10) {
            a.warn("Failed to load datapacks, can't proceed with server load", (Throwable)$$10);
            $$5.c();
            this.c.a($$4);
        }
    }

    private @Nullable fni.c a(String $$0) {
        try {
            return this.d.d($$0);
        }
        catch (IOException $$1) {
            a.warn("Failed to read level {} data", (Object)$$0, (Object)$$1);
            gna.a(this.c, $$0);
            this.c.a((gsb)null);
            return null;
        }
        catch (ftb $$2) {
            a.warn("{}", (Object)$$2.getMessage());
            this.c.a(gru.a(() -> this.c.a((gsb)null)));
            return null;
        }
    }

    public void a(fni.c $$0, ane $$1, jk<anc> $$2, fnt $$3) {
        bak $$4 = ban.a($$0);
        bap $$5 = (bap)new anr.d($$4, $$3.C(), false, false).a().getSecond();
        this.c.a($$0, $$4, new ans($$5, $$1, $$2, $$3), true);
    }

    public ans a(Dynamic<?> $$0, boolean $$12, bak $$2) throws Exception {
        anr.d $$3 = fni.a($$0, $$2, $$12);
        return this.a($$3, (anr.a $$1) -> {
            jq<esi> $$2 = $$1.d().f(mj.bF);
            fnf $$3 = fni.a($$0, $$1.b(), $$2, $$1.c());
            return new anr.b<fnt>($$3.a(), $$3.b().b());
        }, ans::new);
    }

    public Pair<dws, gyh> a(fni.c $$02) throws Exception {
        final class A
        extends Record {
            final dws a;
            final evo b;
            final jq<esi> c;

            A(dws $$0, evo $$1, jq<esi> $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "levelSettings;options;existingDimensions", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "levelSettings;options;existingDimensions", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "levelSettings;options;existingDimensions", "a", "b", "c"}, this, $$0);
            }

            public dws a() {
                return this.a;
            }

            public evo b() {
                return this.b;
            }

            public jq<esi> c() {
                return this.c;
            }
        }
        bak $$12 = ban.a($$02);
        Dynamic<?> $$22 = $$02.h();
        anr.d $$32 = fni.a($$22, $$12, false);
        return this.a($$32, (anr.a $$1) -> {
            jq<esi> $$2 = new jl<esi>(mj.bF, Lifecycle.stable()).n();
            fnf $$3 = fni.a($$22, $$1.b(), $$2, $$1.c());
            return new anr.b<A>(new A($$3.a().I(), $$3.a().x(), $$3.b().c()), $$1.d());
        }, (bap $$0, ane $$1, jk<anc> $$2, D $$3) -> {
            $$0.close();
            gyc $$4 = new gyc(gyj.a.a, etx.a(), null);
            return Pair.of((Object)$$3.a, (Object)new gyh($$3.b, new evl($$3.c), $$2, $$1, $$3.a.g(), $$4));
        });
    }

    private <D, R> R a(anr.d $$0, anr.f<D> $$1, anr.e<D, R> $$2) throws Exception {
        anr.c $$3 = new anr.c($$0, ee.a.c, bbh.c);
        CompletableFuture<R> $$4 = anr.a($$3, $$1, $$2, bhs.h(), this.c);
        this.c.b($$4::isDone);
        return $$4.get();
    }

    private void a(fni.c $$0, boolean $$1, Runnable $$22, Runnable $$32) {
        yw $$7;
        yw $$6;
        if ($$1) {
            yw $$4 = yh.c("selectWorld.backupQuestion.customized");
            yw $$5 = yh.c("selectWorld.backupWarning.customized");
        } else {
            $$6 = yh.c("selectWorld.backupQuestion.experimental");
            $$7 = yh.c("selectWorld.backupWarning.experimental");
        }
        this.c.a(new gqw($$32, ($$2, $$3) -> {
            if ($$2) {
                gya.a($$0);
            }
            $$22.run();
        }, $$6, $$7, false));
    }

    public static void a(gfj $$0, gxx $$1, Lifecycle $$2, Runnable $$32, boolean $$4) {
        BooleanConsumer $$5 = $$3 -> {
            if ($$3) {
                $$32.run();
            } else {
                $$0.a($$1);
            }
        };
        if ($$4 || $$2 == Lifecycle.stable()) {
            $$32.run();
        } else if ($$2 == Lifecycle.experimental()) {
            $$0.a(new gra($$5, yh.c("selectWorld.warning.experimental.title"), (yh)yh.c("selectWorld.warning.experimental.question")));
        } else {
            $$0.a(new gra($$5, yh.c("selectWorld.warning.deprecated.title"), (yh)yh.c("selectWorld.warning.deprecated.question")));
        }
    }

    public void a(String $$0, Runnable $$1) {
        this.c.c(new grm(yh.c("selectWorld.data_read")));
        fni.c $$2 = this.a($$0);
        if ($$2 == null) {
            return;
        }
        this.a($$2, $$1);
    }

    /*
     * WARNING - void declaration
     */
    private void a(fni.c $$0, Runnable $$1) {
        void $$10;
        void $$11;
        this.c.c(new grm(yh.c("selectWorld.data_read")));
        try {
            Dynamic<?> $$22 = $$0.h();
            fnj $$3 = $$0.a($$22);
        }
        catch (IOException | vk | vr $$4) {
            this.c.a(new gsa(this.c, $$2 -> {
                if ($$2) {
                    this.a($$0, $$1);
                } else {
                    $$0.c();
                    $$1.run();
                }
            }, $$0));
            return;
        }
        catch (OutOfMemoryError $$5) {
            bgh.b();
            String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
            a.error(LogUtils.FATAL_MARKER, $$6);
            OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
            $$7.initCause($$5);
            m $$8 = m.a($$7, $$6);
            n $$9 = $$8.a("World details");
            $$9.a("World folder", $$0.f());
            throw new v($$8);
        }
        this.a($$0, (fnj)$$11, (Dynamic<?>)$$10, $$1);
    }

    private void a(fni.c $$0, fnj $$1, Dynamic<?> $$2, Runnable $$32) {
        if (!$$1.r()) {
            $$0.c();
            this.c.a(new gqv($$32, yh.c("selectWorld.incompatible.title").b(-65536), (yh)yh.a("selectWorld.incompatible.description", $$1.k())));
            return;
        }
        fnj.a $$42 = $$1.o();
        if ($$42.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$42.c();
            String $$6 = "selectWorld.backupWarning." + $$42.c();
            yw $$7 = yh.c($$5);
            if ($$42.b()) {
                $$7.b(-2142128);
            }
            yw $$8 = yh.a($$6, $$1.k(), w.b().c());
            this.c.a(new gqw(() -> {
                $$0.c();
                $$32.run();
            }, ($$3, $$4) -> {
                if ($$3) {
                    gya.a($$0);
                }
                this.a($$0, $$2, false, $$32);
            }, $$7, $$8, false));
        } else {
            this.a($$0, $$2, false, $$32);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(fni.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
        void $$8;
        this.c.c(new grm(yh.c("selectWorld.resource_load")));
        bak $$4 = ban.a($$0);
        try {
            ans $$5 = this.a($$1, $$2, $$4);
            for (esi $$6 : $$5.c().a().f(mj.bF)) {
                $$6.b().a();
            }
        }
        catch (Exception $$7) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", (Throwable)$$7);
            if (!$$2) {
                this.c.a(new grf(() -> {
                    $$0.c();
                    $$3.run();
                }, () -> this.a($$0, $$1, true, $$3)));
            } else {
                $$0.c();
                this.c.a(new gqv($$3, yh.c("datapackFailure.safeMode.failed.title"), yh.c("datapackFailure.safeMode.failed.description"), yg.k, true));
            }
            return;
        }
        this.a($$0, (ans)$$8, $$4, $$3);
    }

    private void a(fni.c $$0, ans $$1, bak $$2, Runnable $$3) {
        boolean $$6;
        fnt $$4 = $$1.d();
        boolean $$5 = $$4.x().f();
        boolean bl2 = $$6 = $$4.A() != Lifecycle.stable();
        if ($$5 || $$6) {
            this.a($$0, $$5, () -> this.b($$0, $$1, $$2, $$3), () -> {
                $$1.close();
                $$0.c();
                $$3.run();
            });
            return;
        }
        this.b($$0, $$1, $$2, $$3);
    }

    private void b(fni.c $$02, ans $$1, bak $$2, Runnable $$3) {
        iom $$4 = this.c.ak();
        ((CompletableFuture)((CompletableFuture)((CompletableFuture)this.a($$4, $$02).thenApply($$0 -> true)).exceptionallyComposeAsync($$0 -> {
            a.warn("Failed to load pack: ", $$0);
            return this.a();
        }, (Executor)this.c)).thenAcceptAsync($$5 -> {
            if ($$5.booleanValue()) {
                this.a($$02, $$1, $$4, $$2, $$3);
            } else {
                $$4.e();
                $$1.close();
                $$02.c();
                $$3.run();
            }
        }, (Executor)this.c)).exceptionally($$0 -> {
            this.c.a(m.a($$0, "Load world"));
            return null;
        });
    }

    private void a(fni.c $$0, ans $$1, iom $$2, bak $$3, Runnable $$4) {
        if ($$0.b()) {
            this.c.a(new gra($$5 -> {
                if ($$5) {
                    this.a($$0, $$1, $$3);
                } else {
                    $$2.e();
                    $$1.close();
                    $$0.c();
                    $$4.run();
                }
            }, yh.c("selectWorld.warning.lowDiskSpace.title").a(l.m), yh.c("selectWorld.warning.lowDiskSpace.description"), yg.j, yg.k));
        } else {
            this.a($$0, $$1, $$3);
        }
    }

    private void a(fni.c $$0, ans $$1, bak $$2) {
        this.c.a($$0, $$2, $$1, false);
    }

    private CompletableFuture<Void> a(iom $$0, fni.c $$1) {
        Path $$2 = $$1.a(fng.k);
        if (Files.exists($$2, new LinkOption[0]) && !Files.isDirectory($$2, new LinkOption[0])) {
            $$0.f();
            CompletableFuture<Void> $$3 = $$0.b(b);
            $$0.a(b, $$2);
            return $$3;
        }
        return CompletableFuture.completedFuture(null);
    }

    private CompletableFuture<Boolean> a() {
        CompletableFuture<Boolean> $$0 = new CompletableFuture<Boolean>();
        this.c.a(new gra($$0::complete, yh.c("multiplayer.texturePrompt.failure.line1"), yh.c("multiplayer.texturePrompt.failure.line2"), yg.i, yg.e));
        return $$0;
    }
}

