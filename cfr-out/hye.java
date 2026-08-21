/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.joml.Quaternionfc
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.joml.Quaternionfc;

public class hye
extends hvh<cww, iep, hcc> {
    private static final Map<cww.a, amo> a = Maps.newEnumMap(Map.of(cww.a.a, amo.b("textures/entity/panda/panda.png"), cww.a.b, amo.b("textures/entity/panda/lazy_panda.png"), cww.a.c, amo.b("textures/entity/panda/worried_panda.png"), cww.a.d, amo.b("textures/entity/panda/playful_panda.png"), cww.a.e, amo.b("textures/entity/panda/brown_panda.png"), cww.a.f, amo.b("textures/entity/panda/weak_panda.png"), cww.a.g, amo.b("textures/entity/panda/aggressive_panda.png")));

    public hye(hwq.a $$0) {
        super($$0, new hcc($$0.a(hdf.cl)), new hcc($$0.a(hdf.cm)), 0.9f);
        this.a(new ibf(this));
    }

    public amo a(iep $$0) {
        return a.getOrDefault($$0.a, a.get(cww.a.a));
    }

    public iep b() {
        return new iep();
    }

    @Override
    public void a(cww $$0, iep $$1, float $$2) {
        super.a($$0, $$1, $$2);
        idw.a($$0, $$1, this.g);
        $$1.a = $$0.hf();
        $$1.b = $$0.p() > 0;
        $$1.c = $$0.gP();
        $$1.d = $$0.gT();
        $$1.e = $$0.gS();
        $$1.f = $$0.hl();
        $$1.g = $$0.gQ();
        $$1.h = $$0.L($$2);
        $$1.j = $$0.M($$2);
        $$1.k = $$0.e_() ? 0.0f : $$0.N($$2);
        $$1.l = $$0.cw > 0 ? (float)$$0.cw + $$2 : 0.0f;
    }

    @Override
    protected void a(iep $$0, fzm $$1, float $$2, float $$3) {
        float $$26;
        float $$24;
        super.a($$0, $$1, $$2, $$3);
        if ($$0.l > 0.0f) {
            float $$8;
            float $$4 = bgj.g($$0.l);
            int $$5 = bgj.b($$0.l);
            int $$6 = $$5 + 1;
            float $$7 = 7.0f;
            float f2 = $$8 = $$0.aE ? 0.3f : 0.8f;
            if ((float)$$5 < 8.0f) {
                float $$9 = 90.0f * (float)$$5 / 7.0f;
                float $$10 = 90.0f * (float)$$6 / 7.0f;
                float $$11 = this.a($$9, $$10, $$6, $$4, 8.0f);
                $$1.a(0.0f, ($$8 + 0.2f) * ($$11 / 90.0f), 0.0f);
                $$1.a((Quaternionfc)a.b.rotationDegrees(-$$11));
            } else if ((float)$$5 < 16.0f) {
                float $$12 = ((float)$$5 - 8.0f) / 7.0f;
                float $$13 = 90.0f + 90.0f * $$12;
                float $$14 = 90.0f + 90.0f * ((float)$$6 - 8.0f) / 7.0f;
                float $$15 = this.a($$13, $$14, $$6, $$4, 16.0f);
                $$1.a(0.0f, $$8 + 0.2f + ($$8 - 0.2f) * ($$15 - 90.0f) / 90.0f, 0.0f);
                $$1.a((Quaternionfc)a.b.rotationDegrees(-$$15));
            } else if ((float)$$5 < 24.0f) {
                float $$16 = ((float)$$5 - 16.0f) / 7.0f;
                float $$17 = 180.0f + 90.0f * $$16;
                float $$18 = 180.0f + 90.0f * ((float)$$6 - 16.0f) / 7.0f;
                float $$19 = this.a($$17, $$18, $$6, $$4, 24.0f);
                $$1.a(0.0f, $$8 + $$8 * (270.0f - $$19) / 90.0f, 0.0f);
                $$1.a((Quaternionfc)a.b.rotationDegrees(-$$19));
            } else if ($$5 < 32) {
                float $$20 = ((float)$$5 - 24.0f) / 7.0f;
                float $$21 = 270.0f + 90.0f * $$20;
                float $$22 = 270.0f + 90.0f * ((float)$$6 - 24.0f) / 7.0f;
                float $$23 = this.a($$21, $$22, $$6, $$4, 32.0f);
                $$1.a(0.0f, $$8 * ((360.0f - $$23) / 90.0f), 0.0f);
                $$1.a((Quaternionfc)a.b.rotationDegrees(-$$23));
            }
        }
        if (($$24 = $$0.h) > 0.0f) {
            $$1.a(0.0f, 0.8f * $$24, 0.0f);
            $$1.a((Quaternionfc)a.b.rotationDegrees(bgj.h($$24, $$0.av, $$0.av + 90.0f)));
            $$1.a(0.0f, -1.0f * $$24, 0.0f);
            if ($$0.f) {
                float $$25 = (float)(Math.cos($$0.L * 1.25f) * Math.PI * (double)0.05f);
                $$1.a((Quaternionfc)a.d.rotationDegrees($$25));
                if ($$0.aE) {
                    $$1.a(0.0f, 0.8f, 0.55f);
                }
            }
        }
        if (($$26 = $$0.j) > 0.0f) {
            float $$27 = $$0.aE ? 0.5f : 1.3f;
            $$1.a(0.0f, $$27 * $$26, 0.0f);
            $$1.a((Quaternionfc)a.b.rotationDegrees(bgj.h($$26, $$0.av, $$0.av + 180.0f)));
        }
    }

    private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
        if ((float)$$2 < $$4) {
            return bgj.h($$3, $$0, $$1);
        }
        return $$0;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iep)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

