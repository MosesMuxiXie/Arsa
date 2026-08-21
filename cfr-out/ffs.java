/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class ffs {
    protected static final eoh e = dzs.nZ.m();
    protected ffg f;
    private @Nullable iz a;
    private eev b;
    private egm c;
    protected int g;
    private final fgf d;
    private static final Set<dzq> h = ImmutableSet.builder().add((Object)dzs.gd).add((Object)dzs.cL).add((Object)dzs.cM).add((Object)dzs.ex).add((Object)dzs.kX).add((Object)dzs.lc).add((Object)dzs.ld).add((Object)dzs.la).add((Object)dzs.kY).add((Object)dzs.kZ).add((Object)dzs.dm).add((Object)dzs.fC).build();

    protected ffs(fgf $$0, int $$1, ffg $$2) {
        this.d = $$0;
        this.g = $$1;
        this.f = $$2;
    }

    public ffs(fgf $$0, uz $$1) {
        this($$0, $$1.b("GD", 0), $$1.a("BB", ffg.a).orElseThrow());
        int $$2 = $$1.b("O", 0);
        this.a($$2 == -1 ? null : iz.b($$2));
    }

    protected static ffg a(int $$0, int $$1, int $$2, iz $$3, int $$4, int $$5, int $$6) {
        if ($$3.o() == iz.a.c) {
            return new ffg($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1);
        }
        return new ffg($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
    }

    protected static iz a(bgr $$0) {
        return iz.c.a.a($$0);
    }

    public final uz a(fge $$0) {
        uz $$1 = new uz();
        $$1.a("id", mi.Q.b(this.k()).toString());
        $$1.a("BB", ffg.a, this.f);
        iz $$2 = this.i();
        $$1.a("O", $$2 == null ? -1 : $$2.e());
        $$1.a("GD", this.g);
        this.a($$0, $$1);
        return $$1;
    }

    protected abstract void a(fge var1, uz var2);

    public void a(ffs $$0, fft $$1, bgr $$2) {
    }

    public abstract void a(dxn var1, dxk var2, eqg var3, bgr var4, ffg var5, dvu var6, is var7);

    public ffg f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    public boolean a(dvu $$0, int $$1) {
        int $$2 = $$0.e();
        int $$3 = $$0.f();
        return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
    }

    public is h() {
        return new is(this.f.g());
    }

    protected is.a b(int $$0, int $$1, int $$2) {
        return new is.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
    }

    protected int a(int $$0, int $$1) {
        iz $$2 = this.i();
        if ($$2 == null) {
            return $$0;
        }
        switch ($$2) {
            case c: 
            case d: {
                return this.f.h() + $$0;
            }
            case e: {
                return this.f.k() - $$1;
            }
            case f: {
                return this.f.h() + $$1;
            }
        }
        return $$0;
    }

    protected int b(int $$0) {
        if (this.i() == null) {
            return $$0;
        }
        return $$0 + this.f.i();
    }

    protected int b(int $$0, int $$1) {
        iz $$2 = this.i();
        if ($$2 == null) {
            return $$1;
        }
        switch ($$2) {
            case c: {
                return this.f.m() - $$1;
            }
            case d: {
                return this.f.j() + $$1;
            }
            case e: 
            case f: {
                return this.f.j() + $$0;
            }
        }
        return $$1;
    }

    protected void a(dxn $$0, eoh $$1, int $$2, int $$3, int $$4, ffg $$5) {
        is.a $$6 = this.b($$2, $$3, $$4);
        if (!$$5.b($$6)) {
            return;
        }
        if (!this.a($$0, $$2, $$3, $$4, $$5)) {
            return;
        }
        if (this.b != eev.a) {
            $$1 = $$1.a(this.b);
        }
        if (this.c != egm.a) {
            $$1 = $$1.a(this.c);
        }
        $$0.a((is)$$6, $$1, 2);
        flb $$7 = $$0.b_($$6);
        if (!$$7.c()) {
            $$0.a((is)$$6, $$7.a(), 0);
        }
        if (h.contains($$1.b())) {
            $$0.E($$6).e($$6);
        }
    }

    protected boolean a(dwr $$0, int $$1, int $$2, int $$3, ffg $$4) {
        return true;
    }

    protected eoh a(dvt $$0, int $$1, int $$2, int $$3, ffg $$4) {
        is.a $$5 = this.b($$1, $$2, $$3);
        if (!$$4.b($$5)) {
            return dzs.a.m();
        }
        return $$0.a_($$5);
    }

    protected boolean b(dwr $$0, int $$1, int $$2, int $$3, ffg $$4) {
        is.a $$5 = this.b($$1, $$2 + 1, $$3);
        if (!$$4.b($$5)) {
            return false;
        }
        return $$5.v() < $$0.a(euq.a.c, $$5.u(), $$5.w());
    }

    protected void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        for (int $$8 = $$3; $$8 <= $$6; ++$$8) {
            for (int $$9 = $$2; $$9 <= $$5; ++$$9) {
                for (int $$10 = $$4; $$10 <= $$7; ++$$10) {
                    this.a($$0, dzs.a.m(), $$9, $$8, $$10, $$1);
                }
            }
        }
    }

    protected void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eoh $$8, eoh $$9, boolean $$10) {
        for (int $$11 = $$3; $$11 <= $$6; ++$$11) {
            for (int $$12 = $$2; $$12 <= $$5; ++$$12) {
                for (int $$13 = $$4; $$13 <= $$7; ++$$13) {
                    if ($$10 && this.a((dvt)$$0, $$12, $$11, $$13, $$1).l()) continue;
                    if ($$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7) {
                        this.a($$0, $$8, $$12, $$11, $$13, $$1);
                        continue;
                    }
                    this.a($$0, $$9, $$12, $$11, $$13, $$1);
                }
            }
        }
    }

    protected void a(dxn $$0, ffg $$1, ffg $$2, eoh $$3, eoh $$4, boolean $$5) {
        this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
    }

    protected void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, bgr $$9, a $$10) {
        for (int $$11 = $$3; $$11 <= $$6; ++$$11) {
            for (int $$12 = $$2; $$12 <= $$5; ++$$12) {
                for (int $$13 = $$4; $$13 <= $$7; ++$$13) {
                    if ($$8 && this.a((dvt)$$0, $$12, $$11, $$13, $$1).l()) continue;
                    $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                    this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
                }
            }
        }
    }

    protected void a(dxn $$0, ffg $$1, ffg $$2, boolean $$3, bgr $$4, a $$5) {
        this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
    }

    protected void a(dxn $$0, ffg $$1, bgr $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, eoh $$10, eoh $$11, boolean $$12, boolean $$13) {
        for (int $$14 = $$5; $$14 <= $$8; ++$$14) {
            for (int $$15 = $$4; $$15 <= $$7; ++$$15) {
                for (int $$16 = $$6; $$16 <= $$9; ++$$16) {
                    if ($$2.i() > $$3 || $$12 && this.a((dvt)$$0, $$15, $$14, $$16, $$1).l() || $$13 && !this.b($$0, $$15, $$14, $$16, $$1)) continue;
                    if ($$14 == $$5 || $$14 == $$8 || $$15 == $$4 || $$15 == $$7 || $$16 == $$6 || $$16 == $$9) {
                        this.a($$0, $$10, $$15, $$14, $$16, $$1);
                        continue;
                    }
                    this.a($$0, $$11, $$15, $$14, $$16, $$1);
                }
            }
        }
    }

    protected void a(dxn $$0, ffg $$1, bgr $$2, float $$3, int $$4, int $$5, int $$6, eoh $$7) {
        if ($$2.i() < $$3) {
            this.a($$0, $$7, $$4, $$5, $$6, $$1);
        }
    }

    protected void a(dxn $$0, ffg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eoh $$8, boolean $$9) {
        float $$10 = $$5 - $$2 + 1;
        float $$11 = $$6 - $$3 + 1;
        float $$12 = $$7 - $$4 + 1;
        float $$13 = (float)$$2 + $$10 / 2.0f;
        float $$14 = (float)$$4 + $$12 / 2.0f;
        for (int $$15 = $$3; $$15 <= $$6; ++$$15) {
            float $$16 = (float)($$15 - $$3) / $$11;
            for (int $$17 = $$2; $$17 <= $$5; ++$$17) {
                float $$18 = ((float)$$17 - $$13) / ($$10 * 0.5f);
                for (int $$19 = $$4; $$19 <= $$7; ++$$19) {
                    float $$21;
                    float $$20 = ((float)$$19 - $$14) / ($$12 * 0.5f);
                    if ($$9 && this.a((dvt)$$0, $$17, $$15, $$19, $$1).l() || !(($$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20) <= 1.05f)) continue;
                    this.a($$0, $$8, $$17, $$15, $$19, $$1);
                }
            }
        }
    }

    protected void b(dxn $$0, eoh $$1, int $$2, int $$3, int $$4, ffg $$5) {
        is.a $$6 = this.b($$2, $$3, $$4);
        if (!$$5.b($$6)) {
            return;
        }
        while (this.a($$0.a_($$6)) && $$6.v() > $$0.K_() + 1) {
            $$0.a((is)$$6, $$1, 2);
            $$6.c(iz.a);
        }
    }

    protected boolean a(eoh $$0) {
        return $$0.l() || $$0.n() || $$0.a(dzs.fO) || $$0.a(dzs.bG) || $$0.a(dzs.bH);
    }

    protected boolean a(dxn $$0, ffg $$1, bgr $$2, int $$3, int $$4, int $$5, amt<fof> $$6) {
        return this.a((dxf)$$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
    }

    public static eoh a(dvt $$0, is $$1, eoh $$2) {
        iz $$3 = null;
        for (iz $$4 : iz.c.a) {
            is $$5 = $$1.a($$4);
            eoh $$6 = $$0.a_($$5);
            if ($$6.a(dzs.cS)) {
                return $$2;
            }
            if (!$$6.s()) continue;
            if ($$3 == null) {
                $$3 = $$4;
                continue;
            }
            $$3 = null;
            break;
        }
        if ($$3 != null) {
            return (eoh)$$2.b(edt.f, $$3.g());
        }
        iz $$7 = $$2.c(edt.f);
        is $$8 = $$1.a($$7);
        if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
        }
        if ($$0.a_($$8).s()) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
        }
        if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
        }
        return (eoh)$$2.b(edt.f, $$7);
    }

    protected boolean a(dxf $$0, ffg $$1, bgr $$2, is $$3, amt<fof> $$4, @Nullable eoh $$5) {
        if (!$$1.b($$3) || $$0.a_($$3).a(dzs.cS)) {
            return false;
        }
        if ($$5 == null) {
            $$5 = ffs.a($$0, $$3, dzs.cS.m());
        }
        $$0.a($$3, $$5, 2);
        elb $$6 = $$0.c_($$3);
        if ($$6 instanceof elj) {
            ((elj)$$6).a($$4, $$2.g());
        }
        return true;
    }

    protected boolean a(dxn $$0, ffg $$1, bgr $$2, int $$3, int $$4, int $$5, iz $$6, amt<fof> $$7) {
        is.a $$8 = this.b($$3, $$4, $$5);
        if ($$1.b($$8) && !$$0.a_($$8).a(dzs.bb)) {
            this.a($$0, (eoh)dzs.bb.m().b(eby.b, $$6), $$3, $$4, $$5, $$1);
            elb $$9 = $$0.c_($$8);
            if ($$9 instanceof elx) {
                ((elx)$$9).a($$7, $$2.g());
            }
            return true;
        }
        return false;
    }

    public void a(int $$0, int $$1, int $$2) {
        this.f.a($$0, $$1, $$2);
    }

    public static ffg a(Stream<ffs> $$0) {
        return ffg.b($$0.map(ffs::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
    }

    public static @Nullable ffs a(List<ffs> $$0, ffg $$1) {
        for (ffs $$2 : $$0) {
            if (!$$2.f().a($$1)) continue;
            return $$2;
        }
        return null;
    }

    public @Nullable iz i() {
        return this.a;
    }

    public void a(@Nullable iz $$0) {
        this.a = $$0;
        if ($$0 == null) {
            this.c = egm.a;
            this.b = eev.a;
        } else {
            switch ($$0) {
                case d: {
                    this.b = eev.b;
                    this.c = egm.a;
                    break;
                }
                case e: {
                    this.b = eev.b;
                    this.c = egm.b;
                    break;
                }
                case f: {
                    this.b = eev.a;
                    this.c = egm.b;
                    break;
                }
                default: {
                    this.b = eev.a;
                    this.c = egm.a;
                }
            }
        }
    }

    public egm a() {
        return this.c;
    }

    public eev j() {
        return this.b;
    }

    public fgf k() {
        return this.d;
    }

    public static abstract class a {
        protected eoh a = dzs.a.m();

        public abstract void a(bgr var1, int var2, int var3, int var4, boolean var5);

        public eoh a() {
            return this.a;
        }
    }
}

