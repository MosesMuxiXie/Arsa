/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;

public abstract class csd<E extends chl> {
    private static final bgr a = bgr.b();
    private static final int b = 20;
    private static final int c = 16;
    private static final csk d = csk.b().a(16.0);
    private static final csk e = csk.b().a(16.0).e();
    private static final csk f = csk.a().a(16.0);
    private static final csk g = csk.a().a(16.0).e();
    private static final csk h = csk.a().a(16.0).d();
    private static final csk i = csk.a().a(16.0).d().e();
    private final int j;
    private long k;

    public csd(int $$0) {
        this.j = $$0;
        this.k = a.a($$0);
    }

    public csd() {
        this(20);
    }

    public final void b(axf $$0, E $$1) {
        if (--this.k <= 0L) {
            this.k = this.j;
            this.a($$1);
            this.a($$0, $$1);
        }
    }

    private void a(E $$0) {
        double $$1 = ((chl)$$0).i(cis.o);
        d.a($$1);
        e.a($$1);
        f.a($$1);
        g.a($$1);
        h.a($$1);
        i.a($$1);
    }

    protected abstract void a(axf var1, E var2);

    public abstract Set<cqw<?>> a();

    public static boolean b(axf $$0, chl $$1, chl $$2) {
        if ($$1.ev().b(cqw.p, $$2)) {
            return e.a($$0, $$1, $$2);
        }
        return d.a($$0, $$1, $$2);
    }

    public static boolean c(axf $$0, chl $$1, chl $$2) {
        if ($$1.ev().b(cqw.p, $$2)) {
            return g.a($$0, $$1, $$2);
        }
        return f.a($$0, $$1, $$2);
    }

    public static BiPredicate<axf, chl> a(chl $$0, int $$12) {
        return csd.a($$12, ($$1, $$2) -> csd.c($$1, $$0, $$2));
    }

    public static boolean d(axf $$0, chl $$1, chl $$2) {
        if ($$1.ev().b(cqw.p, $$2)) {
            return i.a($$0, $$1, $$2);
        }
        return h.a($$0, $$1, $$2);
    }

    static <T, U> BiPredicate<T, U> a(int $$0, BiPredicate<T, U> $$1) {
        AtomicInteger $$2 = new AtomicInteger(0);
        return ($$3, $$4) -> {
            if ($$1.test($$3, $$4)) {
                $$2.set($$0);
                return true;
            }
            return $$2.decrementAndGet() >= 0;
        };
    }
}

