/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public abstract class gje
extends giu {
    public static final int f = 120;
    public static final int n = 150;
    public static final int o = 200;
    public static final int p = 20;
    public static final int q = 8;
    protected static final b r = $$0 -> (yw)$$0.get();
    protected final c s;
    protected final b t;

    public static a a(yh $$0, c $$1) {
        return new a($$0, $$1);
    }

    protected gje(int $$0, int $$1, int $$2, int $$3, yh $$4, c $$5, b $$6) {
        super($$0, $$1, $$2, $$3, $$4);
        this.s = $$5;
        this.t = $$6;
    }

    @Override
    public void a(gza $$0) {
        this.s.onPress(this);
    }

    @Override
    protected yw f() {
        return this.t.createNarrationMessage(() -> super.f());
    }

    @Override
    public void a(gpd $$0) {
        this.c($$0);
    }

    public static class a {
        private final yh a;
        private final c b;
        private @Nullable gks c;
        private int d;
        private int e;
        private int f = 150;
        private int g = 20;
        private b h = r;

        public a(yh $$0, c $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(int $$0, int $$1) {
            this.d = $$0;
            this.e = $$1;
            return this;
        }

        public a a(int $$0) {
            this.f = $$0;
            return this;
        }

        public a b(int $$0, int $$1) {
            this.f = $$0;
            this.g = $$1;
            return this;
        }

        public a a(int $$0, int $$1, int $$2, int $$3) {
            return this.a($$0, $$1).b($$2, $$3);
        }

        public a a(@Nullable gks $$0) {
            this.c = $$0;
            return this;
        }

        public a a(b $$0) {
            this.h = $$0;
            return this;
        }

        public gje a() {
            d $$0 = new d(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
            $$0.a(this.c);
            return $$0;
        }
    }

    public static interface c {
        public void onPress(gje var1);
    }

    public static interface b {
        public yw createNarrationMessage(Supplier<yw> var1);
    }

    public static class d
    extends gje {
        protected d(int $$0, int $$1, int $$2, int $$3, yh $$4, c $$5, b $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        @Override
        protected void b(gir $$0, int $$1, int $$2, float $$3) {
            this.a($$0);
            this.a($$0.a(this, gir.a.a));
        }
    }
}

