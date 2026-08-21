/*
 * Decompiled with CFR 0.152.
 */
public class gko
extends gja {
    private static final int a = 2;
    private int b = 0;
    private int c = 0;
    private boolean d = true;
    private a e = gko$a.a;

    public gko(yh $$0, gio $$1) {
        this(0, 0, $$1.a($$0.g()), $$1.b, $$0, $$1);
    }

    public gko(int $$0, int $$1, yh $$2, gio $$3) {
        this(0, 0, $$0, $$1, $$2, $$3);
    }

    public gko(int $$0, int $$1, int $$2, int $$3, yh $$4, gio $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
        this.k = false;
    }

    @Override
    public void a_(yh $$0) {
        super.a_($$0);
        this.d = true;
    }

    public gko a(int $$0) {
        return this.a($$0, gko$a.a);
    }

    public gko a(int $$0, a $$1) {
        this.b = $$0;
        this.e = $$1;
        return this;
    }

    @Override
    public int aS_() {
        if (this.b > 0) {
            if (this.d) {
                this.c = Math.min(this.b, this.a().a(this.B().g()));
                this.d = false;
            }
            return this.c;
        }
        return super.aS_();
    }

    @Override
    public void a(gil $$0) {
        boolean $$7;
        yh $$1 = this.B();
        gio $$2 = this.a();
        int $$3 = this.b > 0 ? this.b : this.aS_();
        int $$4 = $$2.a($$1);
        int $$5 = this.aT_();
        int $$6 = this.aU_() + (this.aR_() - $$2.b) / 2;
        boolean bl2 = $$7 = $$4 > $$3;
        if ($$7) {
            switch (this.e.ordinal()) {
                case 0: {
                    $$0.a($$5, $$6, gko.a($$1, $$2, $$3));
                    break;
                }
                case 1: {
                    this.a($$0, $$1, 2);
                }
            }
        } else {
            $$0.a($$5, $$6, $$1.g());
        }
    }

    public static bfr a(yh $$0, gio $$1, int $$2) {
        yn $$3 = $$1.a($$0, $$2 - $$1.a(yg.w));
        return uu.a().a(yn.a($$3, yg.w));
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = gko$a.a();
        }
    }
}

