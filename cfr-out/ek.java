/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public final class ek
extends Record {
    private final List<a> b;
    public static final ek a = new ek(List.of());
    private static final int c = 8;
    private static final int d = 16;

    public ek(wx $$0) {
        this((List)((Object)$$0.a(wx.a(ArrayList::new, 8), a::new)));
    }

    public ek(List<a> $$0) {
        this.b = $$0;
    }

    public void a(wx $$02) {
        $$02.a(this.b, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
    }

    public static ek a(za<?> $$0, b $$12) {
        List<a> $$2 = $$0.a().stream().map($$1 -> {
            yu $$2 = $$12.sign($$1.c());
            if ($$2 != null) {
                return new a($$1.a(), $$2);
            }
            return null;
        }).filter(Objects::nonNull).toList();
        return new ek($$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ek.class, "entries", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ek.class, "entries", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ek.class, "entries", "b"}, this, $$0);
    }

    public List<a> a() {
        return this.b;
    }

    @FunctionalInterface
    public static interface b {
        public @Nullable yu sign(String var1);
    }

    public record a(String a, yu b) {
        public a(wx $$0) {
            this($$0.d(16), yu.a($$0));
        }

        public void a(wx $$0) {
            $$0.a(this.a, 16);
            yu.a($$0, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;signature", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;signature", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;signature", "a", "b"}, this, $$0);
        }
    }
}

