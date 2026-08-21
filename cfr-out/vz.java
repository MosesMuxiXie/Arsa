/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;

public sealed interface vz
permits uz, uy, vq, vb {
    public static final int d = 8;
    public static final int e = 12;
    public static final int f = 4;
    public static final int g = 28;
    public static final byte h = 0;
    public static final byte i = 1;
    public static final byte j = 2;
    public static final byte k = 3;
    public static final byte l = 4;
    public static final byte m = 5;
    public static final byte n = 6;
    public static final byte o = 7;
    public static final byte p = 8;
    public static final byte q = 9;
    public static final byte r = 10;
    public static final byte s = 11;
    public static final byte t = 12;
    public static final int u = 512;

    public void a(DataOutput var1) throws IOException;

    public String toString();

    public byte b();

    public wb<?> c();

    public vz d();

    public int a();

    public void a(wd var1);

    public vw.b a(vw var1);

    default public void b(vw $$0) {
        vw.b $$1 = $$0.b(this.c());
        if ($$1 == vw.b.a) {
            this.a($$0);
        }
    }

    default public Optional<String> p_() {
        return Optional.empty();
    }

    default public Optional<Number> o() {
        return Optional.empty();
    }

    default public Optional<Byte> p() {
        return this.o().map(Number::byteValue);
    }

    default public Optional<Short> q() {
        return this.o().map(Number::shortValue);
    }

    default public Optional<Integer> r() {
        return this.o().map(Number::intValue);
    }

    default public Optional<Long> s() {
        return this.o().map(Number::longValue);
    }

    default public Optional<Float> t() {
        return this.o().map(Number::floatValue);
    }

    default public Optional<Double> u() {
        return this.o().map(Number::doubleValue);
    }

    default public Optional<Boolean> v() {
        return this.p().map($$0 -> $$0 != 0);
    }

    default public Optional<byte[]> f() {
        return Optional.empty();
    }

    default public Optional<int[]> q_() {
        return Optional.empty();
    }

    default public Optional<long[]> r_() {
        return Optional.empty();
    }

    default public Optional<uz> s_() {
        return Optional.empty();
    }

    default public Optional<vf> t_() {
        return Optional.empty();
    }
}

