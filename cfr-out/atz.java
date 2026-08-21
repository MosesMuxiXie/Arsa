/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface atz<Params, Result> {
    public static final String a = "notification/";

    public auc<Params, Result> a();

    public a b();

    default public @Nullable JsonElement a(Params $$0) {
        return null;
    }

    default public @Nullable Result a(JsonElement $$0) {
        return null;
    }

    public static e<Void, Void> c() {
        return new e<Void, Void>(g::new);
    }

    public static <Params> e<Params, Void> d() {
        return new e(d::new);
    }

    public static <Result> e<Void, Result> e() {
        return new e(f::new);
    }

    public static <Params, Result> e<Params, Result> f() {
        return new e(c::new);
    }

    public static class e<Params, Result> {
        public static final a a = new a(true);
        private final b<Params, Result> b;
        private String c = "";
        private @Nullable aud<Params> d;
        private @Nullable aug<Result> e;

        public e(b<Params, Result> $$0) {
            this.b = $$0;
        }

        public e<Params, Result> a(String $$0) {
            this.c = $$0;
            return this;
        }

        public e<Params, Result> a(String $$0, auh<Result> $$1) {
            this.e = new aug<Result>($$0, $$1);
            return this;
        }

        public e<Params, Result> b(String $$0, auh<Params> $$1) {
            this.d = new aud<Params>($$0, $$1);
            return this;
        }

        private atz<Params, Result> a() {
            auc<Params, Result> $$0 = new auc<Params, Result>(this.c, this.d, this.e);
            return this.b.create($$0, a);
        }

        public jd.c<atz<Params, Result>> b(String $$0) {
            return this.a(amo.b(atz.a + $$0));
        }

        private jd.c<atz<Params, Result>> a(amo $$0) {
            return jq.b(mi.aD, $$0, this.a());
        }
    }

    @FunctionalInterface
    public static interface b<Params, Result> {
        public atz<Params, Result> create(auc<Params, Result> var1, a var2);
    }

    public static final class c<Params, Result>
    extends Record
    implements atz<Params, Result> {
        private final auc<Params, Result> b;
        private final a c;

        public c(auc<Params, Result> $$0, a $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public @Nullable JsonElement a(Params $$0) {
            if (this.b.b().isEmpty()) {
                throw new IllegalStateException("Method defined as having no parameters");
            }
            return (JsonElement)this.b.b().get().c().j().encodeStart((DynamicOps)JsonOps.INSTANCE, $$0).getOrThrow();
        }

        @Override
        public Result a(JsonElement $$0) {
            if (this.b.c().isEmpty()) {
                throw new IllegalStateException("Method defined as having no result");
            }
            return (Result)this.b.c().get().c().j().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$0).getOrThrow();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "info;attributes", "b", "c"}, this, $$0);
        }

        @Override
        public auc<Params, Result> a() {
            return this.b;
        }

        @Override
        public a b() {
            return this.c;
        }
    }

    public static final class f<Result>
    extends Record
    implements atz<Void, Result> {
        private final auc<Void, Result> b;
        private final a c;

        public f(auc<Void, Result> $$0, a $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public Result a(JsonElement $$0) {
            if (this.b.c().isEmpty()) {
                throw new IllegalStateException("Method defined as having no result");
            }
            return (Result)this.b.c().get().c().j().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$0).getOrThrow();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "info;attributes", "b", "c"}, this, $$0);
        }

        @Override
        public auc<Void, Result> a() {
            return this.b;
        }

        @Override
        public a b() {
            return this.c;
        }
    }

    public static final class d<Params>
    extends Record
    implements atz<Params, Void> {
        private final auc<Params, Void> b;
        private final a c;

        public d(auc<Params, Void> $$0, a $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public @Nullable JsonElement a(Params $$0) {
            if (this.b.b().isEmpty()) {
                throw new IllegalStateException("Method defined as having no parameters");
            }
            return (JsonElement)this.b.b().get().c().j().encodeStart((DynamicOps)JsonOps.INSTANCE, $$0).getOrThrow();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "info;attributes", "b", "c"}, this, $$0);
        }

        @Override
        public auc<Params, Void> a() {
            return this.b;
        }

        @Override
        public a b() {
            return this.c;
        }
    }

    public static final class g
    extends Record
    implements atz<Void, Void> {
        private final auc<Void, Void> b;
        private final a c;

        public g(auc<Void, Void> $$0, a $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "info;attributes", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "info;attributes", "b", "c"}, this, $$0);
        }

        @Override
        public auc<Void, Void> a() {
            return this.b;
        }

        @Override
        public a b() {
            return this.c;
        }
    }

    public record a(boolean a) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "discoverable", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "discoverable", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "discoverable", "a"}, this, $$0);
        }
    }
}

