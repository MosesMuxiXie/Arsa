/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bcx
extends Record {
    private final jd<bcz> b;
    private final int c;
    private final int d;
    private final boolean e;
    public static final Codec<bcx> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bcz.b.fieldOf("sound").forGetter(bcx::a), (App)bfm.q.fieldOf("min_delay").forGetter(bcx::b), (App)bfm.q.fieldOf("max_delay").forGetter(bcx::c), (App)Codec.BOOL.optionalFieldOf("replace_current_music", (Object)false).forGetter(bcx::d)).apply((Applicative)$$0, bcx::new));

    public bcx(jd<bcz> $$0, int $$1, int $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bcx.class, "sound;minDelay;maxDelay;replaceCurrentMusic", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bcx.class, "sound;minDelay;maxDelay;replaceCurrentMusic", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bcx.class, "sound;minDelay;maxDelay;replaceCurrentMusic", "b", "c", "d", "e"}, this, $$0);
    }

    public jd<bcz> a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }
}

