/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class hil {
    private final bak a = ban.c();
    private final Map<bag, String> b;

    public hil() {
        this.a.a();
        ImmutableMap.Builder $$0 = ImmutableMap.builder();
        this.a.d().forEach($$1 -> {
            azk $$22 = $$1.a();
            $$22.d().ifPresent($$2 -> $$0.put($$2, (Object)$$22.a()));
        });
        this.b = $$0.build();
    }

    public List<bag> a(List<bag> $$0) {
        ArrayList<bag> $$1 = new ArrayList<bag>($$0.size());
        ArrayList<String> $$2 = new ArrayList<String>($$0.size());
        for (bag $$3 : $$0) {
            String $$4 = this.b.get($$3);
            if ($$4 == null) continue;
            $$2.add($$4);
            $$1.add($$3);
        }
        this.a.b($$2);
        return $$1;
    }

    public bap a() {
        List<azl> $$0 = this.a.h();
        return new bas(azn.b, $$0);
    }
}

