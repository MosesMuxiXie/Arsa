/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class gul
extends gtl<dim> {
    private float D;
    private float E;
    private boolean F;
    private final gud G;

    public gul(ddm $$0) {
        super($$0.cm, new gwr($$0.cm), $$0.gK(), yh.c("container.crafting"));
        this.f = 97;
        this.G = new gud(this);
    }

    @Override
    public void p() {
        super.p();
        if (this.n.s.gv()) {
            this.n.a(new gua(this.n.s, this.n.s.b.B(), this.n.k.V().b()));
        }
    }

    @Override
    protected void bg_() {
        if (this.n.s.gv()) {
            this.n.a(new gua(this.n.s, this.n.s.b.B(), this.n.k.V().b()));
            return;
        }
        super.bg_();
    }

    @Override
    protected gpl I() {
        return new gpl(this.z + 104, this.p / 2 - 22);
    }

    @Override
    protected void J() {
        this.F = true;
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2) {
        $$0.a(this.q, this.m, this.f, this.t, -12566464, false);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        this.G.a($$0, $$1, $$2);
        super.a($$0, $$1, $$2, $$3);
        this.D = $$1;
        this.E = $$2;
    }

    @Override
    public boolean D() {
        return this.G.a();
    }

    @Override
    protected boolean K() {
        return false;
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = this.z;
        int $$5 = this.A;
        $$0.a(hpa.at, a, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        gul.a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625f, this.D, this.E, this.n.s);
    }

    public static void a(gir $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, chl $$9) {
        float $$10 = (float)($$1 + $$3) / 2.0f;
        float $$11 = (float)($$2 + $$4) / 2.0f;
        float $$12 = (float)Math.atan(($$10 - $$7) / 40.0f);
        float $$13 = (float)Math.atan(($$11 - $$8) / 40.0f);
        Quaternionf $$14 = new Quaternionf().rotateZ((float)Math.PI);
        Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0f * ((float)Math.PI / 180));
        $$14.mul((Quaternionfc)$$15);
        idf $$16 = gul.a($$9);
        if ($$16 instanceof ieh) {
            ieh $$17 = (ieh)$$16;
            $$17.at = 180.0f + $$12 * 20.0f;
            $$17.au = $$12 * 20.0f;
            $$17.av = $$17.aK != chx.b ? -$$13 * 20.0f : 0.0f;
            $$17.M /= $$17.az;
            $$17.N /= $$17.az;
            $$17.az = 1.0f;
        }
        Vector3f $$18 = new Vector3f(0.0f, $$16.N / 2.0f + $$6, 0.0f);
        $$0.a($$16, (float)$$5, $$18, $$14, $$15, $$1, $$2, $$3, $$4);
    }

    private static idf a(chl $$0) {
        hwo $$1 = gfj.V().ay();
        hwp<?, chl> $$2 = $$1.a($$0);
        chl $$3 = $$2.b($$0, 1.0f);
        ((idf)((Object)$$3)).T = 0xF000F0;
        ((idf)((Object)$$3)).aa.clear();
        ((idf)((Object)$$3)).U = 0;
        return $$3;
    }

    @Override
    public boolean b(gzc $$0) {
        if (this.F) {
            this.F = false;
            return true;
        }
        return super.b($$0);
    }
}

