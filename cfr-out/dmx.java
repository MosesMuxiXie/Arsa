/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Consumer;

public class dmx
extends dlp {
    private static final l a = l.h;
    private static final l b = l.j;
    private static final yh c = yh.c(bhs.a("item", amo.b("smithing_template.ingredients"))).a(a);
    private static final yh d = yh.c(bhs.a("item", amo.b("smithing_template.applies_to"))).a(a);
    private static final yh o = yh.c(bhs.a("item", amo.b("smithing_template"))).a(a);
    private static final yh p = yh.c(bhs.a("item", amo.b("smithing_template.armor_trim.applies_to"))).a(b);
    private static final yh q = yh.c(bhs.a("item", amo.b("smithing_template.armor_trim.ingredients"))).a(b);
    private static final yh r = yh.c(bhs.a("item", amo.b("smithing_template.armor_trim.base_slot_description")));
    private static final yh s = yh.c(bhs.a("item", amo.b("smithing_template.armor_trim.additions_slot_description")));
    private static final yh t = yh.c(bhs.a("item", amo.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
    private static final yh u = yh.c(bhs.a("item", amo.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
    private static final yh v = yh.c(bhs.a("item", amo.b("smithing_template.netherite_upgrade.base_slot_description")));
    private static final yh w = yh.c(bhs.a("item", amo.b("smithing_template.netherite_upgrade.additions_slot_description")));
    private static final amo x = amo.b("container/slot/helmet");
    private static final amo y = amo.b("container/slot/chestplate");
    private static final amo z = amo.b("container/slot/leggings");
    private static final amo A = amo.b("container/slot/boots");
    private static final amo B = amo.b("container/slot/hoe");
    private static final amo C = amo.b("container/slot/axe");
    private static final amo D = amo.b("container/slot/sword");
    private static final amo E = amo.b("container/slot/shovel");
    private static final amo F = amo.b("container/slot/spear");
    private static final amo G = amo.b("container/slot/pickaxe");
    private static final amo H = amo.b("container/slot/ingot");
    private static final amo I = amo.b("container/slot/redstone_dust");
    private static final amo J = amo.b("container/slot/quartz");
    private static final amo K = amo.b("container/slot/emerald");
    private static final amo L = amo.b("container/slot/diamond");
    private static final amo M = amo.b("container/slot/lapis_lazuli");
    private static final amo N = amo.b("container/slot/amethyst_shard");
    private static final amo O = amo.b("container/slot/nautilus_armor");
    private final yh P;
    private final yh Q;
    private final yh R;
    private final yh S;
    private final List<amo> T;
    private final List<amo> U;

    public dmx(yh $$0, yh $$1, yh $$2, yh $$3, List<amo> $$4, List<amo> $$5, dlp.a $$6) {
        super($$6);
        this.P = $$0;
        this.Q = $$1;
        this.R = $$2;
        this.S = $$3;
        this.T = $$4;
        this.U = $$5;
    }

    public static dmx a(dlp.a $$0) {
        return new dmx(p, q, r, s, dmx.o(), dmx.p(), $$0);
    }

    public static dmx b(dlp.a $$0) {
        return new dmx(t, u, v, w, dmx.q(), dmx.r(), $$0);
    }

    private static List<amo> o() {
        return List.of(x, y, z, A);
    }

    private static List<amo> p() {
        return List.of(H, I, M, J, L, K, N);
    }

    private static List<amo> q() {
        return List.of(x, D, y, G, z, C, A, B, E, O, F);
    }

    private static List<amo> r() {
        return List.of(H);
    }

    @Override
    public void a(dlt $$0, dlp.b $$1, dpd $$2, Consumer<yh> $$3, dnj $$4) {
        $$3.accept(o);
        $$3.accept(yg.a);
        $$3.accept(d);
        $$3.accept(yg.a().b(this.P));
        $$3.accept(c);
        $$3.accept(yg.a().b(this.Q));
    }

    public yh a() {
        return this.R;
    }

    public yh b() {
        return this.S;
    }

    public List<amo> c() {
        return this.T;
    }

    public List<amo> n() {
        return this.U;
    }
}

