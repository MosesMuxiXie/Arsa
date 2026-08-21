/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class fdg
extends fdk {
    public static final MapCodec<fdg> a = RecordCodecBuilder.mapCodec($$0 -> fdg.a($$0).apply((Applicative)$$0, fdg::new));

    public fdg(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected fdl<?> a() {
        return fdl.b;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        fdg.a($$0, $$1, $$2, $$4.e(), $$5);
        ArrayList $$6 = Lists.newArrayList();
        iz $$7 = iz.c.a.a($$2);
        int $$8 = $$3 - $$2.a(4) - 1;
        int $$9 = 3 - $$2.a(3);
        is.a $$10 = new is.a();
        int $$11 = $$4.u();
        int $$12 = $$4.w();
        OptionalInt $$13 = OptionalInt.empty();
        for (int $$14 = 0; $$14 < $$3; ++$$14) {
            int $$15 = $$4.v() + $$14;
            if ($$14 >= $$8 && $$9 > 0) {
                $$11 += $$7.j();
                $$12 += $$7.l();
                --$$9;
            }
            if (!this.b($$0, $$1, $$2, $$10.d($$11, $$15, $$12), $$5)) continue;
            $$13 = OptionalInt.of($$15 + 1);
        }
        if ($$13.isPresent()) {
            $$6.add(new fbo.a(new is($$11, $$13.getAsInt(), $$12), 1, false));
        }
        $$11 = $$4.u();
        $$12 = $$4.w();
        iz $$16 = iz.c.a.a($$2);
        if ($$16 != $$7) {
            int $$17 = $$8 - $$2.a(2) - 1;
            int $$18 = 1 + $$2.a(3);
            $$13 = OptionalInt.empty();
            for (int $$19 = $$17; $$19 < $$3 && $$18 > 0; ++$$19, --$$18) {
                if ($$19 < 1) continue;
                int $$20 = $$4.v() + $$19;
                if (!this.b($$0, $$1, $$2, $$10.d($$11 += $$16.j(), $$20, $$12 += $$16.l()), $$5)) continue;
                $$13 = OptionalInt.of($$20 + 1);
            }
            if ($$13.isPresent()) {
                $$6.add(new fbo.a(new is($$11, $$13.getAsInt(), $$12), 0, false));
            }
        }
        return $$6;
    }
}

