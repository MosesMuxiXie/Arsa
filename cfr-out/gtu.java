/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gtu
extends gti<dhr> {
    private static final amo D = amo.b("container/cartography_table/error");
    private static final amo E = amo.b("container/cartography_table/scaled_map");
    private static final amo F = amo.b("container/cartography_table/duplicated_map");
    private static final amo G = amo.b("container/cartography_table/map");
    private static final amo H = amo.b("container/cartography_table/locked");
    private static final amo I = amo.b("textures/gui/container/cartography_table.png");
    private final ikr J = new ikr();

    public gtu(dhr $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        this.t -= 2;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        fmw $$14;
        int $$4 = this.z;
        int $$5 = this.A;
        $$0.a(hpa.at, I, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        dlt $$6 = ((dhr)this.w).b(1).g();
        boolean $$7 = $$6.a(dlx.wv);
        boolean $$8 = $$6.a(dlx.sA);
        boolean $$9 = $$6.a(dlx.gE);
        dlt $$10 = ((dhr)this.w).b(0).g();
        fmu $$11 = $$10.a(ki.T);
        boolean $$12 = false;
        if ($$11 != null) {
            fmw $$13 = dmg.a($$11, this.n.r);
            if ($$13 != null) {
                if ($$13.i) {
                    $$12 = true;
                    if ($$8 || $$9) {
                        $$0.a(hpa.at, D, $$4 + 35, $$5 + 31, 28, 21);
                    }
                }
                if ($$8 && $$13.g >= 4) {
                    $$12 = true;
                    $$0.a(hpa.at, D, $$4 + 35, $$5 + 31, 28, 21);
                }
            }
        } else {
            $$14 = null;
        }
        this.a($$0, $$11, $$14, $$7, $$8, $$9, $$12);
    }

    private void a(gir $$0, @Nullable fmu $$1, @Nullable fmw $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
        int $$7 = this.z;
        int $$8 = this.A;
        if ($$4 && !$$6) {
            $$0.a(hpa.at, E, $$7 + 67, $$8 + 13, 66, 66);
            this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226f);
        } else if ($$3) {
            $$0.a(hpa.at, F, $$7 + 67 + 16, $$8 + 13, 50, 66);
            this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34f);
            $$0.c();
            $$0.a(hpa.at, F, $$7 + 67, $$8 + 13 + 16, 50, 66);
            this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34f);
        } else if ($$5) {
            $$0.a(hpa.at, G, $$7 + 67, $$8 + 13, 66, 66);
            this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45f);
            $$0.a(hpa.at, H, $$7 + 118, $$8 + 60, 10, 14);
        } else {
            $$0.a(hpa.at, G, $$7 + 67, $$8 + 13, 66, 66);
            this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45f);
        }
    }

    private void a(gir $$0, @Nullable fmu $$1, @Nullable fmw $$2, int $$3, int $$4, float $$5) {
        if ($$1 != null && $$2 != null) {
            $$0.e().pushMatrix();
            $$0.e().translate((float)$$3, (float)$$4);
            $$0.e().scale($$5, $$5);
            this.n.aB().a($$1, $$2, this.J);
            $$0.a(this.J);
            $$0.e().popMatrix();
        }
    }
}

