/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;

public class ila
extends ilh {
    private static final String[] d = new String[]{"_1.png", "_3.png", "_5.png", "_4.png", "_0.png", "_2.png"};

    public ila(amo $$0) {
        super($$0);
    }

    @Override
    public ilq a(baz $$0) throws IOException {
        amo $$1 = this.d();
        try (ilq $$2 = ilq.a($$0, $$1.g(d[0]));){
            int $$3 = $$2.d().a();
            int $$4 = $$2.d().b();
            fyh $$5 = new fyh($$3, $$4 * 6, false);
            $$2.d().a($$5, 0, 0, 0, 0, $$3, $$4, false, true);
            for (int $$6 = 1; $$6 < 6; ++$$6) {
                try (ilq $$7 = ilq.a($$0, $$1.g(d[$$6]));){
                    if ($$7.d().a() != $$3 || $$7.d().b() != $$4) {
                        throw new IOException("Image dimensions of cubemap '" + String.valueOf($$1) + "' sides do not match: part 0 is " + $$3 + "x" + $$4 + ", but part " + $$6 + " is " + $$7.d().a() + "x" + $$7.d().b());
                    }
                    $$7.d().a($$5, 0, 0, 0, $$6 * $$4, $$3, $$4, false, true);
                    continue;
                }
            }
            ilq ilq2 = new ilq($$5, new inj(true, false, ile.b, 0.0f));
            return ilq2;
        }
    }

    @Override
    protected void a(fyh $$0) {
        GpuDevice $$1 = RenderSystem.getDevice();
        int $$2 = $$0.a();
        int $$3 = $$0.b() / 6;
        this.close();
        this.a = $$1.createTexture(this.d()::toString, 21, TextureFormat.RGBA8, $$2, $$3, 6, 1);
        this.b = $$1.createTextureView(this.a);
        for (int $$4 = 0; $$4 < 6; ++$$4) {
            $$1.createCommandEncoder().writeToTexture(this.a, $$0, 0, $$4, 0, 0, $$2, $$3, 0, $$3 * $$4);
        }
    }
}

