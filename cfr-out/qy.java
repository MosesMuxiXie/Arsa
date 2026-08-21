/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class qy {
    public static final amt<fgy> a = qy.a("empty");

    public static amt<fgy> a(amo $$0) {
        return amt.a(mj.bt, $$0);
    }

    public static amt<fgy> a(String $$0) {
        return qy.a(amo.b($$0));
    }

    public static amt<fgy> b(String $$0) {
        return qy.a(amo.a($$0));
    }

    public static void a(qr<fgy> $$0, String $$1, fgy $$2) {
        $$0.a(qy.a($$1), $$2);
    }

    public static void a(qr<fgy> $$0) {
        je<fgy> $$1 = $$0.a(mj.bt);
        jd.c<fgy> $$2 = $$1.b(a);
        $$0.a(a, new fgy($$2, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of(), fgy.a.b));
        qn.a($$0);
        qw.a($$0);
        rj.a($$0);
        qi.a($$0);
        rh.a($$0);
        ri.a($$0);
    }
}

