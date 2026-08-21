/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;

public class eyt
extends exx<fal> {
    public eyt(Codec<fal> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fal> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        bgr $$3 = $$0.d();
        fal $$4 = $$0.f();
        Optional<iz> $$5 = eyt.a($$1, $$2, $$3);
        if ($$5.isEmpty()) {
            return false;
        }
        is $$6 = $$2.a($$5.get().g());
        eyt.a($$1, $$3, $$6, $$4);
        int $$7 = $$3.i() < $$4.b && exr.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
        exr.a($$1, $$2, $$5.get(), $$7, false);
        return true;
    }

    private static Optional<iz> a(dwp $$0, is $$1, bgr $$2) {
        boolean $$3 = exr.b($$0.a_($$1.d()));
        boolean $$4 = exr.b($$0.a_($$1.e()));
        if ($$3 && $$4) {
            return Optional.of($$2.h() ? iz.a : iz.b);
        }
        if ($$3) {
            return Optional.of(iz.a);
        }
        if ($$4) {
            return Optional.of(iz.b);
        }
        return Optional.empty();
    }

    private static void a(dwp $$0, bgr $$1, is $$2, fal $$3) {
        exr.c($$0, $$2);
        for (iz $$4 : iz.c.a) {
            if ($$1.i() > $$3.c) continue;
            is $$5 = $$2.a($$4);
            exr.c($$0, $$5);
            if ($$1.i() > $$3.d) continue;
            is $$6 = $$5.a(iz.b($$1));
            exr.c($$0, $$6);
            if ($$1.i() > $$3.e) continue;
            is $$7 = $$6.a(iz.b($$1));
            exr.c($$0, $$7);
        }
    }
}

