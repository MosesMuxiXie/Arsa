/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Splitter
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.apache.commons.lang3.math.NumberUtils
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;

public class bok
extends DataFix {
    private static final String b = "generatorOptions";
    @VisibleForTesting
    static final String a = "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
    private static final Splitter c = Splitter.on((char)';').limit(5);
    private static final Splitter d = Splitter.on((char)',');
    private static final Splitter e = Splitter.on((char)'x').limit(2);
    private static final Splitter f = Splitter.on((char)'*').limit(2);
    private static final Splitter g = Splitter.on((char)':').limit(3);

    public bok(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelFlatGeneratorInfoFix", this.getInputSchema().getType(bqh.a), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
    }

    private Dynamic<?> a(Dynamic<?> $$02) {
        if ($$02.get("generatorName").asString("").equalsIgnoreCase("flat")) {
            return $$02.update(b, $$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.asString().map(this::a).map(arg_0 -> ((Dynamic)$$0).createString(arg_0)).result(), (Object)$$0));
        }
        return $$02;
    }

    @VisibleForTesting
    String a(String $$0) {
        String $$6;
        int $$5;
        if ($$0.isEmpty()) {
            return a;
        }
        Iterator $$1 = c.split((CharSequence)$$0).iterator();
        String $$22 = (String)$$1.next();
        if ($$1.hasNext()) {
            int $$3 = NumberUtils.toInt((String)$$22, (int)0);
            String $$4 = (String)$$1.next();
        } else {
            $$5 = 0;
            $$6 = $$22;
        }
        if ($$5 < 0 || $$5 > 3) {
            return a;
        }
        StringBuilder $$7 = new StringBuilder();
        Splitter $$8 = $$5 < 3 ? e : f;
        $$7.append(StreamSupport.stream(d.split((CharSequence)$$6).spliterator(), false).map($$2 -> {
            String $$7;
            int $$6;
            List $$3 = $$8.splitToList((CharSequence)$$2);
            if ($$3.size() == 2) {
                int $$4 = NumberUtils.toInt((String)((String)$$3.get(0)));
                String $$5 = (String)$$3.get(1);
            } else {
                $$6 = 1;
                $$7 = (String)$$3.get(0);
            }
            List $$8 = g.splitToList((CharSequence)$$7);
            int $$9 = ((String)$$8.get(0)).equals("minecraft") ? 1 : 0;
            String $$10 = (String)$$8.get($$9);
            int $$11 = $$5 == 3 ? blc.a("minecraft:" + $$10) : NumberUtils.toInt((String)$$10, (int)0);
            int $$12 = $$9 + 1;
            int $$13 = $$8.size() > $$12 ? NumberUtils.toInt((String)((String)$$8.get($$12)), (int)0) : 0;
            return (String)($$6 == 1 ? "" : $$6 + "*") + bjq.b($$11 << 4 | $$13).get("Name").asString("");
        }).collect(Collectors.joining(",")));
        while ($$1.hasNext()) {
            $$7.append(';').append((String)$$1.next());
        }
        return $$7.toString();
    }
}

