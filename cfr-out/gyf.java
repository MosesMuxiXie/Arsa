/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gyf
extends gsb {
    private static final Logger d = LogUtils.getLogger();
    public static final evo a = new evo("test1".hashCode(), true, false);
    protected final gsb b;
    private final gou e;
    private @Nullable gje f;
    private @Nullable gje t;
    private @Nullable gje u;
    private @Nullable gje v;
    protected @Nullable gjn c;
    private @Nullable gyl w;

    public gyf(gsb $$0) {
        super(yh.c("selectWorld.title"));
        this.e = new gou(this, 8 + gfj.V().g.b + 8 + 20 + 4, 60);
        this.b = $$0;
    }

    @Override
    protected void bg_() {
        goy $$02 = this.e.a(goy.d().a(4));
        $$02.c().b();
        $$02.a(new gko(this.m, this.q));
        goy $$12 = $$02.a(goy.e().a(4));
        if (w.aN) {
            $$12.a(this.o());
        }
        this.c = $$12.a(new gjn(this.q, this.o / 2 - 100, 22, 200, 20, this.c, yh.c("selectWorld.search")));
        this.c.b((String $$0) -> {
            if (this.w != null) {
                this.w.a((String)$$0);
            }
        });
        this.c.c(yh.c("gui.selectWorld.search").b(gjn.e));
        Consumer<gyl.f> $$2 = gyl.f::e;
        this.w = this.e.c(new gyl.a(this.n, this).a(this.o).b(this.e.d()).a(this.c.a()).a(this.w).a(this::a).b($$2).b());
        this.a($$2, this.w);
        this.e.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
        this.a((fnj)null);
    }

    private void a(Consumer<gyl.f> $$02, gyl $$12) {
        got $$22 = this.e.b(new got().a(8).b(4));
        $$22.c().b();
        got.b $$3 = $$22.d(4);
        this.t = $$3.a(gje.a(fnj.a, (gje $$2) -> $$12.I().ifPresent($$02)).a(), 2);
        $$3.a(gje.a(yh.c("selectWorld.create"), (gje $$1) -> gxx.a(this.n, $$12::J)).a(), 2);
        this.u = $$3.a(gje.a(yh.c("selectWorld.edit"), (gje $$1) -> $$12.I().ifPresent(gyl.f::u)).a(71).a());
        this.f = $$3.a(gje.a(yh.c("selectWorld.delete"), (gje $$1) -> $$12.I().ifPresent(gyl.f::f)).a(71).a());
        this.v = $$3.a(gje.a(yh.c("selectWorld.recreate"), (gje $$1) -> $$12.I().ifPresent(gyl.f::v)).a(71).a());
        $$3.a(gje.a(yg.k, (gje $$0) -> this.n.a(this.b)).a(71).a());
    }

    private gje o() {
        return gje.a(yh.b("DEBUG recreate"), (gje $$0) -> {
            try {
                gyl.f $$3;
                gyl.b $$2;
                String $$1 = "DEBUG world";
                if (this.w != null && !this.w.aJ_().isEmpty() && ($$2 = (gyl.b)this.w.aJ_().getFirst()) instanceof gyl.f && ($$3 = (gyl.f)$$2).w().equals("DEBUG world")) {
                    $$3.t();
                }
                dws $$4 = new dws("DEBUG world", dwl.d, false, ccz.c, true, new eua(dxm.d.b()), dxm.d);
                String $$5 = bfp.a(this.n.q().c(), "DEBUG world", "");
                this.n.B().a($$5, $$4, a, ffe::a, this);
            }
            catch (IOException $$6) {
                d.error("Failed to recreate the debug world", (Throwable)$$6);
            }
        }).a(72).a();
    }

    @Override
    protected void c() {
        if (this.w != null) {
            this.w.a(this.o, this.e);
        }
        this.e.a();
    }

    @Override
    protected void aI_() {
        if (this.c != null) {
            this.b(this.c);
        }
    }

    @Override
    public void aX_() {
        this.n.a(this.b);
    }

    public void a(@Nullable fnj $$0) {
        if (this.t == null || this.u == null || this.v == null || this.f == null) {
            return;
        }
        if ($$0 == null) {
            this.t.a_(fnj.a);
            this.t.k = false;
            this.u.k = false;
            this.v.k = false;
            this.f.k = false;
        } else {
            this.t.a_($$0.t());
            this.t.k = $$0.u();
            this.u.k = $$0.w();
            this.v.k = $$0.x();
            this.f.k = $$0.y();
        }
    }

    @Override
    public void aZ_() {
        if (this.w != null) {
            this.w.aJ_().forEach(gyl.b::close);
        }
    }
}

