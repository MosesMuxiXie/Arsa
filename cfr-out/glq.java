/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class glq
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        gfo $$5 = $$4.k;
        Object[] objectArray = new Object[3];
        Object object = objectArray[0] = $$5.p().b() != false ? "improved-transparency" : "";
        objectArray[1] = $$5.k().b() == gev.a ? "" : ($$5.k().b() == gev.b ? " fast-clouds" : " fancy-clouds");
        objectArray[2] = $$5.P().b();
        $$0.b(String.format(Locale.ROOT, "%s%s B: %d", objectArray));
        gfv $$6 = $$5.N().b();
        if ($$6 == gfv.c) {
            $$0.b(String.format(Locale.ROOT, "Filtering: %s %dx", $$6.a().getString(), $$5.M()));
        } else {
            $$0.b(String.format(Locale.ROOT, "Filtering: %s", $$6.a().getString()));
        }
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }
}

