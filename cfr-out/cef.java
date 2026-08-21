/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.LongSupplier;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class cef
implements cee {
    private final Map<cea<?>, b<?>> b = new Reference2ObjectOpenHashMap();

    cef(Map<cea<?>, List<ceb<?>>> $$02) {
        $$02.forEach(($$0, $$1) -> this.b.put((cea<?>)$$0, this.a((cea)$$0, (List<? extends ceb<?>>)$$1)));
    }

    private <Value> b<Value> a(cea<Value> $$02, List<? extends ceb<?>> $$1) {
        Object e2;
        ArrayList $$2 = new ArrayList($$1);
        Value $$3 = $$02.b();
        while (!$$2.isEmpty() && (e2 = $$2.getFirst()) instanceof ceb.a) {
            ceb.a $$4 = (ceb.a)e2;
            $$3 = $$4.applyConstant($$3);
            $$2.removeFirst();
        }
        boolean $$5 = $$2.stream().anyMatch($$0 -> $$0 instanceof ceb.b);
        return new b<Value>($$02, $$3, List.copyOf($$2), $$5);
    }

    public static a a() {
        return new a();
    }

    static void a(a $$0, dwo $$1) {
        jr $$22 = $$1.J_();
        dxq $$3 = $$1.H_();
        LongSupplier $$4 = $$1::al;
        cef.a($$0, $$1.F_());
        cef.a($$0, $$22.f(mj.aS), $$3);
        $$1.F_().q().forEach($$2 -> $$0.a((jd<fvn>)$$2, $$4));
        if ($$1.am()) {
            cek.a($$0, cek.a.a($$1));
        }
    }

    private static void a(a $$0, esh $$1) {
        $$0.a($$1.p());
    }

    private static void a(a $$02, jf<dxo> $$1, dxq $$22) {
        Stream $$3 = $$1.c().flatMap($$0 -> ((dxo)$$0.a()).g().b().stream()).distinct();
        $$3.forEach($$2 -> cef.a($$02, $$2, $$22));
    }

    private static <Value> void a(a $$0, cea<Value> $$1, dxq $$22) {
        $$0.a($$1, (Value $$2, ftm $$3, cej $$4) -> {
            if ($$4 != null && $$1.f()) {
                return $$4.a($$1, $$2);
            }
            jd<dxo> $$5 = $$22.a($$3.g, $$3.h, $$3.i);
            return $$5.a().g().a($$1, $$2);
        });
    }

    public void b() {
        this.b.values().forEach(b::a);
    }

    private <Value> @Nullable b<Value> d(cea<Value> $$0) {
        return this.b.get($$0);
    }

    @Override
    public <Value> Value a(cea<Value> $$0) {
        if (w.aX && $$0.e()) {
            throw new IllegalStateException("Position must always be provided for positional attribute " + String.valueOf($$0));
        }
        b<Value> $$1 = this.d($$0);
        if ($$1 == null) {
            return $$0.b();
        }
        return $$1.b();
    }

    @Override
    public <Value> Value a(cea<Value> $$0, ftm $$1, @Nullable cej $$2) {
        b<Value> $$3 = this.d($$0);
        if ($$3 == null) {
            return $$0.b();
        }
        return $$3.a($$1, $$2);
    }

    @VisibleForTesting
    <Value> Value b(cea<Value> $$0) {
        b<Value> $$1 = this.d($$0);
        return $$1 != null ? $$1.b : $$0.b();
    }

    @VisibleForTesting
    boolean c(cea<?> $$0) {
        b<?> $$1 = this.d($$0);
        return $$1 != null && $$1.d;
    }

    static class b<Value> {
        private final cea<Value> a;
        final Value b;
        private final List<ceb<Value>> c;
        final boolean d;
        private @Nullable Value e;
        private int f;

        b(cea<Value> $$0, Value $$1, List<ceb<Value>> $$2, boolean $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public void a() {
            this.e = null;
            ++this.f;
        }

        public Value b() {
            if (this.e != null) {
                return this.e;
            }
            Value $$0 = this.c();
            this.e = $$0;
            return $$0;
        }

        public Value a(ftm $$0, @Nullable cej $$1) {
            if (!this.d) {
                return this.b();
            }
            return this.b($$0, $$1);
        }

        private Value b(ftm $$0, @Nullable cej $$1) {
            Value $$2 = this.b;
            for (ceb<Value> $$3 : this.c) {
                ceb<Value> ceb2;
                Objects.requireNonNull($$3);
                int n2 = 0;
                $$2 = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ceb.a.class, ceb.c.class, ceb.b.class}, ceb2, n2)) {
                    default -> throw new MatchException(null, null);
                    case 0 -> {
                        ceb.a $$4 = (ceb.a)ceb2;
                        yield $$4.applyConstant($$2);
                    }
                    case 1 -> {
                        ceb.c $$5 = (ceb.c)ceb2;
                        yield $$5.applyTimeBased($$2, this.f);
                    }
                    case 2 -> {
                        ceb.b $$6 = (ceb.b)ceb2;
                        yield $$6.applyPositional($$2, Objects.requireNonNull($$0), $$1);
                    }
                };
            }
            return this.a.a($$2);
        }

        private Value c() {
            Value $$0 = this.b;
            for (ceb<Value> $$1 : this.c) {
                ceb<Value> ceb2;
                Objects.requireNonNull($$1);
                int n2 = 0;
                $$0 = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ceb.a.class, ceb.c.class, ceb.b.class}, ceb2, n2)) {
                    default -> throw new MatchException(null, null);
                    case 0 -> {
                        ceb.a $$2 = (ceb.a)ceb2;
                        yield $$2.applyConstant($$0);
                    }
                    case 1 -> {
                        ceb.c $$3 = (ceb.c)ceb2;
                        yield $$3.applyTimeBased($$0, this.f);
                    }
                    case 2 -> {
                        ceb.b $$4 = (ceb.b)ceb2;
                        yield $$0;
                    }
                };
            }
            return this.a.a($$0);
        }
    }

    public static class a {
        private final Map<cea<?>, List<ceb<?>>> a = new HashMap();

        a() {
        }

        public a a(dwo $$0) {
            cef.a(this, $$0);
            return this;
        }

        public a a(cec $$0) {
            for (cea<?> $$1 : $$0.b()) {
                this.a($$1, $$0);
            }
            return this;
        }

        private <Value> a a(cea<Value> $$0, cec $$1) {
            cec.b<Value, ?> $$2 = $$1.a($$0);
            if ($$2 == null) {
                throw new IllegalArgumentException("Missing attribute " + String.valueOf($$0));
            }
            return this.a($$0, $$2::a);
        }

        public <Value> a a(cea<Value> $$0, ceb.a<Value> $$1) {
            return this.a($$0, (ceb<Value>)$$1);
        }

        public <Value> a a(cea<Value> $$0, ceb.c<Value> $$1) {
            return this.a($$0, (ceb<Value>)$$1);
        }

        public <Value> a a(cea<Value> $$0, ceb.b<Value> $$1) {
            return this.a($$0, (ceb<Value>)$$1);
        }

        private <Value> a a(cea<Value> $$02, ceb<Value> $$1) {
            this.a.computeIfAbsent($$02, $$0 -> new ArrayList()).add($$1);
            return this;
        }

        public a a(jd<fvn> $$0, LongSupplier $$1) {
            for (cea<?> $$2 : $$0.a().c()) {
                this.a($$0, $$2, $$1);
            }
            return this;
        }

        private <Value> void a(jd<fvn> $$0, cea<Value> $$1, LongSupplier $$2) {
            this.a($$1, $$0.a().a($$1, $$2));
        }

        public cef a() {
            return new cef(this.a);
        }
    }
}

