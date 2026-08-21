/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class edb
extends edv {
    public static final MapCodec<edb> a = edb.b(edb::new);
    public static final int b = 3;
    public static final eph c = eox.aw;
    private static final int f = 4;
    private static final int g = 2;

    public MapCodec<edb> a() {
        return a;
    }

    public edb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        $$1.a($$2, (dzq)this, bgj.a($$1.G_(), 60, 120));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$3.a(3) == 0 || this.a((dvt)$$1, $$2, 4)) {
            int $$4;
            int n2 = $$4 = $$1.aq() == dwo.j ? $$1.a(dww.b, $$2) : $$1.G($$2);
            if ($$4 > 11 - $$0.c(c) - $$0.g() && this.d($$0, $$1, $$2)) {
                is.a $$5 = new is.a();
                for (iz $$6 : iz.values()) {
                    $$5.a((jy)$$2, $$6);
                    eoh $$7 = $$1.a_($$5);
                    if (!$$7.a(this) || this.d($$7, $$1, $$5)) continue;
                    $$1.a((is)$$5, (dzq)this, bgj.a($$3, 20, 40));
                }
                return;
            }
        }
        $$1.a($$2, (dzq)this, bgj.a($$3, 20, 40));
    }

    private boolean d(eoh $$0, dwo $$1, is $$2) {
        int $$3 = $$0.c(c);
        if ($$3 < 3) {
            $$1.a($$2, (eoh)$$0.b(c, $$3 + 1), 2);
            return false;
        }
        this.c($$0, $$1, $$2);
        return true;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$3.m().a(this) && this.a((dvt)$$1, $$2, 2)) {
            this.c($$0, $$1, $$2);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private boolean a(dvt $$0, is $$1, int $$2) {
        int $$3 = 0;
        is.a $$4 = new is.a();
        for (iz $$5 : iz.values()) {
            $$4.a((jy)$$1, $$5);
            if (!$$0.a_($$4).a(this) || ++$$3 < $$2) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return dlt.l;
    }
}

