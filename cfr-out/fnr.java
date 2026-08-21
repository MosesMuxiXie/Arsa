/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class fnr {
    final jf.a a;
    private final DynamicOps<vz> b;
    final fnq.b c = new fnq.b(this){

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public Stream<fnq> b() {
            return Stream.empty();
        }

        @Override
        public Iterator<fnq> iterator() {
            return Collections.emptyIterator();
        }
    };
    private final fnq.a<Object> d = new fnq.a<Object>(this){

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public Stream<Object> b() {
            return Stream.empty();
        }

        @Override
        public Iterator<Object> iterator() {
            return Collections.emptyIterator();
        }
    };
    private final fnq e = new fnq(){

        @Override
        public <T> Optional<T> a(String $$0, Codec<T> $$1) {
            return Optional.empty();
        }

        @Override
        public <T> Optional<T> a(MapCodec<T> $$0) {
            return Optional.empty();
        }

        @Override
        public Optional<fnq> a(String $$0) {
            return Optional.empty();
        }

        @Override
        public fnq b(String $$0) {
            return this;
        }

        @Override
        public Optional<fnq.b> c(String $$0) {
            return Optional.empty();
        }

        @Override
        public fnq.b d(String $$0) {
            return fnr.this.c;
        }

        @Override
        public <T> Optional<fnq.a<T>> b(String $$0, Codec<T> $$1) {
            return Optional.empty();
        }

        @Override
        public <T> fnq.a<T> c(String $$0, Codec<T> $$1) {
            return fnr.this.e();
        }

        @Override
        public boolean a(String $$0, boolean $$1) {
            return $$1;
        }

        @Override
        public byte a(String $$0, byte $$1) {
            return $$1;
        }

        @Override
        public int a(String $$0, short $$1) {
            return $$1;
        }

        @Override
        public Optional<Integer> e(String $$0) {
            return Optional.empty();
        }

        @Override
        public int a(String $$0, int $$1) {
            return $$1;
        }

        @Override
        public long a(String $$0, long $$1) {
            return $$1;
        }

        @Override
        public Optional<Long> f(String $$0) {
            return Optional.empty();
        }

        @Override
        public float a(String $$0, float $$1) {
            return $$1;
        }

        @Override
        public double a(String $$0, double $$1) {
            return $$1;
        }

        @Override
        public Optional<String> g(String $$0) {
            return Optional.empty();
        }

        @Override
        public String a(String $$0, String $$1) {
            return $$1;
        }

        @Override
        public jf.a a() {
            return fnr.this.a;
        }

        @Override
        public Optional<int[]> h(String $$0) {
            return Optional.empty();
        }
    };

    public fnr(jf.a $$0, DynamicOps<vz> $$1) {
        this.a = $$0;
        this.b = $$0.a($$1);
    }

    public DynamicOps<vz> a() {
        return this.b;
    }

    public jf.a b() {
        return this.a;
    }

    public fnq c() {
        return this.e;
    }

    public fnq.b d() {
        return this.c;
    }

    public <T> fnq.a<T> e() {
        return this.d;
    }
}

