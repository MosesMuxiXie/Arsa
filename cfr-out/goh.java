/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class goh
implements fwq {
    static final Logger b = LogUtils.getLogger();
    private final fyh c;
    private final gnn<b> d;

    goh(fyh $$0, gnn<b> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void close() {
        this.c.close();
    }

    @Override
    public @Nullable fwt a(int $$0) {
        return this.d.a($$0);
    }

    @Override
    public IntSet a() {
        return IntSets.unmodifiable((IntSet)this.d.b());
    }

    static final class b
    extends Record
    implements fwt {
        final float a;
        final fyh b;
        final int c;
        final int d;
        final int e;
        final int f;
        private final int g;
        final int h;

        b(float $$0, fyh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
        }

        @Override
        public fwp a() {
            return fwp.a(this.g);
        }

        @Override
        public goa a(fwt.a $$0) {
            return $$0.a(this.a(), new fwo(){

                @Override
                public float d() {
                    return 1.0f / a;
                }

                @Override
                public int a() {
                    return e;
                }

                @Override
                public int b() {
                    return f;
                }

                @Override
                public float j() {
                    return h;
                }

                @Override
                public void a(int $$0, int $$1, GpuTexture $$2) {
                    RenderSystem.getDevice().createCommandEncoder().writeToTexture($$2, b, 0, 0, $$0, $$1, e, f, c, d);
                }

                @Override
                public boolean c() {
                    return b.c().a() > 1;
                }
            });
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public float b() {
            return this.a;
        }

        public fyh c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public int e() {
            return this.d;
        }

        public int f() {
            return this.e;
        }

        public int g() {
            return this.f;
        }

        public int h() {
            return this.g;
        }

        public int i() {
            return this.h;
        }
    }

    public record a(amo c, int d, int e, int[][] f) implements goj
    {
        private static final Codec<int[][]> g = Codec.STRING.listOf().xmap($$0 -> {
            int $$1 = $$0.size();
            int[][] $$2 = new int[$$1][];
            for (int $$3 = 0; $$3 < $$1; ++$$3) {
                $$2[$$3] = ((String)$$0.get($$3)).codePoints().toArray();
            }
            return $$2;
        }, $$0 -> {
            ArrayList<String> $$1 = new ArrayList<String>(((int[][])$$0).length);
            for (int[] $$2 : $$0) {
                $$1.add(new String($$2, 0, $$2.length));
            }
            return $$1;
        }).validate(a::a);
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("file").forGetter(a::c), (App)Codec.INT.optionalFieldOf("height", (Object)8).forGetter(a::d), (App)Codec.INT.fieldOf("ascent").forGetter(a::e), (App)g.fieldOf("chars").forGetter(a::f)).apply((Applicative)$$0, a::new)).validate(a::a);

        private static DataResult<int[][]> a(int[][] $$0) {
            int $$1 = $$0.length;
            if ($$1 == 0) {
                return DataResult.error(() -> "Expected to find data in codepoint grid");
            }
            int[] $$2 = $$0[0];
            int $$3 = $$2.length;
            if ($$3 == 0) {
                return DataResult.error(() -> "Expected to find data in codepoint grid");
            }
            for (int $$4 = 1; $$4 < $$1; ++$$4) {
                int[] $$5 = $$0[$$4];
                if ($$5.length == $$3) continue;
                return DataResult.error(() -> "Lines in codepoint grid have to be the same length (found: " + $$5.length + " codepoints, expected: " + $$3 + "), pad with \\u0000");
            }
            return DataResult.success((Object)$$0);
        }

        private static DataResult<a> a(a $$0) {
            if ($$0.e > $$0.d) {
                return DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d);
            }
            return DataResult.success((Object)$$0);
        }

        @Override
        public gok a() {
            return gok.a;
        }

        @Override
        public Either<goj.b, goj.c> b() {
            return Either.left(this::a);
        }

        private fwq a(baz $$02) throws IOException {
            amo $$1 = this.c.f("textures/");
            try (InputStream $$2 = $$02.open($$1);){
                fyh $$3 = fyh.a(fyh.a.a, $$2);
                int $$4 = $$3.a();
                int $$5 = $$3.b();
                int $$6 = $$4 / this.f[0].length;
                int $$7 = $$5 / this.f.length;
                float $$8 = (float)this.d / (float)$$7;
                gnn<b> $$9 = new gnn<b>(b[]::new, $$0 -> new b[$$0][]);
                for (int $$10 = 0; $$10 < this.f.length; ++$$10) {
                    int $$11 = 0;
                    for (int $$12 : this.f[$$10]) {
                        int $$14;
                        b $$15;
                        int $$13 = $$11++;
                        if ($$12 == 0 || ($$15 = $$9.a($$12, new b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)($$14 = this.a($$3, $$6, $$7, $$13, $$10)) * $$8)) + 1, this.e))) == null) continue;
                        b.warn("Codepoint '{}' declared multiple times in {}", (Object)Integer.toHexString($$12), (Object)$$1);
                    }
                }
                goh goh2 = new goh($$3, $$9);
                return goh2;
            }
        }

        private int a(fyh $$0, int $$1, int $$2, int $$3, int $$4) {
            int $$5;
            for ($$5 = $$1 - 1; $$5 >= 0; --$$5) {
                int $$6 = $$3 * $$1 + $$5;
                for (int $$7 = 0; $$7 < $$2; ++$$7) {
                    int $$8 = $$4 * $$2 + $$7;
                    if ($$0.b($$6, $$8) == 0) continue;
                    return $$5 + 1;
                }
            }
            return $$5 + 1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "file;height;ascent;codepointGrid", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "file;height;ascent;codepointGrid", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "file;height;ascent;codepointGrid", "c", "d", "e", "f"}, this, $$0);
        }
    }
}

