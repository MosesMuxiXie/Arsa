/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class igv
extends igu {
    private static final int a = -6743808;

    @Override
    public int a(hif $$0, ger $$1, int $$2, float $$3) {
        return -6743808;
    }

    @Override
    public void a(igp $$0, ger $$1, hif $$2, float $$3, gez $$4) {
        if ($$1.h().au()) {
            $$0.a = -8.0f;
            $$0.c = $$3 * 0.5f;
        } else {
            chl $$5;
            cgk cgk2 = $$1.h();
            if (cgk2 instanceof chl && ($$5 = (chl)cgk2).d(cfo.l)) {
                $$0.a = 0.0f;
                $$0.c = 5.0f;
            } else {
                $$0.a = 0.25f;
                $$0.c = 1.0f;
            }
        }
        $$0.e = $$0.c;
        $$0.f = $$0.c;
    }

    @Override
    public boolean a(@Nullable fld $$0, cgk $$1) {
        return $$0 == fld.a;
    }
}

