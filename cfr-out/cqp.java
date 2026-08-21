/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cqp<T extends chn>
extends cop {
    private static final int a = 10;
    private final T b;
    private final boolean c;
    private int d;

    public cqp(T $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public boolean b() {
        return cqp.a(this.b).U().a(eua.af) != false && this.h();
    }

    private boolean h() {
        return ((chl)this.b).eK() != null && ((chl)this.b).eK().ay() == cgu.cb && ((chl)this.b).eM() > this.d;
    }

    @Override
    public void d() {
        this.d = ((chl)this.b).eM();
        ((chq)this.b).ac_();
        if (this.c) {
            this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (chq)((Object)$$0)).forEach(chq::ac_);
        }
        super.d();
    }

    private List<? extends chn> i() {
        double $$0 = ((chl)this.b).i(cis.o);
        fth $$1 = fth.a(((cgk)this.b).dI()).c($$0, 10.0, $$0);
        return ((cgk)this.b).ao().a(this.b.getClass(), $$1, cgs.f);
    }
}

