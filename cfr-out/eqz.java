/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record eqz(erd<eoh> a, eoh b, Codec<eqy<eoh>> c, erd<jd<dxo>> d, jd<dxo> e, Codec<era<jd<dxo>>> f) {
    private final erd<eoh> a;
    private final eoh b;
    private final Codec<eqy<eoh>> c;
    private final erd<jd<dxo>> d;
    private final jd<dxo> e;
    private final Codec<era<jd<dxo>>> f;

    public static eqz a(jr $$0) {
        erd<eoh> $$1 = erd.a(dzq.k);
        eoh $$2 = dzs.a.m();
        jq<dxo> $$3 = $$0.f(mj.aS);
        erd<jd<dxo>> $$4 = erd.b($$3.t());
        jd.c $$5 = $$3.b(dxv.b);
        return new eqz($$1, $$2, eqy.a(eoh.a, $$1, $$2), $$4, $$5, eqy.b($$3.r(), $$4, $$5));
    }

    public eqy<eoh> a() {
        return new eqy<eoh>(this.b, this.a);
    }

    public eqy<jd<dxo>> b() {
        return new eqy<jd<dxo>>(this.e, this.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eqz.class, "blockStatesStrategy;defaultBlockState;blockStatesContainerCodec;biomeStrategy;defaultBiome;biomeContainerCodec", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eqz.class, "blockStatesStrategy;defaultBlockState;blockStatesContainerCodec;biomeStrategy;defaultBiome;biomeContainerCodec", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eqz.class, "blockStatesStrategy;defaultBlockState;blockStatesContainerCodec;biomeStrategy;defaultBiome;biomeContainerCodec", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public erd<eoh> c() {
        return this.a;
    }

    public eoh d() {
        return this.b;
    }

    public Codec<eqy<eoh>> e() {
        return this.c;
    }

    public erd<jd<dxo>> f() {
        return this.d;
    }

    public jd<dxo> g() {
        return this.e;
    }

    public Codec<era<jd<dxo>>> h() {
        return this.f;
    }
}

