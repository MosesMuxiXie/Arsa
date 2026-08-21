/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cnv
extends cop {
    private final cxu a;
    private @Nullable ddm b;
    private final axf c;
    private final float d;
    private int e;
    private final csk f;

    public cnv(cxu $$0, float $$1) {
        this.a = $$0;
        this.c = cnv.a($$0);
        this.d = $$1;
        this.f = csk.b().a($$1);
        this.a(EnumSet.of(cop.a.b));
    }

    @Override
    public boolean b() {
        this.b = this.c.a(this.f, this.a);
        if (this.b == null) {
            return false;
        }
        return this.a(this.b);
    }

    @Override
    public boolean c() {
        if (!this.b.cb()) {
            return false;
        }
        if (this.a.g((cgk)this.b) > (double)(this.d * this.d)) {
            return false;
        }
        return this.e > 0 && this.a(this.b);
    }

    @Override
    public void d() {
        this.a.A(true);
        this.e = this.a(40 + this.a.ep().a(40));
    }

    @Override
    public void e() {
        this.a.A(false);
        this.b = null;
    }

    @Override
    public void a() {
        this.a.J().a(this.b.dP(), this.b.dT(), this.b.dV(), 10.0f, this.a.ac());
        --this.e;
    }

    private boolean a(ddm $$0) {
        for (cdb $$1 : cdb.values()) {
            dlt $$2 = $$0.b($$1);
            if (!$$2.a(dlx.tD) && !this.a.j($$2)) continue;
            return true;
        }
        return false;
    }
}

