/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public final class gfb
extends Enum<gfb>
implements bhh {
    public static final /* enum */ gfb a = new gfb("fast", "options.graphics.fast");
    public static final /* enum */ gfb b = new gfb("fancy", "options.graphics.fancy");
    public static final /* enum */ gfb c = new gfb("fabulous", "options.graphics.fabulous");
    public static final /* enum */ gfb d = new gfb("custom", "options.graphics.custom");
    private final String f;
    private final String g;
    public static final Codec<gfb> e;
    private static final /* synthetic */ gfb[] h;

    public static gfb[] values() {
        return (gfb[])h.clone();
    }

    public static gfb valueOf(String $$0) {
        return Enum.valueOf(gfb.class, $$0);
    }

    private gfb(String $$0, String $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    @Override
    public String c() {
        return this.f;
    }

    public String a() {
        return this.g;
    }

    public void a(gfj $$0) {
        gwc $$1 = $$0.x instanceof gwc ? (gwc)$$0.x : null;
        GpuDevice $$2 = RenderSystem.getDevice();
        switch (this.ordinal()) {
            case 0: {
                int $$3 = 8;
                this.a($$1, $$0.k.P(), 1);
                this.a($$1, $$0.k.e(), 8);
                this.a($$1, $$0.k.s(), gfq.a);
                this.a($$1, $$0.k.f(), 6);
                this.a($$1, $$0.k.q(), false);
                this.a($$1, $$0.k.k(), gev.b);
                this.a($$1, $$0.k.aJ(), awx.b);
                this.a($$1, $$0.k.K(), 2);
                this.a($$1, $$0.k.ab(), false);
                this.a($$1, $$0.k.g(), 0.75);
                this.a($$1, $$0.k.w(), 2);
                this.a($$1, $$0.k.l(), 32);
                this.a($$1, $$0.k.n(), false);
                this.a($$1, $$0.k.p(), false);
                this.a($$1, $$0.k.m(), 5);
                this.a($$1, $$0.k.L(), 1);
                this.a($$1, $$0.k.N(), gfv.a);
                break;
            }
            case 1: {
                int $$4 = 16;
                this.a($$1, $$0.k.P(), 2);
                this.a($$1, $$0.k.e(), 16);
                this.a($$1, $$0.k.s(), gfq.b);
                this.a($$1, $$0.k.f(), 12);
                this.a($$1, $$0.k.q(), true);
                this.a($$1, $$0.k.k(), gev.c);
                this.a($$1, $$0.k.aJ(), awx.a);
                this.a($$1, $$0.k.K(), 4);
                this.a($$1, $$0.k.ab(), true);
                this.a($$1, $$0.k.g(), 1.0);
                this.a($$1, $$0.k.w(), 5);
                this.a($$1, $$0.k.l(), 64);
                this.a($$1, $$0.k.n(), true);
                this.a($$1, $$0.k.p(), false);
                this.a($$1, $$0.k.m(), 10);
                this.a($$1, $$0.k.L(), 1);
                this.a($$1, $$0.k.N(), gfv.b);
                break;
            }
            case 2: {
                int $$5 = 32;
                this.a($$1, $$0.k.P(), 2);
                this.a($$1, $$0.k.e(), 32);
                this.a($$1, $$0.k.s(), gfq.b);
                this.a($$1, $$0.k.f(), 12);
                this.a($$1, $$0.k.q(), true);
                this.a($$1, $$0.k.k(), gev.c);
                this.a($$1, $$0.k.aJ(), awx.a);
                this.a($$1, $$0.k.K(), 4);
                this.a($$1, $$0.k.ab(), true);
                this.a($$1, $$0.k.g(), 1.25);
                this.a($$1, $$0.k.w(), 5);
                this.a($$1, $$0.k.l(), 128);
                this.a($$1, $$0.k.n(), true);
                this.a($$1, $$0.k.p(), bhs.n() != bhs.a.d);
                this.a($$1, $$0.k.m(), 10);
                this.a($$1, $$0.k.L(), 2);
                if (fwc.a($$2).c()) {
                    this.a($$1, $$0.k.N(), gfv.b);
                    break;
                }
                this.a($$1, $$0.k.N(), gfv.c);
            }
        }
    }

    <T> void a(@Nullable gwc $$0, gfn<T> $$1, T $$2) {
        if ($$1.b() != $$2) {
            $$1.a($$2);
            if ($$0 != null) {
                $$0.a($$1);
            }
        }
    }

    private static /* synthetic */ gfb[] b() {
        return new gfb[]{a, b, c, d};
    }

    static {
        h = gfb.b();
        e = bhh.a(gfb::values);
    }
}

