/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class irp
implements irv {
    private static final int a = 1200;
    private static final yh b = yh.c("tutorial.craft_planks.title");
    private static final yh c = yh.c("tutorial.craft_planks.description");
    private final iru d;
    private @Nullable gnd e;
    private int f;

    public irp(iru $$0) {
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
        if (this.f == 1 && ($$1 = $$0.s) != null) {
            if ($$1.gK().a(bdy.b)) {
                this.d.a(irw.f);
                return;
            }
            if (irp.a($$1, bdy.b)) {
                this.d.a(irw.f);
                return;
            }
        }
        if (this.f >= 1200 && this.e == null) {
            this.e = new gnd($$0.g, gnd.a.e, b, c, false);
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
    public void a(dlt $$0) {
        if ($$0.a(bdy.b)) {
            this.d.a(irw.f);
        }
    }

    public static boolean a(hnh $$0, bef<dlp> $$1) {
        for (jd<dlp> $$2 : mi.h.c($$1)) {
            if ($$0.x().a(bdk.b.b($$2.a())) <= 0) continue;
            return true;
        }
        return false;
    }
}

