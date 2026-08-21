/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public final class dwl
extends Enum<dwl>
implements bhh {
    public static final /* enum */ dwl a = new dwl(0, "survival");
    public static final /* enum */ dwl b = new dwl(1, "creative");
    public static final /* enum */ dwl c = new dwl(2, "adventure");
    public static final /* enum */ dwl d = new dwl(3, "spectator");
    public static final dwl e;
    public static final bhh.a<dwl> f;
    private static final IntFunction<dwl> i;
    public static final aao<ByteBuf, dwl> g;
    @Deprecated
    public static final Codec<dwl> h;
    private static final int j = -1;
    private final int k;
    private final String l;
    private final yh m;
    private final yh n;
    private static final /* synthetic */ dwl[] o;

    public static dwl[] values() {
        return (dwl[])o.clone();
    }

    public static dwl valueOf(String $$0) {
        return Enum.valueOf(dwl.class, $$0);
    }

    private dwl(int $$0, String $$1) {
        this.k = $$0;
        this.l = $$1;
        this.m = yh.c("selectWorld.gameMode." + $$1);
        this.n = yh.c("gameMode." + $$1);
    }

    public int a() {
        return this.k;
    }

    public String b() {
        return this.l;
    }

    @Override
    public String c() {
        return this.l;
    }

    public yh d() {
        return this.n;
    }

    public yh e() {
        return this.m;
    }

    public void a(ddi $$0) {
        if (this == b) {
            $$0.c = true;
            $$0.d = true;
            $$0.a = true;
        } else if (this == d) {
            $$0.c = true;
            $$0.d = false;
            $$0.a = true;
            $$0.b = true;
        } else {
            $$0.c = false;
            $$0.d = false;
            $$0.a = false;
            $$0.b = false;
        }
        $$0.e = !this.f();
    }

    public boolean f() {
        return this == c || this == d;
    }

    public boolean g() {
        return this == b;
    }

    public boolean h() {
        return this == a || this == c;
    }

    public static dwl a(int $$0) {
        return i.apply($$0);
    }

    public static dwl a(String $$0) {
        return dwl.a($$0, a);
    }

    @Contract(value="_,!null->!null;_,null->_")
    public static @Nullable dwl a(String $$0, @Nullable dwl $$1) {
        dwl $$2 = f.a($$0);
        return $$2 != null ? $$2 : $$1;
    }

    public static int a(@Nullable dwl $$0) {
        return $$0 != null ? $$0.k : -1;
    }

    public static @Nullable dwl b(int $$0) {
        if ($$0 == -1) {
            return null;
        }
        return dwl.a($$0);
    }

    public static boolean c(int $$0) {
        return Arrays.stream(dwl.values()).anyMatch($$1 -> $$1.k == $$0);
    }

    private static /* synthetic */ dwl[] i() {
        return new dwl[]{a, b, c, d};
    }

    static {
        o = dwl.i();
        e = a;
        f = bhh.a(dwl::values);
        i = beu.a(dwl::a, dwl.values(), beu.a.a);
        g = aam.a(i, dwl::a);
        h = Codec.INT.xmap(dwl::a, dwl::a);
    }
}

