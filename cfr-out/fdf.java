/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class fdf
extends fdk {
    public static final MapCodec<fdf> a = RecordCodecBuilder.mapCodec($$0 -> fdf.a($$0).apply((Applicative)$$0, fdf::new));
    private static final double b = 0.618;
    private static final double h = 1.382;
    private static final double i = 0.381;
    private static final double j = 0.328;

    public fdf(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected fdl<?> a() {
        return fdl.f;
    }

    @Override
    public List<fbo.a> a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, fay $$5) {
        int $$12;
        int $$6 = 5;
        int $$7 = $$3 + 2;
        int $$8 = bgj.c((double)$$7 * 0.618);
        fdf.a($$0, $$1, $$2, $$4.e(), $$5);
        double $$9 = 1.0;
        int $$10 = Math.min(1, bgj.c(1.382 + Math.pow(1.0 * (double)$$7 / 13.0, 2.0)));
        int $$11 = $$4.v() + $$8;
        ArrayList $$13 = Lists.newArrayList();
        $$13.add(new a($$4.b($$12), $$11));
        for ($$12 = $$7 - 5; $$12 >= 0; --$$12) {
            float $$14 = fdf.b($$7, $$12);
            if ($$14 < 0.0f) continue;
            for (int $$15 = 0; $$15 < $$10; ++$$15) {
                is $$22;
                double $$16 = 1.0;
                double $$17 = 1.0 * (double)$$14 * ((double)$$2.i() + 0.328);
                double $$18 = (double)($$2.i() * 2.0f) * Math.PI;
                double $$19 = $$17 * Math.sin($$18) + 0.5;
                double $$20 = $$17 * Math.cos($$18) + 0.5;
                is $$21 = $$4.b(bgj.c($$19), $$12 - 1, bgj.c($$20));
                if (!this.a($$0, $$1, $$2, $$21, $$22 = $$21.b(5), false, $$5)) continue;
                int $$23 = $$4.u() - $$21.u();
                int $$24 = $$4.w() - $$21.w();
                double $$25 = (double)$$21.v() - Math.sqrt($$23 * $$23 + $$24 * $$24) * 0.381;
                int $$26 = $$25 > (double)$$11 ? $$11 : (int)$$25;
                is $$27 = new is($$4.u(), $$26, $$4.w());
                if (!this.a($$0, $$1, $$2, $$27, $$21, false, $$5)) continue;
                $$13.add(new a($$21, $$27.v()));
            }
        }
        this.a($$0, $$1, $$2, $$4, $$4.b($$8), true, $$5);
        this.a($$0, $$1, $$2, $$7, $$4, $$13, $$5);
        ArrayList $$28 = Lists.newArrayList();
        for (a $$29 : $$13) {
            if (!this.a($$7, $$29.a() - $$4.v())) continue;
            $$28.add($$29.a);
        }
        return $$28;
    }

    private boolean a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$22, is $$3, is $$4, boolean $$5, fay $$6) {
        if (!$$5 && Objects.equals($$3, $$4)) {
            return true;
        }
        is $$7 = $$4.b(-$$3.u(), -$$3.v(), -$$3.w());
        int $$8 = this.a($$7);
        float $$9 = (float)$$7.u() / (float)$$8;
        float $$10 = (float)$$7.v() / (float)$$8;
        float $$11 = (float)$$7.w() / (float)$$8;
        for (int $$12 = 0; $$12 <= $$8; ++$$12) {
            is $$13 = $$3.b(bgj.b(0.5f + (float)$$12 * $$9), bgj.b(0.5f + (float)$$12 * $$10), bgj.b(0.5f + (float)$$12 * $$11));
            if ($$5) {
                this.a($$0, $$1, $$22, $$13, $$6, (eoh $$2) -> (eoh)$$2.c(egl.d, this.a($$3, $$13)));
                continue;
            }
            if (this.b($$0, $$13)) continue;
            return false;
        }
        return true;
    }

    private int a(is $$0) {
        int $$1 = bgj.a($$0.u());
        int $$2 = bgj.a($$0.v());
        int $$3 = bgj.a($$0.w());
        return Math.max($$1, Math.max($$2, $$3));
    }

    private iz.a a(is $$0, is $$1) {
        int $$4;
        iz.a $$2 = iz.a.b;
        int $$3 = Math.abs($$1.u() - $$0.u());
        int $$5 = Math.max($$3, $$4 = Math.abs($$1.w() - $$0.w()));
        if ($$5 > 0) {
            $$2 = $$3 == $$5 ? iz.a.a : iz.a.c;
        }
        return $$2;
    }

    private boolean a(int $$0, int $$1) {
        return (double)$$1 >= (double)$$0 * 0.2;
    }

    private void a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, int $$3, is $$4, List<a> $$5, fay $$6) {
        for (a $$7 : $$5) {
            int $$8 = $$7.a();
            is $$9 = new is($$4.u(), $$8, $$4.w());
            if ($$9.equals($$7.a.a()) || !this.a($$3, $$8 - $$4.v())) continue;
            this.a($$0, $$1, $$2, $$9, $$7.a.a(), true, $$6);
        }
    }

    private static float b(int $$0, int $$1) {
        if ((float)$$1 < (float)$$0 * 0.3f) {
            return -1.0f;
        }
        float $$2 = (float)$$0 / 2.0f;
        float $$3 = $$2 - (float)$$1;
        float $$4 = bgj.a($$2 * $$2 - $$3 * $$3);
        if ($$3 == 0.0f) {
            $$4 = $$2;
        } else if (Math.abs($$3) >= $$2) {
            return 0.0f;
        }
        return $$4 * 0.5f;
    }

    static class a {
        final fbo.a a;
        private final int b;

        public a(is $$0, int $$1) {
            this.a = new fbo.a($$0, 0, false);
            this.b = $$1;
        }

        public int a() {
            return this.b;
        }
    }
}

