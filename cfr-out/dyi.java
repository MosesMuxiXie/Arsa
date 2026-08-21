/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public abstract class dyi
extends dzq {
    public static final int a = 3;
    public static final eoy b = eox.u;

    protected abstract MapCodec<? extends dyi> a();

    protected dyi(eog.d $$0) {
        super($$0);
    }

    protected abstract Iterable<ftm> b(eoh var1);

    public static boolean c(eoh $$0) {
        return $$0.b(b) && ($$0.a(bdp.U) || $$0.a(bdp.bx)) && $$0.c(b) != false;
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        if (!$$0.B_() && $$3.cp() && this.d($$1)) {
            dyi.a((dwp)$$0, $$1, $$2.b(), true);
        }
    }

    protected boolean d(eoh $$0) {
        return $$0.c(b) == false;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$32) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        this.b($$0).forEach($$3 -> dyi.a($$1, $$3.b($$2.u(), $$2.v(), $$2.w()), $$32));
    }

    private static void a(dwo $$0, ftm $$1, bgr $$2) {
        float $$3 = $$2.i();
        if ($$3 < 0.3f) {
            $$0.a(ly.ai, $$1.g, $$1.h, $$1.i, 0.0, 0.0, 0.0);
            if ($$3 < 0.17f) {
                $$0.a($$1.g + 0.5, $$1.h + 0.5, $$1.i + 0.5, bda.ek, bdb.e, 1.0f + $$2.i(), $$2.i() * 0.7f + 0.3f, false);
            }
        }
        $$0.a(ly.aN, $$1.g, $$1.h, $$1.i, 0.0, 0.0, 0.0);
    }

    public static void a(@Nullable ddm $$0, eoh $$1, dwp $$22, is $$3) {
        dyi.a($$22, $$1, $$3, false);
        if ($$1.b() instanceof dyi) {
            ((dyi)$$1.b()).b($$1).forEach($$2 -> $$22.a(ly.ai, (double)$$3.u() + $$2.a(), (double)$$3.v() + $$2.b(), (double)$$3.w() + $$2.c(), 0.0, 0.1f, 0.0));
        }
        $$22.a(null, $$3, bda.em, bdb.e, 1.0f, 1.0f);
        $$22.a((cgk)$$0, etk.c, $$3);
    }

    private static void a(dwp $$0, eoh $$1, is $$2, boolean $$3) {
        $$0.a($$2, (eoh)$$1.b(b, $$3), 11);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g() && $$0.c(b).booleanValue()) {
            dyi.a(null, $$0, (dwp)$$1, $$2);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }
}

