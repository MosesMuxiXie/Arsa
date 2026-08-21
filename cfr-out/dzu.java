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

public class dzu
extends dzq
implements dzt {
    public static final MapCodec<dzu> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)amt.a(mj.aY).fieldOf("feature").forGetter($$0 -> $$0.b), dzu.x()).apply((Applicative)$$02, dzu::new));
    private final amt<exi<?, ?>> b;

    public MapCodec<dzu> a() {
        return a;
    }

    public dzu(amt<exi<?, ?>> $$0, eog.d $$1) {
        super($$1);
        this.b = $$0;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.a_($$1.d()).l();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$02, bgr $$1, is $$2, eoh $$32) {
        $$02.J_().a(mj.aY).flatMap($$0 -> $$0.a(this.b)).ifPresent($$3 -> ((exi)$$3.a()).a($$02, $$02.p().g(), $$1, $$2.d()));
    }

    @Override
    public dzt.a as_() {
        return dzt.a.a;
    }
}

