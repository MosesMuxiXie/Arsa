/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiFunction;

public class adh
implements aay<adb> {
    public static final aao<xq, adh> a = aao.a(is.b, adh::b, aam.a(mj.e), adh::e, aam.t, adh::f, adh::new);
    private final is b;
    private final eld<?> c;
    private final uz d;

    public static adh a(elb $$0, BiFunction<elb, jr, uz> $$1) {
        jr $$2 = $$0.j().J_();
        return new adh($$0.aD_(), $$0.s(), $$1.apply($$0, $$2));
    }

    public static adh a(elb $$0) {
        return adh.a($$0, elb::a);
    }

    private adh(is $$0, eld<?> $$1, uz $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public aba<adh> a() {
        return ahz.h;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public is b() {
        return this.b;
    }

    public eld<?> e() {
        return this.c;
    }

    public uz f() {
        return this.d;
    }
}

