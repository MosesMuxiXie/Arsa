/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eec
extends edk
implements eep {
    public static final MapCodec<eec> c = eec.b(eec::new);

    public MapCodec<eec> a() {
        return c;
    }

    protected eec(eog.d $$0) {
        super($$0, iz.b, fud.b(), true);
    }

    @Override
    protected edl c() {
        return (edl)dzs.mY;
    }

    @Override
    protected flb b_(eoh $$0) {
        return flc.c.a(false);
    }

    @Override
    protected boolean p(eoh $$0) {
        return this.c().p($$0);
    }

    @Override
    public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        return false;
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        return false;
    }
}

