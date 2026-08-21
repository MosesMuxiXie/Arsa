/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class fxh
implements RenderPass {
    protected static final int a = 1;
    public static final boolean b = w.aX;
    private final fxb k;
    private final boolean l;
    private boolean m;
    protected @Nullable fxi c;
    protected final @Nullable GpuBuffer[] d = new GpuBuffer[1];
    protected @Nullable GpuBuffer e;
    protected VertexFormat.a f = VertexFormat.a.b;
    private final fzc n = new fzc();
    protected final HashMap<String, GpuBufferSlice> g = new HashMap();
    protected final HashMap<String, a> h = new HashMap();
    protected final Set<String> i = new HashSet<String>();
    protected int j;

    public fxh(fxb $$0, boolean $$1) {
        this.k = $$0;
        this.l = $$1;
    }

    public boolean a() {
        return this.l;
    }

    @Override
    public void pushDebugGroup(Supplier<String> $$0) {
        if (this.m) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        ++this.j;
        this.k.b().a().a($$0);
    }

    @Override
    public void popDebugGroup() {
        if (this.m) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        if (this.j == 0) {
            throw new IllegalStateException("Can't pop more debug groups than was pushed!");
        }
        --this.j;
        this.k.b().a().a();
    }

    @Override
    public void setPipeline(RenderPipeline $$0) {
        if (this.c == null || this.c.a() != $$0) {
            this.i.addAll(this.g.keySet());
            this.i.addAll(this.h.keySet());
        }
        this.c = this.k.b().a($$0);
    }

    @Override
    public void bindTexture(String $$0, @Nullable GpuTextureView $$1, @Nullable fzf $$2) {
        if ($$2 == null) {
            this.h.remove($$0);
        } else {
            this.h.put($$0, new a((fxm)$$1, (fxj)$$2));
        }
        this.i.add($$0);
    }

    @Override
    public void setUniform(String $$0, GpuBuffer $$1) {
        this.g.put($$0, $$1.slice());
        this.i.add($$0);
    }

    @Override
    public void setUniform(String $$0, GpuBufferSlice $$1) {
        int $$2 = this.k.b().getUniformOffsetAlignment();
        if ($$1.offset() % (long)$$2 > 0L) {
            throw new IllegalArgumentException("Uniform buffer offset must be aligned to " + $$2);
        }
        this.g.put($$0, $$1);
        this.i.add($$0);
    }

    @Override
    public void enableScissor(int $$0, int $$1, int $$2, int $$3) {
        this.n.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void disableScissor() {
        this.n.a();
    }

    public boolean b() {
        return this.n.b();
    }

    public int c() {
        return this.n.c();
    }

    public int d() {
        return this.n.d();
    }

    public int e() {
        return this.n.e();
    }

    public int f() {
        return this.n.f();
    }

    @Override
    public void setVertexBuffer(int $$0, GpuBuffer $$1) {
        if ($$0 < 0 || $$0 >= 1) {
            throw new IllegalArgumentException("Vertex buffer slot is out of range: " + $$0);
        }
        this.d[$$0] = $$1;
    }

    @Override
    public void setIndexBuffer(@Nullable GpuBuffer $$0, VertexFormat.a $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public void drawIndexed(int $$0, int $$1, int $$2, int $$3) {
        if (this.m) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        this.k.a(this, $$0, $$1, $$2, this.f, $$3);
    }

    @Override
    public <T> void drawMultipleIndexed(Collection<RenderPass.a<T>> $$0, @Nullable GpuBuffer $$1, @Nullable VertexFormat.a $$2, Collection<String> $$3, T $$4) {
        if (this.m) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        this.k.a(this, $$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void draw(int $$0, int $$1) {
        if (this.m) {
            throw new IllegalStateException("Can't use a closed render pass");
        }
        this.k.a(this, $$0, 0, $$1, null, 1);
    }

    @Override
    public void close() {
        if (!this.m) {
            if (this.j > 0) {
                throw new IllegalStateException("Render pass had debug groups left open!");
            }
            this.m = true;
            this.k.a();
        }
    }

    protected record a(fxm a, fxj b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "view;sampler", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "view;sampler", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "view;sampler", "a", "b"}, this, $$0);
        }
    }
}

