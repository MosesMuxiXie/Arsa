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
import java.util.List;

public class fcx
extends fcy {
    public static final MapCodec<fcx> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.r.fieldOf("tries").orElse((Object)128).forGetter($$0 -> $$0.b), (App)bfm.q.fieldOf("radius").orElse((Object)2).forGetter($$0 -> $$0.c), (App)bfm.q.fieldOf("height").orElse((Object)1).forGetter($$0 -> $$0.d), (App)fcd.a.fieldOf("block_state_provider").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fcx::new));
    private final int b;
    private final int c;
    private final int d;
    private final fcd e;

    public fcx(int $$0, int $$1, int $$2, fcd $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    protected fcz<?> a() {
        return fcz.i;
    }

    @Override
    public void a(fcy.a $$0) {
        List<is> $$1 = ezj.a($$0);
        if ($$1.isEmpty()) {
            return;
        }
        is $$2 = $$1.getFirst();
        int $$3 = $$2.v();
        int $$4 = $$2.u();
        int $$5 = $$2.u();
        int $$6 = $$2.w();
        int $$7 = $$2.w();
        for (is $$8 : $$1) {
            if ($$8.v() != $$3) continue;
            $$4 = Math.min($$4, $$8.u());
            $$5 = Math.max($$5, $$8.u());
            $$6 = Math.min($$6, $$8.w());
            $$7 = Math.max($$7, $$8.w());
        }
        bgr $$9 = $$0.b();
        ffg $$10 = new ffg($$4, $$3, $$6, $$5, $$3, $$7).c(this.c, this.d, this.c);
        is.a $$11 = new is.a();
        for (int $$12 = 0; $$12 < this.b; ++$$12) {
            $$11.d($$9.a($$10.h(), $$10.k()), $$9.a($$10.i(), $$10.l()), $$9.a($$10.j(), $$10.m()));
            this.a($$0, $$11);
        }
    }

    private void a(fcy.a $$02, is $$1) {
        is $$2 = $$1.d();
        if ($$02.a().a($$2, (eoh $$0) -> $$0.l() || $$0.a(dzs.fN)) && $$02.a($$1, eog.a::s) && $$02.a().a(euq.a.f, $$1).v() <= $$2.v()) {
            $$02.a($$2, this.e.a($$02.b(), $$2));
        }
    }
}

