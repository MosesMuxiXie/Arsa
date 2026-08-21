/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public final class cgv
extends Enum<cgv>
implements bhh {
    public static final /* enum */ cgv a = new cgv(cgv$a.a, 0, 0, "mainhand");
    public static final /* enum */ cgv b = new cgv(cgv$a.a, 1, 5, "offhand");
    public static final /* enum */ cgv c = new cgv(cgv$a.b, 0, 1, 1, "feet");
    public static final /* enum */ cgv d = new cgv(cgv$a.b, 1, 1, 2, "legs");
    public static final /* enum */ cgv e = new cgv(cgv$a.b, 2, 1, 3, "chest");
    public static final /* enum */ cgv f = new cgv(cgv$a.b, 3, 1, 4, "head");
    public static final /* enum */ cgv g = new cgv(cgv$a.c, 0, 1, 6, "body");
    public static final /* enum */ cgv h = new cgv(cgv$a.d, 0, 1, 7, "saddle");
    public static final int i = 0;
    public static final List<cgv> j;
    public static final IntFunction<cgv> k;
    public static final bhh.a<cgv> l;
    public static final aao<ByteBuf, cgv> m;
    private final a n;
    private final int o;
    private final int p;
    private final int q;
    private final String r;
    private static final /* synthetic */ cgv[] s;

    public static cgv[] values() {
        return (cgv[])s.clone();
    }

    public static cgv valueOf(String $$0) {
        return Enum.valueOf(cgv.class, $$0);
    }

    private cgv(a $$0, int $$1, int $$2, int $$3, String $$4) {
        this.n = $$0;
        this.o = $$1;
        this.p = $$2;
        this.q = $$3;
        this.r = $$4;
    }

    private cgv(a $$0, int $$1, int $$2, String $$3) {
        this($$0, $$1, 0, $$2, $$3);
    }

    public a a() {
        return this.n;
    }

    public int b() {
        return this.o;
    }

    public int a(int $$0) {
        return $$0 + this.o;
    }

    public dlt a(dlt $$0) {
        return this.p > 0 ? $$0.a(this.p) : $$0;
    }

    public int d() {
        return this.q;
    }

    public int b(int $$0) {
        return this.q + $$0;
    }

    public String e() {
        return this.r;
    }

    public boolean f() {
        return this.n == cgv$a.b || this.n == cgv$a.c;
    }

    @Override
    public String c() {
        return this.r;
    }

    public boolean g() {
        return this.n != cgv$a.d;
    }

    public static cgv a(String $$0) {
        cgv $$1 = l.a($$0);
        if ($$1 != null) {
            return $$1;
        }
        throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
    }

    private static /* synthetic */ cgv[] h() {
        return new cgv[]{a, b, c, d, e, f, g, h};
    }

    static {
        s = cgv.h();
        j = List.of(cgv.values());
        k = beu.a($$0 -> $$0.q, cgv.values(), beu.a.a);
        l = bhh.a(cgv::values);
        m = aam.a(k, (T $$0) -> $$0.q);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cgv$a.a();
        }
    }
}

