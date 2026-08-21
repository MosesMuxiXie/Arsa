/*
 * Decompiled with CFR 0.152.
 */
public class fti
extends ftk {
    private final iz b;
    private final is c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public static fti a(ftm $$0, iz $$1, is $$2) {
        return new fti(true, $$0, $$1, $$2, false, false);
    }

    public fti(ftm $$0, iz $$1, is $$2, boolean $$3) {
        this(false, $$0, $$1, $$2, $$3, false);
    }

    public fti(ftm $$0, iz $$1, is $$2, boolean $$3, boolean $$4) {
        this(false, $$0, $$1, $$2, $$3, $$4);
    }

    private fti(boolean $$0, ftm $$1, iz $$2, is $$3, boolean $$4, boolean $$5) {
        super($$1);
        this.d = $$0;
        this.b = $$2;
        this.c = $$3;
        this.e = $$4;
        this.f = $$5;
    }

    public fti a(iz $$0) {
        return new fti(this.d, this.a, $$0, this.c, this.e, this.f);
    }

    public fti a(is $$0) {
        return new fti(this.d, this.a, this.b, $$0, this.e, this.f);
    }

    public fti a() {
        return new fti(this.d, this.a, this.b, this.c, this.e, true);
    }

    public is b() {
        return this.c;
    }

    public iz c() {
        return this.b;
    }

    @Override
    public ftk.a d() {
        return this.d ? ftk.a.a : ftk.a.b;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }
}

