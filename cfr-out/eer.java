/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eer
extends dzq {
    public static final MapCodec<eer> a = eer.b(eer::new);
    private static final int b = 20;

    public MapCodec<eer> a() {
        return a;
    }

    public eer(eog.d $$0) {
        super($$0);
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, cgk $$3) {
        if (!$$3.cv() && $$3 instanceof chl) {
            $$3.a($$0.as().f(), 1.0f);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        dzx.b($$1, $$2.d(), $$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && $$6.a(dzs.J)) {
            $$2.a($$3, this, 20);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        $$1.a($$2, (dzq)this, 20);
    }
}

