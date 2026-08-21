/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cqn
extends cqq {
    private final cii a;
    private chl b;
    private int c;

    public cqn(cii $$0) {
        super($$0, false);
        this.a = $$0;
        this.a(EnumSet.of(cop.a.d));
    }

    @Override
    public boolean b() {
        if (!this.a.p() || this.a.gR()) {
            return false;
        }
        chl $$0 = this.a.U_();
        if ($$0 == null) {
            return false;
        }
        this.b = $$0.eK();
        int $$1 = $$0.eM();
        return $$1 != this.c && this.a(this.b, csk.a) && this.a.a(this.b, $$0);
    }

    @Override
    public void d() {
        this.e.g(this.b);
        chl $$0 = this.a.U_();
        if ($$0 != null) {
            this.c = $$0.eM();
        }
        super.d();
    }
}

