/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  org.joml.Matrix4fc
 *  org.joml.Vector2fc
 *  org.joml.Vector3fc
 *  org.joml.Vector3ic
 *  org.joml.Vector4fc
 */
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix4fc;
import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector3ic;
import org.joml.Vector4fc;

public interface hpq {
    public static final Codec<hpq> a = e.h.dispatch(hpq::a, $$0 -> $$0.j);

    public void a(Std140Builder var1);

    public void a(Std140SizeCalculator var1);

    public e a();

    public static final class e
    extends Enum<e>
    implements bhh {
        public static final /* enum */ e a = new e("int", hpq$c.b);
        public static final /* enum */ e b = new e("ivec3", hpq$b.b);
        public static final /* enum */ e c = new e("float", hpq$a.b);
        public static final /* enum */ e d = new e("vec2", hpq$f.b);
        public static final /* enum */ e e = new e("vec3", hpq$g.b);
        public static final /* enum */ e f = new e("vec4", hpq$h.b);
        public static final /* enum */ e g = new e("matrix4x4", hpq$d.b);
        public static final bhh.a<e> h;
        private final String i;
        final MapCodec<? extends hpq> j;
        private static final /* synthetic */ e[] k;

        public static e[] values() {
            return (e[])k.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        private e(String $$0, Codec<? extends hpq> $$1) {
            this.i = $$0;
            this.j = $$1.fieldOf("value");
        }

        @Override
        public String c() {
            return this.i;
        }

        private static /* synthetic */ e[] a() {
            return new e[]{a, b, c, d, e, f, g};
        }

        static {
            k = hpq$e.a();
            h = bhh.a(e::values);
        }
    }

    public static final class d
    extends Record
    implements hpq {
        private final Matrix4fc c;
        public static final Codec<d> b = bfm.k.xmap(d::new, d::b);

        public d(Matrix4fc $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putMat4f(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putMat4f();
        }

        @Override
        public e a() {
            return e.g;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "value", "c"}, this, $$0);
        }

        public Matrix4fc b() {
            return this.c;
        }
    }

    public static final class h
    extends Record
    implements hpq {
        private final Vector4fc c;
        public static final Codec<h> b = bfm.g.xmap(h::new, h::b);

        public h(Vector4fc $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putVec4(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putVec4();
        }

        @Override
        public e a() {
            return e.f;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "value", "c"}, this, $$0);
        }

        public Vector4fc b() {
            return this.c;
        }
    }

    public static final class g
    extends Record
    implements hpq {
        private final Vector3fc c;
        public static final Codec<g> b = bfm.e.xmap(g::new, g::b);

        public g(Vector3fc $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putVec3(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putVec3();
        }

        @Override
        public e a() {
            return e.e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "value", "c"}, this, $$0);
        }

        public Vector3fc b() {
            return this.c;
        }
    }

    public static final class f
    extends Record
    implements hpq {
        private final Vector2fc c;
        public static final Codec<f> b = bfm.d.xmap(f::new, f::b);

        public f(Vector2fc $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putVec2(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putVec2();
        }

        @Override
        public e a() {
            return e.d;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "value", "c"}, this, $$0);
        }

        public Vector2fc b() {
            return this.c;
        }
    }

    public static final class a
    extends Record
    implements hpq {
        private final float c;
        public static final Codec<a> b = Codec.FLOAT.xmap(a::new, a::b);

        public a(float $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putFloat(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putFloat();
        }

        @Override
        public e a() {
            return e.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value", "c"}, this, $$0);
        }

        public float b() {
            return this.c;
        }
    }

    public static final class b
    extends Record
    implements hpq {
        private final Vector3ic c;
        public static final Codec<b> b = bfm.f.xmap(b::new, b::b);

        public b(Vector3ic $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putIVec3(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putIVec3();
        }

        @Override
        public e a() {
            return e.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "value", "c"}, this, $$0);
        }

        public Vector3ic b() {
            return this.c;
        }
    }

    public static final class c
    extends Record
    implements hpq {
        private final int c;
        public static final Codec<c> b = Codec.INT.xmap(c::new, c::b);

        public c(int $$0) {
            this.c = $$0;
        }

        @Override
        public void a(Std140Builder $$0) {
            $$0.putInt(this.c);
        }

        @Override
        public void a(Std140SizeCalculator $$0) {
            $$0.putInt();
        }

        @Override
        public e a() {
            return e.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "value", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "value", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "value", "c"}, this, $$0);
        }

        public int b() {
            return this.c;
        }
    }
}

