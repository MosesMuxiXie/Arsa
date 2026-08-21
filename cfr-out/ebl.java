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

public class ebl
extends dzb {
    public static final MapCodec<ebl> e = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)ebi.a.forGetter($$0 -> $$0.f), ebl.x()).apply((Applicative)$$02, ebl::new));
    private final dzq f;

    public MapCodec<ebl> a() {
        return e;
    }

    protected ebl(dzq $$0, eog.d $$1) {
        super($$1);
        this.f = $$0;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        this.a($$0, (dvt)$$1, $$1, $$1.y, $$2);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!ebl.d($$0, $$1, $$2)) {
            $$1.a($$2, (eoh)((eoh)this.f.m().b(b, false)).b(d, (iz)$$0.c(d)), 2);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        this.a($$0, (dvt)$$1, $$2, $$7, $$3);
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }
}

