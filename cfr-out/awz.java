/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class awz {
    private static final cgn a = cgu.cb.n();
    private static final int b = 1024;
    private final axf c;
    private final is d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private int i;
    private final CompletableFuture<ftm> j = new CompletableFuture();

    private awz(axf $$0, is $$1, int $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        long $$3 = (long)$$2 * 2L + 1L;
        this.f = (int)Math.min(1024L, $$3 * $$3);
        this.g = awz.a(this.f);
        this.h = bgr.a().a(this.f);
    }

    public static CompletableFuture<ftm> a(axf $$0, is $$1) {
        if (!$$0.F_().e() || $$0.s().bb().j() == dwl.c) {
            return CompletableFuture.completedFuture(awz.a((dvx)$$0, $$1));
        }
        int $$2 = Math.max(0, $$0.U().a(eua.Q));
        int $$3 = bgj.c($$0.w().b($$1.u(), $$1.w()));
        if ($$3 < $$2) {
            $$2 = $$3;
        }
        if ($$3 <= 1) {
            $$2 = 1;
        }
        awz $$4 = new awz($$0, $$1, $$2);
        $$4.a();
        return $$4.j;
    }

    private void a() {
        int $$0;
        if (($$0 = this.i++) < this.f) {
            int $$1 = (this.h + this.g * $$0) % this.f;
            int $$2 = $$1 % (this.e * 2 + 1);
            int $$3 = $$1 / (this.e * 2 + 1);
            int $$4 = this.d.u() + $$2 - this.e;
            int $$5 = this.d.w() + $$3 - this.e;
            this.a($$4, $$5, $$0, () -> {
                is $$2 = awz.a(this.c, $$4, $$5);
                if ($$2 != null && awz.b(this.c, $$2)) {
                    return Optional.of(ftm.c($$2));
                }
                return Optional.empty();
            });
        } else {
            this.a(this.d.u(), this.d.w(), $$0, () -> Optional.of(awz.a((dvx)this.c, this.d)));
        }
    }

    private static ftm a(dvx $$0, is $$1) {
        is.a $$2 = $$1.k();
        while (!awz.b($$0, $$2) && $$2.v() < $$0.aw()) {
            $$2.c(iz.b);
        }
        $$2.c(iz.a);
        while (awz.b($$0, $$2) && $$2.v() > $$0.K_()) {
            $$2.c(iz.a);
        }
        $$2.c(iz.b);
        return ftm.c($$2);
    }

    private static boolean b(dvx $$0, is $$1) {
        return $$0.a(null, a.a($$1.c()), true);
    }

    private static int a(int $$0) {
        return $$0 <= 16 ? $$0 - 1 : 17;
    }

    private void a(int $$0, int $$1, int $$2, Supplier<Optional<ftm>> $$3) {
        if (this.j.isDone()) {
            return;
        }
        int $$42 = jw.a($$0);
        int $$52 = jw.a($$1);
        this.c.p().a(axm.h, new dvu($$42, $$52), 0).whenCompleteAsync(($$4, $$5) -> {
            if ($$5 == null) {
                try {
                    Optional $$6 = (Optional)$$3.get();
                    if ($$6.isPresent()) {
                        this.j.complete((ftm)$$6.get());
                    } else {
                        this.a();
                    }
                }
                catch (Throwable $$7) {
                    $$5 = $$7;
                }
            }
            if ($$5 != null) {
                m $$8 = m.a($$5, "Searching for spawn");
                n $$9 = $$8.a("Spawn Lookup");
                $$9.a("Origin", this.d::toString);
                $$9.a("Radius", () -> Integer.toString(this.e));
                $$9.a("Candidate", () -> "[" + $$0 + "," + $$1 + "]");
                $$9.a("Progress", () -> $$2 + " out of " + this.f);
                this.j.completeExceptionally(new v($$8));
            }
        }, (Executor)this.c.s());
    }

    protected static @Nullable is a(axf $$0, int $$1, int $$2) {
        int $$5;
        boolean $$3 = $$0.F_().f();
        eqq $$4 = $$0.d(jw.a($$1), jw.a($$2));
        int n2 = $$5 = $$3 ? $$0.p().g().a($$0) : $$4.a(euq.a.e, $$1 & 0xF, $$2 & 0xF);
        if ($$5 < $$0.K_()) {
            return null;
        }
        int $$6 = $$4.a(euq.a.b, $$1 & 0xF, $$2 & 0xF);
        if ($$6 <= $$5 && $$6 > $$4.a(euq.a.d, $$1 & 0xF, $$2 & 0xF)) {
            return null;
        }
        is.a $$7 = new is.a();
        for (int $$8 = $$5 + 1; $$8 >= $$0.K_(); --$$8) {
            $$7.d($$1, $$8, $$2);
            eoh $$9 = $$0.a_($$7);
            if (!$$9.y().c()) break;
            if (!dzq.a($$9.g($$0, $$7), iz.b)) continue;
            return $$7.d().j();
        }
        return null;
    }

    public static @Nullable is a(axf $$0, dvu $$1) {
        if (w.a($$1)) {
            return null;
        }
        for (int $$2 = $$1.e(); $$2 <= $$1.g(); ++$$2) {
            for (int $$3 = $$1.f(); $$3 <= $$1.h(); ++$$3) {
                is $$4 = awz.a($$0, $$2, $$3);
                if ($$4 == null) continue;
                return $$4;
            }
        }
        return null;
    }
}

