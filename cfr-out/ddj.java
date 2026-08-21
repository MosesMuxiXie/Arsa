/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class ddj
extends Enum<ddj> {
    public static final /* enum */ ddj a = new ddj(0, "options.chat.visibility.full");
    public static final /* enum */ ddj b = new ddj(1, "options.chat.visibility.system");
    public static final /* enum */ ddj c = new ddj(2, "options.chat.visibility.hidden");
    private static final IntFunction<ddj> e;
    public static final Codec<ddj> d;
    private final int f;
    private final yh g;
    private static final /* synthetic */ ddj[] h;

    public static ddj[] values() {
        return (ddj[])h.clone();
    }

    public static ddj valueOf(String $$0) {
        return Enum.valueOf(ddj.class, $$0);
    }

    private ddj(int $$0, String $$1) {
        this.f = $$0;
        this.g = yh.c($$1);
    }

    public yh a() {
        return this.g;
    }

    private static /* synthetic */ ddj[] b() {
        return new ddj[]{a, b, c};
    }

    static {
        h = ddj.b();
        e = beu.a($$0 -> $$0.f, ddj.values(), beu.a.b);
        d = Codec.INT.xmap(e::apply, $$0 -> $$0.f);
    }
}

