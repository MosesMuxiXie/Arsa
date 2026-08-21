/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

class htq {
    private final Map<is, elb> a;
    private final @Nullable eqy<eoh> b;
    private final boolean c;
    private final dwq d;

    htq(eqq $$0, int $$1) {
        this.d = $$0;
        this.c = $$0.I().ar();
        this.a = ImmutableMap.copyOf($$0.J());
        if ($$0 instanceof eqm) {
            this.b = null;
        } else {
            eqr $$3;
            eqr[] $$2 = $$0.d();
            this.b = $$1 < 0 || $$1 >= $$2.length ? null : (($$3 = $$2[$$1]).c() ? null : $$3.h().f());
        }
    }

    public @Nullable elb a(is $$0) {
        return this.a.get($$0);
    }

    public eoh b(is $$0) {
        int $$1 = $$0.u();
        int $$2 = $$0.v();
        int $$3 = $$0.w();
        if (this.c) {
            eoh $$4 = null;
            if ($$2 == 60) {
                $$4 = dzs.iO.m();
            }
            if ($$2 == 70) {
                $$4 = euh.a($$1, $$3);
            }
            return $$4 == null ? dzs.a.m() : $$4;
        }
        if (this.b == null) {
            return dzs.a.m();
        }
        try {
            return this.b.a($$1 & 0xF, $$2 & 0xF, $$3 & 0xF);
        }
        catch (Throwable $$5) {
            m $$6 = m.a($$5, "Getting block state");
            n $$7 = $$6.a("Block being got");
            $$7.a("Location", () -> n.a(this.d, $$1, $$2, $$3));
            throw new v($$6);
        }
    }
}

