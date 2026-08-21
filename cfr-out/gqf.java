/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class gqf
implements gqi {
    private final String a;
    private final Matrix3x2f b;
    private final ihs c;
    private final int d;
    private final int e;
    private final @Nullable gpm f;
    private final @Nullable gpm g;
    private final @Nullable gpm h;

    public gqf(String $$0, Matrix3x2f $$1, ihs $$2, int $$3, int $$4, @Nullable gpm $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = this.c().h() ? this.h() : null;
        this.h = this.a(this.g != null ? this.g : new gpm(this.d, this.e, 16, 16));
    }

    private @Nullable gpm h() {
        fth $$0 = this.c.g();
        int $$1 = bgj.e($$0.b() * 16.0);
        int $$2 = bgj.e($$0.c() * 16.0);
        if ($$1 > 16 || $$2 > 16) {
            float $$3 = (float)($$0.a * 16.0);
            float $$4 = (float)($$0.e * 16.0);
            int $$5 = bgj.b($$3);
            int $$6 = bgj.b($$4);
            int $$7 = this.d + $$5 + 8;
            int $$8 = this.e - $$6 + 8;
            return new gpm($$7, $$8, $$1, $$2);
        }
        return null;
    }

    private @Nullable gpm a(gpm $$0) {
        gpm $$1 = $$0.b((Matrix3x2fc)this.b);
        return this.f != null ? this.f.b($$1) : $$1;
    }

    public String a() {
        return this.a;
    }

    public Matrix3x2f b() {
        return this.b;
    }

    public ihs c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public @Nullable gpm f() {
        return this.f;
    }

    public @Nullable gpm g() {
        return this.g;
    }

    @Override
    public @Nullable gpm n() {
        return this.h;
    }
}

