/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.tuple.Triple
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class i {
    private final Matrix4fc c;
    public static final Codec<i> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bfm.e.fieldOf("translation").forGetter($$0 -> $$0.e), (App)bfm.j.fieldOf("left_rotation").forGetter($$0 -> $$0.f), (App)bfm.e.fieldOf("scale").forGetter($$0 -> $$0.g), (App)bfm.j.fieldOf("right_rotation").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, i::new));
    public static final Codec<i> b = Codec.withAlternative(a, (Codec)bfm.k.xmap(i::new, i::c));
    private boolean d;
    private @Nullable Vector3fc e;
    private @Nullable Quaternionfc f;
    private @Nullable Vector3fc g;
    private @Nullable Quaternionfc h;
    private static final i i = bhs.a(() -> {
        i $$0 = new i((Matrix4fc)new Matrix4f());
        $$0.e = new Vector3f();
        $$0.f = new Quaternionf();
        $$0.g = new Vector3f(1.0f, 1.0f, 1.0f);
        $$0.h = new Quaternionf();
        $$0.d = true;
        return $$0;
    });

    public i(@Nullable Matrix4fc $$0) {
        this.c = $$0 == null ? new Matrix4f() : $$0;
    }

    public i(@Nullable Vector3fc $$0, @Nullable Quaternionfc $$1, @Nullable Vector3fc $$2, @Nullable Quaternionfc $$3) {
        this.c = i.a($$0, $$1, $$2, $$3);
        this.e = $$0 != null ? $$0 : new Vector3f();
        this.f = $$1 != null ? $$1 : new Quaternionf();
        this.g = $$2 != null ? $$2 : new Vector3f(1.0f, 1.0f, 1.0f);
        this.h = $$3 != null ? $$3 : new Quaternionf();
        this.d = true;
    }

    public static i a() {
        return i;
    }

    public i a(i $$0) {
        Matrix4f $$1 = this.d();
        $$1.mul($$0.c());
        return new i((Matrix4fc)$$1);
    }

    public @Nullable i b() {
        if (this == i) {
            return this;
        }
        Matrix4f $$0 = this.d().invertAffine();
        if ($$0.isFinite()) {
            return new i((Matrix4fc)$$0);
        }
        return null;
    }

    private void i() {
        if (!this.d) {
            float $$0 = 1.0f / this.c.m33();
            Triple<Quaternionf, Vector3f, Quaternionf> $$1 = e.a(new Matrix3f(this.c).scale($$0));
            this.e = this.c.getTranslation(new Vector3f()).mul($$0);
            this.f = new Quaternionf((Quaternionfc)$$1.getLeft());
            this.g = new Vector3f((Vector3fc)$$1.getMiddle());
            this.h = new Quaternionf((Quaternionfc)$$1.getRight());
            this.d = true;
        }
    }

    private static Matrix4f a(@Nullable Vector3fc $$0, @Nullable Quaternionfc $$1, @Nullable Vector3fc $$2, @Nullable Quaternionfc $$3) {
        Matrix4f $$4 = new Matrix4f();
        if ($$0 != null) {
            $$4.translation($$0);
        }
        if ($$1 != null) {
            $$4.rotate($$1);
        }
        if ($$2 != null) {
            $$4.scale($$2);
        }
        if ($$3 != null) {
            $$4.rotate($$3);
        }
        return $$4;
    }

    public Matrix4fc c() {
        return this.c;
    }

    public Matrix4f d() {
        return new Matrix4f(this.c);
    }

    public Vector3fc e() {
        this.i();
        return this.e;
    }

    public Quaternionfc f() {
        this.i();
        return this.f;
    }

    public Vector3fc g() {
        this.i();
        return this.g;
    }

    public Quaternionfc h() {
        this.i();
        return this.h;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        i $$1 = (i)$$0;
        return Objects.equals(this.c, $$1.c);
    }

    public int hashCode() {
        return Objects.hash(this.c);
    }

    public i a(i $$0, float $$1) {
        return new i((Vector3fc)this.e().lerp($$0.e(), $$1, new Vector3f()), (Quaternionfc)this.f().slerp($$0.f(), $$1, new Quaternionf()), (Vector3fc)this.g().lerp($$0.g(), $$1, new Vector3f()), (Quaternionfc)this.h().slerp($$0.h(), $$1, new Quaternionf()));
    }
}

