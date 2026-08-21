/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public abstract class gsu<T extends asj>
extends gsb {
    public static final yh b = yh.c("menu.custom_screen_info.disconnect");
    private static final int a = 20;
    private static final gku c = new gku(amo.b("dialog/warning_button"), amo.b("dialog/warning_button_disabled"), amo.b("dialog/warning_button_highlighted"));
    private final T d;
    private final gou e = new gou(this);
    private final @Nullable gsb f;
    private @Nullable gkk t;
    private gje u;
    private final gsr v;
    private Supplier<Optional<yf>> w = gss.a;

    public gsu(@Nullable gsb $$0, T $$1, gsr $$2) {
        super($$1.A_().b());
        this.d = $$1;
        this.f = $$0;
        this.v = $$2;
    }

    @Override
    protected final void bg_() {
        super.bg_();
        this.u = this.I();
        this.u.e(-10);
        gss $$02 = new gss(this);
        goy $$1 = goy.d().a(10);
        $$1.c().b();
        this.e.a(this.o());
        for (ata $$2 : this.d.A_().g()) {
            gow $$3 = gtb.a(this, $$2);
            if ($$3 == null) continue;
            $$1.a($$3);
        }
        for (aso $$4 : this.d.A_().h()) {
            $$02.a($$4, $$1::a);
        }
        this.a($$1, $$02, this.d, this.v);
        this.t = new gkk(this.n, $$1, this.e.d());
        this.e.c(this.t);
        this.a(this.e, $$02, this.d, this.v);
        this.w = $$02.a(this.d.d());
        this.e.a($$0 -> {
            if ($$0 != this.u) {
                this.c($$0);
            }
        });
        this.c(this.u);
        this.c();
    }

    protected void a(goy $$0, gss $$1, T $$2, gsr $$3) {
    }

    protected void a(gou $$0, gss $$1, T $$2, gsr $$3) {
    }

    @Override
    protected void c() {
        this.t.b(this.e.d());
        this.e.a();
        this.p();
    }

    protected gow o() {
        goy $$0 = goy.e().a(10);
        $$0.c().b().e();
        $$0.a(new gko(this.m, this.q));
        $$0.a(this.u);
        return $$0;
    }

    protected void p() {
        int $$0 = this.u.aT_();
        int $$1 = this.u.aU_();
        if ($$0 < 0 || $$1 < 0 || $$0 > this.o - 20 || $$1 > this.p - 20) {
            this.u.f(Math.max(0, this.o - 40));
            this.u.g(Math.min(5, this.p));
        }
    }

    private gje I() {
        gjq $$02 = new gjq(0, 0, 20, 20, c, $$0 -> this.n.a(gsu$a.a(this.n, this.v, (gsb)this)), yh.c("menu.custom_screen_info.button_narration"));
        $$02.a(gks.a(yh.c("menu.custom_screen_info.tooltip")));
        return $$02;
    }

    @Override
    public boolean ba_() {
        return this.d.A_().e();
    }

    @Override
    public boolean aY_() {
        return this.d.A_().d();
    }

    @Override
    public void aX_() {
        this.a(this.w.get(), ask.a);
    }

    public void a(Optional<yf> $$0) {
        this.a($$0, this.d.A_().f());
    }

    public void a(Optional<yf> $$0, ask $$1) {
        gsb $$2;
        switch ($$1) {
            default: {
                throw new MatchException(null, null);
            }
            case b: {
                gsb gsb2 = this;
                break;
            }
            case a: {
                gsb gsb2 = this.f;
                break;
            }
            case c: {
                gsb gsb2 = $$2 = new gsz(this.f);
            }
        }
        if ($$0.isPresent()) {
            this.a($$0.get(), $$2);
        } else {
            this.n.a($$2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(yf $$0, @Nullable gsb $$1) {
        yf yf2 = $$0;
        Objects.requireNonNull(yf2);
        yf yf3 = yf2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{yf.g.class, yf.h.class, yf.d.class}, (Object)yf3, n2)) {
            case 0: {
                yf.g g2 = (yf.g)yf3;
                try {
                    String string;
                    String $$2 = string = g2.b();
                    this.v.a(ee.a($$2), $$1);
                    return;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                yf.h $$3 = (yf.h)yf3;
                this.v.a($$3.b(), $$1);
                return;
            }
            case 2: {
                yf.d $$4 = (yf.d)yf3;
                this.v.a($$4.b(), $$4.c());
                this.n.a($$1);
                return;
            }
        }
        gsu.b($$0, this.n, $$1);
    }

    public @Nullable gsb F() {
        return this.f;
    }

    protected static gow a(List<? extends gow> $$0, int $$1) {
        got $$2 = new got();
        $$2.c().b();
        $$2.a(2).b(2);
        int $$3 = $$0.size();
        int $$4 = $$3 / $$1;
        int $$5 = $$4 * $$1;
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            $$2.a($$0.get($$6), $$6 / $$1, $$6 % $$1);
        }
        if ($$3 != $$5) {
            goy $$7 = goy.e().a(2);
            $$7.c().b();
            for (int $$8 = $$5; $$8 < $$3; ++$$8) {
                $$7.a($$0.get($$8));
            }
            $$2.a($$7, $$4, 0, 1, $$1);
        }
        return $$2;
    }

    public static class a
    extends gra {
        private final MutableObject<@Nullable gsb> t;

        public static gsb a(gfj $$0, gsr $$1, gsb $$2) {
            return new a($$0, $$1, (MutableObject<gsb>)new MutableObject((Object)$$2));
        }

        private a(gfj $$0, gsr $$1, MutableObject<gsb> $$2) {
            super($$3 -> {
                if ($$3) {
                    $$1.a(b);
                } else {
                    $$0.a((gsb)$$2.get());
                }
            }, yh.c("menu.custom_screen_info.title"), yh.c("menu.custom_screen_info.contents"), yg.b($$0.Y()), yg.k);
            this.t = $$2;
        }

        public @Nullable gsb o() {
            return (gsb)this.t.get();
        }

        public void a(@Nullable gsb $$0) {
            this.t.setValue((Object)$$0);
        }
    }
}

