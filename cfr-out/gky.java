/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class gky
implements gly {
    private static final amo a = amo.b("chunk_generation");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        axf $$6;
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        axf axf2 = $$6 = $$1 instanceof axf ? (axf)$$1 : null;
        if ($$5 == null || $$6 == null) {
            return;
        }
        is $$7 = $$5.dK();
        axc $$8 = $$6.p();
        ArrayList<String> $$9 = new ArrayList<String>();
        eqg $$10 = $$8.g();
        eve $$11 = $$8.i();
        $$10.a($$9, $$11, $$7);
        dxx.f $$12 = $$11.b();
        dxs $$13 = $$10.d();
        $$13.a($$9, $$7, $$12);
        if ($$3 != null && $$3.u()) {
            $$9.add("Blending: Old");
        }
        $$0.a(a, $$9);
    }
}

