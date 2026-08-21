/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public record ash(yh b, Optional<yh> c, boolean d, boolean e, ask f, List<ata> g, List<aso> h) {
    public static final MapCodec<ash> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)yj.a.fieldOf("title").forGetter(ash::b), (App)yj.a.optionalFieldOf("external_title").forGetter(ash::c), (App)Codec.BOOL.optionalFieldOf("can_close_with_escape", (Object)true).forGetter(ash::d), (App)Codec.BOOL.optionalFieldOf("pause", (Object)true).forGetter(ash::e), (App)ask.e.optionalFieldOf("after_action", ask.a).forGetter(ash::f), (App)ata.b.optionalFieldOf("body", List.of()).forGetter(ash::g), (App)aso.a.listOf().optionalFieldOf("inputs", List.of()).forGetter(ash::h)).apply((Applicative)$$0, ash::new)).validate($$0 -> {
        if ($$0.e && !$$0.f.a()) {
            return DataResult.error(() -> "Dialogs that pause the game must use after_action values that unpause it after user action!");
        }
        return DataResult.success((Object)$$0);
    });

    public yh a() {
        return this.c.orElse(this.b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ash.class, "title;externalTitle;canCloseWithEscape;pause;afterAction;body;inputs", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ash.class, "title;externalTitle;canCloseWithEscape;pause;afterAction;body;inputs", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ash.class, "title;externalTitle;canCloseWithEscape;pause;afterAction;body;inputs", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }
}

