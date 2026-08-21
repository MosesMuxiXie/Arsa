/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class geq
extends Enum<geq> {
    public static final /* enum */ geq a = new geq(0, "options.off");
    public static final /* enum */ geq b = new geq(1, "options.attack.crosshair");
    public static final /* enum */ geq c = new geq(2, "options.attack.hotbar");
    private static final IntFunction<geq> e;
    public static final Codec<geq> d;
    private final int f;
    private final yh g;
    private static final /* synthetic */ geq[] h;

    public static geq[] values() {
        return (geq[])h.clone();
    }

    public static geq valueOf(String $$0) {
        return Enum.valueOf(geq.class, $$0);
    }

    private geq(int $$0, String $$1) {
        this.f = $$0;
        this.g = yh.c($$1);
    }

    public yh a() {
        return this.g;
    }

    private static /* synthetic */ geq[] b() {
        return new geq[]{a, b, c};
    }

    static {
        h = geq.b();
        e = beu.a($$0 -> $$0.f, geq.values(), beu.a.b);
        d = Codec.INT.xmap(e::apply, $$0 -> $$0.f);
    }
}

