/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class drb {
    public static final amt<? extends jq<drb>> a = amt.a(amo.b("recipe_property_set"));
    public static final amt<drb> b = drb.a("smithing_base");
    public static final amt<drb> c = drb.a("smithing_template");
    public static final amt<drb> d = drb.a("smithing_addition");
    public static final amt<drb> e = drb.a("furnace_input");
    public static final amt<drb> f = drb.a("blast_furnace_input");
    public static final amt<drb> g = drb.a("smoker_input");
    public static final amt<drb> h = drb.a("campfire_input");
    public static final aao<xq, drb> i = dlp.f.a(aam.a()).a($$0 -> new drb(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
    public static final drb j = new drb(Set.of());
    private final Set<jd<dlp>> k;

    private drb(Set<jd<dlp>> $$0) {
        this.k = $$0;
    }

    private static amt<drb> a(String $$0) {
        return amt.a(a, amo.b($$0));
    }

    public boolean a(dlt $$0) {
        return this.k.contains($$0.i());
    }

    static drb a(Collection<dqo> $$0) {
        Set<jd<dlp>> $$1 = $$0.stream().flatMap(dqo::a).collect(Collectors.toUnmodifiableSet());
        return new drb($$1);
    }
}

