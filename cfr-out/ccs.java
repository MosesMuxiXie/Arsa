/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.UUID;

public abstract class ccs {
    private final UUID h;
    protected yh a;
    protected float b;
    protected a c;
    protected b d;
    protected boolean e;
    protected boolean f;
    protected boolean g;

    public ccs(UUID $$0, yh $$1, a $$2, b $$3) {
        this.h = $$0;
        this.a = $$1;
        this.c = $$2;
        this.d = $$3;
        this.b = 1.0f;
    }

    public UUID i() {
        return this.h;
    }

    public yh j() {
        return this.a;
    }

    public void a(yh $$0) {
        this.a = $$0;
    }

    public float k() {
        return this.b;
    }

    public void a(float $$0) {
        this.b = $$0;
    }

    public a l() {
        return this.c;
    }

    public void a(a $$0) {
        this.c = $$0;
    }

    public b m() {
        return this.d;
    }

    public void a(b $$0) {
        this.d = $$0;
    }

    public boolean n() {
        return this.e;
    }

    public ccs a(boolean $$0) {
        this.e = $$0;
        return this;
    }

    public boolean o() {
        return this.f;
    }

    public ccs b(boolean $$0) {
        this.f = $$0;
        return this;
    }

    public ccs c(boolean $$0) {
        this.g = $$0;
        return this;
    }

    public boolean p() {
        return this.g;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("pink", l.m);
        public static final /* enum */ a b = new a("blue", l.j);
        public static final /* enum */ a c = new a("red", l.e);
        public static final /* enum */ a d = new a("green", l.k);
        public static final /* enum */ a e = new a("yellow", l.o);
        public static final /* enum */ a f = new a("purple", l.b);
        public static final /* enum */ a g = new a("white", l.p);
        public static final Codec<a> h;
        private final String i;
        private final l j;
        private static final /* synthetic */ a[] k;

        public static a[] values() {
            return (a[])k.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, l $$1) {
            this.i = $$0;
            this.j = $$1;
        }

        public l a() {
            return this.j;
        }

        public String b() {
            return this.i;
        }

        @Override
        public String c() {
            return this.i;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            k = ccs$a.d();
            h = bhh.a(a::values);
        }
    }

    public static final class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b("progress");
        public static final /* enum */ b b = new b("notched_6");
        public static final /* enum */ b c = new b("notched_10");
        public static final /* enum */ b d = new b("notched_12");
        public static final /* enum */ b e = new b("notched_20");
        public static final Codec<b> f;
        private final String g;
        private static final /* synthetic */ b[] h;

        public static b[] values() {
            return (b[])h.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.g = $$0;
        }

        public String a() {
            return this.g;
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            h = ccs$b.b();
            f = bhh.a(b::values);
        }
    }
}

