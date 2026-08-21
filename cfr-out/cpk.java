/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpk
extends cop {
    private final chn a;
    private double b;
    private double c;
    private int d;

    public cpk(chn $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        return this.a.ep().i() < 0.02f;
    }

    @Override
    public boolean c() {
        return this.d >= 0;
    }

    @Override
    public void d() {
        double $$0 = Math.PI * 2 * this.a.ep().j();
        this.b = Math.cos($$0);
        this.c = Math.sin($$0);
        this.d = 20 + this.a.ep().a(20);
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        --this.d;
        this.a.J().a(this.a.dP() + this.b, this.a.dT(), this.a.dV() + this.c);
    }
}

