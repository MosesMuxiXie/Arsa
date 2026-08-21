/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.Optional;

public class fhm
extends ffo {
    public static final MapCodec<fhm> d = fhm.a(fhm::new);

    public fhm(ffo.c $$0) {
        super($$0);
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        egm $$1 = egm.a($$0.f());
        is $$2 = this.a($$0, $$1);
        if ($$2.v() < 60) {
            return Optional.empty();
        }
        return Optional.of(new ffo.b($$2, $$3 -> this.a((fgg)$$3, $$2, $$1, $$0)));
    }

    private void a(fgg $$0, is $$1, egm $$2, ffo.a $$3) {
        ArrayList $$4 = Lists.newArrayList();
        fhl.a($$3.e(), $$1, $$2, $$4, $$3.f());
        $$4.forEach($$0::a);
    }

    @Override
    public ffx<?> e() {
        return ffx.c;
    }
}

