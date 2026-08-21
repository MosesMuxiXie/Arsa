/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ckd
extends cjd<chn> {
    private static final int c = 100;
    private static final int d = 3;
    private static final int e = 6;
    private static final int f = 5;
    private final float g;
    private @Nullable is h;
    private int i;
    private int j;
    private int k;

    public ckd(float $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.x, (Object)((Object)cqx.a), cqw.n, (Object)((Object)cqx.b)));
        this.g = $$0;
    }

    @Override
    protected boolean a(axf $$0, chn $$1) {
        return $$1.e_() && this.b($$0, $$1);
    }

    protected void a(axf $$0, chn $$1, long $$22) {
        super.d($$0, $$1, $$22);
        this.a($$1).ifPresent($$2 -> {
            this.h = $$2;
            this.i = 100;
            this.j = 3 + $$0.y.a(4);
            this.k = 0;
            this.a($$1, (is)$$2);
        });
    }

    @Override
    protected void b(axf $$0, chn $$1, long $$2) {
        super.b($$0, $$1, $$2);
        this.h = null;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    protected boolean c(axf $$0, chn $$1, long $$2) {
        return $$1.e_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected void d(axf $$0, chn $$1, long $$2) {
        if (!this.c($$0, $$1)) {
            --this.i;
            return;
        }
        if (this.k > 0) {
            --this.k;
            return;
        }
        if (this.d($$0, $$1)) {
            $$1.L().a();
            --this.j;
            this.k = 5;
        }
    }

    private void a(chn $$0, is $$1) {
        $$0.ev().a(cqw.n, new cqz($$1, this.g, 0));
    }

    private boolean b(axf $$0, chn $$1) {
        return this.c($$0, $$1) || this.a($$1).isPresent();
    }

    private boolean c(axf $$0, chn $$1) {
        is $$2 = $$1.dK();
        is $$3 = $$2.e();
        return this.a($$0, $$2) || this.a($$0, $$3);
    }

    private boolean d(axf $$0, chn $$1) {
        return this.a($$0, $$1.dK());
    }

    @Override
    private boolean a(axf $$0, is $$1) {
        return $$0.a_($$1).a(bdp.R);
    }

    private Optional<is> a(chn $$0) {
        return $$0.ev().c(cqw.x);
    }

    private boolean e(axf $$0, chn $$1) {
        return !this.c($$0, $$1) && this.i <= 0;
    }

    private boolean f(axf $$0, chn $$1) {
        return this.c($$0, $$1) && this.j <= 0;
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.c(axf2, (chn)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (chn)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (chn)chl2, l2);
    }
}

