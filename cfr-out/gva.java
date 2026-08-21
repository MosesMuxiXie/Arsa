/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public class gva
extends gsb {
    private static final yh a = yh.c("structure_block.structure_name");
    private static final yh b = yh.c("structure_block.position");
    private static final yh c = yh.c("structure_block.size");
    private static final yh d = yh.c("structure_block.integrity");
    private static final yh e = yh.c("structure_block.custom_data");
    private static final yh f = yh.c("structure_block.include_entities");
    private static final yh t = yh.c("structure_block.strict");
    private static final yh u = yh.c("structure_block.detect_size");
    private static final yh v = yh.c("structure_block.show_air");
    private static final yh w = yh.c("structure_block.show_boundingbox");
    private static final ImmutableList<eps> x = ImmutableList.copyOf((Object[])eps.values());
    private static final ImmutableList<eps> y = (ImmutableList)x.stream().filter($$0 -> $$0 != eps.d).collect(ImmutableList.toImmutableList());
    private final emx z;
    private eev A = eev.a;
    private egm B = egm.a;
    private eps C = eps.d;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private gjn H;
    private gjn I;
    private gjn J;
    private gjn K;
    private gjn L;
    private gjn M;
    private gjn N;
    private gjn O;
    private gjn P;
    private gjn Q;
    private gje R;
    private gje S;
    private gje T;
    private gje U;
    private gje V;
    private gje W;
    private gje X;
    private gjl<Boolean> Y;
    private gjl<Boolean> Z;
    private gjl<eev> aa;
    private gjl<Boolean> ab;
    private gjl<Boolean> ac;
    private final DecimalFormat ad = new DecimalFormat("0.0###", DecimalFormatSymbols.getInstance(Locale.ROOT));

    public gva(emx $$0) {
        super(yh.c(dzs.pY.z()));
        this.z = $$0;
    }

    private void o() {
        if (this.a(emx.a.a)) {
            this.n.a((gsb)null);
        }
    }

    private void p() {
        this.z.a(this.A);
        this.z.a(this.B);
        this.z.a(this.C);
        this.z.a(this.D);
        this.z.b(this.E);
        this.z.e(this.F);
        this.z.f(this.G);
        this.n.a((gsb)null);
    }

    @Override
    protected void bg_() {
        this.c(gje.a(yg.d, (gje $$0) -> this.o()).a(this.o / 2 - 4 - 150, 210, 150, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.p()).a(this.o / 2 + 4, 210, 150, 20).a());
        this.A = this.z.l();
        this.B = this.z.m();
        this.C = this.z.x();
        this.D = this.z.y();
        this.E = this.z.z();
        this.F = this.z.H();
        this.G = this.z.I();
        this.R = this.c(gje.a(yh.c("structure_block.button.save"), (gje $$0) -> {
            if (this.z.x() == eps.a) {
                this.a(emx.a.b);
                this.n.a((gsb)null);
            }
        }).a(this.o / 2 + 4 + 100, 185, 50, 20).a());
        this.S = this.c(gje.a(yh.c("structure_block.button.load"), (gje $$0) -> {
            if (this.z.x() == eps.b) {
                this.a(emx.a.c);
                this.n.a((gsb)null);
            }
        }).a(this.o / 2 + 4 + 100, 185, 50, 20).a());
        this.c(gjl.a((T $$0) -> yh.c("structure_block.mode." + $$0.c()), this.C).a((List<eps>)y, (List<eps>)x).a().a(this.o / 2 - 4 - 150, 185, 50, 20, yh.b("MODE"), ($$0, $$1) -> {
            this.z.a((eps)$$1);
            this.a((eps)$$1);
        }));
        this.X = this.c(gje.a(yh.c("structure_block.button.detect_size"), (gje $$0) -> {
            if (this.z.x() == eps.a) {
                this.a(emx.a.d);
                this.n.a((gsb)null);
            }
        }).a(this.o / 2 + 4 + 100, 120, 50, 20).a());
        this.Y = this.c(gjl.a(!this.z.y()).a().a(this.o / 2 + 4 + 100, 160, 50, 20, f, ($$0, $$1) -> this.z.a($$1 == false)));
        this.Z = this.c(gjl.a(this.z.z()).a().a(this.o / 2 + 4 + 100, 120, 50, 20, t, ($$0, $$1) -> this.z.b((boolean)$$1)));
        this.aa = this.c(gjl.a(eev::b, this.A).a((eev[])eev.values()).a().a(this.o / 2 - 20, 185, 40, 20, yh.b("MIRROR"), ($$0, $$1) -> this.z.a((eev)$$1)));
        this.ab = this.c(gjl.a(this.z.H()).a().a(this.o / 2 + 4 + 100, 80, 50, 20, v, ($$0, $$1) -> this.z.e((boolean)$$1)));
        this.ac = this.c(gjl.a(this.z.I()).a().a(this.o / 2 + 4 + 100, 80, 50, 20, w, ($$0, $$1) -> this.z.f((boolean)$$1)));
        this.T = this.c(gje.a(yh.b("0"), (gje $$0) -> {
            this.z.a(egm.a);
            this.F();
        }).a(this.o / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
        this.U = this.c(gje.a(yh.b("90"), (gje $$0) -> {
            this.z.a(egm.b);
            this.F();
        }).a(this.o / 2 - 1 - 40 - 20, 185, 40, 20).a());
        this.V = this.c(gje.a(yh.b("180"), (gje $$0) -> {
            this.z.a(egm.c);
            this.F();
        }).a(this.o / 2 + 1 + 20, 185, 40, 20).a());
        this.W = this.c(gje.a(yh.b("270"), (gje $$0) -> {
            this.z.a(egm.d);
            this.F();
        }).a(this.o / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
        this.H = new gjn(this.q, this.o / 2 - 152, 40, 300, 20, (yh)yh.c("structure_block.structure_name")){

            @Override
            public boolean a(gyy $$0) {
                if (!gva.this.a(this.a(), $$0.c(), this.e())) {
                    return false;
                }
                return super.a($$0);
            }
        };
        this.H.k(128);
        this.H.a(this.z.d());
        this.d(this.H);
        is $$02 = this.z.h();
        this.I = new gjn(this.q, this.o / 2 - 152, 80, 80, 20, yh.c("structure_block.position.x"));
        this.I.k(15);
        this.I.a(Integer.toString($$02.u()));
        this.d(this.I);
        this.J = new gjn(this.q, this.o / 2 - 72, 80, 80, 20, yh.c("structure_block.position.y"));
        this.J.k(15);
        this.J.a(Integer.toString($$02.v()));
        this.d(this.J);
        this.K = new gjn(this.q, this.o / 2 + 8, 80, 80, 20, yh.c("structure_block.position.z"));
        this.K.k(15);
        this.K.a(Integer.toString($$02.w()));
        this.d(this.K);
        jy $$12 = this.z.k();
        this.L = new gjn(this.q, this.o / 2 - 152, 120, 80, 20, yh.c("structure_block.size.x"));
        this.L.k(15);
        this.L.a(Integer.toString($$12.u()));
        this.d(this.L);
        this.M = new gjn(this.q, this.o / 2 - 72, 120, 80, 20, yh.c("structure_block.size.y"));
        this.M.k(15);
        this.M.a(Integer.toString($$12.v()));
        this.d(this.M);
        this.N = new gjn(this.q, this.o / 2 + 8, 120, 80, 20, yh.c("structure_block.size.z"));
        this.N.k(15);
        this.N.a(Integer.toString($$12.w()));
        this.d(this.N);
        this.O = new gjn(this.q, this.o / 2 - 152, 120, 80, 20, yh.c("structure_block.integrity.integrity"));
        this.O.k(15);
        this.O.a(this.ad.format(this.z.A()));
        this.d(this.O);
        this.P = new gjn(this.q, this.o / 2 - 72, 120, 80, 20, yh.c("structure_block.integrity.seed"));
        this.P.k(31);
        this.P.a(Long.toString(this.z.B()));
        this.d(this.P);
        this.Q = new gjn(this.q, this.o / 2 - 152, 120, 240, 20, yh.c("structure_block.custom_data"));
        this.Q.k(128);
        this.Q.a(this.z.w());
        this.d(this.Q);
        this.F();
        this.a(this.C);
    }

    @Override
    protected void aI_() {
        this.b(this.H);
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.H.a();
        String $$3 = this.I.a();
        String $$4 = this.J.a();
        String $$5 = this.K.a();
        String $$6 = this.L.a();
        String $$7 = this.M.a();
        String $$8 = this.N.a();
        String $$9 = this.O.a();
        String $$10 = this.P.a();
        String $$11 = this.Q.a();
        this.b($$0, $$1);
        this.H.a($$2);
        this.I.a($$3);
        this.J.a($$4);
        this.K.a($$5);
        this.L.a($$6);
        this.M.a($$7);
        this.N.a($$8);
        this.O.a($$9);
        this.P.a($$10);
        this.Q.a($$11);
    }

    private void F() {
        this.T.k = true;
        this.U.k = true;
        this.V.k = true;
        this.W.k = true;
        switch (this.z.m()) {
            case a: {
                this.T.k = false;
                break;
            }
            case c: {
                this.V.k = false;
                break;
            }
            case d: {
                this.W.k = false;
                break;
            }
            case b: {
                this.U.k = false;
            }
        }
    }

    private void a(eps $$0) {
        this.H.j(false);
        this.I.j(false);
        this.J.j(false);
        this.K.j(false);
        this.L.j(false);
        this.M.j(false);
        this.N.j(false);
        this.O.j(false);
        this.P.j(false);
        this.Q.j(false);
        this.R.l = false;
        this.S.l = false;
        this.X.l = false;
        this.Y.l = false;
        this.Z.l = false;
        this.aa.l = false;
        this.T.l = false;
        this.U.l = false;
        this.V.l = false;
        this.W.l = false;
        this.ab.l = false;
        this.ac.l = false;
        switch ($$0) {
            case a: {
                this.H.j(true);
                this.I.j(true);
                this.J.j(true);
                this.K.j(true);
                this.L.j(true);
                this.M.j(true);
                this.N.j(true);
                this.R.l = true;
                this.X.l = true;
                this.Y.l = true;
                this.Z.l = false;
                this.ab.l = true;
                break;
            }
            case b: {
                this.H.j(true);
                this.I.j(true);
                this.J.j(true);
                this.K.j(true);
                this.O.j(true);
                this.P.j(true);
                this.S.l = true;
                this.Y.l = true;
                this.Z.l = true;
                this.aa.l = true;
                this.T.l = true;
                this.U.l = true;
                this.V.l = true;
                this.W.l = true;
                this.ac.l = true;
                this.F();
                break;
            }
            case c: {
                this.H.j(true);
                break;
            }
            case d: {
                this.Q.j(true);
            }
        }
    }

    private boolean a(emx.a $$0) {
        is $$1 = new is(this.c(this.I.a()), this.c(this.J.a()), this.c(this.K.a()));
        jy $$2 = new jy(this.c(this.L.a()), this.c(this.M.a()), this.c(this.N.a()));
        float $$3 = this.b(this.O.a());
        long $$4 = this.a(this.P.a());
        this.n.R().b(new ajy(this.z.aD_(), $$0, this.z.x(), this.H.a(), $$1, $$2, this.z.l(), this.z.m(), this.Q.a(), this.z.y(), this.z.z(), this.z.H(), this.z.I(), $$3, $$4));
        return true;
    }

    private long a(String $$0) {
        try {
            return Long.valueOf($$0);
        }
        catch (NumberFormatException $$1) {
            return 0L;
        }
    }

    private float b(String $$0) {
        try {
            return Float.valueOf($$0).floatValue();
        }
        catch (NumberFormatException $$1) {
            return 1.0f;
        }
    }

    private int c(String $$0) {
        try {
            return Integer.parseInt($$0);
        }
        catch (NumberFormatException $$1) {
            return 0;
        }
    }

    @Override
    public void aX_() {
        this.p();
    }

    @Override
    public boolean a(gzb $$0) {
        if (super.a($$0)) {
            return true;
        }
        if ($$0.d()) {
            this.o();
            return true;
        }
        return false;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        eps $$4 = this.z.x();
        $$0.a(this.q, this.m, this.o / 2, 10, -1);
        if ($$4 != eps.d) {
            $$0.b(this.q, a, this.o / 2 - 153, 30, -6250336);
            this.H.a($$0, $$1, $$2, $$3);
        }
        if ($$4 == eps.b || $$4 == eps.a) {
            $$0.b(this.q, b, this.o / 2 - 153, 70, -6250336);
            this.I.a($$0, $$1, $$2, $$3);
            this.J.a($$0, $$1, $$2, $$3);
            this.K.a($$0, $$1, $$2, $$3);
            $$0.b(this.q, f, this.o / 2 + 154 - this.q.a(f), 150, -6250336);
        }
        if ($$4 == eps.a) {
            $$0.b(this.q, c, this.o / 2 - 153, 110, -6250336);
            this.L.a($$0, $$1, $$2, $$3);
            this.M.a($$0, $$1, $$2, $$3);
            this.N.a($$0, $$1, $$2, $$3);
            $$0.b(this.q, u, this.o / 2 + 154 - this.q.a(u), 110, -6250336);
            $$0.b(this.q, v, this.o / 2 + 154 - this.q.a(v), 70, -6250336);
        }
        if ($$4 == eps.b) {
            $$0.b(this.q, d, this.o / 2 - 153, 110, -6250336);
            this.O.a($$0, $$1, $$2, $$3);
            this.P.a($$0, $$1, $$2, $$3);
            $$0.b(this.q, t, this.o / 2 + 154 - this.q.a(t), 110, -6250336);
            $$0.b(this.q, w, this.o / 2 + 154 - this.q.a(w), 70, -6250336);
        }
        if ($$4 == eps.d) {
            $$0.b(this.q, e, this.o / 2 - 153, 110, -6250336);
            this.Q.a($$0, $$1, $$2, $$3);
        }
        $$0.b(this.q, $$4.a(), this.o / 2 - 153, 174, -6250336);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean v() {
        return true;
    }
}

