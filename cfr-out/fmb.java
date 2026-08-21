/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public final class fmb
extends Record {
    private final axf d;
    private final ftm e;
    private final ftm f;
    private final float g;
    private final float h;
    private final boolean i;
    private final boolean j;
    private final Set<chz> k;
    private final a l;
    public static final a a = $$0 -> {};
    public static final a b = fmb::a;
    public static final a c = fmb::b;

    public fmb(axf $$0, ftm $$1, ftm $$2, float $$3, float $$4, a $$5) {
        this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
    }

    public fmb(axf $$0, ftm $$1, ftm $$2, float $$3, float $$4, Set<chz> $$5, a $$6) {
        this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
    }

    public fmb(axf $$0, ftm $$1, ftm $$2, float $$3, float $$4, boolean $$5, boolean $$6, Set<chz> $$7, a $$8) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
    }

    private static void a(cgk $$0) {
        if ($$0 instanceof axg) {
            axg $$1 = (axg)$$0;
            $$1.g.b(new aes(1032, is.c, 0, false));
        }
    }

    private static void b(cgk $$0) {
        $$0.f(is.a($$0.dI()));
    }

    public static fmb a(axg $$0, a $$1) {
        axf $$2 = $$0.A().s().aH();
        fne.a $$3 = $$2.C();
        return new fmb($$2, fmb.a($$2, $$0), ftm.c, $$3.d(), $$3.e(), false, false, Set.of(), $$1);
    }

    public static fmb b(axg $$0, a $$1) {
        axf $$2 = $$0.A().s().aH();
        fne.a $$3 = $$2.C();
        return new fmb($$2, fmb.a($$2, $$0), ftm.c, $$3.d(), $$3.e(), true, false, Set.of(), $$1);
    }

    private static ftm a(axf $$0, cgk $$1) {
        return $$1.a($$0, $$0.C().b()).c();
    }

    public fmb a(float $$0, float $$1) {
        return new fmb(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
    }

    public fmb a(ftm $$0) {
        return new fmb(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
    }

    public fmb a() {
        return new fmb(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fmb.class, "newLevel;position;deltaMovement;yRot;xRot;missingRespawnBlock;asPassenger;relatives;postTeleportTransition", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fmb.class, "newLevel;position;deltaMovement;yRot;xRot;missingRespawnBlock;asPassenger;relatives;postTeleportTransition", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fmb.class, "newLevel;position;deltaMovement;yRot;xRot;missingRespawnBlock;asPassenger;relatives;postTeleportTransition", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
    }

    public axf b() {
        return this.d;
    }

    public ftm c() {
        return this.e;
    }

    public ftm d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.h;
    }

    public boolean g() {
        return this.i;
    }

    public boolean h() {
        return this.j;
    }

    public Set<chz> i() {
        return this.k;
    }

    public a j() {
        return this.l;
    }

    @FunctionalInterface
    public static interface a {
        public void onTransition(cgk var1);

        default public a then(a $$0) {
            return $$1 -> {
                this.onTransition($$1);
                $$0.onTransition($$1);
            };
        }
    }
}

