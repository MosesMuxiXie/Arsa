/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.OptionalInt;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class hoj
implements AutoCloseable {
    public static final int a = 0xF000F0;
    public static final int b = 0xF00000;
    public static final int c = 240;
    private static final int d = 16;
    private static final int e = new Std140SizeCalculator().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().putVec3().putVec3().get();
    private final GpuTexture f;
    private final GpuTextureView g;
    private boolean h;
    private float i;
    private final hob j;
    private final gfj k;
    private final hol l;
    private final bgr m = bgr.a();

    public hoj(hob $$0, gfj $$1) {
        this.j = $$0;
        this.k = $$1;
        GpuDevice $$2 = RenderSystem.getDevice();
        this.f = $$2.createTexture("Light Texture", 12, TextureFormat.RGBA8, 16, 16, 1, 1);
        this.g = $$2.createTextureView(this.f);
        $$2.createCommandEncoder().clearColorTexture(this.f, -1);
        this.l = new hol(() -> "Lightmap UBO", 130, e);
    }

    public GpuTextureView a() {
        return this.g;
    }

    @Override
    public void close() {
        this.f.close();
        this.g.close();
        this.l.close();
    }

    public void b() {
        this.i += (this.m.i() - this.m.i()) * this.m.i() * this.m.i() * 0.1f;
        this.i *= 0.9f;
        this.h = true;
    }

    private float a(chl $$0, float $$1, float $$2) {
        float $$3 = 0.45f * $$1;
        return Math.max(0.0f, bgj.b((double)(((float)$$0.at - $$2) * (float)Math.PI * 0.025f)) * $$3);
    }

    public void a(float $$0) {
        float $$17;
        Vector3f $$10;
        if (!this.h) {
            return;
        }
        this.h = false;
        bzm $$1 = bzl.a();
        $$1.a("lightTex");
        hif $$2 = this.k.r;
        if ($$2 == null) {
            return;
        }
        ger $$3 = this.k.i.p();
        int $$4 = $$3.k().a(ceg.r, $$0);
        float $$5 = $$2.F_().l();
        float $$6 = $$3.k().a(ceg.s, $$0).floatValue();
        hnz $$7 = $$2.e();
        if ($$7 != null) {
            Vector3f $$8 = new Vector3f(0.99f, 1.12f, 1.0f);
            if (!this.k.k.b().b().booleanValue()) {
                float $$9 = $$7.a($$0);
                $$6 = this.k.j.k().d() ? ($$6 += $$9 / 3.0f) : ($$6 += $$9);
            }
        } else {
            $$10 = new Vector3f(1.0f, 1.0f, 1.0f);
        }
        float $$11 = this.k.k.aD().b().floatValue();
        float $$12 = this.k.s.a(cfo.G, $$0) * $$11;
        float $$13 = this.a(this.k.s, $$12, $$0) * $$11;
        float $$14 = this.k.s.L();
        if (this.k.s.d(cfo.p)) {
            float $$15 = hob.a(this.k.s, $$0);
        } else if ($$14 > 0.0f && this.k.s.d(cfo.C)) {
            float $$16 = $$14;
        } else {
            $$17 = 0.0f;
        }
        float $$18 = this.i + 1.5f;
        float $$19 = this.k.k.aH().b().floatValue();
        CommandEncoder $$20 = RenderSystem.getDevice().createCommandEncoder();
        try (GpuBuffer.MappedView $$21 = $$20.mapBuffer(this.l.b(), false, true);){
            Std140Builder.intoBuffer($$21.data()).putFloat($$5).putFloat($$6).putFloat($$18).putFloat($$17).putFloat($$13).putFloat(this.j.c($$0)).putFloat(Math.max(0.0f, $$19 - $$12)).putVec3((Vector3fc)bel.k($$4)).putVec3((Vector3fc)$$10);
        }
        try (RenderPass $$22 = $$20.createRenderPass(() -> "Update light", this.g, OptionalInt.empty());){
            $$22.setPipeline(hpa.aH);
            RenderSystem.bindDefaultUniforms($$22);
            $$22.setUniform("LightmapInfo", this.l.b());
            $$22.draw(0, 3);
        }
        this.l.c();
        $$1.c();
    }

    public static float a(esh $$0, int $$1) {
        return hoj.a($$0.l(), $$1);
    }

    public static float a(float $$0, int $$1) {
        float $$2 = (float)$$1 / 15.0f;
        float $$3 = $$2 / (4.0f - 3.0f * $$2);
        return bgj.h($$0, $$3, 1.0f);
    }

    public static int a(int $$0, int $$1) {
        return $$0 << 4 | $$1 << 20;
    }

    public static int a(int $$0) {
        return $$0 >>> 4 & 0xF;
    }

    public static int b(int $$0) {
        return $$0 >>> 20 & 0xF;
    }

    public static int b(int $$0, int $$1) {
        if ($$1 == 0) {
            return $$0;
        }
        int $$2 = Math.max(hoj.b($$0), $$1);
        int $$3 = Math.max(hoj.a($$0), $$1);
        return hoj.a($$3, $$2);
    }
}

