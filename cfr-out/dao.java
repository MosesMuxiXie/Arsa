/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dao
extends cjd<dal> {
    private static final int c = 4;
    private static final int d = 10;
    private static final int e = 2;
    private static final int f = Math.round(10.0f);
    private static final float g = 24.0f;
    private static final float h = 1.4f;
    private static final float i = 0.058333334f;
    private static final ObjectArrayList<Integer> j = new ObjectArrayList((Collection)Lists.newArrayList((Object[])new Integer[]{40, 55, 60, 75, 80}));

    @VisibleForTesting
    public dao() {
        super(Map.of(cqw.p, cqx.a, cqw.bf, cqx.b, cqw.bk, cqx.c, cqw.bl, cqx.c, cqw.bg, cqx.b, cqw.n, cqx.b, cqw.bm, cqx.c), 200);
    }

    public static boolean a(axf $$0, dal $$1) {
        if (!$$1.aV() && !$$1.by()) {
            return false;
        }
        if (cmb.a($$1)) {
            return false;
        }
        if ($$1.ev().a(cqw.bl, cqx.a)) {
            return true;
        }
        chl $$2 = $$1.ev().c(cqw.p).orElse(null);
        if ($$2 == null) {
            return false;
        }
        if (dao.a($$1, $$2)) {
            $$1.ev().b(cqw.p);
            return false;
        }
        if (dao.b($$1, $$2)) {
            return false;
        }
        if (!dao.c($$0, $$1)) {
            return false;
        }
        is $$3 = dao.a((chl)$$1, dan.a($$2, $$1.ep()));
        if ($$3 == null) {
            return false;
        }
        eoh $$4 = $$0.a_($$3.e());
        if ($$1.ay().a($$4)) {
            return false;
        }
        if (!dan.a($$1, $$3.b()) && !dan.a($$1, $$3.b(4).b())) {
            return false;
        }
        $$1.ev().a(cqw.bl, $$3);
        return true;
    }

    protected boolean b(axf $$0, dal $$1) {
        return dao.a($$0, $$1);
    }

    @Override
    protected boolean a(axf $$0, dal $$1, long $$2) {
        return $$1.aF() != chx.a && !$$1.ev().a(cqw.bf);
    }

    @Override
    protected void b(axf $$0, dal $$12, long $$2) {
        if ($$12.ev().a(cqw.bk, cqx.b)) {
            $$12.ev().a(cqw.bk, bhr.a, f);
        }
        $$12.c(chx.r);
        $$0.a(null, $$12, bda.cQ, bdb.f, 1.0f, 1.0f);
        $$12.ev().c(cqw.bl).ifPresent($$1 -> $$12.a(ep.a.b, $$1.b()));
    }

    @Override
    protected void c(axf $$0, dal $$12, long $$2) {
        boolean $$3 = $$12.by();
        if (!$$3 && $$12.ev().a(cqw.bm, cqx.a)) {
            $$12.ev().b(cqw.bm);
        }
        if (dao.a($$12)) {
            ftm $$4 = $$12.ev().c(cqw.bl).flatMap($$1 -> dao.a($$12, $$12.ep(), ftm.c($$1))).orElse(null);
            if ($$4 == null) {
                $$12.c(chx.a);
                return;
            }
            if ($$3) {
                $$12.ev().a(cqw.bm, bhr.a);
            }
            $$12.a(bda.cW, 1.0f, 1.0f);
            $$12.c(chx.g);
            $$12.v($$12.bC);
            $$12.r(true);
            $$12.k($$4);
        } else if (dao.b($$12)) {
            $$12.a(bda.cX, 1.0f, 1.0f);
            $$12.c(chx.a);
            $$12.r(false);
            boolean $$5 = $$12.ev().a(cqw.y);
            $$12.ev().a(cqw.bf, bhr.a, $$5 ? 2L : 10L);
            $$12.ev().a(cqw.bg, bhr.a, 100L);
        }
    }

    @Override
    protected void d(axf $$0, dal $$1, long $$2) {
        if ($$1.aF() == chx.g || $$1.aF() == chx.r) {
            $$1.c(chx.a);
        }
        $$1.ev().b(cqw.bl);
        $$1.ev().b(cqw.bk);
        $$1.ev().b(cqw.bm);
    }

    private static boolean a(dal $$0) {
        return $$0.ev().c(cqw.bk).isEmpty() && $$0.aF() == chx.r;
    }

    private static boolean b(dal $$0) {
        boolean $$1 = $$0.aF() == chx.g;
        boolean $$2 = $$0.aV();
        boolean $$3 = $$0.by() && $$0.ev().a(cqw.bm, cqx.b);
        return $$1 && ($$2 || $$3);
    }

    private static @Nullable is a(chl $$0, ftm $$1) {
        dvw $$2 = new dvw($$1, $$1.a(iz.a, 10.0), dvw.a.a, dvw.b.a, $$0);
        fti $$3 = $$0.ao().a($$2);
        if (((ftk)$$3).d() == ftk.a.b) {
            return is.a($$3.g()).d();
        }
        dvw $$4 = new dvw($$1, $$1.a(iz.b, 10.0), dvw.a.a, dvw.b.a, $$0);
        fti $$5 = $$0.ao().a($$4);
        if (((ftk)$$5).d() == ftk.a.b) {
            return is.a($$5.g()).d();
        }
        return null;
    }

    private static boolean a(dal $$0, chl $$1) {
        return !$$1.a((cgk)$$0, $$0.i(cis.o));
    }

    private static boolean b(dal $$0, chl $$1) {
        return $$1.f((cgk)$$0) - 4.0f <= 0.0f;
    }

    private static boolean c(axf $$0, dal $$1) {
        is $$2 = $$1.dK();
        if ($$0.a_($$2).a(dzs.qg)) {
            return false;
        }
        for (int $$3 = 1; $$3 <= 4; ++$$3) {
            is $$4 = $$2.a(iz.b, $$3);
            if ($$0.a_($$4).l() || $$0.b_($$4).a(bdv.a)) continue;
            return false;
        }
        return true;
    }

    private static Optional<ftm> a(dal $$0, bgr $$12, ftm $$2) {
        List<Integer> $$3 = bhs.a(j, $$12);
        for (int $$4 : $$3) {
            float $$5 = 0.058333334f * (float)$$0.i(cis.o);
            Optional<ftm> $$6 = cki.a($$0, $$2, $$5, $$4, false);
            if (!$$6.isPresent()) continue;
            if ($$0.d(cfo.h)) {
                double $$7 = $$6.get().d().h * (double)$$0.fG();
                return $$6.map($$1 -> $$1.b(0.0, $$7, 0.0));
            }
            return $$6;
        }
        return Optional.empty();
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2) {
        return this.b(axf2, (dal)chl2);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dal)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dal)chl2, l2);
    }
}

