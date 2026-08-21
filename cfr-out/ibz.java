/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class ibz
extends ibj<ifx, hcw> {
    private final hcw a;
    private final hcw b;
    private final iau c;
    private static final Map<cgg.a, amo> d = Map.of(cgg.a.b, amo.b("textures/entity/wolf/wolf_armor_crackiness_low.png"), cgg.a.c, amo.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"), cgg.a.d, amo.b("textures/entity/wolf/wolf_armor_crackiness_high.png"));

    public ibz(hyq<ifx, hcw> $$0, hdc $$1, iau $$2) {
        super($$0);
        this.a = new hcw($$1.a(hdf.er));
        this.b = new hcw($$1.a(hdf.et));
        this.c = $$2;
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ifx $$3, float $$4, float $$5) {
        dlt $$6 = $$3.i;
        dun $$7 = $$6.a(ki.H);
        if ($$7 == null || $$7.d().isEmpty()) {
            return;
        }
        hcw $$8 = $$3.aE ? this.b : this.a;
        this.c.a(inr.d.d, $$7.d().get(), $$8, $$3, $$6, $$0, $$1, $$2, $$3.U);
        this.a($$0, $$1, $$2, $$6, $$8, $$3);
    }

    private void a(fzm $$0, hpo $$1, int $$2, dlt $$3, gzp<ifx> $$4, ifx $$5) {
        cgg.a $$6 = cgg.b.a($$3);
        if ($$6 == cgg.a.a) {
            return;
        }
        amo $$7 = d.get((Object)$$6);
        $$1.a($$4, $$5, $$0, ijt.c($$7), $$2, ilg.d, $$5.U, null);
    }
}

