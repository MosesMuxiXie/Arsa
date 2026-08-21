/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class cc
implements am<a> {
    @Override
    public void a(anb $$0, am.a<a> $$1) {
    }

    @Override
    public void b(anb $$0, am.a<a> $$1) {
    }

    @Override
    public void a(anb $$0) {
    }

    @Override
    public Codec<a> a() {
        return a.a;
    }

    public record a() implements an
    {
        public static final Codec<a> a = MapCodec.unitCodec((Object)new a());

        @Override
        public void a(bd $$0) {
        }
    }
}

