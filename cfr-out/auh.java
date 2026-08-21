/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class auh<T>
extends Record {
    private final Optional<URI> y;
    private final List<String> z;
    private final Optional<auh<?>> A;
    private final Map<String, auh<?>> B;
    private final List<String> C;
    private final Codec<T> D;
    public static final Codec<? extends auh<?>> a = Codec.recursive((String)"Schema", $$0 -> RecordCodecBuilder.create($$12 -> $$12.group((App)auf.a.optionalFieldOf("$ref").forGetter(auh::e), (App)bfm.a(Codec.STRING).optionalFieldOf("type", List.of()).forGetter(auh::f), (App)$$0.optionalFieldOf("items").forGetter(auh::g), (App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)$$0).optionalFieldOf("properties", Map.of()).forGetter(auh::h), (App)Codec.STRING.listOf().optionalFieldOf("enum", List.of()).forGetter(auh::i)).apply((Applicative)$$12, ($$0, $$1, $$2, $$3, $$4) -> null))).validate($$0 -> {
        if ($$0 == null) {
            return DataResult.error(() -> "Should not deserialize schema");
        }
        return DataResult.success((Object)$$0);
    });
    private static final List<aui<?>> E = new ArrayList();
    public static final auh<Boolean> b = auh.a("boolean", Codec.BOOL);
    public static final auh<Integer> c = auh.a("integer", Codec.INT);
    public static final auh<Either<Boolean, Integer>> d = auh.a(List.of("boolean", "integer"), Codec.either((Codec)Codec.BOOL, (Codec)Codec.INT));
    public static final auh<Float> e = auh.a("number", Codec.FLOAT);
    public static final auh<String> f = auh.a("string", Codec.STRING);
    public static final auh<UUID> g = auh.a("string", jx.a);
    public static final auh<avi.c> h = auh.a("string", avi.c.a.codec());
    public static final aui<ccz> i = auh.b("difficulty", auh.a(ccz::values, ccz.e));
    public static final aui<dwl> j = auh.b("game_type", auh.a(dwl::values, dwl.f));
    public static final auh<bbl> k = auh.a("integer", bbl.g);
    public static final aui<aue> l = auh.b("player", auh.a(aue.a.codec()).a("id", g).a("name", f));
    public static final aui<avi.b> m = auh.b("version", auh.a(avi.b.a.codec()).a("name", f).a("protocol", c));
    public static final aui<avu.a> n = auh.b("server_state", auh.a(avu.a.a).a("started", b).a("players", l.a().d()).a("version", m.a()));
    public static final auh<ety> o = auh.a(ety::values);
    public static final aui<avk.a<?>> p = auh.b("typed_game_rule", auh.a(avk.a.a).a("key", f).a("value", d).a("type", o));
    public static final aui<avk.a<?>> q = auh.b("untyped_game_rule", auh.a(avk.a.b).a("key", f).a("value", d));
    public static final aui<avo> r = auh.b("message", auh.a(avo.a).a("literal", f).a("translatable", f).a("translatableParams", f.d()));
    public static final aui<avu.b> s = auh.b("system_message", auh.a(avu.b.a).a("message", r.a()).a("overlay", b).a("receivingPlayers", l.a().d()));
    public static final aui<avr.a> t = auh.b("kick_player", auh.a(avr.a.a.codec()).a("message", r.a()).a("player", l.a()));
    public static final aui<avq.b> u = auh.b("operator", auh.a(avq.b.a.codec()).a("player", l.a()).a("bypassesPlayerLimit", b).a("permissionLevel", c));
    public static final aui<avn.a> v = auh.b("incoming_ip_ban", auh.a(avn.a.a.codec()).a("player", l.a()).a("ip", f).a("reason", f).a("source", f).a("expires", f));
    public static final aui<avn.c> w = auh.b("ip_ban", auh.a(avn.c.a.codec()).a("ip", f).a("reason", f).a("source", f).a("expires", f));
    public static final aui<avg.b> x = auh.b("user_ban", auh.a(avg.b.a.codec()).a("player", l.a()).a("reason", f).a("source", f).a("expires", f));

    public auh(Optional<URI> $$0, List<String> $$1, Optional<auh<?>> $$2, Map<String, auh<?>> $$3, List<String> $$4, Codec<T> $$5) {
        this.y = $$0;
        this.z = $$1;
        this.A = $$2;
        this.B = $$3;
        this.C = $$4;
        this.D = $$5;
    }

    public static <T> Codec<auh<T>> a() {
        return a;
    }

    public auh<T> b() {
        return new auh<T>(this.y, this.z, this.A.map(auh::b), this.B.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, $$0 -> ((auh)$$0.getValue()).b())), this.C, this.D);
    }

    private static <T> aui<T> b(String $$0, auh<T> $$1) {
        aui<T> $$2 = new aui<T>($$0, auf.a($$0), $$1);
        E.add($$2);
        return $$2;
    }

    public static List<aui<?>> c() {
        return E;
    }

    public static <T> auh<T> a(URI $$0, Codec<T> $$1) {
        return new auh<T>(Optional.of($$0), List.of(), Optional.empty(), Map.of(), List.of(), $$1);
    }

    public static <T> auh<T> a(String $$0, Codec<T> $$1) {
        return auh.a(List.of($$0), $$1);
    }

    public static <T> auh<T> a(List<String> $$0, Codec<T> $$1) {
        return new auh<T>(Optional.empty(), $$0, Optional.empty(), Map.of(), List.of(), $$1);
    }

    public static <E extends Enum<E>> auh<E> a(Supplier<E[]> $$0) {
        return auh.a($$0, bhh.a($$0));
    }

    public static <E extends Enum<E>> auh<E> a(Supplier<E[]> $$02, Codec<E> $$1) {
        List<String> $$2 = Stream.of((Enum[])$$02.get()).map($$0 -> ((bhh)$$0).c()).toList();
        return auh.b($$2, $$1);
    }

    public static <T> auh<T> b(List<String> $$0, Codec<T> $$1) {
        return new auh<T>(Optional.empty(), List.of("string"), Optional.empty(), Map.of(), $$0, $$1);
    }

    public static <T> auh<List<T>> a(auh<?> $$0, Codec<T> $$1) {
        return new auh<List<T>>(Optional.empty(), List.of("array"), Optional.of($$0), Map.of(), List.of(), $$1.listOf());
    }

    public static <T> auh<T> a(Codec<T> $$0) {
        return new auh<T>(Optional.empty(), List.of("object"), Optional.empty(), Map.of(), List.of(), $$0);
    }

    private static <T> auh<T> a(Map<String, auh<?>> $$0, Codec<T> $$1) {
        return new auh<T>(Optional.empty(), List.of("object"), Optional.empty(), $$0, List.of(), $$1);
    }

    public auh<T> a(String $$0, auh<?> $$1) {
        HashMap $$2 = new HashMap(this.B);
        $$2.put($$0, $$1);
        return auh.a($$2, this.D);
    }

    public auh<List<T>> d() {
        return auh.a(this, this.D);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{auh.class, "reference;type;items;properties;enumValues;codec", "y", "z", "A", "B", "C", "D"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{auh.class, "reference;type;items;properties;enumValues;codec", "y", "z", "A", "B", "C", "D"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{auh.class, "reference;type;items;properties;enumValues;codec", "y", "z", "A", "B", "C", "D"}, this, $$0);
    }

    public Optional<URI> e() {
        return this.y;
    }

    public List<String> f() {
        return this.z;
    }

    public Optional<auh<?>> g() {
        return this.A;
    }

    public Map<String, auh<?>> h() {
        return this.B;
    }

    public List<String> i() {
        return this.C;
    }

    public Codec<T> j() {
        return this.D;
    }
}

