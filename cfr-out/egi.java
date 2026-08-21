/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class egi
extends ebw {
    private static final Map<iz.a, fug> b = fud.b(dzq.a(4.0, 4.0, 16.0));

    protected egi(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends egi> a();

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b.get(((iz)$$0.c(a)).o());
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(a, $$1.a((iz)$$0.c(a)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)$$0.b(a, $$1.b((iz)$$0.c(a)));
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

