/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GL31
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL31;
import org.slf4j.Logger;

public class fxg
implements AutoCloseable {
    private static final Logger c = LogUtils.getLogger();
    public static Set<String> a = Sets.newHashSet((Object[])new String[]{"Projection", "Lighting", "Fog", "Globals"});
    public static fxg b = new fxg(-1, "invalid");
    private final Map<String, fxo> d = new HashMap<String, fxo>();
    private final int e;
    private final String f;

    private fxg(int $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public static fxg a(fxk $$0, fxk $$1, VertexFormat $$2, String $$3) throws hph.b {
        int $$4 = GlStateManager.glCreateProgram();
        if ($$4 <= 0) {
            throw new hph.b("Could not create shader program (returned program ID " + $$4 + ")");
        }
        int $$5 = 0;
        for (String $$6 : $$2.getElementAttributeNames()) {
            GlStateManager._glBindAttribLocation($$4, $$5, $$6);
            ++$$5;
        }
        GlStateManager.glAttachShader($$4, $$0.b());
        GlStateManager.glAttachShader($$4, $$1.b());
        GlStateManager.glLinkProgram($$4);
        int $$7 = GlStateManager.glGetProgrami($$4, 35714);
        String $$8 = GlStateManager.glGetProgramInfoLog($$4, 32768);
        if ($$7 == 0 || $$8.contains("Failed for unknown reason")) {
            throw new hph.b("Error encountered when linking program containing VS " + String.valueOf($$0.a()) + " and FS " + String.valueOf($$1.a()) + ". Log output: " + $$8);
        }
        if (!$$8.isEmpty()) {
            c.info("Info log when linking program containing VS {} and FS {}. Log output: {}", new Object[]{$$0.a(), $$1.a(), $$8});
        }
        return new fxg($$4, $$3);
    }

    public void a(List<RenderPipeline.UniformDescription> $$0, List<String> $$1) {
        int $$2 = 0;
        int $$3 = 0;
        for (RenderPipeline.UniformDescription $$4 : $$0) {
            String $$5 = $$4.name();
            fxo.c $$10 = switch ($$4.type()) {
                default -> throw new MatchException(null, null);
                case fyz.a -> {
                    int $$6 = GL31.glGetUniformBlockIndex((int)this.e, (CharSequence)$$5);
                    if ($$6 == -1) {
                        yield null;
                    }
                    int $$7 = $$2++;
                    GL31.glUniformBlockBinding((int)this.e, (int)$$6, (int)$$7);
                    yield new fxo.b($$7);
                }
                case fyz.b -> {
                    int $$8 = GlStateManager._glGetUniformLocation(this.e, $$5);
                    if ($$8 == -1) {
                        c.warn("{} shader program does not use utb {} defined in the pipeline. This might be a bug.", (Object)this.f, (Object)$$5);
                        yield null;
                    }
                    int $$9 = $$3++;
                    yield new fxo.c($$8, $$9, Objects.requireNonNull($$4.textureFormat()));
                }
            };
            if ($$10 == null) continue;
            this.d.put($$5, $$10);
        }
        for (String $$11 : $$1) {
            int $$12 = GlStateManager._glGetUniformLocation(this.e, $$11);
            if ($$12 == -1) {
                c.warn("{} shader program does not use sampler {} defined in the pipeline. This might be a bug.", (Object)this.f, (Object)$$11);
                continue;
            }
            int $$13 = $$3++;
            this.d.put($$11, new fxo.a($$12, $$13));
        }
        int $$14 = GlStateManager.glGetProgrami(this.e, 35382);
        for (int $$15 = 0; $$15 < $$14; ++$$15) {
            String $$16 = GL31.glGetActiveUniformBlockName((int)this.e, (int)$$15);
            if (this.d.containsKey($$16)) continue;
            if (!$$1.contains($$16) && a.contains($$16)) {
                int $$17 = $$2++;
                GL31.glUniformBlockBinding((int)this.e, (int)$$15, (int)$$17);
                this.d.put($$16, new fxo.b($$17));
                continue;
            }
            c.warn("Found unknown and unsupported uniform {} in {}", (Object)$$16, (Object)this.f);
        }
    }

    @Override
    public void close() {
        this.d.values().forEach(fxo::close);
        GlStateManager.glDeleteProgram(this.e);
    }

    public @Nullable fxo a(String $$0) {
        RenderSystem.assertOnRenderThread();
        return this.d.get($$0);
    }

    @VisibleForTesting
    public int a() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public String b() {
        return this.f;
    }

    public Map<String, fxo> c() {
        return this.d;
    }
}

