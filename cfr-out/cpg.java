/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class cpg
extends cop {
    private static final csk b = csk.b().a(6.0);
    private static final dlp c = dlx.dy;
    public static final int a = 400;
    private final cwh d;
    private @Nullable chl e;
    private int f;

    public cpg(cwh $$0) {
        this.d = $$0;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        if (!this.d.ao().ag()) {
            return false;
        }
        if (this.d.ep().a(8000) != 0) {
            return false;
        }
        this.e = cpg.a(this.d).a(bdt.R, b, (chl)this.d, this.d.dP(), this.d.dR(), this.d.dV(), this.h());
        return this.e != null;
    }

    @Override
    public boolean c() {
        return this.f > 0;
    }

    @Override
    public void d() {
        this.f = this.a(400);
        this.d.x(true);
    }

    @Override
    public void e() {
        chn $$0;
        chl chl2;
        this.d.x(false);
        if (this.f == 0 && (chl2 = this.e) instanceof chn && ($$0 = (chn)chl2).ay().a(bdt.Q) && $$0.a(cwc.a).f() && this.h().c($$0.dj())) {
            $$0.a(cwc.a, c.m());
            $$0.g(cwc.a);
        }
        this.e = null;
    }

    @Override
    public void a() {
        if (this.e != null) {
            this.d.J().a(this.e, 30.0f, 30.0f);
        }
        --this.f;
    }

    private fth h() {
        return this.d.dj().c(6.0, 2.0, 6.0);
    }
}

