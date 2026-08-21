/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class dlj
extends dlp {
    protected static final Map<dzq, Pair<Predicate<dpw>, Consumer<dpw>>> a = Maps.newHashMap((Map)ImmutableMap.of((Object)dzs.i, (Object)Pair.of(dlj::b, dlj.a(dzs.cZ.m())), (Object)dzs.lA, (Object)Pair.of(dlj::b, dlj.a(dzs.cZ.m())), (Object)dzs.j, (Object)Pair.of(dlj::b, dlj.a(dzs.cZ.m())), (Object)dzs.k, (Object)Pair.of(dlj::b, dlj.a(dzs.j.m())), (Object)dzs.ug, (Object)Pair.of($$0 -> true, dlj.a(dzs.j.m(), dlx.eg))));

    public dlj(dni $$0, float $$1, float $$2, dlp.a $$3) {
        super($$3.c($$0, $$1, $$2));
    }

    @Override
    public cdc a(dpw $$0) {
        is $$2;
        dwo $$1 = $$0.q();
        Pair<Predicate<dpw>, Consumer<dpw>> $$3 = a.get($$1.a_($$2 = $$0.a()).b());
        if ($$3 == null) {
            return cdc.e;
        }
        Predicate $$4 = (Predicate)$$3.getFirst();
        Consumer $$5 = (Consumer)$$3.getSecond();
        if ($$4.test($$0)) {
            ddm $$6 = $$0.o();
            $$1.a((cgk)$$6, $$2, bda.ol, bdb.e, 1.0f, 1.0f);
            if (!$$1.B_()) {
                $$5.accept($$0);
                if ($$6 != null) {
                    $$0.n().a(1, (chl)$$6, $$0.p().a());
                }
            }
            return cdc.a;
        }
        return cdc.e;
    }

    public static Consumer<dpw> a(eoh $$0) {
        return $$1 -> {
            $$1.q().a($$1.a(), $$0, 11);
            $$1.q().a(etk.c, $$1.a(), etk.a.a($$1.o(), $$0));
        };
    }

    public static Consumer<dpw> a(eoh $$0, dwn $$1) {
        return $$2 -> {
            $$2.q().a($$2.a(), $$0, 11);
            $$2.q().a(etk.c, $$2.a(), etk.a.a($$2.o(), $$0));
            dzq.a($$2.q(), $$2.a(), $$2.k(), new dlt($$1));
        };
    }

    public static boolean b(dpw $$0) {
        return $$0.k() != iz.a && $$0.q().a_($$0.a().d()).l();
    }
}

