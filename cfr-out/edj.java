/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class edj
extends dzq {
    protected final iz a;
    protected final boolean b;
    protected final fug d;

    protected edj(eog.d $$0, iz $$1, fug $$2, boolean $$3) {
        super($$0);
        this.a = $$1;
        this.d = $$2;
        this.b = $$3;
    }

    protected abstract MapCodec<? extends edj> a();

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a().a(this.a));
        if ($$1.a(this.c()) || $$1.a(this.b())) {
            return this.b().m();
        }
        return this.b($$0.q().y);
    }

    public eoh b(bgr $$0) {
        return this.m();
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.a(this.a.g());
        eoh $$4 = $$1.a_($$3);
        if (!this.p($$4)) {
            return false;
        }
        return $$4.a(this.c()) || $$4.a(this.b()) || $$4.c((dvt)$$1, $$3, this.a);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    protected boolean p(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.d;
    }

    protected abstract edl c();

    protected abstract dzq b();
}

