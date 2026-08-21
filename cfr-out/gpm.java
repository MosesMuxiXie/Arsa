/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2fc
 *  org.joml.Vector2f
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix3x2fc;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;

public final class gpm
extends Record {
    private final gpl a;
    private final int b;
    private final int c;
    private static final gpm d = new gpm(0, 0, 0, 0);

    public gpm(int $$0, int $$1, int $$2, int $$3) {
        this(new gpl($$0, $$1), $$2, $$3);
    }

    public gpm(gpl $$0, int $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static gpm a() {
        return d;
    }

    public static gpm a(gpj $$0, int $$1, int $$2, int $$3, int $$4) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case gpj.a -> new gpm($$1, $$2, $$3, $$4);
            case gpj.b -> new gpm($$2, $$1, $$4, $$3);
        };
    }

    public gpm a(gpk $$0) {
        return new gpm(this.a.a($$0), this.b, this.c);
    }

    public int a(gpj $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case gpj.a -> this.b;
            case gpj.b -> this.c;
        };
    }

    public int b(gpk $$0) {
        gpj $$1 = $$0.a();
        if ($$0.c()) {
            return this.a.a($$1) + this.a($$1) - 1;
        }
        return this.a.a($$1);
    }

    public gpm c(gpk $$0) {
        int $$1 = this.b($$0);
        gpj $$2 = $$0.a().a();
        int $$3 = this.b($$2.c());
        int $$4 = this.a($$2);
        return gpm.a($$0.a(), $$1, $$3, 1, $$4).a($$0);
    }

    public boolean a(gpm $$0) {
        return this.a($$0, gpj.a) && this.a($$0, gpj.b);
    }

    public boolean a(gpm $$0, gpj $$1) {
        int $$2 = this.b($$1.c());
        int $$3 = $$0.b($$1.c());
        int $$4 = this.b($$1.b());
        int $$5 = $$0.b($$1.b());
        return Math.max($$2, $$3) <= Math.min($$4, $$5);
    }

    public int b(gpj $$0) {
        return (this.b($$0.b()) + this.b($$0.c())) / 2;
    }

    public @Nullable gpm b(gpm $$0) {
        int $$1 = Math.max(this.d(), $$0.d());
        int $$2 = Math.max(this.b(), $$0.b());
        int $$3 = Math.min(this.e(), $$0.e());
        int $$4 = Math.min(this.c(), $$0.c());
        if ($$1 >= $$3 || $$2 >= $$4) {
            return null;
        }
        return new gpm($$1, $$2, $$3 - $$1, $$4 - $$2);
    }

    public boolean c(gpm $$0) {
        return this.d() < $$0.e() && this.e() > $$0.d() && this.b() < $$0.c() && this.c() > $$0.b();
    }

    public boolean d(gpm $$0) {
        return $$0.d() >= this.d() && $$0.b() >= this.b() && $$0.e() <= this.e() && $$0.c() <= this.c();
    }

    public int b() {
        return this.a.b();
    }

    public int c() {
        return this.a.b() + this.c;
    }

    public int d() {
        return this.a.a();
    }

    public int e() {
        return this.a.a() + this.b;
    }

    public boolean a(int $$0, int $$1) {
        return $$0 >= this.d() && $$0 < this.e() && $$1 >= this.b() && $$1 < this.c();
    }

    public gpm a(Matrix3x2fc $$0) {
        Vector2f $$1 = $$0.transformPosition((float)this.d(), (float)this.b(), new Vector2f());
        Vector2f $$2 = $$0.transformPosition((float)this.e(), (float)this.c(), new Vector2f());
        return new gpm(bgj.b($$1.x), bgj.b($$1.y), bgj.b($$2.x - $$1.x), bgj.b($$2.y - $$1.y));
    }

    public gpm b(Matrix3x2fc $$0) {
        Vector2f $$1 = $$0.transformPosition((float)this.d(), (float)this.b(), new Vector2f());
        Vector2f $$2 = $$0.transformPosition((float)this.e(), (float)this.b(), new Vector2f());
        Vector2f $$3 = $$0.transformPosition((float)this.d(), (float)this.c(), new Vector2f());
        Vector2f $$4 = $$0.transformPosition((float)this.e(), (float)this.c(), new Vector2f());
        float $$5 = Math.min(Math.min($$1.x(), $$3.x()), Math.min($$2.x(), $$4.x()));
        float $$6 = Math.max(Math.max($$1.x(), $$3.x()), Math.max($$2.x(), $$4.x()));
        float $$7 = Math.min(Math.min($$1.y(), $$3.y()), Math.min($$2.y(), $$4.y()));
        float $$8 = Math.max(Math.max($$1.y(), $$3.y()), Math.max($$2.y(), $$4.y()));
        return new gpm(bgj.b($$5), bgj.b($$7), bgj.d($$6 - $$5), bgj.d($$8 - $$7));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gpm.class, "position;width;height", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gpm.class, "position;width;height", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gpm.class, "position;width;height", "a", "b", "c"}, this, $$0);
    }

    public gpl f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return this.c;
    }
}

