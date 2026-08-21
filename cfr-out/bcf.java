/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class bcf<K, V extends bce<K>> {
    private static final Logger b = LogUtils.getLogger();
    private static final Gson c = new GsonBuilder().setPrettyPrinting().create();
    private final File d;
    private final Map<String, V> e = Maps.newHashMap();
    protected final ayy a;

    public bcf(File $$0, ayy $$1) {
        this.d = $$0;
        this.a = $$1;
    }

    public File c() {
        return this.d;
    }

    public boolean a(V $$0) {
        String $$1 = this.b(((bce)$$0).h());
        bce $$2 = (bce)this.e.get($$1);
        if ($$0.equals($$2)) {
            return false;
        }
        this.e.put($$1, $$0);
        try {
            this.f();
        }
        catch (IOException $$3) {
            b.warn("Could not save the list after adding a user.", (Throwable)$$3);
        }
        return true;
    }

    public @Nullable V c(K $$0) {
        this.h();
        return (V)((bce)this.e.get(this.b($$0)));
    }

    public boolean a(K $$0) {
        bce $$1 = (bce)this.e.remove(this.b($$0));
        if ($$1 == null) {
            return false;
        }
        try {
            this.f();
        }
        catch (IOException $$2) {
            b.warn("Could not save the list after removing a user.", (Throwable)$$2);
        }
        return true;
    }

    public boolean b(bce<K> $$0) {
        return this.a(Objects.requireNonNull($$0.h()));
    }

    public void a() {
        this.e.clear();
        try {
            this.f();
        }
        catch (IOException $$0) {
            b.warn("Could not save the list after removing a user.", (Throwable)$$0);
        }
    }

    public String[] b() {
        return this.e.keySet().toArray(new String[0]);
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    protected String b(K $$0) {
        return $$0.toString();
    }

    protected boolean d(K $$0) {
        return this.e.containsKey(this.b($$0));
    }

    private void h() {
        ArrayList $$0 = Lists.newArrayList();
        for (bce $$1 : this.e.values()) {
            if (!$$1.g()) continue;
            $$0.add($$1.h());
        }
        for (Object $$2 : $$0) {
            this.e.remove(this.b($$2));
        }
    }

    protected abstract bce<K> a(JsonObject var1);

    public Collection<V> e() {
        return this.e.values();
    }

    public void f() throws IOException {
        JsonArray $$02 = new JsonArray();
        this.e.values().stream().map($$0 -> bhs.a(new JsonObject(), $$0::a)).forEach(arg_0 -> ((JsonArray)$$02).add(arg_0));
        try (BufferedWriter $$1 = Files.newWriter((File)this.d, (Charset)StandardCharsets.UTF_8);){
            c.toJson((JsonElement)$$02, c.newJsonWriter((Writer)$$1));
        }
    }

    public void g() throws IOException {
        if (!this.d.exists()) {
            return;
        }
        try (BufferedReader $$0 = Files.newReader((File)this.d, (Charset)StandardCharsets.UTF_8);){
            this.e.clear();
            JsonArray $$1 = (JsonArray)c.fromJson((Reader)$$0, JsonArray.class);
            if ($$1 == null) {
                return;
            }
            for (JsonElement $$2 : $$1) {
                JsonObject $$3 = bfv.m($$2, "entry");
                bce<K> $$4 = this.a($$3);
                if ($$4.h() == null) continue;
                this.e.put(this.b($$4.h()), $$4);
            }
        }
    }
}

