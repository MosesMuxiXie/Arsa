/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class fbf
extends fbd {
    public static final MapCodec<fbf> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.intRange((int)0, (int)80).fieldOf("limit").orElse((Object)1).forGetter($$0 -> $$0.e), (App)Codec.intRange((int)0, (int)80).fieldOf("upper_limit").orElse((Object)1).forGetter($$0 -> $$0.f), (App)Codec.intRange((int)0, (int)16).fieldOf("lower_size").orElse((Object)0).forGetter($$0 -> $$0.g), (App)Codec.intRange((int)0, (int)16).fieldOf("middle_size").orElse((Object)1).forGetter($$0 -> $$0.h), (App)Codec.intRange((int)0, (int)16).fieldOf("upper_size").orElse((Object)1).forGetter($$0 -> $$0.i), fbf.a()).apply((Applicative)$$02, fbf::new));
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public fbf(int $$0, int $$1, int $$2, int $$3, int $$4, OptionalInt $$5) {
        super($$5);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    @Override
    protected fbe<?> b() {
        return fbe.b;
    }

    @Override
    public int a(int $$0, int $$1) {
        if ($$1 < this.e) {
            return this.g;
        }
        if ($$1 >= $$0 - this.f) {
            return this.i;
        }
        return this.h;
    }
}

