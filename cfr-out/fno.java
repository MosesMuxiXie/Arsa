/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.Streams
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Streams;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class fno
implements fnq {
    private final bgp a;
    private final fnr b;
    private final uz c;

    private fno(bgp $$0, fnr $$1, uz $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static fnq a(bgp $$0, jf.a $$1, uz $$2) {
        return new fno($$0, new fnr($$1, vn.a), $$2);
    }

    public static fnq.b a(bgp $$0, jf.a $$1, List<uz> $$2) {
        return new a($$0, new fnr($$1, vn.a), $$2);
    }

    @Override
    public <T> Optional<T> a(String $$0, Codec<T> $$1) {
        vz $$2 = this.c.a($$0);
        if ($$2 == null) {
            return Optional.empty();
        }
        DataResult dataResult = $$1.parse(this.b.a(), (Object)$$2);
        Objects.requireNonNull(dataResult);
        DataResult dataResult2 = dataResult;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, n2)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                DataResult.Success $$3 = (DataResult.Success)dataResult2;
                yield Optional.of($$3.value());
            }
            case 1 -> {
                DataResult.Error $$4 = (DataResult.Error)dataResult2;
                this.a.a(new b($$0, $$2, $$4));
                yield $$4.partialValue();
            }
        };
    }

    @Override
    public <T> Optional<T> a(MapCodec<T> $$0) {
        DynamicOps<vz> $$1 = this.b.a();
        DataResult dataResult = $$1.getMap((Object)this.c).flatMap($$2 -> $$0.decode($$1, $$2));
        Objects.requireNonNull(dataResult);
        DataResult dataResult2 = dataResult;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, n2)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                DataResult.Success $$2 = (DataResult.Success)dataResult2;
                yield Optional.of($$2.value());
            }
            case 1 -> {
                DataResult.Error $$3 = (DataResult.Error)dataResult2;
                this.a.a(new d($$3));
                yield $$3.partialValue();
            }
        };
    }

    private <T extends vz> @Nullable T a(String $$0, wb<T> $$1) {
        vz $$2 = this.c.a($$0);
        if ($$2 == null) {
            return null;
        }
        wb<?> $$3 = $$2.c();
        if ($$3 != $$1) {
            this.a.a(new i($$0, $$1, $$3));
            return null;
        }
        return (T)$$2;
    }

    private @Nullable vp i(String $$0) {
        vz $$1 = this.c.a($$0);
        if ($$1 == null) {
            return null;
        }
        if ($$1 instanceof vp) {
            vp $$2 = (vp)$$1;
            return $$2;
        }
        this.a.a(new h($$0, $$1.c()));
        return null;
    }

    @Override
    public Optional<fnq> a(String $$0) {
        uz $$1 = this.a($$0, uz.b);
        return $$1 != null ? Optional.of(this.a($$0, $$1)) : Optional.empty();
    }

    @Override
    public fnq b(String $$0) {
        uz $$1 = this.a($$0, uz.b);
        return $$1 != null ? this.a($$0, $$1) : this.b.c();
    }

    @Override
    public Optional<fnq.b> c(String $$0) {
        vf $$1 = this.a($$0, vf.a);
        return $$1 != null ? Optional.of(this.a($$0, this.b, $$1)) : Optional.empty();
    }

    @Override
    public fnq.b d(String $$0) {
        vf $$1 = this.a($$0, vf.a);
        return $$1 != null ? this.a($$0, this.b, $$1) : this.b.d();
    }

    @Override
    public <T> Optional<fnq.a<T>> b(String $$0, Codec<T> $$1) {
        vf $$2 = this.a($$0, vf.a);
        return $$2 != null ? Optional.of(this.a($$0, $$2, $$1)) : Optional.empty();
    }

    @Override
    public <T> fnq.a<T> c(String $$0, Codec<T> $$1) {
        vf $$2 = this.a($$0, vf.a);
        return $$2 != null ? this.a($$0, $$2, $$1) : this.b.e();
    }

    @Override
    public boolean a(String $$0, boolean $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.j() != 0 : $$1;
    }

    @Override
    public byte a(String $$0, byte $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.j() : $$1;
    }

    @Override
    public int a(String $$0, short $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.i() : $$1;
    }

    @Override
    public Optional<Integer> e(String $$0) {
        vp $$1 = this.i($$0);
        return $$1 != null ? Optional.of($$1.h()) : Optional.empty();
    }

    @Override
    public int a(String $$0, int $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.h() : $$1;
    }

    @Override
    public long a(String $$0, long $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.g() : $$1;
    }

    @Override
    public Optional<Long> f(String $$0) {
        vp $$1 = this.i($$0);
        return $$1 != null ? Optional.of($$1.g()) : Optional.empty();
    }

    @Override
    public float a(String $$0, float $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.l() : $$1;
    }

    @Override
    public double a(String $$0, double $$1) {
        vp $$2 = this.i($$0);
        return $$2 != null ? $$2.k() : $$1;
    }

    @Override
    public Optional<String> g(String $$0) {
        vx $$1 = this.a($$0, vx.a);
        return $$1 != null ? Optional.of($$1.k()) : Optional.empty();
    }

    @Override
    public String a(String $$0, String $$1) {
        vx $$2 = this.a($$0, vx.a);
        return $$2 != null ? $$2.k() : $$1;
    }

    @Override
    public Optional<int[]> h(String $$0) {
        vd $$1 = this.a($$0, vd.a);
        return $$1 != null ? Optional.of($$1.g()) : Optional.empty();
    }

    @Override
    public jf.a a() {
        return this.b.b();
    }

    private fnq a(String $$0, uz $$1) {
        return $$1.j() ? this.b.c() : new fno(this.a.a(new bgp.c($$0)), this.b, $$1);
    }

    static fnq a(bgp $$0, fnr $$1, uz $$2) {
        return $$2.j() ? $$1.c() : new fno($$0, $$1, $$2);
    }

    private fnq.b a(String $$0, fnr $$1, vf $$2) {
        return $$2.isEmpty() ? $$1.d() : new e(this.a, $$0, $$1, $$2);
    }

    private <T> fnq.a<T> a(String $$0, vf $$1, Codec<T> $$2) {
        return $$1.isEmpty() ? this.b.e() : new f<T>(this.a, $$0, this.b, $$2, $$1);
    }

    static class a
    implements fnq.b {
        private final bgp a;
        private final fnr b;
        private final List<uz> c;

        public a(bgp $$0, fnr $$1, List<uz> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        fnq a(int $$0, uz $$1) {
            return fno.a(this.a.a(new bgp.e($$0)), this.b, $$1);
        }

        @Override
        public boolean a() {
            return this.c.isEmpty();
        }

        @Override
        public Stream<fnq> b() {
            return Streams.mapWithIndex(this.c.stream(), ($$0, $$1) -> this.a((int)$$1, (uz)$$0));
        }

        @Override
        public Iterator<fnq> iterator() {
            final ListIterator<uz> $$0 = this.c.listIterator();
            return new AbstractIterator<fnq>(){

                protected @Nullable fnq a() {
                    if ($$0.hasNext()) {
                        int $$02 = $$0.nextIndex();
                        uz $$1 = (uz)$$0.next();
                        return this.a($$02, $$1);
                    }
                    return (fnq)this.endOfData();
                }

                protected /* synthetic */ @Nullable Object computeNext() {
                    return this.a();
                }
            };
        }
    }

    public record b(String a, vz b, DataResult.Error<?> c) implements bgp.g
    {
        private final String a;
        private final vz b;
        private final DataResult.Error<?> c;

        @Override
        public String a() {
            return "Failed to decode value '" + String.valueOf(this.b) + "' from field '" + this.a + "': " + this.c.message();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "name;tag;error", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "name;tag;error", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "name;tag;error", "a", "b", "c"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public vz c() {
            return this.b;
        }

        public DataResult.Error<?> d() {
            return this.c;
        }
    }

    public record d(DataResult.Error<?> a) implements bgp.g
    {
        private final DataResult.Error<?> a;

        @Override
        public String a() {
            return "Failed to decode from map: " + this.a.message();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "error", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "error", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "error", "a"}, this, $$0);
        }

        public DataResult.Error<?> b() {
            return this.a;
        }
    }

    public record i(String a, wb<?> b, wb<?> c) implements bgp.g
    {
        private final String a;
        private final wb<?> b;
        private final wb<?> c;

        @Override
        public String a() {
            return "Expected field '" + this.a + "' to contain value of type " + this.b.a() + ", but got " + this.c.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "name;expected;actual", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "name;expected;actual", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "name;expected;actual", "a", "b", "c"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public wb<?> c() {
            return this.b;
        }

        public wb<?> d() {
            return this.c;
        }
    }

    public record h(String a, wb<?> b) implements bgp.g
    {
        private final String a;
        private final wb<?> b;

        @Override
        public String a() {
            return "Expected field '" + this.a + "' to contain number, but got " + this.b.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "name;actual", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "name;actual", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "name;actual", "a", "b"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public wb<?> c() {
            return this.b;
        }
    }

    static class e
    implements fnq.b {
        private final bgp a;
        private final String b;
        final fnr c;
        private final vf d;

        e(bgp $$0, String $$1, fnr $$2, vf $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public boolean a() {
            return this.d.isEmpty();
        }

        bgp a(int $$0) {
            return this.a.a(new bgp.d(this.b, $$0));
        }

        void a(int $$0, vz $$1) {
            this.a.a(new g(this.b, $$0, uz.b, $$1.c()));
        }

        @Override
        public Stream<fnq> b() {
            return Streams.mapWithIndex(this.d.stream(), ($$0, $$1) -> {
                if ($$0 instanceof uz) {
                    uz $$2 = (uz)$$0;
                    return fno.a(this.a((int)$$1), this.c, $$2);
                }
                this.a((int)$$1, (vz)$$0);
                return null;
            }).filter(Objects::nonNull);
        }

        @Override
        public Iterator<fnq> iterator() {
            final Iterator $$0 = this.d.iterator();
            return new AbstractIterator<fnq>(){
                private int c;

                protected @Nullable fnq a() {
                    while ($$0.hasNext()) {
                        int $$1;
                        vz $$02 = (vz)$$0.next();
                        ++this.c;
                        if ($$02 instanceof uz) {
                            uz $$2 = (uz)$$02;
                            return fno.a(this.a($$1), c, $$2);
                        }
                        this.a($$1, $$02);
                    }
                    return (fnq)this.endOfData();
                }

                protected /* synthetic */ @Nullable Object computeNext() {
                    return this.a();
                }
            };
        }
    }

    static class f<T>
    implements fnq.a<T> {
        private final bgp a;
        private final String b;
        final fnr c;
        final Codec<T> d;
        private final vf e;

        f(bgp $$0, String $$1, fnr $$2, Codec<T> $$3, vf $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public boolean a() {
            return this.e.isEmpty();
        }

        void a(int $$0, vz $$1, DataResult.Error<?> $$2) {
            this.a.a(new c(this.b, $$0, $$1, $$2));
        }

        @Override
        public Stream<T> b() {
            return Streams.mapWithIndex(this.e.stream(), ($$0, $$1) -> {
                DataResult dataResult = this.d.parse(this.c.a(), $$0);
                Objects.requireNonNull(dataResult);
                DataResult $$2 = dataResult;
                int $$3 = 0;
                return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)$$2, $$3)) {
                    default -> throw new MatchException(null, null);
                    case 0 -> {
                        DataResult.Success $$4 = (DataResult.Success)$$2;
                        yield $$4.value();
                    }
                    case 1 -> {
                        DataResult.Error $$5 = (DataResult.Error)$$2;
                        this.a((int)$$1, (vz)$$0, (DataResult.Error<?>)$$5);
                        yield $$5.partialValue().orElse(null);
                    }
                };
            }).filter(Objects::nonNull);
        }

        @Override
        public Iterator<T> iterator() {
            final ListIterator $$0 = this.e.listIterator();
            return new AbstractIterator<T>(){

                protected @Nullable T computeNext() {
                    while ($$0.hasNext()) {
                        DataResult dataResult;
                        int $$02 = $$0.nextIndex();
                        vz $$1 = (vz)$$0.next();
                        Objects.requireNonNull(d.parse(c.a(), (Object)$$1));
                        int n2 = 0;
                        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult, n2)) {
                            default: {
                                throw new MatchException(null, null);
                            }
                            case 0: {
                                DataResult.Success $$2 = (DataResult.Success)dataResult;
                                return $$2.value();
                            }
                            case 1: 
                        }
                        DataResult.Error $$3 = (DataResult.Error)dataResult;
                        this.a($$02, $$1, $$3);
                        if (!$$3.partialValue().isPresent()) continue;
                        return $$3.partialValue().get();
                    }
                    return this.endOfData();
                }
            };
        }
    }

    public record g(String a, int b, wb<?> c, wb<?> d) implements bgp.g
    {
        private final String a;
        private final int b;
        private final wb<?> c;
        private final wb<?> d;

        @Override
        public String a() {
            return "Expected list '" + this.a + "' to contain at index " + this.b + " value of type " + this.c.a() + ", but got " + this.d.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "name;index;expected;actual", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "name;index;expected;actual", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "name;index;expected;actual", "a", "b", "c", "d"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public wb<?> d() {
            return this.c;
        }

        public wb<?> e() {
            return this.d;
        }
    }

    public record c(String a, int b, vz c, DataResult.Error<?> d) implements bgp.g
    {
        private final String a;
        private final int b;
        private final vz c;
        private final DataResult.Error<?> d;

        @Override
        public String a() {
            return "Failed to decode value '" + String.valueOf(this.c) + "' from field '" + this.a + "' at index " + this.b + "': " + this.d.message();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name;index;tag;error", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name;index;tag;error", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name;index;tag;error", "a", "b", "c", "d"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public vz d() {
            return this.c;
        }

        public DataResult.Error<?> e() {
            return this.d;
        }
    }
}

