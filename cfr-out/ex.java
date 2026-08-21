/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ex
implements ArgumentType<g> {
    private static final Collection<String> d = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("arguments.nbtpath.node.invalid"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("arguments.nbtpath.too_deep"));
    public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("arguments.nbtpath.nothing_found", $$0));
    static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("commands.data.modify.expected_list", $$0));
    static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("commands.data.modify.invalid_index", $$0));
    private static final char g = '[';
    private static final char h = ']';
    private static final char i = '{';
    private static final char j = '}';
    private static final char k = '\"';
    private static final char l = '\'';

    public static ex a() {
        return new ex();
    }

    public static g a(CommandContext<ed> $$0, String $$1) {
        return (g)$$0.getArgument($$1, g.class);
    }

    public g a(StringReader $$0) throws CommandSyntaxException {
        ArrayList $$1 = Lists.newArrayList();
        int $$2 = $$0.getCursor();
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        boolean $$4 = true;
        while ($$0.canRead() && $$0.peek() != ' ') {
            char $$6;
            h $$5 = ex.a($$0, $$4);
            $$1.add($$5);
            $$3.put((Object)$$5, $$0.getCursor() - $$2);
            $$4 = false;
            if (!$$0.canRead() || ($$6 = $$0.peek()) == ' ' || $$6 == '[' || $$6 == '{') continue;
            $$0.expect('.');
        }
        return new g($$0.getString().substring($$2, $$0.getCursor()), $$1.toArray(new h[0]), (Object2IntMap<h>)$$3);
    }

    private static h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
        return switch ($$0.peek()) {
            case '{' -> {
                if (!$$1) {
                    throw a.createWithContext((ImmutableStringReader)$$0);
                }
                uz $$2 = wa.c($$0);
                yield new f($$2);
            }
            case '[' -> {
                $$0.skip();
                char $$3 = $$0.peek();
                if ($$3 == '{') {
                    uz $$4 = wa.c($$0);
                    $$0.expect(']');
                    yield new d($$4);
                }
                if ($$3 == ']') {
                    $$0.skip();
                    yield ex$a.a;
                }
                int $$5 = $$0.readInt();
                $$0.expect(']');
                yield new c($$5);
            }
            case '\"', '\'' -> ex.a($$0, $$0.readString());
            default -> ex.a($$0, ex.b($$0));
        };
    }

    private static h a(StringReader $$0, String $$1) throws CommandSyntaxException {
        if ($$1.isEmpty()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        if ($$0.canRead() && $$0.peek() == '{') {
            uz $$2 = wa.c($$0);
            return new e($$1, $$2);
        }
        return new b($$1);
    }

    private static String b(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && ex.a($$0.peek())) {
            $$0.skip();
        }
        if ($$0.getCursor() == $$1) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        return $$0.getString().substring($$1, $$0.getCursor());
    }

    public Collection<String> getExamples() {
        return d;
    }

    private static boolean a(char $$0) {
        return $$0 != ' ' && $$0 != '\"' && $$0 != '\'' && $$0 != '[' && $$0 != ']' && $$0 != '.' && $$0 != '{' && $$0 != '}';
    }

    static Predicate<vz> a(uz $$0) {
        return $$1 -> vo.a((vz)$$0, $$1, true);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class g {
        private final String b;
        private final Object2IntMap<h> c;
        private final h[] d;
        public static final Codec<g> a = Codec.STRING.comapFlatMap($$0 -> {
            try {
                g $$1 = new ex().a(new StringReader($$0));
                return DataResult.success((Object)$$1);
            }
            catch (CommandSyntaxException $$2) {
                return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + $$2.getMessage());
            }
        }, g::a);

        public static g a(String $$0) throws CommandSyntaxException {
            return new ex().a(new StringReader($$0));
        }

        public g(String $$0, h[] $$1, Object2IntMap<h> $$2) {
            this.b = $$0;
            this.d = $$1;
            this.c = $$2;
        }

        public List<vz> a(vz $$0) throws CommandSyntaxException {
            List<vz> $$1 = Collections.singletonList($$0);
            for (h $$2 : this.d) {
                if (!($$1 = $$2.a($$1)).isEmpty()) continue;
                throw this.a($$2);
            }
            return $$1;
        }

        public int b(vz $$0) {
            List<vz> $$1 = Collections.singletonList($$0);
            for (h $$2 : this.d) {
                if (!($$1 = $$2.a($$1)).isEmpty()) continue;
                return 0;
            }
            return $$1.size();
        }

        private List<vz> d(vz $$0) throws CommandSyntaxException {
            List<vz> $$1 = Collections.singletonList($$0);
            for (int $$2 = 0; $$2 < this.d.length - 1; ++$$2) {
                h $$3 = this.d[$$2];
                int $$4 = $$2 + 1;
                if (!($$1 = $$3.a($$1, this.d[$$4]::a)).isEmpty()) continue;
                throw this.a($$3);
            }
            return $$1;
        }

        public List<vz> a(vz $$0, Supplier<vz> $$1) throws CommandSyntaxException {
            List<vz> $$2 = this.d($$0);
            h $$3 = this.d[this.d.length - 1];
            return $$3.a($$2, $$1);
        }

        private static int a(List<vz> $$02, Function<vz, Integer> $$12) {
            return $$02.stream().map($$12).reduce(0, ($$0, $$1) -> $$0 + $$1);
        }

        public static boolean a(vz $$0, int $$1) {
            block4: {
                block3: {
                    if ($$1 >= 512) {
                        return true;
                    }
                    if (!($$0 instanceof uz)) break block3;
                    uz $$2 = (uz)$$0;
                    for (vz $$3 : $$2.h()) {
                        if (!ex$g.a($$3, $$1 + 1)) continue;
                        return true;
                    }
                    break block4;
                }
                if (!($$0 instanceof vf)) break block4;
                vf $$4 = (vf)$$0;
                for (vz $$5 : $$4) {
                    if (!ex$g.a($$5, $$1 + 1)) continue;
                    return true;
                }
            }
            return false;
        }

        public int a(vz $$0, vz $$1) throws CommandSyntaxException {
            if (ex$g.a($$1, this.b())) {
                throw b.create();
            }
            vz $$2 = $$1.d();
            List<vz> $$32 = this.d($$0);
            if ($$32.isEmpty()) {
                return 0;
            }
            h $$4 = this.d[this.d.length - 1];
            MutableBoolean $$5 = new MutableBoolean(false);
            return ex$g.a($$32, (vz $$3) -> $$4.a((vz)$$3, () -> {
                if ($$5.isFalse()) {
                    $$5.setTrue();
                    return $$2;
                }
                return $$2.d();
            }));
        }

        private int b() {
            return this.d.length;
        }

        /*
         * WARNING - void declaration
         */
        public int a(int $$0, uz $$1, List<vz> $$2) throws CommandSyntaxException {
            ArrayList<vz> $$3 = new ArrayList<vz>($$2.size());
            for (vz $$4 : $$2) {
                vz $$5 = $$4.d();
                $$3.add($$5);
                if (!ex$g.a($$5, this.b())) continue;
                throw b.create();
            }
            List<vz> $$6 = this.a((vz)$$1, vf::new);
            int $$7 = 0;
            boolean $$8 = false;
            for (vz $$9 : $$6) {
                void $$11;
                if (!($$9 instanceof uy)) {
                    throw e.create((Object)$$9);
                }
                uy $$10 = (uy)$$9;
                boolean $$12 = false;
                int $$13 = $$0 < 0 ? $$11.size() + $$0 + 1 : $$0;
                for (vz $$14 : $$3) {
                    try {
                        if (!$$11.b($$13, $$8 ? $$14.d() : $$14)) continue;
                        ++$$13;
                        $$12 = true;
                    }
                    catch (IndexOutOfBoundsException $$15) {
                        throw f.create((Object)$$13);
                    }
                }
                $$8 = true;
                $$7 += $$12 ? 1 : 0;
            }
            return $$7;
        }

        public int c(vz $$0) {
            List<vz> $$1 = Collections.singletonList($$0);
            for (int $$2 = 0; $$2 < this.d.length - 1; ++$$2) {
                $$1 = this.d[$$2].a($$1);
            }
            h $$3 = this.d[this.d.length - 1];
            return ex$g.a($$1, $$3::a);
        }

        private CommandSyntaxException a(h $$0) {
            int $$1 = this.c.getInt((Object)$$0);
            return c.create((Object)this.b.substring(0, $$1));
        }

        public String toString() {
            return this.b;
        }

        public String a() {
            return this.b;
        }
    }

    static interface h {
        public void a(vz var1, List<vz> var2);

        public void a(vz var1, Supplier<vz> var2, List<vz> var3);

        public vz a();

        public int a(vz var1, Supplier<vz> var2);

        public int a(vz var1);

        default public List<vz> a(List<vz> $$0) {
            return this.a($$0, this::a);
        }

        default public List<vz> a(List<vz> $$0, Supplier<vz> $$12) {
            return this.a($$0, (vz $$1, List<vz> $$2) -> this.a((vz)$$1, $$12, (List<vz>)$$2));
        }

        default public List<vz> a(List<vz> $$0, BiConsumer<vz, List<vz>> $$1) {
            ArrayList $$2 = Lists.newArrayList();
            for (vz $$3 : $$0) {
                $$1.accept($$3, $$2);
            }
            return $$2;
        }
    }

    static class f
    implements h {
        private final Predicate<vz> a;

        public f(uz $$0) {
            this.a = ex.a($$0);
        }

        @Override
        public void a(vz $$0, List<vz> $$1) {
            if ($$0 instanceof uz && this.a.test($$0)) {
                $$1.add($$0);
            }
        }

        @Override
        public void a(vz $$0, Supplier<vz> $$1, List<vz> $$2) {
            this.a($$0, $$2);
        }

        @Override
        public vz a() {
            return new uz();
        }

        @Override
        public int a(vz $$0, Supplier<vz> $$1) {
            return 0;
        }

        @Override
        public int a(vz $$0) {
            return 0;
        }
    }

    static class d
    implements h {
        private final uz a;
        private final Predicate<vz> b;

        public d(uz $$0) {
            this.a = $$0;
            this.b = ex.a($$0);
        }

        @Override
        public void a(vz $$0, List<vz> $$1) {
            if ($$0 instanceof vf) {
                vf $$2 = (vf)$$0;
                $$2.stream().filter(this.b).forEach($$1::add);
            }
        }

        @Override
        public void a(vz $$0, Supplier<vz> $$1, List<vz> $$22) {
            MutableBoolean $$3 = new MutableBoolean();
            if ($$0 instanceof vf) {
                vf $$4 = (vf)$$0;
                $$4.stream().filter(this.b).forEach($$2 -> {
                    $$22.add((vz)$$2);
                    $$3.setTrue();
                });
                if ($$3.isFalse()) {
                    uz $$5 = this.a.l();
                    $$4.add($$5);
                    $$22.add($$5);
                }
            }
        }

        @Override
        public vz a() {
            return new vf();
        }

        @Override
        public int a(vz $$0, Supplier<vz> $$1) {
            int $$2 = 0;
            if ($$0 instanceof vf) {
                vf $$3 = (vf)$$0;
                int $$4 = $$3.size();
                if ($$4 == 0) {
                    $$3.add($$1.get());
                    ++$$2;
                } else {
                    for (int $$5 = 0; $$5 < $$4; ++$$5) {
                        vz $$7;
                        vz $$6 = $$3.c($$5);
                        if (!this.b.test($$6) || ($$7 = $$1.get()).equals($$6) || !$$3.a($$5, $$7)) continue;
                        ++$$2;
                    }
                }
            }
            return $$2;
        }

        @Override
        public int a(vz $$0) {
            int $$1 = 0;
            if ($$0 instanceof vf) {
                vf $$2 = (vf)$$0;
                for (int $$3 = $$2.size() - 1; $$3 >= 0; --$$3) {
                    if (!this.b.test($$2.c($$3))) continue;
                    $$2.d($$3);
                    ++$$1;
                }
            }
            return $$1;
        }
    }

    static class a
    implements h {
        public static final a a = new a();

        private a() {
        }

        @Override
        public void a(vz $$0, List<vz> $$1) {
            if ($$0 instanceof uy) {
                uy $$2 = (uy)$$0;
                Iterables.addAll($$1, (Iterable)$$2);
            }
        }

        @Override
        public void a(vz $$0, Supplier<vz> $$1, List<vz> $$2) {
            if ($$0 instanceof uy) {
                uy $$3 = (uy)$$0;
                if ($$3.isEmpty()) {
                    vz $$4 = $$1.get();
                    if ($$3.b(0, $$4)) {
                        $$2.add($$4);
                    }
                } else {
                    Iterables.addAll($$2, (Iterable)$$3);
                }
            }
        }

        @Override
        public vz a() {
            return new vf();
        }

        @Override
        public int a(vz $$0, Supplier<vz> $$1) {
            if ($$0 instanceof uy) {
                uy $$2 = (uy)$$0;
                int $$3 = $$2.size();
                if ($$3 == 0) {
                    $$2.b(0, $$1.get());
                    return 1;
                }
                vz $$4 = $$1.get();
                int $$5 = $$3 - (int)$$2.stream().filter((Predicate<vz>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, equals(java.lang.Object ), (Lvz;)Z)((vz)$$4)).count();
                if ($$5 == 0) {
                    return 0;
                }
                $$2.clear();
                if (!$$2.b(0, $$4)) {
                    return 0;
                }
                for (int $$6 = 1; $$6 < $$3; ++$$6) {
                    $$2.b($$6, $$1.get());
                }
                return $$5;
            }
            return 0;
        }

        @Override
        public int a(vz $$0) {
            uy $$1;
            int $$2;
            if ($$0 instanceof uy && ($$2 = ($$1 = (uy)$$0).size()) > 0) {
                $$1.clear();
                return $$2;
            }
            return 0;
        }
    }

    static class c
    implements h {
        private final int a;

        public c(int $$0) {
            this.a = $$0;
        }

        @Override
        public void a(vz $$0, List<vz> $$1) {
            if ($$0 instanceof uy) {
                int $$4;
                uy $$2 = (uy)$$0;
                int $$3 = $$2.size();
                int n2 = $$4 = this.a < 0 ? $$3 + this.a : this.a;
                if (0 <= $$4 && $$4 < $$3) {
                    $$1.add($$2.c($$4));
                }
            }
        }

        @Override
        public void a(vz $$0, Supplier<vz> $$1, List<vz> $$2) {
            this.a($$0, $$2);
        }

        @Override
        public vz a() {
            return new vf();
        }

        @Override
        public int a(vz $$0, Supplier<vz> $$1) {
            if ($$0 instanceof uy) {
                int $$4;
                uy $$2 = (uy)$$0;
                int $$3 = $$2.size();
                int n2 = $$4 = this.a < 0 ? $$3 + this.a : this.a;
                if (0 <= $$4 && $$4 < $$3) {
                    vz $$5 = $$2.c($$4);
                    vz $$6 = $$1.get();
                    if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                        return 1;
                    }
                }
            }
            return 0;
        }

        @Override
        public int a(vz $$0) {
            if ($$0 instanceof uy) {
                int $$3;
                uy $$1 = (uy)$$0;
                int $$2 = $$1.size();
                int n2 = $$3 = this.a < 0 ? $$2 + this.a : this.a;
                if (0 <= $$3 && $$3 < $$2) {
                    $$1.d($$3);
                    return 1;
                }
            }
            return 0;
        }
    }

    static class e
    implements h {
        private final String a;
        private final uz b;
        private final Predicate<vz> c;

        public e(String $$0, uz $$1) {
            this.a = $$0;
            this.b = $$1;
            this.c = ex.a($$1);
        }

        @Override
        public void a(vz $$0, List<vz> $$1) {
            vz $$2;
            if ($$0 instanceof uz && this.c.test($$2 = ((uz)$$0).a(this.a))) {
                $$1.add($$2);
            }
        }

        @Override
        public void a(vz $$0, Supplier<vz> $$1, List<vz> $$2) {
            if ($$0 instanceof uz) {
                uz $$3 = (uz)$$0;
                vz $$4 = $$3.a(this.a);
                if ($$4 == null) {
                    $$4 = this.b.l();
                    $$3.a(this.a, $$4);
                    $$2.add($$4);
                } else if (this.c.test($$4)) {
                    $$2.add($$4);
                }
            }
        }

        @Override
        public vz a() {
            return new uz();
        }

        @Override
        public int a(vz $$0, Supplier<vz> $$1) {
            vz $$4;
            uz $$2;
            vz $$3;
            if ($$0 instanceof uz && this.c.test($$3 = ($$2 = (uz)$$0).a(this.a)) && !($$4 = $$1.get()).equals($$3)) {
                $$2.a(this.a, $$4);
                return 1;
            }
            return 0;
        }

        @Override
        public int a(vz $$0) {
            uz $$1;
            vz $$2;
            if ($$0 instanceof uz && this.c.test($$2 = ($$1 = (uz)$$0).a(this.a))) {
                $$1.r(this.a);
                return 1;
            }
            return 0;
        }
    }

    static class b
    implements h {
        private final String a;

        public b(String $$0) {
            this.a = $$0;
        }

        @Override
        public void a(vz $$0, List<vz> $$1) {
            vz $$2;
            if ($$0 instanceof uz && ($$2 = ((uz)$$0).a(this.a)) != null) {
                $$1.add($$2);
            }
        }

        @Override
        public void a(vz $$0, Supplier<vz> $$1, List<vz> $$2) {
            if ($$0 instanceof uz) {
                vz $$5;
                uz $$3 = (uz)$$0;
                if ($$3.b(this.a)) {
                    vz $$4 = $$3.a(this.a);
                } else {
                    $$5 = $$1.get();
                    $$3.a(this.a, $$5);
                }
                $$2.add($$5);
            }
        }

        @Override
        public vz a() {
            return new uz();
        }

        @Override
        public int a(vz $$0, Supplier<vz> $$1) {
            if ($$0 instanceof uz) {
                vz $$4;
                uz $$2 = (uz)$$0;
                vz $$3 = $$1.get();
                if (!$$3.equals($$4 = $$2.a(this.a, $$3))) {
                    return 1;
                }
            }
            return 0;
        }

        @Override
        public int a(vz $$0) {
            uz $$1;
            if ($$0 instanceof uz && ($$1 = (uz)$$0).b(this.a)) {
                $$1.r(this.a);
                return 1;
            }
            return 0;
        }
    }
}

