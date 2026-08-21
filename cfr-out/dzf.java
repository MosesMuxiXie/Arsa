/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class dzf
extends dzq
implements ehg {
    public static final eoy a = eox.I;
    private static final fug b = dzq.b(16.0, 0.0, 2.0);
    private static final fug c = dzq.b(16.0, 0.0, 8.0);
    private final boolean d;

    public static boolean a(dwo $$0, is $$1) {
        return dzf.h($$0.a_($$1));
    }

    public static boolean h(eoh $$0) {
        return $$0.a(bdp.L) && $$0.b() instanceof dzf;
    }

    protected dzf(boolean $$0, eog.d $$1) {
        super($$1);
        this.d = $$0;
    }

    protected abstract MapCodec<? extends dzf> a();

    public boolean b() {
        return this.d;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(this.c()).b() ? c : b;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return dzf.c($$1, $$2.e());
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$0, $$1, $$2, $$4);
    }

    protected eoh a(eoh $$0, dwo $$1, is $$2, boolean $$3) {
        $$0 = this.a($$1, $$2, $$0, true);
        if (this.d) {
            $$1.a($$0, $$2, this, null, $$3);
        }
        return $$0;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_() || !$$1.a_($$2).a(this)) {
            return;
        }
        epl $$6 = $$0.c(this.c());
        if (dzf.a($$2, $$1, $$6)) {
            dzf.b($$0, $$1, $$2);
            $$1.a($$2, $$5);
        } else {
            this.a($$0, $$1, $$2, $$3);
        }
    }

    private static boolean a(is $$0, dwo $$1, epl $$2) {
        if (!dzf.c($$1, $$0.e())) {
            return true;
        }
        switch ($$2) {
            case c: {
                return !dzf.c($$1, $$0.i());
            }
            case d: {
                return !dzf.c($$1, $$0.h());
            }
            case e: {
                return !dzf.c($$1, $$0.f());
            }
            case f: {
                return !dzf.c($$1, $$0.g());
            }
        }
        return false;
    }

    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3) {
    }

    protected eoh a(dwo $$0, is $$1, eoh $$2, boolean $$3) {
        if ($$0.B_()) {
            return $$2;
        }
        epl $$4 = $$2.c(this.c());
        return new efz($$0, $$1, $$2).a($$0.I($$1), $$3, $$4).c();
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if ($$3) {
            return;
        }
        if ($$0.c(this.c()).b()) {
            $$1.a($$2.d(), this);
        }
        if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.e(), this);
        }
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == flc.c;
        eoh $$3 = super.m();
        iz $$4 = $$0.g();
        boolean $$5 = $$4 == iz.f || $$4 == iz.e;
        return (eoh)((eoh)$$3.b(this.c(), $$5 ? epl.b : epl.a)).b(a, $$2);
    }

    public abstract epk<epl> c();

    protected epl a(epl $$0, egm $$1) {
        return switch ($$1) {
            case egm.c -> {
                switch ($$0) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case a: {
                        yield epl.a;
                    }
                    case b: {
                        yield epl.b;
                    }
                    case c: {
                        yield epl.d;
                    }
                    case d: {
                        yield epl.c;
                    }
                    case e: {
                        yield epl.f;
                    }
                    case f: {
                        yield epl.e;
                    }
                    case g: {
                        yield epl.i;
                    }
                    case h: {
                        yield epl.j;
                    }
                    case i: {
                        yield epl.g;
                    }
                    case j: 
                }
                yield epl.h;
            }
            case egm.d -> {
                switch ($$0) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case a: {
                        yield epl.b;
                    }
                    case b: {
                        yield epl.a;
                    }
                    case c: {
                        yield epl.e;
                    }
                    case d: {
                        yield epl.f;
                    }
                    case e: {
                        yield epl.d;
                    }
                    case f: {
                        yield epl.c;
                    }
                    case g: {
                        yield epl.j;
                    }
                    case h: {
                        yield epl.g;
                    }
                    case i: {
                        yield epl.h;
                    }
                    case j: 
                }
                yield epl.i;
            }
            case egm.b -> {
                switch ($$0) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case a: {
                        yield epl.b;
                    }
                    case b: {
                        yield epl.a;
                    }
                    case c: {
                        yield epl.f;
                    }
                    case d: {
                        yield epl.e;
                    }
                    case e: {
                        yield epl.c;
                    }
                    case f: {
                        yield epl.d;
                    }
                    case g: {
                        yield epl.h;
                    }
                    case h: {
                        yield epl.i;
                    }
                    case i: {
                        yield epl.j;
                    }
                    case j: 
                }
                yield epl.g;
            }
            default -> $$0;
        };
    }

    protected epl a(epl $$0, eev $$1) {
        return switch ($$1) {
            case eev.b -> {
                switch ($$0) {
                    case e: {
                        yield epl.f;
                    }
                    case f: {
                        yield epl.e;
                    }
                    case g: {
                        yield epl.j;
                    }
                    case h: {
                        yield epl.i;
                    }
                    case i: {
                        yield epl.h;
                    }
                    case j: {
                        yield epl.g;
                    }
                }
                yield $$0;
            }
            case eev.c -> {
                switch ($$0) {
                    case c: {
                        yield epl.d;
                    }
                    case d: {
                        yield epl.c;
                    }
                    case g: {
                        yield epl.h;
                    }
                    case h: {
                        yield epl.g;
                    }
                    case i: {
                        yield epl.j;
                    }
                    case j: {
                        yield epl.i;
                    }
                }
                yield $$0;
            }
            default -> $$0;
        };
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(a).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(a).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }
}

