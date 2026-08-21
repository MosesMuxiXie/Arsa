/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  org.apache.commons.lang3.mutable.MutableLong
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 */
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.apache.commons.lang3.mutable.MutableLong;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;

public class fzl
implements AutoCloseable {
    private final fzi.a a;
    private @Nullable fzi.a b;
    private final a c;

    public fzl(fzi.a $$0, a $$1) {
        this.a = $$0;
        this.c = $$1;
    }

    private static fzj a(ByteBuffer $$0, int $$1, VertexFormat $$2) {
        int $$3 = $$2.getOffset(VertexFormatElement.POSITION);
        if ($$3 == -1) {
            throw new IllegalArgumentException("Cannot identify quad centers with no position element");
        }
        FloatBuffer $$4 = $$0.asFloatBuffer();
        int $$5 = $$2.getVertexSize() / 4;
        int $$6 = $$5 * 4;
        int $$7 = $$1 / 4;
        fzj $$8 = new fzj($$7);
        for (int $$9 = 0; $$9 < $$7; ++$$9) {
            int $$10 = $$9 * $$6 + $$3;
            int $$11 = $$10 + $$5 * 2;
            float $$12 = $$4.get($$10 + 0);
            float $$13 = $$4.get($$10 + 1);
            float $$14 = $$4.get($$10 + 2);
            float $$15 = $$4.get($$11 + 0);
            float $$16 = $$4.get($$11 + 1);
            float $$17 = $$4.get($$11 + 2);
            float $$18 = ($$12 + $$15) / 2.0f;
            float $$19 = ($$13 + $$16) / 2.0f;
            float $$20 = ($$14 + $$17) / 2.0f;
            $$8.a($$9, $$18, $$19, $$20);
        }
        return $$8;
    }

    public ByteBuffer a() {
        return this.a.a();
    }

    public @Nullable ByteBuffer b() {
        return this.b != null ? this.b.a() : null;
    }

    public a c() {
        return this.c;
    }

    public @Nullable b a(fzi $$0, fzr $$1) {
        if (this.c.d() != VertexFormat.b.h) {
            return null;
        }
        fzj $$2 = fzl.a(this.a.a(), this.c.b(), this.c.a());
        b $$3 = new b($$2, this.c.e());
        this.b = $$3.a($$0, $$1);
        return $$3;
    }

    @Override
    public void close() {
        this.a.close();
        if (this.b != null) {
            this.b.close();
        }
    }

    public record a(VertexFormat a, int b, int c, VertexFormat.b d, VertexFormat.a e) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "format;vertexCount;indexCount;mode;indexType", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "format;vertexCount;indexCount;mode;indexType", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "format;vertexCount;indexCount;mode;indexType", "a", "b", "c", "d", "e"}, this, $$0);
        }
    }

    public record b(fzj a, VertexFormat.a b) {
        public @Nullable fzi.a a(fzi $$0, fzr $$1) {
            int[] $$2 = $$1.sort(this.a);
            long $$3 = $$0.b($$2.length * 6 * this.b.c);
            IntConsumer $$4 = this.a($$3, this.b);
            for (int $$5 : $$2) {
                $$4.accept($$5 * 4 + 0);
                $$4.accept($$5 * 4 + 1);
                $$4.accept($$5 * 4 + 2);
                $$4.accept($$5 * 4 + 2);
                $$4.accept($$5 * 4 + 3);
                $$4.accept($$5 * 4 + 0);
            }
            return $$0.a();
        }

        private IntConsumer a(long $$0, VertexFormat.a $$12) {
            MutableLong $$2 = new MutableLong($$0);
            return switch ($$12) {
                default -> throw new MatchException(null, null);
                case VertexFormat.a.a -> $$1 -> MemoryUtil.memPutShort((long)$$2.getAndAdd(2L), (short)((short)$$1));
                case VertexFormat.a.b -> $$1 -> MemoryUtil.memPutInt((long)$$2.getAndAdd(4L), (int)$$1);
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "centroids;indexType", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "centroids;indexType", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "centroids;indexType", "a", "b"}, this, $$0);
        }
    }
}

