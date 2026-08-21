/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpz
extends cop {
    private final dcw a;

    public cpz(dcw $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.c, cop.a.a));
    }

    @Override
    public boolean b() {
        if (!this.a.cb()) {
            return false;
        }
        if (this.a.by()) {
            return false;
        }
        if (!this.a.aV()) {
            return false;
        }
        if (this.a.ah) {
            return false;
        }
        ddm $$0 = this.a.a();
        if ($$0 == null) {
            return false;
        }
        return !(this.a.g((cgk)$$0) > 16.0);
    }

    @Override
    public void d() {
        this.a.N().n();
    }

    @Override
    public void e() {
        this.a.a((ddm)null);
    }
}

