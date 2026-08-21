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

public class cco
extends cch {
    public static final MapCodec<cco> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)cbn.b(cch.c).fieldOf("distribution").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, cco::new));
    private final cbn<cch> b;
    private final int f;
    private final int g;

    public cco(cbn<cch> $$0) {
        this.b = $$0;
        int $$1 = Integer.MAX_VALUE;
        int $$2 = Integer.MIN_VALUE;
        for (cbm<cch> $$3 : $$0.d()) {
            int $$4 = $$3.a().a();
            int $$5 = $$3.a().b();
            $$1 = Math.min($$1, $$4);
            $$2 = Math.max($$2, $$5);
        }
        this.f = $$1;
        this.g = $$2;
    }

    @Override
    public int a(bgr $$0) {
        return this.b.b($$0).a($$0);
    }

    @Override
    public int a() {
        return this.f;
    }

    @Override
    public int b() {
        return this.g;
    }

    @Override
    public cci<?> c() {
        return cci.e;
    }
}

