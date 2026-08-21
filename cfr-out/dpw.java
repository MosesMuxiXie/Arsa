/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dpw {
    private final @Nullable ddm a;
    private final cdb b;
    private final fti c;
    private final dwo d;
    private final dlt e;

    public dpw(ddm $$0, cdb $$1, fti $$2) {
        this($$0.ao(), $$0, $$1, $$0.b($$1), $$2);
    }

    protected dpw(dwo $$0, @Nullable ddm $$1, cdb $$2, dlt $$3, fti $$4) {
        this.a = $$1;
        this.b = $$2;
        this.c = $$4;
        this.e = $$3;
        this.d = $$0;
    }

    protected final fti j() {
        return this.c;
    }

    public is a() {
        return this.c.b();
    }

    public iz k() {
        return this.c.c();
    }

    public ftm l() {
        return this.c.g();
    }

    public boolean m() {
        return this.c.e();
    }

    public dlt n() {
        return this.e;
    }

    public @Nullable ddm o() {
        return this.a;
    }

    public cdb p() {
        return this.b;
    }

    public dwo q() {
        return this.d;
    }

    public iz g() {
        return this.a == null ? iz.c : this.a.dg();
    }

    public boolean h() {
        return this.a != null && this.a.gA();
    }

    public float i() {
        return this.a == null ? 0.0f : this.a.ec();
    }
}

