/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class fwc {
    private static final List<String> a = List.of("i3-1000g1", "i3-1000g4", "i3-1000ng4", "i3-1005g1", "i3-l13g4", "i5-1030g4", "i5-1030g7", "i5-1030ng7", "i5-1034g1", "i5-1035g1", "i5-1035g4", "i5-1035g7", "i5-1038ng7", "i5-l16g7", "i7-1060g7", "i7-1060ng7", "i7-1065g7", "i7-1068g7", "i7-1068ng7");
    private static final List<String> b = List.of("x6211e", "x6212re", "x6214re", "x6413e", "x6414re", "x6416re", "x6425e", "x6425re", "x6427fe");
    private static final List<String> c = List.of("j6412", "j6413", "n4500", "n4505", "n5095", "n5095a", "n5100", "n5105", "n6210", "n6211");
    private static final List<String> d = List.of("6805", "j6426", "n6415", "n6000", "n6005");
    private static @Nullable fwc e;
    private final WeakReference<GpuDevice> f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    private fwc(GpuDevice $$0) {
        this.f = new WeakReference<GpuDevice>($$0);
        this.g = fwc.b($$0);
        this.h = fwc.c($$0);
        this.i = fwc.d($$0);
    }

    public static fwc a(GpuDevice $$0) {
        fwc $$1 = e;
        if ($$1 == null || $$1.f.get() != $$0) {
            e = $$1 = new fwc($$0);
        }
        return $$1;
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.h;
    }

    public boolean c() {
        return this.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean b(GpuDevice $$0) {
        String $$1 = GLX._getCpuInfo().toLowerCase(Locale.ROOT);
        String $$2 = $$0.getRenderer().toLowerCase(Locale.ROOT);
        if (!$$1.contains("intel")) return false;
        if (!$$2.contains("intel")) return false;
        if ($$2.contains("mesa")) {
            return false;
        }
        if ($$2.endsWith("gen11")) {
            return true;
        }
        if (!$$2.contains("uhd graphics") && !$$2.contains("iris")) {
            return false;
        }
        if ($$1.contains("atom")) {
            if (b.stream().anyMatch($$1::contains)) return true;
        }
        if ($$1.contains("celeron")) {
            if (c.stream().anyMatch($$1::contains)) return true;
        }
        if ($$1.contains("pentium")) {
            if (d.stream().anyMatch($$1::contains)) return true;
        }
        if (!a.stream().anyMatch($$1::contains)) return false;
        return true;
    }

    private static boolean c(GpuDevice $$0) {
        boolean $$1 = bhs.n() == bhs.a.c && bhs.o();
        return $$1 || $$0.getRenderer().startsWith("D3D12");
    }

    private static boolean d(GpuDevice $$0) {
        return $$0.getRenderer().contains("AMD");
    }
}

