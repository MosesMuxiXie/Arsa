/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class eet
extends ego
implements ehg {
    public static final MapCodec<eet> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)enu.a.fieldOf("tree").forGetter($$0 -> $$0.g), eet.x()).apply((Applicative)$$02, eet::new));
    public static final eph b = eox.ax;
    public static final int c = 4;
    private static final int[] h = new int[]{13, 10, 7, 3, 0};
    private static final fug[] i = dzq.a(4, (int $$0) -> dzq.b(2.0, h[$$0], 16.0));
    private static final eoy D = eox.I;
    public static final eoy d = eox.m;

    public MapCodec<eet> a() {
        return a;
    }

    public eet(enu $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, 0)).b(b, 0)).b(D, false)).b(d, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{f}).a(new epk[]{b}).a(new epk[]{D}).a(new epk[]{d});
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return super.b($$0, $$1, $$2) || $$0.a(dzs.eu);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == flc.c;
        return (eoh)((eoh)super.a($$0).b(D, $$2)).b(b, 4);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        int $$4 = $$0.c(d) != false ? $$0.c(b) : 4;
        return i[$$4].a($$0.a($$2));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        if (eet.p($$0)) {
            return $$1.a_($$2.d()).a(dzs.aS);
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(D).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 == iz.b && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(D).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!eet.p($$0)) {
            if ($$3.a(7) == 0) {
                this.a($$1, $$2, $$0, $$3);
            }
            return;
        }
        if (!eet.r($$0)) {
            $$1.a($$2, (eoh)$$0.a(b), 2);
        }
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return !eet.p($$2) || !eet.r($$2);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return eet.p($$3) ? !eet.r($$3) : super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        if (eet.p($$3) && !eet.r($$3)) {
            $$0.a($$2, (eoh)$$3.a(b), 2);
        } else {
            super.a($$0, $$1, $$2, $$3);
        }
    }

    private static boolean p(eoh $$0) {
        return $$0.c(d);
    }

    private static boolean r(eoh $$0) {
        return $$0.c(b) == 4;
    }

    public static eoh c() {
        return eet.b(0);
    }

    public static eoh b(int $$0) {
        return (eoh)((eoh)dzs.H.m().b(d, true)).b(b, $$0);
    }
}

