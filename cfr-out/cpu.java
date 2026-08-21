/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpu
extends cop {
    private final cii a;

    public cpu(cii $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.c, cop.a.a));
    }

    @Override
    public boolean c() {
        return this.a.gR();
    }

    @Override
    public boolean b() {
        boolean $$0 = this.a.gR();
        if (!$$0 && !this.a.p()) {
            return false;
        }
        if (this.a.by()) {
            return false;
        }
        if (!this.a.aV()) {
            return false;
        }
        chl $$1 = this.a.U_();
        if ($$1 == null || $$1.ao() != this.a.ao()) {
            return true;
        }
        if (this.a.g((cgk)$$1) < 144.0 && $$1.eK() != null) {
            return false;
        }
        return $$0;
    }

    @Override
    public void d() {
        this.a.N().n();
        this.a.y(true);
    }

    @Override
    public void e() {
        this.a.y(false);
    }
}

