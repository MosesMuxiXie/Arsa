/*
 * Decompiled with CFR 0.152.
 */
public abstract class erd<T> {
    private static final eqw.a b = erc::a;
    private static final eqw.a c = equ::a;
    private static final eqw.a d = eqo::a;
    static final eqk e = new eqk.b(b, 0);
    static final eqk f = new eqk.b(c, 1);
    static final eqk g = new eqk.b(c, 2);
    static final eqk h = new eqk.b(c, 3);
    static final eqk i = new eqk.b(c, 4);
    static final eqk j = new eqk.b(d, 5);
    static final eqk k = new eqk.b(d, 6);
    static final eqk l = new eqk.b(d, 7);
    static final eqk m = new eqk.b(d, 8);
    private final ji<T> n;
    private final eqn<T> o;
    protected final int a;
    private final int p;
    private final int q;

    erd(ji<T> $$0, int $$1) {
        this.n = $$0;
        this.o = new eqn<T>($$0);
        this.a = erd.c($$0.d());
        this.p = $$1;
        this.q = 1 << $$1 * 3;
    }

    public static <T> erd<T> a(ji<T> $$0) {
        return new erd<T>((ji)$$0, 4){

            @Override
            public eqk a(int $$0) {
                return switch ($$0) {
                    case 0 -> e;
                    case 1, 2, 3, 4 -> i;
                    case 5 -> j;
                    case 6 -> k;
                    case 7 -> l;
                    case 8 -> m;
                    default -> new eqk.a(this.a, $$0);
                };
            }
        };
    }

    public static <T> erd<T> b(ji<T> $$0) {
        return new erd<T>((ji)$$0, 2){

            @Override
            public eqk a(int $$0) {
                return switch ($$0) {
                    case 0 -> e;
                    case 1 -> f;
                    case 2 -> g;
                    case 3 -> h;
                    default -> new eqk.a(this.a, $$0);
                };
            }
        };
    }

    public int a() {
        return this.q;
    }

    public int a(int $$0, int $$1, int $$2) {
        return ($$1 << this.p | $$2) << this.p | $$0;
    }

    public ji<T> b() {
        return this.n;
    }

    public eqn<T> c() {
        return this.o;
    }

    protected abstract eqk a(int var1);

    protected eqk b(int $$0) {
        int $$1 = erd.c($$0);
        return this.a($$1);
    }

    private static int c(int $$0) {
        return bgj.f($$0);
    }
}

