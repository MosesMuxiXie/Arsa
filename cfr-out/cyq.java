/*
 * Decompiled with CFR 0.152.
 */
public class cyq
extends cyg {
    private static final int b = 100;
    private static final int c = 10;
    private static final int d = 20;
    private static final int e = 150;
    private static final csk f = csk.a().a(150.0);
    private final csk g = csk.a().a(20.0).a((chl $$1, axf $$2) -> Math.abs($$1.dR() - $$0.dR()) <= 10.0);
    private int h;

    public cyq(cyc $$0) {
        super($$0);
    }

    @Override
    public void a(axf $$0) {
        ++this.h;
        ddm $$1 = $$0.a(this.g, this.a, this.a.dP(), this.a.dR(), this.a.dV());
        if ($$1 != null) {
            if (this.h > 25) {
                this.a.gN().a(cyt.h);
            } else {
                ftm $$2 = new ftm($$1.dP() - this.a.dP(), 0.0, $$1.dV() - this.a.dV()).d();
                ftm $$3 = new ftm(bgj.a((double)(this.a.ec() * ((float)Math.PI / 180))), 0.0, -bgj.b((double)(this.a.ec() * ((float)Math.PI / 180)))).d();
                float $$4 = (float)$$3.b($$2);
                float $$5 = (float)(Math.acos($$4) * 57.2957763671875) + 0.5f;
                if ($$5 < 0.0f || $$5 > 10.0f) {
                    float $$9;
                    double $$6 = $$1.dP() - this.a.c.dP();
                    double $$7 = $$1.dV() - this.a.c.dV();
                    double $$8 = bgj.a(bgj.g(180.0 - bgj.d($$6, $$7) * 57.2957763671875 - (double)this.a.ec()), -100.0, 100.0);
                    this.a.cv *= 0.8f;
                    float $$10 = $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0f;
                    if ($$9 > 40.0f) {
                        $$9 = 40.0f;
                    }
                    this.a.cv += (float)$$8 * (0.7f / $$9 / $$10);
                    this.a.v(this.a.ec() + this.a.cv);
                }
            }
        } else if (this.h >= 100) {
            $$1 = $$0.a(f, this.a, this.a.dP(), this.a.dR(), this.a.dV());
            this.a.gN().a(cyt.e);
            if ($$1 != null) {
                this.a.gN().a(cyt.i);
                this.a.gN().b(cyt.i).a(new ftm($$1.dP(), $$1.dR(), $$1.dV()));
            }
        }
    }

    @Override
    public void c() {
        this.h = 0;
    }

    public cyt<cyq> h() {
        return cyt.g;
    }
}

