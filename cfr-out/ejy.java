/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejy
extends ebh
implements ejq {
    public static final MapCodec<ejy> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(eat::c), ejy.x()).apply((Applicative)$$0, ejy::new));

    public MapCodec<ejy> a() {
        return e;
    }

    public ejy(ejq.a $$0, eog.d $$1) {
        super($$0, $$1);
    }

    @Override
    protected boolean f(eoh $$0) {
        return ejq.c($$0.b()).isPresent();
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        this.a_($$0, $$1, $$2, $$3);
    }

    public ejq.a q() {
        return this.d();
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        elb elb2 = $$2.c_($$3);
        if (elb2 instanceof elq) {
            elq $$7 = (elq)elb2;
            if ($$0.a(bdy.cb)) {
                if (this.q().equals(ejq.a.a)) {
                    cwc $$8 = $$7.a($$1);
                    $$0.a(1, (chl)$$4, $$5.a());
                    if ($$8 != null) {
                        $$2.b($$8);
                        $$2.a($$3, false);
                        return cdc.a;
                    }
                }
            } else {
                if ($$0.a(dlx.zf)) {
                    return cdc.e;
                }
                this.a($$2, $$1, $$3, $$4);
                return cdc.a;
            }
        }
        return cdc.e;
    }

    @Override
    public /* synthetic */ Enum c() {
        return this.q();
    }
}

