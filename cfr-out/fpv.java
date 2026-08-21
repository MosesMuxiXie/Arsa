/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class fpv
implements fpr {
    public static final MapCodec<fpv> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fpt.b.listOf().fieldOf("functions").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fpv::new));
    public static final Codec<fpv> b = fpt.b.listOf().xmap(fpv::new, $$0 -> $$0.c);
    private final List<fpr> c;
    private final BiFunction<dlt, fnz, dlt> d;

    private fpv(List<fpr> $$0) {
        this.c = $$0;
        this.d = fpt.a($$0);
    }

    public static fpv a(List<fpr> $$0) {
        return new fpv(List.copyOf($$0));
    }

    public dlt a(dlt $$0, fnz $$1) {
        return this.d.apply($$0, $$1);
    }

    @Override
    public void a(fog $$0) {
        fpr.super.a($$0);
        for (int $$1 = 0; $$1 < this.c.size(); ++$$1) {
            this.c.get($$1).a($$0.a(new bgp.d("functions", $$1)));
        }
    }

    public fps<fpv> a() {
        return fpt.I;
    }

    @Override
    public /* synthetic */ Object apply(Object object, Object object2) {
        return this.a((dlt)object, (fnz)object2);
    }
}

