/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class akj
extends Record
implements aay<akm> {
    private final int b;
    private final String c;
    private final int d;
    private final aki e;
    public static final aao<wx, akj> a = aay.a(akj::a, akj::new);
    private static final int f = 255;

    @Deprecated
    public akj(int $$0, String $$1, int $$2, aki $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    private akj(wx $$0) {
        this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aki.a($$0.l()));
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
        $$0.m(this.d);
        $$0.c(this.e.a());
    }

    @Override
    public aba<akj> a() {
        return akk.a;
    }

    @Override
    public void a(akm $$0) {
        $$0.a(this);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{akj.class, "protocolVersion;hostName;port;intention", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{akj.class, "protocolVersion;hostName;port;intention", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{akj.class, "protocolVersion;hostName;port;intention", "b", "c", "d", "e"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public aki g() {
        return this.e;
    }
}

