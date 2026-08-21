/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hxo<T extends czc>
extends hwp<T, ief> {
    public static final int a = 5;
    public static final int f = 30;
    private final ihk g;
    private final hok h;
    private final hpw i;

    public hxo(hwq.a $$0) {
        super($$0);
        this.g = $$0.b();
        this.h = $$0.c();
        this.i = $$0.d();
    }

    @Override
    protected int a(T $$0, is $$1) {
        if (((cgk)$$0).ay() == cgu.ak) {
            return Math.max(5, super.a($$0, $$1));
        }
        return super.a($$0, $$1);
    }

    @Override
    public void a(ief $$0, fzm $$1, hpo $$2, ikp $$3) {
        float $$10;
        float $$9;
        super.a($$0, $$1, $$2, $$3);
        $$1.a();
        iz $$4 = $$0.a;
        ftm $$5 = this.a($$0);
        $$1.a(-$$5.a(), -$$5.b(), -$$5.c());
        double $$6 = 0.46875;
        $$1.a((double)$$4.j() * 0.46875, (double)$$4.k() * 0.46875, (double)$$4.l() * 0.46875);
        if ($$4.o().d()) {
            float $$7 = 0.0f;
            float $$8 = 180.0f - $$4.p();
        } else {
            $$9 = -90 * $$4.f().a();
            $$10 = 180.0f;
        }
        $$1.a((Quaternionfc)a.b.rotationDegrees($$9));
        $$1.a((Quaternionfc)a.d.rotationDegrees($$10));
        if (!$$0.Q) {
            eoh $$11 = inn.a($$0.d, $$0.e != null);
            hqh $$12 = this.i.a($$11);
            $$1.a();
            $$1.a(-0.5f, -0.5f, -0.5f);
            $$2.a($$1, ijt.e(ilo.d), $$12, 1.0f, 1.0f, 1.0f, $$0.T, ilg.d, $$0.U);
            $$1.b();
        }
        if ($$0.Q) {
            $$1.a(0.0f, 0.0f, 0.5f);
        } else {
            $$1.a(0.0f, 0.0f, 0.4375f);
        }
        if ($$0.e != null) {
            int $$13 = $$0.c % 4 * 2;
            $$1.a((Quaternionfc)a.f.rotationDegrees((float)$$13 * 360.0f / 8.0f));
            $$1.a((Quaternionfc)a.f.rotationDegrees(180.0f));
            float $$14 = 0.0078125f;
            $$1.b(0.0078125f, 0.0078125f, 0.0078125f);
            $$1.a(-64.0f, -64.0f, 0.0f);
            $$1.a(0.0f, 0.0f, -1.0f);
            int $$15 = this.a($$0.d, 15728850, $$0.T);
            this.h.a($$0.f, $$1, $$2, true, $$15);
        } else if (!$$0.b.e()) {
            $$1.a((Quaternionfc)a.f.rotationDegrees((float)$$0.c * 360.0f / 8.0f));
            int $$16 = this.a($$0.d, 0xF000F0, $$0.T);
            $$1.b(0.5f, 0.5f, 0.5f);
            $$0.b.a($$1, $$2, $$16, ilg.d, $$0.U);
        }
        $$1.b();
    }

    private int a(boolean $$0, int $$1, int $$2) {
        return $$0 ? $$1 : $$2;
    }

    @Override
    public ftm a(ief $$0) {
        return new ftm((float)$$0.a.j() * 0.3f, -0.25, (float)$$0.a.l() * 0.3f);
    }

    @Override
    protected boolean a(T $$0, double $$1) {
        return gfj.S() && this.c.c == $$0 && ((czc)$$0).w().z() != null;
    }

    protected yh a(T $$0) {
        return ((czc)$$0).w().y();
    }

    public ief a() {
        return new ief();
    }

    @Override
    public void a(T $$0, ief $$1, float $$2) {
        fmw $$5;
        fmu $$4;
        super.a($$0, $$1, $$2);
        $$1.a = ((czb)$$0).dg();
        dlt $$3 = ((czc)$$0).w();
        this.g.a($$1.b, $$3, dlr.i, (cgk)$$0);
        $$1.c = ((czc)$$0).y();
        $$1.d = ((cgk)$$0).ay() == cgu.ak;
        $$1.e = null;
        if (!$$3.f() && ($$4 = ((czc)$$0).a($$3)) != null && ($$5 = ((cgk)$$0).ao().a($$4)) != null) {
            this.h.a($$4, $$5, $$1.f);
            $$1.e = $$4;
        }
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }

    @Override
    protected /* synthetic */ yh c(cgk cgk2) {
        return this.a((T)((czc)cgk2));
    }
}

