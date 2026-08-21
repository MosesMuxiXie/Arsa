/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public class adc
implements aay<adb> {
    public static final aao<xq, adc> a = aay.a(adc::a, adc::new);
    private final int b;
    private final UUID c;
    private final cgu<?> d;
    private final double e;
    private final double f;
    private final double g;
    private final ftm h;
    private final byte i;
    private final byte j;
    private final byte k;
    private final int l;

    public adc(cgk $$0, axd $$1) {
        this($$0, $$1, 0);
    }

    public adc(cgk $$0, axd $$1, int $$2) {
        this($$0.aA(), $$0.cY(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.ay(), $$2, $$1.c(), $$1.f());
    }

    public adc(cgk $$0, int $$1, is $$2) {
        this($$0.aA(), $$0.cY(), $$2.u(), $$2.v(), $$2.w(), $$0.ee(), $$0.ec(), $$0.ay(), $$1, $$0.dN(), $$0.cS());
    }

    public adc(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, cgu<?> $$7, int $$8, ftm $$9, double $$10) {
        this.b = $$0;
        this.c = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$9;
        this.i = bgj.e($$5);
        this.j = bgj.e($$6);
        this.k = bgj.e((float)$$10);
        this.d = $$7;
        this.l = $$8;
    }

    private adc(xq $$0) {
        this.b = $$0.l();
        this.c = $$0.n();
        this.d = (cgu)aam.a(mj.F).decode($$0);
        this.e = $$0.readDouble();
        this.f = $$0.readDouble();
        this.g = $$0.readDouble();
        this.h = $$0.k();
        this.i = $$0.readByte();
        this.j = $$0.readByte();
        this.k = $$0.readByte();
        this.l = $$0.l();
    }

    @Override
    private void a(xq $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
        aam.a(mj.F).encode($$0, this.d);
        $$0.a(this.e);
        $$0.a(this.f);
        $$0.a(this.g);
        $$0.b(this.h);
        $$0.l(this.i);
        $$0.l(this.j);
        $$0.l(this.k);
        $$0.c(this.l);
    }

    @Override
    public aba<adc> a() {
        return ahz.c;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public UUID e() {
        return this.c;
    }

    public cgu<?> f() {
        return this.d;
    }

    public double g() {
        return this.e;
    }

    public double h() {
        return this.f;
    }

    public double i() {
        return this.g;
    }

    public ftm j() {
        return this.h;
    }

    public float k() {
        return bgj.a(this.i);
    }

    public float l() {
        return bgj.a(this.j);
    }

    public float m() {
        return bgj.a(this.k);
    }

    public int n() {
        return this.l;
    }
}

