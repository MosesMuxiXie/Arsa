/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class dcf
extends Enum<dcf> {
    public static final /* enum */ dcf a = new dcf(0, bda.EZ, bda.Fh);
    public static final /* enum */ dcf b = new dcf(40, bda.EY, bda.Fi);
    public static final /* enum */ dcf c = new dcf(80, bda.Fa, bda.Fi);
    private static final dcf[] d;
    private final int e;
    private final bcz f;
    private final bcz g;
    private static final /* synthetic */ dcf[] h;

    public static dcf[] values() {
        return (dcf[])h.clone();
    }

    public static dcf valueOf(String $$0) {
        return Enum.valueOf(dcf.class, $$0);
    }

    private dcf(int $$0, bcz $$1, bcz $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public int a() {
        return this.e;
    }

    public bcz b() {
        return this.f;
    }

    public bcz c() {
        return this.g;
    }

    public static dcf a(int $$0) {
        for (dcf $$1 : d) {
            if ($$0 < $$1.e) continue;
            return $$1;
        }
        return a;
    }

    public boolean d() {
        return this == c;
    }

    private static /* synthetic */ dcf[] e() {
        return new dcf[]{a, b, c};
    }

    static {
        h = dcf.e();
        d = bhs.a(dcf.values(), (? super T $$02) -> Arrays.sort($$02, ($$0, $$1) -> Integer.compare($$1.e, $$0.e)));
    }
}

