/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Iterables;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class doo
implements dpe {
    private static final int d = -1;
    private static final int e = 256;
    public static final doo a = new doo(jm.a());
    public static final Codec<doo> b = doo$a.a.sizeLimitedListOf(256).xmap(doo::b, doo::f);
    public static final aao<xq, doo> c = dlt.h.a(aam.c(256)).a(doo::new, $$0 -> $$0.f);
    private final jm<dlt> f;
    private final int g;

    private doo(jm<dlt> $$0) {
        if ($$0.size() > 256) {
            throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
        }
        this.f = $$0;
        this.g = dlt.a($$0);
    }

    private doo(int $$0) {
        this(jm.a($$0, dlt.l));
    }

    private doo(List<dlt> $$0) {
        this($$0.size());
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            this.f.set($$1, $$0.get($$1));
        }
    }

    private static doo b(List<a> $$0) {
        OptionalInt $$1 = $$0.stream().mapToInt(a::a).max();
        if ($$1.isEmpty()) {
            return a;
        }
        doo $$2 = new doo($$1.getAsInt() + 1);
        for (a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
        }
        return $$2;
    }

    public static doo a(List<dlt> $$0) {
        int $$1 = doo.c($$0);
        if ($$1 == -1) {
            return a;
        }
        doo $$2 = new doo($$1 + 1);
        for (int $$3 = 0; $$3 <= $$1; ++$$3) {
            $$2.f.set($$3, $$0.get($$3).v());
        }
        return $$2;
    }

    private static int c(List<dlt> $$0) {
        for (int $$1 = $$0.size() - 1; $$1 >= 0; --$$1) {
            if ($$0.get($$1).f()) continue;
            return $$1;
        }
        return -1;
    }

    private List<a> f() {
        ArrayList<a> $$0 = new ArrayList<a>();
        for (int $$1 = 0; $$1 < this.f.size(); ++$$1) {
            dlt $$2 = this.f.get($$1);
            if ($$2.f()) continue;
            $$0.add(new a($$1, $$2));
        }
        return $$0;
    }

    public void a(jm<dlt> $$0) {
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            dlt $$2 = $$1 < this.f.size() ? this.f.get($$1) : dlt.l;
            $$0.set($$1, $$2.v());
        }
    }

    public dlt a() {
        return this.f.isEmpty() ? dlt.l : this.f.get(0).v();
    }

    public Stream<dlt> b() {
        return this.f.stream().map(dlt::v);
    }

    public Stream<dlt> c() {
        return this.f.stream().filter($$0 -> !$$0.f()).map(dlt::v);
    }

    public Iterable<dlt> d() {
        return Iterables.filter(this.f, $$0 -> !$$0.f());
    }

    public Iterable<dlt> e() {
        return Iterables.transform(this.d(), dlt::v);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof doo)) return false;
        doo $$1 = (doo)$$0;
        if (!dlt.a(this.f, $$1.f)) return false;
        return true;
    }

    public int hashCode() {
        return this.g;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        int $$4 = 0;
        int $$5 = 0;
        for (dlt $$6 : this.d()) {
            ++$$5;
            if ($$4 > 4) continue;
            ++$$4;
            $$1.accept(yh.a("item.container.item_count", $$6.y(), $$6.N()));
        }
        if ($$5 - $$4 > 0) {
            $$1.accept(yh.a("item.container.more_items", $$5 - $$4).a(l.u));
        }
    }

    static final class a
    extends Record {
        private final int b;
        private final dlt c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.intRange((int)0, (int)255).fieldOf("slot").forGetter(a::a), (App)dlt.b.fieldOf("item").forGetter(a::b)).apply((Applicative)$$0, a::new));

        a(int $$0, dlt $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "index;item", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "index;item", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "index;item", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public dlt b() {
            return this.c;
        }
    }
}

