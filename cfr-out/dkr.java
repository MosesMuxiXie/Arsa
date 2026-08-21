/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public final class dkr
extends Enum<dkr>
implements bhh {
    public static final /* enum */ dkr a = new dkr(0, "white", 0xF9FFFE, flf.i, 0xF0F0F0, 0xFFFFFF);
    public static final /* enum */ dkr b = new dkr(1, "orange", 16351261, flf.p, 15435844, 16738335);
    public static final /* enum */ dkr c = new dkr(2, "magenta", 13061821, flf.q, 12801229, 0xFF00FF);
    public static final /* enum */ dkr d = new dkr(3, "light_blue", 3847130, flf.r, 6719955, 10141901);
    public static final /* enum */ dkr e = new dkr(4, "yellow", 16701501, flf.s, 14602026, 0xFFFF00);
    public static final /* enum */ dkr f = new dkr(5, "lime", 8439583, flf.t, 4312372, 0xBFFF00);
    public static final /* enum */ dkr g = new dkr(6, "pink", 15961002, flf.u, 14188952, 16738740);
    public static final /* enum */ dkr h = new dkr(7, "gray", 4673362, flf.v, 0x434343, 0x808080);
    public static final /* enum */ dkr i = new dkr(8, "light_gray", 0x9D9D97, flf.w, 0xABABAB, 0xD3D3D3);
    public static final /* enum */ dkr j = new dkr(9, "cyan", 1481884, flf.x, 2651799, 65535);
    public static final /* enum */ dkr k = new dkr(10, "purple", 8991416, flf.y, 8073150, 10494192);
    public static final /* enum */ dkr l = new dkr(11, "blue", 3949738, flf.z, 2437522, 255);
    public static final /* enum */ dkr m = new dkr(12, "brown", 8606770, flf.A, 5320730, 9127187);
    public static final /* enum */ dkr n = new dkr(13, "green", 6192150, flf.B, 3887386, 65280);
    public static final /* enum */ dkr o = new dkr(14, "red", 11546150, flf.C, 11743532, 0xFF0000);
    public static final /* enum */ dkr p = new dkr(15, "black", 0x1D1D21, flf.D, 0x1E1B1B, 0);
    private static final IntFunction<dkr> t;
    private static final Int2ObjectOpenHashMap<dkr> u;
    public static final bhh.a<dkr> q;
    public static final aao<ByteBuf, dkr> r;
    @Deprecated
    public static final Codec<dkr> s;
    private final int v;
    private final String w;
    private final flf x;
    private final int y;
    private final int z;
    private final int A;
    private static final /* synthetic */ dkr[] B;

    public static dkr[] values() {
        return (dkr[])B.clone();
    }

    public static dkr valueOf(String $$0) {
        return Enum.valueOf(dkr.class, $$0);
    }

    private dkr(int $$0, String $$1, int $$2, flf $$3, int $$4, int $$5) {
        this.v = $$0;
        this.w = $$1;
        this.x = $$3;
        this.A = bel.g($$5);
        this.y = bel.g($$2);
        this.z = $$4;
    }

    public int a() {
        return this.v;
    }

    public String b() {
        return this.w;
    }

    public int d() {
        return this.y;
    }

    public flf e() {
        return this.x;
    }

    public int f() {
        return this.z;
    }

    public int g() {
        return this.A;
    }

    public static dkr a(int $$0) {
        return t.apply($$0);
    }

    @Contract(value="_,!null->!null;_,null->_")
    public static @Nullable dkr a(String $$0, @Nullable dkr $$1) {
        dkr $$2 = q.a($$0);
        return $$2 != null ? $$2 : $$1;
    }

    public static @Nullable dkr b(int $$0) {
        return (dkr)u.get($$0);
    }

    public String toString() {
        return this.w;
    }

    @Override
    public String c() {
        return this.w;
    }

    public static dkr a(axf $$0, dkr $$1, dkr $$22) {
        dqg $$3 = dkr.a($$1, $$22);
        return $$0.x().a(drd.a, $$3, $$0).map($$2 -> ((dqh)$$2.b()).a($$3, $$0.J_())).map(dlt::h).filter(dks.class::isInstance).map(dks.class::cast).map(dks::a).orElseGet(() -> $$0.y.h() ? $$1 : $$22);
    }

    private static dqg a(dkr $$0, dkr $$1) {
        return dqg.a(2, 1, List.of(new dlt(dks.a($$0)), new dlt(dks.a($$1))));
    }

    private static /* synthetic */ dkr[] h() {
        return new dkr[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    }

    static {
        B = dkr.h();
        t = beu.a(dkr::a, dkr.values(), beu.a.a);
        u = new Int2ObjectOpenHashMap(Arrays.stream(dkr.values()).collect(Collectors.toMap($$0 -> $$0.z, $$0 -> $$0)));
        q = bhh.a(dkr::values);
        r = aam.a(t, dkr::a);
        s = Codec.BYTE.xmap(dkr::a, $$0 -> (byte)$$0.v);
    }
}

