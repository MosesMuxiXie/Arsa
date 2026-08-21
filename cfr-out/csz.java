/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class csz {
    private static final Logger a = LogUtils.getLogger();
    private final Short2ObjectMap<csy> b = new Short2ObjectOpenHashMap();
    private final Map<jd<cta>, Set<csy>> c = Maps.newHashMap();
    private final Runnable d;
    private boolean e;

    public csz(Runnable $$0) {
        this($$0, true, (List<csy>)ImmutableList.of());
    }

    csz(Runnable $$0, boolean $$1, List<csy> $$2) {
        this.d = $$0;
        this.e = $$1;
        $$2.forEach(this::a);
    }

    public a a() {
        return new a(this.e, this.b.values().stream().map(csy::a).toList());
    }

    public Stream<csy> a(Predicate<jd<cta>> $$02, csx.b $$12) {
        return this.c.entrySet().stream().filter($$1 -> $$02.test((jd)$$1.getKey())).flatMap($$0 -> ((Set)$$0.getValue()).stream()).filter($$12.a());
    }

    public @Nullable csy a(is $$0, jd<cta> $$1) {
        csy $$2 = new csy($$0, $$1, this.d);
        if (this.a($$2)) {
            a.debug("Added POI of type {} @ {}", (Object)$$1.g(), (Object)$$0);
            this.d.run();
            return $$2;
        }
        return null;
    }

    private boolean a(csy $$02) {
        is $$1 = $$02.g();
        jd<cta> $$2 = $$02.h();
        short $$3 = jw.b($$1);
        csy $$4 = (csy)this.b.get($$3);
        if ($$4 != null) {
            if ($$2.equals($$4.h())) {
                return false;
            }
            bhs.b("POI data mismatch: already registered at " + String.valueOf($$1));
        }
        this.b.put($$3, (Object)$$02);
        this.c.computeIfAbsent($$2, $$0 -> Sets.newHashSet()).add($$02);
        return true;
    }

    public void a(is $$0) {
        csy $$1 = (csy)this.b.remove(jw.b($$0));
        if ($$1 == null) {
            a.error("POI data mismatch: never registered at {}", (Object)$$0);
            return;
        }
        this.c.get($$1.h()).remove($$1);
        a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
        this.d.run();
    }

    @Deprecated
    @bht
    public int b(is $$0) {
        return this.f($$0).map(csy::b).orElse(0);
    }

    public boolean c(is $$0) {
        csy $$1 = (csy)this.b.get(jw.b($$0));
        if ($$1 == null) {
            throw bhs.b(new IllegalStateException("POI never registered at " + String.valueOf($$0)));
        }
        boolean $$2 = $$1.d();
        this.d.run();
        return $$2;
    }

    public boolean a(is $$0, Predicate<jd<cta>> $$1) {
        return this.d($$0).filter($$1).isPresent();
    }

    public Optional<jd<cta>> d(is $$0) {
        return this.f($$0).map(csy::h);
    }

    private Optional<csy> f(is $$0) {
        return Optional.ofNullable((csy)this.b.get(jw.b($$0)));
    }

    public Optional<bxc> e(is $$0) {
        return this.f($$0).map(bxc::new);
    }

    public void a(Consumer<BiConsumer<is, jd<cta>>> $$0) {
        if (!this.e) {
            Short2ObjectOpenHashMap $$1 = new Short2ObjectOpenHashMap(this.b);
            this.c();
            $$0.accept((arg_0, arg_1) -> this.a((Short2ObjectMap)$$1, arg_0, arg_1));
            this.e = true;
            this.d.run();
        }
    }

    private void c() {
        this.b.clear();
        this.c.clear();
    }

    boolean b() {
        return this.e;
    }

    private /* synthetic */ void a(Short2ObjectMap $$0, is $$1, jd $$22) {
        short $$3 = jw.b($$1);
        csy $$4 = (csy)$$0.computeIfAbsent($$3, $$2 -> new csy($$1, $$22, this.d));
        this.a($$4);
    }

    public static final class a
    extends Record {
        private final boolean b;
        private final List<csy.a> c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.lenientOptionalFieldOf("Valid", (Object)false).forGetter(a::a), (App)csy.a.a.listOf().fieldOf("Records").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(boolean $$0, List<csy.a> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public csz a(Runnable $$0) {
            return new csz($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "isValid;records", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "isValid;records", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "isValid;records", "b", "c"}, this, $$0);
        }

        public boolean a() {
            return this.b;
        }

        public List<csy.a> b() {
            return this.c;
        }
    }
}

