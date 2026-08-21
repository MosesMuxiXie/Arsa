/*
 * Decompiled with CFR 0.152.
 */
public class cpl
extends cop {
    private final cup a;
    private int b;

    public cpl(cup $$0) {
        this.a = $$0;
        this.a($$0);
    }

    @Override
    public void d() {
        this.a.hC();
        this.h();
    }

    private void h() {
        bcz $$0 = this.a.hB();
        if ($$0 != null) {
            this.a.a($$0);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean b() {
        ++this.b;
        if (this.b > 0 && this.a.ep().a(1000) < this.b) {
            this.a(this.a);
            return !this.a.fE() && this.a.ep().a(10) == 0;
        }
        return false;
    }

    private void a(cup $$0) {
        this.b = -$$0.hG();
    }

    @Override
    public boolean X_() {
        return true;
    }
}

