/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.function.ToIntFunction;

class cfu
extends cfk {
    private final ToIntFunction<bgr> c;

    protected cfu(cfl $$0, int $$1, ToIntFunction<bgr> $$2) {
        super($$0, $$1, ly.Z);
        this.c = $$2;
    }

    @Override
    public void a(axf $$0, chl $$1, int $$2, cgk.e $$3) {
        if ($$3 == cgk.e.a && ($$1 instanceof ddm || $$0.U().a(eua.F).booleanValue())) {
            this.a($$0, $$1.ep(), $$1.dK());
        }
    }

    private void a(axf $$0, bgr $$1, is $$2) {
        HashSet $$3 = Sets.newHashSet();
        int $$4 = this.c.applyAsInt($$1);
        for (is $$5 : is.a($$1, 15, $$2, 1)) {
            is $$6 = $$5.e();
            if ($$3.contains($$5) || !$$0.a_($$5).v() || !$$0.a_($$6).c((dvt)$$0, $$6, iz.b)) continue;
            $$3.add($$5.j());
            if ($$3.size() < $$4) continue;
            break;
        }
        for (is $$7 : $$3) {
            $$0.a($$7, dzs.bz.m(), 3);
            $$0.c(3018, $$7, 0);
        }
    }
}

