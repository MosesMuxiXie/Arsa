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
import java.util.Optional;

public class fhx
extends ffo {
    public static final MapCodec<fhx> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group(fhx.a($$02), (App)fdv.c.fieldOf("height").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fhx::new));
    public final fdv e;

    public fhx(ffo.c $$0, fdv $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        evp $$1 = $$0.f();
        int $$2 = $$0.h().e() + $$1.a(16);
        int $$32 = $$0.h().f() + $$1.a(16);
        int $$4 = $$0.b().f();
        evn $$5 = new evn($$0.b(), $$0.i());
        int $$6 = this.e.a($$1, $$5);
        dxa $$7 = $$0.b().a($$2, $$32, $$0.i(), $$0.d());
        is.a $$8 = new is.a($$2, $$6, $$32);
        while ($$6 > $$4) {
            eoh $$9 = $$7.a($$6);
            eoh $$10 = $$7.a(--$$6);
            if (!$$9.l() || !$$10.a(dzs.ez) && !$$10.c((dvt)dwf.a, (is)$$8.q($$6), iz.b)) continue;
            break;
        }
        if ($$6 <= $$4) {
            return Optional.empty();
        }
        is $$11 = new is($$2, $$6, $$32);
        return Optional.of(new ffo.b($$11, $$3 -> fhw.a($$0.e(), $$3, $$1, $$11)));
    }

    @Override
    public ffx<?> e() {
        return ffx.i;
    }
}

