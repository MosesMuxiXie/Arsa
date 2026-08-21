/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class fju
implements fjy {
    public static final MapCodec<fju> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fof.a.fieldOf("loot_table").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fju::new));
    private final amt<fof> b;

    public fju(amt<fof> $$0) {
        this.b = $$0;
    }

    @Override
    public uz a(bgr $$0, @Nullable uz $$1) {
        uz $$2 = $$1 == null ? new uz() : $$1.l();
        $$2.a("LootTable", fof.a, this.b);
        $$2.a("LootTableSeed", $$0.g());
        return $$2;
    }

    @Override
    public fjz<?> a() {
        return fjz.d;
    }
}

