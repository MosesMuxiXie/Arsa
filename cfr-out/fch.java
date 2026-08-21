/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fch
extends fcg {
    public static final MapCodec<fch> g = RecordCodecBuilder.mapCodec($$0 -> fch.b($$0).apply((Applicative)$$0, fch::new));
    protected final List<eoh> h;

    protected static <P extends fch> Products.P4<RecordCodecBuilder.Mu<P>, Long, fke.a, Float, List<eoh>> b(RecordCodecBuilder.Instance<P> $$02) {
        return fch.a($$02).and((App)bfm.b(eoh.a.listOf()).fieldOf("states").forGetter($$0 -> $$0.h));
    }

    public fch(long $$0, fke.a $$1, float $$2, List<eoh> $$3) {
        super($$0, $$1, $$2);
        this.h = $$3;
    }

    @Override
    protected fce<?> a() {
        return fce.d;
    }

    @Override
    public eoh a(bgr $$0, is $$1) {
        return this.a(this.h, $$1, this.e);
    }

    protected eoh a(List<eoh> $$0, is $$1, double $$2) {
        double $$3 = this.a($$1, $$2);
        return this.a($$0, $$3);
    }

    protected eoh a(List<eoh> $$0, double $$1) {
        double $$2 = bgj.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
        return $$0.get((int)($$2 * (double)$$0.size()));
    }
}

