/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dmw
extends dne {
    public dmw(dzq $$0, dzq $$1, dlp.a $$2) {
        super($$0, $$1, iz.a, $$2);
    }

    public dmw(dlp.a $$0, dzq $$1, dzq $$2, iz $$3) {
        super($$1, $$2, $$3, $$0);
    }

    @Override
    protected boolean a(is $$0, dwo $$1, @Nullable ddm $$2, dlt $$3, eoh $$4) {
        Object object;
        boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
        if (!$$1.B_() && !$$5 && $$2 != null && (object = $$1.c_($$0)) instanceof ems) {
            ems $$6 = (ems)object;
            object = $$1.a_($$0).b();
            if (object instanceof ehf) {
                ehf $$7 = (ehf)object;
                $$7.a($$2, $$6, true);
            }
        }
        return $$5;
    }
}

