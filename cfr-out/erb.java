/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class erb
extends eqf {
    private static final Logger m = LogUtils.getLogger();
    private volatile @Nullable fkq n;
    private volatile erj o = erj.c;
    private final List<uz> p = Lists.newArrayList();
    private @Nullable eqe q;
    private @Nullable eue r;
    private final fvc<dzq> s;
    private final fvc<fla> t;

    public erb(dvu $$0, erf $$1, dwq $$2, eqz $$3, @Nullable evt $$4) {
        this($$0, $$1, null, new fvc<dzq>(), new fvc<fla>(), $$2, $$3, $$4);
    }

    public erb(dvu $$0, erf $$1, eqr @Nullable [] $$2, fvc<dzq> $$3, fvc<fla> $$4, dwq $$5, eqz $$6, @Nullable evt $$7) {
        super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
        this.s = $$3;
        this.t = $$4;
    }

    @Override
    public fvh<dzq> q() {
        return this.s;
    }

    @Override
    public fvh<fla> r() {
        return this.t;
    }

    @Override
    public eqf.b a(long $$0) {
        return new eqf.b(this.s.a($$0), this.t.a($$0));
    }

    @Override
    public eoh a_(is $$0) {
        int $$1 = $$0.v();
        if (this.e($$1)) {
            return dzs.nY.m();
        }
        eqr $$2 = this.b(this.f($$1));
        if ($$2.c()) {
            return dzs.a.m();
        }
        return $$2.a($$0.u() & 0xF, $$1 & 0xF, $$0.w() & 0xF);
    }

    @Override
    public flb b_(is $$0) {
        int $$1 = $$0.v();
        if (this.e($$1)) {
            return flc.a.g();
        }
        eqr $$2 = this.b(this.f($$1));
        if ($$2.c()) {
            return flc.a.g();
        }
        return $$2.b($$0.u() & 0xF, $$1 & 0xF, $$0.w() & 0xF);
    }

    @Override
    public @Nullable eoh a(is $$0, eoh $$1, @dzq.b int $$2) {
        int $$3 = $$0.u();
        int $$4 = $$0.v();
        int $$5 = $$0.w();
        if (this.e($$4)) {
            return dzs.nY.m();
        }
        int $$6 = this.f($$4);
        eqr $$7 = this.b($$6);
        boolean $$8 = $$7.c();
        if ($$8 && $$1.a(dzs.a)) {
            return $$1;
        }
        int $$9 = jw.b($$3);
        int $$10 = jw.b($$4);
        int $$11 = jw.b($$5);
        eoh $$12 = $$7.a($$9, $$10, $$11, $$1);
        if (this.o.a(erj.k)) {
            boolean $$13 = $$7.c();
            if ($$13 != $$8) {
                this.n.a($$0, $$13);
            }
            if (fks.a($$12, $$1)) {
                this.h.a((dvt)this, $$9, $$4, $$11);
                this.n.a($$0);
            }
        }
        EnumSet<euq.a> $$14 = this.n().e();
        EnumSet<euq.a> $$15 = null;
        for (euq.a $$16 : $$14) {
            euq $$17 = (euq)this.g.get($$16);
            if ($$17 != null) continue;
            if ($$15 == null) {
                $$15 = EnumSet.noneOf(euq.a.class);
            }
            $$15.add($$16);
        }
        if ($$15 != null) {
            euq.a(this, $$15);
        }
        for (euq.a $$18 : $$14) {
            ((euq)this.g.get($$18)).a($$9, $$4, $$11, $$1);
        }
        return $$12;
    }

    @Override
    public void a(elb $$0) {
        this.i.remove($$0.aD_());
        this.j.put($$0.aD_(), $$0);
    }

    @Override
    public @Nullable elb c_(is $$0) {
        return (elb)this.j.get($$0);
    }

    public Map<is, elb> I() {
        return this.j;
    }

    public void b(uz $$0) {
        this.p.add($$0);
    }

    @Override
    public void a(cgk $$0) {
        if ($$0.cq()) {
            return;
        }
        try (bgp.j $$1 = new bgp.j($$0.es(), m);){
            fnp $$2 = fnp.a($$1, $$0.eo());
            $$0.c($$2);
            this.b($$2.b());
        }
    }

    @Override
    public void a(ffo $$0, ffw $$1) {
        eue $$2 = this.z();
        if ($$2 != null && $$1.b()) {
            ffg $$3 = $$1.a();
            dwq $$4 = this.B();
            if ($$3.i() < $$4.K_() || $$3.l() > $$4.aw()) {
                return;
            }
        }
        super.a($$0, $$1);
    }

    public List<uz> J() {
        return this.p;
    }

    @Override
    public erj n() {
        return this.o;
    }

    public void a(erj $$0) {
        this.o = $$0;
        if (this.r != null && $$0.a(this.r.a())) {
            this.a((eue)null);
        }
        this.i();
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2) {
        if (this.o().a(erj.f)) {
            return super.getNoiseBiome($$0, $$1, $$2);
        }
        throw new IllegalStateException("Asking for biomes before we have biomes");
    }

    public static short g(is $$0) {
        int $$1 = $$0.u();
        int $$2 = $$0.v();
        int $$3 = $$0.w();
        int $$4 = $$1 & 0xF;
        int $$5 = $$2 & 0xF;
        int $$6 = $$3 & 0xF;
        return (short)($$4 | $$5 << 4 | $$6 << 8);
    }

    public static is a(short $$0, int $$1, dvu $$2) {
        int $$3 = jw.a($$2.h, $$0 & 0xF);
        int $$4 = jw.a($$1, $$0 >>> 4 & 0xF);
        int $$5 = jw.a($$2.i, $$0 >>> 8 & 0xF);
        return new is($$3, $$4, $$5);
    }

    @Override
    public void e(is $$0) {
        if (!this.y($$0)) {
            eqf.a(this.b, this.f($$0.v())).add(erb.g($$0));
        }
    }

    @Override
    public void a(ShortList $$0, int $$1) {
        eqf.a(this.b, $$1).addAll($$0);
    }

    public Map<is, uz> K() {
        return Collections.unmodifiableMap(this.i);
    }

    @Override
    public @Nullable uz a(is $$0, jf.a $$1) {
        elb $$2 = this.c_($$0);
        if ($$2 != null) {
            return $$2.b($$1);
        }
        return (uz)this.i.get($$0);
    }

    @Override
    public void c(is $$0) {
        this.j.remove($$0);
        this.i.remove($$0);
    }

    public @Nullable eqe F() {
        return this.q;
    }

    public eqe G() {
        if (this.q == null) {
            this.q = new eqe(this.L_(), this.K_());
        }
        return this.q;
    }

    public void a(eqe $$0) {
        this.q = $$0;
    }

    public void a(fkq $$0) {
        this.n = $$0;
    }

    public void a(@Nullable eue $$0) {
        this.r = $$0;
    }

    @Override
    public @Nullable eue z() {
        return this.r;
    }

    private static <T> fuz<T> a(fvc<T> $$0) {
        return new fuz<T>($$0.b());
    }

    public fuz<dzq> L() {
        return erb.a(this.s);
    }

    public fuz<fla> M() {
        return erb.a(this.t);
    }

    @Override
    public dwq B() {
        if (this.A()) {
            return eue.b;
        }
        return this;
    }
}

