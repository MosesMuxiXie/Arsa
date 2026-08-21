/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.ToIntFunction;

public interface eao {
    public static final fug u_ = dzq.b(14.0, 0.0, 16.0);
    public static final eoy v_ = eox.b;

    public static cdc a(cgk $$0, eoh $$12, dwo $$22, is $$3) {
        if ($$12.c(v_).booleanValue()) {
            if ($$22 instanceof axf) {
                axf $$4 = (axf)$$22;
                dzq.a($$4, fnv.aL, $$12, $$22.c_($$3), null, $$0, ($$1, $$2) -> dzq.a((dwo)$$1, $$3, $$2));
                float $$5 = bgj.b($$4.y, 0.8f, 1.2f);
                $$4.a(null, $$3, bda.eF, bdb.e, 1.0f, $$5);
                eoh $$6 = (eoh)$$12.b(v_, false);
                $$4.a($$3, $$6, 2);
                $$4.a(etk.c, $$3, etk.a.a($$0, $$6));
            }
            return cdc.a;
        }
        return cdc.e;
    }

    public static boolean j_(eoh $$0) {
        return $$0.b(v_) && $$0.c(v_) != false;
    }

    public static ToIntFunction<eoh> i_(int $$0) {
        return $$1 -> $$1.c(eox.b) != false ? $$0 : 0;
    }
}

