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
import java.util.Set;

public class dvd
implements dvf {
    public static final MapCodec<dvd> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)foa.h.fieldOf("source").forGetter($$0 -> $$0.b), (App)djk.a.fieldOf("slots").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dvd::new));
    private final foa<Object> b;
    private final djj c;

    private dvd(foa<Object> $$0, djj $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public MapCodec<dvd> a() {
        return a;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(this.b.a());
    }

    @Override
    public final dve a(fnz $$0) {
        Object $$1 = this.b.a($$0);
        if ($$1 instanceof cid) {
            cid $$2 = (cid)$$1;
            return $$2.a(this.c.a());
        }
        return dve.a;
    }
}

