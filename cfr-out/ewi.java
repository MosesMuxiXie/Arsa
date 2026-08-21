/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class ewi
implements evx {
    protected final jy f;

    protected static <P extends ewi> Products.P1<RecordCodecBuilder.Mu<P>, jy> a(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)jy.v(16).optionalFieldOf("offset", (Object)jy.i).forGetter($$0 -> $$0.f));
    }

    protected ewi(jy $$0) {
        this.f = $$0;
    }

    public final boolean a(dxn $$0, is $$1) {
        return this.a($$0.a_($$1.a(this.f)));
    }

    protected abstract boolean a(eoh var1);

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

