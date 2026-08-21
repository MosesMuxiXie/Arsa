/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class fkq
implements fkt {
    public static final int b = 1;
    public static final fkq c = new fkq();
    protected final dwq d;
    private final @Nullable fks<?, ?> a;
    private final @Nullable fks<?, ?> e;

    public fkq(eqt $$0, boolean $$1, boolean $$2) {
        this.d = $$0.s();
        this.a = $$1 ? new fkj($$0) : null;
        this.e = $$2 ? new fku($$0) : null;
    }

    private fkq() {
        this.d = dwq.e(0, 0);
        this.a = null;
        this.e = null;
    }

    @Override
    public void a(is $$0) {
        if (this.a != null) {
            this.a.a($$0);
        }
        if (this.e != null) {
            this.e.a($$0);
        }
    }

    @Override
    public boolean M_() {
        if (this.e != null && this.e.M_()) {
            return true;
        }
        return this.a != null && this.a.M_();
    }

    @Override
    public int a() {
        int $$0 = 0;
        if (this.a != null) {
            $$0 += this.a.a();
        }
        if (this.e != null) {
            $$0 += this.e.a();
        }
        return $$0;
    }

    @Override
    public void a(jw $$0, boolean $$1) {
        if (this.a != null) {
            this.a.a($$0, $$1);
        }
        if (this.e != null) {
            this.e.a($$0, $$1);
        }
    }

    @Override
    public void a(dvu $$0, boolean $$1) {
        if (this.a != null) {
            this.a.a($$0, $$1);
        }
        if (this.e != null) {
            this.e.a($$0, $$1);
        }
    }

    @Override
    public void b(dvu $$0) {
        if (this.a != null) {
            this.a.b($$0);
        }
        if (this.e != null) {
            this.e.b($$0);
        }
    }

    public fko a(dww $$0) {
        if ($$0 == dww.b) {
            if (this.a == null) {
                return fko.a.a;
            }
            return this.a;
        }
        if (this.e == null) {
            return fko.a.a;
        }
        return this.e;
    }

    public String a(dww $$0, jw $$1) {
        if ($$0 == dww.b) {
            if (this.a != null) {
                return this.a.b($$1.s());
            }
        } else if (this.e != null) {
            return this.e.b($$1.s());
        }
        return "n/a";
    }

    public fkp.b b(dww $$0, jw $$1) {
        if ($$0 == dww.b) {
            if (this.a != null) {
                return this.a.c($$1.s());
            }
        } else if (this.e != null) {
            return this.e.c($$1.s());
        }
        return fkp.b.a;
    }

    public void a(dww $$0, jw $$1, @Nullable eql $$2) {
        if ($$0 == dww.b) {
            if (this.a != null) {
                this.a.a($$1.s(), $$2);
            }
        } else if (this.e != null) {
            this.e.a($$1.s(), $$2);
        }
    }

    public void b(dvu $$0, boolean $$1) {
        if (this.a != null) {
            this.a.b($$0, $$1);
        }
        if (this.e != null) {
            this.e.b($$0, $$1);
        }
    }

    public int a(is $$0, int $$1) {
        int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
        int $$3 = this.a == null ? 0 : this.a.b($$0);
        return Math.max($$3, $$2);
    }

    public boolean a(long $$0) {
        return this.a == null || ((fkp)this.a.f).k($$0) && (this.e == null || ((fkp)this.e.f).k($$0));
    }

    public int c() {
        return this.d.ax() + 2;
    }

    public int d() {
        return this.d.ay() - 1;
    }

    public int e() {
        return this.d() + this.c();
    }
}

