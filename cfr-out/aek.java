/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class aek
extends Record
implements aay<adb> {
    private final ftm b;
    private final float c;
    private final int d;
    private final Optional<ftm> e;
    private final lw f;
    private final jd<bcz> g;
    private final cbn<lt> h;
    public static final aao<xq, aek> a = aao.a(ftm.b, aek::b, aam.l, aek::e, aam.g, aek::f, ftm.b.a(aam::a), aek::g, ly.bm, aek::h, bcz.d, aek::i, cbn.a(lt.b), aek::j, aek::new);

    public aek(ftm $$0, float $$1, int $$2, Optional<ftm> $$3, lw $$4, jd<bcz> $$5, cbn<lt> $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    @Override
    public aba<aek> a() {
        return ahz.I;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aek.class, "center;radius;blockCount;playerKnockback;explosionParticle;explosionSound;blockParticles", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aek.class, "center;radius;blockCount;playerKnockback;explosionParticle;explosionSound;blockParticles", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aek.class, "center;radius;blockCount;playerKnockback;explosionParticle;explosionSound;blockParticles", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public ftm b() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public Optional<ftm> g() {
        return this.e;
    }

    public lw h() {
        return this.f;
    }

    public jd<bcz> i() {
        return this.g;
    }

    public cbn<lt> j() {
        return this.h;
    }
}

