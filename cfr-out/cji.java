/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class cji
extends cjd<cth> {
    private final int c;
    private final csk d;
    private final float e;
    private final float f;
    private final double g;
    private final double h;
    private final bcz i;
    private ftm j;
    private ftm k;

    public cji(int $$0, csk $$1, float $$2, float $$3, double $$4, double $$5, bcz $$6) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.af, (Object)((Object)cqx.b), cqw.p, (Object)((Object)cqx.a)));
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.h = $$4;
        this.g = $$5;
        this.i = $$6;
        this.j = ftm.c;
        this.k = ftm.c;
    }

    @Override
    protected boolean a(axf $$0, cth $$1) {
        return $$1.ev().a(cqw.p);
    }

    @Override
    protected boolean a(axf $$0, cth $$1, long $$2) {
        cii $$6;
        cim<Integer> $$3 = $$1.ev();
        Optional<chl> $$4 = $$3.c(cqw.p);
        if ($$4.isEmpty()) {
            return false;
        }
        chl $$5 = $$4.get();
        if ($$1 instanceof cii && ($$6 = (cii)$$1).p()) {
            return false;
        }
        if ($$1.dI().d(this.k).h() >= this.h * this.h) {
            return false;
        }
        if ($$5.dI().d($$1.dI()).h() >= this.g * this.g) {
            return false;
        }
        if (!$$1.G($$5)) {
            return false;
        }
        return !$$3.a(cqw.af);
    }

    @Override
    protected void b(axf $$0, cth $$1, long $$2) {
        cim<?> $$3 = $$1.ev();
        this.k = $$1.dI();
        chl $$4 = $$3.c(cqw.p).get();
        ftm $$5 = $$4.dI().d($$1.dI()).d();
        this.j = $$5.c((double)this.e);
        if (this.a($$0, $$1, $$2)) {
            $$1.a(this.i);
        }
    }

    @Override
    protected void c(axf $$0, cth $$1, long $$22) {
        cim<?> $$3 = $$1.ev();
        chl $$4 = $$3.c(cqw.p).orElseThrow();
        $$1.a((cgk)$$4, 360.0f, 360.0f);
        $$1.k(this.j);
        ArrayList $$5 = new ArrayList(1);
        $$0.a(esw.a(chl.class), $$1.dj(), $$2 -> this.d.a($$0, $$1, (chl)$$2), $$5, 1);
        if (!$$5.isEmpty()) {
            chl $$6 = (chl)$$5.get(0);
            if ($$1.z($$6)) {
                return;
            }
            this.a($$0, $$1, $$6);
            this.a($$1, $$6);
            this.d($$0, $$1, $$22);
        }
    }

    private void a(axf $$0, cth $$1, chl $$2) {
        float $$4;
        cex $$3 = $$0.as().b($$1);
        if ($$2.a($$0, $$3, $$4 = (float)$$1.i(cis.d))) {
            dsq.a($$0, (cgk)$$2, $$3);
        }
    }

    private void a(cth $$0, chl $$1) {
        int $$2 = $$0.d(cfo.a) ? $$0.e(cfo.a).e() + 1 : 0;
        int $$3 = $$0.d(cfo.b) ? $$0.e(cfo.b).e() + 1 : 0;
        float $$4 = 0.25f * (float)($$2 - $$3);
        float $$5 = bgj.a(this.e * (float)$$0.i(cis.x), 0.2f, 2.0f) + $$4;
        $$0.a((cgk)$$1, $$5 * this.f, $$0.dN());
    }

    @Override
    protected void d(axf $$0, cth $$1, long $$2) {
        $$1.ev().a(cqw.af, this.c);
        $$1.ev().b(cqw.p);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cth)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (cth)chl2, l2);
    }
}

