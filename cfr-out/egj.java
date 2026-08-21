/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class egj
extends dzq
implements dzt {
    public static final MapCodec<egj> a = egj.b(egj::new);

    public MapCodec<egj> a() {
        return a;
    }

    public egj(eog.d $$0) {
        super($$0);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.a_($$1.e()).l();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        $$0.c($$2.e(), dzs.uf.m());
    }

    @Override
    public is a(is $$0) {
        return $$0.e();
    }
}

