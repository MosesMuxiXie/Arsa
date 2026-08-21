/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public final class goe
extends Enum<goe>
implements fwp {
    public static final /* enum */ goe a = new goe(() -> goe.a(5, 8, ($$0, $$1) -> -1));
    public static final /* enum */ goe b = new goe(() -> {
        int $$02 = 5;
        int $$12 = 8;
        return goe.a(5, 8, ($$0, $$1) -> {
            boolean $$2 = $$0 == 0 || $$0 + 1 == 5 || $$1 == 0 || $$1 + 1 == 8;
            return $$2 ? -1 : 0;
        });
    });
    final fyh c;
    private static final /* synthetic */ goe[] d;

    public static goe[] values() {
        return (goe[])d.clone();
    }

    public static goe valueOf(String $$0) {
        return Enum.valueOf(goe.class, $$0);
    }

    private static fyh a(int $$0, int $$1, a $$2) {
        fyh $$3 = new fyh(fyh.a.a, $$0, $$1, false);
        for (int $$4 = 0; $$4 < $$1; ++$$4) {
            for (int $$5 = 0; $$5 < $$0; ++$$5) {
                $$3.b($$5, $$4, $$2.getColor($$5, $$4));
            }
        }
        $$3.g();
        return $$3;
    }

    private goe(Supplier<fyh> $$0) {
        this.c = $$0.get();
    }

    @Override
    public float getAdvance() {
        return this.c.a() + 1;
    }

    public @Nullable gob a(gnu $$0) {
        return $$0.a(this, new fwo(){

            @Override
            public int a() {
                return goe.this.c.a();
            }

            @Override
            public int b() {
                return goe.this.c.b();
            }

            @Override
            public float d() {
                return 1.0f;
            }

            @Override
            public void a(int $$0, int $$1, GpuTexture $$2) {
                RenderSystem.getDevice().createCommandEncoder().writeToTexture($$2, goe.this.c, 0, 0, $$0, $$1, goe.this.c.a(), goe.this.c.b(), 0, 0);
            }

            @Override
            public boolean c() {
                return true;
            }
        });
    }

    private static /* synthetic */ goe[] e() {
        return new goe[]{a, b};
    }

    static {
        d = goe.e();
    }

    @FunctionalInterface
    static interface a {
        public int getColor(int var1, int var2);
    }
}

