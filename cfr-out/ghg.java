/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ghg
implements mq {
    private static final amo d = amo.b("trims/color_palettes/trim_palette");
    private static final Map<String, amo> e = ghg.c().collect(Collectors.toMap(duq.a::a, $$0 -> amo.b("trims/color_palettes/" + $$0.a())));
    private static final List<amt<dut>> f = List.of(duu.a, duu.b, duu.c, duu.d, duu.e, duu.f, duu.g, duu.h, duu.i, duu.j, duu.k, duu.l, duu.m, duu.n, duu.o, duu.p, duu.q, duu.r);
    private static final List<inr.d> g = List.of(inr.d.a, inr.d.b);
    private final ms.a h;

    public ghg(ms $$0) {
        this.h = $$0.a(ms.b.b, "atlases");
    }

    private static List<amo> b() {
        ArrayList<amo> $$0 = new ArrayList<amo>(f.size() * g.size());
        for (amt<dut> $$12 : f) {
            amo $$2 = duu.a($$12);
            for (inr.d $$3 : g) {
                $$0.add($$2.a($$1 -> $$3.a() + "/" + $$1));
            }
        }
        return $$0;
    }

    private static ilu a(ins $$0) {
        return new imb($$0.b());
    }

    private static ilu a(hom $$0) {
        return new ily($$0.b(), $$0.b() + "/");
    }

    private static List<ilu> b(hom $$0) {
        return List.of(ghg.a($$0));
    }

    private static List<ilu> a(String $$0) {
        return List.of(new ily($$0, ""));
    }

    private static Stream<duq.a> c() {
        return ghj.e.stream().map(ghj.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(duq.a::a));
    }

    private static List<ilu> d() {
        return List.of(new ima(ghg.b(), d, e));
    }

    private static List<ilu> e() {
        return List.of(ghg.a(hpj.n), ghg.a(hrq.a), ghg.a(hrg.a), ghg.a(hrt.a));
    }

    private static List<ilu> f() {
        return List.of(ghg.a(hpj.m), new ima(List.of(ghj.a, ghj.b, ghj.c, ghj.d), d, e));
    }

    private static List<ilu> g() {
        return List.of(ghg.a(inx.h), ghg.a(hpj.p));
    }

    private static List<ilu> h() {
        return List.of(ghg.a(inx.i), ghg.a(inx.j), ghg.a(hpj.q));
    }

    private static List<ilu> i() {
        return List.of(new ily("gui/sprites", ""), new ily("mob_effect", "mob_effect/"));
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        return CompletableFuture.allOf(this.a($$0, ml.a, ghg.d()), this.a($$0, ml.b, ghg.g()), this.a($$0, ml.c, ghg.b(hpj.t)), this.a($$0, ml.d, ghg.e()), this.a($$0, ml.e, ghg.f()), this.a($$0, ml.f, ghg.b(hpj.r)), this.a($$0, ml.g, ghg.b(hpj.s)), this.a($$0, ml.h, ghg.i()), this.a($$0, ml.i, ghg.a("map/decorations")), this.a($$0, ml.j, ghg.a("painting")), this.a($$0, ml.k, ghg.a("particle")), this.a($$0, ml.l, ghg.h()), this.a($$0, ml.m, ghg.b(hpj.u)), this.a($$0, ml.n, ghg.b(hpj.v)), this.a($$0, ml.o, ghg.a("environment/celestial")));
    }

    private CompletableFuture<?> a(mo $$0, amo $$1, List<ilu> $$2) {
        return mq.a($$0, ilw.b, $$2, this.h.a($$1));
    }

    @Override
    public String a() {
        return "Atlas Definitions";
    }
}

