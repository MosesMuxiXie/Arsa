/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class fiw
extends fjn {
    public static final MapCodec<fiw> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)euq.a.g.fieldOf("heightmap").orElse((Object)euq.a.a).forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("offset").orElse((Object)0).forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fiw::new));
    private final euq.a b;
    private final int c;

    public fiw(euq.a $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        euq.a $$9;
        if ($$0 instanceof axf) {
            if (this.b == euq.a.a) {
                euq.a $$6 = euq.a.b;
            } else if (this.b == euq.a.c) {
                euq.a $$7 = euq.a.d;
            } else {
                euq.a $$8 = this.b;
            }
        } else {
            $$9 = this.b;
        }
        is $$10 = $$4.a();
        int $$11 = $$0.a($$9, $$10.u(), $$10.w()) + this.c;
        int $$12 = $$3.a().v();
        return new fjq.d(new is($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
    }

    @Override
    protected fjp<?> a() {
        return fjp.g;
    }
}

