/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public final class ccz
extends Enum<ccz>
implements bhh {
    public static final /* enum */ ccz a = new ccz(0, "peaceful");
    public static final /* enum */ ccz b = new ccz(1, "easy");
    public static final /* enum */ ccz c = new ccz(2, "normal");
    public static final /* enum */ ccz d = new ccz(3, "hard");
    public static final bhh.a<ccz> e;
    private static final IntFunction<ccz> g;
    public static final aao<ByteBuf, ccz> f;
    private final int h;
    private final String i;
    private static final /* synthetic */ ccz[] j;

    public static ccz[] values() {
        return (ccz[])j.clone();
    }

    public static ccz valueOf(String $$0) {
        return Enum.valueOf(ccz.class, $$0);
    }

    private ccz(int $$0, String $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    public int a() {
        return this.h;
    }

    public yh b() {
        return yh.c("options.difficulty." + this.i);
    }

    public yh d() {
        return yh.c("options.difficulty." + this.i + ".info");
    }

    @Deprecated
    public static ccz a(int $$0) {
        return g.apply($$0);
    }

    public static @Nullable ccz a(String $$0) {
        return e.a($$0);
    }

    public String e() {
        return this.i;
    }

    @Override
    public String c() {
        return this.i;
    }

    private static /* synthetic */ ccz[] f() {
        return new ccz[]{a, b, c, d};
    }

    static {
        j = ccz.f();
        e = bhh.a(ccz::values);
        g = beu.a(ccz::a, ccz.values(), beu.a.b);
        f = aam.a(g, ccz::a);
    }
}

