/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class gwv<T extends diz>
implements gki,
gmm,
gpb {
    public static final gku a = new gku(amo.b("recipe_book/button"), amo.b("recipe_book/button_highlighted"));
    protected static final amo b = amo.b("textures/gui/recipe_book.png");
    private static final int h = 256;
    private static final int i = 256;
    private static final yh j = yh.c("gui.recipebook.search_hint").c(gjn.e);
    public static final int c = 147;
    public static final int d = 166;
    private static final int k = 86;
    private static final int l = 8;
    private static final yh m = yh.c("gui.recipebook.toggleRecipes.all");
    private static final int n = 30;
    private int o;
    private int p;
    private int q;
    private float r;
    private @Nullable dsa s;
    private final gwt t;
    private final List<gwx> u = Lists.newArrayList();
    private @Nullable gwx v;
    protected gjl<Boolean> e;
    protected final T f;
    protected gfj g;
    private @Nullable gjn w;
    private String x = "";
    private final List<a> y;
    private geu z;
    private final gww A;
    private @Nullable dsa B;
    private @Nullable gwz C;
    private final ddu D = new ddu();
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private @Nullable gpm I;

    public gwv(T $$0, List<a> $$1) {
        this.f = $$0;
        this.y = $$1;
        gxc $$2 = () -> bgj.b(this.r / 30.0f);
        this.t = new gwt($$2);
        this.A = new gww(this, $$2, $$0 instanceof dhk);
    }

    public void a(int $$0, int $$1, gfj $$2, boolean $$3) {
        this.g = $$2;
        this.p = $$0;
        this.q = $$1;
        this.H = $$3;
        this.z = $$2.s.y();
        this.E = $$2.s.gK().o();
        this.G = this.n();
        if (this.G) {
            this.k();
        }
    }

    private void k() {
        boolean $$02 = this.q();
        this.o = this.H ? 0 : 86;
        int $$12 = this.m();
        int $$2 = this.l();
        this.D.a();
        this.g.s.gK().a(this.D);
        ((diz)this.f).a(this.D);
        String $$3 = this.w != null ? this.w.a() : "";
        this.w = new gjn(this.g.g, $$12 + 25, $$2 + 13, 81, this.g.g.b + 5, yh.c("itemGroup.search"));
        this.w.k(50);
        this.w.j(true);
        this.w.l(-1);
        this.w.a($$3);
        this.w.c(j);
        this.I = gpm.a(gpj.a, $$12 + 8, this.w.aU_(), this.w.aT_() - this.m(), this.w.aR_());
        this.A.a(this.g, $$12, $$2);
        this.e = gjl.a(this.d(), m, $$02).a((T $$0) -> $$0 != false ? gks.a(this.d()) : gks.a(m)).a((gjl<T> $$0, T $$1) -> this.a().a((boolean)$$1, $$0.D())).a(gjl.b.c).a($$12 + 110, $$2 + 12, 26, 16, yg.a, ($$0, $$1) -> {
            this.r();
            this.j();
            this.a(false, (boolean)$$1);
        });
        this.u.clear();
        for (a $$4 : this.y) {
            this.u.add(new gwx(0, 0, $$4, this::a));
        }
        if (this.v != null) {
            this.v = this.u.stream().filter($$0 -> $$0.a().equals(this.v.a())).findFirst().orElse(null);
        }
        if (this.v == null) {
            this.v = this.u.get(0);
        }
        this.v.d();
        this.o();
        this.c($$02);
        this.a(false, $$02);
    }

    private int l() {
        return (this.q - 166) / 2;
    }

    private int m() {
        return (this.p - 147) / 2 - this.o;
    }

    protected abstract gku a();

    public int a(int $$0, int $$1) {
        int $$3;
        if (this.f() && !this.H) {
            int $$2 = 177 + ($$0 - $$1 - 200) / 2;
        } else {
            $$3 = ($$0 - $$1) / 2;
        }
        return $$3;
    }

    public void e() {
        this.a(!this.f());
    }

    public boolean f() {
        return this.G;
    }

    private boolean n() {
        return this.z.a(((diz)this.f).ao_());
    }

    protected void a(boolean $$0) {
        if ($$0) {
            this.k();
        }
        this.G = $$0;
        this.z.a(((diz)this.f).ao_(), $$0);
        if (!$$0) {
            this.A.c();
        }
        this.j();
    }

    protected abstract boolean a(dji var1);

    public void b(@Nullable dji $$0) {
        if ($$0 != null && this.a($$0)) {
            this.s = null;
            this.t.a();
            if (this.f()) {
                this.p();
            }
        }
    }

    private void o() {
        for (a $$0 : this.y) {
            for (gwz $$1 : this.z.a($$0.c())) {
                this.a($$1, this.D);
            }
        }
    }

    protected abstract void a(gwz var1, ddu var2);

    private void a(boolean $$02, boolean $$1) {
        hig $$5;
        List<gwz> $$2 = this.z.a(this.v.a());
        ArrayList $$3 = Lists.newArrayList($$2);
        $$3.removeIf($$0 -> !$$0.b());
        String $$4 = this.w.a();
        if (!$$4.isEmpty() && ($$5 = this.g.R()) != null) {
            ObjectLinkedOpenHashSet $$6 = new ObjectLinkedOpenHashSet($$5.G().b().search($$4.toLowerCase(Locale.ROOT)));
            $$3.removeIf(arg_0 -> gwv.a((ObjectSet)$$6, arg_0));
        }
        if ($$1) {
            $$3.removeIf($$0 -> !$$0.a());
        }
        this.A.a($$3, $$02, $$1);
    }

    private void c(boolean $$0) {
        int $$1 = (this.p - 147) / 2 - this.o - 30;
        int $$2 = (this.q - 166) / 2 + 3;
        int $$3 = 27;
        int $$4 = 0;
        for (gwx $$5 : this.u) {
            dqk $$6 = $$5.a();
            if ($$6 instanceof gxb) {
                $$5.l = true;
                $$5.c($$1, $$2 + 27 * $$4++);
                continue;
            }
            if (!$$5.a(this.z)) continue;
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.z, $$0);
        }
    }

    public void h() {
        boolean $$0 = this.n();
        if (this.f() != $$0) {
            this.a($$0);
        }
        if (!this.f()) {
            return;
        }
        if (this.E != this.g.s.gK().o()) {
            this.p();
            this.E = this.g.s.gK().o();
        }
    }

    private void p() {
        this.D.a();
        this.g.s.gK().a(this.D);
        ((diz)this.f).a(this.D);
        this.o();
        this.a(false, this.q());
    }

    private boolean q() {
        return this.z.b(((diz)this.f).ao_());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        if (!this.f()) {
            return;
        }
        if (!this.g.d()) {
            this.r += $$3;
        }
        int $$4 = this.m();
        int $$5 = this.l();
        $$0.a(hpa.at, b, $$4, $$5, 1.0f, 1.0f, 147, 166, 256, 256);
        this.w.a($$0, $$1, $$2, $$3);
        for (gwx $$6 : this.u) {
            $$6.a($$0, $$1, $$2, $$3);
        }
        this.e.a($$0, $$1, $$2, $$3);
        this.A.a($$0, $$4, $$5, $$1, $$2, $$3);
    }

    public void a(gir $$0, int $$1, int $$2, @Nullable dji $$3) {
        if (!this.f()) {
            return;
        }
        this.A.a($$0, $$1, $$2);
        this.t.a($$0, this.g, $$1, $$2, $$3);
    }

    protected abstract yh d();

    public void a(gir $$0, boolean $$1) {
        this.t.a($$0, this.g, $$1);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (!this.f() || this.g.s.au()) {
            return false;
        }
        if (this.A.a($$0, this.m(), this.l(), 147, 166, $$1)) {
            dsa $$2 = this.A.a();
            gwz $$3 = this.A.b();
            if ($$2 != null && $$3 != null) {
                if (!this.a($$3, $$2, $$0.m())) {
                    return false;
                }
                this.C = $$3;
                this.B = $$2;
                if (!this.u()) {
                    this.a(false);
                }
            }
            return true;
        }
        if (this.w != null) {
            boolean $$4;
            boolean bl2 = $$4 = this.I != null && this.I.a(bgj.c($$0.u()), bgj.c($$0.v()));
            if ($$4 || this.w.a($$0, $$1)) {
                this.w.b(true);
                return true;
            }
            this.w.b(false);
        }
        if (this.e.a($$0, $$1)) {
            return true;
        }
        for (gwx $$5 : this.u) {
            if (!$$5.a($$0, $$1)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.w != null && this.w.aP_()) {
            return this.w.a($$0, $$1, $$2);
        }
        return false;
    }

    private boolean a(gwz $$0, dsa $$1, boolean $$2) {
        if (!$$0.a($$1) && $$1.equals(this.s)) {
            return false;
        }
        this.s = $$1;
        this.t.a();
        this.g.q.a(this.g.s.cn.l, $$1, $$2);
        return true;
    }

    private void a(gje $$0) {
        if (this.v != $$0 && $$0 instanceof gwx) {
            gwx $$1 = (gwx)$$0;
            this.a($$1);
            this.a(true, this.q());
        }
    }

    private void a(gwx $$0) {
        if (this.v != null) {
            this.v.e();
        }
        $$0.d();
        this.v = $$0;
    }

    private void r() {
        dja $$0 = ((diz)this.f).ao_();
        boolean $$1 = !this.z.b($$0);
        this.z.b($$0, $$1);
    }

    public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5) {
        if (!this.f()) {
            return true;
        }
        boolean $$6 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
        boolean $$7 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
        return $$6 && !$$7 && !this.v.D();
    }

    @Override
    public boolean a(gzb $$0) {
        this.F = false;
        if (!this.f() || this.g.s.au()) {
            return false;
        }
        if ($$0.e() && !this.u()) {
            this.a(false);
            return true;
        }
        if (this.w.a($$0)) {
            this.t();
            return true;
        }
        if (this.w.aP_() && this.w.j() && !$$0.e()) {
            return true;
        }
        if (this.g.k.F.a($$0) && !this.w.aP_()) {
            this.F = true;
            this.w.b(true);
            return true;
        }
        if ($$0.c() && this.C != null && this.B != null) {
            gjc.b(gfj.V().ap());
            return this.a(this.C, this.B, $$0.m());
        }
        return false;
    }

    @Override
    public boolean b(gzb $$0) {
        this.F = false;
        return gmm.super.b($$0);
    }

    @Override
    public boolean a(gyy $$0) {
        if (this.F) {
            return false;
        }
        if (!this.f() || this.g.s.au()) {
            return false;
        }
        if (this.w.a($$0)) {
            this.t();
            return true;
        }
        return gmm.super.a($$0);
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return false;
    }

    @Override
    public void b(boolean $$0) {
    }

    @Override
    public boolean aP_() {
        return false;
    }

    private void t() {
        String $$0 = this.w.a().toLowerCase(Locale.ROOT);
        this.a($$0);
        if (!$$0.equals(this.x)) {
            this.a(false, this.q());
            this.x = $$0;
        }
    }

    private void a(String $$0) {
        if ("excitedze".equals($$0)) {
            imw $$1 = this.g.am();
            String $$2 = "en_pt";
            imv $$3 = $$1.b("en_pt");
            if ($$3 == null || $$1.a().equals("en_pt")) {
                return;
            }
            $$1.a("en_pt");
            this.g.k.ay = "en_pt";
            this.g.p();
            this.g.k.aQ();
        }
    }

    private boolean u() {
        return this.o == 86;
    }

    public void i() {
        this.o();
        this.c(this.q());
        if (this.f()) {
            this.a(false, this.q());
        }
    }

    public void a(dsa $$0) {
        this.g.s.a($$0);
    }

    public void a(dry $$0) {
        this.t.a();
        bhx $$1 = dsf.a(Objects.requireNonNull(this.g.r));
        this.a(this.t, $$0, $$1);
    }

    protected abstract void a(gwt var1, dry var2, bhx var3);

    protected void j() {
        if (this.g.R() != null) {
            dja $$0 = ((diz)this.f).ao_();
            boolean $$1 = this.z.a().b($$0);
            boolean $$2 = this.z.a().c($$0);
            this.g.R().b(new ajm($$0, $$1, $$2));
        }
    }

    @Override
    public gpb.a y() {
        return this.G ? gpb.a.b : gpb.a.a;
    }

    @Override
    public void b(gpd $$0) {
        ArrayList $$12 = Lists.newArrayList();
        this.A.a((gjc $$1) -> {
            if ($$1.b()) {
                $$12.add($$1);
            }
        });
        $$12.add(this.w);
        $$12.add(this.e);
        $$12.addAll(this.u);
        gsb.a $$2 = gsb.a($$12, null);
        if ($$2 != null) {
            $$2.a().b($$0.a());
        }
    }

    private static /* synthetic */ boolean a(ObjectSet $$0, gwz $$1) {
        return !$$0.contains((Object)$$1);
    }

    public record a(dlt a, Optional<dlt> b, dqk c) {
        public a(gxb $$0) {
            this(new dlt(dlx.sG), Optional.empty(), $$0);
        }

        public a(dlp $$0, dqv $$1) {
            this(new dlt($$0), Optional.empty(), (dqk)$$1);
        }

        public a(dlp $$0, dlp $$1, dqv $$2) {
            this(new dlt($$0), Optional.of(new dlt($$1)), (dqk)$$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "primaryIcon;secondaryIcon;category", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "primaryIcon;secondaryIcon;category", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "primaryIcon;secondaryIcon;category", "a", "b", "c"}, this, $$0);
        }
    }
}

