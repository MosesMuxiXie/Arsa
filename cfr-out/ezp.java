/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ezp
extends ezm {
    public ezp(Codec<fbb> $$0) {
        super($$0);
    }

    @Override
    protected Set<is> a(dxn $$0, fbb $$1, bgr $$2, is $$3, Predicate<eoh> $$4, int $$5, int $$6) {
        Set<is> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        HashSet<is> $$8 = new HashSet<is>();
        is.a $$9 = new is.a();
        for (is $$10 : $$7) {
            if (ezp.a($$0, $$7, $$10, $$9)) continue;
            $$8.add($$10);
        }
        for (is $$11 : $$8) {
            $$0.a($$11, dzs.J.m(), 2);
        }
        return $$8;
    }

    private static boolean a(dxn $$0, Set<is> $$1, is $$2, is.a $$3) {
        return ezp.a($$0, $$2, $$3, iz.c) || ezp.a($$0, $$2, $$3, iz.f) || ezp.a($$0, $$2, $$3, iz.d) || ezp.a($$0, $$2, $$3, iz.e) || ezp.a($$0, $$2, $$3, iz.a);
    }

    private static boolean a(dxn $$0, is $$1, is.a $$2, iz $$3) {
        $$2.a((jy)$$1, $$3);
        return !$$0.a_($$2).c((dvt)$$0, (is)$$2, $$3.g());
    }

    @Override
    protected boolean a(dxn $$0, fbb $$1, eqg $$2, bgr $$3, is $$4) {
        if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
            eoh $$5 = $$0.a_($$4);
            if ($$5.b(eox.I) && !$$5.c(eox.I).booleanValue()) {
                $$0.a($$4, (eoh)$$5.b(eox.I, true), 2);
            }
            return true;
        }
        return false;
    }
}

