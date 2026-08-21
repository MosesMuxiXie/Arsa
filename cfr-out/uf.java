/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record uf(ftm a, float b, ul c) implements uh
{
    private static final int d = 20;
    private static final float e = 0.31415927f;

    @Override
    public void a(uj $$0, float $$1) {
        if (!this.c.b() && !this.c.a()) {
            return;
        }
        ftm[] $$2 = new ftm[21];
        for (int $$3 = 0; $$3 < 20; ++$$3) {
            ftm $$5;
            float $$4 = (float)$$3 * 0.31415927f;
            $$2[$$3] = $$5 = this.a.b((float)((double)this.b * Math.cos($$4)), 0.0, (float)((double)this.b * Math.sin($$4)));
        }
        $$2[20] = $$2[0];
        if (this.c.a()) {
            int $$6 = this.c.b($$1);
            $$0.a($$2, $$6);
        }
        if (this.c.b()) {
            int $$7 = this.c.a($$1);
            for (int $$8 = 0; $$8 < 20; ++$$8) {
                $$0.a($$2[$$8], $$2[$$8 + 1], $$7, this.c.d());
            }
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uf.class, "pos;radius;style", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uf.class, "pos;radius;style", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uf.class, "pos;radius;style", "a", "b", "c"}, this, $$0);
    }
}

