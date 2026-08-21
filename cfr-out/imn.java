/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class imn
implements AutoCloseable {
    private final Int2ObjectMap<a> a = new Int2ObjectOpenHashMap();
    final ilr b;

    public imn(ilr $$0) {
        this.b = $$0;
    }

    public void a(fmu $$0, fmw $$1) {
        this.c($$0, $$1).a();
    }

    public amo b(fmu $$0, fmw $$1) {
        a $$2 = this.c($$0, $$1);
        $$2.b();
        return $$2.d;
    }

    public void a() {
        for (a $$0 : this.a.values()) {
            $$0.close();
        }
        this.a.clear();
    }

    private a c(fmu $$0, fmw $$12) {
        return (a)this.a.compute($$0.b(), ($$1, $$2) -> {
            if ($$2 == null) {
                return new a(this, (int)$$1, $$12);
            }
            $$2.a($$12);
            return $$2;
        });
    }

    @Override
    public void close() {
        this.a();
    }

    class a
    implements AutoCloseable {
        private fmw a;
        private final ilc b;
        private boolean c = true;
        final amo d;

        a(imn imn2, int $$0, fmw $$1) {
            this.a = $$1;
            this.b = new ilc(() -> "Map " + $$0, 128, 128, true);
            this.d = amo.b("map/" + $$0);
            imn2.b.a(this.d, this.b);
        }

        void a(fmw $$0) {
            boolean $$1 = this.a != $$0;
            this.a = $$0;
            this.c |= $$1;
        }

        public void a() {
            this.c = true;
        }

        void b() {
            if (this.c) {
                fyh $$0 = this.b.e();
                if ($$0 != null) {
                    for (int $$1 = 0; $$1 < 128; ++$$1) {
                        for (int $$2 = 0; $$2 < 128; ++$$2) {
                            int $$3 = $$2 + $$1 * 128;
                            $$0.b($$2, $$1, flf.b(this.a.h[$$3]));
                        }
                    }
                }
                this.b.d();
                this.c = false;
            }
        }

        @Override
        public void close() {
            this.b.close();
        }
    }
}

