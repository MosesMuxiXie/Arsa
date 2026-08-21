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
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class gob
implements goa,
goc {
    public static final float a = 0.001f;
    final fwp b;
    final gnt c;
    final GpuTextureView d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;

    public gob(fwp $$0, gnt $$1, GpuTextureView $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
    }

    float a(b $$0) {
        return $$0.a + this.i + ($$0.f.d() ? Math.min(this.c(), this.b()) : 0.0f) - gob.a($$0.f.c());
    }

    float b(b $$0) {
        return $$0.b + this.k - gob.a($$0.f.c());
    }

    float c(b $$0) {
        return $$0.a + this.j + ($$0.o() ? $$0.h : 0.0f) + ($$0.f.d() ? Math.max(this.c(), this.b()) : 0.0f) + gob.a($$0.f.c());
    }

    float d(b $$0) {
        return $$0.b + this.l + ($$0.o() ? $$0.h : 0.0f) + gob.a($$0.f.c());
    }

    void a(b $$0, Matrix4f $$1, fzp $$2, int $$3, boolean $$4) {
        float $$14;
        float $$11;
        zf $$5 = $$0.a();
        boolean $$6 = $$5.d();
        float $$7 = $$0.h();
        float $$8 = $$0.i();
        int $$9 = $$0.j();
        boolean $$10 = $$5.c();
        float f2 = $$11 = $$4 ? 0.0f : 0.001f;
        if ($$0.o()) {
            int $$12 = $$0.k();
            this.a($$6, $$7 + $$0.n(), $$8 + $$0.n(), 0.0f, $$1, $$2, $$12, $$10, $$3);
            if ($$10) {
                this.a($$6, $$7 + $$0.m() + $$0.n(), $$8 + $$0.n(), $$11, $$1, $$2, $$12, true, $$3);
            }
            float $$13 = $$4 ? 0.0f : 0.03f;
        } else {
            $$14 = 0.0f;
        }
        this.a($$6, $$7, $$8, $$14, $$1, $$2, $$9, $$10, $$3);
        if ($$10) {
            this.a($$6, $$7 + $$0.m(), $$8, $$14 + $$11, $$1, $$2, $$9, true, $$3);
        }
    }

    private void a(boolean $$0, float $$1, float $$2, float $$3, Matrix4f $$4, fzp $$5, int $$6, boolean $$7, int $$8) {
        float $$9 = $$1 + this.i;
        float $$10 = $$1 + this.j;
        float $$11 = $$2 + this.k;
        float $$12 = $$2 + this.l;
        float $$13 = $$0 ? this.c() : 0.0f;
        float $$14 = $$0 ? this.b() : 0.0f;
        float $$15 = gob.a($$7);
        $$5.a((Matrix4fc)$$4, $$9 + $$13 - $$15, $$11 - $$15, $$3).a($$6).a(this.e, this.g).c($$8);
        $$5.a((Matrix4fc)$$4, $$9 + $$14 - $$15, $$12 + $$15, $$3).a($$6).a(this.e, this.h).c($$8);
        $$5.a((Matrix4fc)$$4, $$10 + $$14 + $$15, $$12 + $$15, $$3).a($$6).a(this.f, this.h).c($$8);
        $$5.a((Matrix4fc)$$4, $$10 + $$13 + $$15, $$11 - $$15, $$3).a($$6).a(this.f, this.g).c($$8);
    }

    private static float a(boolean $$0) {
        return $$0 ? 0.1f : 0.0f;
    }

    private float b() {
        return 1.0f - 0.25f * this.l;
    }

    private float c() {
        return 1.0f - 0.25f * this.k;
    }

    void a(a $$0, Matrix4f $$1, fzp $$2, int $$3, boolean $$4) {
        float $$5;
        float f2 = $$5 = $$4 ? 0.0f : $$0.f;
        if ($$0.l()) {
            this.a($$0, $$0.k(), $$5, $$0.j(), $$2, $$3, $$1);
            $$5 += $$4 ? 0.0f : 0.03f;
        }
        this.a($$0, 0.0f, $$5, $$0.g, $$2, $$3, $$1);
    }

    private void a(a $$0, float $$1, float $$2, int $$3, fzp $$4, int $$5, Matrix4f $$6) {
        $$4.a((Matrix4fc)$$6, $$0.b + $$1, $$0.e + $$1, $$2).a($$3).a(this.e, this.g).c($$5);
        $$4.a((Matrix4fc)$$6, $$0.d + $$1, $$0.e + $$1, $$2).a($$3).a(this.e, this.h).c($$5);
        $$4.a((Matrix4fc)$$6, $$0.d + $$1, $$0.c + $$1, $$2).a($$3).a(this.f, this.h).c($$5);
        $$4.a((Matrix4fc)$$6, $$0.b + $$1, $$0.c + $$1, $$2).a($$3).a(this.f, this.g).c($$5);
    }

    @Override
    public fwp a() {
        return this.b;
    }

    @Override
    public gnz.a a(float $$0, float $$1, int $$2, int $$3, zf $$4, float $$5, float $$6) {
        return new b($$0, $$1, $$2, $$3, this, $$4, $$5, $$6);
    }

    @Override
    public gnz a(float $$0, float $$1, float $$2, float $$3, float $$4, int $$5, int $$6, float $$7) {
        return new a(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    static final class b
    extends Record
    implements gnz.a {
        final float a;
        final float b;
        private final int c;
        private final int d;
        private final gob e;
        final zf f;
        private final float g;
        final float h;

        b(float $$0, float $$1, int $$2, int $$3, gob $$4, zf $$5, float $$6, float $$7) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
        }

        @Override
        public float r() {
            return this.e.a(this);
        }

        @Override
        public float t() {
            return this.e.b(this);
        }

        @Override
        public float s() {
            return this.e.c(this);
        }

        @Override
        public float d() {
            return this.a + this.e.b.a(this.f.c());
        }

        @Override
        public float u() {
            return this.e.d(this);
        }

        boolean o() {
            return this.k() != 0;
        }

        @Override
        public void a(Matrix4f $$0, fzp $$1, int $$2, boolean $$3) {
            this.e.a(this, $$0, $$1, $$2, $$3);
        }

        @Override
        public ijs a(gio.a $$0) {
            return this.e.c.a($$0);
        }

        @Override
        public GpuTextureView g() {
            return this.e.d;
        }

        @Override
        public RenderPipeline f() {
            return this.e.c.d();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "x;y;color;shadowColor;glyph;style;boldOffset;shadowOffset", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "x;y;color;shadowColor;glyph;style;boldOffset;shadowOffset", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "x;y;color;shadowColor;glyph;style;boldOffset;shadowOffset", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public float h() {
            return this.a;
        }

        public float i() {
            return this.b;
        }

        public int j() {
            return this.c;
        }

        public int k() {
            return this.d;
        }

        public gob l() {
            return this.e;
        }

        @Override
        public zf a() {
            return this.f;
        }

        public float m() {
            return this.g;
        }

        public float n() {
            return this.h;
        }
    }

    static final class a
    extends Record
    implements gnz {
        private final gob a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final int g;
        private final int h;
        private final float i;

        a(gob $$0, float $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7, float $$8) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
            this.i = $$8;
        }

        @Override
        public float r() {
            return this.b;
        }

        @Override
        public float t() {
            return this.c;
        }

        @Override
        public float s() {
            return this.d + (this.l() ? this.i : 0.0f);
        }

        @Override
        public float u() {
            return this.e + (this.l() ? this.i : 0.0f);
        }

        boolean l() {
            return this.j() != 0;
        }

        @Override
        public void a(Matrix4f $$0, fzp $$1, int $$2, boolean $$3) {
            this.a.a(this, $$0, $$1, $$2, false);
        }

        @Override
        public ijs a(gio.a $$0) {
            return this.a.c.a($$0);
        }

        @Override
        public GpuTextureView g() {
            return this.a.d;
        }

        @Override
        public RenderPipeline f() {
            return this.a.c.d();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "glyph;x0;y0;x1;y1;depth;color;shadowColor;shadowOffset", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "glyph;x0;y0;x1;y1;depth;color;shadowColor;shadowOffset", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "glyph;x0;y0;x1;y1;depth;color;shadowColor;shadowOffset", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public gob a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }

        public float c() {
            return this.c;
        }

        public float d() {
            return this.d;
        }

        public float e() {
            return this.e;
        }

        public float h() {
            return this.f;
        }

        public int i() {
            return this.g;
        }

        public int j() {
            return this.h;
        }

        public float k() {
            return this.i;
        }
    }
}

