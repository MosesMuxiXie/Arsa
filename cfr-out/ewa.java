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

public class ewa
implements evx {
    private final jy e;
    private final iz f;
    public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)jy.v(16).optionalFieldOf("offset", (Object)jy.i).forGetter($$0 -> $$0.e), (App)iz.g.fieldOf("direction").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, ewa::new));

    public ewa(jy $$0, iz $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a(dxn $$0, is $$1) {
        is $$2 = $$1.a(this.e);
        return $$0.a_($$2).c((dvt)$$0, $$2, this.f);
    }

    @Override
    public evy<?> a() {
        return evy.d;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

