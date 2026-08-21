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

public class fdj
extends fdk {
    public static final MapCodec<fdj> a = RecordCodecBuilder.mapCodec($$0 -> fdj.a($$0).apply((Applicative)$$0, fdj::new));

    public fdj(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected fdl<?> a() {
        return fdl.a;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        fdj.a($$0, $$1, $$2, $$4.e(), $$5);
        for (int $$6 = 0; $$6 < $$3; ++$$6) {
            this.b($$0, $$1, $$2, $$4.b($$6), $$5);
        }
        return ImmutableList.of((Object)new fbo.a($$4.b($$3), 0, false));
    }
}

