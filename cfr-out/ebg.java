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
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class ebg
extends eau {
    public static final MapCodec<ebg> g = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(ebg::t), (App)mi.b.q().fieldOf("open_sound").forGetter(eau::r), (App)mi.b.q().fieldOf("close_sound").forGetter(eau::s), ebg.x()).apply((Applicative)$$0, ebg::new));
    private static final Map<dzq, Supplier<dzq>> h = Map.of(dzs.rW, () -> dzs.ts, dzs.rX, () -> dzs.tt, dzs.rY, () -> dzs.tu, dzs.rZ, () -> dzs.tv, dzs.sw, () -> dzs.ts, dzs.sy, () -> dzs.tt, dzs.sx, () -> dzs.tu, dzs.sz, () -> dzs.tv);
    private final ejq.a i;

    @Override
    public MapCodec<? extends ebg> a() {
        return g;
    }

    public ebg(ejq.a $$0, bcz $$1, bcz $$2, eog.d $$3) {
        super(() -> eld.b, $$1, $$2, $$3);
        this.i = $$0;
    }

    @Override
    public boolean i(eoh $$0) {
        return $$0.a(bdp.ai) && $$0.b(eau.d);
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$1 = super.a($$0);
        return ebg.c($$1, $$0.q(), $$0.a());
    }

    private static eoh c(eoh $$0, dwo $$1, is $$2) {
        dzq dzq2;
        eoh $$3 = $$1.a_($$2.a(ebg.n($$0)));
        if (!$$0.c(eau.d).equals(eoz.a) && (dzq2 = $$0.b()) instanceof ebg) {
            ebg $$4 = (ebg)dzq2;
            dzq2 = $$3.b();
            if (dzq2 instanceof ebg) {
                ebg $$5 = (ebg)dzq2;
                eoh $$6 = $$0;
                eoh $$7 = $$3;
                if ($$4.u() != $$5.u()) {
                    $$6 = ebg.a($$4, $$0).orElse($$6);
                    $$7 = ebg.a($$5, $$3).orElse($$7);
                }
                dzq $$8 = $$4.i.ordinal() <= $$5.i.ordinal() ? $$6.b() : $$7.b();
                return $$8.m($$6);
            }
        }
        return $$0;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        eoz $$9;
        eoh $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        if (this.i($$6) && !($$9 = $$8.c(eau.d)).equals(eoz.a) && ebg.n($$8) == $$4) {
            return $$6.b().m($$8);
        }
        return $$8;
    }

    private static Optional<eoh> a(ebg $$0, eoh $$12) {
        if (!$$0.u()) {
            return Optional.of($$12);
        }
        return Optional.ofNullable((dzq)dlk.b.get().get((Object)$$12.b())).map($$1 -> $$1.m($$12));
    }

    public ejq.a t() {
        return this.i;
    }

    public static eoh a(dzq $$0, iz $$1, dwo $$2, is $$3) {
        ebg $$4 = (ebg)h.getOrDefault($$0, dzs.ts::o).get();
        eoz $$5 = $$4.a($$2, $$3, $$1);
        eoh $$6 = (eoh)((eoh)$$4.m().b(c, $$1)).b(d, $$5);
        return ebg.c($$6, $$2, $$3);
    }

    public boolean u() {
        return true;
    }

    @Override
    public boolean o(eoh $$0) {
        return $$0.a(bdp.ai);
    }
}

