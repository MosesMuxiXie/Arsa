/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gkw
implements gly {
    private static final amo a = amo.b("biome");

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        if ($$5 == null || $$4.r == null) {
            return;
        }
        is $$6 = $$5.dK();
        if ($$4.r.d($$6.v())) {
            if (w.aO && $$1 instanceof axf) {
                $$0.a(a, List.of("Biome: " + gkw.a($$4.r.z($$6)), "Server Biome: " + gkw.a($$1.z($$6))));
            } else {
                $$0.b("Biome: " + gkw.a($$4.r.z($$6)));
            }
        }
    }

    private static String a(jd<dxo> $$02) {
        return (String)$$02.d().map($$0 -> $$0.a().toString(), $$0 -> "[unregistered " + String.valueOf($$0) + "]");
    }
}

