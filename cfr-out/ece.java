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

public class ece
extends dzq {
    public static final MapCodec<ece> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)cch.b(0, 10).fieldOf("experience").forGetter($$0 -> $$0.b), ece.x()).apply((Applicative)$$02, ece::new));
    private final cch b;

    public MapCodec<? extends ece> a() {
        return a;
    }

    public ece(cch $$0, eog.d $$1) {
        super($$1);
        this.b = $$0;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, this.b);
        }
    }
}

