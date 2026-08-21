/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class kc
implements Predicate<kd> {
    public static final Codec<kc> a = kh.d.xmap($$0 -> new kc($$0.entrySet().stream().map(kk::a).collect(Collectors.toList())), $$02 -> $$02.d.stream().filter($$0 -> !$$0.a().d()).collect(Collectors.toMap(kk::a, kk::b)));
    public static final aao<xq, kc> b = kk.a.a(aam.a()).a(kc::new, $$0 -> $$0.d);
    public static final kc c = new kc(List.of());
    private final List<kk<?>> d;

    kc(List<kk<?>> $$0) {
        this.d = $$0;
    }

    public static a a() {
        return new a();
    }

    public static <T> kc a(kh<T> $$0, T $$1) {
        return new kc(List.of(new kk<T>($$0, $$1)));
    }

    public static kc a(kf $$0) {
        return new kc((List<kk<?>>)ImmutableList.copyOf((Iterable)$$0));
    }

    public static kc a(kf $$0, kh<?> ... $$1) {
        a $$2 = new a();
        for (kh<?> $$3 : $$1) {
            kk<?> $$4 = $$0.b($$3);
            if ($$4 == null) continue;
            $$2.a($$4);
        }
        return $$2.a();
    }

    public boolean b() {
        return this.d.isEmpty();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (!($$0 instanceof kc)) return false;
        kc $$1 = (kc)$$0;
        if (!this.d.equals($$1.d)) return false;
        return true;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d.toString();
    }

    public boolean a(kd $$0) {
        for (kk<?> $$1 : this.d) {
            Object $$2 = $$0.a($$1.a());
            if (Objects.equals($$1.b(), $$2)) continue;
            return false;
        }
        return true;
    }

    public boolean c() {
        return this.d.isEmpty();
    }

    public kg d() {
        kg.a $$0 = kg.a();
        for (kk<?> $$1 : this.d) {
            $$0.a($$1);
        }
        return $$0.a();
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((kd)object);
    }

    public static class a {
        private final List<kk<?>> a = new ArrayList();

        a() {
        }

        public <T> a a(kk<T> $$0) {
            return this.a($$0.a(), $$0.b());
        }

        public <T> a a(kh<? super T> $$0, T $$1) {
            for (kk<?> $$2 : this.a) {
                if ($$2.a() != $$0) continue;
                throw new IllegalArgumentException("Predicate already has component of type: '" + String.valueOf($$0) + "'");
            }
            this.a.add(new kk<T>($$0, $$1));
            return this;
        }

        public kc a() {
            return new kc(List.copyOf(this.a));
        }
    }
}

