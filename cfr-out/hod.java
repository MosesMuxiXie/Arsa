/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hod
extends bbe<a> {
    private static final Logger a = LogUtils.getLogger();
    private static final amo b = amo.b("gpu_warnlist.json");
    private ImmutableMap<String, String> c = ImmutableMap.of();
    private boolean d;
    private boolean e;

    public boolean a() {
        return !this.c.isEmpty();
    }

    public boolean b() {
        return this.a() && !this.e;
    }

    public void c() {
        this.d = true;
    }

    public void d() {
        this.e = true;
    }

    public boolean e() {
        return this.d && !this.e;
    }

    public void f() {
        this.d = false;
        this.e = false;
    }

    public @Nullable String g() {
        return (String)this.c.get((Object)"renderer");
    }

    public @Nullable String h() {
        return (String)this.c.get((Object)"version");
    }

    public @Nullable String i() {
        return (String)this.c.get((Object)"vendor");
    }

    public @Nullable String j() {
        StringBuilder $$0 = new StringBuilder();
        this.c.forEach(($$1, $$2) -> $$0.append((String)$$1).append(": ").append((String)$$2));
        return $$0.isEmpty() ? null : $$0.toString();
    }

    protected a a(baz $$0, bzm $$1) {
        ArrayList $$2 = Lists.newArrayList();
        ArrayList $$3 = Lists.newArrayList();
        ArrayList $$4 = Lists.newArrayList();
        JsonObject $$5 = hod.c($$0, $$1);
        if ($$5 != null) {
            try (bzr $$6 = $$1.d("compile_regex");){
                hod.a($$5.getAsJsonArray("renderer"), $$2);
                hod.a($$5.getAsJsonArray("version"), $$3);
                hod.a($$5.getAsJsonArray("vendor"), $$4);
            }
        }
        return new a($$2, $$3, $$4);
    }

    @Override
    protected void a(a $$0, baz $$1, bzm $$2) {
        this.c = $$0.a();
    }

    private static void a(JsonArray $$0, List<Pattern> $$12) {
        $$0.forEach($$1 -> $$12.add(Pattern.compile($$1.getAsString(), 2)));
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private static @Nullable JsonObject c(baz $$0, bzm $$1) {
        try (bzr $$2 = $$1.d("parse_json");){
            JsonObject jsonObject;
            block14: {
                BufferedReader $$3 = $$0.openAsReader(b);
                try {
                    jsonObject = bhf.a($$3).getAsJsonObject();
                    if ($$3 == null) break block14;
                }
                catch (Throwable throwable) {
                    if ($$3 != null) {
                        try {
                            ((Reader)$$3).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                ((Reader)$$3).close();
            }
            return jsonObject;
        }
        catch (JsonSyntaxException | IOException $$4) {
            a.warn("Failed to load GPU warnlist", $$4);
            return null;
        }
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }

    protected static final class a {
        private final List<Pattern> a;
        private final List<Pattern> b;
        private final List<Pattern> c;

        a(List<Pattern> $$0, List<Pattern> $$1, List<Pattern> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        private static String a(List<Pattern> $$0, String $$1) {
            ArrayList $$2 = Lists.newArrayList();
            for (Pattern $$3 : $$0) {
                Matcher $$4 = $$3.matcher($$1);
                while ($$4.find()) {
                    $$2.add($$4.group());
                }
            }
            return String.join((CharSequence)", ", $$2);
        }

        ImmutableMap<String, String> a() {
            ImmutableMap.Builder $$0 = new ImmutableMap.Builder();
            GpuDevice $$1 = RenderSystem.getDevice();
            if ($$1.getBackendName().equals("OpenGL")) {
                String $$4;
                String $$3;
                String $$2 = hod$a.a(this.a, $$1.getRenderer());
                if (!$$2.isEmpty()) {
                    $$0.put((Object)"renderer", (Object)$$2);
                }
                if (!($$3 = hod$a.a(this.b, $$1.getVersion())).isEmpty()) {
                    $$0.put((Object)"version", (Object)$$3);
                }
                if (!($$4 = hod$a.a(this.c, $$1.getVendor())).isEmpty()) {
                    $$0.put((Object)"vendor", (Object)$$4);
                }
            }
            return $$0.build();
        }
    }
}

