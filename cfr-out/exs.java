/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exs
extends exx<faa> {
    public exs(Codec<faa> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faa> $$0) {
        is $$1 = $$0.e();
        dxn $$2 = $$0.b();
        faa $$32 = $$0.f();
        for (is $$4 : is.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
            boolean $$8;
            boolean $$5 = $$4.u() == $$1.u();
            boolean $$6 = $$4.v() == $$1.v();
            boolean $$7 = $$4.w() == $$1.w();
            boolean bl2 = $$8 = Math.abs($$4.v() - $$1.v()) == 2;
            if ($$5 && $$6 && $$7) {
                is $$9 = $$4.j();
                this.a($$2, $$9, dzs.lB.m());
                $$32.b().ifPresent($$3 -> {
                    elb $$4 = $$2.c_($$9);
                    if ($$4 instanceof ena) {
                        ena $$5 = (ena)$$4;
                        $$5.a((is)$$3, $$32.c());
                    }
                });
                continue;
            }
            if ($$6) {
                this.a($$2, $$4, dzs.a.m());
                continue;
            }
            if ($$8 && $$5 && $$7) {
                this.a($$2, $$4, dzs.I.m());
                continue;
            }
            if (!$$5 && !$$7 || $$8) {
                this.a($$2, $$4, dzs.a.m());
                continue;
            }
            this.a($$2, $$4, dzs.I.m());
        }
        return true;
    }
}

