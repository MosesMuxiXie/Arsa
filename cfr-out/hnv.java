/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hnv
extends bbe<Optional<b>>
implements AutoCloseable {
    private static final int a = 16;
    private static final int b = 32;
    private static final float c = 12.0f;
    private static final int d = 400;
    private static final float e = 0.6f;
    private static final int f = new Std140SizeCalculator().putVec4().putVec3().putVec3().get();
    private static final Logger g = LogUtils.getLogger();
    private static final amo h = amo.b("textures/environment/clouds.png");
    private static final long i = 0L;
    private static final int j = 4;
    private static final int k = 3;
    private static final int l = 2;
    private static final int m = 1;
    private static final int n = 0;
    private boolean o = true;
    private int p = Integer.MIN_VALUE;
    private int q = Integer.MIN_VALUE;
    private a r = hnv$a.b;
    private @Nullable gev s;
    private @Nullable b t;
    private int u = 0;
    private final hol v = new hol(() -> "Cloud UBO", 130, f);
    private @Nullable hol w;

    /*
     * Enabled aggressive exception aggregation
     */
    protected Optional<b> a(baz $$0, bzm $$1) {
        try (InputStream $$2 = $$0.open(h);){
            fyh $$3 = fyh.a($$2);
            try {
                int $$4 = $$3.a();
                int $$5 = $$3.b();
                long[] $$6 = new long[$$4 * $$5];
                for (int $$7 = 0; $$7 < $$5; ++$$7) {
                    for (int $$8 = 0; $$8 < $$4; ++$$8) {
                        int $$9 = $$3.a($$8, $$7);
                        if (hnv.b($$9)) {
                            $$6[$$8 + $$7 * $$4] = 0L;
                            continue;
                        }
                        boolean $$10 = hnv.b($$3.a($$8, Math.floorMod($$7 - 1, $$5)));
                        boolean $$11 = hnv.b($$3.a(Math.floorMod($$8 + 1, $$5), $$7));
                        boolean $$12 = hnv.b($$3.a($$8, Math.floorMod($$7 + 1, $$5)));
                        boolean $$13 = hnv.b($$3.a(Math.floorMod($$8 - 1, $$5), $$7));
                        $$6[$$8 + $$7 * $$4] = hnv.a($$9, $$10, $$11, $$12, $$13);
                    }
                }
                Optional<b> optional = Optional.of(new b($$6, $$4, $$5));
                if ($$3 != null) {
                    $$3.close();
                }
                return optional;
            }
            catch (Throwable throwable) {
                if ($$3 != null) {
                    try {
                        $$3.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
        catch (IOException $$14) {
            g.error("Failed to load cloud texture", (Throwable)$$14);
            return Optional.empty();
        }
    }

    private static int a(int $$0) {
        int $$1 = 4;
        int $$2 = ($$0 + 1) * 2 * (($$0 + 1) * 2) / 2;
        int $$3 = $$2 * 4 + 54;
        return $$3 * 3;
    }

    @Override
    protected void a(Optional<b> $$0, baz $$1, bzm $$2) {
        this.t = $$0.orElse(null);
        this.o = true;
    }

    private static boolean b(int $$0) {
        return bel.b($$0) < 10;
    }

    private static long a(int $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4) {
        return (long)$$0 << 4 | (long)(($$1 ? 1 : 0) << 3) | (long)(($$2 ? 1 : 0) << 2) | (long)(($$3 ? 1 : 0) << 1) | (long)(($$4 ? 1 : 0) << 0);
    }

    private static boolean a(long $$0) {
        return ($$0 >> 3 & 1L) != 0L;
    }

    private static boolean b(long $$0) {
        return ($$0 >> 2 & 1L) != 0L;
    }

    private static boolean c(long $$0) {
        return ($$0 >> 1 & 1L) != 0L;
    }

    private static boolean d(long $$0) {
        return ($$0 >> 0 & 1L) != 0L;
    }

    public void a(int $$0, gev $$1, float $$2, ftm $$3, long $$4, float $$5) {
        GpuTextureView $$35;
        GpuTextureView $$34;
        RenderPipeline $$24;
        a $$13;
        float $$9;
        float $$10;
        if (this.t == null) {
            return;
        }
        int $$6 = gfj.V().k.l().b() * 16;
        int $$7 = bgj.d((float)$$6 / 12.0f);
        int $$8 = hnv.a($$7);
        if (this.w == null || this.w.b().size() != (long)$$8) {
            if (this.w != null) {
                this.w.close();
            }
            this.w = new hol(() -> "Cloud UTB", 258, $$8);
        }
        if (($$10 = ($$9 = (float)((double)$$2 - $$3.h)) + 4.0f) < 0.0f) {
            a $$11 = hnv$a.a;
        } else if ($$9 > 0.0f) {
            a $$12 = hnv$a.c;
        } else {
            $$13 = hnv$a.b;
        }
        float $$14 = (float)($$4 % ((long)this.t.b * 400L)) + $$5;
        double $$15 = $$3.g + (double)($$14 * 0.030000001f);
        double $$16 = $$3.i + (double)3.96f;
        double $$17 = (double)this.t.b * 12.0;
        double $$18 = (double)this.t.c * 12.0;
        $$15 -= (double)bgj.c($$15 / $$17) * $$17;
        $$16 -= (double)bgj.c($$16 / $$18) * $$18;
        int $$19 = bgj.c($$15 / 12.0);
        int $$20 = bgj.c($$16 / 12.0);
        float $$21 = (float)($$15 - (double)((float)$$19 * 12.0f));
        float $$22 = (float)($$16 - (double)((float)$$20 * 12.0f));
        boolean $$23 = $$1 == gev.c;
        RenderPipeline renderPipeline = $$24 = $$23 ? hpa.Y : hpa.X;
        if (this.o || $$19 != this.p || $$20 != this.q || $$13 != this.r || $$1 != this.s) {
            this.o = false;
            this.p = $$19;
            this.q = $$20;
            this.r = $$13;
            this.s = $$1;
            this.w.c();
            try (GpuBuffer.MappedView $$25 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.w.b(), false, true);){
                this.a($$13, $$25.data(), $$19, $$20, $$23, $$7);
                this.u = $$25.data().position() / 3;
            }
        }
        if (this.u == 0) {
            return;
        }
        try (GpuBuffer.MappedView $$26 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.v.b(), false, true);){
            Std140Builder.intoBuffer($$26.data()).putVec4((Vector4fc)bel.l($$0)).putVec3(-$$21, $$9, -$$22).putVec3(12.0f, 4.0f, 12.0f);
        }
        GpuBufferSlice $$27 = RenderSystem.getDynamicUniforms().a((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        fxt $$28 = gfj.V().l();
        fxt $$29 = gfj.V().e.v();
        RenderSystem.a $$30 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
        GpuBuffer $$31 = $$30.b(6 * this.u);
        if ($$29 != null) {
            GpuTextureView $$32 = $$29.d();
            GpuTextureView $$33 = $$29.f();
        } else {
            $$34 = $$28.d();
            $$35 = $$28.f();
        }
        try (RenderPass $$36 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Clouds", $$34, OptionalInt.empty(), $$35, OptionalDouble.empty());){
            $$36.setPipeline($$24);
            RenderSystem.bindDefaultUniforms($$36);
            $$36.setUniform("DynamicTransforms", $$27);
            $$36.setIndexBuffer($$31, $$30.a());
            $$36.setUniform("CloudInfo", this.v.b());
            $$36.setUniform("CloudFaces", this.w.b());
            $$36.drawIndexed(0, 0, 6 * this.u, 1);
        }
    }

    private void a(a $$0, ByteBuffer $$1, int $$2, int $$3, boolean $$4, int $$5) {
        if (this.t == null) {
            return;
        }
        long[] $$6 = this.t.a;
        int $$7 = this.t.b;
        int $$8 = this.t.c;
        for (int $$9 = 0; $$9 <= 2 * $$5; ++$$9) {
            for (int $$10 = -$$9; $$10 <= $$9; ++$$10) {
                int $$11 = $$9 - Math.abs($$10);
                if ($$11 < 0 || $$11 > $$5 || $$10 * $$10 + $$11 * $$11 > $$5 * $$5) continue;
                if ($$11 != 0) {
                    this.a($$0, $$1, $$2, $$3, $$4, $$10, $$7, -$$11, $$8, $$6);
                }
                this.a($$0, $$1, $$2, $$3, $$4, $$10, $$7, $$11, $$8, $$6);
            }
        }
    }

    private void a(a $$0, ByteBuffer $$1, int $$2, int $$3, boolean $$4, int $$5, int $$6, int $$7, int $$8, long[] $$9) {
        int $$11;
        int $$10 = Math.floorMod($$2 + $$5, $$6);
        long $$12 = $$9[$$10 + ($$11 = Math.floorMod($$3 + $$7, $$8)) * $$6];
        if ($$12 == 0L) {
            return;
        }
        if ($$4) {
            this.a($$0, $$1, $$5, $$7, $$12);
        } else {
            this.a($$1, $$5, $$7);
        }
    }

    private void a(ByteBuffer $$0, int $$1, int $$2) {
        this.a($$0, $$1, $$2, iz.a, 32);
    }

    private void a(ByteBuffer $$0, int $$1, int $$2, iz $$3, int $$4) {
        int $$5 = $$3.d() | $$4;
        $$5 |= ($$1 & 1) << 7;
        $$0.put((byte)($$1 >> 1)).put((byte)($$2 >> 1)).put((byte)($$5 |= ($$2 & 1) << 6));
    }

    private void a(a $$0, ByteBuffer $$1, int $$2, int $$3, long $$4) {
        boolean $$5;
        if ($$0 != hnv$a.c) {
            this.a($$1, $$2, $$3, iz.b, 0);
        }
        if ($$0 != hnv$a.a) {
            this.a($$1, $$2, $$3, iz.a, 0);
        }
        if (hnv.a($$4) && $$3 > 0) {
            this.a($$1, $$2, $$3, iz.c, 0);
        }
        if (hnv.c($$4) && $$3 < 0) {
            this.a($$1, $$2, $$3, iz.d, 0);
        }
        if (hnv.d($$4) && $$2 > 0) {
            this.a($$1, $$2, $$3, iz.e, 0);
        }
        if (hnv.b($$4) && $$2 < 0) {
            this.a($$1, $$2, $$3, iz.f, 0);
        }
        boolean bl2 = $$5 = Math.abs($$2) <= 1 && Math.abs($$3) <= 1;
        if ($$5) {
            for (iz $$6 : iz.values()) {
                this.a($$1, $$2, $$3, $$6, 16);
            }
        }
    }

    public void a() {
        this.o = true;
    }

    public void b() {
        this.v.c();
    }

    @Override
    public void close() {
        this.v.close();
        if (this.w != null) {
            this.w.close();
        }
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = hnv$a.a();
        }
    }

    public static final class b
    extends Record {
        final long[] a;
        final int b;
        final int c;

        public b(long[] $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "cells;width;height", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "cells;width;height", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "cells;width;height", "a", "b", "c"}, this, $$0);
        }

        public long[] a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }
}

