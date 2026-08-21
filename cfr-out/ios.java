/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class ios
implements ipm {
    protected @Nullable ipj a;
    protected final bdb b;
    protected final amo c;
    protected float d = 1.0f;
    protected float e = 1.0f;
    protected double f;
    protected double g;
    protected double h;
    protected boolean i;
    protected int j;
    protected ipm.a k = ipm.a.b;
    protected boolean l;
    protected bgr m;

    protected ios(bcz $$0, bdb $$1, bgr $$2) {
        this($$0.a(), $$1, $$2);
    }

    protected ios(amo $$0, bdb $$1, bgr $$2) {
        this.c = $$0;
        this.b = $$1;
        this.m = $$2;
    }

    @Override
    public amo a() {
        return this.c;
    }

    @Override
    public @Nullable iqt a(iqr $$0) {
        if (this.c.equals(iqr.c)) {
            this.a = iqr.e;
            return iqr.d;
        }
        iqt $$1 = $$0.a(this.c);
        this.a = $$1 == null ? iqr.b : $$1.a(this.m);
        return $$1;
    }

    @Override
    public @Nullable ipj b() {
        return this.a;
    }

    @Override
    public bdb c() {
        return this.b;
    }

    @Override
    public boolean d() {
        return this.i;
    }

    @Override
    public int e() {
        return this.j;
    }

    @Override
    public float f() {
        return this.d * this.a.c().a(this.m);
    }

    @Override
    public float g() {
        return this.e * this.a.d().a(this.m);
    }

    @Override
    public double h() {
        return this.f;
    }

    @Override
    public double i() {
        return this.g;
    }

    @Override
    public double j() {
        return this.h;
    }

    @Override
    public ipm.a k() {
        return this.k;
    }

    @Override
    public boolean l() {
        return this.l;
    }

    public String toString() {
        return "SoundInstance[" + String.valueOf(this.c) + "]";
    }
}

