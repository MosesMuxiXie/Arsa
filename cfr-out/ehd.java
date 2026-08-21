/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class ehd
extends dzc {
    public static final MapCodec<ehd> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)dkr.q.optionalFieldOf("color").forGetter($$0 -> Optional.ofNullable($$0.e)), ehd.x()).apply((Applicative)$$02, ($$0, $$1) -> new ehd($$0.orElse(null), (eog.d)$$1)));
    public static final Map<iz, fug> b = fud.d(dzq.c(16.0, 0.0, 1.0));
    public static final epf<iz> c = ebw.a;
    public static final amo d = amo.b("contents");
    private final @Nullable dkr e;

    public MapCodec<ehd> a() {
        return a;
    }

    public ehd(@Nullable dkr $$0, eog.d $$1) {
        super($$1);
        this.e = $$0;
        this.l((eoh)((eoh)this.C.b()).b(c, iz.b));
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emr(this.e, $$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return ehd.a($$2, eld.y, emr::a);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$1 instanceof axf) {
            emr $$6;
            axf $$5 = (axf)$$1;
            elb elb2 = $$1.c_($$2);
            if (elb2 instanceof emr && ehd.a($$0, $$1, $$2, $$6 = (emr)elb2)) {
                $$3.a($$6);
                $$3.a(bdk.as);
                dbk.a($$5, $$3, true);
            }
        }
        return cdc.a;
    }

    private static boolean a(eoh $$0, dwo $$1, is $$2, emr $$3) {
        if ($$3.l() != emr.a.a) {
            return true;
        }
        fth $$4 = dae.a(1.0f, $$0.c(c), 0.0f, 0.5f, $$2.c()).h(1.0E-6);
        return $$1.b($$4);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(c, $$0.k());
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        elb $$4 = $$0.c_($$1);
        if ($$4 instanceof emr) {
            emr $$5 = (emr)$$4;
            if (!$$0.B_() && $$3.gM() && !$$5.c()) {
                dlt $$6 = ehd.b(this.b());
                $$6.b($$4.t());
                czl $$7 = new czl($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
                $$7.i();
                $$0.b($$7);
            } else {
                $$5.f_($$3);
            }
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected List<dlt> a(eoh $$0, fod.a $$12) {
        elb $$2 = $$12.b(fqx.j);
        if ($$2 instanceof emr) {
            emr $$3 = (emr)$$2;
            $$12 = $$12.a(d, (Consumer<dlt> $$1) -> {
                for (int $$2 = 0; $$2 < $$3.b(); ++$$2) {
                    $$1.accept($$3.a($$2));
                }
            });
        }
        return super.a($$0, $$12);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        emr $$4;
        elb $$3 = $$1.c_($$2);
        if ($$3 instanceof emr && !($$4 = (emr)$$3).x()) {
            return b.get($$0.c(c).g());
        }
        return fud.b();
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof emr) {
            emr $$5 = (emr)$$4;
            return fud.a($$5.a($$0));
        }
        return fud.b();
    }

    @Override
    protected boolean e_(eoh $$0) {
        return false;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return dhi.a($$1.c_($$2));
    }

    public static dzq a(@Nullable dkr $$0) {
        if ($$0 == null) {
            return dzs.lL;
        }
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case dkr.a -> dzs.lM;
            case dkr.b -> dzs.lN;
            case dkr.c -> dzs.lO;
            case dkr.d -> dzs.lP;
            case dkr.e -> dzs.lQ;
            case dkr.f -> dzs.lR;
            case dkr.g -> dzs.lS;
            case dkr.h -> dzs.lT;
            case dkr.i -> dzs.lU;
            case dkr.j -> dzs.lV;
            case dkr.l -> dzs.lX;
            case dkr.m -> dzs.lY;
            case dkr.n -> dzs.lZ;
            case dkr.o -> dzs.ma;
            case dkr.p -> dzs.mb;
            case dkr.k -> dzs.lW;
        };
    }

    public @Nullable dkr b() {
        return this.e;
    }

    public static dlt b(@Nullable dkr $$0) {
        return new dlt(ehd.a($$0));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(c, $$1.a($$0.c(c)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }
}

