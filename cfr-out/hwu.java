/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hwu
extends hwp<cgz, idj> {
    private static final amo a = amo.b("textures/entity/experience_orb.png");
    private static final ijs f = ijt.i(a);

    public hwu(hwq.a $$0) {
        super($$0);
        this.d = 0.15f;
        this.e = 0.75f;
    }

    @Override
    protected int a(cgz $$0, is $$1) {
        return bgj.a(super.a($$0, $$1) + 7, 0, 15);
    }

    @Override
    public void a(idj $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        int $$4 = $$0.a;
        float $$5 = (float)($$4 % 4 * 16 + 0) / 64.0f;
        float $$6 = (float)($$4 % 4 * 16 + 16) / 64.0f;
        float $$72 = (float)($$4 / 4 * 16 + 0) / 64.0f;
        float $$82 = (float)($$4 / 4 * 16 + 16) / 64.0f;
        float $$9 = 1.0f;
        float $$10 = 0.5f;
        float $$11 = 0.25f;
        float $$12 = 255.0f;
        float $$13 = $$0.L / 2.0f;
        int $$14 = (int)((bgj.a((double)($$13 + 0.0f)) + 1.0f) * 0.5f * 255.0f);
        int $$15 = 255;
        int $$16 = (int)((bgj.a((double)($$13 + 4.1887903f)) + 1.0f) * 0.1f * 255.0f);
        $$1.a(0.0f, 0.1f, 0.0f);
        $$1.a((Quaternionfc)$$3.e);
        float $$17 = 0.3f;
        $$1.b(0.3f, 0.3f, 0.3f);
        $$2.a($$1, f, ($$7, $$8) -> {
            hwu.a($$8, $$7, -0.5f, -0.25f, $$14, 255, $$16, $$5, $$82, $$4.T);
            hwu.a($$8, $$7, 0.5f, -0.25f, $$14, 255, $$16, $$6, $$82, $$4.T);
            hwu.a($$8, $$7, 0.5f, 0.75f, $$14, 255, $$16, $$6, $$72, $$4.T);
            hwu.a($$8, $$7, -0.5f, 0.75f, $$14, 255, $$16, $$5, $$72, $$4.T);
        });
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    private static void a(fzp $$0, fzm.a $$1, float $$2, float $$3, int $$4, int $$5, int $$6, float $$7, float $$8, int $$9) {
        $$0.a($$1, $$2, $$3, 0.0f).a($$4, $$5, $$6, 128).a($$7, $$8).b(ilg.d).c($$9).b($$1, 0.0f, 1.0f, 0.0f);
    }

    public idj a() {
        return new idj();
    }

    @Override
    public void a(cgz $$0, idj $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.f();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

