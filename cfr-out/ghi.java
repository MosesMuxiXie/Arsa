/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ghi
implements mq {
    private final ms.a d;

    public ghi(ms $$0) {
        this.d = $$0.a(ms.b.b, "equipment");
    }

    private static void a(BiConsumer<amt<dul>, inr> $$0) {
        $$0.accept(dum.b, inr.a().a(amo.b("leather"), true).a(amo.b("leather_overlay"), false).a(inr.d.e, inr.c.a(amo.b("leather"), true), inr.c.a(amo.b("leather_overlay"), false)).a());
        $$0.accept(dum.d, ghi.a("chainmail"));
        $$0.accept(dum.c, ghi.b("copper"));
        $$0.accept(dum.e, ghi.b("iron"));
        $$0.accept(dum.f, ghi.b("gold"));
        $$0.accept(dum.g, ghi.b("diamond"));
        $$0.accept(dum.h, inr.a().b(amo.b("turtle_scute"), false).a());
        $$0.accept(dum.i, ghi.b("netherite"));
        $$0.accept(dum.j, inr.a().a(inr.d.d, inr.c.b(amo.b("armadillo_scute"), false)).a(inr.d.d, inr.c.b(amo.b("armadillo_scute_overlay"), true)).a());
        $$0.accept(dum.k, inr.a().a(inr.d.c, new inr.c(amo.b("elytra"), Optional.empty(), true)).a());
        inr.c $$1 = new inr.c(amo.b("saddle"));
        $$0.accept(dum.l, inr.a().a(inr.d.g, $$1).a(inr.d.h, $$1).a(inr.d.i, $$1).a(inr.d.j, $$1).a(inr.d.k, $$1).a(inr.d.l, $$1).a(inr.d.m, $$1).a(inr.d.o, $$1).a(inr.d.n, $$1).a(inr.d.q, $$1).a());
        for (Map.Entry<dkr, amt<dul>> $$2 : dum.o.entrySet()) {
            dkr $$3 = $$2.getKey();
            amt<dul> $$4 = $$2.getValue();
            $$0.accept($$4, inr.a().a(inr.d.p, inr.c.b(amo.b($$3.c() + "_harness"), false)).a());
        }
        for (Map.Entry<dkr, amt<dul>> $$5 : dum.m.entrySet()) {
            dkr $$6 = $$5.getKey();
            amt<dul> $$7 = $$5.getValue();
            $$0.accept($$7, inr.a().a(inr.d.f, new inr.c(amo.b($$6.c()))).a());
        }
        $$0.accept(dum.n, inr.a().a(inr.d.f, new inr.c(amo.b("trader_llama"))).a());
    }

    private static inr a(String $$0) {
        return inr.a().a(amo.b($$0)).a();
    }

    private static inr b(String $$0) {
        return inr.a().a(amo.b($$0)).a(inr.d.e, inr.c.a(amo.b($$0), false)).a(inr.d.r, inr.c.a(amo.b($$0), false)).a();
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        HashMap $$12 = new HashMap();
        ghi.a((amt<dul> $$1, inr $$2) -> {
            if ($$12.putIfAbsent($$1, $$2) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + String.valueOf($$1));
            }
        });
        return mq.a($$0, inr.a, this.d::a, $$12);
    }

    @Override
    public String a() {
        return "Equipment Asset Definitions";
    }
}

