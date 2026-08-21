/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class cqi
extends cqq {
    private static final csk a = csk.a().d().e();
    private static final int b = 10;
    private boolean c;
    private int d;
    private final Class<?>[] i;
    private Class<?> @Nullable [] j;

    public cqi(cht $$0, Class<?> ... $$1) {
        super($$0, true);
        this.i = $$1;
        this.a(EnumSet.of(cop.a.d));
    }

    @Override
    public boolean b() {
        int $$0 = this.e.eM();
        chl $$1 = this.e.eK();
        if ($$0 == this.d || $$1 == null) {
            return false;
        }
        if ($$1.ay() == cgu.cb && cqi.a(this.e).U().a(eua.af).booleanValue()) {
            return false;
        }
        for (Class<?> $$2 : this.i) {
            if (!$$2.isAssignableFrom($$1.getClass())) continue;
            return false;
        }
        return this.a($$1, a);
    }

    public cqi a(Class<?> ... $$0) {
        this.c = true;
        this.j = $$0;
        return this;
    }

    @Override
    public void d() {
        this.e.g(this.e.eK());
        this.g = this.e.ag_();
        this.d = this.e.eM();
        this.h = 300;
        if (this.c) {
            this.h();
        }
        super.d();
    }

    protected void h() {
        double $$0 = this.l();
        fth $$1 = fth.a(this.e.dI()).c($$0, 10.0, $$0);
        List<cgk> $$2 = this.e.ao().a(this.e.getClass(), $$1, cgs.f);
        for (chn chn2 : $$2) {
            if (this.e == chn2 || chn2.ag_() != null || this.e instanceof cii && ((cii)this.e).U_() != ((cii)chn2).U_() || chn2.t(this.e.eK())) continue;
            if (this.j != null) {
                boolean $$4 = false;
                for (Class<?> $$5 : this.j) {
                    if (chn2.getClass() != $$5) continue;
                    $$4 = true;
                    break;
                }
                if ($$4) continue;
            }
            this.a(chn2, this.e.eK());
        }
    }

    protected void a(chn $$0, chl $$1) {
        $$0.g($$1);
    }
}

