/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hco
extends gzq<iez> {
    public static final hdp h = new gzl(false, 8.0f, 4.0f, 2.0f, 2.0f, 24.0f, Set.of("head"));

    public hco(hdg $$0) {
        super($$0);
    }

    public static hdm a() {
        hdo $$0 = gzq.a(12, false, true, hdk.a);
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-3.0f, -4.0f, -6.0f, 6.0f, 6.0f, 8.0f), hdi.a(0.0f, 6.0f, -8.0f));
        $$1.a("body", hdl.c().a(28, 8).a(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f), hdi.a(0.0f, 5.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(iez $$0) {
        super.a($$0);
        this.b.c += $$0.a * 9.0f * $$0.aA;
        this.b.e = $$0.b;
    }
}

