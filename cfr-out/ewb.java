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

public class ewb
implements evx {
    public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)jy.v(16).optionalFieldOf("offset", (Object)is.c).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ewb::new));
    private final jy e;

    public ewb(jy $$0) {
        this.e = $$0;
    }

    public boolean a(dxn $$0, is $$1) {
        return !$$0.y($$1.a(this.e));
    }

    @Override
    public evy<?> a() {
        return evy.h;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

