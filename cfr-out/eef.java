/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eef
extends dyj {
    public static final MapCodec<eef> d = eef.b(eef::new);
    private static final fug e = dzq.b(12.0, 4.0, 15.0);
    private static final fug f = fud.a(dyj.b, e);

    public MapCodec<eef> a() {
        return d;
    }

    public eef(eog.d $$0) {
        super($$0, ka.e);
    }

    @Override
    protected double b(eoh $$0) {
        return 0.9375;
    }

    @Override
    public boolean d(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, cgk $$3) {
        return f;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        $$4.a(chd.b);
        $$4.a(chd.d);
        $$4.b(chd.d, cgk::aQ);
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return 3;
    }
}

