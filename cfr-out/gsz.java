/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gsz
extends gsb {
    private static final yh a = yh.c("gui.waitingForResponse.title");
    private static final yh[] b = new yh[]{yh.i(), yh.a("gui.waitingForResponse.button.inactive", 4), yh.a("gui.waitingForResponse.button.inactive", 3), yh.a("gui.waitingForResponse.button.inactive", 2), yh.a("gui.waitingForResponse.button.inactive", 1), yg.k};
    private static final int c = 1;
    private static final int d = 5;
    private final @Nullable gsb e;
    private final gou f;
    private final gje t;
    private int u;

    public gsz(@Nullable gsb $$02) {
        super(a);
        this.e = $$02;
        this.f = new gou(this, 33, 0);
        this.t = gje.a(yg.k, (gje $$0) -> this.aX_()).a(200).a();
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.f.a(a, this.q);
        this.f.c(this.t);
        this.t.l = false;
        this.t.k = false;
        this.f.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.f.a();
        gos.a(this.f, this.aV_());
    }

    @Override
    public void e() {
        super.e();
        if (!this.t.k) {
            int $$0;
            this.t.l = ($$0 = this.u++ / 20) >= 1;
            this.t.a_(b[$$0]);
            if ($$0 == 5) {
                this.t.k = true;
                this.d(true);
            }
        }
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean aY_() {
        return this.t.k;
    }

    @Override
    public void aX_() {
        this.n.a(this.e);
    }

    public @Nullable gsb o() {
        return this.e;
    }
}

