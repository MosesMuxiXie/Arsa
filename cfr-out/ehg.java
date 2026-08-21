/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface ehg
extends dzy,
eep {
    @Override
    default public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        return $$4 == flc.c;
    }

    @Override
    default public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        if (!$$2.c(eox.I).booleanValue() && $$3.a() == flc.c) {
            if (!$$0.B_()) {
                $$0.a($$1, (eoh)$$2.b(eox.I, true), 3);
                $$0.a($$1, $$3.a(), $$3.a().a($$0));
            }
            return true;
        }
        return false;
    }

    @Override
    default public dlt a(@Nullable chl $$0, dwp $$1, is $$2, eoh $$3) {
        if ($$3.c(eox.I).booleanValue()) {
            $$1.a($$2, (eoh)$$3.b(eox.I, false), 3);
            if (!$$3.a($$1, $$2)) {
                $$1.b($$2, true);
            }
            return new dlt(dlx.sl);
        }
        return dlt.l;
    }

    @Override
    default public Optional<bcz> au_() {
        return flc.c.j();
    }
}

