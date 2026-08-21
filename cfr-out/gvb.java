/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collection;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gvb
extends gsb {
    private static final List<ept> a = List.of(ept.values());
    private static final yh b = yh.c(dzs.qa.z());
    private static final yh c = yh.c("test_block.message");
    private final is d;
    private ept e;
    private String f;
    private @Nullable gjn t;

    public gvb(emy $$0) {
        super(b);
        this.d = $$0.aD_();
        this.e = $$0.d();
        this.f = $$0.m();
    }

    @Override
    public void bg_() {
        this.t = new gjn(this.q, this.o / 2 - 152, 80, 240, 20, yh.c("test_block.message"));
        this.t.k(128);
        this.t.a(this.f);
        this.c(this.t);
        this.a(this.e);
        this.c(gjl.a(ept::a, this.e).a((Collection<ept>)a).a().a(this.o / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a((ept)$$1)));
        this.c(gje.a(yg.d, (gje $$0) -> this.o()).a(this.o / 2 - 4 - 150, 210, 150, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.p()).a(this.o / 2 + 4, 210, 150, 20).a());
    }

    @Override
    protected void aI_() {
        if (this.t != null) {
            this.b(this.t);
        } else {
            super.aI_();
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 10, -1);
        if (this.e != ept.a) {
            $$0.b(this.q, c, this.o / 2 - 153, 70, -6250336);
        }
        $$0.b(this.q, this.e.b(), this.o / 2 - 153, 174, -6250336);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean v() {
        return true;
    }

    private void o() {
        this.f = this.t.a();
        this.n.R().b(new ajz(this.d, this.e, this.f));
        this.aX_();
    }

    @Override
    public void aX_() {
        this.p();
    }

    private void p() {
        this.n.a((gsb)null);
    }

    private void a(ept $$0) {
        this.e = $$0;
        this.t.l = $$0 != ept.a;
    }
}

