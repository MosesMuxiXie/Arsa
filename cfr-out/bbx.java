/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.response.NameAndId
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.response.NameAndId;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class bbx
extends Record {
    private final UUID b;
    private final String c;
    public static final Codec<bbx> a = RecordCodecBuilder.create($$0 -> $$0.group((App)jx.d.fieldOf("id").forGetter(bbx::a), (App)Codec.STRING.fieldOf("name").forGetter(bbx::b)).apply((Applicative)$$0, bbx::new));

    public bbx(GameProfile $$0) {
        this($$0.id(), $$0.name());
    }

    public bbx(NameAndId $$0) {
        this($$0.id(), $$0.name());
    }

    public bbx(UUID $$0, String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    /*
     * WARNING - void declaration
     */
    public static @Nullable bbx a(JsonObject $$0) {
        void $$4;
        if (!$$0.has("uuid") || !$$0.has("name")) {
            return null;
        }
        String $$1 = $$0.get("uuid").getAsString();
        try {
            UUID $$2 = UUID.fromString($$1);
        }
        catch (Throwable $$3) {
            return null;
        }
        return new bbx((UUID)$$4, $$0.get("name").getAsString());
    }

    public void b(JsonObject $$0) {
        $$0.addProperty("uuid", this.a().toString());
        $$0.addProperty("name", this.b());
    }

    public static bbx a(String $$0) {
        UUID $$1 = jx.a($$0);
        return new bbx($$1, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bbx.class, "id;name", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bbx.class, "id;name", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bbx.class, "id;name", "b", "c"}, this, $$0);
    }

    public UUID a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }
}

