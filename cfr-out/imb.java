/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.slf4j.Logger;

public final class imb
extends Record
implements ilu {
    private final amo c;
    private final Optional<amo> d;
    private static final Logger e = LogUtils.getLogger();
    public static final MapCodec<imb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("resource").forGetter(imb::b), (App)amo.a.optionalFieldOf("sprite").forGetter(imb::c)).apply((Applicative)$$0, imb::new));

    public imb(amo $$0) {
        this($$0, Optional.empty());
    }

    public imb(amo $$0, Optional<amo> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(baz $$0, ilu.c $$1) {
        amo $$2 = a.a(this.c);
        Optional<bax> $$3 = $$0.getResource($$2);
        if ($$3.isPresent()) {
            $$1.a(this.d.orElse(this.c), $$3.get());
        } else {
            e.warn("Missing sprite: {}", (Object)$$2);
        }
    }

    public MapCodec<imb> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imb.class, "resourceId;spriteId", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imb.class, "resourceId;spriteId", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imb.class, "resourceId;spriteId", "c", "d"}, this, $$0);
    }

    public amo b() {
        return this.c;
    }

    public Optional<amo> c() {
        return this.d;
    }
}

