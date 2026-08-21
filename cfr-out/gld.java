/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gld
implements gly {
    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        gfj $$4 = gfj.V();
        String $$5 = "GPU: " + ($$4.z() > 100.0 ? String.valueOf(l.m) + "100%" : Math.round($$4.z()) + "%");
        $$0.b($$5);
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }
}

