/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hph
extends bbe<c>
implements AutoCloseable {
    static final Logger c = LogUtils.getLogger();
    public static final int a = 32768;
    public static final String b = "shaders";
    private static final String d = "shaders/include/";
    private static final amm e = amm.a("post_effect");
    final ilr f;
    private final Consumer<Exception> g;
    private a h = new a(hph$c.a);
    final hnt i = new hnt("post", 0.1f, 1000.0f, false);

    public hph(ilr $$0, Consumer<Exception> $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    protected c a(baz $$0, bzm $$1) {
        ImmutableMap.Builder $$2 = ImmutableMap.builder();
        Map<amo, bax> $$3 = $$0.b(b, hph::a);
        for (Map.Entry<amo, bax> $$4 : $$3.entrySet()) {
            amo $$5 = $$4.getKey();
            ShaderType $$6 = ShaderType.byLocation($$5);
            if ($$6 == null) continue;
            hph.a($$5, $$4.getValue(), $$6, $$3, (ImmutableMap.Builder<d, String>)$$2);
        }
        ImmutableMap.Builder $$7 = ImmutableMap.builder();
        for (Map.Entry<amo, bax> $$8 : e.a($$0).entrySet()) {
            hph.a($$8.getKey(), $$8.getValue(), (ImmutableMap.Builder<amo, how>)$$7);
        }
        return new c((Map<d, String>)$$2.build(), (Map<amo, how>)$$7.build());
    }

    private static void a(amo $$0, bax $$1, ShaderType $$2, Map<amo, bax> $$3, ImmutableMap.Builder<d, String> $$4) {
        amo $$5 = $$2.idConverter().b($$0);
        fyq $$6 = hph.a($$3, $$0);
        try (BufferedReader $$7 = $$1.e();){
            String $$8 = IOUtils.toString((Reader)$$7);
            $$4.put((Object)new d($$5, $$2), (Object)String.join((CharSequence)"", $$6.a($$8)));
        }
        catch (IOException $$9) {
            c.error("Failed to load shader source at {}", (Object)$$0, (Object)$$9);
        }
    }

    private static fyq a(final Map<amo, bax> $$0, amo $$1) {
        final amo $$2 = $$1.a(bfp::c);
        return new fyq(){
            private final Set<amo> c = new ObjectArraySet();

            /*
             * WARNING - void declaration
             */
            @Override
            public @Nullable String a(boolean $$02, String $$12) {
                String string;
                block13: {
                    void $$5;
                    try {
                        if ($$02) {
                            amo $$22 = $$2.a($$1 -> bfp.d($$1 + $$12));
                        } else {
                            amo $$3 = amo.a($$12).f(hph.d);
                        }
                    }
                    catch (s $$4) {
                        c.error("Malformed GLSL import {}: {}", (Object)$$12, (Object)$$4.getMessage());
                        return "#error " + $$4.getMessage();
                    }
                    if (!this.c.add((amo)$$5)) {
                        return null;
                    }
                    BufferedReader $$6 = ((bax)$$0.get($$5)).e();
                    try {
                        string = IOUtils.toString((Reader)$$6);
                        if ($$6 == null) break block13;
                    }
                    catch (Throwable throwable) {
                        try {
                            if ($$6 != null) {
                                try {
                                    ((Reader)$$6).close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (IOException $$7) {
                            c.error("Could not open GLSL import {}: {}", (Object)$$5, (Object)$$7.getMessage());
                            return "#error " + $$7.getMessage();
                        }
                    }
                    ((Reader)$$6).close();
                }
                return string;
            }
        };
    }

    private static void a(amo $$0, bax $$1, ImmutableMap.Builder<amo, how> $$2) {
        amo $$3 = e.b($$0);
        try (BufferedReader $$4 = $$1.e();){
            JsonElement $$5 = bhf.a($$4);
            $$2.put((Object)$$3, (Object)((how)how.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$5).getOrThrow(JsonSyntaxException::new)));
        }
        catch (JsonParseException | IOException $$6) {
            c.error("Failed to parse post chain at {}", (Object)$$0, (Object)$$6);
        }
    }

    private static boolean a(amo $$0) {
        return ShaderType.byLocation($$0) != null || $$0.a().endsWith(".glsl");
    }

    @Override
    protected void a(c $$02, baz $$1, bzm $$2) {
        a $$3 = new a($$02);
        HashSet<RenderPipeline> $$4 = new HashSet<RenderPipeline>(hpa.a());
        ArrayList<amo> $$5 = new ArrayList<amo>();
        GpuDevice $$6 = RenderSystem.getDevice();
        $$6.clearPipelineCache();
        for (RenderPipeline $$7 : $$4) {
            CompiledRenderPipeline $$8 = $$6.precompilePipeline($$7, $$3::a);
            if ($$8.isValid()) continue;
            $$5.add($$7.getLocation());
        }
        if (!$$5.isEmpty()) {
            $$6.clearPipelineCache();
            throw new RuntimeException("Failed to load required shader programs:\n" + $$5.stream().map($$0 -> " - " + String.valueOf($$0)).collect(Collectors.joining("\n")));
        }
        this.h.close();
        this.h = $$3;
    }

    @Override
    public String getName() {
        return "Shader Loader";
    }

    private void a(Exception $$0) {
        if (this.h.d) {
            return;
        }
        this.g.accept($$0);
        this.h.d = true;
    }

    public @Nullable hov a(amo $$0, Set<amo> $$1) {
        try {
            return this.h.a($$0, $$1);
        }
        catch (b $$2) {
            c.error("Failed to load post chain: {}", (Object)$$0, (Object)$$2);
            this.h.c.put($$0, Optional.empty());
            this.a($$2);
            return null;
        }
    }

    @Override
    public void close() {
        this.h.close();
        this.i.close();
    }

    public @Nullable String a(amo $$0, ShaderType $$1) {
        return this.h.a($$0, $$1);
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }

    class a
    implements AutoCloseable {
        private final c b;
        final Map<amo, Optional<hov>> c = new HashMap<amo, Optional<hov>>();
        boolean d;

        a(c $$0) {
            this.b = $$0;
        }

        public @Nullable hov a(amo $$0, Set<amo> $$1) throws b {
            Optional<hov> $$2 = this.c.get($$0);
            if ($$2 != null) {
                return $$2.orElse(null);
            }
            hov $$3 = this.b($$0, $$1);
            this.c.put($$0, Optional.of($$3));
            return $$3;
        }

        private hov b(amo $$0, Set<amo> $$1) throws b {
            how $$2 = this.b.c.get($$0);
            if ($$2 == null) {
                throw new b("Could not find post chain with id: " + String.valueOf($$0));
            }
            return hov.a($$2, hph.this.f, $$1, $$0, hph.this.i);
        }

        @Override
        public void close() {
            this.c.values().forEach($$0 -> $$0.ifPresent(hov::close));
            this.c.clear();
        }

        public @Nullable String a(amo $$0, ShaderType $$1) {
            return this.b.b.get(new d($$0, $$1));
        }
    }

    public static final class c
    extends Record {
        final Map<d, String> b;
        final Map<amo, how> c;
        public static final c a = new c(Map.of(), Map.of());

        public c(Map<d, String> $$0, Map<amo, how> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "shaderSources;postChains", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "shaderSources;postChains", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "shaderSources;postChains", "b", "c"}, this, $$0);
        }

        public Map<d, String> a() {
            return this.b;
        }

        public Map<amo, how> b() {
            return this.c;
        }
    }

    record d(amo a, ShaderType b) {
        @Override
        public String toString() {
            return String.valueOf(this.a) + " (" + String.valueOf((Object)this.b) + ")";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "id;type", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "id;type", "a", "b"}, this, $$0);
        }
    }

    public static class b
    extends Exception {
        public b(String $$0) {
            super($$0);
        }
    }
}

