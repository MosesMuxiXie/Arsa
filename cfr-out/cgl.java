/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class cgl
extends Enum<cgl> {
    public static final /* enum */ cgl a = new cgl(cgl$a.c);
    public static final /* enum */ cgl b = new cgl(cgl$a.b);
    public static final /* enum */ cgl c = new cgl(cgl$a.c);
    public static final /* enum */ cgl d = new cgl(cgl$a.d);
    private final a e;
    private static final /* synthetic */ cgl[] f;

    public static cgl[] values() {
        return (cgl[])f.clone();
    }

    public static cgl valueOf(String $$0) {
        return Enum.valueOf(cgl.class, $$0);
    }

    private cgl(a $$0) {
        this.e = $$0;
    }

    public List<ftm> a(float $$0, float $$1) {
        return this.e.create($$0, $$1);
    }

    private static /* synthetic */ cgl[] a() {
        return new cgl[]{a, b, c, d};
    }

    static {
        f = cgl.a();
    }

    public static interface a {
        public static final List<ftm> a = List.of(ftm.c);
        public static final a b = ($$0, $$1) -> a;
        public static final a c = ($$0, $$1) -> List.of(new ftm(0.0, $$1, 0.0));
        public static final a d = ($$0, $$1) -> List.of(new ftm(0.0, (double)$$1 / 2.0, 0.0));

        public List<ftm> create(float var1, float var2);
    }
}

