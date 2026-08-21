/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cpw
extends cop {
    private static final int a = 10;
    private final cht b;
    private final int c;
    private @Nullable is d;

    public cpw(cht $$0, int $$1) {
        this.b = $$0;
        this.c = cpw.b($$1);
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        is $$12;
        if (this.b.dm()) {
            return false;
        }
        if (this.b.ao().ag()) {
            return false;
        }
        if (this.b.ep().a(this.c) != 0) {
            return false;
        }
        axf $$0 = (axf)this.b.ao();
        if (!$$0.a($$12 = this.b.dK(), 6)) {
            return false;
        }
        ftm $$2 = csr.a(this.b, 15, 7, $$1 -> -$$0.b(jw.a($$1)));
        this.d = $$2 == null ? null : is.a($$2);
        return this.d != null;
    }

    @Override
    public boolean c() {
        return this.d != null && !this.b.N().l() && this.b.N().h().equals(this.d);
    }

    @Override
    public void a() {
        if (this.d == null) {
            return;
        }
        cre $$0 = this.b.N();
        if ($$0.l() && !this.d.a(this.b.dI(), 10.0)) {
            ftm $$1 = ftm.c(this.d);
            ftm $$2 = this.b.dI();
            ftm $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            ftm $$4 = $$1.d($$2).d().c(10.0).e($$2);
            is $$5 = is.a($$4);
            $$5 = this.b.ao().a(euq.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
                this.h();
            }
        }
    }

    private void h() {
        bgr $$0 = this.b.ep();
        is $$1 = this.b.ao().a(euq.a.f, this.b.dK().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
        this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
    }
}

