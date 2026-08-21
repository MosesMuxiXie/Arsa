/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class xq
extends wx {
    private final jr c;

    public xq(ByteBuf $$0, jr $$1) {
        super($$0);
        this.c = $$1;
    }

    public jr G() {
        return this.c;
    }

    public static Function<ByteBuf, xq> a(jr $$0) {
        return $$1 -> new xq((ByteBuf)$$1, $$0);
    }
}

