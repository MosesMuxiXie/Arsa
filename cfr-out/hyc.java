/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hyc
extends hwp<chr, iec> {
    private static final float a = 40.0f;
    private static final int f = 50;
    private final ihk g;
    private final bgr h = bgr.a();

    protected hyc(hwq.a $$0) {
        super($$0);
        this.g = $$0.b();
    }

    public iec a() {
        return new iec();
    }

    @Override
    public void a(chr $$0, iec $$1, float $$2) {
        super.a($$0, $$1, $$2);
        dlt $$3 = $$0.f();
        $$1.a($$0, $$3, this.g);
    }

    @Override
    public void a(iec $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.a.e()) {
            return;
        }
        $$1.a();
        if ($$0.L <= 50.0f) {
            float $$4 = Math.min($$0.L, 50.0f) / 50.0f;
            $$1.b($$4, $$4, $$4);
        }
        float $$5 = bgj.f($$0.L * 40.0f);
        $$1.a((Quaternionfc)a.d.rotationDegrees($$5));
        hxn.a($$1, $$2, 0xF000F0, $$0, this.h);
        $$1.b();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

