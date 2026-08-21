/*
 * Decompiled with CFR 0.152.
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;

public interface gvi {
    public static gvi a(bfr $$0) {
        return new gvh($$0);
    }

    public static gvi a(djs $$0) {
        djs djs2 = $$0;
        Objects.requireNonNull(djs2);
        djs djs3 = djs2;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{djr.class, gvf.a.class}, (Object)djs3, n2)) {
            case 0 -> {
                djr $$1 = (djr)djs3;
                yield new gvg($$1.a());
            }
            case 1 -> {
                gvf.a $$2 = (gvf.a)djs3;
                yield new gvf($$2);
            }
            default -> throw new IllegalArgumentException("Unknown TooltipComponent");
        };
    }

    public int a(gio var1);

    public int b(gio var1);

    default public boolean a() {
        return false;
    }

    default public void a(gir $$0, gio $$1, int $$2, int $$3) {
    }

    default public void a(gio $$0, int $$1, int $$2, int $$3, int $$4, gir $$5) {
    }
}

