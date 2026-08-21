/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public final class ut
extends Record {
    private final List<String> c;
    private final Map<String, String> d;
    private static final Logger e = LogUtils.getLogger();
    public static final ut a = new ut(List.of(), Map.of());
    public static final Codec<ut> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.listOf().fieldOf("removed").forGetter(ut::b), (App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING).fieldOf("renamed").forGetter(ut::c)).apply((Applicative)$$0, ut::new));

    public ut(List<String> $$0, Map<String, String> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static ut a(InputStream $$02) {
        JsonElement $$1 = bhf.a(new InputStreamReader($$02, StandardCharsets.UTF_8));
        return (ut)b.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$1).getOrThrow($$0 -> new IllegalStateException("Failed to parse deprecated language data: " + $$0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ut a(String $$0) {
        try (InputStream $$1 = uu.class.getResourceAsStream($$0);){
            if ($$1 == null) return a;
            ut ut2 = ut.a($$1);
            return ut2;
        }
        catch (Exception $$2) {
            e.error("Failed to read {}", (Object)$$0, (Object)$$2);
        }
        return a;
    }

    public static ut a() {
        return ut.a("/assets/minecraft/lang/deprecated.json");
    }

    public void a(Map<String, String> $$0) {
        for (String $$12 : this.c) {
            $$0.remove($$12);
        }
        this.d.forEach(($$1, $$2) -> {
            String $$3 = (String)$$0.remove($$1);
            if ($$3 == null) {
                e.warn("Missing translation key for rename: {}", $$1);
                $$0.remove($$2);
            } else {
                $$0.put((String)$$2, $$3);
            }
        });
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ut.class, "removed;renamed", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ut.class, "removed;renamed", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ut.class, "removed;renamed", "c", "d"}, this, $$0);
    }

    public List<String> b() {
        return this.c;
    }

    public Map<String, String> c() {
        return this.d;
    }
}

