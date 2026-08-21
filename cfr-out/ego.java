/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ego
extends ejg
implements dzt {
    public static final MapCodec<ego> e = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)enu.a.fieldOf("tree").forGetter($$0 -> $$0.g), ego.x()).apply((Applicative)$$02, ego::new));
    public static final eph f = eox.aY;
    private static final fug a = dzq.b(12.0, 0.0, 12.0);
    protected final enu g;

    public MapCodec<? extends ego> a() {
        return e;
    }

    protected ego(enu $$0, eog.d $$1) {
        super($$1);
        this.g = $$0;
        this.l((eoh)((eoh)this.C.b()).b(f, 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.G($$2.d()) >= 9 && $$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
        }
    }

    public void a(axf $$0, is $$1, eoh $$2, bgr $$3) {
        if ($$2.c(f) == 0) {
            $$0.a($$1, (eoh)$$2.a(f), 260);
        } else {
            this.g.a($$0, $$0.p().g(), $$1, $$2, $$3);
        }
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return true;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return (double)$$0.y.i() < 0.45;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        this.a($$0, $$2, $$3, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{f});
    }
}

