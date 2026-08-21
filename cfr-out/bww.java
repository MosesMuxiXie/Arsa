/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public final class bww
extends Enum<bww> {
    public static final /* enum */ bww a = new bww(0, 0x6000FF00);
    public static final /* enum */ bww b = new bww(1, 0x600000FF);
    public static final /* enum */ bww c = new bww(2, 0x60333333);
    private static final IntFunction<bww> e;
    public static final aao<ByteBuf, bww> d;
    private final int f;
    private final int g;
    private static final /* synthetic */ bww[] h;

    public static bww[] values() {
        return (bww[])h.clone();
    }

    public static bww valueOf(String $$0) {
        return Enum.valueOf(bww.class, $$0);
    }

    private bww(int $$0, int $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public int a() {
        return this.g;
    }

    private static /* synthetic */ bww[] b() {
        return new bww[]{a, b, c};
    }

    static {
        h = bww.b();
        e = beu.a($$0 -> $$0.f, bww.values(), beu.a.a);
        d = aam.a(e, $$0 -> $$0.f);
    }
}

