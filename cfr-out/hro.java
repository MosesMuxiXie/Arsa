/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hro
implements hri<eli, hsp> {
    private static final float a = 0.375f;
    private final ihk b;

    public hro(hrj.a $$0) {
        this.b = $$0.c();
    }

    public hsp a() {
        return new hsp();
    }

    @Override
    public void a(eli $$0, hsp $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.b = $$0.o().c(eag.e);
        int $$5 = (int)$$0.aD_().a();
        $$1.a = new ArrayList<ihm>();
        for (int $$6 = 0; $$6 < $$0.c().size(); ++$$6) {
            ihm $$7 = new ihm();
            this.b.a($$7, $$0.c().get($$6), dlr.i, $$0.j(), null, $$5 + $$6);
            $$1.a.add($$7);
        }
    }

    @Override
    public void a(hsp $$0, fzm $$1, hpo $$2, ikp $$3) {
        iz $$4 = $$0.b;
        List<ihm> $$5 = $$0.a;
        for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
            ihm $$7 = $$5.get($$6);
            if ($$7.e()) continue;
            $$1.a();
            $$1.a(0.5f, 0.44921875f, 0.5f);
            iz $$8 = iz.b(($$6 + $$4.e()) % 4);
            float $$9 = -$$8.p();
            $$1.a((Quaternionfc)a.d.rotationDegrees($$9));
            $$1.a((Quaternionfc)a.b.rotationDegrees(90.0f));
            $$1.a(-0.3125f, -0.3125f, 0.0f);
            $$1.b(0.375f, 0.375f, 0.375f);
            $$7.a($$1, $$2, $$0.i, ilg.d, 0);
            $$1.b();
        }
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

