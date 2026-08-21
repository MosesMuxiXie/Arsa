/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class ibb<S extends ich, M extends gzm<S>>
extends ibj<S, M> {
    public ibb(hyq<S, M> $$0) {
        super($$0);
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, S $$3, float $$4, float $$5) {
        this.a($$3, ((ich)$$3).g, ((ich)$$3).h, chb.b, $$0, $$1, $$2);
        this.a($$3, ((ich)$$3).j, ((ich)$$3).k, chb.a, $$0, $$1, $$2);
    }

    protected void a(S $$0, ihm $$1, dlt $$2, chb $$3, fzm $$4, hpo $$5, int $$6) {
        float $$8;
        if ($$1.e()) {
            return;
        }
        $$4.a();
        ((gzk)this.d()).a($$0, $$3, $$4);
        $$4.a((Quaternionfc)a.b.rotationDegrees(-90.0f));
        $$4.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        boolean $$7 = $$3 == chb.a;
        $$4.a((float)($$7 ? -1 : 1) / 16.0f, 0.125f, -0.625f);
        if (((ich)$$0).m > 0.0f && ((ich)$$0).e == $$3 && ((ich)$$0).l == dnf.c) {
            hcz.a($$0, $$4);
        }
        if (($$8 = ((ich)$$0).b($$3)) != 0.0f) {
            ($$3 == chb.b ? ((ich)$$0).f : ((ich)$$0).i).a($$0, $$4, $$8, $$3, $$2);
        }
        $$1.a($$4, $$5, $$6, ilg.d, ((ich)$$0).U);
        $$4.b();
    }
}

