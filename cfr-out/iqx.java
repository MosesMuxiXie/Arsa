/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryEvent
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.serialization.Codec
 */
import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class iqx
extends Record {
    private final irb b;
    private final ire c;
    public static final Codec<iqx> a = irb.a.dispatchStable(iqx::a, irb::c);

    public iqx(irb $$0, ire $$12) {
        $$12.b().forEach($$1 -> {
            if (!$$0.a($$1)) {
                throw new IllegalArgumentException("Property '" + $$1.b() + "' not expected for event: '" + $$0.a() + "'");
            }
        });
        this.b = $$0;
        this.c = $$12;
    }

    public TelemetryEvent a(TelemetrySession $$0) {
        return this.b.a($$0, this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iqx.class, "type;properties", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iqx.class, "type;properties", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iqx.class, "type;properties", "b", "c"}, this, $$0);
    }

    public irb a() {
        return this.b;
    }

    public ire b() {
        return this.c;
    }
}

