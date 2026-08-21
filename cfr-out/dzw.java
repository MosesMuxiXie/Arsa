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

public class dzw
extends dzc
implements ecq {
    public static final MapCodec<dzw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)mi.e.q().fieldOf("turns_into").forGetter(dzw::b), (App)mi.b.q().fieldOf("brush_sound").forGetter(dzw::c), (App)mi.b.q().fieldOf("brush_completed_sound").forGetter(dzw::d), dzw.x()).apply((Applicative)$$0, dzw::new));
    private static final eph c = eox.bA;
    public static final int b = 2;
    private final dzq d;
    private final bcz e;
    private final bcz f;

    public MapCodec<dzw> a() {
        return a;
    }

    public dzw(dzq $$0, bcz $$1, bcz $$2, eog.d $$3) {
        super($$3);
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        $$1.a($$2, (dzq)this, 2);
    }

    @Override
    public eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        $$2.a($$3, this, 2);
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        elb elb2 = $$1.c_($$2);
        if (elb2 instanceof elg) {
            elg $$4 = (elg)elb2;
            $$4.a($$1);
        }
        if (!ecr.n($$1.a_($$2.e())) || $$2.v() < $$1.K_()) {
            return;
        }
        czk $$5 = czk.a($$1, $$2, $$0);
        $$5.f();
    }

    @Override
    public void a(dwo $$0, is $$1, czk $$2) {
        ftm $$3 = $$2.dj().f();
        $$0.c(2001, is.a($$3), dzq.j($$2.i()));
        $$0.a((cgk)$$2, etk.f, $$3);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        is $$4;
        if ($$3.a(16) == 0 && ecr.n($$1.a_($$4 = $$2.e()))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lp(ly.D, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new elg($$0, $$1);
    }

    public dzq b() {
        return this.d;
    }

    public bcz c() {
        return this.e;
    }

    public bcz d() {
        return this.f;
    }
}

