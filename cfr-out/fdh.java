/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class fdh
extends fdk {
    public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec($$0 -> fdh.a($$0).apply((Applicative)$$0, fdh::new));

    public fdh(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected fdl<?> a() {
        return fdl.c;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        is $$6 = $$4.e();
        fdh.a($$0, $$1, $$2, $$6, $$5);
        fdh.a($$0, $$1, $$2, $$6.i(), $$5);
        fdh.a($$0, $$1, $$2, $$6.g(), $$5);
        fdh.a($$0, $$1, $$2, $$6.g().i(), $$5);
        is.a $$7 = new is.a();
        for (int $$8 = 0; $$8 < $$3; ++$$8) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
            if ($$8 >= $$3 - 1) continue;
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
        }
        return ImmutableList.of((Object)new fbo.a($$4.b($$3), 0, true));
    }

    private void a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, is.a $$3, fay $$4, is $$5, int $$6, int $$7, int $$8) {
        $$3.a($$5, $$6, $$7, $$8);
        this.a($$0, $$1, $$2, $$3, $$4);
    }
}

