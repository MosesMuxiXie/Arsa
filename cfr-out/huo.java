/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.Duration;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public class huo
implements hug.a {
    private static final Duration a = Duration.ofMillis(500L);
    private static final int b = 10;
    private static final int c = bel.a(0.25f, 1.0f, 1.0f, 0.0f);
    private static final int d = bel.a(0.125f, 0.25f, 0.125f, 0.0f);
    private final gfj e;
    private final dww f;
    private Instant g = Instant.now();
    private @Nullable a h;

    public huo(gfj $$0, dww $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        Instant $$6 = Instant.now();
        if (this.h == null || Duration.between(this.g, $$6).compareTo(a) > 0) {
            this.g = $$6;
            this.h = new a(this.e.r.C_(), jw.a(this.e.s.dK()), 10, this.f);
        }
        huo.b(this.h.a, this.h.c, c);
        huo.b(this.h.b, this.h.c, d);
        huo.a(this.h.a, this.h.c, c);
        huo.a(this.h.b, this.h.c, d);
    }

    private static void a(ftv $$0, jw $$1, int $$22) {
        $$0.a(($$2, $$3, $$4, $$5) -> {
            int $$6 = $$3 + $$1.u();
            int $$7 = $$4 + $$1.v();
            int $$8 = $$5 + $$1.w();
            huo.a($$2, $$6, $$7, $$8, $$22);
        });
    }

    private static void b(ftv $$0, jw $$1, int $$22) {
        $$0.a(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            int $$8 = $$2 + $$1.u();
            int $$9 = $$3 + $$1.v();
            int $$10 = $$4 + $$1.w();
            int $$11 = $$5 + $$1.u();
            int $$12 = $$6 + $$1.v();
            int $$13 = $$7 + $$1.w();
            huo.a($$8, $$9, $$10, $$11, $$12, $$13, $$22);
        }, true);
    }

    private static void a(iz $$0, int $$1, int $$2, int $$3, int $$4) {
        ftm $$5 = new ftm(jw.c($$1), jw.c($$2), jw.c($$3));
        ftm $$6 = $$5.b(16.0, 16.0, 16.0);
        um.a($$5, $$6, $$0, ul.b($$4));
    }

    private static void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        double $$7 = jw.c($$0);
        double $$8 = jw.c($$1);
        double $$9 = jw.c($$2);
        double $$10 = jw.c($$3);
        double $$11 = jw.c($$4);
        double $$12 = jw.c($$5);
        int $$13 = bel.g($$6);
        um.a(new ftm($$7, $$8, $$9), new ftm($$10, $$11, $$12), $$13);
    }

    static final class a {
        final ftv a;
        final ftv b;
        final jw c;

        a(fkq $$0, jw $$1, int $$2, dww $$3) {
            int $$4 = $$2 * 2 + 1;
            this.a = new ftp($$4, $$4, $$4);
            this.b = new ftp($$4, $$4, $$4);
            for (int $$5 = 0; $$5 < $$4; ++$$5) {
                for (int $$6 = 0; $$6 < $$4; ++$$6) {
                    for (int $$7 = 0; $$7 < $$4; ++$$7) {
                        jw $$8 = jw.a($$1.a() + $$7 - $$2, $$1.b() + $$6 - $$2, $$1.c() + $$5 - $$2);
                        fkp.b $$9 = $$0.b($$3, $$8);
                        if ($$9 == fkp.b.c) {
                            this.a.c($$7, $$6, $$5);
                            this.b.c($$7, $$6, $$5);
                            continue;
                        }
                        if ($$9 != fkp.b.b) continue;
                        this.b.c($$7, $$6, $$5);
                    }
                }
            }
            this.c = jw.a($$1.a() - $$2, $$1.b() - $$2, $$1.c() - $$2);
        }
    }
}

