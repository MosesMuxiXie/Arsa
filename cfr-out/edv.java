/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class edv
extends edm {
    public static final MapCodec<edv> e = edv.b(edv::new);

    public MapCodec<? extends edv> a() {
        return e;
    }

    public edv(eog.d $$0) {
        super($$0);
    }

    public static eoh b() {
        return dzs.J.m();
    }

    @Override
    public void a(dwo $$0, ddm $$1, is $$2, eoh $$3, @Nullable elb $$4, dlt $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if (!dsq.a($$5, bds.s)) {
            if ($$0.c().a(ceg.B, $$2).booleanValue()) {
                $$0.a($$2, false);
                return;
            }
            eoh $$6 = $$0.a_($$2.e());
            if ($$6.d() || $$6.n()) {
                $$0.c($$2, edv.b());
            }
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.a(dww.b, $$2) > 11 - $$0.g()) {
            this.c($$0, $$1, $$2);
        }
    }

    protected void c(eoh $$0, dwo $$1, is $$2) {
        if ($$1.c().a(ceg.B, $$2).booleanValue()) {
            $$1.a($$2, false);
            return;
        }
        $$1.c($$2, edv.b());
        $$1.b($$2, edv.b().b(), null);
    }
}

