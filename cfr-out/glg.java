/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glg
implements gly {
    /*
     * WARNING - void declaration
     */
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        void $$7;
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        if ($$5 == null || $$3 == null || !($$1 instanceof axf)) {
            return;
        }
        axf $$6 = (axf)$$1;
        is $$8 = $$5.dK();
        if ($$7.d($$8.v())) {
            float $$9 = $$7.d($$8);
            long $$10 = $$3.w();
            cda $$11 = new cda($$7.av(), $$7.al(), $$10, $$9);
            $$0.b(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", Float.valueOf($$11.b()), Float.valueOf($$11.d()), $$7.e()));
        }
    }
}

