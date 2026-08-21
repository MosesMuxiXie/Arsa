/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface ym {
    public static final Codec<ym> a = amo.a.flatComapMap(c::new, $$0 -> {
        if ($$0 instanceof c) {
            c $$1 = (c)$$0;
            return DataResult.success((Object)$$1.a());
        }
        return DataResult.error(() -> "Unsupported font description type: " + String.valueOf($$0));
    });
    public static final c b = new c(amo.b("default"));

    public static final class c
    extends Record
    implements ym {
        private final amo c;

        public c(amo $$0) {
            this.c = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id", "c"}, this, $$0);
        }

        public amo a() {
            return this.c;
        }
    }

    public static final class b
    extends Record
    implements ym {
        private final doy c;
        private final boolean d;

        public b(doy $$0, boolean $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "profile;hat", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "profile;hat", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "profile;hat", "c", "d"}, this, $$0);
        }

        public doy a() {
            return this.c;
        }

        public boolean b() {
            return this.d;
        }
    }

    public static final class a
    extends Record
    implements ym {
        private final amo c;
        private final amo d;

        public a(amo $$0, amo $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "atlasId;spriteId", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "atlasId;spriteId", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "atlasId;spriteId", "c", "d"}, this, $$0);
        }

        public amo a() {
            return this.c;
        }

        public amo b() {
            return this.d;
        }
    }
}

