/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cuh
extends cug {
    private static final alw<jd<cui>> cv = ama.a(cuh.class, aly.y);

    public cuh(cgu<? extends cuh> $$0, dwo $$1) {
        super((cgu<? extends cug>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, dfw.a(this.eo(), cuj.a));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        dfw.a($$0, this.gP());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dfw.a($$0, mj.aZ).ifPresent(this::b);
    }

    public @Nullable cuh b(axf $$0, cfy $$1) {
        cuh $$2 = cgu.G.a($$0, cgt.e);
        if ($$2 != null && $$1 instanceof cuh) {
            cuh $$3 = (cuh)$$1;
            $$2.b(this.as.h() ? this.gP() : $$3.gP());
        }
        return $$2;
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dfw.a(dft.a($$0, this.dK()), mj.aZ).ifPresent(this::b);
        return super.a($$0, $$1, $$2, $$3);
    }

    public void b(jd<cui> $$0) {
        this.az.a(cv, $$0);
    }

    public jd<cui> gP() {
        return this.az.a(cv);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aP) {
            return cuh.c($$0, this.gP());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aP);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aP) {
            this.b(cuh.c(ki.aP, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

