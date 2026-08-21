/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gda
extends isc {
    private static final Logger c = LogUtils.getLogger();
    public static final yh a = yh.c("mco.upload.select.world.title");
    private static final yh F = yh.c("selectWorld.unable_to_load");
    private final @Nullable gej G;
    private final gcz H;
    private final long I;
    private final int J;
    private final gou K;
    protected @Nullable gjn b;
    private @Nullable gyl L;
    private @Nullable gje M;

    public gda(@Nullable gej $$0, long $$1, int $$2, gcz $$3) {
        super(a);
        this.K = new gou(this, 8 + gfj.V().g.b + 8 + 20 + 4, 33);
        this.G = $$0;
        this.H = $$3;
        this.I = $$1;
        this.J = $$2;
    }

    @Override
    public void bg_() {
        goy $$02 = this.K.a(goy.d().a(4));
        $$02.c().b();
        $$02.a(new gko(this.m, this.q));
        this.b = $$02.a(new gjn(this.q, this.o / 2 - 100, 22, 200, 20, this.b, yh.c("selectWorld.search")));
        this.b.b((String $$0) -> {
            if (this.L != null) {
                this.L.a((String)$$0);
            }
        });
        try {
            this.L = this.K.c(new gyl.a(this.n, this).a(this.o).b(this.K.d()).a(this.b.a()).a(this.L).a().a(this::a).b(this::a).b());
        }
        catch (Exception $$12) {
            c.error("Couldn't load level list", (Throwable)$$12);
            this.n.a(new gcs(F, yh.a($$12.getMessage()), this.H));
            return;
        }
        goy $$2 = this.K.b(goy.e().a(8));
        $$2.c().b();
        this.M = $$2.a(gje.a(yh.c("mco.upload.button.name"), (gje $$0) -> this.L.I().ifPresent(this::a)).a());
        $$2.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.a((fnj)null);
        this.K.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        if (this.L != null) {
            this.L.a(this.o, this.K);
        }
        this.K.a();
    }

    @Override
    protected void aI_() {
        this.b(this.b);
    }

    private void a(@Nullable fnj $$0) {
        if (this.L != null && this.M != null) {
            this.M.k = this.L.q() != null;
        }
    }

    private void a(gyl.f $$0) {
        this.n.a(new gdd(this.G, this.I, this.J, this.H, $$0.b()));
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{this.q(), this.p()});
    }

    @Override
    public void aX_() {
        this.n.a(this.H);
    }
}

