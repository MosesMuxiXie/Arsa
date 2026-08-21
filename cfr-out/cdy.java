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
import java.util.Optional;

public final class cdy
extends Record {
    private final Optional<bcx> d;
    private final Optional<bcx> e;
    private final Optional<bcx> f;
    public static final cdy a = new cdy(Optional.empty(), Optional.empty(), Optional.empty());
    public static final cdy b = new cdy(Optional.of(bcy.g), Optional.of(bcy.b), Optional.empty());
    public static final Codec<cdy> c = RecordCodecBuilder.create($$0 -> $$0.group((App)bcx.a.optionalFieldOf("default").forGetter(cdy::a), (App)bcx.a.optionalFieldOf("creative").forGetter(cdy::b), (App)bcx.a.optionalFieldOf("underwater").forGetter(cdy::c)).apply((Applicative)$$0, cdy::new));

    public cdy(bcx $$0) {
        this(Optional.of($$0), Optional.empty(), Optional.empty());
    }

    public cdy(jd<bcz> $$0) {
        this(bcy.a($$0));
    }

    public cdy(Optional<bcx> $$0, Optional<bcx> $$1, Optional<bcx> $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public cdy a(bcx $$0) {
        return new cdy(this.d, this.e, Optional.of($$0));
    }

    public Optional<bcx> a(boolean $$0, boolean $$1) {
        if ($$1 && this.f.isPresent()) {
            return this.f;
        }
        if ($$0 && this.e.isPresent()) {
            return this.e;
        }
        return this.d;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdy.class, "defaultMusic;creativeMusic;underwaterMusic", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdy.class, "defaultMusic;creativeMusic;underwaterMusic", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdy.class, "defaultMusic;creativeMusic;underwaterMusic", "d", "e", "f"}, this, $$0);
    }

    public Optional<bcx> a() {
        return this.d;
    }

    public Optional<bcx> b() {
        return this.e;
    }

    public Optional<bcx> c() {
        return this.f;
    }
}

