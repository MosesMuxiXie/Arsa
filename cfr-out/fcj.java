/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class fcj
extends fcd {
    public static final MapCodec<fcj> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fcd.a.fieldOf("source").forGetter($$0 -> $$0.c), (App)Codec.STRING.fieldOf("property").forGetter($$0 -> $$0.d), (App)cch.c.fieldOf("values").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fcj::new));
    private final fcd c;
    private final String d;
    private @Nullable eph e;
    private final cch f;

    public fcj(fcd $$0, eph $$1, cch $$2) {
        this.c = $$0;
        this.e = $$1;
        this.d = $$1.f();
        this.f = $$2;
        List<Integer> $$3 = $$1.a();
        for (int $$4 = $$2.a(); $$4 <= $$2.b(); ++$$4) {
            if ($$3.contains($$4)) continue;
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
        }
    }

    public fcj(fcd $$0, String $$1, cch $$2) {
        this.c = $$0;
        this.d = $$1;
        this.f = $$2;
    }

    @Override
    protected fce<?> a() {
        return fce.g;
    }

    @Override
    public eoh a(bgr $$0, is $$1) {
        eoh $$2 = this.c.a($$0, $$1);
        if (this.e == null || !$$2.b(this.e)) {
            eph $$3 = fcj.a($$2, this.d);
            if ($$3 == null) {
                return $$2;
            }
            this.e = $$3;
        }
        return (eoh)$$2.b(this.e, this.f.a($$0));
    }

    private static @Nullable eph a(eoh $$02, String $$12) {
        Collection<epk<?>> $$2 = $$02.F();
        Optional<eph> $$3 = $$2.stream().filter($$1 -> $$1.f().equals($$12)).filter($$0 -> $$0 instanceof eph).map($$0 -> (eph)$$0).findAny();
        return $$3.orElse(null);
    }
}

