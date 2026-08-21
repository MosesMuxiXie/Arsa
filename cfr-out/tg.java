/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class tg {
    final ta a;
    private final List<sx> b = Lists.newArrayList();
    private int c;

    tg(ta $$0) {
        this.a = $$0;
        this.c = $$0.p();
    }

    public tg a(Runnable $$0) {
        this.b.add(sx.a($$0));
        return this;
    }

    public tg a(long $$0, Runnable $$1) {
        this.b.add(sx.a($$0, $$1));
        return this;
    }

    public tg a(int $$0) {
        return this.a($$0, () -> {});
    }

    public tg b(Runnable $$0) {
        this.b.add(sx.a(() -> this.c($$0)));
        return this;
    }

    public tg a(int $$0, Runnable $$1) {
        this.b.add(sx.a(() -> {
            if (this.a.p() < this.c + $$0) {
                throw new sr(yh.c("test.error.sequence.not_completed"), this.a.p());
            }
            this.c($$1);
        }));
        return this;
    }

    public tg b(int $$0, Runnable $$1) {
        this.b.add(sx.a(() -> {
            if (this.a.p() < this.c + $$0) {
                this.c($$1);
                throw new sr(yh.c("test.error.sequence.not_completed"), this.a.p());
            }
        }));
        return this;
    }

    public void a() {
        this.b.add(sx.a(this.a::m));
    }

    public void a(Supplier<sy> $$0) {
        this.b.add(sx.a(() -> this.a.a((sy)$$0.get())));
    }

    public a b() {
        a $$0 = new a();
        this.b.add(sx.a(() -> $$0.a(this.a.p())));
        return $$0;
    }

    public void b(int $$0) {
        try {
            this.d($$0);
        }
        catch (sr sr2) {
            // empty catch block
        }
    }

    public void c(int $$0) {
        try {
            this.d($$0);
        }
        catch (sr $$1) {
            this.a.a($$1);
        }
    }

    private void c(Runnable $$0) {
        try {
            $$0.run();
        }
        catch (sr $$1) {
            this.a.a($$1);
        }
    }

    private void d(int $$0) {
        Iterator<sx> $$1 = this.b.iterator();
        while ($$1.hasNext()) {
            sx $$2 = $$1.next();
            $$2.b.run();
            $$1.remove();
            int $$3 = $$0 - this.c;
            int $$4 = this.c;
            this.c = $$0;
            if ($$2.a == null || $$2.a == (long)$$3) continue;
            this.a.a(new sr(yh.a("test.error.sequence.invalid_tick", (long)$$4 + $$2.a), $$0));
            break;
        }
    }

    public class a {
        private static final int b = -1;
        private int c = -1;

        void a(int $$0) {
            if (this.c != -1) {
                throw new IllegalStateException("Condition already triggered at " + this.c);
            }
            this.c = $$0;
        }

        public void a() {
            int $$0 = tg.this.a.p();
            if (this.c != $$0) {
                if (this.c == -1) {
                    throw new sr(yh.c("test.error.sequence.condition_not_triggered"), $$0);
                }
                throw new sr(yh.a("test.error.sequence.condition_already_triggered", this.c), $$0);
            }
        }
    }
}

