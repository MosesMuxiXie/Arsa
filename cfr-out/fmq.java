/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record fmq(jd<fmr> b, byte c, byte d, byte e, Optional<yh> f) {
    private final jd<fmr> b;
    private final byte c;
    private final byte d;
    private final byte e;
    private final Optional<yh> f;
    public static final aao<xq, fmq> a = aao.a(fmr.c, fmq::c, aam.c, fmq::d, aam.c, fmq::e, aam.c, fmq::f, yj.c, fmq::g, fmq::new);

    public fmq {
        $$3 = (byte)($$3 & 0xF);
    }

    public amo a() {
        return this.b.a().b();
    }

    public boolean b() {
        return this.b.a().c();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fmq.class, "type;x;y;rot;name", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fmq.class, "type;x;y;rot;name", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fmq.class, "type;x;y;rot;name", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public jd<fmr> c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public byte e() {
        return this.d;
    }

    public byte f() {
        return this.e;
    }

    public Optional<yh> g() {
        return this.f;
    }
}

