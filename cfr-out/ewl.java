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

public class ewl
implements evx {
    public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)jy.v(16).optionalFieldOf("offset", (Object)jy.i).forGetter($$0 -> $$0.e), (App)eoh.a.fieldOf("state").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, ewl::new));
    private final jy e;
    private final eoh f;

    protected ewl(jy $$0, eoh $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a(dxn $$0, is $$1) {
        return this.f.a($$0, $$1.a(this.e));
    }

    @Override
    public evy<?> a() {
        return evy.g;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

