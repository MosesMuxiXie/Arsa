/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class fum
extends fut {
    private static final int a = 0;
    private static final int b = 1;
    private final fur c;
    private final String d;
    private final Set<String> e = Sets.newHashSet();
    private yh f;
    private yh g = yg.a;
    private yh h = yg.a;
    private boolean i = true;
    private boolean j = true;
    private fut.b k = fut.b.a;
    private fut.b l = fut.b.a;
    private l m = l.v;
    private fut.a n = fut.a.a;
    private final zf o;

    public fum(fur $$0, String $$1) {
        this.c = $$0;
        this.d = $$1;
        this.f = yh.b($$1);
        this.o = zf.a.a($$1).a(new yo.e(yh.b($$1)));
    }

    public a a() {
        return new a(this.d, Optional.of(this.f), this.m != l.v ? Optional.of(this.m) : Optional.empty(), this.i, this.j, this.g, this.h, this.k, this.l, this.n, List.copyOf(this.e));
    }

    public fur b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.d;
    }

    public yh d() {
        return this.f;
    }

    public yw e() {
        yw $$0 = yk.a(this.f.f().c(this.o));
        l $$1 = this.o();
        if ($$1 != l.v) {
            $$0.a($$1);
        }
        return $$0;
    }

    public void a(yh $$0) {
        if ($$0 == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.f = $$0;
        this.c.b(this);
    }

    public void b(@Nullable yh $$0) {
        this.g = $$0 == null ? yg.a : $$0;
        this.c.b(this);
    }

    public yh f() {
        return this.g;
    }

    public void c(@Nullable yh $$0) {
        this.h = $$0 == null ? yg.a : $$0;
        this.c.b(this);
    }

    public yh g() {
        return this.h;
    }

    @Override
    public Collection<String> h() {
        return this.e;
    }

    @Override
    public yw d(yh $$0) {
        yw $$1 = yh.i().b(this.g).b($$0).b(this.h);
        l $$2 = this.o();
        if ($$2 != l.v) {
            $$1.a($$2);
        }
        return $$1;
    }

    public static yw a(@Nullable fut $$0, yh $$1) {
        if ($$0 == null) {
            return $$1.f();
        }
        return $$0.d($$1);
    }

    @Override
    public boolean i() {
        return this.i;
    }

    public void a(boolean $$0) {
        this.i = $$0;
        this.c.b(this);
    }

    @Override
    public boolean j() {
        return this.j;
    }

    public void b(boolean $$0) {
        this.j = $$0;
        this.c.b(this);
    }

    @Override
    public fut.b k() {
        return this.k;
    }

    @Override
    public fut.b l() {
        return this.l;
    }

    public void a(fut.b $$0) {
        this.k = $$0;
        this.c.b(this);
    }

    public void b(fut.b $$0) {
        this.l = $$0;
        this.c.b(this);
    }

    @Override
    public fut.a m() {
        return this.n;
    }

    public void a(fut.a $$0) {
        this.n = $$0;
        this.c.b(this);
    }

    public int n() {
        int $$0 = 0;
        if (this.i()) {
            $$0 |= 1;
        }
        if (this.j()) {
            $$0 |= 2;
        }
        return $$0;
    }

    public void a(int $$0) {
        this.a(($$0 & 1) > 0);
        this.b(($$0 & 2) > 0);
    }

    public void a(l $$0) {
        this.m = $$0;
        this.c.b(this);
    }

    @Override
    public l o() {
        return this.m;
    }

    public static final class a
    extends Record {
        private final String b;
        private final Optional<yh> c;
        private final Optional<l> d;
        private final boolean e;
        private final boolean f;
        private final yh g;
        private final yh h;
        private final fut.b i;
        private final fut.b j;
        private final fut.a k;
        private final List<String> l;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("Name").forGetter(a::a), (App)yj.a.optionalFieldOf("DisplayName").forGetter(a::b), (App)l.x.optionalFieldOf("TeamColor").forGetter(a::c), (App)Codec.BOOL.optionalFieldOf("AllowFriendlyFire", (Object)true).forGetter(a::d), (App)Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", (Object)true).forGetter(a::e), (App)yj.a.optionalFieldOf("MemberNamePrefix", (Object)yg.a).forGetter(a::f), (App)yj.a.optionalFieldOf("MemberNameSuffix", (Object)yg.a).forGetter(a::g), (App)fut.b.e.optionalFieldOf("NameTagVisibility", (Object)fut.b.a).forGetter(a::h), (App)fut.b.e.optionalFieldOf("DeathMessageVisibility", (Object)fut.b.a).forGetter(a::i), (App)fut.a.e.optionalFieldOf("CollisionRule", (Object)fut.a.a).forGetter(a::j), (App)Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(a::k)).apply((Applicative)$$0, a::new));

        public a(String $$0, Optional<yh> $$1, Optional<l> $$2, boolean $$3, boolean $$4, yh $$5, yh $$6, fut.b $$7, fut.b $$8, fut.a $$9, List<String> $$10) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
            this.h = $$6;
            this.i = $$7;
            this.j = $$8;
            this.k = $$9;
            this.l = $$10;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;displayName;color;allowFriendlyFire;seeFriendlyInvisibles;memberNamePrefix;memberNameSuffix;nameTagVisibility;deathMessageVisibility;collisionRule;players", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;displayName;color;allowFriendlyFire;seeFriendlyInvisibles;memberNamePrefix;memberNameSuffix;nameTagVisibility;deathMessageVisibility;collisionRule;players", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;displayName;color;allowFriendlyFire;seeFriendlyInvisibles;memberNamePrefix;memberNameSuffix;nameTagVisibility;deathMessageVisibility;collisionRule;players", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public Optional<yh> b() {
            return this.c;
        }

        public Optional<l> c() {
            return this.d;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }

        public yh f() {
            return this.g;
        }

        public yh g() {
            return this.h;
        }

        public fut.b h() {
            return this.i;
        }

        public fut.b i() {
            return this.j;
        }

        public fut.a j() {
            return this.k;
        }

        public List<String> k() {
            return this.l;
        }
    }
}

