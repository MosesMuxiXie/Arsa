/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class exj
extends exk {
    public exj(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    protected boolean a(dwp $$0, bgr $$1, is $$2, eoh $$3) {
        if (!this.b($$0, $$1, $$2, $$3)) {
            return false;
        }
        iz $$4 = iz.c.a.a($$1);
        int $$5 = $$1.a(2) + 2;
        List<iz> $$6 = bhs.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);
        List<iz> $$7 = $$6.subList(0, $$5);
        block0: for (iz $$8 : $$7) {
            int $$15;
            iz $$14;
            is.a $$9 = $$2.k();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            if ($$8 == $$4) {
                iz $$11 = $$4;
                int $$12 = $$1.a(3) + 2;
            } else {
                $$9.c(iz.b);
                iz[] $$13 = new iz[]{$$8, iz.b};
                $$14 = bhs.a($$13, $$1);
                $$15 = $$1.a(3) + 3;
            }
            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); ++$$16) {
                $$9.c($$14);
            }
            $$9.c($$14.g());
            $$9.c(iz.b);
            for (int $$17 = 0; $$17 < $$15; ++$$17) {
                $$9.c($$4);
                if (!this.b($$0, $$1, $$9, $$3)) continue block0;
                if (!($$1.i() < 0.25f)) continue;
                $$9.c(iz.b);
            }
        }
        return true;
    }
}

