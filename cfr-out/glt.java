/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glt
implements gly {
    private static final amo a = amo.b("system");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        GpuDevice $$4 = RenderSystem.getDevice();
        $$0.a(a, List.of(String.format(Locale.ROOT, "Java: %s", System.getProperty("java.version")), String.format(Locale.ROOT, "CPU: %s", GLX._getCpuInfo()), String.format(Locale.ROOT, "Display: %dx%d (%s)", gfj.V().aR().k(), gfj.V().aR().l(), $$4.getVendor()), $$4.getRenderer(), String.format(Locale.ROOT, "%s %s", $$4.getBackendName(), $$4.getVersion())));
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }
}

