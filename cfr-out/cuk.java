/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cuk
extends cug
implements cib {
    private static final alw<Integer> cv = ama.a(cuk.class, aly.b);
    private static final int cw = 1024;
    private static final String cx = "stew_effects";
    private @Nullable dpa cz;
    private @Nullable UUID cA;

    public cuk(cgu<? extends cuk> $$0, dwo $$1) {
        super((cgu<? extends cug>)$$0, $$1);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if ($$1.a_($$0.e()).a(dzs.fU)) {
            return 10.0f;
        }
        return $$1.C($$0);
    }

    public static boolean c(cgu<cuk> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cp) && cuk.a($$1, $$3);
    }

    @Override
    public void a(axf $$0, chk $$1) {
        UUID $$2 = $$1.cY();
        if (!$$2.equals(this.cA)) {
            this.a(this.gP() == cuk$a.a ? cuk$a.b : cuk$a.a);
            this.cA = $$2;
            this.a(bda.rc, 2.0f, 1.0f);
        }
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, cuk$a.c.h);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.pU) && !this.e_()) {
            bcz $$8;
            dlt $$5;
            boolean $$3 = false;
            if (this.cz != null) {
                $$3 = true;
                dlt $$4 = new dlt(dlx.yA);
                $$4.b(ki.aa, this.cz);
                this.cz = null;
            } else {
                $$5 = new dlt(dlx.qX);
            }
            dlt $$6 = dlw.a($$2, $$0, $$5, false);
            $$0.a($$1, $$6);
            if ($$3) {
                bcz $$7 = bda.rf;
            } else {
                $$8 = bda.re;
            }
            this.a($$8, 1.0f, 1.0f);
            return cdc.a;
        }
        if ($$2.a(dlx.tZ) && this.a()) {
            dwo $$3 = this.ao();
            if ($$3 instanceof axf) {
                axf $$9 = (axf)$$3;
                this.a($$9, bdb.h, $$2);
                this.a(etk.M, (cgk)$$0);
                $$2.a(1, (chl)$$0, $$1.a());
            }
            return cdc.a;
        }
        if (this.gP() == cuk$a.b) {
            Optional<dpa> $$10 = this.k($$2);
            if ($$10.isEmpty()) {
                return super.b($$0, $$1);
            }
            if (this.cz != null) {
                for (int $$11 = 0; $$11 < 2; ++$$11) {
                    this.ao().a(ly.ai, this.dP() + this.as.j() / 2.0, this.f(0.5), this.dV() + this.as.j() / 2.0, 0.0, this.as.j() / 5.0, 0.0);
                }
            } else {
                $$2.a(1, (chl)$$0);
                me $$12 = me.a(ly.q, -1, 1.0f);
                for (int $$13 = 0; $$13 < 4; ++$$13) {
                    this.ao().a($$12, this.dP() + this.as.j() / 2.0, this.f(0.5), this.dV() + this.as.j() / 2.0, 0.0, this.as.j() / 5.0, 0.0);
                }
                this.cz = $$10.get();
                this.a(bda.rd, 2.0f, 1.0f);
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    public void a(axf $$0, bdb $$1, dlt $$22) {
        $$0.a(null, this, bda.rg, $$1, 1.0f, 1.0f);
        this.a(cgu.G, cge.a(this, false, false), (T $$2) -> {
            $$0.a(ly.x, this.dP(), this.f(0.5), this.dV(), 1, 0.0, 0.0, 0.0, 0.0);
            this.a($$0, fnv.aX, $$22, (axf $$0, dlt $$1) -> {
                for (chn $$2 = 0; $$2 < $$1.N(); ++$$2) {
                    $$0.b(new czl(this.ao(), this.dP(), this.f(1.0), this.dV(), $$1.c(1)));
                }
            });
        });
    }

    @Override
    public boolean a() {
        return this.cb() && !this.e_();
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Type", cuk$a.d, this.gP());
        $$0.b(cx, dpa.c, this.cz);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("Type", cuk$a.d).orElse(cuk$a.c));
        this.cz = $$0.a(cx, dpa.c).orElse(null);
    }

    private Optional<dpa> k(dlt $$0) {
        eih $$1 = eih.a($$0.h());
        if ($$1 != null) {
            return Optional.of($$1.c());
        }
        return Optional.empty();
    }

    private void a(a $$0) {
        this.az.a(cv, $$0.h);
    }

    public a gP() {
        return cuk$a.a(this.az.a(cv));
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aM) {
            return cuk.c($$0, this.gP());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aM);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aM) {
            this.a(cuk.c(ki.aM, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    public @Nullable cuk b(axf $$0, cfy $$1) {
        cuk $$2 = cgu.aK.a($$0, cgt.e);
        if ($$2 != null) {
            $$2.a(this.a((cuk)$$1));
        }
        return $$2;
    }

    private a a(cuk $$0) {
        a $$4;
        a $$2;
        a $$1 = this.gP();
        if ($$1 == ($$2 = $$0.gP()) && this.as.a(1024) == 0) {
            a $$3 = $$1 == cuk$a.b ? cuk$a.a : cuk$a.b;
        } else {
            $$4 = this.as.h() ? $$1 : $$2;
        }
        return $$4;
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("red", 0, dzs.cq.m());
        public static final /* enum */ a b = new a("brown", 1, dzs.cp.m());
        public static final a c;
        public static final Codec<a> d;
        private static final IntFunction<a> f;
        public static final aao<ByteBuf, a> e;
        private final String g;
        final int h;
        private final eoh i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, int $$1, eoh $$2) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
        }

        public eoh a() {
            return this.i;
        }

        @Override
        public String c() {
            return this.g;
        }

        private int b() {
            return this.h;
        }

        static a a(int $$0) {
            return f.apply($$0);
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b};
        }

        static {
            j = cuk$a.d();
            c = a;
            d = bhh.a(a::values);
            f = beu.a(a::b, cuk$a.values(), beu.a.c);
            e = aam.a(f, a::b);
        }
    }
}

