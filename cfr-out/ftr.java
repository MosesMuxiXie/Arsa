/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface ftr {
    public static ftr a() {
        return ftw.a.a;
    }

    public static ftr b() {
        return ftw.a.b;
    }

    public static ftr a(cgk $$0) {
        cgk cgk2 = $$0;
        Objects.requireNonNull(cgk2);
        cgk cgk3 = cgk2;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{dgi.class}, (Object)cgk3, n2)) {
            case 0 -> {
                dgi $$1 = (dgi)cgk3;
                if (dgi.b($$1.ao())) {
                    yield new fua($$1, false);
                }
                yield new ftw($$0, false, false);
            }
            default -> new ftw($$0, false, false);
        };
    }

    public static ftr a(cgk $$0, boolean $$1) {
        return new ftw($$0, $$1, false);
    }

    public static ftr a(@Nullable ddm $$0) {
        dlt dlt2;
        boolean bl2 = $$0 != null ? $$0.cy() : false;
        double d2 = $$0 != null ? $$0.dR() : -1.7976931348623157E308;
        if ($$0 instanceof chl) {
            ddm $$1 = $$0;
            dlt2 = $$1.fx();
        } else {
            dlt2 = dlt.l;
        }
        return new ftw(bl2, true, d2, dlt2, false, $$0);
    }

    public static ftr a(@Nullable cgk $$0, double $$1) {
        dlt dlt2;
        boolean bl2 = $$0 != null ? $$0.cy() : false;
        double d2 = $$0 != null ? $$1 : -1.7976931348623157E308;
        if ($$0 instanceof chl) {
            chl $$2 = (chl)$$0;
            dlt2 = $$2.fx();
        } else {
            dlt2 = dlt.l;
        }
        return new ftw(bl2, true, d2, dlt2, false, $$0);
    }

    public boolean c();

    public boolean a(fug var1, is var2, boolean var3);

    public boolean a(dlp var1);

    public boolean d();

    public boolean a(flb var1, flb var2);

    public fug a(eoh var1, dvx var2, is var3);

    default public boolean e() {
        return false;
    }
}

