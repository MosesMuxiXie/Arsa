/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class gjd {
    private static final int a = 182;
    private static final int b = 5;
    private static final amo[] c = new amo[]{amo.b("boss_bar/pink_background"), amo.b("boss_bar/blue_background"), amo.b("boss_bar/red_background"), amo.b("boss_bar/green_background"), amo.b("boss_bar/yellow_background"), amo.b("boss_bar/purple_background"), amo.b("boss_bar/white_background")};
    private static final amo[] d = new amo[]{amo.b("boss_bar/pink_progress"), amo.b("boss_bar/blue_progress"), amo.b("boss_bar/red_progress"), amo.b("boss_bar/green_progress"), amo.b("boss_bar/yellow_progress"), amo.b("boss_bar/purple_progress"), amo.b("boss_bar/white_progress")};
    private static final amo[] e = new amo[]{amo.b("boss_bar/notched_6_background"), amo.b("boss_bar/notched_10_background"), amo.b("boss_bar/notched_12_background"), amo.b("boss_bar/notched_20_background")};
    private static final amo[] f = new amo[]{amo.b("boss_bar/notched_6_progress"), amo.b("boss_bar/notched_10_progress"), amo.b("boss_bar/notched_12_progress"), amo.b("boss_bar/notched_20_progress")};
    private final gfj g;
    final Map<UUID, gjt> h = Maps.newLinkedHashMap();

    public gjd(gfj $$0) {
        this.g = $$0;
    }

    public void a(gir $$0) {
        if (this.h.isEmpty()) {
            return;
        }
        $$0.c();
        bzm $$1 = bzl.a();
        $$1.a("bossHealth");
        int $$2 = $$0.a();
        int $$3 = 12;
        for (gjt $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            int $$6 = $$3;
            this.a($$0, $$5, $$6, $$4);
            yh $$7 = $$4.j();
            int $$8 = this.g.g.a($$7);
            int $$9 = $$2 / 2 - $$8 / 2;
            int $$10 = $$6 - 9;
            $$0.b(this.g.g, $$7, $$9, $$10, -1);
            if (($$3 += 10 + this.g.g.b) < $$0.b() / 3) continue;
            break;
        }
        $$1.c();
    }

    private void a(gir $$0, int $$1, int $$2, ccs $$3) {
        this.a($$0, $$1, $$2, $$3, 182, c, e);
        int $$4 = bgj.b($$3.k(), 0, 182);
        if ($$4 > 0) {
            this.a($$0, $$1, $$2, $$3, $$4, d, f);
        }
    }

    private void a(gir $$0, int $$1, int $$2, ccs $$3, int $$4, amo[] $$5, amo[] $$6) {
        $$0.a(hpa.at, $$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
        if ($$3.m() != ccs.b.a) {
            $$0.a(hpa.at, $$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
        }
    }

    public void a(adk $$0) {
        $$0.a(new adk.b(){

            @Override
            public void a(UUID $$0, yh $$1, float $$2, ccs.a $$3, ccs.b $$4, boolean $$5, boolean $$6, boolean $$7) {
                gjd.this.h.put($$0, new gjt($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
            }

            @Override
            public void a(UUID $$0) {
                gjd.this.h.remove($$0);
            }

            @Override
            public void a(UUID $$0, float $$1) {
                gjd.this.h.get($$0).a($$1);
            }

            @Override
            public void a(UUID $$0, yh $$1) {
                gjd.this.h.get($$0).a($$1);
            }

            @Override
            public void a(UUID $$0, ccs.a $$1, ccs.b $$2) {
                gjt $$3 = gjd.this.h.get($$0);
                $$3.a($$1);
                $$3.a($$2);
            }

            @Override
            public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
                gjt $$4 = gjd.this.h.get($$0);
                $$4.a($$1);
                $$4.b($$2);
                $$4.c($$3);
            }
        });
    }

    public void a() {
        this.h.clear();
    }

    public boolean b() {
        if (!this.h.isEmpty()) {
            for (ccs ccs2 : this.h.values()) {
                if (!ccs2.o()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        if (!this.h.isEmpty()) {
            for (ccs ccs2 : this.h.values()) {
                if (!ccs2.n()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        if (!this.h.isEmpty()) {
            for (ccs ccs2 : this.h.values()) {
                if (!ccs2.p()) continue;
                return true;
            }
        }
        return false;
    }
}

