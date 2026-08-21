/*
 * Decompiled with CFR 0.152.
 */
public class gjp
extends gjz {
    public static final int a = 4;
    private final int b;
    private final int c;
    private final boolean d;
    private final a e;

    gjp(yh $$0, gio $$1, int $$2, int $$3, a $$4, boolean $$5) {
        super($$0, $$1);
        this.k = true;
        this.b = $$2;
        this.c = $$3;
        this.d = $$5;
        this.e = $$4;
        this.h();
        this.i();
        this.a(true);
    }

    @Override
    protected void a(gpd $$0) {
        $$0.a(gpc.a, this.B());
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        int $$4 = this.d && !this.aP_() ? bel.a(this.m, -6250336) : bel.b(this.m);
        switch (this.e.ordinal()) {
            case 0: {
                $$0.a(this.aT_() + 1, this.aU_(), this.E(), this.F(), bel.c(this.m));
                break;
            }
            case 1: {
                if (!this.aP_()) break;
                $$0.a(this.aT_() + 1, this.aU_(), this.E(), this.F(), bel.c(this.m));
                break;
            }
        }
        if (this.aP_() || this.d) {
            $$0.b(this.aT_(), this.aU_(), this.aS_(), this.aR_(), $$4);
        }
        super.a_($$0, $$1, $$2, $$3);
    }

    @Override
    protected int c() {
        return this.aT_() + this.b;
    }

    @Override
    protected int d() {
        return super.d() + this.b;
    }

    @Override
    public gjz a(int $$0) {
        return super.a($$0 - this.b * 2);
    }

    @Override
    public int aS_() {
        return this.g;
    }

    @Override
    public int aR_() {
        return this.h;
    }

    public int e() {
        return this.b;
    }

    public void h() {
        if (this.c != -1) {
            this.c(this.c);
            this.a(this.c);
        } else {
            this.c(this.a().a(this.B()) + this.b * 2);
        }
    }

    public void i() {
        int $$0 = this.a().b * this.a().c(this.B(), super.aS_()).size();
        this.d($$0 + this.b * 2);
    }

    @Override
    public void a_(yh $$0) {
        int $$2;
        this.i = $$0;
        if (this.c != -1) {
            int $$1 = this.c;
        } else {
            $$2 = this.a().a($$0) + this.b * 2;
        }
        this.c($$2);
        this.i();
    }

    @Override
    public void a(iqr $$0) {
    }

    public static b a(yh $$0, gio $$1) {
        return new b($$0, $$1);
    }

    public static b a(yh $$0, gio $$1, int $$2) {
        return new b($$0, $$1, $$2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = gjp$a.a();
        }
    }

    public static class b {
        private final yh a;
        private final gio b;
        private final int c;
        private int d = -1;
        private boolean e = true;
        private a f = gjp$a.a;

        b(yh $$0, gio $$1) {
            this($$0, $$1, 4);
        }

        b(yh $$0, gio $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public b a(int $$0) {
            this.d = $$0;
            return this;
        }

        public b b(int $$0) {
            this.d = $$0 + this.c * 2;
            return this;
        }

        public b a(boolean $$0) {
            this.e = $$0;
            return this;
        }

        public b a(a $$0) {
            this.f = $$0;
            return this;
        }

        public gjp a() {
            return new gjp(this.a, this.b, this.c, this.d, this.f, this.e);
        }
    }
}

