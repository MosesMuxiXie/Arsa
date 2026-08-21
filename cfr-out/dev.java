/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class dev
extends det {
    private static final dwj g = new dxh(true, false, Optional.of(Float.valueOf(1.22f)), mi.e.a(bdp.cQ).map(Function.identity()));
    private static final float h = 1.2f;
    private static final float i = bgj.j(3.5f);
    private int j = 5;

    public dev(cgu<? extends det> $$0, dwo $$1) {
        super($$0, $$1);
    }

    public dev(ddm $$0, dwo $$1, double $$2, double $$3, double $$4) {
        super(cgu.bP, $$1, $$0, $$2, $$3, $$4);
    }

    public dev(dwo $$0, double $$1, double $$2, double $$3, ftm $$4) {
        super((cgu<? extends det>)cgu.bP, $$1, $$2, $$3, $$4, $$0);
    }

    @Override
    public void g() {
        super.g();
        if (this.j > 0) {
            --this.j;
        }
    }

    @Override
    public boolean a(ded $$0, @Nullable cgk $$1, @Nullable cgr<cgk> $$2, boolean $$3) {
        if (this.j > 0) {
            return false;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(ftm $$0) {
        this.ao().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2f, false, dwo.a.e, ly.B, ly.A, cbn.a(), bda.FJ);
    }

    @Override
    public boolean a(double $$0) {
        if (this.at < 2 && $$0 < (double)i) {
            return false;
        }
        return super.a($$0);
    }
}

