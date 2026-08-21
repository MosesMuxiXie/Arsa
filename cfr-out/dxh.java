/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dxh
extends dwj {
    private final boolean a;
    private final boolean b;
    private final Optional<Float> c;
    private final Optional<jh<dzq>> d;

    public dxh(boolean $$0, boolean $$1, Optional<Float> $$2, Optional<jh<dzq>> $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    @Override
    public Optional<Float> a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4) {
        if (this.d.isPresent()) {
            if ($$3.a(this.d.get())) {
                return Optional.of(Float.valueOf(3600000.0f));
            }
            return Optional.empty();
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean a(dwi $$0, dvt $$1, is $$2, eoh $$3, float $$4) {
        return this.a;
    }

    @Override
    public boolean a(dwi $$0, cgk $$1) {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(cgk $$0) {
        boolean $$2;
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            if ($$1.gL().b) {
                return 0.0f;
            }
        }
        boolean bl2 = $$2 = false;
        if ($$2) {
            return 0.0f;
        }
        float f2 = this.c.orElseGet(() -> Float.valueOf(super.a($$0))).floatValue();
        return f2;
    }
}

