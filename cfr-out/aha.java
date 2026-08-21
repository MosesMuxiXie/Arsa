/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class aha
extends Record
implements aay<adb> {
    private final String b;
    private final String c;
    private final int d;
    private final Optional<yh> e;
    private final Optional<aag> f;
    public static final aao<xq, aha> a = aao.a(aam.p, aha::b, aam.p, aha::e, aam.h, aha::f, yj.e, aha::g, aai.d, aha::h, aha::new);

    public aha(String $$0, String $$1, int $$2, Optional<yh> $$3, Optional<aag> $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public aba<aha> a() {
        return ahz.aU;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aha.class, "owner;objectiveName;score;display;numberFormat", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aha.class, "owner;objectiveName;score;display;numberFormat", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aha.class, "owner;objectiveName;score;display;numberFormat", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public String b() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public Optional<yh> g() {
        return this.e;
    }

    public Optional<aag> h() {
        return this.f;
    }
}

