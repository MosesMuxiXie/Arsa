/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class gkn
extends gje {
    protected final gku a;
    protected final int b;
    protected final int c;

    gkn(int $$0, int $$1, yh $$2, int $$3, int $$4, gku $$5, gje.c $$6, @Nullable yh $$7, @Nullable gje.b $$8) {
        super(0, 0, $$0, $$1, $$2, $$6, $$8 == null ? r : $$8);
        if ($$7 != null) {
            this.a(gks.a($$7));
        }
        this.b = $$3;
        this.c = $$4;
        this.a = $$5;
    }

    protected void a(gir $$0, int $$1, int $$2) {
        $$0.a(hpa.at, this.a.a(this.b(), this.D()), $$1, $$2, this.b, this.c, this.m);
    }

    public static a a(yh $$0, gje.c $$1, boolean $$2) {
        return new a($$0, $$1, $$2);
    }

    public static class a {
        private final yh a;
        private final gje.c b;
        private final boolean c;
        private int d = 150;
        private int e = 20;
        private @Nullable gku f;
        private int g;
        private int h;
        private @Nullable yh i;
        private @Nullable gje.b j;

        public a(yh $$0, gje.c $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public a a(int $$0) {
            this.d = $$0;
            return this;
        }

        public a a(int $$0, int $$1) {
            this.d = $$0;
            this.e = $$1;
            return this;
        }

        public a a(amo $$0, int $$1, int $$2) {
            this.f = new gku($$0);
            this.g = $$1;
            this.h = $$2;
            return this;
        }

        public a a(gku $$0, int $$1, int $$2) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
            return this;
        }

        public a a() {
            this.i = this.a;
            return this;
        }

        public a a(gje.b $$0) {
            this.j = $$0;
            return this;
        }

        public gkn b() {
            if (this.f == null) {
                throw new IllegalStateException("Sprite not set");
            }
            if (this.c) {
                return new b(this.d, this.e, this.a, this.g, this.h, this.f, this.b, this.i, this.j);
            }
            return new c(this.d, this.e, this.a, this.g, this.h, this.f, this.b, this.i, this.j);
        }
    }

    public static class c
    extends gkn {
        protected c(int $$0, int $$1, yh $$2, int $$3, int $$4, gku $$5, gje.c $$6, @Nullable yh $$7, @Nullable gje.b $$8) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
        }

        @Override
        public void b(gir $$0, int $$1, int $$2, float $$3) {
            this.a($$0);
            int $$4 = this.aT_() + 2;
            int $$5 = this.aT_() + this.aS_() - this.b - 4;
            int $$6 = this.aT_() + this.aS_() / 2;
            gil $$7 = $$0.a(this, gir.a.a);
            $$7.a(this.B(), $$6, $$4, $$5, this.aU_(), this.aU_() + this.aR_());
            int $$8 = this.aT_() + this.aS_() - this.b - 2;
            int $$9 = this.aU_() + this.aR_() / 2 - this.c / 2;
            this.a($$0, $$8, $$9);
        }
    }

    public static class b
    extends gkn {
        protected b(int $$0, int $$1, yh $$2, int $$3, int $$4, gku $$5, gje.c $$6, @Nullable yh $$7, @Nullable gje.b $$8) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
        }

        @Override
        public void b(gir $$0, int $$1, int $$2, float $$3) {
            this.a($$0);
            int $$4 = this.aT_() + this.aS_() / 2 - this.b / 2;
            int $$5 = this.aU_() + this.aR_() / 2 - this.c / 2;
            this.a($$0, $$4, $$5);
        }
    }
}

