/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import org.jspecify.annotations.Nullable;

public abstract class hne
extends ddm
implements gih {
    private @Nullable hiq a;
    private final boolean b;
    private final gii c = new gii();

    public hne(hif $$0, GameProfile $$1) {
        super($$0, $$1);
        this.b = "deadmau5".equals(this.gI().name());
    }

    @Override
    public @Nullable dwl a() {
        hiq $$0 = this.h();
        return $$0 != null ? $$0.e() : null;
    }

    protected @Nullable hiq h() {
        if (this.a == null) {
            this.a = gfj.V().R().a(this.cY());
        }
        return this.a;
    }

    @Override
    public void g() {
        this.c.a(this.dI(), this.dN());
        super.g();
    }

    protected void K(float $$0) {
        this.c.a($$0);
    }

    @Override
    public gii b() {
        return this.c;
    }

    @Override
    public @Nullable yh d() {
        fur $$0 = this.ao().ab();
        fuj $$1 = $$0.a(fui.c);
        if ($$1 != null) {
            fun $$2 = $$0.d(this, $$1);
            yw $$3 = fun.a($$2, $$1.a(aaj.b));
            return yh.i().b($$3).b(yg.x).b($$1.e());
        }
        return null;
    }

    @Override
    public ddq c() {
        hiq $$0 = this.h();
        return $$0 == null ? imh.a(this.cY()) : $$0.g();
    }

    @Override
    public @Nullable cwy.b a(boolean $$0) {
        return ($$0 ? this.hc() : this.hd()).orElse(null);
    }

    @Override
    public void t() {
        super.t();
        this.b().b();
    }

    @Override
    public void d_() {
        this.m();
        super.d_();
    }

    protected void m() {
        float $$1;
        if (!this.aV() || this.fa() || this.cB()) {
            float $$0 = 0.0f;
        } else {
            $$1 = Math.min(0.1f, (float)this.dN().i());
        }
        this.b().e($$1);
    }

    public float a(boolean $$0, float $$1) {
        float $$3;
        float $$2 = 1.0f;
        if (this.gL().b) {
            $$2 *= 1.1f;
        }
        if (($$3 = this.gL().b()) != 0.0f) {
            float $$4 = (float)this.i(cis.x) / $$3;
            $$2 *= ($$4 + 1.0f) / 2.0f;
        }
        if (this.fZ()) {
            if (this.gb().a(dlx.pW)) {
                float $$5 = Math.min((float)this.gd() / 20.0f, 1.0f);
                $$2 *= 1.0f - bgj.j($$5) * 0.15f;
            } else if ($$0 && this.hj()) {
                return 0.1f;
            }
        }
        return bgj.h($$1, 1.0f, $$2);
    }

    @Override
    public boolean e() {
        return this.b;
    }
}

