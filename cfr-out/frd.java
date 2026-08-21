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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.slf4j.Logger;

public final class frd
extends Record
implements frm {
    private final amt<frm> b;
    private static final Logger c = LogUtils.getLogger();
    public static final MapCodec<frd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amt.a(mj.bI).fieldOf("name").forGetter(frd::c)).apply((Applicative)$$0, frd::new));

    public frd(amt<frm> $$0) {
        this.b = $$0;
    }

    @Override
    public frn a() {
        return fro.p;
    }

    @Override
    public void a(fog $$0) {
        if (!$$0.b()) {
            $$0.a(new fog.d(this.b));
            return;
        }
        if ($$0.a(this.b)) {
            $$0.a(new fog.c(this.b));
            return;
        }
        frm.super.a($$0);
        $$0.a().c(this.b).ifPresentOrElse($$1 -> ((frm)$$1.a()).a($$0.a(new bgp.b(this.b), this.b)), () -> $$0.a(new fog.a(this.b)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(fnz $$0) {
        frm $$1 = $$0.a().c(this.b).map(jd.c::a).orElse(null);
        if ($$1 == null) {
            c.warn("Tried using unknown condition table called {}", (Object)this.b.a());
            return false;
        }
        fnz.e<frm> $$2 = fnz.a($$1);
        if ($$0.b($$2)) {
            try {
                boolean bl2 = $$1.test($$0);
                return bl2;
            }
            finally {
                $$0.c($$2);
            }
        }
        c.warn("Detected infinite loop in loot tables");
        return false;
    }

    public static frm.a a(amt<frm> $$0) {
        return () -> new frd($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frd.class, "name", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frd.class, "name", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frd.class, "name", "b"}, this, $$0);
    }

    public amt<frm> c() {
        return this.b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

