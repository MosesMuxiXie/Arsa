/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class irt
implements irv {
    private static final int a = 600;
    private static final yh b = yh.c("tutorial.punch_tree.title");
    private static final yh c = yh.a("tutorial.punch_tree.description", iru.a("attack"));
    private final iru d;
    private @Nullable gnd e;
    private int f;
    private int g;

    public irt(iru $$0) {
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
            if ($$1.gK().a(bdy.E)) {
                this.d.a(irw.e);
                return;
            }
            if (irq.a($$1)) {
                this.d.a(irw.e);
                return;
            }
        }
        if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new gnd($$0.g, gnd.a.c, b, c, true);
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
    public void a(hif $$0, is $$1, eoh $$2, float $$3) {
        boolean $$4 = $$2.a(bdp.E);
        if ($$4 && $$3 > 0.0f) {
            if (this.e != null) {
                this.e.a($$3);
            }
            if ($$3 >= 1.0f) {
                this.d.a(irw.d);
            }
        } else if (this.e != null) {
            this.e.a(0.0f);
        } else if ($$4) {
            ++this.g;
        }
    }

    @Override
    public void a(dlt $$0) {
        if ($$0.a(bdy.E)) {
            this.d.a(irw.e);
            return;
        }
    }
}

