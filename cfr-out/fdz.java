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

public class fdz
extends fdv {
    public static final MapCodec<fdz> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)evk.a.fieldOf("min_inclusive").forGetter($$0 -> $$0.d), (App)evk.a.fieldOf("max_inclusive").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)Integer.MAX_VALUE).optionalFieldOf("inner", (Object)1).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fdz::new));
    private static final Logger b = LogUtils.getLogger();
    private final evk d;
    private final evk e;
    private final int f;

    private fdz(evk $$0, evk $$1, int $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public static fdz a(evk $$0, evk $$1, int $$2) {
        return new fdz($$0, $$1, $$2);
    }

    @Override
    public int a(bgr $$0, evn $$1) {
        int $$2 = this.d.a($$1);
        int $$3 = this.e.a($$1);
        if ($$3 - $$2 - this.f + 1 <= 0) {
            b.warn("Empty height range: {}", (Object)this);
            return $$2;
        }
        int $$4 = bgj.a($$0, $$2 + this.f, $$3);
        int $$5 = bgj.a($$0, $$2, $$4 - 1);
        return bgj.a($$0, $$2, $$5 - 1 + this.f);
    }

    @Override
    public fdw<?> a() {
        return fdw.d;
    }

    public String toString() {
        return "biased[" + String.valueOf(this.d) + "-" + String.valueOf(this.e) + " inner: " + this.f + "]";
    }
}

