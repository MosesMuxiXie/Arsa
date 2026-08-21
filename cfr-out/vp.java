/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public sealed interface vp
extends vq
permits ux, vs, ve, vh, vc, va {
    public byte j();

    public short i();

    public int h();

    public long g();

    public float l();

    public double k();

    public Number m();

    @Override
    default public Optional<Number> o() {
        return Optional.of(this.m());
    }

    @Override
    default public Optional<Byte> p() {
        return Optional.of(this.j());
    }

    @Override
    default public Optional<Short> q() {
        return Optional.of(this.i());
    }

    @Override
    default public Optional<Integer> r() {
        return Optional.of(this.h());
    }

    @Override
    default public Optional<Long> s() {
        return Optional.of(this.g());
    }

    @Override
    default public Optional<Float> t() {
        return Optional.of(Float.valueOf(this.l()));
    }

    @Override
    default public Optional<Double> u() {
        return Optional.of(this.k());
    }

    @Override
    default public Optional<Boolean> v() {
        return Optional.of(this.j() != 0);
    }
}

