/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

public class hpn
implements hop {
    private final List<hpp.k> a = new ArrayList<hpp.k>();
    private final List<hpp.d> b = new ArrayList<hpp.d>();
    private final igk.a c = new igk.a();
    private final List<hpp.l> d = new ArrayList<hpp.l>();
    private final List<hpp.f> e = new ArrayList<hpp.f>();
    private final List<hpp.b> f = new ArrayList<hpp.b>();
    private final List<hpp.i> g = new ArrayList<hpp.i>();
    private final List<hpp.a> h = new ArrayList<hpp.a>();
    private final List<hpp.e> i = new ArrayList<hpp.e>();
    private final List<hpo.b> j = new ArrayList<hpo.b>();
    private final igi.b k = new igi.b();
    private final igj.a l = new igj.a();
    private final igd.a m = new igd.a();
    private final hpp n;
    private boolean o = false;

    public hpn(hpp $$0) {
        this.n = $$0;
    }

    @Override
    public void a(fzm $$0, float $$1, List<idf.b> $$2) {
        this.o = true;
        fzm.a $$3 = $$0.c();
        this.a.add(new hpp.k(new Matrix4f((Matrix4fc)$$3.a()), $$1, $$2));
    }

    @Override
    public void a(fzm $$0, @Nullable ftm $$1, int $$2, yh $$3, boolean $$4, int $$5, double $$6, ikp $$7) {
        this.o = true;
        this.c.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public void a(fzm $$0, float $$1, float $$2, bfr $$3, boolean $$4, gio.a $$5, int $$6, int $$7, int $$8, int $$9) {
        this.o = true;
        this.d.add(new hpp.l(new Matrix4f((Matrix4fc)$$0.c().a()), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
    }

    @Override
    public void a(fzm $$0, idf $$1, Quaternionf $$2) {
        this.o = true;
        this.b.add(new hpp.d($$0.c().d(), $$1, $$2));
    }

    @Override
    public void a(fzm $$0, idf.a $$1) {
        this.o = true;
        this.e.add(new hpp.f(new Matrix4f((Matrix4fc)$$0.c().a()), $$1));
    }

    @Override
    public <S> void a(gzp<? super S> $$0, S $$1, fzm $$2, ijs $$3, int $$4, int $$5, int $$6, @Nullable ilp $$7, int $$8, @Nullable igi.a $$9) {
        this.o = true;
        hpp.h<? super S> $$10 = new hpp.h<S>($$2.c().d(), $$0, $$1, $$4, $$5, $$6, $$7, $$8, $$9);
        this.k.a($$3, $$10);
    }

    @Override
    public void a(hdg $$0, fzm $$1, ijs $$2, int $$3, int $$4, @Nullable ilp $$5, boolean $$6, boolean $$7, int $$8, @Nullable igi.a $$9, int $$10) {
        this.o = true;
        this.l.a($$2, new hpp.g($$1.c().d(), $$0, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10));
    }

    @Override
    public void a(fzm $$0, eoh $$1, int $$2, int $$3, int $$4) {
        this.o = true;
        this.f.add(new hpp.b($$0.c().d(), $$1, $$2, $$3, $$4));
        gfj.V().aK().c().a($$1.b(), dlr.a, $$0, this.n, $$2, $$3, $$4);
    }

    @Override
    public void a(fzm $$0, hpz $$1) {
        this.o = true;
        this.g.add(new hpp.i(new Matrix4f((Matrix4fc)$$0.c().a()), $$1));
    }

    @Override
    public void a(fzm $$0, ijs $$1, hqh $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8) {
        this.o = true;
        this.h.add(new hpp.a($$0.c().d(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8));
    }

    @Override
    public void a(fzm $$0, dlr $$1, int $$2, int $$3, int $$4, int[] $$5, List<hqa> $$6, ijs $$7, ihm.a $$8) {
        this.o = true;
        this.i.add(new hpp.e($$0.c().d(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8));
    }

    @Override
    public void a(fzm $$0, ijs $$1, hpo.a $$2) {
        this.o = true;
        this.m.a($$0, $$1, $$2);
    }

    @Override
    public void a(hpo.b $$0) {
        this.o = true;
        this.j.add($$0);
    }

    public List<hpp.k> a() {
        return this.a;
    }

    public List<hpp.d> b() {
        return this.b;
    }

    public igk.a c() {
        return this.c;
    }

    public List<hpp.l> d() {
        return this.d;
    }

    public List<hpp.f> e() {
        return this.e;
    }

    public List<hpp.b> f() {
        return this.f;
    }

    public List<hpp.i> g() {
        return this.g;
    }

    public List<hpp.a> h() {
        return this.h;
    }

    public igj.a i() {
        return this.l;
    }

    public List<hpp.e> j() {
        return this.i;
    }

    public List<hpo.b> k() {
        return this.j;
    }

    public igi.b l() {
        return this.k;
    }

    public igd.a m() {
        return this.m;
    }

    public boolean n() {
        return this.o;
    }

    public void o() {
        this.a.clear();
        this.b.clear();
        this.c.a();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.a();
        this.m.a();
        this.l.a();
    }

    public void p() {
        this.k.b();
        this.l.b();
        this.m.b();
        this.o = false;
    }
}

