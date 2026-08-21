/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;
import java.util.function.Supplier;

public class gxl
extends gxe<hjo.a> {
    private static final int A = 85;
    private static final int B = 178;
    private static final yh C = yh.c("gui.abuseReport.skin.title");
    private gjx D;
    private gje E;

    private gxl(gsb $$0, hjn $$1, hjo.a $$2) {
        super(C, $$0, $$1, $$2);
    }

    public gxl(gsb $$0, hjn $$1, UUID $$2, Supplier<ddq> $$3) {
        this($$0, $$1, new hjo.a($$2, $$3, $$1.a().b()));
    }

    public gxl(gsb $$0, hjn $$1, hjo $$2) {
        this($$0, $$1, new hjo.a($$2, $$1.a().b()));
    }

    @Override
    protected void p() {
        goy $$03 = this.x.a(goy.e().a(8));
        $$03.c().e();
        $$03.a(new gkf(85, 120, this.n.aV(), ((hjo)((hjo.a)this.y).e()).a()));
        goy $$1 = $$03.a(goy.d().a(8));
        this.E = gje.a(c, (gje $$02) -> this.n.a(new gxk(this, ((hjo.a)this.y).i(), hjm.b, $$0 -> {
            ((hjo.a)this.y).a((hjl)((Object)((Object)$$0)));
            this.I();
        }))).a(178).a();
        $$1.a(goq.a(this.q, this.E, b));
        this.D = this.a(178, this.q.b * 8, $$0 -> {
            ((hjo.a)this.y).a((String)$$0);
            this.I();
        });
        $$1.a(goq.a(this.q, this.D, d, $$0 -> $$0.e(12)));
    }

    @Override
    protected void I() {
        hjl $$0 = ((hjo.a)this.y).i();
        if ($$0 != null) {
            this.E.a_($$0.b());
        } else {
            this.E.a_(c);
        }
        super.I();
    }

    @Override
    public boolean b(gzc $$0) {
        if (super.b($$0)) {
            return true;
        }
        return this.D.b($$0);
    }
}

