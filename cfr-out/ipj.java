/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ipj
implements iqu<ipj> {
    public static final amm a = new amm("sounds", ".ogg");
    private final amo b;
    private final cck c;
    private final cck d;
    private final int e;
    private final a f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public ipj(amo $$0, cck $$1, cck $$2, int $$3, a $$4, boolean $$5, boolean $$6, int $$7) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
    }

    public amo a() {
        return this.b;
    }

    public amo b() {
        return a.a(this.b);
    }

    public cck c() {
        return this.c;
    }

    public cck d() {
        return this.d;
    }

    @Override
    public int e() {
        return this.e;
    }

    public ipj a(bgr $$0) {
        return this;
    }

    @Override
    public void a(iqo $$0) {
        if (this.h) {
            $$0.a(this);
        }
    }

    public a f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public String toString() {
        return "Sound[" + String.valueOf(this.b) + "]";
    }

    @Override
    public /* synthetic */ Object b(bgr bgr2) {
        return this.a(bgr2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("file");
        public static final /* enum */ a b = new a("event");
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

        public static @Nullable a a(String $$0) {
            for (a $$1 : ipj$a.values()) {
                if (!$$1.c.equals($$0)) continue;
                return $$1;
            }
            return null;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = ipj$a.a();
        }
    }
}

