/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class cqh
extends cqq {
    private final cwh a;
    private @Nullable chl b;
    private final csk c = csk.a().a(64.0);

    public cqh(cwh $$0) {
        super($$0, false, true);
        this.a = $$0;
        this.a(EnumSet.of(cop.a.d));
    }

    @Override
    public boolean b() {
        ddm $$8;
        fth $$0 = this.a.dj().c(10.0, 8.0, 10.0);
        axf $$1 = cqh.a(this.a);
        List<dcx> $$2 = $$1.a(dcx.class, this.c, this.a, $$0);
        List<ddm> $$3 = $$1.a(this.c, this.a, $$0);
        for (chl chl2 : $$2) {
            dcx $$5 = (dcx)chl2;
            for (ddm $$6 : $$3) {
                int $$7 = $$5.g($$6);
                if ($$7 > -100) continue;
                this.b = $$6;
            }
        }
        if (this.b == null) {
            return false;
        }
        chl chl2 = this.b;
        return !(chl2 instanceof ddm) || !($$8 = (ddm)chl2).au() && !$$8.ha();
    }

    @Override
    public void d() {
        this.a.g(this.b);
        super.d();
    }
}

