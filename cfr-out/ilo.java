/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class ilo
extends ikz
implements ilb,
ils {
    private static final Logger g = LogUtils.getLogger();
    @Deprecated
    public static final amo d = amo.b("textures/atlas/blocks.png");
    @Deprecated
    public static final amo e = amo.b("textures/atlas/items.png");
    @Deprecated
    public static final amo f = amo.b("textures/atlas/particles.png");
    private List<ilp> h = List.of();
    private List<ilk.b> i = List.of();
    private Map<amo, ilp> j = Map.of();
    private @Nullable ilp k;
    private final amo l;
    private final int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private GpuTextureView[] r = new GpuTextureView[0];
    private @Nullable GpuBuffer s;

    public ilo(amo $$0) {
        this.l = $$0;
        this.m = RenderSystem.getDevice().getMaxTextureSize();
    }

    private void a(int $$0, int $$1, int $$2) {
        g.info("Created: {}x{}x{} {}-atlas", new Object[]{$$0, $$1, $$2, this.l});
        GpuDevice $$3 = RenderSystem.getDevice();
        this.close();
        this.a = $$3.createTexture(this.l::toString, 15, TextureFormat.RGBA8, $$0, $$1, 1, $$2 + 1);
        this.b = $$3.createTextureView(this.a);
        this.n = $$0;
        this.o = $$1;
        this.p = $$2;
        this.q = $$2 + 1;
        this.r = new GpuTextureView[this.q];
        for (int $$4 = 0; $$4 <= this.p; ++$$4) {
            this.r[$$4] = $$3.createTextureView(this.a, $$4, 1);
        }
    }

    public void a(ill.a $$0) {
        this.a($$0.a(), $$0.b(), $$0.c());
        this.g();
        this.c = RenderSystem.getSamplerCache().a(FilterMode.NEAREST);
        this.j = Map.copyOf($$0.e());
        this.k = this.j.get(ilf.c());
        if (this.k == null) {
            throw new IllegalStateException("Atlas '" + String.valueOf(this.l) + "' (" + this.j.size() + " sprites) has no missing texture sprite");
        }
        ArrayList<ilp> $$1 = new ArrayList<ilp>();
        ArrayList<ilk.b> $$2 = new ArrayList<ilk.b>();
        int $$3 = (int)$$0.e().values().stream().filter(ilp::i).count();
        int $$4 = bgj.e(ilk.a, RenderSystem.getDevice().getUniformOffsetAlignment());
        int $$5 = $$4 * this.q;
        ByteBuffer $$6 = MemoryUtil.memAlloc((int)($$3 * $$5));
        int $$7 = 0;
        for (ilp ilp2 : $$0.e().values()) {
            if (!ilp2.i()) continue;
            ilp2.a($$6, $$7 * $$5, this.p, this.n, this.o, $$4);
            ++$$7;
        }
        GpuBuffer $$9 = $$7 > 0 ? RenderSystem.getDevice().createBuffer(() -> String.valueOf(this.l) + " sprite UBOs", 128, $$6) : null;
        $$7 = 0;
        for (ilp $$10 : $$0.e().values()) {
            $$1.add($$10);
            if (!$$10.i() || $$9 == null) continue;
            ilk.b $$11 = $$10.a($$9.slice($$7 * $$5, $$5), $$4);
            ++$$7;
            if ($$11 == null) continue;
            $$2.add($$11);
        }
        this.s = $$9;
        this.h = $$1;
        this.i = List.copyOf($$2);
        this.l();
        if (w.H) {
            Path path = TextureUtil.getDebugTexturePath();
            try {
                Files.createDirectories(path, new FileAttribute[0]);
                this.a(this.l, path);
            }
            catch (Exception $$13) {
                g.warn("Failed to dump atlas contents to {}", (Object)path);
            }
        }
    }

    private void l() {
        GpuDevice $$02 = RenderSystem.getDevice();
        int $$1 = bgj.e(ilk.a, RenderSystem.getDevice().getUniformOffsetAlignment());
        int $$2 = $$1 * this.q;
        fzf $$3 = RenderSystem.getSamplerCache().a(FilterMode.NEAREST, true);
        List<ilp> $$4 = this.h.stream().filter($$0 -> !$$0.i()).toList();
        ArrayList<GpuTextureView[]> $$5 = new ArrayList<GpuTextureView[]>();
        ByteBuffer $$6 = MemoryUtil.memAlloc((int)($$4.size() * $$2));
        for (int $$7 = 0; $$7 < $$4.size(); ++$$7) {
            ilp $$8 = $$4.get($$7);
            $$8.a($$6, $$7 * $$2, this.p, this.n, this.o, $$1);
            GpuTexture $$9 = $$02.createTexture(() -> $$8.e().d().toString(), 5, TextureFormat.RGBA8, $$8.e().b(), $$8.e().c(), 1, this.q);
            GpuTextureView[] $$10 = new GpuTextureView[this.q];
            for (int $$11 = 0; $$11 <= this.p; ++$$11) {
                $$8.a($$9, $$11);
                $$10[$$11] = $$02.createTextureView($$9);
            }
            $$5.add($$10);
        }
        try (GpuBuffer $$12 = $$02.createBuffer(() -> "SpriteAnimationInfo", 128, $$6);){
            for (int $$13 = 0; $$13 < this.q; ++$$13) {
                try (RenderPass $$14 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Animate " + String.valueOf(this.l), this.r[$$13], OptionalInt.empty());){
                    $$14.setPipeline(hpa.aJ);
                    for (int $$15 = 0; $$15 < $$4.size(); ++$$15) {
                        $$14.bindTexture("Sprite", ((GpuTextureView[])$$5.get($$15))[$$13], $$3);
                        $$14.setUniform("SpriteAnimationInfo", $$12.slice($$15 * $$2 + $$13 * $$1, ilk.a));
                        $$14.draw(0, 6);
                    }
                    continue;
                }
            }
        }
        Iterator iterator = $$5.iterator();
        while (iterator.hasNext()) {
            GpuTextureView[] $$16;
            for (GpuTextureView $$17 : $$16 = (GpuTextureView[])iterator.next()) {
                $$17.close();
                $$17.texture().close();
            }
        }
        MemoryUtil.memFree((Buffer)$$6);
        this.m();
    }

    @Override
    public void a(amo $$02, Path $$1) throws IOException {
        String $$2 = $$02.c();
        TextureUtil.writeAsPNG($$1, $$2, this.a(), this.p, $$0 -> $$0);
        ilo.a($$1, $$2, this.j);
    }

    private static void a(Path $$0, String $$1, Map<amo, ilp> $$2) {
        Path $$3 = $$0.resolve($$1 + ".txt");
        try (BufferedWriter $$4 = Files.newBufferedWriter($$3, new OpenOption[0]);){
            for (Map.Entry $$5 : $$2.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList()) {
                ilp $$6 = (ilp)$$5.getValue();
                $$4.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", $$5.getKey(), $$6.a(), $$6.b(), $$6.e().b(), $$6.e().c()));
            }
        }
        catch (IOException $$7) {
            g.warn("Failed to write file {}", (Object)$$3, (Object)$$7);
        }
    }

    public void d() {
        if (this.a == null) {
            return;
        }
        for (ilk.b $$0 : this.i) {
            $$0.a();
        }
        this.m();
    }

    private void m() {
        if (this.i.stream().anyMatch(ilk.b::b)) {
            for (int $$0 = 0; $$0 <= this.p; ++$$0) {
                try (RenderPass $$1 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Animate " + String.valueOf(this.l), this.r[$$0], OptionalInt.empty());){
                    for (ilk.b $$2 : this.i) {
                        if (!$$2.b()) continue;
                        $$2.a($$1, $$2.a($$0));
                    }
                    continue;
                }
            }
        }
    }

    @Override
    public void e() {
        this.d();
    }

    public ilp a(amo $$0) {
        ilp $$1 = this.j.getOrDefault($$0, this.k);
        if ($$1 == null) {
            throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
        }
        return $$1;
    }

    public ilp f() {
        return Objects.requireNonNull(this.k, "Atlas not initialized");
    }

    public void g() {
        this.h.forEach(ilp::close);
        this.h = List.of();
        this.i = List.of();
        this.j = Map.of();
        this.k = null;
    }

    @Override
    public void close() {
        super.close();
        for (GpuTextureView $$0 : this.r) {
            $$0.close();
        }
        for (ilk.b $$1 : this.i) {
            $$1.close();
        }
        if (this.s != null) {
            this.s.close();
            this.s = null;
        }
    }

    public amo h() {
        return this.l;
    }

    public int i() {
        return this.m;
    }

    int j() {
        return this.n;
    }

    int k() {
        return this.o;
    }
}

