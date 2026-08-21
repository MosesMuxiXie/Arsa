/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dna
extends dlp {
    private static final Map<cgu<?>, dna> a = Maps.newIdentityHashMap();

    public dna(dlp.a $$0) {
        super($$0);
        dpf<cgu<?>> $$1 = this.f().a(ki.af);
        if ($$1 != null) {
            a.put($$1.a(), this);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public cdc a(dpw $$0) {
        is $$12;
        dwo $$1 = $$0.q();
        if (!($$1 instanceof axf)) {
            return cdc.a;
        }
        axf $$2 = (axf)$$1;
        dlt $$4 = $$0.n();
        is $$5 = $$0.a();
        iz $$6 = $$0.k();
        eoh $$7 = $$1.a_($$5);
        elb elb2 = $$1.c_($$5);
        if (elb2 instanceof dxj) {
            void $$3;
            dxj $$8 = (dxj)((Object)elb2);
            cgu<?> $$9 = this.g($$4);
            if ($$9 == null) {
                return cdc.d;
            }
            if (!$$3.Z()) {
                ddm ddm2 = $$0.o();
                if (ddm2 instanceof axg) {
                    axg $$10 = (axg)ddm2;
                    $$10.a(yh.c("advMode.notEnabled.spawner"));
                }
                return cdc.d;
            }
            $$8.a($$9, $$1.G_());
            $$1.a($$5, $$7, $$7, 3);
            $$1.a((cgk)$$0.o(), etk.c, $$5);
            $$4.h(1);
            return cdc.a;
        }
        if ($$7.g($$1, $$5).c()) {
            is $$11 = $$5;
        } else {
            $$12 = $$5.a($$6);
        }
        return this.a((chl)$$0.o(), $$4, $$1, $$12, true, !Objects.equals($$5, $$12) && $$6 == iz.b);
    }

    private cdc a(@Nullable chl $$0, dlt $$1, dwo $$2, is $$3, boolean $$4, boolean $$5) {
        cgu<?> $$6 = this.g($$1);
        if ($$6 == null) {
            return cdc.d;
        }
        if (!$$6.s() && $$2.av() == ccz.a) {
            return cdc.d;
        }
        if ($$6.a((axf)$$2, $$1, $$0, $$3, cgt.m, $$4, $$5) != null) {
            $$1.a(1, $$0);
            $$2.a((cgk)$$0, etk.t, $$3);
        }
        return cdc.a;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        fti $$4 = dna.a($$0, $$1, dvw.b.b);
        if ($$4.d() != ftk.a.b) {
            return cdc.e;
        }
        if (!($$0 instanceof axf)) {
            return cdc.a;
        }
        axf $$5 = (axf)$$0;
        is $$7 = $$4.b();
        if (!($$0.a_($$7).b() instanceof eeo)) {
            return cdc.e;
        }
        if (!$$0.a((cgk)$$1, $$7) || !$$1.a($$7, $$4.c(), $$3)) {
            return cdc.d;
        }
        cdc $$8 = this.a((chl)$$1, $$3, $$0, $$7, false, false);
        if ($$8 == cdc.a) {
            $$1.b(bdk.c.b(this));
        }
        return $$8;
    }

    public boolean a(dlt $$0, cgu<?> $$1) {
        return Objects.equals(this.g($$0), $$1);
    }

    public static @Nullable dna a(@Nullable cgu<?> $$0) {
        return a.get($$0);
    }

    public static Iterable<dna> a() {
        return Iterables.unmodifiableIterable(a.values());
    }

    public @Nullable cgu<?> g(dlt $$0) {
        dpf<cgu<?>> $$1 = $$0.a(ki.af);
        if ($$1 != null) {
            return $$1.a();
        }
        return null;
    }

    @Override
    public dgz k() {
        return Optional.ofNullable(this.f().a(ki.af)).map(dpf::a).map(cgu::k).orElseGet(dgz::a);
    }

    public Optional<chn> a(ddm $$0, chn $$1, cgu<? extends chn> $$2, axf $$3, ftm $$4, dlt $$5) {
        chn $$7;
        if (!this.a($$5, $$2)) {
            return Optional.empty();
        }
        if ($$1 instanceof cfy) {
            cfy $$6 = ((cfy)$$1).a($$3, (cfy)$$1);
        } else {
            $$7 = $$2.a($$3, cgt.m);
        }
        if ($$7 == null) {
            return Optional.empty();
        }
        $$7.a_(true);
        if (!$$7.e_()) {
            return Optional.empty();
        }
        $$7.b($$4.a(), $$4.b(), $$4.c(), 0.0f, 0.0f);
        $$7.c($$5);
        $$3.a_($$7);
        $$5.a(1, (chl)$$0);
        return Optional.of($$7);
    }

    @Override
    public boolean a(dlt $$0, @Nullable ddm $$1) {
        dpf<cgu<?>> $$2;
        if ($$1 != null && $$1.I().hasPermission(bbr.b) && ($$2 = $$0.a(ki.af)) != null) {
            return $$2.a().t();
        }
        return false;
    }
}

