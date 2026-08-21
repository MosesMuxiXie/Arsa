/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class akp
extends Record
implements aay<ako> {
    private final int b;
    private final alc c;
    public static final aao<wx, akp> a = aay.a(akp::a, akp::new);
    private static final int d = 0x100000;

    private akp(wx $$0) {
        this($$0.l(), akp.a($$0.q(), $$0));
    }

    public akp(int $$0, alc $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private static alc a(amo $$0, wx $$1) {
        return akp.b($$0, $$1);
    }

    private static ale b(amo $$0, wx $$1) {
        int $$2 = $$1.readableBytes();
        if ($$2 < 0 || $$2 > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
        $$1.k($$2);
        return new ale($$0);
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c.a());
        this.c.a($$0);
    }

    @Override
    public aba<akp> a() {
        return aku.a;
    }

    @Override
    public void a(ako $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{akp.class, "transactionId;payload", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{akp.class, "transactionId;payload", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{akp.class, "transactionId;payload", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public alc e() {
        return this.c;
    }
}

