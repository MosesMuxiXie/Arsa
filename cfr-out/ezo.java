/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezo
extends exx<faj> {
    private static final is a = new is(8, 3, 8);
    private static final dvu b = new dvu(a);
    private static final int c = 16;
    private static final int d = 1;

    public ezo(Codec<faj> $$0) {
        super($$0);
    }

    private static int a(int $$0, int $$1, int $$2, int $$3) {
        return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        dvu $$2 = new dvu($$0.e());
        if (ezo.a($$2.h, $$2.i, ezo.b.h, ezo.b.i) > 1) {
            return true;
        }
        is $$3 = a.h($$0.e().v() + a.v());
        is.a $$4 = new is.a();
        for (int $$5 = $$2.f(); $$5 <= $$2.h(); ++$$5) {
            for (int $$6 = $$2.e(); $$6 <= $$2.g(); ++$$6) {
                if (ezo.a($$3.u(), $$3.w(), $$6, $$5) > 16) continue;
                $$4.d($$6, $$3.v(), $$5);
                if ($$4.equals($$3)) {
                    $$1.a((is)$$4, dzs.m.m(), 2);
                    continue;
                }
                $$1.a((is)$$4, dzs.b.m(), 2);
            }
        }
        return true;
    }
}

