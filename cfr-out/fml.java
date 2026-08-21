/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class fml {
    protected final egb a;

    protected fml(egb $$0) {
        this.a = $$0;
    }

    public abstract void a(dwo var1, is var2, eoh var3, @Nullable fmj var4, boolean var5);

    protected int a(dwo $$0, is $$1) {
        return this.a.a($$0, $$1);
    }

    protected int a(is $$0, eoh $$1) {
        return $$1.a(this.a) ? $$1.c(egb.f) : 0;
    }

    protected int b(dwo $$0, is $$1) {
        int $$2 = 0;
        for (iz $$3 : iz.c.a) {
            is $$4 = $$1.a($$3);
            eoh $$5 = $$0.a_($$4);
            $$2 = Math.max($$2, this.a($$4, $$5));
            is $$6 = $$1.d();
            if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
                is $$7 = $$4.d();
                $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
                continue;
            }
            if ($$5.d($$0, $$4)) continue;
            is $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
        }
        return Math.max(0, $$2 - 1);
    }
}

