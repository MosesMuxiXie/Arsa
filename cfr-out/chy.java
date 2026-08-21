/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public final class chy
extends Record {
    private final ftm b;
    private final ftm c;
    private final float d;
    private final float e;
    public static final aao<wx, chy> a = aao.a(ftm.b, chy::a, ftm.b, chy::b, aam.l, chy::c, aam.l, chy::d, chy::new);

    public chy(ftm $$0, ftm $$1, float $$2, float $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static chy a(cgk $$0) {
        if ($$0.ch()) {
            return new chy($$0.l_().a(), $$0.ag(), $$0.l_().b(), $$0.l_().c());
        }
        return new chy($$0.dI(), $$0.ag(), $$0.ec(), $$0.ee());
    }

    public chy a(float $$0, float $$1) {
        return new chy(this.a(), this.b(), $$0, $$1);
    }

    public static chy a(fmb $$0) {
        return new chy($$0.c(), $$0.d(), $$0.e(), $$0.f());
    }

    public static chy a(chy $$0, chy $$1, Set<chz> $$2) {
        double $$3 = $$2.contains((Object)chz.a) ? $$0.b.g : 0.0;
        double $$4 = $$2.contains((Object)chz.b) ? $$0.b.h : 0.0;
        double $$5 = $$2.contains((Object)chz.c) ? $$0.b.i : 0.0;
        float $$6 = $$2.contains((Object)chz.d) ? $$0.d : 0.0f;
        float $$7 = $$2.contains((Object)chz.e) ? $$0.e : 0.0f;
        ftm $$8 = new ftm($$3 + $$1.b.g, $$4 + $$1.b.h, $$5 + $$1.b.i);
        float $$9 = $$6 + $$1.d;
        float $$10 = bgj.a($$7 + $$1.e, -90.0f, 90.0f);
        ftm $$11 = $$0.c;
        if ($$2.contains((Object)chz.i)) {
            float $$12 = $$0.d - $$9;
            float $$13 = $$0.e - $$10;
            $$11 = $$11.a((float)Math.toRadians($$13));
            $$11 = $$11.b((float)Math.toRadians($$12));
        }
        ftm $$14 = new ftm(chy.a($$11.g, $$1.c.g, $$2, chz.f), chy.a($$11.h, $$1.c.h, $$2, chz.g), chy.a($$11.i, $$1.c.i, $$2, chz.h));
        return new chy($$8, $$14, $$9, $$10);
    }

    private static double a(double $$0, double $$1, Set<chz> $$2, chz $$3) {
        return $$2.contains((Object)$$3) ? $$0 + $$1 : $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{chy.class, "position;deltaMovement;yRot;xRot", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{chy.class, "position;deltaMovement;yRot;xRot", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{chy.class, "position;deltaMovement;yRot;xRot", "b", "c", "d", "e"}, this, $$0);
    }

    public ftm a() {
        return this.b;
    }

    public ftm b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }
}

