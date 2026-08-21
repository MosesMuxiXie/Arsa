/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public final class ijr {
    final RenderPipeline a;
    final Map<String, d> b;
    final iju c;
    final ijq d;
    final a e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final int j;
    final ijp k;

    ijr(RenderPipeline $$0, Map<String, d> $$1, boolean $$2, boolean $$3, ijp $$4, ijq $$5, iju $$6, a $$7, boolean $$8, boolean $$9, int $$10) {
        this.a = $$0;
        this.b = $$1;
        this.d = $$5;
        this.c = $$6;
        this.f = $$2;
        this.g = $$3;
        this.e = $$7;
        this.k = $$4;
        this.h = $$8;
        this.i = $$9;
        this.j = $$10;
    }

    public String toString() {
        return "RenderSetup[layeringTransform=" + String.valueOf(this.k) + ", textureTransform=" + String.valueOf(this.c) + ", textures=" + String.valueOf(this.b) + ", outlineProperty=" + String.valueOf((Object)this.e) + ", useLightmap=" + this.f + ", useOverlay=" + this.g + "]";
    }

    public static b a(RenderPipeline $$0) {
        return new b($$0);
    }

    public Map<String, c> a() {
        if (this.b.isEmpty() && !this.g && !this.f) {
            return Collections.emptyMap();
        }
        HashMap<String, c> $$0 = new HashMap<String, c>();
        if (this.g) {
            $$0.put("Sampler1", new c(gfj.V().i.r().a(), RenderSystem.getSamplerCache().a(FilterMode.LINEAR)));
        }
        if (this.f) {
            $$0.put("Sampler2", new c(gfj.V().i.q().a(), RenderSystem.getSamplerCache().a(FilterMode.LINEAR)));
        }
        ilr $$1 = gfj.V().af();
        for (Map.Entry<String, d> $$2 : this.b.entrySet()) {
            ikz $$3 = $$1.b($$2.getValue().a);
            fzf $$4 = $$2.getValue().b().get();
            $$0.put($$2.getKey(), new c($$3.b(), $$4 != null ? $$4 : $$3.c()));
        }
        return $$0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("none");
        public static final /* enum */ a b = new a("is_outline");
        public static final /* enum */ a c = new a("affects_outline");
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        public String toString() {
            return this.d;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            e = ijr$a.a();
        }
    }

    public static class b {
        private final RenderPipeline a;
        private boolean b = false;
        private boolean c = false;
        private ijp d = ijp.a;
        private ijq e = ijq.a;
        private iju f = iju.b;
        private boolean g = false;
        private boolean h = false;
        private int i = 1536;
        private a j = ijr$a.a;
        private final Map<String, d> k = new HashMap<String, d>();

        b(RenderPipeline $$0) {
            this.a = $$0;
        }

        public b a(String $$0, amo $$1) {
            this.k.put($$0, new d($$1, () -> null));
            return this;
        }

        public b a(String $$0, amo $$1, @Nullable Supplier<fzf> $$2) {
            this.k.put($$0, new d($$1, (Supplier<fzf>)Suppliers.memoize(() -> $$2 == null ? null : (fzf)$$2.get())));
            return this;
        }

        public b a() {
            this.b = true;
            return this;
        }

        public b b() {
            this.c = true;
            return this;
        }

        public b c() {
            this.g = true;
            return this;
        }

        public b d() {
            this.h = true;
            return this;
        }

        public b a(int $$0) {
            this.i = $$0;
            return this;
        }

        public b a(ijp $$0) {
            this.d = $$0;
            return this;
        }

        public b a(ijq $$0) {
            this.e = $$0;
            return this;
        }

        public b a(iju $$0) {
            this.f = $$0;
            return this;
        }

        public b a(a $$0) {
            this.j = $$0;
            return this;
        }

        public ijr e() {
            return new ijr(this.a, this.k, this.b, this.c, this.d, this.e, this.f, this.j, this.g, this.h, this.i);
        }
    }

    public record c(GpuTextureView a, fzf b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "textureView;sampler", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "textureView;sampler", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "textureView;sampler", "a", "b"}, this, $$0);
        }
    }

    static final class d
    extends Record {
        final amo a;
        private final Supplier<@Nullable fzf> b;

        d(amo $$0, Supplier<@Nullable fzf> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "location;sampler", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "location;sampler", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "location;sampler", "a", "b"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public Supplier<@Nullable fzf> b() {
            return this.b;
        }
    }
}

