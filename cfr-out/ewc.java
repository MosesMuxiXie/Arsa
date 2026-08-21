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

public class ewc
extends ewi {
    final bef<dzq> a;
    public static final MapCodec<ewc> e = RecordCodecBuilder.mapCodec($$02 -> ewc.a($$02).and((App)bef.a(mj.i).fieldOf("tag").forGetter($$0 -> $$0.a)).apply((Applicative)$$02, ewc::new));

    protected ewc(jy $$0, bef<dzq> $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    protected boolean a(eoh $$0) {
        return $$0.a(this.a);
    }

    @Override
    public evy<?> a() {
        return evy.b;
    }
}

