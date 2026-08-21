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

public class eco
extends ecy {
    public static final MapCodec<eco> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("open").forGetter($$0 -> $$0.f.c), eco.x()).apply((Applicative)$$02, eco::new));
    private static final int d = 3;
    private static final int e = 2;
    private final a f;

    public MapCodec<? extends eco> a() {
        return a;
    }

    public eco(a $$0, eog.d $$1) {
        super($$0.d, $$0.e, $$1);
        this.f = $$0;
    }

    public eco(boolean $$0, eog.d $$1) {
        super(eco$a.a((boolean)$$0).d, eco$a.a((boolean)$$0).e, $$1);
        this.f = eco$a.a($$0);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        eoh $$4;
        if (this.f.d() && $$3.a(700) == 0 && ($$4 = $$1.a_($$2.e())).a(dzs.uT)) {
            $$1.a($$2.u(), (double)$$2.v(), (double)$$2.w(), bda.ku, bdb.i, 1.0f, 1.0f, false);
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (this.c($$0, $$1, $$2, $$3)) {
            $$1.a(null, $$2, this.f.c().f, bdb.e, 1.0f, 1.0f);
        }
        super.b($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (this.c($$0, $$1, $$2, $$3)) {
            $$1.a(null, $$2, this.f.c().g, bdb.e, 1.0f, 1.0f);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private boolean c(eoh $$0, axf $$1, is $$2, bgr $$3) {
        boolean $$42 = $$1.c().a(ceg.H, $$2).b(this.f.c);
        if ($$42 == this.f.c) {
            return false;
        }
        a $$5 = this.f.c();
        $$1.a($$2, $$5.b(), 3);
        $$1.a(etk.c, $$2, etk.a.a($$0));
        $$5.a($$1, $$2, $$3);
        is.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4 -> {
            eoh $$5 = $$1.a_((is)$$4);
            if ($$5 == $$0) {
                double $$6 = Math.sqrt($$2.j((jy)$$4));
                int $$7 = $$3.a((int)($$6 * 5.0), (int)($$6 * 10.0));
                $$1.a((is)$$4, $$0.b(), $$7);
            }
        });
        return true;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if (!$$1.B_() && $$1.av() != ccz.a && $$3 instanceof ctw) {
            ctw $$6 = (ctw)$$3;
            if (ctw.c($$0) && !$$6.d(cfo.s)) {
                $$6.a(this.b());
            }
        }
    }

    @Override
    public cfm b() {
        return new cfm(cfo.s, 25);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(true, cfo.o, 11.0f, bda.kq, bda.kr, 16545810);
        public static final /* enum */ a b = new a(false, cfo.i, 7.0f, bda.ks, bda.kt, 0x5F5F5F);
        final boolean c;
        final jd<cfk> d;
        final float e;
        final bcz f;
        final bcz g;
        private final int h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, jd<cfk> $$1, float $$2, bcz $$3, bcz $$4, int $$5) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
        }

        public dzq a() {
            return this.c ? dzs.uW : dzs.uX;
        }

        public eoh b() {
            return this.a().m();
        }

        public a c() {
            return eco$a.a(!this.c);
        }

        public boolean d() {
            return this.c;
        }

        public static a a(boolean $$0) {
            return $$0 ? a : b;
        }

        public void a(axf $$0, is $$1, bgr $$2) {
            ftm $$3 = $$1.b();
            double $$4 = 0.5 + $$2.j();
            ftm $$5 = new ftm($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
            ftm $$6 = $$3.e($$5.c($$4));
            mf $$7 = new mf($$6, this.h, (int)(20.0 * $$4));
            $$0.a($$7, $$3.g, $$3.h, $$3.i, 1, 0.0, 0.0, 0.0, 0.0);
        }

        public bcz e() {
            return this.f;
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b};
        }

        static {
            i = eco$a.f();
        }
    }
}

