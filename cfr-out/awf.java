/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class awf {
    private final awu b;
    private final dvu c;
    private @Nullable erj d = null;
    public final erj a;
    private volatile boolean e;
    private final List<CompletableFuture<awk<eqf>>> f = new ArrayList<CompletableFuture<awk<eqf>>>();
    private final bhe<awv> g;
    private boolean h;

    private awf(awu $$0, erj $$1, dvu $$2, bhe<awv> $$3) {
        this.b = $$0;
        this.a = $$1;
        this.c = $$2;
        this.g = $$3;
    }

    public static awf a(awu $$0, erj $$12, dvu $$22) {
        int $$3 = eri.a.a($$12).a(erj.c);
        bhe<awv> $$4 = bhe.a($$22.h, $$22.i, $$3, ($$1, $$2) -> $$0.e(dvu.d($$1, $$2)));
        return new awf($$0, $$12, $$22, $$4);
    }

    public @Nullable CompletableFuture<?> a() {
        CompletableFuture<?> $$0;
        while (($$0 = this.g()) == null) {
            if (this.e || this.d == this.a) {
                this.e();
                return null;
            }
            this.d();
        }
        return $$0;
    }

    private void d() {
        erj $$2;
        if (this.d == null) {
            erj $$0 = erj.c;
        } else if (!this.h && this.d == erj.c && !this.f()) {
            this.h = true;
            erj $$1 = erj.c;
        } else {
            $$2 = erj.a().get(this.d.b() + 1);
        }
        this.a($$2, this.h);
        this.d = $$2;
    }

    public void b() {
        this.e = true;
    }

    private void e() {
        awv $$0 = this.g.a(this.c.h, this.c.i);
        $$0.a(this);
        this.g.a(this.b::a);
    }

    private boolean f() {
        if (this.a == erj.c) {
            return true;
        }
        erj $$0 = this.g.a(this.c.h, this.c.i).q();
        if ($$0 == null || $$0.d(this.a)) {
            return false;
        }
        erh $$1 = eri.b.a(this.a).c();
        int $$2 = $$1.c();
        for (int $$3 = this.c.h - $$2; $$3 <= this.c.h + $$2; ++$$3) {
            for (int $$4 = this.c.i - $$2; $$4 <= this.c.i + $$2; ++$$4) {
                int $$5 = this.c.f($$3, $$4);
                erj $$6 = $$1.a($$5);
                erj $$7 = this.g.a($$3, $$4).q();
                if ($$7 != null && !$$7.d($$6)) continue;
                return false;
            }
        }
        return true;
    }

    public awv c() {
        return this.g.a(this.c.h, this.c.i);
    }

    private void a(erj $$0, boolean $$1) {
        try (bzr $$2 = bzl.a().d("scheduleLayer");){
            $$2.a($$0::f);
            int $$3 = this.b($$0, $$1);
            for (int $$4 = this.c.h - $$3; $$4 <= this.c.h + $$3; ++$$4) {
                for (int $$5 = this.c.i - $$3; $$5 <= this.c.i + $$3; ++$$5) {
                    awv $$6 = this.g.a($$4, $$5);
                    if (!this.e && this.a($$0, $$1, $$6)) continue;
                    return;
                }
            }
        }
    }

    private int b(erj $$0, boolean $$1) {
        eri $$2 = $$1 ? eri.a : eri.b;
        return $$2.a(this.a).a($$0);
    }

    private boolean a(erj $$0, boolean $$1, awv $$2) {
        eri $$5;
        erj $$3 = $$2.q();
        boolean $$4 = $$3 != null && $$0.b($$3);
        eri eri2 = $$5 = $$4 ? eri.a : eri.b;
        if ($$4 && !$$1) {
            throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
        }
        CompletableFuture<awk<eqf>> $$6 = $$2.a($$5.a($$0), this.b, this.g);
        awk $$7 = $$6.getNow(null);
        if ($$7 == null) {
            this.f.add($$6);
            return true;
        }
        if ($$7.a()) {
            return true;
        }
        this.b();
        return false;
    }

    private @Nullable CompletableFuture<?> g() {
        while (!this.f.isEmpty()) {
            CompletableFuture<awk<eqf>> $$0 = this.f.getLast();
            awk $$1 = $$0.getNow(null);
            if ($$1 == null) {
                return $$0;
            }
            this.f.removeLast();
            if ($$1.a()) continue;
            this.b();
        }
        return null;
    }
}

