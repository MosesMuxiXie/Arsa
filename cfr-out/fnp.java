/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class fnp
implements fns {
    private final bgp a;
    private final DynamicOps<vz> b;
    private final uz c;

    fnp(bgp $$0, DynamicOps<vz> $$1, uz $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public static fnp a(bgp $$0, jf.a $$1) {
        return new fnp($$0, $$1.a(vn.a), new uz());
    }

    public static fnp a(bgp $$0) {
        return new fnp($$0, vn.a, new uz());
    }

    @Override
    public <T> void a(String $$0, Codec<T> $$12, T $$2) {
        DataResult dataResult = $$12.encodeStart(this.b, $$2);
        Objects.requireNonNull(dataResult);
        DataResult dataResult2 = dataResult;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, n2)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                DataResult.Success $$3 = (DataResult.Success)dataResult2;
                this.c.a($$0, (vz)$$3.value());
                break;
            }
            case 1: {
                DataResult.Error $$4 = (DataResult.Error)dataResult2;
                this.a.a(new a($$0, $$2, $$4));
                $$4.partialValue().ifPresent($$1 -> this.c.a($$0, (vz)$$1));
            }
        }
    }

    @Override
    public <T> void b(String $$0, Codec<T> $$1, @Nullable T $$2) {
        if ($$2 != null) {
            this.a($$0, $$1, $$2);
        }
    }

    @Override
    public <T> void a(MapCodec<T> $$02, T $$1) {
        DataResult dataResult = $$02.encoder().encodeStart(this.b, $$1);
        Objects.requireNonNull(dataResult);
        DataResult dataResult2 = dataResult;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, n2)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                DataResult.Success $$2 = (DataResult.Success)dataResult2;
                this.c.a((uz)$$2.value());
                break;
            }
            case 1: {
                DataResult.Error $$3 = (DataResult.Error)dataResult2;
                this.a.a(new c($$1, $$3));
                $$3.partialValue().ifPresent($$0 -> this.c.a((uz)$$0));
            }
        }
    }

    @Override
    public void a(String $$0, boolean $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, byte $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, short $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, int $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, long $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, float $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, double $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, String $$1) {
        this.c.a($$0, $$1);
    }

    @Override
    public void a(String $$0, int[] $$1) {
        this.c.a($$0, $$1);
    }

    private bgp d(String $$0) {
        return this.a.a(new bgp.c($$0));
    }

    @Override
    public fns a(String $$0) {
        uz $$1 = new uz();
        this.c.a($$0, $$1);
        return new fnp(this.d($$0), this.b, $$1);
    }

    @Override
    public fns.b b(String $$0) {
        vf $$1 = new vf();
        this.c.a($$0, $$1);
        return new d($$0, this.a, this.b, $$1);
    }

    @Override
    public <T> fns.a<T> a(String $$0, Codec<T> $$1) {
        vf $$2 = new vf();
        this.c.a($$0, $$2);
        return new e<T>(this.a, $$0, this.b, $$1, $$2);
    }

    @Override
    public void c(String $$0) {
        this.c.r($$0);
    }

    @Override
    public boolean a() {
        return this.c.j();
    }

    public uz b() {
        return this.c;
    }

    public record a(String a, Object b, DataResult.Error<?> c) implements bgp.g
    {
        private final String a;
        private final Object b;
        private final DataResult.Error<?> c;

        @Override
        public String a() {
            return "Failed to encode value '" + String.valueOf(this.b) + "' to field '" + this.a + "': " + this.c.message();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;value;error", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;value;error", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;value;error", "a", "b", "c"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public Object c() {
            return this.b;
        }

        public DataResult.Error<?> d() {
            return this.c;
        }
    }

    public record c(Object a, DataResult.Error<?> b) implements bgp.g
    {
        private final Object a;
        private final DataResult.Error<?> b;

        @Override
        public String a() {
            return "Failed to merge value '" + String.valueOf(this.a) + "' to an object: " + this.b.message();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "value;error", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "value;error", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "value;error", "a", "b"}, this, $$0);
        }

        public Object b() {
            return this.a;
        }

        public DataResult.Error<?> c() {
            return this.b;
        }
    }

    static class d
    implements fns.b {
        private final String a;
        private final bgp b;
        private final DynamicOps<vz> c;
        private final vf d;

        d(String $$0, bgp $$1, DynamicOps<vz> $$2, vf $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public fns a() {
            int $$0 = this.d.size();
            uz $$1 = new uz();
            this.d.add($$1);
            return new fnp(this.b.a(new bgp.d(this.a, $$0)), this.c, $$1);
        }

        @Override
        public void b() {
            this.d.removeLast();
        }

        @Override
        public boolean c() {
            return this.d.isEmpty();
        }
    }

    static class e<T>
    implements fns.a<T> {
        private final bgp a;
        private final String b;
        private final DynamicOps<vz> c;
        private final Codec<T> d;
        private final vf e;

        e(bgp $$0, String $$1, DynamicOps<vz> $$2, Codec<T> $$3, vf $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public void a(T $$0) {
            DataResult dataResult = this.d.encodeStart(this.c, $$0);
            Objects.requireNonNull(dataResult);
            DataResult dataResult2 = dataResult;
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, n2)) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    DataResult.Success $$1 = (DataResult.Success)dataResult2;
                    this.e.add((vz)$$1.value());
                    break;
                }
                case 1: {
                    DataResult.Error $$2 = (DataResult.Error)dataResult2;
                    this.a.a(new b(this.b, $$0, $$2));
                    $$2.partialValue().ifPresent(this.e::add);
                }
            }
        }

        @Override
        public boolean a() {
            return this.e.isEmpty();
        }
    }

    public record b(String a, Object b, DataResult.Error<?> c) implements bgp.g
    {
        private final String a;
        private final Object b;
        private final DataResult.Error<?> c;

        @Override
        public String a() {
            return "Failed to append value '" + String.valueOf(this.b) + "' to list '" + this.a + "': " + this.c.message();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "name;value;error", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "name;value;error", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "name;value;error", "a", "b", "c"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public Object c() {
            return this.b;
        }

        public DataResult.Error<?> d() {
            return this.c;
        }
    }
}

