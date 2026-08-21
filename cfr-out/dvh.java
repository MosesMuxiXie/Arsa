/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dvh
implements dvf {
    protected final dvf b;

    protected dvh(dvf $$0) {
        this.b = $$0;
    }

    public abstract MapCodec<? extends dvh> a();

    protected static <T extends dvh> Products.P1<RecordCodecBuilder.Mu<T>, dvf> a(RecordCodecBuilder.Instance<T> $$02) {
        return $$02.group((App)dvg.b.fieldOf("slot_source").forGetter($$0 -> $$0.b));
    }

    protected abstract dve a(dve var1);

    @Override
    public final dve a(fnz $$0) {
        return this.a(this.b.a($$0));
    }

    @Override
    public void a(fog $$0) {
        dvf.super.a($$0);
        this.b.a($$0.a(new bgp.c("slot_source")));
    }
}

