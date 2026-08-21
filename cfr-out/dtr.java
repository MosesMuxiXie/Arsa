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
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public final class dtr
extends Record
implements dth {
    private final amo d;
    private static final Logger e = LogUtils.getLogger();
    public static final MapCodec<dtr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("function").forGetter(dtr::b)).apply((Applicative)$$0, dtr::new));

    public dtr(amo $$0) {
        this.d = $$0;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        MinecraftServer $$5 = $$0.s();
        ani $$6 = $$5.aC();
        Optional<ht<ed>> $$7 = $$6.a(this.d);
        if ($$7.isPresent()) {
            ed $$8 = $$5.aG().a(bbh.c).a().a($$3).a($$0).a($$4).a($$3.cl());
            $$6.a($$7.get(), $$8);
        } else {
            e.error("Enchantment run_function effect failed for non-existent function {}", (Object)this.d);
        }
    }

    public MapCodec<dtr> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtr.class, "function", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtr.class, "function", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtr.class, "function", "d"}, this, $$0);
    }

    public amo b() {
        return this.d;
    }
}

