/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class abc<B extends ByteBuf, L extends xk> {
    private final aan.a<B, aay<? super L>, aba<? extends aay<? super L>>> a = aan.a(aay::a);
    private final aaz b;

    public abc(aaz $$0) {
        this.b = $$0;
    }

    public <T extends aay<? super L>> abc<B, L> a(aba<T> $$0, aao<? super B, T> $$1) {
        if ($$0.a() != this.b) {
            throw new IllegalArgumentException("Invalid packet flow for packet " + String.valueOf($$0) + ", expected " + this.b.name());
        }
        this.a.a($$0, $$1);
        return this;
    }

    public aao<B, aay<? super L>> a() {
        return this.a.a();
    }
}

