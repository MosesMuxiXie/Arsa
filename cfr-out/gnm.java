/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class gnm {
    static final fwp a = fwp.a(8.0f);
    final ilo b;
    final gnt c;
    private final gip d;
    private final Map<amo, gip> e = new HashMap<amo, gip>();
    private final Function<amo, gip> f;

    public gnm(ilo $$0) {
        this.b = $$0;
        this.c = gnt.b($$0.h());
        ilp $$1 = $$0.f();
        this.d = this.a($$1);
        this.f = $$2 -> {
            ilp $$3 = $$0.a((amo)$$2);
            if ($$3 == $$1) {
                return this.d;
            }
            return this.a($$3);
        };
    }

    public gip a(amo $$0) {
        return this.e.computeIfAbsent($$0, this.f);
    }

    private gip a(final ilp $$0) {
        return new gnx(new goa(){

            @Override
            public fwp a() {
                return a;
            }

            @Override
            public gnz.a a(float $$02, float $$1, int $$2, int $$3, zf $$4, float $$5, float $$6) {
                return new a(gnm.this.c, gnm.this.b.b(), $$0, $$02, $$1, $$2, $$3, $$6, $$4);
            }
        });
    }

    static final class a
    extends Record
    implements gnv {
        private final gnt d;
        private final GpuTextureView e;
        private final ilp f;
        private final float g;
        private final float h;
        private final int i;
        private final int j;
        private final float k;
        private final zf l;

        a(gnt $$0, GpuTextureView $$1, ilp $$2, float $$3, float $$4, int $$5, int $$6, float $$7, zf $$8) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
            this.h = $$4;
            this.i = $$5;
            this.j = $$6;
            this.k = $$7;
            this.l = $$8;
        }

        @Override
        public void a(Matrix4f $$0, fzp $$1, int $$2, float $$3, float $$4, float $$5, int $$6) {
            float $$7 = $$3 + this.r();
            float $$8 = $$3 + this.s();
            float $$9 = $$4 + this.t();
            float $$10 = $$4 + this.u();
            $$1.a((Matrix4fc)$$0, $$7, $$9, $$5).a(this.f.c(), this.f.f()).a($$6).c($$2);
            $$1.a((Matrix4fc)$$0, $$7, $$10, $$5).a(this.f.c(), this.f.g()).a($$6).c($$2);
            $$1.a((Matrix4fc)$$0, $$8, $$10, $$5).a(this.f.d(), this.f.g()).a($$6).c($$2);
            $$1.a((Matrix4fc)$$0, $$8, $$9, $$5).a(this.f.d(), this.f.f()).a($$6).c($$2);
        }

        @Override
        public ijs a(gio.a $$0) {
            return this.d.a($$0);
        }

        @Override
        public RenderPipeline f() {
            return this.d.d();
        }

        @Override
        public GpuTextureView g() {
            return this.e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "renderTypes;textureView;sprite;x;y;color;shadowColor;shadowOffset;style", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "renderTypes;textureView;sprite;x;y;color;shadowColor;shadowOffset;style", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "renderTypes;textureView;sprite;x;y;color;shadowColor;shadowOffset;style", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
        }

        public gnt h() {
            return this.d;
        }

        public ilp i() {
            return this.f;
        }

        @Override
        public float j() {
            return this.g;
        }

        @Override
        public float k() {
            return this.h;
        }

        @Override
        public int l() {
            return this.i;
        }

        @Override
        public int m() {
            return this.j;
        }

        @Override
        public float n() {
            return this.k;
        }

        @Override
        public zf a() {
            return this.l;
        }
    }
}

