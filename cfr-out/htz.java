/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class htz
implements hug.a {
    private static final boolean a = true;
    private static final boolean b = true;
    private static final boolean c = true;
    private static final boolean d = true;
    private static final boolean e = true;
    private static final boolean f = true;
    private static final boolean g = true;
    private static final boolean h = true;
    private static final boolean i = true;
    private static final boolean j = true;
    private static final boolean k = true;
    private static final boolean l = true;
    private static final int m = 30;
    private static final int n = 30;
    private static final int o = 8;
    private static final float p = 0.32f;
    private static final int q = -23296;
    private static final int r = -3355444;
    private static final int s = -98404;
    private final gfj t;
    private @Nullable UUID u;

    public htz(gfj $$0) {
        this.t = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        this.a($$3);
        if (!this.t.s.au()) {
            this.b();
        }
    }

    private void a(bxg $$0) {
        is $$12 = this.a().d();
        $$0.c(bxf.b, ($$1, $$2) -> {
            if (this.t.s.a((cgk)$$1, 30.0)) {
                bwz $$3 = $$0.a(bxf.e, (cgk)$$1);
                this.a((cgk)$$1, (bwt)$$2, $$3);
            }
        });
        this.c($$0);
        Map<is, Set<UUID>> $$22 = this.b($$0);
        $$0.b(bxf.h, ($$3, $$4) -> {
            if ($$12.a((jy)$$3, 30.0)) {
                htz.a($$3);
                Set<UUID> $$5 = $$22.getOrDefault($$3, Set.of());
                this.a((is)$$3, (bxa)$$4, (Collection<UUID>)$$5, $$0);
            }
        });
        this.d($$0).forEach(($$1, $$2) -> {
            if ($$12.a((jy)$$1, 30.0)) {
                this.a((is)$$1, (List<String>)$$2);
            }
        });
    }

    private Map<is, Set<UUID>> b(bxg $$0) {
        HashMap<is, Set<UUID>> $$12 = new HashMap<is, Set<UUID>>();
        $$0.c(bxf.b, ($$1, $$2) -> {
            for (is $$3 : $$2.d()) {
                $$12.computeIfAbsent($$3, $$0 -> new HashSet()).add($$1.cY());
            }
        });
        return $$12;
    }

    private void c(bxg $$02) {
        HashMap<is, Set> $$12 = new HashMap<is, Set>();
        $$02.c(bxf.b, ($$1, $$2) -> {
            if ($$2.b().isPresent()) {
                $$12.computeIfAbsent($$2.b().get(), $$0 -> new HashSet()).add($$1.cY());
            }
        });
        $$12.forEach(($$0, $$1) -> {
            Set $$2 = $$1.stream().map(ahy::a).collect(Collectors.toSet());
            int $$3 = 1;
            um.a($$2.toString(), $$0, $$3++, -256, 0.32f);
            um.a("Flower", $$0, $$3++, -1, 0.32f);
            um.a($$0, 0.05f, ul.b(bel.a(0.3f, 0.8f, 0.8f, 0.0f)));
        });
    }

    private static String a(Collection<UUID> $$0) {
        if ($$0.isEmpty()) {
            return "-";
        }
        if ($$0.size() > 3) {
            return $$0.size() + " bees";
        }
        return $$0.stream().map(ahy::a).collect(Collectors.toSet()).toString();
    }

    private static void a(is $$0) {
        float $$1 = 0.05f;
        um.a($$0, 0.05f, ul.b(bel.a(0.3f, 0.2f, 0.2f, 1.0f)));
    }

    private void a(is $$0, List<String> $$1) {
        float $$2 = 0.05f;
        um.a($$0, 0.05f, ul.b(bel.a(0.3f, 0.2f, 0.2f, 1.0f)));
        um.a($$1.toString(), $$0, 0, -256, 0.32f);
        um.a("Ghost Hive", $$0, 1, -65536, 0.32f);
    }

    private void a(is $$0, bxa $$1, Collection<UUID> $$2, bxg $$3) {
        int $$4 = 0;
        if (!$$2.isEmpty()) {
            htz.a("Blacklisted by " + htz.a($$2), $$0, $$4++, -65536);
        }
        htz.a("Out: " + htz.a(this.a($$0, $$3)), $$0, $$4++, -3355444);
        if ($$1.b() == 0) {
            htz.a("In: -", $$0, $$4++, -256);
        } else if ($$1.b() == 1) {
            htz.a("In: 1 bee", $$0, $$4++, -256);
        } else {
            htz.a("In: " + $$1.b() + " bees", $$0, $$4++, -256);
        }
        htz.a("Honey: " + $$1.c(), $$0, $$4++, -23296);
        htz.a($$1.a().f().getString() + ($$1.d() ? " (sedated)" : ""), $$0, $$4++, -1);
    }

    private void a(cgk $$0, bwt $$1, @Nullable bwz $$2) {
        boolean $$3 = this.a($$0);
        int $$4 = 0;
        um.a($$0, $$4++, $$1.toString(), -1, 0.48f);
        if ($$1.a().isEmpty()) {
            um.a($$0, $$4++, "No hive", -98404, 0.32f);
        } else {
            um.a($$0, $$4++, "Hive: " + this.a($$0, $$1.a().get()), -256, 0.32f);
        }
        if ($$1.b().isEmpty()) {
            um.a($$0, $$4++, "No flower", -98404, 0.32f);
        } else {
            um.a($$0, $$4++, "Flower: " + this.a($$0, $$1.b().get()), -256, 0.32f);
        }
        if ($$2 != null) {
            for (bwz.a $$5 : $$2.a()) {
                if (!$$5.b()) continue;
                um.a($$0, $$4++, $$5.c(), -16711936, 0.32f);
            }
        }
        if ($$1.c() > 0) {
            int $$6 = $$1.c() < 2400 ? -3355444 : -23296;
            um.a($$0, $$4++, "Travelling: " + $$1.c() + " ticks", $$6, 0.32f);
        }
    }

    private static void a(String $$0, is $$1, int $$2, int $$3) {
        um.a($$0, $$1, $$2, $$3, 0.32f);
    }

    private ger a() {
        return this.t.i.p();
    }

    private String a(cgk $$0, is $$1) {
        double $$2 = $$1.b($$0.dI());
        double $$3 = (double)Math.round($$2 * 10.0) / 10.0;
        return $$1.y() + " (dist " + $$3 + ")";
    }

    private boolean a(cgk $$0) {
        return Objects.equals(this.u, $$0.cY());
    }

    private Collection<UUID> a(is $$0, bxg $$1) {
        HashSet<UUID> $$22 = new HashSet<UUID>();
        $$1.c(bxf.b, ($$2, $$3) -> {
            if ($$3.a($$0)) {
                $$22.add($$2.cY());
            }
        });
        return $$22;
    }

    private Map<is, List<String>> d(bxg $$0) {
        HashMap<is, List<String>> $$1 = new HashMap<is, List<String>>();
        $$0.c(bxf.b, ($$2, $$3) -> {
            if ($$3.a().isPresent() && $$0.a(bxf.h, $$3.a().get()) == null) {
                $$1.computeIfAbsent($$3.a().get(), $$0 -> Lists.newArrayList()).add(ahy.a($$2));
            }
        });
        return $$1;
    }

    private void b() {
        hug.a(this.t.au(), 8).ifPresent($$0 -> {
            this.u = $$0.cY();
        });
    }
}

