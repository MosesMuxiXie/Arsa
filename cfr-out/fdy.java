/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class fdy
extends fdv {
    public static final MapCodec<fdy> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)evk.a.fieldOf("min_inclusive").forGetter($$0 -> $$0.d), (App)evk.a.fieldOf("max_inclusive").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fdy::new));
    private static final Logger b = LogUtils.getLogger();
    private final evk d;
    private final evk e;
    private final LongSet f = new LongOpenHashSet();

    private fdy(evk $$0, evk $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static fdy a(evk $$0, evk $$1) {
        return new fdy($$0, $$1);
    }

    @Override
    public int a(bgr $$0, evn $$1) {
        int $$3;
        int $$2 = this.d.a($$1);
        if ($$2 > ($$3 = this.e.a($$1))) {
            if (this.f.add((long)$$2 << 32 | (long)$$3)) {
                b.warn("Empty height range: {}", (Object)this);
            }
            return $$2;
        }
        return bgj.b($$0, $$2, $$3);
    }

    @Override
    public fdw<?> a() {
        return fdw.b;
    }

    public String toString() {
        return "[" + String.valueOf(this.d) + "-" + String.valueOf(this.e) + "]";
    }
}

