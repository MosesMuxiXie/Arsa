/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class egl
extends dzq {
    public static final MapCodec<egl> c = egl.b(egl::new);
    public static final epf<iz.a> d = eox.K;

    public MapCodec<? extends egl> a() {
        return c;
    }

    public egl(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(d, iz.a.b));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return egl.b($$0, $$1);
    }

    public static eoh b(eoh $$0, egm $$1) {
        switch ($$1) {
            case d: 
            case b: {
                switch ($$0.c(d)) {
                    case a: {
                        return (eoh)$$0.b(d, iz.a.c);
                    }
                    case c: {
                        return (eoh)$$0.b(d, iz.a.a);
                    }
                }
                return $$0;
            }
        }
        return $$0;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{d});
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(d, $$0.k().o());
    }
}

