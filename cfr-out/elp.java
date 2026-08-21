/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.stream.Collectors;

public abstract class elp {
    private static final int a = 5;
    private int b;
    private double c;

    protected abstract void a(dwo var1, is var2, eoh var3);

    protected abstract void b(dwo var1, is var2, eoh var3);

    protected abstract void a(dwo var1, is var2, eoh var3, int var4, int var5);

    public abstract boolean a(ddm var1);

    public void a(chl $$0, dwo $$1, is $$2, eoh $$3, double $$4) {
        int $$5;
        if (($$5 = this.b++) == 0) {
            this.a($$1, $$2, $$3);
            $$1.a((cgk)$$0, etk.k, $$2);
            elp.d($$1, $$2, $$3);
        }
        this.a($$1, $$2, $$3, $$5, this.b);
        this.c = Math.max($$4, this.c);
    }

    public void a(chl $$0, dwo $$1, is $$2, eoh $$3) {
        int $$4 = this.b--;
        if (this.b == 0) {
            this.b($$1, $$2, $$3);
            $$1.a((cgk)$$0, etk.j, $$2);
            this.c = 0.0;
        }
        this.a($$1, $$2, $$3, $$4, this.b);
    }

    public List<cgd> a(dwo $$02, is $$12) {
        double $$2 = this.c + 4.0;
        fth $$3 = new fth($$12).g($$2);
        return $$02.a((cgk)null, $$3, (? super cgk $$1) -> this.a((cgk)$$1, $$12)).stream().map($$0 -> (cgd)((Object)$$0)).collect(Collectors.toList());
    }

    private boolean a(cgk $$0, is $$1) {
        cgd $$2;
        if ($$0 instanceof cgd && !($$2 = (cgd)((Object)$$0)).k_().au()) {
            return $$2.a(this, $$1);
        }
        return false;
    }

    public void c(dwo $$0, is $$1, eoh $$2) {
        List<cgd> $$3 = this.a($$0, $$1);
        this.c = 0.0;
        for (cgd $$4 : $$3) {
            this.c = Math.max($$4.ar(), this.c);
        }
        int $$6 = this.b;
        int $$5 = $$3.size();
        if ($$6 != $$5) {
            boolean $$8;
            boolean $$7 = $$5 != 0;
            boolean bl2 = $$8 = $$6 != 0;
            if ($$7 && !$$8) {
                this.a($$0, $$1, $$2);
                $$0.a(null, etk.k, $$1);
            } else if (!$$7) {
                this.b($$0, $$1, $$2);
                $$0.a(null, etk.j, $$1);
            }
            this.b = $$5;
        }
        this.a($$0, $$1, $$2, $$6, $$5);
        if ($$5 > 0) {
            elp.d($$0, $$1, $$2);
        }
    }

    public int a() {
        return this.b;
    }

    private static void d(dwo $$0, is $$1, eoh $$2) {
        $$0.a($$1, $$2.b(), 5);
    }
}

