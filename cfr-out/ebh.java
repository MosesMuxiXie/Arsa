/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class ebh
extends dzc
implements ehg {
    public static final MapCodec<ebh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(ebh::d), ebh.x()).apply((Applicative)$$0, ebh::new));
    public static final epf<iz> b = eox.T;
    public static final epf<a> c = eox.bJ;
    public static final eoy d = eox.I;
    private static final fug e = dzq.b(10.0, 0.0, 14.0);
    private final ejq.a f;

    public MapCodec<? extends ebh> a() {
        return a;
    }

    public ebh(ejq.a $$0, eog.d $$1) {
        super($$1);
        this.f = $$0;
        this.l((eoh)((eoh)((eoh)this.m().b(b, iz.c)).b(c, ebh$a.a)).b(d, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        super.a($$0);
        $$0.a(b, c, d);
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)((eoh)this.m().b(b, $$0.g().g())).b(d, $$1.a() == flc.c);
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
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e;
    }

    public ejq.a d() {
        return this.f;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        if ($$0.a(bdy.cb)) {
            return cdc.e;
        }
        this.a($$2, $$1, $$3, $$4);
        return cdc.a;
    }

    void a(dwo $$0, eoh $$1, is $$2, ddm $$3) {
        $$0.a(null, $$2, bda.gM, bdb.e);
        $$0.a($$2, (eoh)$$1.b(c, $$1.c(c).a()), 3);
        $$0.a((cgk)$$3, etk.c, $$2);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return $$1 == flq.b && $$0.y().a(bdv.a);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new elq($$0, $$1);
    }

    @Override
    public boolean o(eoh $$0) {
        return $$0.a(bdp.am);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return $$0.c(c).ordinal() + 1;
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        elb elb2 = $$0.c_($$1);
        if (elb2 instanceof elq) {
            elq $$4 = (elq)elb2;
            return $$4.a(this.h().m(), $$2.c(c));
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        $$1.b($$2, $$0.b());
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("standing");
        public static final /* enum */ a b = new a("sitting");
        public static final /* enum */ a c = new a("running");
        public static final /* enum */ a d = new a("star");
        public static final IntFunction<a> e;
        public static final Codec<a> f;
        private final String g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.g = $$0;
        }

        @Override
        public String c() {
            return this.g;
        }

        public a a() {
            return e.apply(this.ordinal() + 1);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            h = ebh$a.b();
            e = beu.a(Enum::ordinal, ebh$a.values(), beu.a.a);
            f = bhh.a(a::values);
        }
    }
}

