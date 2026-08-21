/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glu
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        String $$18;
        String $$13;
        gfj $$4 = gfj.V();
        iqa $$5 = $$4.aa();
        hig $$6 = $$4.R();
        if ($$6 == null || $$1 == null) {
            return;
        }
        wu $$7 = $$6.m();
        float $$8 = $$7.p();
        float $$9 = $$7.o();
        cdo $$10 = $$1.y();
        if ($$10.j()) {
            String $$11 = " (frozen - stepping)";
        } else if ($$10.l()) {
            String $$12 = " (frozen)";
        } else {
            $$13 = "";
        }
        if ($$5 != null) {
            ann $$14 = $$5.aR();
            boolean $$15 = $$14.a();
            if ($$15) {
                $$13 = " (sprinting)";
            }
            String $$16 = $$15 ? "-" : String.format(Locale.ROOT, "%.1f", Float.valueOf($$10.g()));
            String $$17 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", Float.valueOf($$5.aQ()), $$16, $$13, Float.valueOf($$8), Float.valueOf($$9));
        } else {
            $$18 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$6.h(), $$13, Float.valueOf($$8), Float.valueOf($$9));
        }
        $$0.b($$18);
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }
}

