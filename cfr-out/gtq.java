/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class gtq
extends gsb {
    public static final int a = 114;
    public static final int b = 126;
    public static final int c = 192;
    public static final int d = 192;
    public static final int e = 256;
    public static final int f = 256;
    private static final int t = 4;
    private static final int u = 98;
    private static final int v = 157;
    private static final int w = 43;
    private static final int x = 116;
    private static final int y = 16;
    private static final int z = 148;
    private static final yh A = yh.c("book.edit.title");
    private static final yh B = yh.c("book.signButton");
    private final ddm C;
    private final dlt D;
    private final gtr E;
    private int F;
    private final List<String> G = Lists.newArrayList();
    private guu H;
    private guu I;
    private final cdb J;
    private yh K = yg.a;
    private gjx L;

    public gtq(ddm $$0, dlt $$1, cdb $$2, dpk $$3) {
        super(A);
        this.C = $$0;
        this.D = $$1;
        this.J = $$2;
        $$3.a(gfj.V().aW()).forEach(this.G::add);
        if (this.G.isEmpty()) {
            this.G.add("");
        }
        this.E = new gtr(this, $$0, $$2, this.G);
    }

    private int o() {
        return this.G.size();
    }

    @Override
    protected void bg_() {
        int $$02 = this.p();
        int $$1 = this.F();
        int $$2 = 8;
        this.L = gjx.v().c(false).c(-16777216).d(-16777216).b(false).a(false).a((this.o - 114) / 2 - 8).b(28).a(this.q, 122, 134, yg.a);
        this.L.a(1024);
        this.L.b(126 / this.q.b);
        this.L.b((String $$0) -> this.G.set(this.F, (String)$$0));
        this.c(this.L);
        this.M();
        this.K = this.J();
        this.I = this.c(new guu($$02 + 43, $$1 + 157, false, $$0 -> this.K(), true));
        this.H = this.c(new guu($$02 + 116, $$1 + 157, true, $$0 -> this.L(), true));
        this.c(gje.a(B, (gje $$0) -> this.n.a(this.E)).a(this.o / 2 - 98 - 2, this.I()).a(98).a());
        this.c(gje.a(yg.d, (gje $$0) -> {
            this.n.a((gsb)null);
            this.P();
        }).a(this.o / 2 + 2, this.I()).a(98).a());
        this.N();
    }

    private int p() {
        return (this.o - 192) / 2;
    }

    private int F() {
        return 2;
    }

    private int I() {
        return this.F() + 192 + 2;
    }

    @Override
    protected void aI_() {
        this.b(this.L);
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), this.J()});
    }

    private yh J() {
        return yh.a("book.pageIndicator", this.F + 1, this.o()).b(-16777216).j();
    }

    private void K() {
        if (this.F > 0) {
            --this.F;
            this.M();
        }
        this.N();
    }

    private void L() {
        if (this.F < this.o() - 1) {
            ++this.F;
        } else {
            this.R();
            if (this.F < this.o() - 1) {
                ++this.F;
            }
        }
        this.M();
        this.N();
    }

    private void M() {
        this.L.a(this.G.get(this.F), true);
        this.K = this.J();
    }

    private void N() {
        this.I.l = this.F > 0;
    }

    private void O() {
        ListIterator<String> $$0 = this.G.listIterator(this.G.size());
        while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
            $$0.remove();
        }
    }

    private void P() {
        this.O();
        this.Q();
        int $$0 = this.J == cdb.a ? this.C.gK().g() : 40;
        this.n.R().b(new aiw($$0, this.G, Optional.empty()));
    }

    private void Q() {
        this.D.b(ki.ab, new dpk(this.G.stream().map(axx::a).toList()));
    }

    private void R() {
        if (this.o() >= 100) {
            return;
        }
        this.G.add("");
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public boolean a(gzb $$0) {
        switch ($$0.t()) {
            case 266: {
                this.I.a((gza)$$0);
                return true;
            }
            case 267: {
                this.H.a((gza)$$0);
                return true;
            }
        }
        return super.a($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.a($$0.h());
    }

    private void a(gil $$0) {
        int $$1 = this.p();
        int $$2 = this.F();
        $$0.a(git.c, $$1 + 148, $$2 + 16, this.K);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        super.b($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, gts.e, this.p(), this.F(), 0.0f, 0.0f, 192, 192, 256, 256);
    }
}

