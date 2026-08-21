/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hqp {
    public static final hqp a = new hqp(Map.of());
    private static final char b = '#';
    private final Map<String, ins> c;

    hqp(Map<String, ins> $$0) {
        this.c = $$0;
    }

    public @Nullable ins a(String $$0) {
        if (hqp.b($$0)) {
            $$0 = $$0.substring(1);
        }
        return this.c.get($$0);
    }

    private static boolean b(String $$0) {
        return $$0.charAt(0) == '#';
    }

    public static a a(JsonObject $$0) {
        a.a $$1 = new a.a();
        for (Map.Entry $$2 : $$0.entrySet()) {
            hqp.a((String)$$2.getKey(), ((JsonElement)$$2.getValue()).getAsString(), $$1);
        }
        return $$1.a();
    }

    private static void a(String $$0, String $$1, a.a $$2) {
        if (hqp.b($$1)) {
            $$2.a($$0, $$1.substring(1));
        } else {
            amo $$3 = amo.c($$1);
            if ($$3 == null) {
                throw new JsonParseException($$1 + " is not valid resource location");
            }
            $$2.a($$0, new ins(iob.a, $$3));
        }
    }

    public static final class hqp$a
    extends Record {
        final Map<String, d> b;
        public static final hqp$a a = new hqp$a(Map.of());

        public hqp$a(Map<String, d> $$0) {
            this.b = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqp$a.class, "values", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqp$a.class, "values", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqp$a.class, "values", "b"}, this, $$0);
        }

        public Map<String, d> a() {
            return this.b;
        }

        public static class a {
            private final Map<String, d> a = new HashMap<String, d>();

            public a a(String $$0, String $$1) {
                this.a.put($$0, new b($$1));
                return this;
            }

            public a a(String $$0, ins $$1) {
                this.a.put($$0, new e($$1));
                return this;
            }

            public hqp$a a() {
                if (this.a.isEmpty()) {
                    return a;
                }
                return new hqp$a(Map.copyOf(this.a));
            }
        }
    }

    public static class c {
        private static final Logger a = LogUtils.getLogger();
        private final List<a> b = new ArrayList<a>();

        public c a(a $$0) {
            this.b.addLast($$0);
            return this;
        }

        public c b(a $$0) {
            this.b.addFirst($$0);
            return this;
        }

        public hqp a(iny $$02) {
            if (this.b.isEmpty()) {
                return a;
            }
            Object2ObjectArrayMap $$1 = new Object2ObjectArrayMap();
            Object2ObjectArrayMap $$2 = new Object2ObjectArrayMap();
            for (a $$3 : Lists.reverse(this.b)) {
                $$3.b.forEach((arg_0, arg_1) -> c.a((Object2ObjectMap)$$2, (Object2ObjectMap)$$1, arg_0, arg_1));
            }
            if ($$2.isEmpty()) {
                return new hqp((Map<String, ins>)$$1);
            }
            boolean $$4 = true;
            while ($$4) {
                $$4 = false;
                ObjectIterator $$5 = Object2ObjectMaps.fastIterator((Object2ObjectMap)$$2);
                while ($$5.hasNext()) {
                    Object2ObjectMap.Entry $$6 = (Object2ObjectMap.Entry)$$5.next();
                    ins $$7 = (ins)$$1.get((Object)((b)$$6.getValue()).a);
                    if ($$7 == null) continue;
                    $$1.put((Object)((String)$$6.getKey()), (Object)$$7);
                    $$5.remove();
                    $$4 = true;
                }
            }
            if (!$$2.isEmpty()) {
                a.warn("Unresolved texture references in {}:\n{}", (Object)$$02.debugName(), (Object)$$2.entrySet().stream().map($$0 -> "\t#" + (String)$$0.getKey() + "-> #" + ((b)$$0.getValue()).a + "\n").collect(Collectors.joining()));
            }
            return new hqp((Map<String, ins>)$$1);
        }

        private static /* synthetic */ void a(Object2ObjectMap $$0, Object2ObjectMap $$1, String $$2, d $$3) {
            d d2 = $$3;
            Objects.requireNonNull(d2);
            d $$4 = d2;
            int $$5 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{e.class, b.class}, (Object)$$4, $$5)) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    e $$6 = (e)$$4;
                    $$0.remove((Object)$$2);
                    $$1.put((Object)$$2, (Object)$$6.a());
                    break;
                }
                case 1: {
                    b $$7 = (b)$$4;
                    $$1.remove((Object)$$2);
                    $$0.put((Object)$$2, (Object)$$7);
                }
            }
        }
    }

    static final class b
    extends Record
    implements d {
        final String a;

        b(String $$0) {
            this.a = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "target", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "target", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "target", "a"}, this, $$0);
        }

        public String a() {
            return this.a;
        }
    }

    record e(ins a) implements d
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "material", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "material", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "material", "a"}, this, $$0);
        }
    }

    public static sealed interface d
    permits e, b {
    }
}

