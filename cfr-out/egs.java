/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class egs
extends dzc {
    public static final MapCodec<egs> a = egs.b(egs::new);
    public static final eoy b = eox.c;
    private final cch c = cce.a(5);

    public MapCodec<egs> a() {
        return a;
    }

    public egs(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(b).booleanValue()) {
            $$1.a($$2, (eoh)$$0.b(b, false), 3);
        }
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new emn($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        if ($$0.B_()) {
            return null;
        }
        return egs.a($$2, eld.L, emn::a);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, this.c);
        }
    }
}

