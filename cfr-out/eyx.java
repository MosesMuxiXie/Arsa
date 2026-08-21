/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class eyx
extends exx<far> {
    public eyx(Codec<far> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<far> $$0) {
        far $$1 = $$0.f();
        dxn $$2 = $$0.b();
        bgr $$3 = $$0.d();
        dzq $$4 = $$1.b.b();
        is $$5 = eyx.a($$2, $$0.e().k().a(iz.a.b, $$2.K_() + 1, $$2.aw()), $$4);
        if ($$5 == null) {
            return false;
        }
        int $$6 = $$1.a().a($$3);
        int $$7 = $$1.a().a($$3);
        int $$8 = $$1.a().a($$3);
        int $$9 = Math.max($$6, Math.max($$7, $$8));
        boolean $$10 = false;
        for (is $$11 : is.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) break;
            eoh $$12 = $$2.a_($$11);
            if (!$$12.a($$4)) continue;
            this.a($$2, $$11, $$1.c);
            $$10 = true;
        }
        return $$10;
    }

    private static @Nullable is a(dwp $$0, is.a $$1, dzq $$2) {
        while ($$1.v() > $$0.K_() + 1) {
            eoh $$3 = $$0.a_($$1);
            if ($$3.a($$2)) {
                return $$1;
            }
            $$1.c(iz.a);
        }
        return null;
    }
}

