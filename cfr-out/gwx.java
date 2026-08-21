/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class gwx
extends gjq {
    private static final gku d = new gku(amo.b("recipe_book/tab"), amo.b("recipe_book/tab_selected"));
    public static final int b = 35;
    public static final int c = 27;
    private final gwv.a u;
    private static final float v = 15.0f;
    private float w;
    private boolean x = false;

    public gwx(int $$0, int $$1, gwv.a $$2, gje.c $$3) {
        super($$0, $$1, 35, 27, d, $$3);
        this.u = $$2;
    }

    public void a(geu $$0, boolean $$1) {
        gwz.a $$2 = $$1 ? gwz.a.b : gwz.a.a;
        List<gwz> $$3 = $$0.a(this.u.c());
        for (gwz $$4 : $$3) {
            for (drz $$5 : $$4.a($$2)) {
                if (!$$0.b($$5.a())) continue;
                this.w = 15.0f;
                return;
            }
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        if (this.w > 0.0f) {
            float $$4 = 1.0f + 0.1f * (float)Math.sin(this.w / 15.0f * (float)Math.PI);
            $$0.e().pushMatrix();
            $$0.e().translate((float)(this.aT_() + 8), (float)(this.aU_() + 12));
            $$0.e().scale(1.0f, $$4);
            $$0.e().translate((float)(-(this.aT_() + 8)), (float)(-(this.aU_() + 12)));
        }
        amo $$5 = this.a.a(true, this.x);
        int $$6 = this.aT_();
        if (this.x) {
            $$6 -= 2;
        }
        $$0.a(hpa.at, $$5, $$6, this.aU_(), this.g, this.h);
        this.b($$0);
        if (this.w > 0.0f) {
            $$0.e().popMatrix();
            this.w -= $$3;
        }
    }

    @Override
    protected void d(gir $$0) {
        if (!this.x) {
            super.d($$0);
        }
    }

    private void b(gir $$0) {
        int $$1;
        int n2 = $$1 = this.x ? -2 : 0;
        if (this.u.b().isPresent()) {
            $$0.b(this.u.a(), this.aT_() + 3 + $$1, this.aU_() + 5);
            $$0.b(this.u.b().get(), this.aT_() + 14 + $$1, this.aU_() + 5);
        } else {
            $$0.b(this.u.a(), this.aT_() + 9 + $$1, this.aU_() + 5);
        }
    }

    public dqk a() {
        return this.u.c();
    }

    public boolean a(geu $$0) {
        List<gwz> $$1 = $$0.a(this.u.c());
        this.l = false;
        for (gwz $$2 : $$1) {
            if (!$$2.b()) continue;
            this.l = true;
            break;
        }
        return this.l;
    }

    public void d() {
        this.x = true;
    }

    public void e() {
        this.x = false;
    }
}

