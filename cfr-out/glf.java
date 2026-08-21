/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class glf
implements gly {
    public static final amo a = amo.b("light");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        if ($$5 == null || $$4.r == null) {
            return;
        }
        is $$6 = $$5.dK();
        int $$7 = $$4.r.j().r().a($$6, 0);
        int $$8 = $$4.r.a(dww.a, $$6);
        int $$9 = $$4.r.a(dww.b, $$6);
        String $$10 = "Client Light: " + $$7 + " (" + $$8 + " sky, " + $$9 + " block)";
        if (w.aO) {
            String $$13;
            if ($$3 != null) {
                fkq $$11 = $$3.I().C_();
                String $$12 = "Server Light: (" + $$11.a(dww.a).b($$6) + " sky, " + $$11.a(dww.b).b($$6) + " block)";
            } else {
                $$13 = "Server Light: (?? sky, ?? block)";
            }
            $$0.a(a, List.of($$10, $$13));
        } else {
            $$0.a(a, $$10);
        }
    }
}

