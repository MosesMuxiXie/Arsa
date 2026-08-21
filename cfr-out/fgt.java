/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class fgt
extends fgv {
    public static final MapCodec<fgt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fgt.d(), fgt.b(), fgt.f(), fgt.c()).apply((Applicative)$$0, fgt::new));

    protected fgt(Either<amo, fjq> $$0, jd<fjo> $$1, fgy.a $$2, Optional<fja> $$3) {
        super($$0, $$1, $$2, $$3);
    }

    @Override
    protected fjm a(egm $$0, ffg $$1, fja $$2, boolean $$3) {
        fjm $$4 = super.a($$0, $$1, $$2, $$3);
        $$4.b(fir.b);
        $$4.a(fir.d);
        return $$4;
    }

    @Override
    public fgx<?> a() {
        return fgx.e;
    }

    @Override
    public String toString() {
        return "LegacySingle[" + String.valueOf(this.c) + "]";
    }
}

