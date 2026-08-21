/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class gle
implements gly {
    private static final Map<euq.a, String> a = Maps.newEnumMap(Map.of(euq.a.a, "SW", euq.a.b, "S", euq.a.c, "OW", euq.a.d, "O", euq.a.e, "M", euq.a.f, "ML"));
    private static final amo b = amo.b("heightmaps");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        if ($$5 == null || $$4.r == null || $$2 == null) {
            return;
        }
        is $$6 = $$5.dK();
        ArrayList<String> $$7 = new ArrayList<String>();
        StringBuilder $$8 = new StringBuilder("CH");
        for (euq.a $$9 : euq.a.values()) {
            if (!$$9.b()) continue;
            $$8.append(" ").append(a.get($$9)).append(": ").append($$2.a($$9, $$6.u(), $$6.w()));
        }
        $$7.add($$8.toString());
        $$8.setLength(0);
        $$8.append("SH");
        for (euq.a $$10 : euq.a.values()) {
            if (!$$10.d()) continue;
            $$8.append(" ").append(a.get($$10)).append(": ");
            if ($$3 != null) {
                $$8.append($$3.a($$10, $$6.u(), $$6.w()));
                continue;
            }
            $$8.append("??");
        }
        $$7.add($$8.toString());
        $$0.a(b, $$7);
    }
}

