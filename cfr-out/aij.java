/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;

public final class aij
extends Record
implements aay<aib> {
    private final String b;
    private final Instant c;
    private final long d;
    private final ek e;
    private final yp.b f;
    public static final aao<wx, aij> a = aay.a(aij::a, aij::new);

    private aij(wx $$0) {
        this($$0.p(), $$0.s(), $$0.readLong(), new ek($$0), new yp.b($$0));
    }

    public aij(String $$0, Instant $$1, long $$2, ek $$3, yp.b $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
        $$0.b(this.d);
        this.e.a($$0);
        this.f.a($$0);
    }

    @Override
    public aba<aij> a() {
        return ahz.bx;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aij.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aij.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aij.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public String b() {
        return this.b;
    }

    public Instant e() {
        return this.c;
    }

    public long f() {
        return this.d;
    }

    public ek g() {
        return this.e;
    }

    public yp.b h() {
        return this.f;
    }
}

