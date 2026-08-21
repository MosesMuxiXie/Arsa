/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jf<T>
extends je<T> {
    public Stream<jd.c<T>> c();

    default public Stream<amt<T>> c_() {
        return this.c().map(jd.c::h);
    }

    public Stream<jh.c<T>> e();

    default public Stream<bef<T>> f() {
        return this.e().map(jh.c::h);
    }

    public static interface a
    extends je.a {
        public Stream<amt<? extends jq<?>>> b();

        default public Stream<b<?>> c() {
            return this.b().map(this::e);
        }

        public <T> Optional<? extends b<T>> a(amt<? extends jq<? extends T>> var1);

        default public <T> b<T> e(amt<? extends jq<? extends T>> $$0) {
            return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + String.valueOf($$0.a()) + " not found"));
        }

        default public <V> ams<V> a(DynamicOps<V> $$0) {
            return ams.a($$0, this);
        }

        public static a a(Stream<b<?>> $$02) {
            final Map<amt, b> $$1 = $$02.collect(Collectors.toUnmodifiableMap(b::g, $$0 -> $$0));
            return new a(){

                @Override
                public Stream<amt<? extends jq<?>>> b() {
                    return $$1.keySet().stream();
                }

                public <T> Optional<b<T>> a(amt<? extends jq<? extends T>> $$0) {
                    return Optional.ofNullable((b)$$1.get($$0));
                }
            };
        }

        default public Lifecycle d() {
            return this.c().map(b::h).reduce(Lifecycle.stable(), Lifecycle::add);
        }

        default public /* synthetic */ je b(amt amt2) {
            return this.e(amt2);
        }
    }

    public static interface b<T>
    extends jf<T>,
    jg<T> {
        public amt<? extends jq<? extends T>> g();

        public Lifecycle h();

        default public b<T> a(dgz $$0) {
            if (dgw.cd.contains(this.g())) {
                return this.a((T $$1) -> ((dgw)$$1).a($$0));
            }
            return this;
        }

        default public b<T> a(final Predicate<T> $$0) {
            return new a<T>(){

                @Override
                public b<T> a() {
                    return this;
                }

                @Override
                public Optional<jd.c<T>> a(amt<T> $$02) {
                    return this.a().a($$02).filter($$1 -> $$0.test($$1.a()));
                }

                @Override
                public Stream<jd.c<T>> c() {
                    return this.a().c().filter($$1 -> $$0.test($$1.a()));
                }
            };
        }

        public static interface a<T>
        extends b<T> {
            public b<T> a();

            @Override
            default public amt<? extends jq<? extends T>> g() {
                return this.a().g();
            }

            @Override
            default public Lifecycle h() {
                return this.a().h();
            }

            @Override
            default public Optional<jd.c<T>> a(amt<T> $$0) {
                return this.a().a($$0);
            }

            @Override
            default public Stream<jd.c<T>> c() {
                return this.a().c();
            }

            @Override
            default public Optional<jh.c<T>> a(bef<T> $$0) {
                return this.a().a($$0);
            }

            @Override
            default public Stream<jh.c<T>> e() {
                return this.a().e();
            }
        }
    }
}

