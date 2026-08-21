/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class igy
extends igu {
    @Override
    public void a(igp $$0, ger $$1, hif $$2, float $$3, gez $$4) {
        float $$5 = $$4.a(false);
        $$0.a = $$1.k().a(ceg.g, $$5).floatValue();
        $$0.c = $$1.k().a(ceg.h, $$5).floatValue();
        cgk cgk2 = $$1.h();
        if (cgk2 instanceof hnh) {
            hnh $$6 = (hnh)cgk2;
            $$0.c *= Math.max(0.25f, $$6.L());
        }
        $$0.e = $$0.c;
        $$0.f = $$0.c;
    }

    @Override
    public boolean a(@Nullable fld $$0, cgk $$1) {
        return $$0 == fld.b;
    }

    @Override
    public int a(hif $$0, ger $$1, int $$2, float $$3) {
        return $$1.k().a(ceg.f, $$3);
    }
}

