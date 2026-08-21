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
import java.util.List;
import java.util.Optional;

public record avo(Optional<String> b, Optional<String> c, Optional<List<String>> d) {
    public static final Codec<avo> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.optionalFieldOf("literal").forGetter(avo::b), (App)Codec.STRING.optionalFieldOf("translatable").forGetter(avo::c), (App)Codec.STRING.listOf().lenientOptionalFieldOf("translatableParams").forGetter(avo::d)).apply((Applicative)$$0, avo::new));

    public Optional<yh> a() {
        if (this.c.isPresent()) {
            String $$0 = this.c.get();
            if (this.d.isPresent()) {
                List<String> $$1 = this.d.get();
                return Optional.of(yh.a($$0, $$1.toArray()));
            }
            return Optional.of(yh.c($$0));
        }
        return this.b.map(yh::b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{avo.class, "literal;translatable;translatableParams", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{avo.class, "literal;translatable;translatableParams", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{avo.class, "literal;translatable;translatableParams", "b", "c", "d"}, this, $$0);
    }
}

