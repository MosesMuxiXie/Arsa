/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class anv
extends axb {
    private static final int h = 100;
    private final amo i;
    private final Set<UUID> j = Sets.newHashSet();
    private int k;
    private int l = 100;

    public anv(amo $$0, yh $$1) {
        super($$1, ccs.a.g, ccs.b.a);
        this.i = $$0;
        this.a(0.0f);
    }

    public amo a() {
        return this.i;
    }

    @Override
    public void a(axg $$0) {
        super.a($$0);
        this.j.add($$0.cY());
    }

    public void a(UUID $$0) {
        this.j.add($$0);
    }

    @Override
    public void b(axg $$0) {
        super.b($$0);
        this.j.remove($$0.cY());
    }

    @Override
    public void b() {
        super.b();
        this.j.clear();
    }

    public int c() {
        return this.k;
    }

    public int d() {
        return this.l;
    }

    public void a(int $$0) {
        this.k = $$0;
        this.a(bgj.a((float)$$0 / (float)this.l, 0.0f, 1.0f));
    }

    public void b(int $$0) {
        this.l = $$0;
        this.a(bgj.a((float)this.k / (float)$$0, 0.0f, 1.0f));
    }

    public final yh e() {
        return yk.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new yo.e(yh.b(this.a().toString()))).a(this.a().toString()));
    }

    public boolean a(Collection<axg> $$0) {
        HashSet $$1 = Sets.newHashSet();
        HashSet $$2 = Sets.newHashSet();
        for (UUID $$3 : this.j) {
            boolean $$4 = false;
            for (axg $$5 : $$0) {
                if (!$$5.cY().equals($$3)) continue;
                $$4 = true;
                break;
            }
            if ($$4) continue;
            $$1.add($$3);
        }
        for (axg $$6 : $$0) {
            boolean $$7 = false;
            for (UUID $$8 : this.j) {
                if (!$$6.cY().equals($$8)) continue;
                $$7 = true;
                break;
            }
            if ($$7) continue;
            $$2.add($$6);
        }
        for (UUID $$9 : $$1) {
            for (axg $$10 : this.h()) {
                if (!$$10.cY().equals($$9)) continue;
                this.b($$10);
                break;
            }
            this.j.remove($$9);
        }
        for (axg $$11 : $$2) {
            this.a($$11);
        }
        return !$$1.isEmpty() || !$$2.isEmpty();
    }

    public static anv a(amo $$0, a $$1) {
        anv $$2 = new anv($$0, $$1.b);
        $$2.d($$1.c);
        $$2.a($$1.d);
        $$2.b($$1.e);
        $$2.a($$1.f);
        $$2.a($$1.g);
        $$2.a($$1.h);
        $$2.b($$1.i);
        $$2.c($$1.j);
        $$1.k.forEach($$2::a);
        return $$2;
    }

    public a f() {
        return new a(this.j(), this.g(), this.c(), this.d(), this.l(), this.m(), this.n(), this.o(), this.p(), Set.copyOf(this.j));
    }

    public void c(axg $$0) {
        if (this.j.contains($$0.cY())) {
            this.a($$0);
        }
    }

    public void d(axg $$0) {
        super.b($$0);
    }

    public static final class a
    extends Record {
        final yh b;
        final boolean c;
        final int d;
        final int e;
        final ccs.a f;
        final ccs.b g;
        final boolean h;
        final boolean i;
        final boolean j;
        final Set<UUID> k;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)yj.a.fieldOf("Name").forGetter(a::a), (App)Codec.BOOL.optionalFieldOf("Visible", (Object)false).forGetter(a::b), (App)Codec.INT.optionalFieldOf("Value", (Object)0).forGetter(a::c), (App)Codec.INT.optionalFieldOf("Max", (Object)100).forGetter(a::d), (App)ccs.a.h.optionalFieldOf("Color", (Object)ccs.a.g).forGetter(a::e), (App)ccs.b.f.optionalFieldOf("Overlay", (Object)ccs.b.a).forGetter(a::f), (App)Codec.BOOL.optionalFieldOf("DarkenScreen", (Object)false).forGetter(a::g), (App)Codec.BOOL.optionalFieldOf("PlayBossMusic", (Object)false).forGetter(a::h), (App)Codec.BOOL.optionalFieldOf("CreateWorldFog", (Object)false).forGetter(a::i), (App)jx.b.optionalFieldOf("Players", Set.of()).forGetter(a::j)).apply((Applicative)$$0, a::new));

        public a(yh $$0, boolean $$1, int $$2, int $$3, ccs.a $$4, ccs.b $$5, boolean $$6, boolean $$7, boolean $$8, Set<UUID> $$9) {
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
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;visible;value;max;color;overlay;darkenScreen;playBossMusic;createWorldFog;players", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;visible;value;max;color;overlay;darkenScreen;playBossMusic;createWorldFog;players", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;visible;value;max;color;overlay;darkenScreen;playBossMusic;createWorldFog;players", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this, $$0);
        }

        public yh a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public ccs.a e() {
            return this.f;
        }

        public ccs.b f() {
            return this.g;
        }

        public boolean g() {
            return this.h;
        }

        public boolean h() {
            return this.i;
        }

        public boolean i() {
            return this.j;
        }

        public Set<UUID> j() {
            return this.k;
        }
    }
}

