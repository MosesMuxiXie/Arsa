/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class irq
implements irv {
    private static final int a = 6000;
    private static final yh b = yh.c("tutorial.find_tree.title");
    private static final yh c = yh.c("tutorial.find_tree.description");
    private final iru d;
    private @Nullable gnd e;
    private int f;

    public irq(iru $$0) {
        this.d = $$0;
    }

    @Override
    public void a() {
        hnh $$1;
        ++this.f;
        if (!this.d.f()) {
            this.d.a(irw.f);
            return;
        }
        gfj $$0 = this.d.e();
        if (this.f == 1 && ($$1 = $$0.s) != null && (irq.b($$1) || irq.a($$1))) {
            this.d.a(irw.e);
            return;
        }
        if (this.f >= 6000 && this.e == null) {
            this.e = new gnd($$0.g, gnd.a.c, b, c, false);
            $$0.aG().a(this.e);
        }
    }

    @Override
    public void b() {
        if (this.e != null) {
            this.e.c();
            this.e = null;
        }
    }

    @Override
    public void a(hif $$0, ftk $$1) {
        eoh $$2;
        if ($$1.d() == ftk.a.b && ($$2 = $$0.a_(((fti)$$1).b())).a(bdp.ag)) {
            this.d.a(irw.c);
        }
    }

    @Override
    public void a(dlt $$0) {
        if ($$0.a(bdy.ag)) {
            this.d.a(irw.e);
        }
    }

    private static boolean b(hnh $$02) {
        return $$02.gK().a_($$0 -> $$0.a(bdy.ag));
    }

    public static boolean a(hnh $$0) {
        for (jd<dzq> $$1 : mi.e.c(bdp.ag)) {
            dzq $$2 = $$1.a();
            if ($$0.x().a(bdk.a.b($$2)) <= 0) continue;
            return true;
        }
        return false;
    }
}

