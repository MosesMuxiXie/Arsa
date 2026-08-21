/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class cjh
extends cjd<dcx> {
    private @Nullable dfh c;

    public cjh(int $$0, int $$1) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(), $$0, $$1);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        is $$2 = $$1.dK();
        this.c = $$0.f($$2);
        return this.c != null && this.c.e() && ckn.a($$0, $$1, $$2);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return this.c != null && !this.c.d();
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        this.c = null;
        $$1.ev().a($$0.c(), $$0.au(), $$1.dI());
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        bgr $$3 = $$1.ep();
        if ($$3.a(100) == 0) {
            $$1.gR();
        }
        if ($$3.a(200) == 0 && ckn.a($$0, $$1, $$1.dK())) {
            dkr $$4 = bhs.a(dkr.values(), $$3);
            int $$5 = $$3.a(3);
            dlt $$6 = this.a($$4, $$5);
            dec.a(new ddy($$1.ao(), $$1, $$1.dP(), $$1.dT(), $$1.dV(), $$6), $$0, $$6);
        }
    }

    private dlt a(dkr $$0, int $$1) {
        dlt $$2 = new dlt(dlx.wG);
        $$2.b(ki.aq, new dol((byte)$$1, List.of(new dok(dok.a.e, IntList.of((int)$$0.f()), IntList.of(), false, false))));
        return $$2;
    }
}

