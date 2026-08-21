/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class etk
extends Record {
    private final int ak;
    public static final jd.c<etk> a = etk.a("block_activate");
    public static final jd.c<etk> b = etk.a("block_attach");
    public static final jd.c<etk> c = etk.a("block_change");
    public static final jd.c<etk> d = etk.a("block_close");
    public static final jd.c<etk> e = etk.a("block_deactivate");
    public static final jd.c<etk> f = etk.a("block_destroy");
    public static final jd.c<etk> g = etk.a("block_detach");
    public static final jd.c<etk> h = etk.a("block_open");
    public static final jd.c<etk> i = etk.a("block_place");
    public static final jd.c<etk> j = etk.a("container_close");
    public static final jd.c<etk> k = etk.a("container_open");
    public static final jd.c<etk> l = etk.a("drink");
    public static final jd.c<etk> m = etk.a("eat");
    public static final jd.c<etk> n = etk.a("elytra_glide");
    public static final jd.c<etk> o = etk.a("entity_damage");
    public static final jd.c<etk> p = etk.a("entity_die");
    public static final jd.c<etk> q = etk.a("entity_dismount");
    public static final jd.c<etk> r = etk.a("entity_interact");
    public static final jd.c<etk> s = etk.a("entity_mount");
    public static final jd.c<etk> t = etk.a("entity_place");
    public static final jd.c<etk> u = etk.a("entity_action");
    public static final jd.c<etk> v = etk.a("equip");
    public static final jd.c<etk> w = etk.a("explode");
    public static final jd.c<etk> x = etk.a("flap");
    public static final jd.c<etk> y = etk.a("fluid_pickup");
    public static final jd.c<etk> z = etk.a("fluid_place");
    public static final jd.c<etk> A = etk.a("hit_ground");
    public static final jd.c<etk> B = etk.a("instrument_play");
    public static final jd.c<etk> C = etk.a("item_interact_finish");
    public static final jd.c<etk> D = etk.a("item_interact_start");
    public static final jd.c<etk> E = etk.a("jukebox_play", 10);
    public static final jd.c<etk> F = etk.a("jukebox_stop_play", 10);
    public static final jd.c<etk> G = etk.a("lightning_strike");
    public static final jd.c<etk> H = etk.a("note_block_play");
    public static final jd.c<etk> I = etk.a("prime_fuse");
    public static final jd.c<etk> J = etk.a("projectile_land");
    public static final jd.c<etk> K = etk.a("projectile_shoot");
    public static final jd.c<etk> L = etk.a("sculk_sensor_tendrils_clicking");
    public static final jd.c<etk> M = etk.a("shear");
    public static final jd.c<etk> N = etk.a("shriek", 32);
    public static final jd.c<etk> O = etk.a("splash");
    public static final jd.c<etk> P = etk.a("step");
    public static final jd.c<etk> Q = etk.a("swim");
    public static final jd.c<etk> R = etk.a("teleport");
    public static final jd.c<etk> S = etk.a("unequip");
    public static final jd.c<etk> T = etk.a("resonate_1");
    public static final jd.c<etk> U = etk.a("resonate_2");
    public static final jd.c<etk> V = etk.a("resonate_3");
    public static final jd.c<etk> W = etk.a("resonate_4");
    public static final jd.c<etk> X = etk.a("resonate_5");
    public static final jd.c<etk> Y = etk.a("resonate_6");
    public static final jd.c<etk> Z = etk.a("resonate_7");
    public static final jd.c<etk> aa = etk.a("resonate_8");
    public static final jd.c<etk> ab = etk.a("resonate_9");
    public static final jd.c<etk> ac = etk.a("resonate_10");
    public static final jd.c<etk> ad = etk.a("resonate_11");
    public static final jd.c<etk> ae = etk.a("resonate_12");
    public static final jd.c<etk> af = etk.a("resonate_13");
    public static final jd.c<etk> ag = etk.a("resonate_14");
    public static final jd.c<etk> ah = etk.a("resonate_15");
    public static final int ai = 16;
    public static final Codec<jd<etk>> aj = amr.a(mj.N);

    public etk(int $$0) {
        this.ak = $$0;
    }

    public static jd<etk> a(jq<etk> $$0) {
        return a;
    }

    public int a() {
        return this.ak;
    }

    private static jd.c<etk> a(String $$0) {
        return etk.a($$0, 16);
    }

    private static jd.c<etk> a(String $$0, int $$1) {
        return jq.b(mi.a, amo.b($$0), new etk($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{etk.class, "notificationRadius", "ak"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{etk.class, "notificationRadius", "ak"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{etk.class, "notificationRadius", "ak"}, this, $$0);
    }

    public static final class b
    implements Comparable<b> {
        private final jd<etk> a;
        private final ftm b;
        private final a c;
        private final etm d;
        private final double e;

        public b(jd<etk> $$0, ftm $$1, a $$2, etm $$3, ftm $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$1.g($$4);
        }

        public int a(b $$0) {
            return Double.compare(this.e, $$0.e);
        }

        public jd<etk> a() {
            return this.a;
        }

        public ftm b() {
            return this.b;
        }

        public a c() {
            return this.c;
        }

        public etm d() {
            return this.d;
        }

        @Override
        public /* synthetic */ int compareTo(Object object) {
            return this.a((b)object);
        }
    }

    public record a(@Nullable cgk a, @Nullable eoh b) {
        public static a a(@Nullable cgk $$0) {
            return new a($$0, null);
        }

        public static a a(@Nullable eoh $$0) {
            return new a(null, $$0);
        }

        public static a a(@Nullable cgk $$0, @Nullable eoh $$1) {
            return new a($$0, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sourceEntity;affectedState", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sourceEntity;affectedState", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sourceEntity;affectedState", "a", "b"}, this, $$0);
        }
    }
}

