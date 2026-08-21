/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class gkg {
    private static final amo b = amo.b("icon/ping_unknown");
    private static final amo c = amo.b("icon/ping_1");
    private static final amo d = amo.b("icon/ping_2");
    private static final amo e = amo.b("icon/ping_3");
    private static final amo f = amo.b("icon/ping_4");
    private static final amo g = amo.b("icon/ping_5");
    private static final amo h = amo.b("hud/heart/container_blinking");
    private static final amo i = amo.b("hud/heart/container");
    private static final amo j = amo.b("hud/heart/full_blinking");
    private static final amo k = amo.b("hud/heart/half_blinking");
    private static final amo l = amo.b("hud/heart/absorbing_full_blinking");
    private static final amo m = amo.b("hud/heart/full");
    private static final amo n = amo.b("hud/heart/absorbing_half_blinking");
    private static final amo o = amo.b("hud/heart/half");
    private static final Comparator<hiq> p = Comparator.comparingInt($$0 -> -$$0.k()).thenComparingInt($$0 -> $$0.e() == dwl.d ? 1 : 0).thenComparing($$0 -> t.a($$0.h(), fum::c, "")).thenComparing($$0 -> $$0.a().name(), String::compareToIgnoreCase);
    public static final int a = 20;
    private final gfj q;
    private final giq r;
    private @Nullable yh s;
    private @Nullable yh t;
    private boolean u;
    private final Map<UUID, a> v = new Object2ObjectOpenHashMap();

    public gkg(gfj $$0, giq $$1) {
        this.q = $$0;
        this.r = $$1;
    }

    public yh a(hiq $$0) {
        if ($$0.i() != null) {
            return this.a($$0, $$0.i().f());
        }
        return this.a($$0, fum.a($$0.h(), yh.b($$0.a().name())));
    }

    private yh a(hiq $$0, yw $$1) {
        return $$0.e() == dwl.d ? $$1.a(l.u) : $$1;
    }

    public void a(boolean $$0) {
        if (this.u != $$0) {
            this.v.clear();
            this.u = $$0;
            if ($$0) {
                yw $$1 = yk.a(this.b(), yh.b(", "), this::a);
                this.q.aZ().d(yh.a("multiplayer.player.list.narration", $$1));
            }
        }
    }

    private List<hiq> b() {
        return this.q.s.b.n().stream().sorted(p).limit(80L).toList();
    }

    public void a(gir $$02, int $$12, fur $$2, @Nullable fuj $$3) {
        int $$24;
        boolean $$21;
        int $$18;
        List<hiq> $$4 = this.b();
        ArrayList<b> $$5 = new ArrayList<b>($$4.size());
        int $$6 = this.q.g.b(" ");
        int $$7 = 0;
        int $$8 = 0;
        for (hiq $$9 : $$4) {
            yh $$10 = this.a($$9);
            $$7 = Math.max($$7, this.q.g.a($$10));
            int $$11 = 0;
            yw $$122 = null;
            int $$13 = 0;
            if ($$3 != null) {
                fuq $$14 = fuq.a($$9.a());
                fun $$15 = $$2.d($$14, $$3);
                if ($$15 != null) {
                    $$11 = $$15.a();
                }
                if ($$3.i() != fuu.a.b) {
                    aag $$16 = $$3.a(aaj.d);
                    $$122 = fun.a($$15, $$16);
                    $$13 = this.q.g.a($$122);
                    $$8 = Math.max($$8, $$13 > 0 ? $$6 + $$13 : 0);
                }
            }
            $$5.add(new b($$10, $$11, $$122, $$13));
        }
        if (!this.v.isEmpty()) {
            Set $$17 = $$4.stream().map($$0 -> $$0.a().id()).collect(Collectors.toSet());
            this.v.keySet().removeIf($$1 -> !$$17.contains($$1));
        }
        int $$19 = $$18 = $$4.size();
        int $$20 = 1;
        while ($$19 > 20) {
            $$19 = ($$18 + ++$$20 - 1) / $$20;
        }
        boolean bl2 = $$21 = this.q.Y() || this.q.R().m().h();
        if ($$3 != null) {
            if ($$3.i() == fuu.a.b) {
                int $$22 = 90;
            } else {
                int $$23 = $$8;
            }
        } else {
            $$24 = 0;
        }
        int $$25 = Math.min($$20 * (($$21 ? 9 : 0) + $$7 + $$24 + 13), $$12 - 50) / $$20;
        int $$26 = $$12 / 2 - ($$25 * $$20 + ($$20 - 1) * 5) / 2;
        int $$27 = 10;
        int $$28 = $$25 * $$20 + ($$20 - 1) * 5;
        List<bfr> $$29 = null;
        if (this.t != null) {
            $$29 = this.q.g.c(this.t, $$12 - 50);
            for (bfr bfr2 : $$29) {
                $$28 = Math.max($$28, this.q.g.a(bfr2));
            }
        }
        List<bfr> $$31 = null;
        if (this.s != null) {
            $$31 = this.q.g.c(this.s, $$12 - 50);
            for (bfr $$32 : $$31) {
                $$28 = Math.max($$28, this.q.g.a($$32));
            }
        }
        if ($$29 != null) {
            $$02.a($$12 / 2 - $$28 / 2 - 1, $$27 - 1, $$12 / 2 + $$28 / 2 + 1, $$27 + $$29.size() * this.q.g.b, Integer.MIN_VALUE);
            for (bfr $$33 : $$29) {
                int $$34 = this.q.g.a($$33);
                $$02.b(this.q.g, $$33, $$12 / 2 - $$34 / 2, $$27, -1);
                $$27 += this.q.g.b;
            }
            ++$$27;
        }
        $$02.a($$12 / 2 - $$28 / 2 - 1, $$27 - 1, $$12 / 2 + $$28 / 2 + 1, $$27 + $$19 * 9, Integer.MIN_VALUE);
        int n2 = this.q.k.a(0x20FFFFFF);
        for (int $$36 = 0; $$36 < $$18; ++$$36) {
            int $$46;
            int $$47;
            int $$37 = $$36 / $$19;
            int $$38 = $$36 % $$19;
            int $$39 = $$26 + $$37 * $$25 + $$37 * 5;
            int $$40 = $$27 + $$38 * 9;
            $$02.a($$39, $$40, $$39 + $$25, $$40 + 8, n2);
            if ($$36 >= $$4.size()) continue;
            hiq $$41 = $$4.get($$36);
            b $$42 = (b)$$5.get($$36);
            GameProfile $$43 = $$41.a();
            if ($$21) {
                ddm $$44 = this.q.r.c($$43.id());
                boolean $$45 = $$44 != null && icd.a($$44);
                gke.a($$02, $$41.g().a().b(), $$39, $$40, 8, $$41.j(), $$45, -1);
                $$39 += 9;
            }
            $$02.b(this.q.g, $$42.a, $$39, $$40, $$41.e() == dwl.d ? -1862270977 : -1);
            if ($$3 != null && $$41.e() != dwl.d && ($$47 = ($$46 = $$39 + $$7 + 1) + $$24) - $$46 > 5) {
                this.a($$3, $$40, $$42, $$46, $$47, $$43.id(), $$02);
            }
            this.a($$02, $$25, $$39 - ($$21 ? 9 : 0), $$40, $$41);
        }
        if ($$31 != null) {
            $$02.a($$12 / 2 - $$28 / 2 - 1, ($$27 += $$19 * 9 + 1) - 1, $$12 / 2 + $$28 / 2 + 1, $$27 + $$31.size() * this.q.g.b, Integer.MIN_VALUE);
            for (bfr $$48 : $$31) {
                int $$49 = this.q.g.a($$48);
                $$02.b(this.q.g, $$48, $$12 / 2 - $$49 / 2, $$27, -1);
                $$27 += this.q.g.b;
            }
        }
    }

    protected void a(gir $$0, int $$1, int $$2, int $$3, hiq $$4) {
        amo $$10;
        if ($$4.f() < 0) {
            amo $$5 = b;
        } else if ($$4.f() < 150) {
            amo $$6 = g;
        } else if ($$4.f() < 300) {
            amo $$7 = f;
        } else if ($$4.f() < 600) {
            amo $$8 = e;
        } else if ($$4.f() < 1000) {
            amo $$9 = d;
        } else {
            $$10 = c;
        }
        $$0.a(hpa.at, $$10, $$2 + $$1 - 11, $$3, 10, 8);
    }

    private void a(fuj $$0, int $$1, b $$2, int $$3, int $$4, UUID $$5, gir $$6) {
        if ($$0.i() == fuu.a.b) {
            this.a($$1, $$3, $$4, $$5, $$6, $$2.b);
        } else if ($$2.c != null) {
            $$6.b(this.q.g, $$2.c, $$4 - $$2.d, $$1, -1);
        }
    }

    private void a(int $$0, int $$12, int $$2, UUID $$3, gir $$4, int $$5) {
        a $$6 = this.v.computeIfAbsent($$3, $$1 -> new a($$5));
        $$6.a($$5, this.r.f());
        int $$7 = bgj.f(Math.max($$5, $$6.a()), 2);
        int $$8 = Math.max($$5, Math.max($$6.a(), 20)) / 2;
        boolean $$9 = $$6.a(this.r.f());
        if ($$7 <= 0) {
            return;
        }
        int $$10 = bgj.b(Math.min((float)($$2 - $$12 - 4) / (float)$$8, 9.0f));
        if ($$10 <= 3) {
            yw $$16;
            float $$11 = bgj.a((float)$$5 / 20.0f, 0.0f, 1.0f);
            int $$122 = (int)((1.0f - $$11) * 255.0f) << 16 | (int)($$11 * 255.0f) << 8;
            float $$13 = (float)$$5 / 2.0f;
            yw $$14 = yh.a("multiplayer.player.list.hp", Float.valueOf($$13));
            if ($$2 - this.q.g.a($$14) >= $$12) {
                yw $$15 = $$14;
            } else {
                $$16 = yh.b(Float.toString($$13));
            }
            $$4.b(this.q.g, $$16, ($$2 + $$12 - this.q.g.a($$16)) / 2, $$0, bel.g($$122));
            return;
        }
        amo $$17 = $$9 ? h : i;
        for (int $$18 = $$7; $$18 < $$8; ++$$18) {
            $$4.a(hpa.at, $$17, $$12 + $$18 * $$10, $$0, 9, 9);
        }
        for (int $$19 = 0; $$19 < $$7; ++$$19) {
            $$4.a(hpa.at, $$17, $$12 + $$19 * $$10, $$0, 9, 9);
            if ($$9) {
                if ($$19 * 2 + 1 < $$6.a()) {
                    $$4.a(hpa.at, j, $$12 + $$19 * $$10, $$0, 9, 9);
                }
                if ($$19 * 2 + 1 == $$6.a()) {
                    $$4.a(hpa.at, k, $$12 + $$19 * $$10, $$0, 9, 9);
                }
            }
            if ($$19 * 2 + 1 < $$5) {
                $$4.a(hpa.at, $$19 >= 10 ? l : m, $$12 + $$19 * $$10, $$0, 9, 9);
            }
            if ($$19 * 2 + 1 != $$5) continue;
            $$4.a(hpa.at, $$19 >= 10 ? n : o, $$12 + $$19 * $$10, $$0, 9, 9);
        }
    }

    public void a(@Nullable yh $$0) {
        this.s = $$0;
    }

    public void b(@Nullable yh $$0) {
        this.t = $$0;
    }

    public void a() {
        this.t = null;
        this.s = null;
    }

    static final class b
    extends Record {
        final yh a;
        final int b;
        final @Nullable yh c;
        final int d;

        b(yh $$0, int $$1, @Nullable yh $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "name;score;formattedScore;scoreWidth", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "name;score;formattedScore;scoreWidth", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "name;score;formattedScore;scoreWidth", "a", "b", "c", "d"}, this, $$0);
        }

        public yh a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public @Nullable yh c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }
    }

    static class a {
        private static final long a = 20L;
        private static final long b = 20L;
        private static final long c = 10L;
        private int d;
        private int e;
        private long f;
        private long g;

        public a(int $$0) {
            this.e = $$0;
            this.d = $$0;
        }

        public void a(int $$0, long $$1) {
            if ($$0 != this.d) {
                long $$2 = $$0 < this.d ? 20L : 10L;
                this.g = $$1 + $$2;
                this.d = $$0;
                this.f = $$1;
            }
            if ($$1 - this.f > 20L) {
                this.e = $$0;
            }
        }

        public int a() {
            return this.e;
        }

        public boolean a(long $$0) {
            return this.g > $$0 && (this.g - $$0) % 6L >= 3L;
        }
    }
}

