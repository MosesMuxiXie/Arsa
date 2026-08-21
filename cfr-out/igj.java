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

public class igj {
    private final fzm a = new fzm();

    public void a(hpn $$0, hon.a $$1, hoq $$2, hon.a $$3) {
        a $$4 = $$0.i();
        for (Map.Entry<ijs, List<hpp.g>> $$5 : $$4.a.entrySet()) {
            ijs $$6 = $$5.getKey();
            List<hpp.g> $$7 = $$5.getValue();
            fzp $$8 = $$1.a($$6);
            for (hpp.g $$9 : $$7) {
                fzp $$13;
                if ($$9.e() != null) {
                    if ($$9.g()) {
                        fzp $$10 = $$9.e().a(hxp.a($$1, $$6, $$9.f(), true));
                    } else {
                        fzp $$11 = $$9.e().a($$8);
                    }
                } else if ($$9.g()) {
                    fzp $$12 = hxp.a($$1, $$6, $$9.f(), true);
                } else {
                    $$13 = $$8;
                }
                this.a.c().a($$9.a());
                $$9.b().a(this.a, $$13, $$9.c(), $$9.d(), $$9.h());
                if ($$9.j() != 0 && ($$6.d().isPresent() || $$6.e())) {
                    $$2.a($$9.j());
                    fzp $$14 = $$2.a($$6);
                    $$9.b().a(this.a, $$9.e() == null ? $$14 : $$9.e().a($$14), $$9.c(), $$9.d(), $$9.h());
                }
                if ($$9.i() == null) continue;
                fzn $$15 = new fzn($$3.a(inx.n.get($$9.i().a())), $$9.i().b(), 1.0f);
                $$9.b().a(this.a, (fzp)$$15, $$9.c(), $$9.d(), $$9.h());
            }
        }
    }

    public static class a {
        final Map<ijs, List<hpp.g>> a = new HashMap<ijs, List<hpp.g>>();
        private final Set<ijs> b = new ObjectOpenHashSet();

        public void a(ijs $$02, hpp.g $$1) {
            this.a.computeIfAbsent($$02, $$0 -> new ArrayList()).add($$1);
        }

        public void a() {
            for (Map.Entry<ijs, List<hpp.g>> $$0 : this.a.entrySet()) {
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

