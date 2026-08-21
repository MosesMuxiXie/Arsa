/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.HashCommon;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hrx
implements hri<emq, hsz> {
    private static final float a = 0.25f;
    private static final float b = -0.25f;
    private final ihk c;

    public hrx(hrj.a $$0) {
        this.c = $$0.c();
    }

    public hsz a() {
        return new hsz();
    }

    @Override
    public void a(emq $$0, hsz $$1, float $$2, ftm $$3, @Nullable igi.a $$4) {
        hri.super.a($$0, $$1, $$2, $$3, $$4);
        $$1.b = $$0.l();
        jm<dlt> $$5 = $$0.h();
        int $$6 = HashCommon.long2int((long)$$0.aD_().a());
        for (int $$7 = 0; $$7 < $$5.size(); ++$$7) {
            dlt $$8 = $$5.get($$7);
            if ($$8.f()) continue;
            ihm $$9 = new ihm();
            this.c.a($$9, $$8, dlr.j, $$0.ao(), $$0, $$6 + $$7);
            $$1.a[$$7] = $$9;
        }
    }

    @Override
    public void a(hsz $$0, fzm $$1, hpo $$2, ikp $$3) {
        iz $$4 = $$0.g.c(ehb.c);
        float $$5 = $$4.o().d() ? -$$4.p() : 180.0f;
        for (int $$6 = 0; $$6 < $$0.a.length; ++$$6) {
            ihm $$7 = $$0.a[$$6];
            if ($$7 == null) continue;
            this.a($$0, $$7, $$1, $$2, $$6, $$5);
        }
    }

    private void a(hsz $$0, ihm $$1, fzm $$2, hpo $$3, int $$4, float $$5) {
        float $$6 = (float)($$4 - 1) * 0.3125f;
        ftm $$7 = new ftm($$6, $$0.b ? -0.25 : 0.0, -0.25);
        $$2.a();
        $$2.a(0.5f, 0.5f, 0.5f);
        $$2.a((Quaternionfc)a.d.rotationDegrees($$5));
        $$2.a($$7);
        $$2.b(0.25f, 0.25f, 0.25f);
        fth $$8 = $$1.g();
        double $$9 = -$$8.b;
        if (!$$0.b) {
            $$9 += -($$8.e - $$8.b) / 2.0;
        }
        $$2.a(0.0, $$9, 0.0);
        $$1.a($$2, $$3, $$0.i, ilg.d, 0);
        $$2.b();
    }

    @Override
    public /* synthetic */ hsm e() {
        return this.a();
    }
}

