/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class enl {
    private static final String j = "spawn_data";
    private static final String k = "next_mob_spawns_at";
    private static final int l = 20;
    private static final int m = 18000;
    final Set<UUID> a = new HashSet<UUID>();
    final Set<UUID> b = new HashSet<UUID>();
    long c;
    long d;
    int e;
    Optional<dxi> f = Optional.empty();
    Optional<amt<fof>> g = Optional.empty();
    private @Nullable cgk n;
    private @Nullable cbn<dlt> o;
    double h;
    double i;

    public a a() {
        return new a(Set.copyOf(this.a), Set.copyOf(this.b), this.c, this.d, this.e, this.f, this.g);
    }

    public void a(a $$0) {
        this.a.clear();
        this.a.addAll($$0.b);
        this.b.clear();
        this.b.addAll($$0.c);
        this.c = $$0.d;
        this.d = $$0.e;
        this.e = $$0.f;
        this.f = $$0.g;
        this.g = $$0.h;
    }

    public void b() {
        this.b.clear();
        this.f = Optional.empty();
        this.c();
    }

    public void c() {
        this.a.clear();
        this.e = 0;
        this.d = 0L;
        this.c = 0L;
    }

    public boolean a(enh $$0, bgr $$1) {
        boolean $$2 = this.b($$0, $$1).a().i("id").isPresent();
        return $$2 || !$$0.a().i().c();
    }

    public boolean a(eni $$0, int $$1) {
        return this.e >= $$0.a($$1);
    }

    public boolean d() {
        return this.b.isEmpty();
    }

    public boolean a(axf $$0, eni $$1, int $$2) {
        return $$0.au() >= this.d && this.b.size() < $$1.b($$2);
    }

    public int a(is $$0) {
        if (this.a.isEmpty()) {
            bhs.b("Trial Spawner at " + String.valueOf($$0) + " has no detected players");
        }
        return Math.max(0, this.a.size() - 1);
    }

    public void a(axf $$0, is $$1, enh $$2) {
        List<UUID> $$9;
        boolean $$7;
        boolean $$32;
        boolean bl2 = $$32 = ($$1.a() + $$0.au()) % 20L != 0L;
        if ($$32) {
            return;
        }
        if ($$2.g().equals(enk.f) && $$2.d()) {
            return;
        }
        List<UUID> $$4 = $$2.j().detect($$0, $$2.k(), $$1, $$2.f(), true);
        if ($$2.d() || $$4.isEmpty()) {
            boolean $$5 = false;
        } else {
            Optional<Pair<ddm, jd<cfk>>> $$6 = enl.a($$0, $$4);
            $$6.ifPresent($$3 -> {
                ddm $$4 = (ddm)$$3.getFirst();
                if ($$3.getSecond() == cfo.E) {
                    enl.a($$4);
                }
                $$0.c(3020, is.a($$4.bV()), 0);
                $$2.a($$0, $$1);
            });
            $$7 = $$6.isPresent();
        }
        if ($$2.g().equals(enk.f) && !$$7) {
            return;
        }
        boolean $$8 = $$2.h().a.isEmpty();
        List<UUID> list = $$9 = $$8 ? $$4 : $$2.j().detect($$0, $$2.k(), $$1, $$2.f(), false);
        if (this.a.addAll($$9)) {
            this.d = Math.max($$0.au() + 40L, this.d);
            if (!$$7) {
                int $$10 = $$2.d() ? 3019 : 3013;
                $$0.c($$10, $$1, this.a.size());
            }
        }
    }

    private static Optional<Pair<ddm, jd<cfk>>> a(axf $$02, List<UUID> $$1) {
        ddm $$2 = null;
        for (UUID $$3 : $$1) {
            ddm $$4 = $$02.c($$3);
            if ($$4 == null) continue;
            jd<cfk> $$5 = cfo.H;
            if ($$4.d($$5)) {
                return Optional.of(Pair.of((Object)$$4, $$5));
            }
            if (!$$4.d(cfo.E)) continue;
            $$2 = $$4;
        }
        return Optional.ofNullable($$2).map($$0 -> Pair.of((Object)$$0, cfo.E));
    }

    public void a(enh $$0, axf $$12) {
        this.b.stream().map($$12::d).forEach($$1 -> {
            if ($$1 == null) {
                return;
            }
            $$12.c(3012, $$1.dK(), enh.a.a.a());
            if ($$1 instanceof chn) {
                chn $$2 = (chn)$$1;
                $$2.b($$12);
            }
            $$1.a(cgk.e.b);
        });
        if (!$$0.c().i().c()) {
            this.f = Optional.empty();
        }
        this.e = 0;
        this.b.clear();
        this.d = $$12.au() + (long)$$0.c().h();
        $$0.i();
        this.c = $$12.au() + $$0.c().a();
    }

    private static void a(ddm $$0) {
        cfm $$1 = $$0.e(cfo.E);
        if ($$1 == null) {
            return;
        }
        int $$2 = $$1.e() + 1;
        int $$3 = 18000 * $$2;
        $$0.g(cfo.E);
        $$0.a(new cfm(cfo.H, $$3, 0));
    }

    public boolean a(axf $$0, float $$1, int $$2) {
        long $$3 = this.c - (long)$$2;
        return (float)$$0.au() >= (float)$$3 + $$1;
    }

    public boolean b(axf $$0, float $$1, int $$2) {
        long $$3 = this.c - (long)$$2;
        return (float)($$0.au() - $$3) % $$1 == 0.0f;
    }

    public boolean a(axf $$0) {
        return $$0.au() >= this.c;
    }

    protected dxi b(enh $$0, bgr $$1) {
        if (this.f.isPresent()) {
            return this.f.get();
        }
        cbn<dxi> $$2 = $$0.a().i();
        Optional<dxi> $$3 = $$2.c() ? this.f : $$2.a($$1);
        this.f = Optional.of($$3.orElseGet(dxi::new));
        $$0.i();
        return this.f.get();
    }

    public @Nullable cgk a(enh $$0, dwo $$1, enk $$2) {
        uz $$3;
        if (!$$2.d()) {
            return null;
        }
        if (this.n == null && ($$3 = this.b($$0, $$1.G_()).a()).i("id").isPresent()) {
            this.n = cgu.a($$3, $$1, cgt.q, cgq.a);
        }
        return this.n;
    }

    public uz a(enk $$0) {
        uz $$12 = new uz();
        if ($$0 == enk.c) {
            $$12.a(k, this.d);
        }
        this.f.ifPresent($$1 -> $$12.a(j, dxi.b, $$1));
        return $$12;
    }

    public double e() {
        return this.h;
    }

    public double f() {
        return this.i;
    }

    cbn<dlt> a(axf $$0, eni $$1, is $$2) {
        long $$5;
        fod $$4;
        if (this.o != null) {
            return this.o;
        }
        fof $$3 = $$0.s().be().a($$1.k());
        ObjectArrayList<dlt> $$6 = $$3.a($$4 = new fod.a($$0).a(fqw.b), $$5 = enl.a($$0, $$2));
        if ($$6.isEmpty()) {
            return cbn.a();
        }
        cbn.a<dlt> $$7 = cbn.b();
        for (dlt $$8 : $$6) {
            $$7.a($$8.c(1), $$8.N());
        }
        this.o = $$7.a();
        return this.o;
    }

    private static long a(axf $$0, is $$1) {
        is $$2 = new is(bgj.b((float)$$1.u() / 30.0f), bgj.b((float)$$1.v() / 20.0f), bgj.b((float)$$1.w() / 30.0f));
        return $$0.J() + $$2.a();
    }

    public static final class a
    extends Record {
        final Set<UUID> b;
        final Set<UUID> c;
        final long d;
        final long e;
        final int f;
        final Optional<dxi> g;
        final Optional<amt<fof>> h;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)jx.b.lenientOptionalFieldOf("registered_players", Set.of()).forGetter(a::a), (App)jx.b.lenientOptionalFieldOf("current_mobs", Set.of()).forGetter(a::b), (App)Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", (Object)0L).forGetter(a::c), (App)Codec.LONG.lenientOptionalFieldOf(enl.k, (Object)0L).forGetter(a::d), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", (Object)0).forGetter(a::e), (App)dxi.b.lenientOptionalFieldOf(enl.j).forGetter(a::f), (App)fof.a.lenientOptionalFieldOf("ejecting_loot_table").forGetter(a::g)).apply((Applicative)$$0, a::new));

        public a(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dxi> $$5, Optional<amt<fof>> $$6) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
            this.h = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "detectedPlayers;currentMobs;cooldownEndsAt;nextMobSpawnsAt;totalMobsSpawned;nextSpawnData;ejectingLootTable", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "detectedPlayers;currentMobs;cooldownEndsAt;nextMobSpawnsAt;totalMobsSpawned;nextSpawnData;ejectingLootTable", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "detectedPlayers;currentMobs;cooldownEndsAt;nextMobSpawnsAt;totalMobsSpawned;nextSpawnData;ejectingLootTable", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public Set<UUID> a() {
            return this.b;
        }

        public Set<UUID> b() {
            return this.c;
        }

        public long c() {
            return this.d;
        }

        public long d() {
            return this.e;
        }

        public int e() {
            return this.f;
        }

        public Optional<dxi> f() {
            return this.g;
        }

        public Optional<amt<fof>> g() {
            return this.h;
        }
    }
}

