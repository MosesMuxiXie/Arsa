/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class fdm
extends fdk {
    public static final MapCodec<fdm> a = RecordCodecBuilder.mapCodec($$02 -> fdm.a($$02).and($$02.group((App)cch.e.fieldOf("extra_branch_steps").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("place_branch_per_log_probability").forGetter($$0 -> Float.valueOf($$0.h)), (App)cch.d.fieldOf("extra_branch_length").forGetter($$0 -> $$0.i), (App)js.a(mj.i).fieldOf("can_grow_through").forGetter($$0 -> $$0.j))).apply((Applicative)$$02, fdm::new));
    private final cch b;
    private final float h;
    private final cch i;
    private final jh<dzq> j;

    public fdm(int $$0, int $$1, int $$2, cch $$3, float $$4, cch $$5, jh<dzq> $$6) {
        super($$0, $$1, $$2);
        this.b = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
    }

    @Override
    protected fdl<?> a() {
        return fdl.h;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        ArrayList $$6 = Lists.newArrayList();
        is.a $$7 = new is.a();
        for (int $$8 = 0; $$8 < $$3; ++$$8) {
            int $$9 = $$4.v() + $$8;
            if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
                iz $$10 = iz.c.a.a($$2);
                int $$11 = this.i.a($$2);
                int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
                int $$13 = this.b.a($$2);
                this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
            }
            if ($$8 != $$3 - 1) continue;
            $$6.add(new fbo.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
        }
        return $$6;
    }

    private void a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, fay $$4, List<fbo.a> $$5, is.a $$6, int $$7, iz $$8, int $$9, int $$10) {
        int $$11 = $$7 + $$9;
        int $$12 = $$6.u();
        int $$13 = $$6.w();
        for (int $$14 = $$9; $$14 < $$3 && $$10 > 0; ++$$14, --$$10) {
            if ($$14 < 1) continue;
            int $$15 = $$7 + $$14;
            $$11 = $$15;
            if (this.b($$0, $$1, $$2, $$6.d($$12 += $$8.j(), $$15, $$13 += $$8.l()), $$4)) {
                ++$$11;
            }
            $$5.add(new fbo.a($$6.j(), 0, false));
        }
        if ($$11 - $$7 > 1) {
            is $$16 = new is($$12, $$11, $$13);
            $$5.add(new fbo.a($$16, 0, false));
            $$5.add(new fbo.a($$16.c(2), 0, false));
        }
    }

    @Override
    protected boolean a(dwu $$02, is $$1) {
        return super.a($$02, $$1) || $$02.a($$1, (eoh $$0) -> $$0.a(this.j));
    }
}

