/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glc
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        int $$5 = $$4.aS().a();
        gfo $$6 = $$4.k;
        $$0.a(String.format(Locale.ROOT, "%d fps T: %s%s", $$4.s(), $$5 == 260 ? "inf" : Integer.valueOf($$5), $$6.aa().b() != false ? " vsync" : ""));
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }
}

