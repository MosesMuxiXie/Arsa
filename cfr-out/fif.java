/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class fif
extends ffo {
    public static final MapCodec<fif> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group(fif.a($$02), (App)Codec.BOOL.fieldOf("is_beached").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fif::new));
    public final boolean e;

    public fif(ffo.c $$0, boolean $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    public Optional<ffo.b> a(ffo.a $$0) {
        euq.a $$12 = this.e ? euq.a.a : euq.a.c;
        return fif.a($$0, $$12, $$1 -> this.a((fgg)$$1, $$0));
    }

    private void a(fgg $$0, ffo.a $$1) {
        egm $$2 = egm.a($$1.f());
        is $$3 = new is($$1.h().e(), 90, $$1.h().f());
        fie.a $$4 = fie.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
        if ($$4.l()) {
            int $$8;
            ffg $$5 = $$4.f();
            if (this.e) {
                int $$6 = ffo.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
                int $$7 = $$4.a($$6, $$1.f());
            } else {
                $$8 = ffo.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            }
            $$4.c($$8);
        }
    }

    @Override
    public ffx<?> e() {
        return ffx.m;
    }
}

