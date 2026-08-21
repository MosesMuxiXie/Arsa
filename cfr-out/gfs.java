/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gfs {
    private static final Logger b = LogUtils.getLogger();
    public static final String a = "screenshots";

    public static void a(File $$0, fxt $$1, Consumer<yh> $$2) {
        gfs.a($$0, null, $$1, 1, $$2);
    }

    public static void a(File $$0, @Nullable String $$1, fxt $$2, int $$32, Consumer<yh> $$4) {
        gfs.a($$2, $$32, (fyh $$3) -> {
            File $$6;
            File $$4 = new File($$0, a);
            $$4.mkdir();
            if ($$1 == null) {
                File $$5 = gfs.a($$4);
            } else {
                $$6 = new File($$4, $$1);
            }
            bhs.i().execute(() -> {
                try (fyh fyh2 = $$3;){
                    $$3.a($$6);
                    yw $$3 = yh.b($$6.getName()).a(l.t).a($$1 -> $$1.a(new yf.e($$6.getAbsoluteFile())));
                    $$4.accept(yh.a("screenshot.success", $$3));
                }
                catch (Exception $$4) {
                    b.warn("Couldn't save screenshot", (Throwable)$$4);
                    $$4.accept(yh.a("screenshot.failure", new Object[]{$$4.getMessage()}));
                }
            });
        });
    }

    public static void a(fxt $$0, Consumer<fyh> $$1) {
        gfs.a($$0, 1, $$1);
    }

    public static void a(fxt $$0, int $$1, Consumer<fyh> $$2) {
        int $$3 = $$0.c;
        int $$4 = $$0.d;
        GpuTexture $$5 = $$0.c();
        if ($$5 == null) {
            throw new IllegalStateException("Tried to capture screenshot of an incomplete framebuffer");
        }
        if ($$3 % $$1 != 0 || $$4 % $$1 != 0) {
            throw new IllegalArgumentException("Image size is not divisible by downscale factor");
        }
        GpuBuffer $$6 = RenderSystem.getDevice().createBuffer(() -> "Screenshot buffer", 9, (long)$$3 * (long)$$4 * (long)$$5.getFormat().pixelSize());
        CommandEncoder $$7 = RenderSystem.getDevice().createCommandEncoder();
        RenderSystem.getDevice().createCommandEncoder().copyTextureToBuffer($$5, $$6, 0L, () -> {
            try (GpuBuffer.MappedView $$7 = $$7.mapBuffer($$6, true, false);){
                int $$8 = $$4 / $$1;
                int $$9 = $$3 / $$1;
                fyh $$10 = new fyh($$9, $$8, false);
                for (int $$11 = 0; $$11 < $$8; ++$$11) {
                    for (int $$12 = 0; $$12 < $$9; ++$$12) {
                        if ($$1 == 1) {
                            int $$13 = $$7.data().getInt(($$12 + $$11 * $$3) * $$5.getFormat().pixelSize());
                            $$10.a($$12, $$4 - $$11 - 1, $$13 | 0xFF000000);
                            continue;
                        }
                        int $$14 = 0;
                        int $$15 = 0;
                        int $$16 = 0;
                        for (int $$17 = 0; $$17 < $$1; ++$$17) {
                            for (int $$18 = 0; $$18 < $$1; ++$$18) {
                                int $$19 = $$7.data().getInt(($$12 * $$1 + $$17 + ($$11 * $$1 + $$18) * $$3) * $$5.getFormat().pixelSize());
                                $$14 += bel.c($$19);
                                $$15 += bel.d($$19);
                                $$16 += bel.e($$19);
                            }
                        }
                        int $$20 = $$1 * $$1;
                        $$10.a($$12, $$8 - $$11 - 1, bel.b(255, $$14 / $$20, $$15 / $$20, $$16 / $$20));
                    }
                }
                $$2.accept($$10);
            }
            $$6.close();
        }, 0);
    }

    private static File a(File $$0) {
        String $$1 = bhs.f();
        int $$2 = 1;
        File $$3;
        while (($$3 = new File($$0, $$1 + (String)($$2 == 1 ? "" : "_" + $$2) + ".png")).exists()) {
            ++$$2;
        }
        return $$3;
    }
}

