/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class fmj {
    public static final aao<ByteBuf, fmj> a = aam.a(fmj::a, fmj::i);
    private static final fmj[] b = bhs.a(() -> {
        fmj[] $$0 = new fmj[48];
        fmj.a(new fmj(iz.b, iz.c, fmj$a.a), $$0);
        return $$0;
    });
    private final iz c;
    private final iz d;
    private final iz e;
    private final a f;
    private final int g;
    private final List<iz> h;
    private final List<iz> i;
    private final List<iz> j;
    private final Map<iz, fmj> k = new EnumMap<iz, fmj>(iz.class);
    private final Map<iz, fmj> l = new EnumMap<iz, fmj>(iz.class);
    private final Map<a, fmj> m = new EnumMap<a, fmj>(a.class);

    private fmj(iz $$02, iz $$1, a $$2) {
        this.c = $$02;
        this.d = $$1;
        this.f = $$2;
        this.g = fmj.b($$02, $$1, $$2);
        jy $$3 = $$1.q().d($$02.q());
        iz $$4 = iz.a($$3, null);
        Objects.requireNonNull($$4);
        this.e = this.f == fmj$a.b ? $$4 : $$4.g();
        this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
        this.i = this.h.stream().filter($$0 -> $$0.o() != this.c.o()).toList();
        this.j = this.h.stream().filter($$0 -> $$0.o() == this.c.o()).toList();
    }

    public static fmj a(iz $$0, iz $$1, a $$2) {
        return b[fmj.b($$0, $$1, $$2)];
    }

    public fmj a(iz $$0) {
        return this.l.get($$0);
    }

    public fmj b(iz $$0) {
        return this.k.get($$0);
    }

    public fmj c(iz $$0) {
        if ($$0.o() == this.c.o()) {
            return this;
        }
        return this.k.get($$0);
    }

    public fmj d(iz $$0) {
        fmj $$1 = this.b($$0);
        if (this.d == $$1.e) {
            return $$1.a();
        }
        return $$1;
    }

    public fmj a(a $$0) {
        return this.m.get((Object)$$0);
    }

    public fmj a() {
        return this.a(this.f.a());
    }

    public iz b() {
        return this.d;
    }

    public iz c() {
        return this.c;
    }

    public iz d() {
        return this.e;
    }

    public a e() {
        return this.f;
    }

    public List<iz> f() {
        return this.h;
    }

    public List<iz> g() {
        return this.i;
    }

    public List<iz> h() {
        return this.j;
    }

    public String toString() {
        return "[up=" + String.valueOf(this.c) + ",front=" + String.valueOf(this.d) + ",sideBias=" + String.valueOf((Object)this.f) + "]";
    }

    public int i() {
        return this.g;
    }

    public static fmj a(int $$0) {
        return b[$$0];
    }

    public static fmj a(bgr $$0) {
        return bhs.a(b, $$0);
    }

    private static fmj a(fmj $$0, fmj[] $$1) {
        if ($$1[$$0.i()] != null) {
            return $$1[$$0.i()];
        }
        $$1[$$0.i()] = $$0;
        for (a a2 : fmj$a.values()) {
            $$0.m.put(a2, fmj.a(new fmj($$0.c, $$0.d, a2), $$1));
        }
        for (Enum enum_ : iz.values()) {
            iz $$4 = $$0.c;
            if (enum_ == $$0.c) {
                $$4 = $$0.d.g();
            }
            if (enum_ == $$0.c.g()) {
                $$4 = $$0.d;
            }
            $$0.k.put((iz)enum_, fmj.a(new fmj($$4, (iz)enum_, $$0.f), $$1));
        }
        for (Enum enum_ : iz.values()) {
            iz $$6 = $$0.d;
            if (enum_ == $$0.d) {
                $$6 = $$0.c.g();
            }
            if (enum_ == $$0.d.g()) {
                $$6 = $$0.c;
            }
            $$0.l.put((iz)enum_, fmj.a(new fmj((iz)enum_, $$6, $$0.f), $$1));
        }
        return $$0;
    }

    @VisibleForTesting
    protected static int b(iz $$0, iz $$1, a $$2) {
        int $$4;
        if ($$0.o() == $$1.o()) {
            throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
        }
        if ($$0.o() == iz.a.b) {
            boolean $$3 = $$1.o() == iz.a.a;
        } else {
            $$4 = $$1.o() == iz.a.b ? 1 : 0;
        }
        int $$5 = $$4 << 1 | $$1.f().ordinal();
        return (($$0.ordinal() << 2) + $$5 << 1) + $$2.ordinal();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("left");
        public static final /* enum */ a b = new a("right");
        private final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.c = $$0;
        }

        public a a() {
            return this == a ? b : a;
        }

        public String toString() {
            return this.c;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = fmj$a.b();
        }
    }
}

