/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fuu {
    private static final Map<String, fuu> a = Maps.newHashMap();
    private static final Map<String, fuu> p = Maps.newHashMap();
    public static final Codec<fuu> b = Codec.STRING.comapFlatMap($$0 -> fuu.a($$0).map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), fuu::d);
    public static final fuu c = fuu.b("dummy");
    public static final fuu d = fuu.b("trigger");
    public static final fuu e = fuu.b("deathCount");
    public static final fuu f = fuu.b("playerKillCount");
    public static final fuu g = fuu.b("totalKillCount");
    public static final fuu h = fuu.a("health", true, fuu$a.b);
    public static final fuu i = fuu.a("food", true, fuu$a.a);
    public static final fuu j = fuu.a("air", true, fuu$a.a);
    public static final fuu k = fuu.a("armor", true, fuu$a.a);
    public static final fuu l = fuu.a("xp", true, fuu$a.a);
    public static final fuu m = fuu.a("level", true, fuu$a.a);
    public static final fuu[] n = new fuu[]{fuu.b("teamkill." + l.a.g()), fuu.b("teamkill." + l.b.g()), fuu.b("teamkill." + l.c.g()), fuu.b("teamkill." + l.d.g()), fuu.b("teamkill." + l.e.g()), fuu.b("teamkill." + l.f.g()), fuu.b("teamkill." + l.g.g()), fuu.b("teamkill." + l.h.g()), fuu.b("teamkill." + l.i.g()), fuu.b("teamkill." + l.j.g()), fuu.b("teamkill." + l.k.g()), fuu.b("teamkill." + l.l.g()), fuu.b("teamkill." + l.m.g()), fuu.b("teamkill." + l.n.g()), fuu.b("teamkill." + l.o.g()), fuu.b("teamkill." + l.p.g())};
    public static final fuu[] o = new fuu[]{fuu.b("killedByTeam." + l.a.g()), fuu.b("killedByTeam." + l.b.g()), fuu.b("killedByTeam." + l.c.g()), fuu.b("killedByTeam." + l.d.g()), fuu.b("killedByTeam." + l.e.g()), fuu.b("killedByTeam." + l.f.g()), fuu.b("killedByTeam." + l.g.g()), fuu.b("killedByTeam." + l.h.g()), fuu.b("killedByTeam." + l.i.g()), fuu.b("killedByTeam." + l.j.g()), fuu.b("killedByTeam." + l.k.g()), fuu.b("killedByTeam." + l.l.g()), fuu.b("killedByTeam." + l.m.g()), fuu.b("killedByTeam." + l.n.g()), fuu.b("killedByTeam." + l.o.g()), fuu.b("killedByTeam." + l.p.g())};
    private final String q;
    private final boolean r;
    private final a s;

    private static fuu a(String $$0, boolean $$1, a $$2) {
        fuu $$3 = new fuu($$0, $$1, $$2);
        a.put($$0, $$3);
        return $$3;
    }

    private static fuu b(String $$0) {
        return fuu.a($$0, false, fuu$a.a);
    }

    protected fuu(String $$0) {
        this($$0, false, fuu$a.a);
    }

    protected fuu(String $$0, boolean $$1, a $$2) {
        this.q = $$0;
        this.r = $$1;
        this.s = $$2;
        p.put($$0, this);
    }

    public static Set<String> c() {
        return ImmutableSet.copyOf(a.keySet());
    }

    public static Optional<fuu> a(String $$0) {
        fuu $$1 = p.get($$0);
        if ($$1 != null) {
            return Optional.of($$1);
        }
        int $$22 = $$0.indexOf(58);
        if ($$22 < 0) {
            return Optional.empty();
        }
        return mi.w.b(amo.a($$0.substring(0, $$22), '.')).flatMap($$2 -> fuu.a($$2, amo.a($$0.substring($$22 + 1), '.')));
    }

    private static <T> Optional<fuu> a(bdj<T> $$0, amo $$1) {
        return $$0.b().b($$1).map($$0::b);
    }

    public String d() {
        return this.q;
    }

    public boolean e() {
        return this.r;
    }

    public a f() {
        return this.s;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("integer");
        public static final /* enum */ a b = new a("hearts");
        private final String d;
        public static final bhh.a<a> c;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        public String a() {
            return this.d;
        }

        @Override
        public String c() {
            return this.d;
        }

        public static a a(String $$0) {
            return c.a($$0, a);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            e = fuu$a.b();
            c = bhh.a(a::values);
        }
    }
}

