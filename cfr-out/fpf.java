/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fpf
extends fpq {
    public static final MapCodec<fpf> a = RecordCodecBuilder.mapCodec($$0 -> fpf.a($$0).apply((Applicative)$$0, fpf::new));

    protected fpf(List<frm> $$0) {
        super($$0);
    }

    public fps<fpf> a() {
        return fpt.S;
    }

    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        return dlt.l;
    }

    public static fpq.a<?> c() {
        return fpf.a(fpf::new);
    }
}

