/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class edg
extends eez
implements dzt {
    public static final MapCodec<edg> a = edg.b(edg::new);
    private final efa e = new efa(this);

    public MapCodec<edg> a() {
        return a;
    }

    public edg(eog.d $$0) {
        super($$0);
    }

    public static ToIntFunction<eoh> b(int $$0) {
        return $$1 -> eey.r($$1) ? $$0 : 0;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return iz.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        this.e.a($$3, (dwp)$$0, $$2, $$1);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return $$0.y().c();
    }

    @Override
    public efa c() {
        return this.e;
    }
}

