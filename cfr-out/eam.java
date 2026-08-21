/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eam
extends edt {
    public static final MapCodec<eam> a = eam.b(eam::new);
    public static final epf<iz> b = edt.f;
    private @Nullable eom c;
    private @Nullable eom d;
    private @Nullable eom e;
    private @Nullable eom g;
    private @Nullable eom h;
    private @Nullable eom i;
    private static final Predicate<eoh> D = $$0 -> $$0.a(dzs.eJ) || $$0.a(dzs.eK);

    public MapCodec<? extends eam> a() {
        return a;
    }

    protected eam(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, iz.c));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$1, $$2);
    }

    public boolean a(dwr $$0, is $$1) {
        return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null || this.t().a($$0, $$1) != null;
    }

    private void a(dwo $$0, is $$1) {
        cwc $$7;
        cwh $$5;
        cwi $$3;
        eom.b $$2 = this.q().a($$0, $$1);
        if ($$2 != null && ($$3 = cgu.bt.a($$0, cgt.k)) != null) {
            eam.a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
            return;
        }
        eom.b $$4 = this.s().a($$0, $$1);
        if ($$4 != null && ($$5 = cgu.au.a($$0, cgt.k)) != null) {
            $$5.y(true);
            eam.a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            return;
        }
        eom.b $$6 = this.u().a($$0, $$1);
        if ($$6 != null && ($$7 = cgu.E.a($$0, cgt.k)) != null) {
            eam.a($$0, $$6, $$7, $$6.a(0, 0, 0).d());
            this.c($$0, $$6);
            $$7.b(this.a($$6));
        }
    }

    private ejq.a a(eom.b $$02) {
        eoh $$1 = $$02.a(0, 1, 0).a();
        dzq $$2 = $$1.b();
        if ($$2 instanceof ejq) {
            ejq $$3 = (ejq)((Object)$$2);
            return (ejq.a)$$3.c();
        }
        return (ejq.a)Optional.ofNullable((dzq)dlk.b.get().get((Object)$$1.b())).filter($$0 -> $$0 instanceof ejq).map($$0 -> (ejq)((Object)$$0)).orElse((ejq)((Object)dzs.rW)).c();
    }

    private static void a(dwo $$0, eom.b $$1, cgk $$2, is $$3) {
        eam.a($$0, $$1);
        $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0f, 0.0f);
        $$0.b($$2);
        for (axg $$4 : $$0.a(axg.class, $$2.dj().g(5.0))) {
            aj.o.a($$4, $$2);
        }
        eam.b($$0, $$1);
    }

    public static void a(dwo $$0, eom.b $$1) {
        for (int $$2 = 0; $$2 < $$1.d(); ++$$2) {
            for (int $$3 = 0; $$3 < $$1.e(); ++$$3) {
                eol $$4 = $$1.a($$2, $$3, 0);
                $$0.a($$4.d(), dzs.a.m(), 2);
                $$0.c(2001, $$4.d(), dzq.j($$4.a()));
            }
        }
    }

    public static void b(dwo $$0, eom.b $$1) {
        for (int $$2 = 0; $$2 < $$1.d(); ++$$2) {
            for (int $$3 = 0; $$3 < $$1.e(); ++$$3) {
                eol $$4 = $$1.a($$2, $$3, 0);
                $$0.a($$4.d(), dzs.a);
            }
        }
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.g().g());
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    private eom b() {
        if (this.c == null) {
            this.c = eon.a().a(" ", "#", "#").a('#', eol.a(eoq.a(dzs.er))).b();
        }
        return this.c;
    }

    private eom q() {
        if (this.d == null) {
            this.d = eon.a().a("^", "#", "#").a('^', eol.a(D)).a('#', eol.a(eoq.a(dzs.er))).b();
        }
        return this.d;
    }

    private eom r() {
        if (this.e == null) {
            this.e = eon.a().a("~ ~", "###", "~#~").a('#', eol.a(eoq.a(dzs.cs))).a('~', eol.a(eog.a::l)).b();
        }
        return this.e;
    }

    private eom s() {
        if (this.g == null) {
            this.g = eon.a().a("~^~", "###", "~#~").a('^', eol.a(D)).a('#', eol.a(eoq.a(dzs.cs))).a('~', eol.a(eog.a::l)).b();
        }
        return this.g;
    }

    private eom t() {
        if (this.h == null) {
            this.h = eon.a().a(" ", "#").a('#', eol.a((eoh $$0) -> $$0.a(bdp.ak))).b();
        }
        return this.h;
    }

    private eom u() {
        if (this.i == null) {
            this.i = eon.a().a("^", "#").a('^', eol.a(D)).a('#', eol.a((eoh $$0) -> $$0.a(bdp.ak))).b();
        }
        return this.i;
    }

    public void c(dwo $$0, eom.b $$1) {
        eol $$2 = $$1.a(0, 1, 0);
        eol $$3 = $$1.a(0, 0, 0);
        iz $$4 = $$3.a().c(b);
        eoh $$5 = ebg.a($$2.a().b(), $$4, $$0, $$2.d());
        $$0.a($$2.d(), $$5, 2);
    }
}

