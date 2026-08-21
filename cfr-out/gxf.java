/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gxf
extends gxe<hjg.a> {
    private static final yh A = yh.c("gui.chatReport.title");
    private static final yh B = yh.c("gui.chatReport.select_chat");
    private gjx C;
    private gje D;
    private gje E;

    private gxf(gsb $$0, hjn $$1, hjg.a $$2) {
        super(A, $$0, $$1, $$2);
    }

    public gxf(gsb $$0, hjn $$1, UUID $$2) {
        this($$0, $$1, new hjg.a($$2, $$1.a().b()));
    }

    public gxf(gsb $$0, hjn $$1, hjg $$2) {
        this($$0, $$1, new hjg.a($$2, $$1.a().b()));
    }

    @Override
    protected void p() {
        this.D = this.x.a(gje.a(B, (gje $$02) -> this.n.a(new gxh(this, this.w, (hjg.a)this.y, $$0 -> {
            this.y = $$0;
            this.I();
        }))).a(280).a());
        this.E = gje.a(c, (gje $$02) -> this.n.a(new gxk(this, ((hjg.a)this.y).i(), hjm.a, $$0 -> {
            ((hjg.a)this.y).a((hjl)((Object)((Object)$$0)));
            this.I();
        }))).a(280).a();
        this.x.a(goq.a(this.q, this.E, b));
        this.C = this.a(280, this.q.b * 8, $$0 -> {
            ((hjg.a)this.y).a((String)$$0);
            this.I();
        });
        this.x.a(goq.a(this.q, this.C, d, $$0 -> $$0.e(12)));
    }

    @Override
    protected void I() {
        IntSet $$0 = ((hjg.a)this.y).a();
        if ($$0.isEmpty()) {
            this.D.a_(B);
        } else {
            this.D.a_(yh.a("gui.chatReport.selected_chat", $$0.size()));
        }
        hjl $$1 = ((hjg.a)this.y).i();
        if ($$1 != null) {
            this.E.a_($$1.b());
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
        return this.C.b($$0);
    }
}

