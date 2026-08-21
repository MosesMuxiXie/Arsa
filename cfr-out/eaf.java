/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eaf
extends egt {
    public static final MapCodec<eaf> a = eaf.b(eaf::new);
    public static final epf<iz> b = eox.T;

    public MapCodec<eaf> a() {
        return a;
    }

    public eaf(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(b, iz.c));
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new elh($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$02, eoh $$12, eld<T> $$22) {
        if (!$$02.B_()) {
            return eaf.a($$22, eld.K, (dwo $$0, is $$1, eoh $$2, ? super E $$3) -> ett.c.a($$0, $$3.gS(), $$3.gT()));
        }
        return null;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        return (eoh)super.a($$0).b(b, $$0.g());
    }

    @Override
    public int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$3 != $$0.c(b)) {
            return super.a($$0, $$1, $$2, $$3);
        }
        return 0;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        super.a($$0);
        $$0.a(new epk[]{b});
    }

    @Override
    public eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    public eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    public int c() {
        return 10;
    }
}

