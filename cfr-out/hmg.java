/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public abstract class hmg
extends hlq {
    protected float c;
    protected float d = 1.0f;
    protected float e = 1.0f;
    protected float f = 1.0f;
    protected float g = 1.0f;
    protected float h;
    protected float i;
    protected ilp E;

    protected hmg(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2, $$3);
        this.E = $$4;
        this.c = 0.1f * (this.y.i() * 0.5f + 0.5f) * 2.0f;
    }

    protected hmg(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.E = $$7;
        this.c = 0.1f * (this.y.i() * 0.5f + 0.5f) * 2.0f;
    }

    public a p() {
        return a.a;
    }

    public void a(iku $$0, ger $$1, float $$2) {
        Quaternionf $$3 = new Quaternionf();
        this.p().setRotation($$3, $$1, $$2);
        if (this.h != 0.0f) {
            $$3.rotateZ(bgj.h($$2, this.i, this.h));
        }
        this.a($$0, $$1, $$3, $$2);
    }

    protected void a(iku $$0, ger $$1, Quaternionf $$2, float $$3) {
        ftm $$4 = $$1.b();
        float $$5 = (float)(bgj.d((double)$$3, this.k, this.n) - $$4.a());
        float $$6 = (float)(bgj.d((double)$$3, this.l, this.o) - $$4.b());
        float $$7 = (float)(bgj.d((double)$$3, this.m, this.p) - $$4.c());
        this.a($$0, $$2, $$5, $$6, $$7, $$3);
    }

    protected void a(iku $$0, Quaternionf $$1, float $$2, float $$3, float $$4, float $$5) {
        $$0.a(this.b(), $$2, $$3, $$4, $$1.x, $$1.y, $$1.z, $$1.w, this.b($$5), this.c(), this.d(), this.e(), this.f(), bel.a(this.g, this.d, this.e, this.f), this.a($$5));
    }

    public float b(float $$0) {
        return this.c;
    }

    @Override
    public hlq d(float $$0) {
        this.c *= $$0;
        return super.d($$0);
    }

    @Override
    public hlv bj_() {
        return hlv.a;
    }

    public void a(hmo $$0) {
        if (!this.v) {
            this.a($$0.a(this.z, this.A));
        }
    }

    protected void a(ilp $$0) {
        this.E = $$0;
    }

    protected float c() {
        return this.E.c();
    }

    protected float d() {
        return this.E.d();
    }

    protected float e() {
        return this.E.f();
    }

    protected float f() {
        return this.E.g();
    }

    protected abstract b b();

    public void a(float $$0, float $$1, float $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    protected void e(float $$0) {
        this.g = $$0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.n + "," + this.o + "," + this.p + "), RGBA (" + this.d + "," + this.e + "," + this.f + "," + this.g + "), Age " + this.z;
    }

    public static interface a {
        public static final a a = ($$0, $$1, $$2) -> $$0.set((Quaternionfc)$$1.g());
        public static final a b = ($$0, $$1, $$2) -> $$0.set(0.0f, $$1.g().y, 0.0f, $$1.g().w);

        public void setRotation(Quaternionf var1, ger var2, float var3);
    }

    public static final class b
    extends Record {
        private final boolean e;
        private final amo f;
        private final RenderPipeline g;
        public static final b a = new b(true, ilo.d, hpa.ai);
        public static final b b = new b(true, ilo.e, hpa.ai);
        public static final b c = new b(false, ilo.f, hpa.ah);
        public static final b d = new b(true, ilo.f, hpa.ai);

        public b(boolean $$0, amo $$1, RenderPipeline $$2) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "translucent;textureAtlasLocation;pipeline", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "translucent;textureAtlasLocation;pipeline", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "translucent;textureAtlasLocation;pipeline", "e", "f", "g"}, this, $$0);
        }

        public boolean a() {
            return this.e;
        }

        public amo b() {
            return this.f;
        }

        public RenderPipeline c() {
            return this.g;
        }
    }
}

