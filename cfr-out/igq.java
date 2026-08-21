/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.lwjgl.system.MemoryStack
 */
import com.google.common.collect.Lists;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.List;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.system.MemoryStack;

public class igq
implements AutoCloseable {
    public static final int a = new Std140SizeCalculator().putVec4().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().get();
    private static final List<igu> b = Lists.newArrayList((Object[])new igu[]{new igv(), new igx(), new igs(), new igt(), new igy(), new igr()});
    private static boolean c = true;
    private final GpuBuffer d;
    private final hol e;

    public igq() {
        GpuDevice $$0 = RenderSystem.getDevice();
        this.e = new hol(() -> "Fog UBO", 130, a);
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            ByteBuffer $$2 = $$1.malloc(a);
            this.a($$2, 0, new Vector4f(0.0f), Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
            this.d = $$0.createBuffer(() -> "Empty fog", 128, $$2.flip());
        }
        RenderSystem.setShaderFog(this.a(igq$a.a));
    }

    @Override
    public void close() {
        this.d.close();
        this.e.close();
    }

    public void a() {
        this.e.c();
    }

    public GpuBufferSlice a(a $$0) {
        if (!c) {
            return this.d.slice(0L, a);
        }
        return switch ($$0.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.d.slice(0L, a);
            case 1 -> this.e.b().slice(0L, a);
        };
    }

    private Vector4f a(ger $$0, float $$1, hif $$2, int $$3, float $$4) {
        float $$22;
        chl $$20;
        fld $$5 = this.a($$0);
        cgk $$6 = $$0.h();
        igu $$7 = null;
        igu $$8 = null;
        for (igu $$9 : b) {
            if (!$$9.a($$5, $$6)) continue;
            if ($$7 == null && $$9.b()) {
                $$7 = $$9;
            }
            if ($$8 != null || !$$9.c()) continue;
            $$8 = $$9;
        }
        if ($$7 == null) {
            throw new IllegalStateException("No color source environment found");
        }
        int $$10 = $$7.a($$2, $$0, $$3, $$1);
        float $$11 = $$2.l().d();
        float $$12 = bgj.a(($$11 + (float)$$2.K_() - (float)$$0.b().h) / $$11, 0.0f, 1.0f);
        if ($$8 != null) {
            chl $$13 = (chl)$$6;
            $$12 = $$8.a($$13, $$12, $$1);
        }
        float $$14 = bel.n($$10);
        float $$15 = bel.o($$10);
        float $$16 = bel.p($$10);
        if ($$12 > 0.0f && $$5 != fld.a && $$5 != fld.c) {
            float $$17 = bgj.j(1.0f - $$12);
            $$14 *= $$17;
            $$15 *= $$17;
            $$16 *= $$17;
        }
        if ($$4 > 0.0f) {
            $$14 = bgj.h($$4, $$14, $$14 * 0.7f);
            $$15 = bgj.h($$4, $$15, $$15 * 0.6f);
            $$16 = bgj.h($$4, $$16, $$16 * 0.6f);
        }
        if ($$5 == fld.b) {
            if ($$6 instanceof hnh) {
                float $$18 = ((hnh)$$6).L();
            } else {
                float $$19 = 1.0f;
            }
        } else if ($$6 instanceof chl && ($$20 = (chl)$$6).d(cfo.p) && !$$20.d(cfo.G)) {
            float $$21 = hob.a($$20, $$1);
        } else {
            $$22 = 0.0f;
        }
        if ($$14 != 0.0f && $$15 != 0.0f && $$16 != 0.0f) {
            float $$23 = 1.0f / Math.max($$14, Math.max($$15, $$16));
            $$14 = bgj.h($$22, $$14, $$14 * $$23);
            $$15 = bgj.h($$22, $$15, $$15 * $$23);
            $$16 = bgj.h($$22, $$16, $$16 * $$23);
        }
        return new Vector4f($$14, $$15, $$16, 1.0f);
    }

    public static boolean b() {
        c = !c;
        return c;
    }

    public Vector4f a(ger $$0, int $$1, gez $$2, float $$3, hif $$4) {
        float $$5 = $$2.a(false);
        Vector4f $$6 = this.a($$0, $$5, $$4, $$1, $$3);
        float $$7 = $$1 * 16;
        fld $$8 = this.a($$0);
        cgk $$9 = $$0.h();
        igp $$10 = new igp();
        for (igu $$11 : b) {
            if (!$$11.a($$8, $$9)) continue;
            $$11.a($$10, $$0, $$4, $$7, $$2);
            break;
        }
        float $$12 = bgj.a($$7 / 10.0f, 4.0f, 64.0f);
        $$10.b = $$7 - $$12;
        $$10.d = $$7;
        try (GpuBuffer.MappedView $$13 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.e.b(), false, true);){
            this.a($$13.data(), 0, $$6, $$10.a, $$10.c, $$10.b, $$10.d, $$10.e, $$10.f);
        }
        return $$6;
    }

    private fld a(ger $$0) {
        fld $$1 = $$0.m();
        if ($$1 == fld.e) {
            return fld.d;
        }
        return $$1;
    }

    private void a(ByteBuffer $$0, int $$1, Vector4f $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
        $$0.position($$1);
        Std140Builder.intoBuffer($$0).putVec4((Vector4fc)$$2).putFloat($$3).putFloat($$4).putFloat($$5).putFloat($$6).putFloat($$7).putFloat($$8);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = igq$a.a();
        }
    }
}

