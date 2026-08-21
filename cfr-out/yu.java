/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record yu(byte[] c) {
    public static final Codec<yu> a = bfm.y.xmap(yu::new, yu::c);
    public static final int b = 256;

    public yu {
        Preconditions.checkState(($$0.length == 256 ? 1 : 0) != 0, (Object)"Invalid message signature size");
    }

    public static yu a(wx $$0) {
        byte[] $$1 = new byte[256];
        $$0.b($$1);
        return new yu($$1);
    }

    public static void a(wx $$0, yu $$1) {
        $$0.c($$1.c);
    }

    public boolean a(bgw $$0, bgv $$1) {
        return $$0.validate($$1, this.c);
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) return true;
        if (!($$0 instanceof yu)) return false;
        yu $$1 = (yu)$$0;
        if (!Arrays.equals(this.c, $$1.c)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override
    public String toString() {
        return Base64.getEncoder().encodeToString(this.c);
    }

    public static String a(@Nullable yu $$0) {
        if ($$0 == null) {
            return "<no signature>";
        }
        return $$0.toString();
    }

    public a a(yv $$0) {
        int $$1 = $$0.a(this);
        return $$1 != -1 ? new a($$1) : new a(this);
    }

    public int b() {
        return Arrays.hashCode(this.c);
    }

    public static final class a
    extends Record {
        private final int b;
        private final @Nullable yu c;
        public static final int a = -1;

        public a(yu $$0) {
            this(-1, $$0);
        }

        public a(int $$0) {
            this($$0, null);
        }

        public a(int $$0, @Nullable yu $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static a a(wx $$0) {
            int $$1 = $$0.l() - 1;
            if ($$1 == -1) {
                return new a(yu.a($$0));
            }
            return new a($$1);
        }

        public static void a(wx $$0, a $$1) {
            $$0.c($$1.a() + 1);
            if ($$1.b() != null) {
                yu.a($$0, $$1.b());
            }
        }

        public Optional<yu> a(yv $$0) {
            if (this.c != null) {
                return Optional.of(this.c);
            }
            return Optional.ofNullable($$0.a(this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;fullSignature", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;fullSignature", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;fullSignature", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public @Nullable yu b() {
            return this.c;
        }
    }
}

