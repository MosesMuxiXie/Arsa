/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class abr
extends Record
implements aay<abg> {
    private final amo c;
    private final byte[] d;
    public static final aao<wx, abr> a = aay.a(abr::a, abr::new);
    private static final int e = 5120;
    public static final aao<ByteBuf, byte[]> b = aam.a(5120);

    private abr(wx $$0) {
        this($$0.q(), (byte[])b.decode($$0));
    }

    public abr(amo $$0, byte[] $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.c);
        b.encode($$0, this.d);
    }

    @Override
    public aba<abr> a() {
        return abu.k;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abr.class, "key;payload", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abr.class, "key;payload", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abr.class, "key;payload", "c", "d"}, this, $$0);
    }

    public amo b() {
        return this.c;
    }

    public byte[] e() {
        return this.d;
    }
}

