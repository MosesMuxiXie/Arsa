/*
 * Decompiled with CFR 0.152.
 */
public class cnr
extends cnp {
    private final int h;
    private static final int i = 10;
    private static final int j = 20;

    public cnr(chn $$0, int $$1) {
        super($$0);
        this.h = $$1;
    }

    @Override
    public void a() {
        if (this.d > 0) {
            --this.d;
            this.i().ifPresent($$0 -> {
                this.a.bE = this.a(this.a.bE, $$0.floatValue() + 20.0f, this.b);
            });
            this.h().ifPresent($$0 -> this.a.w(this.a(this.a.ee(), $$0.floatValue() + 10.0f, this.c)));
        } else {
            if (this.a.N().l()) {
                this.a.w(this.a(this.a.ee(), 0.0f, 5.0f));
            }
            this.a.bE = this.a(this.a.bE, this.a.bC, this.b);
        }
        float $$02 = bgj.f(this.a.bE - this.a.bC);
        if ($$02 < (float)(-this.h)) {
            this.a.bC -= 4.0f;
        } else if ($$02 > (float)this.h) {
            this.a.bC += 4.0f;
        }
    }
}

