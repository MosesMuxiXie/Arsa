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
import java.util.function.BiConsumer;

public class fdi
extends fdh {
    public static final MapCodec<fdi> b = RecordCodecBuilder.mapCodec($$0 -> fdi.a($$0).apply((Applicative)$$0, fdi::new));

    public fdi(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected fdl<?> a() {
        return fdl.d;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        ArrayList $$6 = Lists.newArrayList();
        $$6.addAll(super.a($$0, $$1, $$2, $$3, $$4, $$5));
        for (int $$7 = $$3 - 2 - $$2.a(4); $$7 > $$3 / 2; $$7 -= 2 + $$2.a(4)) {
            float $$8 = $$2.i() * ((float)Math.PI * 2);
            int $$9 = 0;
            int $$10 = 0;
            for (int $$11 = 0; $$11 < 5; ++$$11) {
                $$9 = (int)(1.5f + bgj.b((double)$$8) * (float)$$11);
                $$10 = (int)(1.5f + bgj.a((double)$$8) * (float)$$11);
                is $$12 = $$4.b($$9, $$7 - 3 + $$11 / 2, $$10);
                this.b($$0, $$1, $$2, $$12, $$5);
            }
            $$6.add(new fbo.a($$4.b($$9, $$7, $$10), -2, false));
        }
        return $$6;
    }
}

