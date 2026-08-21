/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufUtil
 *  io.netty.util.ReferenceCounted
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.util.ReferenceCounted;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record xb(ByteBuf a) implements ReferenceCounted
{
    private final ByteBuf a;

    public xb(ByteBuf $$0) {
        this.a = ByteBufUtil.ensureAccessible((ByteBuf)$$0);
    }

    public static Object a(Object $$0) {
        if ($$0 instanceof ByteBuf) {
            ByteBuf $$1 = (ByteBuf)$$0;
            return new xb($$1);
        }
        return $$0;
    }

    public static Object b(Object $$0) {
        if ($$0 instanceof xb) {
            xb $$1 = (xb)$$0;
            return ByteBufUtil.ensureAccessible((ByteBuf)$$1.a);
        }
        return $$0;
    }

    public int refCnt() {
        return this.a.refCnt();
    }

    public xb a() {
        this.a.retain();
        return this;
    }

    public xb a(int $$0) {
        this.a.retain($$0);
        return this;
    }

    public xb b() {
        this.a.touch();
        return this;
    }

    public xb c(Object $$0) {
        this.a.touch($$0);
        return this;
    }

    public boolean release() {
        return this.a.release();
    }

    public boolean release(int $$0) {
        return this.a.release($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{xb.class, "contents", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{xb.class, "contents", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{xb.class, "contents", "a"}, this, $$0);
    }

    public ByteBuf c() {
        return this.a;
    }

    public /* synthetic */ ReferenceCounted touch(Object object) {
        return this.c(object);
    }

    public /* synthetic */ ReferenceCounted touch() {
        return this.b();
    }

    public /* synthetic */ ReferenceCounted retain(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ ReferenceCounted retain() {
        return this.a();
    }
}

