/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class glh
implements gly {
    private static final amo a = amo.b("looking_at_block");

    @Override
    public void a(glw $$02, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        dwo $$5;
        cgk $$4 = gfj.V().au();
        dwo dwo2 = $$5 = w.aO ? $$1 : gfj.V().r;
        if ($$4 == null || $$5 == null) {
            return;
        }
        ftk $$6 = $$4.a(20.0, 0.0f, false);
        ArrayList<String> $$7 = new ArrayList<String>();
        if ($$6.d() == ftk.a.b) {
            is $$8 = ((fti)$$6).b();
            eoh $$9 = $$5.a_($$8);
            $$7.add(String.valueOf(l.t) + "Targeted Block: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$7.add(String.valueOf(mi.e.b($$9.b())));
            for (Map.Entry<epk<?>, Comparable<?>> $$10 : $$9.G().entrySet()) {
                $$7.add(this.a($$10));
            }
            $$9.w().map($$0 -> "#" + String.valueOf($$0.b())).forEach($$7::add);
        }
        $$02.a(a, $$7);
    }

    private String a(Map.Entry<epk<?>, Comparable<?>> $$0) {
        epk<?> $$1 = $$0.getKey();
        Comparable<?> $$2 = $$0.getValue();
        Object $$3 = bhs.a($$1, $$2);
        if (Boolean.TRUE.equals($$2)) {
            $$3 = String.valueOf(l.k) + (String)$$3;
        } else if (Boolean.FALSE.equals($$2)) {
            $$3 = String.valueOf(l.m) + (String)$$3;
        }
        return $$1.f() + ": " + (String)$$3;
    }
}

