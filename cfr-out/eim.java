/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eim
extends ecb
implements eep {
    public static final MapCodec<eim> c = eim.b(eim::new);
    public static final epf<epd> d = ecb.b;
    private static final fug e = dzq.b(12.0, 0.0, 16.0);

    public MapCodec<eim> a() {
        return c;
    }

    public eim(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.c($$1, $$2, iz.b) && !$$0.a(dzs.lF);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dzs.bG);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$2;
        eoh $$1 = super.a($$0);
        if ($$1 != null && ($$2 = $$0.q().b_($$0.a().d())).a(bdv.a) && $$2.e() == 8) {
            return $$1;
        }
        return null;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        if ($$0.c(d) == epd.a) {
            eoh $$3 = $$1.a_($$2.e());
            return $$3.a(this) && $$3.c(d) == epd.b;
        }
        flb $$4 = $$1.b_($$2);
        return super.a($$0, $$1, $$2) && $$4.a(bdv.a) && $$4.e() == 8;
    }

    @Override
    protected flb b_(eoh $$0) {
        return flc.c.a(false);
    }

    @Override
    public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        return false;
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        return false;
    }
}

