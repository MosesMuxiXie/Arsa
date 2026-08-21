/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class fdc
extends fdk {
    public static final MapCodec<fdc> a = RecordCodecBuilder.mapCodec($$02 -> fdc.a($$02).and($$02.group((App)bfm.r.optionalFieldOf("min_height_for_leaves", (Object)1).forGetter($$0 -> $$0.b), (App)cch.b(1, 64).fieldOf("bend_length").forGetter($$0 -> $$0.h))).apply((Applicative)$$02, fdc::new));
    private final int b;
    private final cch h;

    public fdc(int $$0, int $$1, int $$2, int $$3, cch $$4) {
        super($$0, $$1, $$2);
        this.b = $$3;
        this.h = $$4;
    }

    @Override
    protected fdl<?> a() {
        return fdl.g;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        iz $$6 = iz.c.a.a($$2);
        int $$7 = $$3 - 1;
        is.a $$8 = $$4.k();
        is $$9 = $$8.e();
        fdc.a($$0, $$1, $$2, $$9, $$5);
        ArrayList $$10 = Lists.newArrayList();
        for (int $$11 = 0; $$11 <= $$7; ++$$11) {
            if ($$11 + 1 >= $$7 + $$2.a(2)) {
                $$8.c($$6);
            }
            if (ezj.d($$0, $$8)) {
                this.b($$0, $$1, $$2, $$8, $$5);
            }
            if ($$11 >= this.b) {
                $$10.add(new fbo.a($$8.j(), 0, false));
            }
            $$8.c(iz.b);
        }
        int $$12 = this.h.a($$2);
        for (int $$13 = 0; $$13 <= $$12; ++$$13) {
            if (ezj.d($$0, $$8)) {
                this.b($$0, $$1, $$2, $$8, $$5);
            }
            $$10.add(new fbo.a($$8.j(), 0, false));
            $$8.c($$6);
        }
        return $$10;
    }
}

