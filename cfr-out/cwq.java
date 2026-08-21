/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cwq
extends cwn {
    private static final alw<jd<cws>> cG = ama.a(cwq.class, aly.D);

    public cwq(cgu<? extends cwq> $$0, dwo $$1) {
        super((cgu<? extends cwn>)$$0, $$1);
    }

    public static cir.a hn() {
        return cwn.hd().a(cis.x, 1.1f);
    }

    public @Nullable cwq b(axf $$0, cfy $$1) {
        return null;
    }

    @Override
    protected cgv Y() {
        return cgv.g;
    }

    protected cim.b<cwq> ew() {
        return cwr.a();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cwr.a(this.ew().a($$0));
    }

    public cim<cwq> ev() {
        return super.ev();
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("zombieNautilusBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("zombieNautilusActivityUpdate");
        cwr.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    protected bcz W() {
        return this.bC() ? bda.GU : bda.GV;
    }

    @Override
    protected bcz h(cex $$0) {
        return this.bC() ? bda.Hd : bda.He;
    }

    @Override
    protected bcz fd() {
        return this.bC() ? bda.Ha : bda.Hb;
    }

    @Override
    protected bcz hg() {
        return this.bC() ? bda.GW : bda.GX;
    }

    @Override
    protected bcz hh() {
        return this.bC() ? bda.GY : bda.GZ;
    }

    @Override
    protected void gX() {
        this.b(bda.Hc);
    }

    @Override
    protected bcz bk() {
        return bda.Hf;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cG, dfw.a(this.eo(), cwt.a));
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dfw.a($$0, mj.aW).ifPresent(this::b);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        dfw.a($$0, this.ho());
    }

    public void b(jd<cws> $$0) {
        this.az.a(cG, $$0);
    }

    public jd<cws> ho() {
        return this.az.a(cG);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aR) {
            return cwq.c($$0, new dku<cws>(this.ho()));
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aR);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aR) {
            Optional<jd<cws>> $$2 = cwq.c(ki.aR, $$1).a(this.eo());
            if ($$2.isPresent()) {
                this.b($$2.get());
                return true;
            }
            return false;
        }
        return super.b($$0, $$1);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dfw.a(dft.a($$0, this.dK()), mj.aW).ifPresent(this::b);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean aj_() {
        return !this.hm() && !this.hl();
    }

    @Override
    public boolean e_() {
        return false;
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

