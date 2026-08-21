/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public class exm
extends exk {
    public exm(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    protected boolean a(dwp $$0, bgr $$1, is $$2, eoh $$3) {
        is.a $$4 = $$2.k();
        int $$5 = $$1.a(3) + 1;
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            if (!this.b($$0, $$1, $$4, $$3)) {
                return true;
            }
            $$4.c(iz.b);
        }
        is $$7 = $$4.j();
        int $$8 = $$1.a(3) + 2;
        List<iz> $$9 = iz.c.a.c($$1);
        List<iz> $$10 = $$9.subList(0, $$8);
        for (iz $$11 : $$10) {
            $$4.g($$7);
            $$4.c($$11);
            int $$12 = $$1.a(5) + 2;
            int $$13 = 0;
            for (int $$14 = 0; $$14 < $$12 && this.b($$0, $$1, $$4, $$3); ++$$14) {
                $$4.c(iz.b);
                if ($$14 != 0 && (++$$13 < 2 || !($$1.i() < 0.25f))) continue;
                $$4.c($$11);
                $$13 = 0;
            }
        }
        return true;
    }
}

