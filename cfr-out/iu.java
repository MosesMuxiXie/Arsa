/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface iu {
    public amo a();

    public record a(amo a, String b) implements c
    {
        private final String b;

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "texturePath;url", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "texturePath;url", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "texturePath;url", "a", "b"}, this, $$0);
        }

        @Override
        public amo b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }
    }

    public static final class b
    extends Record
    implements c {
        private final amo d;
        private final amo e;
        public static final Codec<b> a = amo.a.xmap(b::new, b::a);
        public static final MapCodec<b> b = a.fieldOf("asset_id");
        public static final aao<ByteBuf, b> c = amo.b.a(b::new, b::a);

        public b(amo $$02) {
            this($$02, $$02.a($$0 -> "textures/" + $$0 + ".png"));
        }

        public b(amo $$0, amo $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;texturePath", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;texturePath", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;texturePath", "d", "e"}, this, $$0);
        }

        @Override
        public amo a() {
            return this.d;
        }

        @Override
        public amo b() {
            return this.e;
        }
    }

    public static interface c
    extends iu {
        public amo b();
    }
}

