/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebd
extends ecr {
    public static final MapCodec<ebd> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.e.q().fieldOf("concrete").forGetter($$0 -> $$0.b), ebd.x()).apply((Applicative)$$02, ebd::new));
    private final dzq b;

    public MapCodec<ebd> a() {
        return a;
    }

    public ebd(dzq $$0, eog.d $$1) {
        super($$1);
        this.b = $$0;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, eoh $$3, czk $$4) {
        if (ebd.a((dvt)$$0, $$1, $$3)) {
            $$0.a($$1, this.b.m(), 3);
        }
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$3;
        is $$2;
        dwo $$1 = $$0.q();
        if (ebd.a((dvt)$$1, $$2 = $$0.a(), $$3 = $$1.a_($$2))) {
            return this.b.m();
        }
        return super.a($$0);
    }

    private static boolean a(dvt $$0, is $$1, eoh $$2) {
        return ebd.p($$2) || ebd.a($$0, $$1);
    }

    private static boolean a(dvt $$0, is $$1) {
        boolean $$2 = false;
        is.a $$3 = $$1.k();
        for (iz $$4 : iz.values()) {
            eoh $$5 = $$0.a_($$3);
            if ($$4 == iz.a && !ebd.p($$5)) continue;
            $$3.a((jy)$$1, $$4);
            $$5 = $$0.a_($$3);
            if (!ebd.p($$5) || $$5.c($$0, $$1, $$4.g())) continue;
            $$2 = true;
            break;
        }
        return $$2;
    }

    private static boolean p(eoh $$0) {
        return $$0.y().a(bdv.a);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (ebd.a($$1, $$3)) {
            return this.b.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public int b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a((dvt)$$1, (is)$$2).ak;
    }
}

