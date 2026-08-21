/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class igd {
    public void a(hpn $$0, hon.a $$1) {
        a $$2 = $$0.m();
        for (Map.Entry<ijs, List<hpp.c>> $$3 : $$2.a.entrySet()) {
            fzp $$4 = $$1.a($$3.getKey());
            for (hpp.c $$5 : $$3.getValue()) {
                $$5.b().render($$5.a(), $$4);
            }
        }
    }

    public static class a {
        final Map<ijs, List<hpp.c>> a = new HashMap<ijs, List<hpp.c>>();
        private final Set<ijs> b = new ObjectOpenHashSet();

        public void a(fzm $$02, ijs $$1, hpo.a $$2) {
            List $$3 = this.a.computeIfAbsent($$1, $$0 -> new ArrayList());
            $$3.add(new hpp.c($$02.c().d(), $$2));
        }

        public void a() {
            for (Map.Entry<ijs, List<hpp.c>> $$0 : this.a.entrySet()) {
                if ($$0.getValue().isEmpty()) continue;
                this.b.add($$0.getKey());
                $$0.getValue().clear();
            }
        }

        public void b() {
            this.a.keySet().removeIf($$0 -> !this.b.contains($$0));
            this.b.clear();
        }
    }
}

