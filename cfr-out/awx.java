/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class awx
extends Enum<awx> {
    public static final /* enum */ awx a = new awx(0, "options.particles.all");
    public static final /* enum */ awx b = new awx(1, "options.particles.decreased");
    public static final /* enum */ awx c = new awx(2, "options.particles.minimal");
    private static final IntFunction<awx> e;
    public static final Codec<awx> d;
    private final int f;
    private final yh g;
    private static final /* synthetic */ awx[] h;

    public static awx[] values() {
        return (awx[])h.clone();
    }

    public static awx valueOf(String $$0) {
        return Enum.valueOf(awx.class, $$0);
    }

    private awx(int $$0, String $$1) {
        this.f = $$0;
        this.g = yh.c($$1);
    }

    public yh a() {
        return this.g;
    }

    private static /* synthetic */ awx[] b() {
        return new awx[]{a, b, c};
    }

    static {
        h = awx.b();
        e = beu.a($$0 -> $$0.f, awx.values(), beu.a.b);
        d = Codec.INT.xmap(e::apply, $$0 -> $$0.f);
    }
}

