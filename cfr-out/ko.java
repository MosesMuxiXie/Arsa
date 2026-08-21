/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class ko
extends Record
implements df<dnz> {
    private final Optional<az<dlt, cg>> e;
    public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group((App)az.a(cg.a).optionalFieldOf("items").forGetter(ko::b)).apply((Applicative)$$0, ko::new));

    public ko(Optional<az<dlt, cg>> $$0) {
        this.e = $$0;
    }

    @Override
    public kh<dnz> a() {
        return ki.X;
    }

    @Override
    public boolean a(dnz $$0) {
        return !this.e.isPresent() || this.e.get().a($$0.c());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ko.class, "items", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ko.class, "items", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ko.class, "items", "e"}, this, $$0);
    }

    public Optional<az<dlt, cg>> b() {
        return this.e;
    }
}

