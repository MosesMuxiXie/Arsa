/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class aea
extends Record
implements aay<adb> {
    private final int b;
    private final jd<cez> c;
    private final int d;
    private final int e;
    private final Optional<ftm> f;
    public static final aao<xq, aea> a = aay.a(aea::a, aea::new);

    public aea(cgk $$0, cex $$1) {
        this($$0.aA(), $$1.l(), $$1.d() != null ? $$1.d().aA() : -1, $$1.c() != null ? $$1.c().aA() : -1, Optional.ofNullable($$1.j()));
    }

    private aea(xq $$02) {
        this($$02.l(), (jd)cez.c.decode($$02), aea.a($$02), aea.a($$02), $$02.b($$0 -> new ftm($$0.readDouble(), $$0.readDouble(), $$0.readDouble())));
    }

    public aea(int $$0, jd<cez> $$1, int $$2, int $$3, Optional<ftm> $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    private static void a(wx $$0, int $$1) {
        $$0.c($$1 + 1);
    }

    private static int a(wx $$0) {
        return $$0.l() - 1;
    }

    @Override
    private void a(xq $$02) {
        $$02.c(this.b);
        cez.c.encode($$02, this.c);
        aea.a((wx)$$02, this.d);
        aea.a((wx)$$02, this.e);
        $$02.a(this.f, ($$0, $$1) -> {
            $$0.a($$1.a());
            $$0.a($$1.b());
            $$0.a($$1.c());
        });
    }

    @Override
    public aba<aea> a() {
        return ahz.y;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public cex a(dwo $$0) {
        if (this.f.isPresent()) {
            return new cex(this.c, this.f.get());
        }
        cgk $$1 = $$0.a(this.d);
        cgk $$2 = $$0.a(this.e);
        return new cex(this.c, $$2, $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aea.class, "entityId;sourceType;sourceCauseId;sourceDirectId;sourcePosition", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aea.class, "entityId;sourceType;sourceCauseId;sourceDirectId;sourcePosition", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aea.class, "entityId;sourceType;sourceCauseId;sourceDirectId;sourcePosition", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public jd<cez> e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public Optional<ftm> h() {
        return this.f;
    }
}

