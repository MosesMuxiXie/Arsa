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
import java.util.List;

public class fpz
extends fpq {
    public static final MapCodec<fpz> a = RecordCodecBuilder.mapCodec($$02 -> fpz.a($$02).and((App)kg.b.fieldOf("components").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fpz::new));
    private final kg b;

    private fpz(List<frm> $$0, kg $$1) {
        super($$0);
        this.b = $$1;
    }

    public fps<fpz> a() {
        return fpt.k;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        $$0.a(this.b);
        return $$0;
    }

    public static <T> fpq.a<?> a(kh<T> $$0, T $$1) {
        return fpz.a((List<frm> $$2) -> new fpz((List<frm>)$$2, kg.a().a($$0, $$1).a()));
    }
}

