/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.PrimitiveCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record ijh(String c) implements ijl<String>
{
    public static final PrimitiveCodec<String> a = Codec.STRING;
    public static final ijl.a<ijh, String> b = ijl.a.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("block_state_property").forGetter(ijh::c)).apply((Applicative)$$0, ijh::new)), a);

    public @Nullable String a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        dnw $$5 = $$0.a(ki.ax);
        if ($$5 == null) {
            return null;
        }
        return $$5.b().get(this.c);
    }

    @Override
    public ijl.a<ijh, String> a() {
        return b;
    }

    @Override
    public Codec<String> b() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ijh.class, "property", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ijh.class, "property", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ijh.class, "property", "c"}, this, $$0);
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2, @Nullable hif hif2, @Nullable chl chl2, int n2, dlr dlr2) {
        return this.a(dlt2, hif2, chl2, n2, dlr2);
    }
}

