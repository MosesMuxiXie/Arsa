/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gwj
extends gwc {
    private static final yh t = yh.c("controls.keybinds.title");
    public @Nullable gfh a;
    public long f;
    private gwi u;
    private gje v;

    public gwj(gsb $$0, gfo $$1) {
        super($$0, $$1, t);
    }

    @Override
    protected void I() {
        this.u = this.e.c(new gwi(this, this.n));
    }

    @Override
    protected void o() {
    }

    @Override
    protected void p() {
        this.v = gje.a(yh.c("controls.resetAll"), (gje $$0) -> {
            for (gfh $$1 : this.c.as) {
                $$1.b($$1.l());
            }
            this.u.d();
        }).a();
        goy $$02 = this.e.b(goy.e().a(8));
        $$02.a(this.v);
        $$02.a(gje.a(yg.d, (gje $$0) -> this.aX_()).a());
    }

    @Override
    protected void c() {
        this.e.a();
        this.u.a(this.o, this.e);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.a != null) {
            this.a.b(fyc.b.c.a($$0.t()));
            this.a = null;
            this.u.d();
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.a != null) {
            if ($$0.e()) {
                this.a.b(fyc.bF);
            } else {
                this.a.b(fyc.a($$0));
            }
            this.a = null;
            this.f = bhs.c();
            this.u.d();
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        boolean $$4 = false;
        for (gfh $$5 : this.c.as) {
            if ($$5.o()) continue;
            $$4 = true;
            break;
        }
        this.v.k = $$4;
    }
}

