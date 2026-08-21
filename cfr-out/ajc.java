/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ajc
extends Record
implements aay<aib> {
    private final ftm b;
    private final float c;
    private final float d;
    private final boolean e;
    public static final aao<wx, ajc> a = aao.a(ftm.b, ajc::b, aam.l, ajc::e, aam.l, ajc::f, aam.b, ajc::g, ajc::new);

    public ajc(ftm $$0, float $$1, float $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static ajc a(cgk $$0) {
        if ($$0.ch()) {
            return new ajc($$0.l_().a(), $$0.l_().b(), $$0.l_().c(), $$0.aV());
        }
        return new ajc($$0.dI(), $$0.ec(), $$0.ee(), $$0.aV());
    }

    @Override
    public aba<ajc> a() {
        return ahz.bT;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajc.class, "position;yRot;xRot;onGround", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajc.class, "position;yRot;xRot;onGround", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajc.class, "position;yRot;xRot;onGround", "b", "c", "d", "e"}, this, $$0);
    }

    public ftm b() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }
}

