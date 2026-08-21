/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bpy
extends big {
    private final Predicate<String> a;

    public bpy(Schema $$0, String $$1, Predicate<String> $$2) {
        super($$0, $$1);
        this.a = $$2.negate();
    }

    @Override
    protected <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> $$0) {
        return $$0.filter(this::a);
    }

    private <T> boolean a(Dynamic<T> $$0) {
        return $$0.get("type").asString().result().filter(this.a).isPresent();
    }
}

