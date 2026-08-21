/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public final class dou
extends Enum<dou> {
    public static final /* enum */ dou a = new dou(0);
    public static final /* enum */ dou b = new dou(1);
    public static final IntFunction<dou> c;
    public static final aao<ByteBuf, dou> d;
    private final int e;
    private static final /* synthetic */ dou[] f;

    public static dou[] values() {
        return (dou[])f.clone();
    }

    public static dou valueOf(String $$0) {
        return Enum.valueOf(dou.class, $$0);
    }

    private dou(int $$0) {
        this.e = $$0;
    }

    public int a() {
        return this.e;
    }

    private static /* synthetic */ dou[] b() {
        return new dou[]{a, b};
    }

    static {
        f = dou.b();
        c = beu.a(dou::a, dou.values(), beu.a.a);
        d = aam.a(c, dou::a);
    }
}

