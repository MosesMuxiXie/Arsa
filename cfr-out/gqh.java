/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class gqh
implements gqi {
    public final gio a;
    public final bfr b;
    public final Matrix3x2fc c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    final boolean i;
    public final @Nullable gpm j;
    private @Nullable gio.c k;
    private @Nullable gpm l;

    public gqh(gio $$0, bfr $$1, Matrix3x2fc $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, boolean $$8, @Nullable gpm $$9) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
        this.i = $$8;
        this.j = $$9;
    }

    public gio.c a() {
        if (this.k == null) {
            this.k = this.a.a(this.b, this.d, this.e, this.f, this.h, this.i, this.g);
            gpm $$0 = this.k.a();
            if ($$0 != null) {
                $$0 = $$0.b(this.c);
                this.l = this.j != null ? this.j.b($$0) : $$0;
            }
        }
        return this.k;
    }

    @Override
    public @Nullable gpm n() {
        this.a();
        return this.l;
    }
}

