/*
 * Decompiled with CFR 0.152.
 */
public class ioz
implements iou {
    private final hnh a;
    private boolean b;
    private boolean c = true;

    public ioz(hnh $$0) {
        this.a = $$0;
    }

    @Override
    public void a() {
        dwo $$02 = this.a.ao();
        eoh $$1 = $$02.c(this.a.dj().c(0.0, -0.4f, 0.0).h(1.0E-6)).filter($$0 -> $$0.a(dzs.oa)).findFirst().orElse(null);
        if ($$1 != null) {
            if (!this.b && !this.c && $$1.a(dzs.oa) && !this.a.au()) {
                boolean $$2 = $$1.c(dzx.b);
                if ($$2) {
                    this.a.a(bda.dn, 1.0f, 1.0f);
                } else {
                    this.a.a(bda.dl, 1.0f, 1.0f);
                }
            }
            this.b = true;
        } else {
            this.b = false;
        }
        this.c = false;
    }
}

