/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class ilv {
    private static final Logger a = LogUtils.getLogger();
    private static final amm b = new amm("atlases", ".json");
    private final List<ilu> c;

    private ilv(List<ilu> $$0) {
        this.c = $$0;
    }

    public List<ilu.b> a(baz $$02) {
        final HashMap $$1 = new HashMap();
        ilu.c $$22 = new ilu.c(){

            @Override
            public void a(amo $$0, ilu.a $$12) {
                ilu.a $$2 = $$1.put($$0, $$12);
                if ($$2 != null) {
                    $$2.a();
                }
            }

            @Override
            public void a(Predicate<amo> $$0) {
                Iterator $$12 = $$1.entrySet().iterator();
                while ($$12.hasNext()) {
                    Map.Entry $$2 = $$12.next();
                    if (!$$0.test((amo)$$2.getKey())) continue;
                    ((ilu.a)$$2.getValue()).a();
                    $$12.remove();
                }
            }
        };
        this.c.forEach($$2 -> $$2.a($$02, $$22));
        ImmutableList.Builder $$3 = ImmutableList.builder();
        $$3.add($$0 -> ilf.b());
        $$3.addAll($$1.values());
        return $$3.build();
    }

    public static ilv a(baz $$0, amo $$1) {
        amo $$2 = b.a($$1);
        ArrayList<ilu> $$3 = new ArrayList<ilu>();
        for (bax $$4 : $$0.a($$2)) {
            try {
                BufferedReader $$5 = $$4.e();
                try {
                    Dynamic $$6 = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)bhf.a($$5));
                    $$3.addAll((Collection)ilw.b.parse($$6).getOrThrow());
                }
                finally {
                    if ($$5 == null) continue;
                    $$5.close();
                }
            }
            catch (Exception $$7) {
                a.error("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), $$7});
            }
        }
        return new ilv($$3);
    }
}

