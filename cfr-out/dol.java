/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;

public final class dol
extends Record
implements dpe {
    private final int d;
    private final List<dok> e;
    public static final int a = 256;
    public static final Codec<dol> b = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.p.optionalFieldOf("flight_duration", (Object)0).forGetter(dol::a), (App)dok.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dol::b)).apply((Applicative)$$0, dol::new));
    public static final aao<ByteBuf, dol> c = aao.a(aam.h, dol::a, dok.d.a(aam.c(256)), dol::b, dol::new);

    public dol(int $$0, List<dok> $$1) {
        if ($$1.size() > 256) {
            throw new IllegalArgumentException("Got " + $$1.size() + " explosions, but maximum is 256");
        }
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        if (this.d > 0) {
            $$1.accept(yh.c("item.minecraft.firework_rocket.flight").b(yg.x).f(String.valueOf(this.d)).a(l.h));
        }
        dok $$4 = null;
        int $$5 = 0;
        for (dok $$6 : this.e) {
            if ($$4 == null) {
                $$4 = $$6;
                $$5 = 1;
                continue;
            }
            if ($$4.equals($$6)) {
                ++$$5;
                continue;
            }
            dol.a($$1, $$4, $$5);
            $$4 = $$6;
            $$5 = 1;
        }
        if ($$4 != null) {
            dol.a($$1, $$4, $$5);
        }
    }

    private static void a(Consumer<yh> $$0, dok $$12, int $$2) {
        yw $$3 = $$12.a().a();
        if ($$2 == 1) {
            $$0.accept(yh.a("item.minecraft.firework_rocket.single_star", $$3).a(l.h));
        } else {
            $$0.accept(yh.a("item.minecraft.firework_rocket.multiple_stars", $$2, $$3).a(l.h));
        }
        $$12.a($$1 -> $$0.accept(yh.b("  ").b((yh)$$1)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dol.class, "flightDuration;explosions", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dol.class, "flightDuration;explosions", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dol.class, "flightDuration;explosions", "d", "e"}, this, $$0);
    }

    public int a() {
        return this.d;
    }

    public List<dok> b() {
        return this.e;
    }
}

