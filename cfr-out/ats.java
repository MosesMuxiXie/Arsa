/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public interface ats<Params, Result> {
    public auc<Params, Result> a();

    public a b();

    public JsonElement a(auo var1, @Nullable JsonElement var2, avh var3);

    public static <Result> b<Void, Result> a(e<Result> $$0) {
        return new b($$0);
    }

    public static <Params, Result> b<Params, Result> a(f<Params, Result> $$0) {
        return new b<Params, Result>($$0);
    }

    public static <Result> b<Void, Result> a(Function<auo, Result> $$0) {
        return new b($$0);
    }

    public static class b<Params, Result> {
        private String a = "";
        private @Nullable aud<Params> b;
        private @Nullable aug<Result> c;
        private boolean d = true;
        private boolean e = true;
        private @Nullable e<Result> f;
        private @Nullable f<Params, Result> g;

        public b(e<Result> $$0) {
            this.f = $$0;
        }

        public b(f<Params, Result> $$0) {
            this.g = $$0;
        }

        public b(Function<auo, Result> $$0) {
            this.f = ($$1, $$2) -> $$0.apply($$1);
        }

        public b<Params, Result> a(String $$0) {
            this.a = $$0;
            return this;
        }

        public b<Params, Result> a(String $$0, auh<Result> $$1) {
            this.c = new aug<Result>($$0, $$1.b());
            return this;
        }

        public b<Params, Result> b(String $$0, auh<Params> $$1) {
            this.b = new aud<Params>($$0, $$1.b());
            return this;
        }

        public b<Params, Result> a() {
            this.d = false;
            return this;
        }

        public b<Params, Result> b() {
            this.e = false;
            return this;
        }

        public ats<Params, Result> c() {
            if (this.c == null) {
                throw new IllegalStateException("No response defined");
            }
            a $$0 = new a(this.e, this.d);
            auc<Params, Result> $$1 = new auc<Params, Result>(this.a, this.b, this.c);
            if (this.f != null) {
                return new d<Params, Result>($$1, $$0, this.f);
            }
            if (this.g != null) {
                if (this.b == null) {
                    throw new IllegalStateException("No param schema defined");
                }
                return new c<Params, Result>($$1, $$0, this.g);
            }
            throw new IllegalStateException("No method defined");
        }

        public ats<?, ?> a(jq<ats<?, ?>> $$0, String $$1) {
            return this.a($$0, amo.b($$1));
        }

        private ats<?, ?> a(jq<ats<?, ?>> $$0, amo $$1) {
            return jq.a($$0, $$1, this.c());
        }
    }

    @FunctionalInterface
    public static interface e<Result> {
        public Result apply(auo var1, avh var2);
    }

    @FunctionalInterface
    public static interface f<Params, Result> {
        public Result apply(auo var1, Params var2, avh var3);
    }

    public record c<Params, Result>(auc<Params, Result> a, a b, f<Params, Result> c) implements ats<Params, Result>
    {
        @Override
        public JsonElement a(auo $$0, @Nullable JsonElement $$1, avh $$2) {
            JsonElement $$7;
            if ($$1 == null || !$$1.isJsonArray() && !$$1.isJsonObject()) {
                throw new avl("Expected params as array or named");
            }
            if (this.a.b().isEmpty()) {
                throw new IllegalArgumentException("Method defined as having parameters without describing them");
            }
            if ($$1.isJsonObject()) {
                String $$3 = this.a.b().get().b();
                JsonElement $$4 = $$1.getAsJsonObject().get($$3);
                if ($$4 == null) {
                    throw new avl(String.format(Locale.ROOT, "Params passed by-name, but expected param [%s] does not exist", $$3));
                }
                JsonElement $$5 = $$4;
            } else {
                JsonArray $$6 = $$1.getAsJsonArray();
                if ($$6.isEmpty() || $$6.size() > 1) {
                    throw new avl("Expected exactly one element in the params array");
                }
                $$7 = $$6.get(0);
            }
            Object $$8 = this.a.b().get().c().j().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$7).getOrThrow(avl::new);
            Result $$9 = this.c.apply($$0, $$8, $$2);
            if (this.a.c().isEmpty()) {
                throw new IllegalStateException("No result codec defined");
            }
            return (JsonElement)this.a.c().get().c().j().encodeStart((DynamicOps)JsonOps.INSTANCE, $$9).getOrThrow(avj::new);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "info;attributes;function", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "info;attributes;function", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "info;attributes;function", "a", "b", "c"}, this, $$0);
        }
    }

    public record d<Params, Result>(auc<Params, Result> a, a b, e<Result> c) implements ats<Params, Result>
    {
        @Override
        public JsonElement a(auo $$0, @Nullable JsonElement $$1, avh $$2) {
            if (!($$1 == null || $$1.isJsonArray() && $$1.getAsJsonArray().isEmpty())) {
                throw new avl("Expected no params, or an empty array");
            }
            if (this.a.b().isPresent()) {
                throw new IllegalArgumentException("Parameterless method unexpectedly has parameter description");
            }
            Result $$3 = this.c.apply($$0, $$2);
            if (this.a.c().isEmpty()) {
                throw new IllegalStateException("No result codec defined");
            }
            return (JsonElement)this.a.c().get().c().j().encodeStart((DynamicOps)JsonOps.INSTANCE, $$3).getOrThrow(avl::new);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "info;attributes;supplier", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "info;attributes;supplier", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "info;attributes;supplier", "a", "b", "c"}, this, $$0);
        }
    }

    public record a(boolean a, boolean b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "runOnMainThread;discoverable", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "runOnMainThread;discoverable", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "runOnMainThread;discoverable", "a", "b"}, this, $$0);
        }
    }
}

