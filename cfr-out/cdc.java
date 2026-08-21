/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public sealed interface cdc {
    public static final d a = new d(cdc$e.b, cdc$b.b);
    public static final d b = new d(cdc$e.c, cdc$b.b);
    public static final d c = new d(cdc$e.a, cdc$b.b);
    public static final a d = new a();
    public static final c e = new c();
    public static final f f = new f();

    default public boolean a() {
        return false;
    }

    public static final class d
    extends Record
    implements cdc {
        private final e g;
        private final b h;

        public d(e $$0, b $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        @Override
        public boolean a() {
            return true;
        }

        public d a(dlt $$0) {
            return new d(this.g, new b(true, $$0));
        }

        public d b() {
            return new d(this.g, cdc$b.a);
        }

        public boolean c() {
            return this.h.c;
        }

        public @Nullable dlt d() {
            return this.h.d;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "swingSource;itemContext", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "swingSource;itemContext", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "swingSource;itemContext", "g", "h"}, this, $$0);
        }

        public e e() {
            return this.g;
        }

        public b f() {
            return this.h;
        }
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e a = new e();
        public static final /* enum */ e b = new e();
        public static final /* enum */ e c = new e();
        private static final /* synthetic */ e[] d;

        public static e[] values() {
            return (e[])d.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        private static /* synthetic */ e[] a() {
            return new e[]{a, b, c};
        }

        static {
            d = cdc$e.a();
        }
    }

    public static final class b
    extends Record {
        final boolean c;
        final @Nullable dlt d;
        static b a = new b(false, null);
        static b b = new b(true, null);

        public b(boolean $$0, @Nullable dlt $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "wasItemInteraction;heldItemTransformedTo", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "wasItemInteraction;heldItemTransformedTo", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "wasItemInteraction;heldItemTransformedTo", "c", "d"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        public @Nullable dlt b() {
            return this.d;
        }
    }

    public record a() implements cdc
    {
    }

    public record c() implements cdc
    {
    }

    public record f() implements cdc
    {
    }
}

