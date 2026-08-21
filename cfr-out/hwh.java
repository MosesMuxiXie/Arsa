/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hwh
extends hwp<den, idf> {
    private static final amo a = amo.b("textures/entity/enderdragon/dragon_fireball.png");
    private static final ijs f = ijt.g(a);

    public hwh(hwq.a $$0) {
        super($$0);
    }

    @Override
    protected int a(den $$0, is $$1) {
        return 15;
    }

    @Override
    public void a(idf $$0, fzm $$12, hpo $$22, ikp $$3) {
        $$12.a();
        $$12.b(2.0f, 2.0f, 2.0f);
        $$12.a((Quaternionfc)$$3.e);
        $$22.a($$12, f, ($$1, $$2) -> {
            hwh.a($$2, $$1, $$0.T, 0.0f, 0, 0, 1);
            hwh.a($$2, $$1, $$0.T, 1.0f, 0, 1, 1);
            hwh.a($$2, $$1, $$0.T, 1.0f, 1, 1, 0);
            hwh.a($$2, $$1, $$0.T, 0.0f, 1, 0, 0);
        });
        $$12.b();
        super.a($$0, $$12, $$22, $$3);
    }

    private static void a(fzp $$0, fzm.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
        $$0.a($$1, $$3 - 0.5f, (float)$$4 - 0.25f, 0.0f).a(-1).a((float)$$5, (float)$$6).b(ilg.d).c($$2).b($$1, 0.0f, 1.0f, 0.0f);
    }

    @Override
    public idf d() {
        return new idf();
    }
}

