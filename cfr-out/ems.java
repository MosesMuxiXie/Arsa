/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ems
extends elb {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 90;
    private static final int c = 10;
    private static final boolean d = false;
    private @Nullable UUID e;
    private emt f = this.f();
    private emt g = this.f();
    private boolean h = false;

    public ems(is $$0, eoh $$1) {
        this((eld)eld.h, $$0, $$1);
    }

    public ems(eld $$0, is $$1, eoh $$2) {
        super($$0, $$1, $$2);
    }

    protected emt f() {
        return new emt();
    }

    public boolean a(ddm $$0) {
        dzq dzq2 = this.o().b();
        if (dzq2 instanceof ehf) {
            float $$6;
            ehf $$1 = (ehf)dzq2;
            ftm $$2 = $$1.p(this.o());
            double $$3 = $$0.dP() - ((double)this.aD_().u() + $$2.g);
            double $$4 = $$0.dV() - ((double)this.aD_().w() + $$2.i);
            float $$5 = $$1.h(this.o());
            return bgj.e($$5, $$6 = (float)(bgj.d($$4, $$3) * 57.2957763671875) - 90.0f) <= 90.0f;
        }
        return false;
    }

    public emt a(boolean $$0) {
        return $$0 ? this.f : this.g;
    }

    public emt h() {
        return this.f;
    }

    public emt k() {
        return this.g;
    }

    public int a() {
        return 10;
    }

    public int c() {
        return 90;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("front_text", emt.a, this.f);
        $$0.a("back_text", emt.a, this.g);
        $$0.a("is_waxed", this.h);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a("front_text", emt.a).map(this::a).orElseGet(emt::new);
        this.g = $$0.a("back_text", emt.a).map(this::a).orElseGet(emt::new);
        this.h = $$0.a("is_waxed", false);
    }

    private emt a(emt $$0) {
        for (int $$1 = 0; $$1 < 4; ++$$1) {
            yh $$2 = this.a($$0.a($$1, false));
            yh $$3 = this.a($$0.a($$1, true));
            $$0 = $$0.a($$1, $$2, $$3);
        }
        return $$0;
    }

    private yh a(yh $$0) {
        dwo dwo2 = this.n;
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            try {
                return yk.a(ems.a(null, $$1, this.o), $$0, null, 0);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }
        return $$0;
    }

    public void a(ddm $$0, boolean $$1, List<axy> $$22) {
        if (this.w() || !$$0.cY().equals(this.m()) || this.n == null) {
            a.warn("Player {} just tried to change non-editable sign", (Object)$$0.aq());
            return;
        }
        this.a($$2 -> this.a($$0, $$22, (emt)$$2), $$1);
        this.a((UUID)null);
        this.n.a(this.aD_(), this.o(), this.o(), 3);
    }

    public boolean a(UnaryOperator<emt> $$0, boolean $$1) {
        emt $$2 = this.a($$1);
        return this.a((emt)$$0.apply($$2), $$1);
    }

    private emt a(ddm $$0, List<axy> $$1, emt $$2) {
        for (int $$3 = 0; $$3 < $$1.size(); ++$$3) {
            axy $$4 = $$1.get($$3);
            zf $$5 = $$2.a($$3, $$0.Z()).a();
            $$2 = $$0.Z() ? $$2.a($$3, yh.b($$4.b()).b($$5)) : $$2.a($$3, yh.b($$4.d()).b($$5), yh.b($$4.b()).b($$5));
        }
        return $$2;
    }

    public boolean a(emt $$0, boolean $$1) {
        return $$1 ? this.c($$0) : this.b($$0);
    }

    private boolean b(emt $$0) {
        if ($$0 != this.g) {
            this.g = $$0;
            this.x();
            return true;
        }
        return false;
    }

    private boolean c(emt $$0) {
        if ($$0 != this.f) {
            this.f = $$0;
            this.x();
            return true;
        }
        return false;
    }

    public boolean a(boolean $$0, ddm $$1) {
        return this.w() && this.a($$0).b($$1);
    }

    public boolean a(axf $$0, ddm $$1, is $$2, boolean $$3) {
        boolean $$4 = false;
        block5: for (yh $$5 : this.a($$3).b($$1.Z())) {
            yf $$7;
            zf $$6 = $$5.a();
            yf yf2 = $$7 = $$6.i();
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{yf.g.class, yf.h.class, yf.d.class}, (Object)yf2, n2)) {
                case 0: {
                    yf.g $$8 = (yf.g)yf2;
                    $$0.s().aF().a(ems.a($$1, $$0, $$2), $$8.b());
                    $$4 = true;
                    continue block5;
                }
                case 1: {
                    yf.h $$9 = (yf.h)yf2;
                    $$1.b($$9.b());
                    $$4 = true;
                    continue block5;
                }
                case 2: {
                    yf.d $$10 = (yf.d)yf2;
                    $$0.s().a($$10.b(), $$10.c());
                    $$4 = true;
                    continue block5;
                }
            }
        }
        return $$4;
    }

    private static ed a(@Nullable ddm $$0, axf $$1, is $$2) {
        String $$3 = $$0 == null ? "Sign" : $$0.aq();
        yh $$4 = $$0 == null ? yh.b("Sign") : $$0.R_();
        return new ed(ec.a, ftm.b($$2), ftl.a, $$1, bbh.c, $$3, $$4, $$1.s(), $$0);
    }

    public adh l() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public void a(@Nullable UUID $$0) {
        this.e = $$0;
    }

    public @Nullable UUID m() {
        return this.e;
    }

    private void x() {
        this.e();
        this.n.a(this.aD_(), this.o(), this.o(), 3);
    }

    public boolean w() {
        return this.h;
    }

    public boolean b(boolean $$0) {
        if (this.h != $$0) {
            this.h = $$0;
            this.x();
            return true;
        }
        return false;
    }

    public boolean b(UUID $$0) {
        ddm $$1 = this.n.c($$0);
        return $$1 == null || !$$1.a(this.aD_(), 4.0);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, ems $$3) {
        UUID $$4 = $$3.m();
        if ($$4 != null) {
            $$3.a($$3, $$0, $$4);
        }
    }

    private void a(ems $$0, dwo $$1, UUID $$2) {
        if ($$0.b($$2)) {
            $$0.a((UUID)null);
        }
    }

    public bcz d() {
        return bda.Ft;
    }

    public /* synthetic */ aay ax_() {
        return this.l();
    }
}

