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
import java.util.Optional;

public class cdh {
    public static final Codec<cdh> a = RecordCodecBuilder.create($$02 -> $$02.group((App)evr.b.fieldOf("source").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, cdh::new));
    private final evr b;

    public cdh(evr $$0) {
        this.b = $$0;
    }

    public cdh(long $$0, amo $$1) {
        this(cdh.a($$0, Optional.of($$1)));
    }

    public cdh(long $$0, Optional<amo> $$1) {
        this(cdh.a($$0, $$1));
    }

    private static evr a(long $$0, Optional<amo> $$1) {
        evf.a $$2 = evf.b($$0);
        if ($$1.isPresent()) {
            $$2 = $$2.a(cdh.a($$1.get()));
        }
        return new evr($$2.a());
    }

    public static evf.a a(amo $$0) {
        return evf.a($$0.toString());
    }

    public bgr a() {
        return this.b;
    }
}

