/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public abstract class nm
implements no {
    protected final jf.a a;
    private final dgz b;
    private final dgz c;
    private final Map<cgu<?>, Map<amt<fof>, fof.a>> d = Maps.newHashMap();

    protected final fra.a a() {
        jf.b<dso> $$0 = this.a.e(mj.bf);
        return fra.a(frp.a(fnz.c.a, bs.a.a().a(bq.a.a().b(true))), frp.a(fnz.c.c, bs.a.a().a(bp.a.a().f(cg.a.a().a(bh.a.a().a(kt.b, ku.a(List.of(new bn($$0.b(bds.p), cq.d.c)))).b())))));
    }

    protected nm(dgz $$0, jf.a $$1) {
        this($$0, $$0, $$1);
    }

    protected nm(dgz $$0, dgz $$1, jf.a $$2) {
        this.b = $$0;
        this.c = $$1;
        this.a = $$2;
    }

    public static foe.a a(Map<dkr, amt<fof>> $$0) {
        foh.a $$1 = foh.a(new foq.a[0]);
        for (Map.Entry<dkr, amt<fof>> $$2 : $$0.entrySet()) {
            $$1 = $$1.a((foq.a<?>)fou.a($$2.getValue()).a(frp.a(fnz.c.a, bs.a.a().a(bh.a.a().a(kc.a(ki.aZ, $$2.getKey())).b()).a(dc.b()))));
        }
        return foe.a().a($$1);
    }

    public abstract void b();

    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        this.b();
        HashSet $$1 = new HashSet();
        mi.g.c().forEach($$2 -> {
            cgu $$32 = (cgu)$$2.a();
            if (!$$32.a(this.b)) {
                return;
            }
            Optional<amt<fof>> $$42 = $$32.j();
            if ($$42.isPresent()) {
                Map<amt<fof>, fof.a> $$5 = this.d.remove($$32);
                if ($$32.a(this.c) && ($$5 == null || !$$5.containsKey($$42.get()))) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$42.get(), $$2.h().a()));
                }
                if ($$5 != null) {
                    $$5.forEach(($$3, $$4) -> {
                        if (!$$1.add($$3)) {
                            throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", $$3, $$2.h().a()));
                        }
                        $$0.accept((amt<fof>)$$3, (fof.a)$$4);
                    });
                }
            } else {
                Map<amt<fof>, fof.a> $$6 = this.d.remove($$32);
                if ($$6 != null) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot", $$6.keySet().stream().map($$0 -> $$0.a().toString()).collect(Collectors.joining(",")), $$2.h().a()));
                }
            }
        });
        if (!this.d.isEmpty()) {
            throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + String.valueOf(this.d.keySet()));
        }
    }

    protected frm.a a(je<cgu<?>> $$0) {
        return frf.a(bg.a.a().b(bs.a.a().a($$0, cgu.af)));
    }

    protected frm.a a(je<cgu<?>> $$0, je<cvs> $$1, amt<cvs> $$2) {
        return frf.a(bg.a.a().b(bs.a.a().a($$0, cgu.af).a(bh.a.a().a(kc.a(ki.aS, $$1.b($$2))).b())));
    }

    protected void a(cgu<?> $$0, fof.a $$1) {
        this.a($$0, $$0.j().orElseThrow(() -> new IllegalStateException("Entity " + String.valueOf($$0) + " has no loot table")), $$1);
    }

    protected void a(cgu<?> $$02, amt<fof> $$1, fof.a $$2) {
        this.d.computeIfAbsent($$02, $$0 -> new HashMap()).put($$1, $$2);
    }
}

