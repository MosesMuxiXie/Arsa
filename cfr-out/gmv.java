/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class gmv
extends gmk
implements gki,
gpb {
    private static final int a = -1;
    private static final int b = 400;
    private static final int c = 24;
    private static final int d = 14;
    private static final yh e = yh.c("narration.tab_navigation.usage");
    private final goy f = goy.e();
    private int g;
    private final gmu h;
    private final ImmutableList<gmt> i;
    private final ImmutableList<gkq> j;

    gmv(int $$0, gmu $$1, Iterable<gmt> $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = ImmutableList.copyOf($$2);
        this.f.c().b();
        ImmutableList.Builder $$3 = ImmutableList.builder();
        for (gmt $$4 : $$2) {
            $$3.add((Object)this.f.a(new gkq($$1, $$4, 0, 24)));
        }
        this.j = $$3.build();
    }

    public static a a(gmu $$0, int $$1) {
        return new a($$0, $$1);
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return $$0 >= (double)this.f.aT_() && $$1 >= (double)this.f.aU_() && $$0 < (double)(this.f.aT_() + this.f.aS_()) && $$1 < (double)(this.f.aU_() + this.f.aR_());
    }

    @Override
    public void b(boolean $$0) {
        super.b($$0);
        if (this.aO_() != null) {
            this.a((gmm)null);
        }
    }

    @Override
    public void a(@Nullable gmm $$0) {
        gkq $$1;
        super.a($$0);
        if ($$0 instanceof gkq && ($$1 = (gkq)$$0).b()) {
            this.h.a($$1.a(), true);
        }
    }

    @Override
    public @Nullable gin a(gpi $$0) {
        gkq $$1;
        if (!this.aP_() && ($$1 = this.j()) != null) {
            return gin.a(this, gin.a($$1));
        }
        if ($$0 instanceof gpi.c) {
            return null;
        }
        return super.a($$0);
    }

    @Override
    public List<? extends gmm> aJ_() {
        return this.j;
    }

    public List<gmt> d() {
        return this.i;
    }

    @Override
    public gpb.a y() {
        return this.j.stream().map(gjc::y).max(Comparator.naturalOrder()).orElse(gpb.a.a);
    }

    @Override
    public void b(gpd $$0) {
        Optional<gkq> $$12 = this.j.stream().filter(gjc::C).findFirst().or(() -> Optional.ofNullable(this.j()));
        $$12.ifPresent($$1 -> {
            this.a($$0.a(), (gkq)$$1);
            $$1.b($$0);
        });
        if (this.aP_()) {
            $$0.a(gpc.d, e);
        }
    }

    protected void a(gpd $$0, gkq $$1) {
        int $$2;
        if (this.i.size() > 1 && ($$2 = this.j.indexOf((Object)$$1)) != -1) {
            $$0.a(gpc.b, (yh)yh.a("narrator.position.tab", $$2 + 1, this.i.size()));
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        $$0.a(hpa.at, gsb.h, 0, this.f.aU_() + this.f.aR_() - 2, 0.0f, 0.0f, ((gkq)this.j.get(0)).aT_(), 2, 32, 2);
        int $$4 = ((gkq)this.j.get(this.j.size() - 1)).E();
        $$0.a(hpa.at, gsb.h, $$4, this.f.aU_() + this.f.aR_() - 2, 0.0f, 0.0f, this.g, 2, 32, 2);
        for (gkq $$5 : this.j) {
            $$5.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public gpm aV_() {
        return this.f.aV_();
    }

    public void h() {
        int $$0 = Math.min(400, this.g) - 28;
        int $$1 = bgj.e($$0 / this.i.size(), 2);
        for (gkq $$2 : this.j) {
            $$2.c($$1);
        }
        this.f.a();
        this.f.f(bgj.e((this.g - $$0) / 2, 2));
        this.f.g(0);
    }

    public void a(int $$0, boolean $$1) {
        if (this.aP_()) {
            this.a((gmm)this.j.get($$0));
        } else if (((gkq)this.j.get($$0)).b()) {
            this.h.a((gmt)this.i.get($$0), $$1);
        }
    }

    public void b(int $$0, boolean $$1) {
        if ($$0 >= 0 && $$0 < this.j.size()) {
            ((gkq)this.j.get((int)$$0)).k = $$1;
        }
    }

    public void a(int $$0, @Nullable gks $$1) {
        if ($$0 >= 0 && $$0 < this.j.size()) {
            ((gkq)this.j.get($$0)).a($$1);
        }
    }

    @Override
    public boolean a(gzb $$0) {
        int $$1;
        if ($$0.o() && ($$1 = this.c($$0)) != -1) {
            this.a(bgj.a($$1, 0, this.i.size() - 1), true);
            return true;
        }
        return false;
    }

    private int c(gzb $$0) {
        return this.a(this.i(), $$0);
    }

    private int a(int $$0, gzb $$1) {
        int $$2 = $$1.k();
        if ($$2 != -1) {
            return Math.floorMod($$2 - 1, 10);
        }
        if ($$1.j() && $$0 != -1) {
            int $$3 = $$1.m() ? $$0 - 1 : $$0 + 1;
            int $$4 = Math.floorMod($$3, this.i.size());
            if (((gkq)this.j.get((int)$$4)).k) {
                return $$4;
            }
            return this.a($$4, $$1);
        }
        return -1;
    }

    private int i() {
        gmt $$0 = this.h.a();
        int $$1 = this.i.indexOf((Object)$$0);
        return $$1 != -1 ? $$1 : -1;
    }

    private @Nullable gkq j() {
        int $$0 = this.i();
        return $$0 != -1 ? (gkq)this.j.get($$0) : null;
    }

    public static class a {
        private final int a;
        private final gmu b;
        private final List<gmt> c = new ArrayList<gmt>();

        a(gmu $$0, int $$1) {
            this.b = $$0;
            this.a = $$1;
        }

        public a a(gmt ... $$0) {
            Collections.addAll(this.c, $$0);
            return this;
        }

        public gmv a() {
            return new gmv(this.a, this.b, this.c);
        }
    }
}

