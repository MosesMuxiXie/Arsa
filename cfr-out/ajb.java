/*
 * Decompiled with CFR 0.152.
 */
public abstract class ajb
implements aay<aib> {
    private static final int j = 1;
    private static final int k = 2;
    protected final double a;
    protected final double b;
    protected final double c;
    protected final float d;
    protected final float e;
    protected final boolean f;
    protected final boolean g;
    protected final boolean h;
    protected final boolean i;

    static int a(boolean $$0, boolean $$1) {
        int $$2 = 0;
        if ($$0) {
            $$2 |= 1;
        }
        if ($$1) {
            $$2 |= 2;
        }
        return $$2;
    }

    static boolean a(int $$0) {
        return ($$0 & 1) != 0;
    }

    static boolean b(int $$0) {
        return ($$0 & 2) != 0;
    }

    protected ajb(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
        this.i = $$8;
    }

    @Override
    public abstract aba<? extends ajb> a();

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    public double a(double $$0) {
        return this.h ? this.a : $$0;
    }

    public double b(double $$0) {
        return this.h ? this.b : $$0;
    }

    public double c(double $$0) {
        return this.h ? this.c : $$0;
    }

    public float a(float $$0) {
        return this.i ? this.d : $$0;
    }

    public float b(float $$0) {
        return this.i ? this.e : $$0;
    }

    public boolean b() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.i;
    }

    public static class d
    extends ajb {
        public static final aao<wx, d> j = aay.a(d::b, d::a);

        public d(boolean $$0, boolean $$1) {
            super(0.0, 0.0, 0.0, 0.0f, 0.0f, $$0, $$1, false, false);
        }

        private static d a(wx $$0) {
            short $$1 = $$0.readUnsignedByte();
            boolean $$2 = ajb.a($$1);
            boolean $$3 = ajb.b($$1);
            return new d($$2, $$3);
        }

        private void b(wx $$0) {
            $$0.l(ajb.a(this.f, this.g));
        }

        @Override
        public aba<d> a() {
            return ahz.bS;
        }
    }

    public static class c
    extends ajb {
        public static final aao<wx, c> j = aay.a(c::b, c::a);

        public c(float $$0, float $$1, boolean $$2, boolean $$3) {
            super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
        }

        private static c a(wx $$0) {
            float $$1 = $$0.readFloat();
            float $$2 = $$0.readFloat();
            short $$3 = $$0.readUnsignedByte();
            boolean $$4 = ajb.a($$3);
            boolean $$5 = ajb.b($$3);
            return new c($$1, $$2, $$4, $$5);
        }

        private void b(wx $$0) {
            $$0.a(this.d);
            $$0.a(this.e);
            $$0.l(ajb.a(this.f, this.g));
        }

        @Override
        public aba<c> a() {
            return ahz.bR;
        }
    }

    public static class a
    extends ajb {
        public static final aao<wx, a> j = aay.a(a::b, a::a);

        public a(ftm $$0, boolean $$1, boolean $$2) {
            super($$0.g, $$0.h, $$0.i, 0.0f, 0.0f, $$1, $$2, true, false);
        }

        public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
            super($$0, $$1, $$2, 0.0f, 0.0f, $$3, $$4, true, false);
        }

        private static a a(wx $$0) {
            double $$1 = $$0.readDouble();
            double $$2 = $$0.readDouble();
            double $$3 = $$0.readDouble();
            short $$4 = $$0.readUnsignedByte();
            boolean $$5 = ajb.a($$4);
            boolean $$6 = ajb.b($$4);
            return new a($$1, $$2, $$3, $$5, $$6);
        }

        private void b(wx $$0) {
            $$0.a(this.a);
            $$0.a(this.b);
            $$0.a(this.c);
            $$0.l(ajb.a(this.f, this.g));
        }

        @Override
        public aba<a> a() {
            return ahz.bP;
        }
    }

    public static class b
    extends ajb {
        public static final aao<wx, b> j = aay.a(b::b, b::a);

        public b(ftm $$0, float $$1, float $$2, boolean $$3, boolean $$4) {
            super($$0.g, $$0.h, $$0.i, $$1, $$2, $$3, $$4, true, true);
        }

        public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
        }

        private static b a(wx $$0) {
            double $$1 = $$0.readDouble();
            double $$2 = $$0.readDouble();
            double $$3 = $$0.readDouble();
            float $$4 = $$0.readFloat();
            float $$5 = $$0.readFloat();
            short $$6 = $$0.readUnsignedByte();
            boolean $$7 = ajb.a($$6);
            boolean $$8 = ajb.b($$6);
            return new b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
        }

        private void b(wx $$0) {
            $$0.a(this.a);
            $$0.a(this.b);
            $$0.a(this.c);
            $$0.a(this.d);
            $$0.a(this.e);
            $$0.l(ajb.a(this.f, this.g));
        }

        @Override
        public aba<b> a() {
            return ahz.bQ;
        }
    }
}

