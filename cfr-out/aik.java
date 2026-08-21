/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public final class aik
extends Record
implements aay<aib> {
    private final String b;
    private final Instant c;
    private final long d;
    private final @Nullable yu e;
    private final yp.b f;
    public static final aao<wx, aik> a = aay.a(aik::a, aik::new);

    private aik(wx $$0) {
        this($$0.d(256), $$0.s(), $$0.readLong(), $$0.c(yu::a), new yp.b($$0));
    }

    public aik(String $$0, Instant $$1, long $$2, @Nullable yu $$3, yp.b $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b, 256);
        $$0.a(this.c);
        $$0.b(this.d);
        $$0.a(this.e, yu::a);
        this.f.a($$0);
    }

    @Override
    public aba<aik> a() {
        return ahz.by;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aik.class, "message;timeStamp;salt;signature;lastSeenMessages", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aik.class, "message;timeStamp;salt;signature;lastSeenMessages", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aik.class, "message;timeStamp;salt;signature;lastSeenMessages", "b", "c", "d", "e", "f"}, this, $$0);
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

    public @Nullable yu g() {
        return this.e;
    }

    public yp.b h() {
        return this.f;
    }
}

