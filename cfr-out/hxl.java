/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class hxl
extends hxk<dbc, iea> {
    private static final amo a = amo.b("textures/entity/illager/illusioner.png");

    public hxl(hwq.a $$0) {
        super($$0, new hep($$0.a(hdf.bH)), 0.5f);
        this.a(new ibb<iea, hep<iea>>(this, (hyq)this){

            @Override
            public void a(fzm $$0, hpo $$1, int $$2, iea $$3, float $$4, float $$5) {
                if ($$3.r || $$3.c) {
                    super.a($$0, $$1, $$2, $$3, $$4, $$5);
                }
            }
        });
        ((hep)this.f).f().k = true;
    }

    public amo a(iea $$0) {
        return a;
    }

    public iea b() {
        return new iea();
    }

    @Override
    public void a(dbc $$0, iea $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ftm[] $$3 = $$0.L($$2);
        $$1.a = Arrays.copyOf($$3, $$3.length);
        $$1.r = $$0.ha();
    }

    @Override
    public void a(iea $$0, fzm $$1, hpo $$2, ikp $$3) {
        if ($$0.Q) {
            ftm[] $$4 = $$0.a;
            for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
                $$1.a();
                $$1.a($$4[$$5].g + (double)bgj.b((double)((float)$$5 + $$0.L * 0.5f)) * 0.025, $$4[$$5].h + (double)bgj.b((double)((float)$$5 + $$0.L * 0.75f)) * 0.0125, $$4[$$5].i + (double)bgj.b((double)((float)$$5 + $$0.L * 0.7f)) * 0.025);
                super.a($$0, $$1, $$2, $$3);
                $$1.b();
            }
        } else {
            super.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    protected boolean b(iea $$0) {
        return true;
    }

    @Override
    protected fth a(dbc $$0) {
        return super.a($$0).c(3.0, 0.0, 3.0);
    }

    @Override
    protected /* synthetic */ boolean d(ieh ieh2) {
        return this.b((iea)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iea)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

