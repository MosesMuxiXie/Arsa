/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public final class dly
extends Record
implements dpe {
    private final dku<dlz> c;
    public static final Codec<dly> a = dku.a(mj.bj, dlz.c).xmap(dly::new, dly::a);
    public static final aao<xq, dly> b = aao.a(dku.a(mj.bj, dlz.d), dly::a, dly::new);

    public dly(dku<dlz> $$0) {
        this.c = $$0;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$12, dnj $$2, kd $$3) {
        jf.a $$4 = $$0.a();
        if ($$4 != null) {
            this.c.a($$4).ifPresent($$1 -> {
                yh $$2 = yk.a(((dlz)$$1.a()).c(), zf.a.a(l.h));
                $$12.accept($$2);
            });
        }
    }

    public static cdc a(dwo $$0, is $$1, dlt $$2, ddm $$3) {
        dly $$4 = $$2.a(ki.al);
        if ($$4 == null) {
            return cdc.f;
        }
        eoh $$5 = $$0.a_($$1);
        if (!$$5.a(dzs.ew) || $$5.c(eea.b).booleanValue()) {
            return cdc.f;
        }
        if (!$$0.B_()) {
            dlt $$6 = $$2.b(1, (chl)$$3);
            elb elb2 = $$0.c_($$1);
            if (elb2 instanceof emh) {
                emh $$7 = (emh)elb2;
                $$7.b($$6);
                $$0.a(etk.c, $$1, etk.a.a($$3, $$5));
            }
            $$3.a(bdk.an);
        }
        return cdc.a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dly.class, "song", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dly.class, "song", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dly.class, "song", "c"}, this, $$0);
    }

    public dku<dlz> a() {
        return this.c;
    }
}

