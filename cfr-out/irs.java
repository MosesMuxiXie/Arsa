/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class irs
implements irv {
    private static final int a = 600;
    private static final yh b = yh.c("tutorial.open_inventory.title");
    private static final yh c = yh.a("tutorial.open_inventory.description", iru.a("inventory"));
    private final iru d;
    private @Nullable gnd e;
    private int f;

    public irs(iru $$0) {
        this.d = $$0;
    }

    @Override
    public void a() {
        ++this.f;
        if (!this.d.f()) {
            this.d.a(irw.f);
            return;
        }
        if (this.f >= 600 && this.e == null) {
            gfj $$0 = this.d.e();
            this.e = new gnd($$0.g, gnd.a.d, b, c, false);
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
    public void c() {
        this.d.a(irw.e);
    }
}

