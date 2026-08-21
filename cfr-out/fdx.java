/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class fdx
extends fdv {
    public static final MapCodec<fdx> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)evk.a.fieldOf("min_inclusive").forGetter($$0 -> $$0.d), (App)evk.a.fieldOf("max_inclusive").forGetter($$0 -> $$0.e), (App)Codec.INT.optionalFieldOf("plateau", (Object)0).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fdx::new));
    private static final Logger b = LogUtils.getLogger();
    private final evk d;
    private final evk e;
    private final int f;

    private fdx(evk $$0, evk $$1, int $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public static fdx a(evk $$0, evk $$1, int $$2) {
        return new fdx($$0, $$1, $$2);
    }

    public static fdx a(evk $$0, evk $$1) {
        return fdx.a($$0, $$1, 0);
    }

    @Override
    public int a(bgr $$0, evn $$1) {
        int $$3;
        int $$2 = this.d.a($$1);
        if ($$2 > ($$3 = this.e.a($$1))) {
            b.warn("Empty height range: {}", (Object)this);
            return $$2;
        }
        int $$4 = $$3 - $$2;
        if (this.f >= $$4) {
            return bgj.b($$0, $$2, $$3);
        }
        int $$5 = ($$4 - this.f) / 2;
        int $$6 = $$4 - $$5;
        return $$2 + bgj.b($$0, 0, $$6) + bgj.b($$0, 0, $$5);
    }

    @Override
    public fdw<?> a() {
        return fdw.e;
    }

    public String toString() {
        if (this.f == 0) {
            return "triangle (" + String.valueOf(this.d) + "-" + String.valueOf(this.e) + ")";
        }
        return "trapezoid(" + this.f + ") in [" + String.valueOf(this.d) + "-" + String.valueOf(this.e) + "]";
    }
}

