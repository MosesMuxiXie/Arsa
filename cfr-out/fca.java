/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class fca {
    public static final Codec<fca> d = mi.W.q().dispatch(fca::a, fcb::a);
    protected final cch e;
    protected final fcd f;
    protected final Optional<fbx> g;

    protected static <P extends fca> Products.P3<RecordCodecBuilder.Mu<P>, cch, fcd, Optional<fbx>> a(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)cch.c.fieldOf("trunk_offset_y").forGetter($$0 -> $$0.e), (App)fcd.a.fieldOf("root_provider").forGetter($$0 -> $$0.f), (App)fbx.a.optionalFieldOf("above_root_placement").forGetter($$0 -> $$0.g));
    }

    public fca(cch $$0, fcd $$1, Optional<fbx> $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    protected abstract fcb<?> a();

    public abstract boolean a(dwu var1, BiConsumer<is, eoh> var2, bgr var3, is var4, is var5, fay var6);

    protected boolean a(dwu $$0, is $$1) {
        return ezj.d($$0, $$1);
    }

    protected void a(dwu $$0, BiConsumer<is, eoh> $$1, bgr $$2, is $$3, fay $$4) {
        if (!this.a($$0, $$3)) {
            return;
        }
        $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
        if (this.g.isPresent()) {
            fbx $$5 = this.g.get();
            is $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, eog.a::l)) {
                $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
        }
    }

    protected eoh a(dwu $$02, is $$1, eoh $$2) {
        if ($$2.b(eox.I)) {
            boolean $$3 = $$02.b($$1, $$0 -> $$0.a(bdv.a));
            return (eoh)$$2.b(eox.I, $$3);
        }
        return $$2;
    }

    public is a(is $$0, bgr $$1) {
        return $$0.b(this.e.a($$1));
    }
}

