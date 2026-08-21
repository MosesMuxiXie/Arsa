/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public abstract class ehf
extends dzc
implements ehg {
    public static final eoy d = eox.I;
    private static final fug a = dzq.b(8.0, 0.0, 16.0);
    private final epw b;

    protected ehf(epw $$0, eog.d $$1) {
        super($$1);
        this.b = $$0;
    }

    protected abstract MapCodec<? extends ehf> a();

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a;
    }

    @Override
    public boolean a(eoh $$0) {
        return true;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ems($$0, $$1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        void $$13;
        void $$8;
        boolean $$11;
        dmv $$9;
        elb elb2 = $$2.c_($$3);
        if (!(elb2 instanceof ems)) {
            return cdc.e;
        }
        ems $$7 = (ems)elb2;
        dlp dlp2 = $$0.h();
        dmv $$10 = dlp2 instanceof dmv ? ($$9 = (dmv)((Object)dlp2)) : null;
        boolean bl2 = $$11 = $$10 != null && $$4.gY();
        if (!($$2 instanceof axf)) {
            return $$11 || $$8.w() ? cdc.a : cdc.c;
        }
        axf $$12 = (axf)$$2;
        if (!$$11 || $$8.w() || this.a($$4, (ems)$$8)) {
            return cdc.f;
        }
        boolean $$14 = $$8.a($$4);
        if ($$10.a($$8.a($$14), $$4) && $$10.a((dwo)$$13, (ems)$$8, $$14, $$4)) {
            $$8.a((axf)$$13, $$4, $$3, $$14);
            $$4.b(bdk.c.b($$0.h()));
            $$13.a(etk.c, $$8.aD_(), etk.a.a($$4, $$8.o()));
            $$0.a(1, (chl)$$4);
            return cdc.a;
        }
        return cdc.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        void $$8;
        void $$6;
        elb elb2 = $$1.c_($$2);
        if (!(elb2 instanceof ems)) {
            return cdc.e;
        }
        ems $$5 = (ems)elb2;
        if (!($$1 instanceof axf)) {
            bhs.b(new IllegalStateException("Expected to only call this on server"));
            return cdc.c;
        }
        axf $$7 = (axf)$$1;
        boolean $$9 = $$6.a($$3);
        boolean $$10 = $$6.a((axf)$$8, $$3, $$2, $$9);
        if ($$6.w()) {
            $$8.a(null, $$6.aD_(), $$6.d(), bdb.e);
            return cdc.b;
        }
        if ($$10) {
            return cdc.b;
        }
        if (!this.a($$3, (ems)$$6) && $$3.gY() && this.b($$3, (ems)$$6, $$9)) {
            this.a($$3, (ems)$$6, $$9);
            return cdc.b;
        }
        return cdc.e;
    }

    private boolean b(ddm $$02, ems $$1, boolean $$2) {
        emt $$3 = $$1.a($$2);
        return Arrays.stream($$3.b($$02.Z())).allMatch($$0 -> $$0.equals(yg.a) || $$0.b() instanceof zn);
    }

    public abstract float h(eoh var1);

    public ftm p(eoh $$0) {
        return new ftm(0.5, 0.5, 0.5);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    public epw d() {
        return this.b;
    }

    public static epw a(dzq $$0) {
        epw $$2;
        if ($$0 instanceof ehf) {
            epw $$1 = ((ehf)$$0).d();
        } else {
            $$2 = epw.b;
        }
        return $$2;
    }

    public void a(ddm $$0, ems $$1, boolean $$2) {
        $$1.a($$0.cY());
        $$0.a($$1, $$2);
    }

    private boolean a(ddm $$0, ems $$1) {
        UUID $$2 = $$1.m();
        return $$2 != null && !$$2.equals($$0.cY());
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return ehf.a($$2, eld.h, ems::a);
    }
}

