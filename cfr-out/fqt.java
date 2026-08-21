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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class fqt
extends fpq {
    public static final MapCodec<fqt> a = RecordCodecBuilder.mapCodec($$02 -> fqt.a($$02).and((App)Codec.unboundedMap(kh.a, (Codec)Codec.BOOL).fieldOf("toggles").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fqt::new));
    private final Map<kh<?>, Boolean> b;

    private fqt(List<frm> $$0, Map<kh<?>, Boolean> $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    protected dlt a(dlt $$02, fnz $$1) {
        $$02.a(ki.t, dpd.c, $$0 -> {
            Iterator<Map.Entry<kh<?>, Boolean>> iterator = this.b.entrySet().iterator();
            while (iterator.hasNext()) {
                boolean $$2;
                Map.Entry<kh<?>, Boolean> $$1;
                $$0 = $$0.a($$1.getKey(), !($$2 = ($$1 = iterator.next()).getValue().booleanValue()));
            }
            return $$0;
        });
        return $$02;
    }

    public fps<fqt> a() {
        return fpt.P;
    }
}

