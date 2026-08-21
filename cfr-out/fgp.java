/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class fgp
extends fgw {
    public static final MapCodec<fgp> a = MapCodec.unit(() -> b);
    public static final fgp b = new fgp();

    private fgp() {
        super(fgy.a.a);
    }

    @Override
    public jy a(fjr $$0, egm $$1) {
        return jy.i;
    }

    @Override
    public List<fjq.a> a(fjr $$0, is $$1, egm $$2, bgr $$3) {
        return Collections.emptyList();
    }

    @Override
    public ffg a(fjr $$0, is $$1, egm $$2) {
        throw new IllegalStateException("Invalid call to EmptyPoolElement.getBoundingBox, filter me!");
    }

    @Override
    public boolean a(fjr $$0, dxn $$1, dxk $$2, eqg $$3, is $$4, is $$5, egm $$6, ffg $$7, bgr $$8, fja $$9, boolean $$10) {
        return true;
    }

    @Override
    public fgx<?> a() {
        return fgx.d;
    }

    public String toString() {
        return "Empty";
    }
}

