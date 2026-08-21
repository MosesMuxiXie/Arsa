/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public final class dhu
extends Enum<dhu> {
    public static final /* enum */ dhu a = new dhu(0);
    public static final /* enum */ dhu b = new dhu(1);
    public static final /* enum */ dhu c = new dhu(2);
    public static final /* enum */ dhu d = new dhu(3);
    public static final /* enum */ dhu e = new dhu(4);
    public static final /* enum */ dhu f = new dhu(5);
    public static final /* enum */ dhu g = new dhu(6);
    private static final IntFunction<dhu> i;
    public static final aao<ByteBuf, dhu> h;
    private final int j;
    private static final /* synthetic */ dhu[] k;

    public static dhu[] values() {
        return (dhu[])k.clone();
    }

    public static dhu valueOf(String $$0) {
        return Enum.valueOf(dhu.class, $$0);
    }

    private dhu(int $$0) {
        this.j = $$0;
    }

    public int a() {
        return this.j;
    }

    private static /* synthetic */ dhu[] b() {
        return new dhu[]{a, b, c, d, e, f, g};
    }

    static {
        k = dhu.b();
        i = beu.a(dhu::a, dhu.values(), beu.a.a);
        h = aam.a(i, dhu::a);
    }
}

