/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class alm
implements aay<all> {
    public static final aao<ByteBuf, alm> a = aay.a(alm::a, alm::new);
    private final long b;

    public alm(long $$0) {
        this.b = $$0;
    }

    private alm(ByteBuf $$0) {
        this.b = $$0.readLong();
    }

    @Override
    private void a(ByteBuf $$0) {
        $$0.writeLong(this.b);
    }

    @Override
    public aba<alm> a() {
        return alk.b;
    }

    @Override
    public void a(all $$0) {
        $$0.a(this);
    }

    public long b() {
        return this.b;
    }
}

