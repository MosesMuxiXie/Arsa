/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class cnz
extends cop {
    private static final csk d = csk.b().a(8.0).d();
    protected final cth a;
    private final Class<? extends cth> e;
    protected final axf b;
    protected @Nullable cth c;
    private int f;
    private final double g;

    public cnz(cth $$0, double $$1) {
        this($$0, $$1, $$0.getClass());
    }

    public cnz(cth $$0, double $$1, Class<? extends cth> $$2) {
        this.a = $$0;
        this.b = cnz.a($$0);
        this.e = $$2;
        this.g = $$1;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        if (!this.a.hb()) {
            return false;
        }
        this.c = this.h();
        return this.c != null;
    }

    @Override
    public boolean c() {
        return this.c.cb() && this.c.hb() && this.f < 60 && !this.c.gM();
    }

    @Override
    public void e() {
        this.c = null;
        this.f = 0;
    }

    @Override
    public void a() {
        this.a.J().a(this.c, 10.0f, (float)this.a.ac());
        this.a.N().a((cgk)this.c, this.g);
        ++this.f;
        if (this.f >= this.a(60) && this.a.g((cgk)this.c) < 9.0) {
            this.g();
        }
    }

    private @Nullable cth h() {
        List<? extends cth> $$0 = this.b.a(this.e, d, this.a, this.a.dj().g(8.0));
        double $$1 = Double.MAX_VALUE;
        cth $$2 = null;
        for (cth cth2 : $$0) {
            if (!this.a.a(cth2) || cth2.gM() || !(this.a.g((cgk)cth2) < $$1)) continue;
            $$2 = cth2;
            $$1 = this.a.g((cgk)cth2);
        }
        return $$2;
    }

    protected void g() {
        this.a.a(this.b, this.c);
    }
}

