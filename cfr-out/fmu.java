/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public final class fmu
extends Record
implements dpe {
    private final int c;
    public static final Codec<fmu> a = Codec.INT.xmap(fmu::new, fmu::b);
    public static final aao<ByteBuf, fmu> b = aam.h.a(fmu::new, fmu::b);
    private static final yh d = yh.c("filled_map.locked").a(l.h);

    public fmu(int $$0) {
        this.c = $$0;
    }

    public String a() {
        return "map_" + this.c;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        fmw $$4 = $$0.a(this);
        if ($$4 == null) {
            $$1.accept(yh.c("filled_map.unknown").a(l.h));
            return;
        }
        dou $$5 = $$3.a(ki.V);
        if ($$3.a(ki.h) == null && $$5 == null) {
            $$1.accept(yh.a("filled_map.id", this.c).a(l.h));
        }
        if ($$4.i || $$5 == dou.a) {
            $$1.accept(d);
        }
        if ($$2.a()) {
            byte $$6 = $$5 == dou.b ? (byte)1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(yh.a("filled_map.scale", 1 << $$7).a(l.h));
            $$1.accept(yh.a("filled_map.level", $$7, 4).a(l.h));
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fmu.class, "id", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fmu.class, "id", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fmu.class, "id", "c"}, this, $$0);
    }

    public int b() {
        return this.c;
    }
}

