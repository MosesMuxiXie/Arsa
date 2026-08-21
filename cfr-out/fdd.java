/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class fdd
extends fdk {
    private static final Codec<ccn> b = ccn.a.codec().validate($$0 -> {
        if ($$0.b() - $$0.a() < 1) {
            return DataResult.error(() -> "Need at least 2 blocks variation for the branch starts to fit both branches");
        }
        return DataResult.success((Object)$$0);
    });
    public static final MapCodec<fdd> a = RecordCodecBuilder.mapCodec($$02 -> fdd.a($$02).and($$02.group((App)cch.b(1, 3).fieldOf("branch_count").forGetter($$0 -> $$0.h), (App)cch.b(2, 16).fieldOf("branch_horizontal_length").forGetter($$0 -> $$0.i), (App)cch.a(-16, 0, b).fieldOf("branch_start_offset_from_top").forGetter($$0 -> $$0.j), (App)cch.b(-16, 16).fieldOf("branch_end_offset_from_top").forGetter($$0 -> $$0.l))).apply((Applicative)$$02, fdd::new));
    private final cch h;
    private final cch i;
    private final ccn j;
    private final ccn k;
    private final cch l;

    public fdd(int $$0, int $$1, int $$2, cch $$3, cch $$4, ccn $$5, cch $$6) {
        super($$0, $$1, $$2);
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
        this.k = ccn.a($$5.a(), $$5.b() - 1);
        this.l = $$6;
    }

    @Override
    protected fdl<?> a() {
        return fdl.i;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$12, bgr $$2, int $$3, is $$4, fay $$5) {
        int $$13;
        boolean $$10;
        int $$8;
        fdd.a($$0, $$12, $$2, $$4.e(), $$5);
        int $$6 = Math.max(0, $$3 - 1 + this.j.a($$2));
        int $$7 = Math.max(0, $$3 - 1 + this.k.a($$2));
        if ($$7 >= $$6) {
            ++$$7;
        }
        boolean $$9 = ($$8 = this.h.a($$2)) == 3;
        boolean bl2 = $$10 = $$8 >= 2;
        if ($$9) {
            int $$11 = $$3;
        } else if ($$10) {
            int $$122 = Math.max($$6, $$7) + 1;
        } else {
            $$13 = $$6 + 1;
        }
        for (int $$14 = 0; $$14 < $$13; ++$$14) {
            this.b($$0, $$12, $$2, $$4.b($$14), $$5);
        }
        ArrayList<fbo.a> $$15 = new ArrayList<fbo.a>();
        if ($$9) {
            $$15.add(new fbo.a($$4.b($$13), 0, false));
        }
        is.a $$16 = new is.a();
        iz $$17 = iz.c.a.a($$2);
        Function<eoh, eoh> $$18 = $$1 -> (eoh)$$1.c(egl.d, $$17.o());
        $$15.add(this.a($$0, $$12, $$2, $$3, $$4, $$5, $$18, $$17, $$6, $$6 < $$13 - 1, $$16));
        if ($$10) {
            $$15.add(this.a($$0, $$12, $$2, $$3, $$4, $$5, $$18, $$17.g(), $$7, $$7 < $$13 - 1, $$16));
        }
        return $$15;
    }

    private fbo.a a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5, Function<eoh, eoh> $$6, iz $$7, int $$8, boolean $$9, is.a $$10) {
        int $$18;
        iz $$17;
        $$10.g($$4).c(iz.b, $$8);
        int $$11 = $$3 - 1 + this.l.a($$2);
        boolean $$12 = $$9 || $$11 < $$8;
        int $$13 = this.i.a($$2) + ($$12 ? 1 : 0);
        is $$14 = $$4.a($$7, $$13).b($$11);
        int $$15 = $$12 ? 2 : 1;
        for (int $$16 = 0; $$16 < $$15; ++$$16) {
            this.a($$0, $$1, $$2, $$10.c($$7), $$5, $$6);
        }
        iz iz2 = $$17 = $$14.v() > $$10.v() ? iz.b : iz.a;
        while (($$18 = $$10.k($$14)) != 0) {
            float $$19 = (float)Math.abs($$14.v() - $$10.v()) / (float)$$18;
            boolean $$20 = $$2.i() < $$19;
            $$10.c($$20 ? $$17 : $$7);
            this.a($$0, $$1, $$2, $$10, $$5, $$20 ? Function.identity() : $$6);
        }
        return new fbo.a($$14.d(), 0, false);
    }
}

