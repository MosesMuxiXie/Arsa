/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class enn
extends elb {
    private final enq a = new enq();
    private final enr b = new enr();
    private final eno c = new eno();
    private enp d = enp.b;

    public enn(is $$0, eoh $$1) {
        super(eld.T, $$0, $$1);
    }

    @Override
    public @Nullable aay<adb> ax_() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return bhs.a(new uz(), (? super T $$1) -> $$1.a("shared_data", enr.b, $$0.a(vn.a), this.b));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("config", enp.c, this.d);
        $$0.a("shared_data", enr.b, this.b);
        $$0.a("server_data", enq.b, this.a);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        $$0.a("server_data", enq.b).ifPresent(this.a::a);
        this.d = $$0.a("config", enp.c).orElse(enp.b);
        $$0.a("shared_data", enr.b).ifPresent(this.b::a);
    }

    public @Nullable enq a() {
        return this.n == null || this.n.B_() ? null : this.a;
    }

    public enr c() {
        return this.b;
    }

    public eno d() {
        return this.c;
    }

    public enp f() {
        return this.d;
    }

    @VisibleForTesting
    public void a(enp $$0) {
        this.d = $$0;
    }

    public static final class a {
        private static final int a = 20;
        private static final float b = 0.5f;
        private static final float c = 0.02f;
        private static final int d = 20;
        private static final int e = 20;

        public static void a(dwo $$0, is $$1, eoh $$2, eno $$3, enr $$4) {
            $$3.c();
            if ($$0.au() % 20L == 0L) {
                enn$a.a($$0, $$1, $$2, $$4);
            }
            enn$a.a($$0, $$1, $$4, $$2.c(ejf.d) != false ? ly.O : ly.aN);
            enn$a.a($$0, $$1, $$4);
        }

        public static void a(dwo $$0, is $$1, eoh $$2, enr $$3, lw $$4) {
            enn$a.a($$0, $$1, $$2, $$3);
            bgr $$5 = $$0.y;
            for (int $$6 = 0; $$6 < 20; ++$$6) {
                ftm $$7 = enn$a.b($$1, $$5);
                $$0.a(ly.ai, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
                $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            }
        }

        public static void a(dwo $$0, is $$1, lw $$2) {
            bgr $$3 = $$0.y;
            for (int $$4 = 0; $$4 < 20; ++$$4) {
                ftm $$5 = enn$a.a($$1, $$3);
                ftm $$6 = new ftm($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
                $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
            }
        }

        private static void a(dwo $$0, is $$1, enr $$2, lw $$3) {
            bgr $$4 = $$0.G_();
            if ($$4.i() <= 0.5f) {
                ftm $$5 = enn$a.b($$1, $$4);
                $$0.a(ly.ai, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
                if (enn$a.a($$2)) {
                    $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
                }
            }
        }

        private static void a(dwo $$0, ftm $$1, ddm $$2) {
            bgr $$3 = $$0.y;
            ftm $$4 = $$1.a($$2.dI().b(0.0, $$2.dG() / 2.0f, 0.0));
            int $$5 = bgj.a($$3, 2, 5);
            for (int $$6 = 0; $$6 < $$5; ++$$6) {
                ftm $$7 = $$4.a($$3, 1.0f);
                $$0.a(ly.be, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
            }
        }

        private static void a(dwo $$0, is $$1, eoh $$2, enr $$3) {
            Set<UUID> $$4 = $$3.d();
            if ($$4.isEmpty()) {
                return;
            }
            ftm $$5 = enn$a.a($$1, $$2.c(ejf.c));
            for (UUID $$6 : $$4) {
                ddm $$7 = $$0.c($$6);
                if ($$7 == null || !enn$a.a($$1, $$3, $$7)) continue;
                enn$a.a($$0, $$5, $$7);
            }
        }

        private static boolean a(is $$0, enr $$1, ddm $$2) {
            return $$2.dK().j($$0) <= bgj.n($$1.e());
        }

        private static void a(dwo $$0, is $$1, enr $$2) {
            if (!enn$a.a($$2)) {
                return;
            }
            bgr $$3 = $$0.G_();
            if ($$3.i() <= 0.02f) {
                $$0.a($$1, bda.DT, bdb.e, $$3.i() * 0.25f + 0.75f, $$3.i() + 0.5f, false);
            }
        }

        public static boolean a(enr $$0) {
            return $$0.b();
        }

        private static ftm a(is $$0, bgr $$1) {
            return ftm.a($$0).b(bgj.a($$1, 0.4, 0.6), bgj.a($$1, 0.4, 0.6), bgj.a($$1, 0.4, 0.6));
        }

        private static ftm b(is $$0, bgr $$1) {
            return ftm.a($$0).b(bgj.a($$1, 0.1, 0.9), bgj.a($$1, 0.25, 0.75), bgj.a($$1, 0.1, 0.9));
        }

        private static ftm a(is $$0, iz $$1) {
            return ftm.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
        }
    }

    public static final class b {
        private static final int a = 14;
        private static final int b = 20;
        private static final int c = 15;

        public static void a(axf $$0, is $$1, eoh $$2, enp $$3, enq $$4, enr $$5) {
            ens $$6 = $$2.c(ejf.b);
            if (enn$b.a($$0.au(), $$6)) {
                enn$b.a($$0, $$6, $$3, $$5, $$1);
            }
            eoh $$7 = $$2;
            if ($$0.au() >= $$4.c() && $$2 != ($$7 = (eoh)$$7.b(ejf.b, $$6.a($$0, $$1, $$3, $$4, $$5)))) {
                enn$b.a($$0, $$1, $$2, $$7, $$3, $$5);
            }
            if ($$4.c || $$5.c) {
                enn.a($$0, $$1, $$2);
                if ($$5.c) {
                    $$0.a($$1, $$2, $$7, 2);
                }
                $$4.c = false;
                $$5.c = false;
            }
        }

        public static void a(axf $$0, is $$1, eoh $$2, enp $$3, enq $$4, enr $$5, ddm $$6, dlt $$7) {
            ens $$8 = $$2.c(ejf.b);
            if (!enn$b.a($$3, $$8)) {
                return;
            }
            if (!enn$b.a($$3, $$7)) {
                enn$b.a($$0, $$4, $$1, bda.Ec);
                return;
            }
            if ($$4.a($$6)) {
                enn$b.a($$0, $$4, $$1, bda.DY);
                return;
            }
            List<dlt> $$9 = enn$b.a($$0, $$3, $$1, $$6, $$7);
            if ($$9.isEmpty()) {
                return;
            }
            $$6.b(bdk.c.b($$7.h()));
            $$7.a($$3.e().N(), (chl)$$6);
            enn$b.a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
            $$4.b($$6);
            $$5.a($$0, $$1, $$4, $$3, $$3.d());
        }

        static void a(axf $$0, is $$1, eoh $$2, eoh $$3, enp $$4, enr $$5) {
            ens $$6 = $$2.c(ejf.b);
            ens $$7 = $$3.c(ejf.b);
            $$0.a($$1, $$3, 3);
            $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(ejf.d));
        }

        static void a(axf $$0, ens $$1, enp $$2, enr $$3, is $$4) {
            if (!enn$b.a($$2, $$1)) {
                $$3.a(dlt.l);
                return;
            }
            dlt $$5 = enn$b.a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
        }

        private static dlt a(axf $$0, is $$1, amt<fof> $$2) {
            fod $$4;
            fof $$3 = $$0.s().be().a($$2);
            ObjectArrayList<dlt> $$5 = $$3.a($$4 = new fod.a($$0).a(fqx.h, ftm.b($$1)).a(fqw.l), $$0.G_());
            if ($$5.isEmpty()) {
                return dlt.l;
            }
            return bhs.a($$5, $$0.G_());
        }

        private static void a(axf $$0, eoh $$1, is $$2, enp $$3, enq $$4, enr $$5, List<dlt> $$6) {
            $$4.a($$6);
            $$5.a($$4.f());
            $$4.b($$0.au() + 14L);
            enn$b.a($$0, $$2, $$1, (eoh)$$1.b(ejf.b, ens.c), $$3, $$5);
        }

        private static List<dlt> a(axf $$0, enp $$1, is $$2, ddm $$3, dlt $$4) {
            fof $$5 = $$0.s().be().a($$1.b());
            fod $$6 = new fod.a($$0).a(fqx.h, ftm.b($$2)).a($$3.eB()).a(fqx.a, $$3).a(fqx.k, $$4).a(fqw.l);
            return $$5.a($$6);
        }

        private static boolean a(enp $$0, ens $$1) {
            return !$$0.e().f() && $$1 != ens.a;
        }

        private static boolean a(enp $$0, dlt $$1) {
            return dlt.c($$1, $$0.e()) && $$1.N() >= $$0.e().N();
        }

        private static boolean a(long $$0, ens $$1) {
            return $$0 % 20L == 0L && $$1 == ens.b;
        }

        private static void a(axf $$0, enq $$1, is $$2, bcz $$3) {
            if ($$0.au() >= $$1.a() + 15L) {
                $$0.a(null, $$2, $$3, bdb.e);
                $$1.a($$0.au());
            }
        }
    }
}

