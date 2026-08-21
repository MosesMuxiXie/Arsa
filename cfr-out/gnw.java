/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class gnw {
    static final fwp a = fwp.a(8.0f);
    final hou b;
    private final LoadingCache<ym.b, gip> c = CacheBuilder.newBuilder().expireAfterAccess(hou.b).build((CacheLoader)new CacheLoader<ym.b, gip>(){

        public gip a(ym.b $$0) {
            final Supplier<hou.a> $$1 = gnw.this.b.b($$0.a());
            final boolean $$2 = $$0.b();
            return new gnx(new goa(){

                @Override
                public fwp a() {
                    return gnw.a;
                }

                @Override
                public gnz.a a(float $$0, float $$12, int $$22, int $$3, zf $$4, float $$5, float $$6) {
                    return new a($$1, $$2, $$0, $$12, $$22, $$3, $$6, $$4);
                }
            });
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((ym.b)object);
        }
    });

    public gnw(hou $$0) {
        this.b = $$0;
    }

    public gip a(ym.b $$0) {
        return (gip)this.c.getUnchecked((Object)$$0);
    }

    static final class a
    extends Record
    implements gnv {
        private final Supplier<hou.a> d;
        private final boolean e;
        private final float f;
        private final float g;
        private final int h;
        private final int i;
        private final float j;
        private final zf k;

        a(Supplier<hou.a> $$0, boolean $$1, float $$2, float $$3, int $$4, int $$5, float $$6, zf $$7) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
            this.h = $$4;
            this.i = $$5;
            this.j = $$6;
            this.k = $$7;
        }

        @Override
        public void a(Matrix4f $$0, fzp $$1, int $$2, float $$3, float $$4, float $$5, int $$6) {
            float $$7 = $$3 + this.r();
            float $$8 = $$3 + this.s();
            float $$9 = $$4 + this.t();
            float $$10 = $$4 + this.u();
            gnw$a.a($$0, $$1, $$2, $$7, $$8, $$9, $$10, $$5, $$6, 8.0f, 8.0f, 8, 8, 64, 64);
            if (this.e) {
                gnw$a.a($$0, $$1, $$2, $$7, $$8, $$9, $$10, $$5, $$6, 40.0f, 8.0f, 8, 8, 64, 64);
            }
        }

        private static void a(Matrix4f $$0, fzp $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7, int $$8, float $$9, float $$10, int $$11, int $$12, int $$13, int $$14) {
            float $$15 = ($$9 + 0.0f) / (float)$$13;
            float $$16 = ($$9 + (float)$$11) / (float)$$13;
            float $$17 = ($$10 + 0.0f) / (float)$$14;
            float $$18 = ($$10 + (float)$$12) / (float)$$14;
            $$1.a((Matrix4fc)$$0, $$3, $$5, $$7).a($$15, $$17).a($$8).c($$2);
            $$1.a((Matrix4fc)$$0, $$3, $$6, $$7).a($$15, $$18).a($$8).c($$2);
            $$1.a((Matrix4fc)$$0, $$4, $$6, $$7).a($$16, $$18).a($$8).c($$2);
            $$1.a((Matrix4fc)$$0, $$4, $$5, $$7).a($$16, $$17).a($$8).c($$2);
        }

        @Override
        public ijs a(gio.a $$0) {
            return this.d.get().e().a($$0);
        }

        @Override
        public RenderPipeline f() {
            return this.d.get().e().d();
        }

        @Override
        public GpuTextureView g() {
            return this.d.get().d();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "skin;hat;x;y;color;shadowColor;shadowOffset;style", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "skin;hat;x;y;color;shadowColor;shadowOffset;style", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "skin;hat;x;y;color;shadowColor;shadowOffset;style", "d", "e", "f", "g", "h", "i", "j", "k"}, this, $$0);
        }

        public Supplier<hou.a> h() {
            return this.d;
        }

        public boolean i() {
            return this.e;
        }

        @Override
        public float j() {
            return this.f;
        }

        @Override
        public float k() {
            return this.g;
        }

        @Override
        public int l() {
            return this.h;
        }

        @Override
        public int m() {
            return this.i;
        }

        @Override
        public float n() {
            return this.j;
        }

        @Override
        public zf a() {
            return this.k;
        }
    }
}

