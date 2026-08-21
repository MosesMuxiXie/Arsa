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

class ewf
implements evx {
    public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)evx.b.fieldOf("predicate").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ewf::new));
    private final evx e;

    public ewf(evx $$0) {
        this.e = $$0;
    }

    public boolean a(dxn $$0, is $$1) {
        return !this.e.test($$0, $$1);
    }

    @Override
    public evy<?> a() {
        return evy.k;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

