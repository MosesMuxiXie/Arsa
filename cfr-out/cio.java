/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class cio {
    private final jd<cin> a;
    private final Map<ciq.a, Map<amo, ciq>> b = Maps.newEnumMap(ciq.a.class);
    private final Map<amo, ciq> c = new Object2ObjectArrayMap();
    private final Map<amo, ciq> d = new Object2ObjectArrayMap();
    private double e;
    private boolean f = true;
    private double g;
    private final Consumer<cio> h;

    public cio(jd<cin> $$0, Consumer<cio> $$1) {
        this.a = $$0;
        this.h = $$1;
        this.e = $$0.a().a();
    }

    public jd<cin> a() {
        return this.a;
    }

    public double b() {
        return this.e;
    }

    public void a(double $$0) {
        if ($$0 == this.e) {
            return;
        }
        this.e = $$0;
        this.e();
    }

    @VisibleForTesting
    Map<amo, ciq> a(ciq.a $$02) {
        return this.b.computeIfAbsent($$02, $$0 -> new Object2ObjectOpenHashMap());
    }

    public Set<ciq> c() {
        return ImmutableSet.copyOf(this.c.values());
    }

    public Set<ciq> d() {
        return ImmutableSet.copyOf(this.d.values());
    }

    public @Nullable ciq a(amo $$0) {
        return this.c.get($$0);
    }

    public boolean b(amo $$0) {
        return this.c.get($$0) != null;
    }

    private void f(ciq $$0) {
        ciq $$1 = this.c.putIfAbsent($$0.a(), $$0);
        if ($$1 != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        this.a($$0.c()).put($$0.a(), $$0);
        this.e();
    }

    public void a(ciq $$0) {
        ciq $$1 = this.c.put($$0.a(), $$0);
        if ($$0 == $$1) {
            return;
        }
        this.a($$0.c()).put($$0.a(), $$0);
        this.e();
    }

    public void b(ciq $$0) {
        this.f($$0);
    }

    public void c(ciq $$0) {
        this.c($$0.a());
        this.f($$0);
        this.d.put($$0.a(), $$0);
    }

    public void d(ciq $$0) {
        this.f($$0);
        this.d.put($$0.a(), $$0);
    }

    public void a(Collection<ciq> $$0) {
        for (ciq $$1 : $$0) {
            this.d($$1);
        }
    }

    protected void e() {
        this.f = true;
        this.h.accept(this);
    }

    public void e(ciq $$0) {
        this.c($$0.a());
    }

    public boolean c(amo $$0) {
        ciq $$1 = this.c.remove($$0);
        if ($$1 == null) {
            return false;
        }
        this.a($$1.c()).remove($$0);
        this.d.remove($$0);
        this.e();
        return true;
    }

    public void f() {
        for (ciq $$0 : this.c()) {
            this.e($$0);
        }
    }

    public double g() {
        if (this.f) {
            this.g = this.i();
            this.f = false;
        }
        return this.g;
    }

    private double i() {
        double $$0 = this.b();
        for (ciq $$1 : this.b(ciq.a.a)) {
            $$0 += $$1.b();
        }
        double $$2 = $$0;
        for (ciq $$3 : this.b(ciq.a.b)) {
            $$2 += $$0 * $$3.b();
        }
        for (ciq $$4 : this.b(ciq.a.c)) {
            $$2 *= 1.0 + $$4.b();
        }
        return this.a.a().a($$2);
    }

    private Collection<ciq> b(ciq.a $$0) {
        return this.b.getOrDefault($$0, Map.of()).values();
    }

    public void a(cio $$02) {
        this.e = $$02.e;
        this.c.clear();
        this.c.putAll($$02.c);
        this.d.clear();
        this.d.putAll($$02.d);
        this.b.clear();
        $$02.b.forEach(($$0, $$1) -> this.a((ciq.a)$$0).putAll((Map<amo, ciq>)$$1));
        this.e();
    }

    public a h() {
        return new a(this.a, this.e, List.copyOf(this.d.values()));
    }

    public void a(a $$0) {
        this.e = $$0.d;
        for (ciq $$1 : $$0.e) {
            this.c.put($$1.a(), $$1);
            this.a($$1.c()).put($$1.a(), $$1);
            this.d.put($$1.a(), $$1);
        }
        this.e();
    }

    public static final class a
    extends Record {
        private final jd<cin> c;
        final double d;
        final List<ciq> e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)mi.t.r().fieldOf("id").forGetter(a::a), (App)Codec.DOUBLE.fieldOf("base").orElse((Object)0.0).forGetter(a::b), (App)ciq.b.listOf().optionalFieldOf("modifiers", List.of()).forGetter(a::c)).apply((Applicative)$$0, a::new));
        public static final Codec<List<a>> b = a.listOf();

        public a(jd<cin> $$0, double $$1, List<ciq> $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "attribute;baseValue;modifiers", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "attribute;baseValue;modifiers", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "attribute;baseValue;modifiers", "c", "d", "e"}, this, $$0);
        }

        public jd<cin> a() {
            return this.c;
        }

        public double b() {
            return this.d;
        }

        public List<ciq> c() {
            return this.e;
        }
    }
}

