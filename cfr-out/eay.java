/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;

public class eay
extends edt
implements dzt {
    public static final MapCodec<eay> a = eay.b(eay::new);
    public static final int b = 2;
    public static final eph c = eox.av;
    private static final List<Map<iz, fug>> d = IntStream.rangeClosed(0, 2).mapToObj($$0 -> fud.c(dzq.b(4 + $$0 * 2, 7 - $$0 * 2, 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d())).toList();

    public MapCodec<eay> a() {
        return a;
    }

    public eay(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(c, 0));
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(c) < 2;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4;
        if ($$1.y.a(5) == 0 && ($$4 = $$0.c(c).intValue()) < 2) {
            $$1.a($$2, (eoh)$$0.b(c, $$4 + 1), 2);
        }
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.a((iz)$$0.c(f)));
        return $$3.a(bdp.y);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d.get($$0.c(c)).get($$0.c(f));
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = this.m();
        dwo $$2 = $$0.q();
        is $$3 = $$0.a();
        for (iz $$4 : $$0.f()) {
            if (!$$4.o().d() || !($$1 = (eoh)$$1.b(f, $$4)).a((dwr)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == $$0.c(f) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$2.c(c) < 2;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        $$0.a($$2, (eoh)$$3.b(c, $$3.c(c) + 1), 2);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, c);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

