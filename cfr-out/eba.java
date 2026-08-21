/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class eba
extends dzc
implements ede {
    public static final MapCodec<eba> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("automatic").forGetter($$0 -> $$0.e), eba.x()).apply((Applicative)$$02, eba::new));
    private static final Logger d = LogUtils.getLogger();
    public static final epf<iz> b = ebw.a;
    public static final eoy c = eox.f;
    private final boolean e;

    public MapCodec<eba> a() {
        return a;
    }

    public eba(boolean $$0, eog.d $$1) {
        super($$1);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false));
        this.e = $$0;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        elm $$2 = new elm($$0, $$1);
        $$2.b(this.e);
        return $$2;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$1.B_()) {
            return;
        }
        elb $$6 = $$1.c_($$2);
        if ($$6 instanceof elm) {
            elm $$7 = (elm)$$6;
            this.a($$1, $$2, $$7, $$1.I($$2));
        }
    }

    private void a(dwo $$0, is $$1, elm $$2, boolean $$3) {
        boolean $$4 = $$2.c();
        if ($$3 == $$4) {
            return;
        }
        $$2.a($$3);
        if ($$3) {
            if ($$2.d() || $$2.l() == elm.a.a) {
                return;
            }
            $$2.k();
            $$0.a($$1, (dzq)this, 1);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof elm) {
            elm $$5 = (elm)$$4;
            dvo $$6 = $$5.a();
            boolean $$7 = !bhi.b($$6.d());
            elm.a $$8 = $$5.l();
            boolean $$9 = $$5.h();
            if ($$8 == elm.a.b) {
                $$5.k();
                if ($$9) {
                    this.a($$0, $$1, $$2, $$6, $$7);
                } else if ($$5.m()) {
                    $$6.a(0);
                }
                if ($$5.c() || $$5.d()) {
                    $$1.a($$2, (dzq)this, 1);
                }
            } else if ($$8 == elm.a.c) {
                if ($$9) {
                    this.a($$0, $$1, $$2, $$6, $$7);
                } else if ($$5.m()) {
                    $$6.a(0);
                }
            }
            $$1.b($$2, this);
        }
    }

    private void a(eoh $$0, axf $$1, is $$2, dvo $$3, boolean $$4) {
        if ($$4) {
            $$3.b($$1);
        } else {
            $$3.a(0);
        }
        eba.a($$1, $$2, $$0.c(b));
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb $$5 = $$1.c_($$2);
        if ($$5 instanceof elm && $$3.hi()) {
            $$3.a((elm)$$5);
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof elm) {
            return ((elm)$$4).a().b();
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        void $$7;
        elb $$5 = $$0.c_($$1);
        if (!($$5 instanceof elm)) {
            return;
        }
        elm $$6 = (elm)$$5;
        dvo $$8 = $$7.a();
        if ($$0 instanceof axf) {
            axf $$9 = (axf)$$0;
            if (!$$4.c(ki.ah)) {
                $$8.a($$9.U().a(eua.R));
                $$7.b(this.e);
            }
            boolean $$10 = $$0.I($$1);
            this.a($$0, $$1, (elm)$$7, $$10);
        }
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.d().g());
    }

    private static void a(axf $$0, is $$1, iz $$2) {
        is.a $$3 = $$1.k();
        eua $$4 = $$0.U();
        int $$5 = $$4.a(eua.z);
        while ($$5-- > 0) {
            elm $$9;
            elb $$8;
            $$3.c($$2);
            eoh $$6 = $$0.a_($$3);
            dzq $$7 = $$6.b();
            if (!$$6.a(dzs.lD) || !(($$8 = $$0.c_($$3)) instanceof elm) || ($$9 = (elm)$$8).l() != elm.a.a) break;
            if ($$9.c() || $$9.d()) {
                dvo $$10 = $$9.a();
                if ($$9.k()) {
                    if (!$$10.b($$0)) break;
                    $$0.b((is)$$3, $$7);
                } else if ($$9.m()) {
                    $$10.a(0);
                }
            }
            $$2 = $$6.c(b);
        }
        if ($$5 <= 0) {
            int $$11 = Math.max($$4.a(eua.z), 0);
            d.warn("Command Block chain tried to execute more than {} steps!", (Object)$$11);
        }
    }
}

