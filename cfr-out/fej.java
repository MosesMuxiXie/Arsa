/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

@Deprecated
public class fej
extends fev {
    public static final MapCodec<fej> a = cch.b(0, 256).fieldOf("count").xmap(fej::new, $$0 -> $$0.c);
    private final cch c;

    private fej(cch $$0) {
        this.c = $$0;
    }

    public static fej a(cch $$0) {
        return new fej($$0);
    }

    public static fej a(int $$0) {
        return fej.a(cce.a($$0));
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        boolean $$5;
        Stream.Builder<is> $$3 = Stream.builder();
        int $$4 = 0;
        do {
            $$5 = false;
            for (int $$6 = 0; $$6 < this.c.a($$1); ++$$6) {
                int $$8;
                int $$9;
                int $$7 = $$1.a(16) + $$2.u();
                int $$10 = fej.a($$0, $$7, $$9 = $$0.a(euq.a.e, $$7, $$8 = $$1.a(16) + $$2.w()), $$8, $$4);
                if ($$10 == Integer.MAX_VALUE) continue;
                $$3.add(new is($$7, $$10, $$8));
                $$5 = true;
            }
            ++$$4;
        } while ($$5);
        return $$3.build();
    }

    @Override
    public few<?> b() {
        return few.i;
    }

    private static int a(fet $$0, int $$1, int $$2, int $$3, int $$4) {
        is.a $$5 = new is.a($$1, $$2, $$3);
        int $$6 = 0;
        eoh $$7 = $$0.a($$5);
        for (int $$8 = $$2; $$8 >= $$0.c() + 1; --$$8) {
            $$5.q($$8 - 1);
            eoh $$9 = $$0.a($$5);
            if (!fej.a($$9) && fej.a($$7) && !$$9.a(dzs.I)) {
                if ($$6 == $$4) {
                    return $$5.v() + 1;
                }
                ++$$6;
            }
            $$7 = $$9;
        }
        return Integer.MAX_VALUE;
    }

    private static boolean a(eoh $$0) {
        return $$0.l() || $$0.a(dzs.J) || $$0.a(dzs.K);
    }
}

