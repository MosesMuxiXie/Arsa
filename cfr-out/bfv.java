/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.Strictness
 *  com.google.gson.internal.Streams
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class bfv {
    private static final Gson a = new GsonBuilder().create();

    public static boolean a(JsonObject $$0, String $$1) {
        if (!bfv.f($$0, $$1)) {
            return false;
        }
        return $$0.getAsJsonPrimitive($$1).isString();
    }

    public static boolean a(JsonElement $$0) {
        if (!$$0.isJsonPrimitive()) {
            return false;
        }
        return $$0.getAsJsonPrimitive().isString();
    }

    public static boolean b(JsonObject $$0, String $$1) {
        if (!bfv.f($$0, $$1)) {
            return false;
        }
        return $$0.getAsJsonPrimitive($$1).isNumber();
    }

    public static boolean b(JsonElement $$0) {
        if (!$$0.isJsonPrimitive()) {
            return false;
        }
        return $$0.getAsJsonPrimitive().isNumber();
    }

    public static boolean c(JsonObject $$0, String $$1) {
        if (!bfv.f($$0, $$1)) {
            return false;
        }
        return $$0.getAsJsonPrimitive($$1).isBoolean();
    }

    public static boolean c(JsonElement $$0) {
        if (!$$0.isJsonPrimitive()) {
            return false;
        }
        return $$0.getAsJsonPrimitive().isBoolean();
    }

    public static boolean d(JsonObject $$0, String $$1) {
        if (!bfv.g($$0, $$1)) {
            return false;
        }
        return $$0.get($$1).isJsonArray();
    }

    public static boolean e(JsonObject $$0, String $$1) {
        if (!bfv.g($$0, $$1)) {
            return false;
        }
        return $$0.get($$1).isJsonObject();
    }

    public static boolean f(JsonObject $$0, String $$1) {
        if (!bfv.g($$0, $$1)) {
            return false;
        }
        return $$0.get($$1).isJsonPrimitive();
    }

    public static boolean g(@Nullable JsonObject $$0, String $$1) {
        if ($$0 == null) {
            return false;
        }
        return $$0.get($$1) != null;
    }

    public static JsonElement h(JsonObject $$0, String $$1) {
        JsonElement $$2 = $$0.get($$1);
        if ($$2 == null || $$2.isJsonNull()) {
            throw new JsonSyntaxException("Missing field " + $$1);
        }
        return $$2;
    }

    public static String a(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive()) {
            return $$0.getAsString();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a string, was " + bfv.d($$0));
    }

    public static String i(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.a($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a string");
    }

    @Contract(value="_,_,!null->!null;_,_,null->_")
    public static @Nullable String a(JsonObject $$0, String $$1, @Nullable String $$2) {
        if ($$0.has($$1)) {
            return bfv.a($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static jd<dlp> b(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive()) {
            String $$2 = $$0.getAsString();
            return mi.h.c(amo.a($$2)).orElseThrow(() -> new JsonSyntaxException("Expected " + $$1 + " to be an item, was unknown string '" + $$2 + "'"));
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be an item, was " + bfv.d($$0));
    }

    public static jd<dlp> j(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.b($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find an item");
    }

    @Contract(value="_,_,!null->!null;_,_,null->_")
    public static @Nullable jd<dlp> a(JsonObject $$0, String $$1, @Nullable jd<dlp> $$2) {
        if ($$0.has($$1)) {
            return bfv.b($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static boolean c(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive()) {
            return $$0.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Boolean, was " + bfv.d($$0));
    }

    public static boolean k(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.c($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Boolean");
    }

    public static boolean a(JsonObject $$0, String $$1, boolean $$2) {
        if ($$0.has($$1)) {
            return bfv.c($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static double d(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsDouble();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Double, was " + bfv.d($$0));
    }

    public static double l(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.d($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Double");
    }

    public static double a(JsonObject $$0, String $$1, double $$2) {
        if ($$0.has($$1)) {
            return bfv.d($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static float e(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Float, was " + bfv.d($$0));
    }

    public static float m(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.e($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Float");
    }

    public static float a(JsonObject $$0, String $$1, float $$2) {
        if ($$0.has($$1)) {
            return bfv.e($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static long f(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsLong();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Long, was " + bfv.d($$0));
    }

    public static long n(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.f($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Long");
    }

    public static long a(JsonObject $$0, String $$1, long $$2) {
        if ($$0.has($$1)) {
            return bfv.f($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static int g(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Int, was " + bfv.d($$0));
    }

    public static int o(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.g($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Int");
    }

    public static int a(JsonObject $$0, String $$1, int $$2) {
        if ($$0.has($$1)) {
            return bfv.g($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static byte h(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsByte();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Byte, was " + bfv.d($$0));
    }

    public static byte p(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.h($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Byte");
    }

    public static byte a(JsonObject $$0, String $$1, byte $$2) {
        if ($$0.has($$1)) {
            return bfv.h($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static char i(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsCharacter();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Character, was " + bfv.d($$0));
    }

    public static char q(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.i($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Character");
    }

    public static char a(JsonObject $$0, String $$1, char $$2) {
        if ($$0.has($$1)) {
            return bfv.i($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static BigDecimal j(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsBigDecimal();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a BigDecimal, was " + bfv.d($$0));
    }

    public static BigDecimal r(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.j($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a BigDecimal");
    }

    public static BigDecimal a(JsonObject $$0, String $$1, BigDecimal $$2) {
        if ($$0.has($$1)) {
            return bfv.j($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static BigInteger k(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsBigInteger();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a BigInteger, was " + bfv.d($$0));
    }

    public static BigInteger s(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.k($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a BigInteger");
    }

    public static BigInteger a(JsonObject $$0, String $$1, BigInteger $$2) {
        if ($$0.has($$1)) {
            return bfv.k($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static short l(JsonElement $$0, String $$1) {
        if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
            return $$0.getAsShort();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a Short, was " + bfv.d($$0));
    }

    public static short t(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.l($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Short");
    }

    public static short a(JsonObject $$0, String $$1, short $$2) {
        if ($$0.has($$1)) {
            return bfv.l($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static JsonObject m(JsonElement $$0, String $$1) {
        if ($$0.isJsonObject()) {
            return $$0.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a JsonObject, was " + bfv.d($$0));
    }

    public static JsonObject u(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.m($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a JsonObject");
    }

    @Contract(value="_,_,!null->!null;_,_,null->_")
    public static @Nullable JsonObject a(JsonObject $$0, String $$1, @Nullable JsonObject $$2) {
        if ($$0.has($$1)) {
            return bfv.m($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static JsonArray n(JsonElement $$0, String $$1) {
        if ($$0.isJsonArray()) {
            return $$0.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + $$1 + " to be a JsonArray, was " + bfv.d($$0));
    }

    public static JsonArray v(JsonObject $$0, String $$1) {
        if ($$0.has($$1)) {
            return bfv.n($$0.get($$1), $$1);
        }
        throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a JsonArray");
    }

    @Contract(value="_,_,!null->!null;_,_,null->_")
    public static @Nullable JsonArray a(JsonObject $$0, String $$1, @Nullable JsonArray $$2) {
        if ($$0.has($$1)) {
            return bfv.n($$0.get($$1), $$1);
        }
        return $$2;
    }

    public static <T> T a(@Nullable JsonElement $$0, String $$1, JsonDeserializationContext $$2, Class<? extends T> $$3) {
        if ($$0 != null) {
            return (T)$$2.deserialize($$0, $$3);
        }
        throw new JsonSyntaxException("Missing " + $$1);
    }

    public static <T> T a(JsonObject $$0, String $$1, JsonDeserializationContext $$2, Class<? extends T> $$3) {
        if ($$0.has($$1)) {
            return bfv.a($$0.get($$1), $$1, $$2, $$3);
        }
        throw new JsonSyntaxException("Missing " + $$1);
    }

    @Contract(value="_,_,!null,_,_->!null;_,_,null,_,_->_")
    public static <T> @Nullable T a(JsonObject $$0, String $$1, @Nullable T $$2, JsonDeserializationContext $$3, Class<? extends T> $$4) {
        if ($$0.has($$1)) {
            return bfv.a($$0.get($$1), $$1, $$3, $$4);
        }
        return $$2;
    }

    public static String d(@Nullable JsonElement $$0) {
        String $$1 = StringUtils.abbreviateMiddle((String)String.valueOf($$0), (String)"...", (int)10);
        if ($$0 == null) {
            return "null (missing)";
        }
        if ($$0.isJsonNull()) {
            return "null (json)";
        }
        if ($$0.isJsonArray()) {
            return "an array (" + $$1 + ")";
        }
        if ($$0.isJsonObject()) {
            return "an object (" + $$1 + ")";
        }
        if ($$0.isJsonPrimitive()) {
            JsonPrimitive $$2 = $$0.getAsJsonPrimitive();
            if ($$2.isNumber()) {
                return "a number (" + $$1 + ")";
            }
            if ($$2.isBoolean()) {
                return "a boolean (" + $$1 + ")";
            }
        }
        return $$1;
    }

    public static <T> T a(Gson $$0, Reader $$1, Class<T> $$2) {
        try {
            JsonReader $$3 = new JsonReader($$1);
            $$3.setStrictness(Strictness.STRICT);
            Object $$4 = $$0.getAdapter($$2).read($$3);
            if ($$4 == null) {
                throw new JsonParseException("JSON data was null or empty");
            }
            return (T)$$4;
        }
        catch (IOException $$5) {
            throw new JsonParseException((Throwable)$$5);
        }
    }

    public static <T> @Nullable T a(Gson $$0, Reader $$1, TypeToken<T> $$2) {
        try {
            JsonReader $$3 = new JsonReader($$1);
            $$3.setStrictness(Strictness.STRICT);
            return (T)$$0.getAdapter($$2).read($$3);
        }
        catch (IOException $$4) {
            throw new JsonParseException((Throwable)$$4);
        }
    }

    public static <T> T b(Gson $$0, Reader $$1, TypeToken<T> $$2) {
        T $$3 = bfv.a($$0, $$1, $$2);
        if ($$3 == null) {
            throw new JsonParseException("JSON data was null or empty");
        }
        return $$3;
    }

    public static <T> @Nullable T a(Gson $$0, String $$1, TypeToken<T> $$2) {
        return bfv.a($$0, (Reader)new StringReader($$1), $$2);
    }

    public static <T> T a(Gson $$0, String $$1, Class<T> $$2) {
        return bfv.a($$0, (Reader)new StringReader($$1), $$2);
    }

    public static JsonObject a(String $$0) {
        return bfv.a(new StringReader($$0));
    }

    public static JsonObject a(Reader $$0) {
        return bfv.a(a, $$0, JsonObject.class);
    }

    public static JsonArray b(String $$0) {
        return bfv.b(new StringReader($$0));
    }

    public static JsonArray b(Reader $$0) {
        return bfv.a(a, $$0, JsonArray.class);
    }

    public static String e(JsonElement $$0) {
        StringWriter $$1 = new StringWriter();
        JsonWriter $$2 = new JsonWriter((Writer)$$1);
        try {
            bfv.a($$2, $$0, Comparator.naturalOrder());
        }
        catch (IOException $$3) {
            throw new AssertionError((Object)$$3);
        }
        return $$1.toString();
    }

    public static void a(JsonWriter $$0, @Nullable JsonElement $$1, @Nullable Comparator<String> $$2) throws IOException {
        if ($$1 == null || $$1.isJsonNull()) {
            $$0.nullValue();
        } else if ($$1.isJsonPrimitive()) {
            JsonPrimitive $$3 = $$1.getAsJsonPrimitive();
            if ($$3.isNumber()) {
                $$0.value($$3.getAsNumber());
            } else if ($$3.isBoolean()) {
                $$0.value($$3.getAsBoolean());
            } else {
                $$0.value($$3.getAsString());
            }
        } else if ($$1.isJsonArray()) {
            $$0.beginArray();
            for (JsonElement $$4 : $$1.getAsJsonArray()) {
                bfv.a($$0, $$4, $$2);
            }
            $$0.endArray();
        } else if ($$1.isJsonObject()) {
            $$0.beginObject();
            for (Map.Entry<String, JsonElement> $$5 : bfv.a($$1.getAsJsonObject().entrySet(), $$2)) {
                $$0.name($$5.getKey());
                bfv.a($$0, $$5.getValue(), $$2);
            }
            $$0.endObject();
        } else {
            throw new IllegalArgumentException("Couldn't write " + String.valueOf($$1.getClass()));
        }
    }

    private static Collection<Map.Entry<String, JsonElement>> a(Collection<Map.Entry<String, JsonElement>> $$0, @Nullable Comparator<String> $$1) {
        if ($$1 == null) {
            return $$0;
        }
        ArrayList<Map.Entry<String, JsonElement>> $$2 = new ArrayList<Map.Entry<String, JsonElement>>($$0);
        $$2.sort(Map.Entry.comparingByKey($$1));
        return $$2;
    }

    public static boolean a(JsonElement $$0, int $$1) {
        try {
            Streams.write((JsonElement)$$0, (JsonWriter)new JsonWriter(Streams.writerForAppendable((Appendable)new a($$1))));
        }
        catch (IllegalStateException $$2) {
            return true;
        }
        catch (IOException $$3) {
            throw new UncheckedIOException($$3);
        }
        return false;
    }

    static class a
    implements Appendable {
        private int a;
        private final int b;

        public a(int $$0) {
            this.b = $$0;
        }

        private Appendable a(int $$0) {
            this.a += $$0;
            if (this.a > this.b) {
                throw new IllegalStateException("Character count over limit: " + this.a + " > " + this.b);
            }
            return this;
        }

        @Override
        public Appendable append(CharSequence $$0) {
            return this.a($$0.length());
        }

        @Override
        public Appendable append(CharSequence $$0, int $$1, int $$2) {
            return this.a($$2 - $$1);
        }

        @Override
        public Appendable append(char $$0) {
            return this.a(1);
        }
    }
}

