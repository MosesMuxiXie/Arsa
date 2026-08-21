/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fpm
extends fpq {
    private static final Logger b = LogUtils.getLogger();
    public static final MapCodec<fpm> a = RecordCodecBuilder.mapCodec($$02 -> fpm.a($$02).and((App)amt.a(mj.bH).fieldOf("name").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fpm::new));
    private final amt<fpr> c;

    private fpm(List<frm> $$0, amt<fpr> $$1) {
        super($$0);
        this.c = $$1;
    }

    public fps<fpm> a() {
        return fpt.H;
    }

    @Override
    public void a(fog $$0) {
        if (!$$0.b()) {
            $$0.a(new fog.d(this.c));
            return;
        }
        if ($$0.a(this.c)) {
            $$0.a(new fog.c(this.c));
            return;
        }
        super.a($$0);
        $$0.a().c(this.c).ifPresentOrElse($$1 -> ((fpr)$$1.a()).a($$0.a(new bgp.b(this.c), this.c)), () -> $$0.a(new fog.a(this.c)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected dlt a(dlt $$0, fnz $$1) {
        fpr $$2 = $$1.a().c(this.c).map(jd::a).orElse(null);
        if ($$2 == null) {
            b.warn("Unknown function: {}", (Object)this.c.a());
            return $$0;
        }
        fnz.e<fpr> $$3 = fnz.a($$2);
        if ($$1.b($$3)) {
            try {
                dlt dlt2 = (dlt)$$2.apply($$0, $$1);
                return dlt2;
            }
            finally {
                $$1.c($$3);
            }
        }
        b.warn("Detected infinite loop in loot tables");
        return $$0;
    }

    public static fpq.a<?> a(amt<fpr> $$0) {
        return fpm.a((List<frm> $$1) -> new fpm((List<frm>)$$1, $$0));
    }
}

