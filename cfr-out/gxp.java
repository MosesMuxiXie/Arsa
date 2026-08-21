/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class gxp
extends gjk<gxn> {
    private final gxq a;
    private final List<gxn> f = Lists.newArrayList();
    private @Nullable String n;

    public gxp(gxq $$0, gfj $$1, int $$2, int $$3, int $$4, int $$5) {
        super($$1, $$2, $$3, $$4, $$5);
        this.a = $$0;
    }

    @Override
    protected void a(gir $$0) {
    }

    @Override
    protected void b(gir $$0) {
    }

    @Override
    protected void c(gir $$0) {
        $$0.c(this.aT_(), this.aU_() + 4, this.E(), this.F());
    }

    public void a(Collection<UUID> $$0, double $$1, boolean $$2) {
        HashMap<UUID, gxn> $$3 = new HashMap<UUID, gxn>();
        this.a($$0, $$3);
        if ($$2) {
            this.a((Map<UUID, gxn>)$$3);
        }
        this.a($$3, $$2);
        this.a($$3.values(), $$1);
    }

    private void a(Collection<UUID> $$0, Map<UUID, gxn> $$1) {
        hig $$2 = this.c.s.b;
        for (UUID $$3 : $$0) {
            hiq $$4 = $$2.a($$3);
            if ($$4 == null) continue;
            gxn $$5 = this.a($$3, $$4);
            $$1.put($$3, $$5);
        }
    }

    @Override
    private void a(Map<UUID, gxn> $$0) {
        Map<UUID, hiq> $$12 = this.c.s.b.q();
        for (Map.Entry<UUID, hiq> $$2 : $$12.entrySet()) {
            $$0.computeIfAbsent($$2.getKey(), $$1 -> {
                gxn $$2 = this.a((UUID)$$1, (hiq)$$2.getValue());
                $$2.c(true);
                return $$2;
            });
        }
    }

    private gxn a(UUID $$0, hiq $$1) {
        return new gxn(this.c, this.a, $$0, $$1.a().name(), $$1::g, $$1.d());
    }

    private void a(Map<UUID, gxn> $$0, boolean $$1) {
        Map<UUID, GameProfile> $$22 = gxp.a(this.c.bb().b());
        $$22.forEach(($$2, $$3) -> {
            gxn $$5;
            if ($$1) {
                gxn $$4 = $$0.computeIfAbsent((UUID)$$2, $$1 -> {
                    Object $$2 = new gxn(this.c, this.a, $$3.id(), $$3.name(), this.c.at().a((GameProfile)$$3, true), true);
                    $$2.c(true);
                    return $$2;
                });
            } else {
                $$5 = (gxn)$$0.get($$2);
                if ($$5 == null) {
                    return;
                }
            }
            $$5.d(true);
        });
    }

    private static Map<UUID, GameProfile> a(hiz $$0) {
        Object2ObjectLinkedOpenHashMap $$1 = new Object2ObjectLinkedOpenHashMap();
        for (int $$2 = $$0.b(); $$2 >= $$0.a(); --$$2) {
            hjc.a $$4;
            hjb $$3 = $$0.b($$2);
            if (!($$3 instanceof hjc.a) || !($$4 = (hjc.a)$$3).g().i()) continue;
            $$1.put($$4.e(), $$4.f());
        }
        return $$1;
    }

    private void J() {
        this.f.sort(Comparator.comparing($$0 -> {
            if (this.c.b($$0.t())) {
                return 0;
            }
            if (this.c.bb().a($$0.t())) {
                return 1;
            }
            if ($$0.t().version() == 2) {
                return 4;
            }
            if ($$0.w()) {
                return 2;
            }
            return 3;
        }).thenComparing($$0 -> {
            int $$1;
            if (!$$0.c().isBlank() && (($$1 = $$0.c().codePointAt(0)) == 95 || $$1 >= 97 && $$1 <= 122 || $$1 >= 65 && $$1 <= 90 || $$1 >= 48 && $$1 <= 57)) {
                return 0;
            }
            return 1;
        }).thenComparing(gxn::c, String::compareToIgnoreCase));
    }

    private void a(Collection<gxn> $$0, double $$1) {
        this.f.clear();
        this.f.addAll($$0);
        this.J();
        this.K();
        this.a(this.f);
        this.a($$1);
    }

    private void K() {
        if (this.n != null) {
            this.f.removeIf($$0 -> !$$0.c().toLowerCase(Locale.ROOT).contains(this.n));
            this.a(this.f);
        }
    }

    @Override
    public void a(String $$0) {
        this.n = $$0;
    }

    public boolean d() {
        return this.f.isEmpty();
    }

    public void a(hiq $$0, gxq.a $$1) {
        UUID $$2 = $$0.a().id();
        for (gxn $$3 : this.f) {
            if (!$$3.t().equals($$2)) continue;
            $$3.c(false);
            return;
        }
        if (($$1 == gxq.a.a || this.c.aQ().c($$2)) && (Strings.isNullOrEmpty((String)this.n) || $$0.a().name().toLowerCase(Locale.ROOT).contains(this.n))) {
            boolean $$4 = $$0.d();
            gxn $$5 = new gxn(this.c, this.a, $$0.a().id(), $$0.a().name(), $$0::g, $$4);
            this.c($$5);
            this.f.add($$5);
        }
    }

    @Override
    public void a(UUID $$0) {
        for (gxn $$1 : this.f) {
            if (!$$1.t().equals($$0)) continue;
            $$1.c(true);
            return;
        }
    }

    public void I() {
        this.f.forEach($$0 -> $$0.a(this.c.bb()));
    }
}

