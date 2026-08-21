/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ug(fth a, ul b, boolean c) implements uh
{
    @Override
    public void a(uj $$0, float $$1) {
        double $$2 = this.a.a;
        double $$3 = this.a.b;
        double $$4 = this.a.c;
        double $$5 = this.a.d;
        double $$6 = this.a.e;
        double $$7 = this.a.f;
        if (this.b.a()) {
            int $$8 = this.b.b($$1);
            $$0.a(new ftm($$5, $$3, $$4), new ftm($$5, $$6, $$4), new ftm($$5, $$6, $$7), new ftm($$5, $$3, $$7), $$8);
            $$0.a(new ftm($$2, $$3, $$4), new ftm($$2, $$3, $$7), new ftm($$2, $$6, $$7), new ftm($$2, $$6, $$4), $$8);
            $$0.a(new ftm($$2, $$3, $$4), new ftm($$2, $$6, $$4), new ftm($$5, $$6, $$4), new ftm($$5, $$3, $$4), $$8);
            $$0.a(new ftm($$2, $$3, $$7), new ftm($$5, $$3, $$7), new ftm($$5, $$6, $$7), new ftm($$2, $$6, $$7), $$8);
            $$0.a(new ftm($$2, $$6, $$4), new ftm($$2, $$6, $$7), new ftm($$5, $$6, $$7), new ftm($$5, $$6, $$4), $$8);
            $$0.a(new ftm($$2, $$3, $$4), new ftm($$5, $$3, $$4), new ftm($$5, $$3, $$7), new ftm($$2, $$3, $$7), $$8);
        }
        if (this.b.b()) {
            int $$9 = this.b.a($$1);
            $$0.a(new ftm($$2, $$3, $$4), new ftm($$5, $$3, $$4), this.c ? bel.a($$9, -34953) : $$9, this.b.d());
            $$0.a(new ftm($$2, $$3, $$4), new ftm($$2, $$6, $$4), this.c ? bel.a($$9, -8913033) : $$9, this.b.d());
            $$0.a(new ftm($$2, $$3, $$4), new ftm($$2, $$3, $$7), this.c ? bel.a($$9, -8947713) : $$9, this.b.d());
            $$0.a(new ftm($$5, $$3, $$4), new ftm($$5, $$6, $$4), $$9, this.b.d());
            $$0.a(new ftm($$5, $$6, $$4), new ftm($$2, $$6, $$4), $$9, this.b.d());
            $$0.a(new ftm($$2, $$6, $$4), new ftm($$2, $$6, $$7), $$9, this.b.d());
            $$0.a(new ftm($$2, $$6, $$7), new ftm($$2, $$3, $$7), $$9, this.b.d());
            $$0.a(new ftm($$2, $$3, $$7), new ftm($$5, $$3, $$7), $$9, this.b.d());
            $$0.a(new ftm($$5, $$3, $$7), new ftm($$5, $$3, $$4), $$9, this.b.d());
            $$0.a(new ftm($$2, $$6, $$7), new ftm($$5, $$6, $$7), $$9, this.b.d());
            $$0.a(new ftm($$5, $$3, $$7), new ftm($$5, $$6, $$7), $$9, this.b.d());
            $$0.a(new ftm($$5, $$6, $$4), new ftm($$5, $$6, $$7), $$9, this.b.d());
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ug.class, "aabb;style;coloredCornerStroke", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ug.class, "aabb;style;coloredCornerStroke", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ug.class, "aabb;style;coloredCornerStroke", "a", "b", "c"}, this, $$0);
    }
}

