/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public final class chz
extends Enum<chz> {
    public static final /* enum */ chz a = new chz(0);
    public static final /* enum */ chz b = new chz(1);
    public static final /* enum */ chz c = new chz(2);
    public static final /* enum */ chz d = new chz(3);
    public static final /* enum */ chz e = new chz(4);
    public static final /* enum */ chz f = new chz(5);
    public static final /* enum */ chz g = new chz(6);
    public static final /* enum */ chz h = new chz(7);
    public static final /* enum */ chz i = new chz(8);
    public static final Set<chz> j;
    public static final Set<chz> k;
    public static final Set<chz> l;
    public static final aao<ByteBuf, Set<chz>> m;
    private final int n;
    private static final /* synthetic */ chz[] o;

    public static chz[] values() {
        return (chz[])o.clone();
    }

    public static chz valueOf(String $$0) {
        return Enum.valueOf(chz.class, $$0);
    }

    @SafeVarargs
    public static Set<chz> a(Set<chz> ... $$0) {
        HashSet<chz> $$1 = new HashSet<chz>();
        for (Set<chz> $$2 : $$0) {
            $$1.addAll($$2);
        }
        return $$1;
    }

    public static Set<chz> a(boolean $$0, boolean $$1) {
        EnumSet<chz> $$2 = EnumSet.noneOf(chz.class);
        if ($$0) {
            $$2.add(d);
        }
        if ($$1) {
            $$2.add(e);
        }
        return $$2;
    }

    public static Set<chz> a(boolean $$0, boolean $$1, boolean $$2) {
        EnumSet<chz> $$3 = EnumSet.noneOf(chz.class);
        if ($$0) {
            $$3.add(a);
        }
        if ($$1) {
            $$3.add(b);
        }
        if ($$2) {
            $$3.add(c);
        }
        return $$3;
    }

    public static Set<chz> b(boolean $$0, boolean $$1, boolean $$2) {
        EnumSet<chz> $$3 = EnumSet.noneOf(chz.class);
        if ($$0) {
            $$3.add(f);
        }
        if ($$1) {
            $$3.add(g);
        }
        if ($$2) {
            $$3.add(h);
        }
        return $$3;
    }

    private chz(int $$0) {
        this.n = $$0;
    }

    private int a() {
        return 1 << this.n;
    }

    private boolean b(int $$0) {
        return ($$0 & this.a()) == this.a();
    }

    public static Set<chz> a(int $$0) {
        EnumSet<chz> $$1 = EnumSet.noneOf(chz.class);
        for (chz $$2 : chz.values()) {
            if (!$$2.b($$0)) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public static int a(Set<chz> $$0) {
        int $$1 = 0;
        for (chz $$2 : $$0) {
            $$1 |= $$2.a();
        }
        return $$1;
    }

    private static /* synthetic */ chz[] b() {
        return new chz[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        o = chz.b();
        j = Set.of(chz.values());
        k = Set.of(e, d);
        l = Set.of(f, g, h, i);
        m = aam.g.a(chz::a, chz::a);
    }
}

