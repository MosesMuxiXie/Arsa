/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class vu {
    static final byf<CommandSyntaxException> e = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_string_uuid")));
    static final byf<CommandSyntaxException> f = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_number_or_boolean")));
    public static final String a = "true";
    public static final String b = "false";
    public static final Map<a, b> c = Map.of(new a("bool", 1), new b(){

        @Override
        public <T> T a(DynamicOps<T> $$0, List<T> $$1, byk<StringReader> $$2) {
            Boolean $$3 = 1.a($$0, $$1.getFirst());
            if ($$3 == null) {
                $$2.b().a($$2.g(), f);
                return null;
            }
            return (T)$$0.createBoolean($$3.booleanValue());
        }

        private static <T> @Nullable Boolean a(DynamicOps<T> $$0, T $$1) {
            Optional $$2 = $$0.getBooleanValue($$1).result();
            if ($$2.isPresent()) {
                return (Boolean)$$2.get();
            }
            Optional $$3 = $$0.getNumberValue($$1).result();
            if ($$3.isPresent()) {
                return ((Number)$$3.get()).doubleValue() != 0.0;
            }
            return null;
        }
    }, new a("uuid", 1), new b(){

        /*
         * WARNING - void declaration
         */
        @Override
        public <T> T a(DynamicOps<T> $$0, List<T> $$1, byk<StringReader> $$2) {
            void $$6;
            Optional $$3 = $$0.getStringValue($$1.getFirst()).result();
            if ($$3.isEmpty()) {
                $$2.b().a($$2.g(), e);
                return null;
            }
            try {
                UUID $$4 = UUID.fromString((String)$$3.get());
            }
            catch (IllegalArgumentException $$5) {
                $$2.b().a($$2.g(), e);
                return null;
            }
            return (T)$$0.createIntList(IntStream.of(jx.a((UUID)$$6)));
        }
    });
    public static final byn<StringReader> d = new byn<StringReader>(){
        private final Set<String> a = Stream.concat(Stream.of("false", "true"), c.keySet().stream().map(a::a)).collect(Collectors.toSet());

        @Override
        public Stream<String> possibleValues(byk<StringReader> $$0) {
            return this.a.stream();
        }
    };

    public record a(String a, int b) {
        @Override
        public String toString() {
            return this.a + "/" + this.b;
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;argCount", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;argCount", "a", "b"}, this, $$0);
        }
    }

    public static interface b {
        public <T> @Nullable T a(DynamicOps<T> var1, List<T> var2, byk<StringReader> var3);
    }
}

