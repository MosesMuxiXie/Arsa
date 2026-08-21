/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ilk
implements ilm.a,
AutoCloseable {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = new Std140SizeCalculator().putMat4f().putMat4f().putFloat().putFloat().putInt().get();
    final amo c;
    final int d;
    final int e;
    private final fyh f;
    fyh[] g;
    private final @Nullable a h;
    private final List<azy.a<?>> i;
    private final ile j;
    private final float k;

    public ilk(amo $$0, ina $$1, fyh $$2) {
        this($$0, $$1, $$2, Optional.empty(), List.of(), Optional.empty());
    }

    public ilk(amo $$0, ina $$1, fyh $$22, Optional<imz> $$3, List<azy.a<?>> $$4, Optional<inj> $$5) {
        this.c = $$0;
        this.d = $$1.a();
        this.e = $$1.b();
        this.i = $$4;
        this.h = $$3.map($$2 -> this.a($$1, $$22.a(), $$22.b(), (imz)$$2)).orElse(null);
        this.f = $$22;
        this.g = new fyh[]{this.f};
        this.j = $$5.map(inj::c).orElse(ile.a);
        this.k = $$5.map(inj::d).orElse(Float.valueOf(0.0f)).floatValue();
    }

    public void a(int $$0) {
        try {
            this.g = ild.a(this.c, this.g, $$0, this.j, this.k);
        }
        catch (Throwable $$1) {
            m $$2 = m.a($$1, "Generating mipmaps for frame");
            n $$3 = $$2.a("Frame being iterated");
            $$3.a("Sprite name", this.c);
            $$3.a("Sprite size", () -> this.d + " x " + this.e);
            $$3.a("Sprite frames", () -> this.f() + " frames");
            $$3.a("Mipmap levels", $$0);
            $$3.a("Original image size", () -> this.f.a() + "x" + this.f.b());
            throw new v($$2);
        }
    }

    private int f() {
        return this.h != null ? this.h.b.size() : 1;
    }

    public boolean a() {
        return this.f() > 1;
    }

    private @Nullable a a(ina $$0, int $$1, int $$2, imz $$3) {
        ArrayList<c> $$11;
        int $$4 = $$1 / $$0.a();
        int $$5 = $$2 / $$0.b();
        int $$6 = $$4 * $$5;
        int $$7 = $$3.d();
        if ($$3.a().isEmpty()) {
            ArrayList<c> $$8 = new ArrayList<c>($$6);
            for (int $$9 = 0; $$9 < $$6; ++$$9) {
                $$8.add(new c($$9, $$7));
            }
        } else {
            List<imy> $$10 = $$3.a().get();
            $$11 = new ArrayList<c>($$10.size());
            for (imy $$12 : $$10) {
                $$11.add(new c($$12.a(), $$12.a($$7)));
            }
            int $$13 = 0;
            IntOpenHashSet $$14 = new IntOpenHashSet();
            Iterator $$15 = $$11.iterator();
            while ($$15.hasNext()) {
                c $$16 = (c)$$15.next();
                boolean $$17 = true;
                if ($$16.b <= 0) {
                    b.warn("Invalid frame duration on sprite {} frame {}: {}", new Object[]{this.c, $$13, $$16.b});
                    $$17 = false;
                }
                if ($$16.a < 0 || $$16.a >= $$6) {
                    b.warn("Invalid frame index on sprite {} frame {}: {}", new Object[]{this.c, $$13, $$16.a});
                    $$17 = false;
                }
                if ($$17) {
                    $$14.add($$16.a);
                } else {
                    $$15.remove();
                }
                ++$$13;
            }
            int[] $$18 = IntStream.range(0, $$6).filter(arg_0 -> ilk.a((IntSet)$$14, arg_0)).toArray();
            if ($$18.length > 0) {
                b.warn("Unused frames in sprite {}: {}", (Object)this.c, (Object)Arrays.toString($$18));
            }
        }
        if ($$11.size() <= 1) {
            return null;
        }
        return new a(List.copyOf($$11), $$4, $$3.e());
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public amo d() {
        return this.c;
    }

    public IntStream e() {
        return this.h != null ? this.h.a() : IntStream.of(1);
    }

    public @Nullable b a(GpuBufferSlice $$0, int $$1) {
        return this.h != null ? this.h.a($$0, $$1) : null;
    }

    public <T> Optional<T> a(azy<T> $$0) {
        for (azy.a<?> $$1 : this.i) {
            Optional<T> $$2 = $$1.a($$0);
            if (!$$2.isPresent()) continue;
            return $$2;
        }
        return Optional.empty();
    }

    @Override
    public void close() {
        for (fyh $$0 : this.g) {
            $$0.close();
        }
    }

    public String toString() {
        return "SpriteContents{name=" + String.valueOf(this.c) + ", frameCount=" + this.f() + ", height=" + this.e + ", width=" + this.d + "}";
    }

    public boolean a(int $$0, int $$1, int $$2) {
        int $$3 = $$1;
        int $$4 = $$2;
        if (this.h != null) {
            $$3 += this.h.a($$0) * this.d;
            $$4 += this.h.b($$0) * this.e;
        }
        return bel.b(this.f.a($$3, $$4)) == 0;
    }

    public void a(GpuTexture $$0, int $$1) {
        RenderSystem.getDevice().createCommandEncoder().writeToTexture($$0, this.g[$$1], $$1, 0, 0, 0, this.d >> $$1, this.e >> $$1, 0, 0);
    }

    private static /* synthetic */ boolean a(IntSet $$0, int $$1) {
        return !$$0.contains($$1);
    }

    class a {
        final List<c> b;
        private final int c;
        final boolean d;

        a(List<c> $$0, int $$1, boolean $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        int a(int $$0) {
            return $$0 % this.c;
        }

        int b(int $$0) {
            return $$0 / this.c;
        }

        public b a(GpuBufferSlice $$0, int $$1) {
            GpuDevice $$2 = RenderSystem.getDevice();
            Int2ObjectOpenHashMap $$3 = new Int2ObjectOpenHashMap();
            GpuBufferSlice[] $$4 = new GpuBufferSlice[ilk.this.g.length];
            for (int $$5 : this.a().toArray()) {
                GpuTexture $$6 = $$2.createTexture(() -> String.valueOf(ilk.this.c) + " animation frame " + $$5, 5, TextureFormat.RGBA8, ilk.this.d, ilk.this.e, 1, ilk.this.g.length + 1);
                int $$7 = this.a($$5) * ilk.this.d;
                int $$8 = this.b($$5) * ilk.this.e;
                for (int $$9 = 0; $$9 < ilk.this.g.length; ++$$9) {
                    RenderSystem.getDevice().createCommandEncoder().writeToTexture($$6, ilk.this.g[$$9], $$9, 0, 0, 0, ilk.this.d >> $$9, ilk.this.e >> $$9, $$7 >> $$9, $$8 >> $$9);
                }
                $$3.put($$5, (Object)RenderSystem.getDevice().createTextureView($$6));
            }
            for (int $$10 = 0; $$10 < ilk.this.g.length; ++$$10) {
                $$4[$$10] = $$0.slice($$10 * $$1, $$1);
            }
            return new b(ilk.this, this, (Int2ObjectMap<GpuTextureView>)$$3, $$4);
        }

        public IntStream a() {
            return this.b.stream().mapToInt($$0 -> $$0.a).distinct();
        }
    }

    static final class c
    extends Record {
        final int a;
        final int b;

        c(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "index;time", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "index;time", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "index;time", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public class b
    implements AutoCloseable {
        private int a;
        private int b;
        private final a c;
        private final Int2ObjectMap<GpuTextureView> d;
        private final GpuBufferSlice[] e;
        private boolean f = true;

        b(ilk $$0, a $$1, Int2ObjectMap<GpuTextureView> $$2, GpuBufferSlice[] $$3) {
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public void a() {
            ++this.b;
            this.f = false;
            c $$0 = this.c.b.get(this.a);
            if (this.b >= $$0.b) {
                int $$1 = $$0.a;
                this.a = (this.a + 1) % this.c.b.size();
                this.b = 0;
                int $$2 = this.c.b.get((int)this.a).a;
                if ($$1 != $$2) {
                    this.f = true;
                }
            }
        }

        public GpuBufferSlice a(int $$0) {
            return this.e[$$0];
        }

        public boolean b() {
            return this.c.d || this.f;
        }

        public void a(RenderPass $$0, GpuBufferSlice $$1) {
            fzf $$2 = RenderSystem.getSamplerCache().a(FilterMode.NEAREST, true);
            List<c> $$3 = this.c.b;
            int $$4 = $$3.get((int)this.a).a;
            float $$5 = (float)this.b / (float)this.c.b.get((int)this.a).b;
            int $$6 = (int)($$5 * 1000.0f);
            if (this.c.d) {
                int $$7 = $$3.get((int)((this.a + 1) % $$3.size())).a;
                $$0.setPipeline(hpa.aK);
                $$0.bindTexture("CurrentSprite", (GpuTextureView)this.d.get($$4), $$2);
                $$0.bindTexture("NextSprite", (GpuTextureView)this.d.get($$7), $$2);
            } else if (this.f) {
                $$0.setPipeline(hpa.aJ);
                $$0.bindTexture("Sprite", (GpuTextureView)this.d.get($$4), $$2);
            }
            $$0.setUniform("SpriteAnimationInfo", $$1);
            $$0.draw($$6 << 3, 6);
        }

        @Override
        public void close() {
            for (GpuTextureView $$0 : this.d.values()) {
                $$0.texture().close();
                $$0.close();
            }
        }
    }
}

