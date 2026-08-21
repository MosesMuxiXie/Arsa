/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fqs
extends fpq {
    private static final Logger b = LogUtils.getLogger();
    public static final MapCodec<fqs> a = RecordCodecBuilder.mapCodec($$0 -> fqs.a($$0).apply((Applicative)$$0, fqs::new));

    private fqs(List<frm> $$0) {
        super($$0);
    }

    public fps<fqs> a() {
        return fpt.l;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        dlt $$4;
        if ($$0.f()) {
            return $$0;
        }
        drl $$2 = new drl($$0);
        Optional<dqx<drm>> $$3 = $$1.d().x().a(drd.b, $$2, $$1.d());
        if ($$3.isPresent() && !($$4 = $$3.get().b().a($$2, (jf.a)$$1.d().J_())).f()) {
            return $$4.c($$0.N());
        }
        b.warn("Couldn't smelt {} because there is no smelting recipe", (Object)$$0);
        return $$0;
    }

    public static fpq.a<?> c() {
        return fqs.a(fqs::new);
    }
}

