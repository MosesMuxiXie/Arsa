/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class cgw
extends Enum<cgw>
implements bhh,
Iterable<cgv> {
    public static final /* enum */ cgw a = new cgw(0, "any", $$0 -> true);
    public static final /* enum */ cgw b = new cgw(1, "mainhand", cgv.a);
    public static final /* enum */ cgw c = new cgw(2, "offhand", cgv.b);
    public static final /* enum */ cgw d = new cgw(3, "hand", $$0 -> $$0.a() == cgv.a.a);
    public static final /* enum */ cgw e = new cgw(4, "feet", cgv.c);
    public static final /* enum */ cgw f = new cgw(5, "legs", cgv.d);
    public static final /* enum */ cgw g = new cgw(6, "chest", cgv.e);
    public static final /* enum */ cgw h = new cgw(7, "head", cgv.f);
    public static final /* enum */ cgw i = new cgw(8, "armor", cgv::f);
    public static final /* enum */ cgw j = new cgw(9, "body", cgv.g);
    public static final /* enum */ cgw k = new cgw(10, "saddle", cgv.h);
    public static final IntFunction<cgw> l;
    public static final Codec<cgw> m;
    public static final aao<ByteBuf, cgw> n;
    private final int o;
    private final String p;
    private final Predicate<cgv> q;
    private final List<cgv> r;
    private static final /* synthetic */ cgw[] s;

    public static cgw[] values() {
        return (cgw[])s.clone();
    }

    public static cgw valueOf(String $$0) {
        return Enum.valueOf(cgw.class, $$0);
    }

    private cgw(int $$0, String $$1, Predicate<cgv> $$2) {
        this.o = $$0;
        this.p = $$1;
        this.q = $$2;
        this.r = cgv.j.stream().filter($$2).toList();
    }

    private cgw(int $$0, String $$12, cgv $$2) {
        this($$0, $$12, (cgv $$1) -> $$1 == $$2);
    }

    public static cgw a(cgv $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case cgv.a -> b;
            case cgv.b -> c;
            case cgv.c -> e;
            case cgv.d -> f;
            case cgv.e -> g;
            case cgv.f -> h;
            case cgv.g -> j;
            case cgv.h -> k;
        };
    }

    @Override
    public String c() {
        return this.p;
    }

    public boolean b(cgv $$0) {
        return this.q.test($$0);
    }

    public List<cgv> a() {
        return this.r;
    }

    @Override
    public Iterator<cgv> iterator() {
        return this.r.iterator();
    }

    private static /* synthetic */ cgw[] b() {
        return new cgw[]{a, b, c, d, e, f, g, h, i, j, k};
    }

    static {
        s = cgw.b();
        l = beu.a($$0 -> $$0.o, cgw.values(), beu.a.a);
        m = bhh.a(cgw::values);
        n = aam.a(l, (T $$0) -> $$0.o);
    }
}

