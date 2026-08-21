/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class gjj {
    private static final bfr a = bfr.codepoint(32, zf.a);

    private static String a(String $$0) {
        return gfj.V().k.X().b() != false ? $$0 : l.a($$0);
    }

    public static List<bfr> a(yn $$0, int $$12, gio $$22) {
        gex $$3 = new gex();
        $$0.a(($$1, $$2) -> {
            $$3.a(yn.a(gjj.a($$2), $$1));
            return Optional.empty();
        }, zf.a);
        ArrayList $$4 = Lists.newArrayList();
        $$22.b().a($$3.b(), $$12, zf.a, ($$1, $$2) -> {
            bfr $$3 = uu.a().a((yn)$$1);
            $$4.add($$2 != false ? bfr.composite(a, $$3) : $$3);
        });
        if ($$4.isEmpty()) {
            return Lists.newArrayList((Object[])new bfr[]{bfr.a});
        }
        return $$4;
    }
}

