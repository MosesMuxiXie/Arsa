/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gcw
extends isc {
    private static final yh a = yh.c("mco.account.privacy.information");
    private static final int b = 15;
    private final goy c = goy.d();
    private final gsb F;
    private @Nullable gjz G;

    public gcw(gsb $$0) {
        super(gfa.a);
        this.F = $$0;
    }

    @Override
    public void bg_() {
        this.c.a(15).c().b();
        this.G = new gjz(a, this.q).a(true);
        this.c.a(this.G);
        goy $$02 = this.c.a(goy.e().a(8));
        yw $$12 = yh.c("mco.account.privacy.info.button");
        $$02.a(gje.a($$12, gqz.b((gsb)this, bez.a)).a());
        $$02.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.c.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    public void aX_() {
        this.n.a(this.F);
    }

    @Override
    protected void c() {
        if (this.G != null) {
            this.G.a(this.o - 15);
        }
        this.c.a();
        gos.a(this.c, this.aV_());
    }

    @Override
    public yh i() {
        return a;
    }
}

