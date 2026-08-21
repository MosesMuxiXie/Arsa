/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class iit {
    private final boolean a;

    protected iit(boolean $$0) {
        this.a = $$0;
    }

    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        dwo dwo2;
        if ($$2 == null) {
            $$2 = $$0.J();
        }
        if ($$2 == null) {
            return 0.0f;
        }
        if ($$1 == null && (dwo2 = $$2.ao()) instanceof hif) {
            hif $$4;
            $$1 = $$4 = (hif)dwo2;
        }
        if ($$1 == null) {
            return 0.0f;
        }
        return this.a($$0, $$1, $$3, $$2);
    }

    protected abstract float a(dlt var1, hif var2, int var3, chh var4);

    protected boolean b() {
        return this.a;
    }

    protected a a(float $$0) {
        return this.a ? iit.b($$0) : iit.c();
    }

    public static a b(final float $$0) {
        return new a(){
            private float b;
            private float c;
            private long d;

            @Override
            public float a() {
                return this.b;
            }

            @Override
            public boolean a(long $$02) {
                return this.d != $$02;
            }

            @Override
            public void a(long $$02, float $$1) {
                this.d = $$02;
                float $$2 = bgj.c($$1 - this.b + 0.5f, 1.0f) - 0.5f;
                this.c += $$2 * 0.1f;
                this.c *= $$0;
                this.b = bgj.c(this.b + this.c, 1.0f);
            }
        };
    }

    public static a c() {
        return new a(){
            private float a;

            @Override
            public float a() {
                return this.a;
            }

            @Override
            public boolean a(long $$0) {
                return true;
            }

            @Override
            public void a(long $$0, float $$1) {
                this.a = $$1;
            }
        };
    }

    public static interface a {
        public float a();

        public boolean a(long var1);

        public void a(long var1, float var3);
    }
}

