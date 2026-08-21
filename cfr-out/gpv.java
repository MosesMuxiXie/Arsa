/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class gpv
extends gpz<gqo> {
    public gpv(hon.a $$0) {
        super($$0);
    }

    @Override
    public Class<gqo> a() {
        return gqo.class;
    }

    @Override
    protected void a(gqo $$0, fzm $$1) {
        double $$2 = 0.0;
        $$1.a(0.0f, -5.0f, 0.0f);
        Matrix4f $$3 = $$1.c().a();
        for (bzo $$4 : $$0.b()) {
            int $$5 = bgj.c($$4.a / 4.0) + 1;
            fzp $$6 = this.a.a(ijt.x());
            int $$7 = bel.g($$4.a());
            int $$8 = bel.a($$7, -8355712);
            $$6.a((Matrix4fc)$$3, 0.0f, 0.0f, 0.0f).a($$7);
            for (int $$9 = $$5; $$9 >= 0; --$$9) {
                float $$10 = (float)(($$2 + $$4.a * (double)$$9 / (double)$$5) * 6.2831854820251465 / 100.0);
                float $$11 = bgj.a((double)$$10) * 105.0f;
                float $$12 = bgj.b((double)$$10) * 105.0f * 0.5f;
                $$6.a((Matrix4fc)$$3, $$11, $$12, 0.0f).a($$7);
            }
            $$6 = this.a.a(ijt.w());
            for (int $$13 = $$5; $$13 > 0; --$$13) {
                float $$14 = (float)(($$2 + $$4.a * (double)$$13 / (double)$$5) * 6.2831854820251465 / 100.0);
                float $$15 = bgj.a((double)$$14) * 105.0f;
                float $$16 = bgj.b((double)$$14) * 105.0f * 0.5f;
                float $$17 = (float)(($$2 + $$4.a * (double)($$13 - 1) / (double)$$5) * 6.2831854820251465 / 100.0);
                float $$18 = bgj.a((double)$$17) * 105.0f;
                float $$19 = bgj.b((double)$$17) * 105.0f * 0.5f;
                if (($$16 + $$19) / 2.0f < 0.0f) continue;
                $$6.a((Matrix4fc)$$3, $$15, $$16, 0.0f).a($$8);
                $$6.a((Matrix4fc)$$3, $$15, $$16 + 10.0f, 0.0f).a($$8);
                $$6.a((Matrix4fc)$$3, $$18, $$19 + 10.0f, 0.0f).a($$8);
                $$6.a((Matrix4fc)$$3, $$18, $$19, 0.0f).a($$8);
            }
            $$2 += $$4.a;
        }
    }

    @Override
    protected float a(int $$0, int $$1) {
        return (float)$$0 / 2.0f;
    }

    @Override
    protected String b() {
        return "profiler chart";
    }
}

