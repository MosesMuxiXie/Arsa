/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eeu
extends dzq
implements ehg {
    public static final MapCodec<eeu> a = eeu.b(eeu::new);
    public static final eoy b = eox.I;

    public MapCodec<eeu> a() {
        return a;
    }

    protected eeu(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, false));
    }

    @Override
    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        return $$1.a(dzs.ag) && $$2.o() == iz.a.b;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == flc.c;
        return (eoh)super.a($$0).b(b, $$2);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

