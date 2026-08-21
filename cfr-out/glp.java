/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glp
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        cgk $$5 = $$4.au();
        if ($$5 == null) {
            return;
        }
        is $$6 = $$4.au().dK();
        $$0.a(gln.a, String.format(Locale.ROOT, "Section-relative: %02d %02d %02d", $$6.u() & 0xF, $$6.v() & 0xF, $$6.w() & 0xF));
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }
}

