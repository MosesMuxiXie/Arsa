/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ena
extends enb {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 200;
    private static final int c = 40;
    private static final int d = 2400;
    private static final int e = 1;
    private static final int f = 10;
    private static final long g = 0L;
    private static final boolean h = false;
    private long i = 0L;
    private int j;
    private @Nullable is k;
    private boolean l = false;

    public ena(is $$0, eoh $$1) {
        super(eld.w, $$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Age", this.i);
        $$0.b("exit_portal", is.a, this.k);
        if (this.l) {
            $$0.a("ExactTeleport", true);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.i = $$0.a("Age", 0L);
        this.k = $$0.a("exit_portal", is.a).filter(dwo::p).orElse(null);
        this.l = $$0.a("ExactTeleport", false);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, ena $$3) {
        ++$$3.i;
        if ($$3.c()) {
            --$$3.j;
        }
    }

    public static void b(dwo $$0, is $$1, eoh $$2, ena $$3) {
        boolean $$4 = $$3.a();
        boolean $$5 = $$3.c();
        ++$$3.i;
        if ($$5) {
            --$$3.j;
        } else if ($$3.i % 2400L == 0L) {
            ena.c($$0, $$1, $$2, $$3);
        }
        if ($$4 != $$3.a() || $$5 != $$3.c()) {
            ena.a($$0, $$1, $$2);
        }
    }

    public boolean a() {
        return this.i < 200L;
    }

    public boolean c() {
        return this.j > 0;
    }

    public float a(float $$0) {
        return bgj.a(((float)this.i + $$0) / 200.0f, 0.0f, 1.0f);
    }

    public float b(float $$0) {
        return 1.0f - bgj.a(((float)this.j - $$0) / 40.0f, 0.0f, 1.0f);
    }

    public adh d() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public static void c(dwo $$0, is $$1, eoh $$2, ena $$3) {
        if (!$$0.B_()) {
            $$3.j = 40;
            $$0.a($$1, $$2.b(), 1, 0);
            ena.a($$0, $$1, $$2);
        }
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if ($$0 == 1) {
            this.j = 40;
            return true;
        }
        return super.a_($$0, $$1);
    }

    public @Nullable ftm a(axf $$0, is $$1) {
        if (this.k == null && $$0.aq() == dwo.j) {
            is $$2 = ena.b($$0, $$1);
            $$2 = $$2.b(10);
            a.debug("Creating portal at {}", (Object)$$2);
            ena.a($$0, $$2, faa.a($$1, false));
            this.a($$2, this.l);
        }
        if (this.k != null) {
            is $$3 = this.l ? this.k : ena.a((dwo)$$0, this.k);
            return $$3.c();
        }
        return null;
    }

    private static is a(dwo $$0, is $$1) {
        is $$2 = ena.a((dvt)$$0, $$1.b(0, 2, 0), 5, false);
        a.debug("Best exit position for portal at {} is {}", (Object)$$1, (Object)$$2);
        return $$2.d();
    }

    private static is b(axf $$02, is $$1) {
        ftm $$22 = ena.c($$02, $$1);
        eqq $$3 = ena.a((dwo)$$02, $$22);
        is $$4 = ena.a($$3);
        if ($$4 == null) {
            is $$5 = is.a($$22.g + 0.5, 75.0, $$22.i + 0.5);
            a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", (Object)$$5);
            $$02.J_().a(mj.aY).flatMap($$0 -> $$0.a(rr.f)).ifPresent($$2 -> ((exi)$$2.a()).a($$02, $$02.p().g(), bgr.a($$5.a()), $$5));
            $$4 = $$5;
        } else {
            a.debug("Found suitable block to teleport to: {}", (Object)$$4);
        }
        return ena.a((dvt)$$02, $$4, 16, true);
    }

    private static ftm c(axf $$0, is $$1) {
        ftm $$2 = new ftm($$1.u(), 0.0, $$1.w()).d();
        int $$3 = 1024;
        ftm $$4 = $$2.c(1024.0);
        int $$5 = 16;
        while (!ena.a($$0, $$4) && $$5-- > 0) {
            a.debug("Skipping backwards past nonempty chunk at {}", (Object)$$4);
            $$4 = $$4.e($$2.c(-16.0));
        }
        $$5 = 16;
        while (ena.a($$0, $$4) && $$5-- > 0) {
            a.debug("Skipping forward past empty chunk at {}", (Object)$$4);
            $$4 = $$4.e($$2.c(16.0));
        }
        a.debug("Found chunk at {}", (Object)$$4);
        return $$4;
    }

    private static boolean a(axf $$0, ftm $$1) {
        return ena.a((dwo)$$0, $$1).a() == -1;
    }

    private static is a(dvt $$0, is $$1, int $$2, boolean $$3) {
        jy $$4 = null;
        for (int $$5 = -$$2; $$5 <= $$2; ++$$5) {
            block1: for (int $$6 = -$$2; $$6 <= $$2; ++$$6) {
                if ($$5 == 0 && $$6 == 0 && !$$3) continue;
                for (int $$7 = $$0.aw(); $$7 > ($$4 == null ? $$0.K_() : $$4.v()); --$$7) {
                    is $$8 = new is($$1.u() + $$5, $$7, $$1.w() + $$6);
                    eoh $$9 = $$0.a_($$8);
                    if (!$$9.m($$0, $$8) || !$$3 && $$9.a(dzs.I)) continue;
                    $$4 = $$8;
                    continue block1;
                }
            }
        }
        return $$4 == null ? $$1 : $$4;
    }

    private static eqq a(dwo $$0, ftm $$1) {
        return $$0.d(bgj.c($$1.g / 16.0), bgj.c($$1.i / 16.0));
    }

    private static @Nullable is a(eqq $$0) {
        dvu $$1 = $$0.f();
        is $$2 = new is($$1.e(), 30, $$1.f());
        int $$3 = $$0.b() + 16 - 1;
        is $$4 = new is($$1.g(), $$3, $$1.h());
        is $$5 = null;
        double $$6 = 0.0;
        for (is $$7 : is.c($$2, $$4)) {
            eoh $$8 = $$0.a_($$7);
            is $$9 = $$7.d();
            is $$10 = $$7.b(2);
            if (!$$8.a(dzs.go) || $$0.a_($$9).m($$0, $$9) || $$0.a_($$10).m($$0, $$10)) continue;
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 != null && !($$11 < $$6)) continue;
            $$5 = $$7;
            $$6 = $$11;
        }
        return $$5;
    }

    private static void a(axf $$0, is $$1, faa $$2) {
        exx.N.a($$2, $$0, $$0.p().g(), bgr.a(), $$1);
    }

    @Override
    public boolean a(iz $$0) {
        return dzq.a(this.o(), this.n.a_(this.aD_().a($$0)), $$0);
    }

    public int f() {
        int $$0 = 0;
        for (iz $$1 : iz.values()) {
            $$0 += this.a($$1) ? 1 : 0;
        }
        return $$0;
    }

    public void a(is $$0, boolean $$1) {
        this.l = $$1;
        this.k = $$0;
        this.e();
    }

    public /* synthetic */ aay ax_() {
        return this.d();
    }
}

