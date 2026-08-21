/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.primitives.UnsignedBytes
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.chars.CharList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedBytes;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.chars.CharList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import org.jspecify.annotations.Nullable;

public class vt {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("snbt.parser.number_parse_failure", $$0));
    static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("snbt.parser.expected_hex_escape", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("snbt.parser.invalid_codepoint", $$0));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("snbt.parser.no_such_operation", $$0));
    static final byf<CommandSyntaxException> e = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_integer_type")));
    private static final byf<CommandSyntaxException> f = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_float_type")));
    static final byf<CommandSyntaxException> g = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_non_negative_number")));
    private static final byf<CommandSyntaxException> h = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.invalid_character_name")));
    static final byf<CommandSyntaxException> i = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.invalid_array_element_type")));
    private static final byf<CommandSyntaxException> j = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.invalid_unquoted_start")));
    private static final byf<CommandSyntaxException> k = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_unquoted_string")));
    private static final byf<CommandSyntaxException> l = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.invalid_string_contents")));
    private static final byf<CommandSyntaxException> m = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_binary_numeral")));
    private static final byf<CommandSyntaxException> n = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.underscore_not_allowed")));
    private static final byf<CommandSyntaxException> o = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_decimal_numeral")));
    private static final byf<CommandSyntaxException> p = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.expected_hex_numeral")));
    private static final byf<CommandSyntaxException> q = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.empty_key")));
    private static final byf<CommandSyntaxException> r = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.leading_zero_not_allowed")));
    private static final byf<CommandSyntaxException> s = byf.a(new SimpleCommandExceptionType((Message)yh.c("snbt.parser.infinity_not_allowed")));
    private static final HexFormat t = HexFormat.of().withUpperCase();
    private static final byu u = new byu((byf)m, (byf)n){

        @Override
        protected boolean a(char $$0) {
            return switch ($$0) {
                case '0', '1', '_' -> true;
                default -> false;
            };
        }
    };
    private static final byu v = new byu((byf)o, (byf)n){

        @Override
        protected boolean a(char $$0) {
            return switch ($$0) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
                default -> false;
            };
        }
    };
    private static final byu w = new byu((byf)p, (byf)n){

        @Override
        protected boolean a(char $$0) {
            return switch ($$0) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '_', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
                default -> false;
            };
        }
    };
    private static final bys x = new bys(1, (byf)l){

        @Override
        protected boolean a(char $$0) {
            return switch ($$0) {
                case '\"', '\'', '\\' -> false;
                default -> true;
            };
        }
    };
    private static final byz.a y = new byz.a(CharList.of()){

        @Override
        protected boolean a(char $$0) {
            return vt.c($$0);
        }
    };
    private static final Pattern z = Pattern.compile("[-a-zA-Z0-9 ]+");

    static byf<CommandSyntaxException> a(NumberFormatException $$0) {
        return byf.a(a, $$0.getMessage());
    }

    public static @Nullable String a(char $$0) {
        return switch ($$0) {
            case '\b' -> "b";
            case '\t' -> "t";
            case '\n' -> "n";
            case '\f' -> "f";
            case '\r' -> "r";
            default -> $$0 < ' ' ? "x" + t.toHexDigits((byte)$$0) : null;
        };
    }

    private static boolean b(char $$0) {
        return !vt.c($$0);
    }

    static boolean c(char $$0) {
        return switch ($$0) {
            case '+', '-', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
            default -> false;
        };
    }

    static boolean a(String $$0) {
        return $$0.indexOf(95) != -1;
    }

    private static void a(StringBuilder $$0, String $$1) {
        vt.a($$0, $$1, vt.a($$1));
    }

    static void a(StringBuilder $$0, String $$1, boolean $$2) {
        if ($$2) {
            for (char $$3 : $$1.toCharArray()) {
                if ($$3 == '_') continue;
                $$0.append($$3);
            }
        } else {
            $$0.append($$1);
        }
    }

    static short a(String $$0, int $$1) {
        int $$2 = Integer.parseInt($$0, $$1);
        if ($$2 >> 16 == 0) {
            return (short)$$2;
        }
        throw new NumberFormatException("out of range: " + $$2);
    }

    private static <T> @Nullable T a(DynamicOps<T> $$0, e $$1, @Nullable String $$2, @Nullable String $$3, @Nullable f<String> $$4, @Nullable i $$5, byk<?> $$6) {
        StringBuilder $$7 = new StringBuilder();
        $$1.a($$7);
        if ($$2 != null) {
            vt.a($$7, $$2);
        }
        if ($$3 != null) {
            $$7.append('.');
            vt.a($$7, $$3);
        }
        if ($$4 != null) {
            $$7.append('e');
            $$4.a().a($$7);
            vt.a($$7, (String)$$4.b);
        }
        try {
            String $$8 = $$7.toString();
            i i2 = $$5;
            int n2 = 0;
            return switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"FLOAT", "DOUBLE"}, (i)i2, n2)) {
                case 0 -> vt.a($$0, $$6, $$8);
                case 1 -> vt.b($$0, $$6, $$8);
                case -1 -> vt.b($$0, $$6, $$8);
                default -> {
                    $$6.b().a($$6.g(), f);
                    yield null;
                }
            };
        }
        catch (NumberFormatException $$9) {
            $$6.b().a($$6.g(), vt.a($$9));
            return null;
        }
    }

    private static <T> @Nullable T a(DynamicOps<T> $$0, byk<?> $$1, String $$2) {
        float $$3 = Float.parseFloat($$2);
        if (!Float.isFinite($$3)) {
            $$1.b().a($$1.g(), s);
            return null;
        }
        return (T)$$0.createFloat($$3);
    }

    private static <T> @Nullable T b(DynamicOps<T> $$0, byk<?> $$1, String $$2) {
        double $$3 = Double.parseDouble($$2);
        if (!Double.isFinite($$3)) {
            $$1.b().a($$1.g(), s);
            return null;
        }
        return (T)$$0.createDouble($$3);
    }

    private static String a(List<String> $$0) {
        return switch ($$0.size()) {
            case 0 -> "";
            case 1 -> $$0.getFirst();
            default -> String.join((CharSequence)"", $$0);
        };
    }

    public static <T> byq<T> a(DynamicOps<T> $$0) {
        Object $$12 = $$0.createBoolean(true);
        Object $$22 = $$0.createBoolean(false);
        Object $$32 = $$0.emptyMap();
        Object $$42 = $$0.emptyList();
        byg<StringReader> $$52 = new byg<StringReader>();
        byc $$62 = byc.a("sign");
        $$52.a($$62, byo.b(byo.a(byz.a('+'), byo.a($$62, vt$e.a)), byo.a(byz.a('-'), byo.a($$62, vt$e.b))), $$1 -> (e)((Object)((Object)$$1.b($$62))));
        byc $$7 = byc.a("integer_suffix");
        $$52.a($$7, byo.b(byo.a(byz.a('u', 'U'), byo.b(byo.a(byz.a('b', 'B'), byo.a($$7, new d(vt$g.b, vt$i.c))), byo.a(byz.a('s', 'S'), byo.a($$7, new d(vt$g.b, vt$i.d))), byo.a(byz.a('i', 'I'), byo.a($$7, new d(vt$g.b, vt$i.e))), byo.a(byz.a('l', 'L'), byo.a($$7, new d(vt$g.b, vt$i.f))))), byo.a(byz.a('s', 'S'), byo.b(byo.a(byz.a('b', 'B'), byo.a($$7, new d(vt$g.a, vt$i.c))), byo.a(byz.a('s', 'S'), byo.a($$7, new d(vt$g.a, vt$i.d))), byo.a(byz.a('i', 'I'), byo.a($$7, new d(vt$g.a, vt$i.e))), byo.a(byz.a('l', 'L'), byo.a($$7, new d(vt$g.a, vt$i.f))))), byo.a(byz.a('b', 'B'), byo.a($$7, new d(null, vt$i.c))), byo.a(byz.a('s', 'S'), byo.a($$7, new d(null, vt$i.d))), byo.a(byz.a('i', 'I'), byo.a($$7, new d(null, vt$i.e))), byo.a(byz.a('l', 'L'), byo.a($$7, new d(null, vt$i.f)))), $$1 -> (d)$$1.b($$7));
        byc $$8 = byc.a("binary_numeral");
        $$52.a($$8, u);
        byc $$9 = byc.a("decimal_numeral");
        $$52.a($$9, v);
        byc $$10 = byc.a("hex_numeral");
        $$52.a($$10, w);
        byc $$11 = byc.a("integer_literal");
        byj $$122 = $$52.a($$11, byo.a(byo.a($$52.c($$62)), byo.b(byo.a(byz.a('0'), byo.c(), byo.b(byo.a(byz.a('x', 'X'), byo.c(), $$52.c($$10)), byo.a(byz.a('b', 'B'), $$52.c($$8)), byo.a($$52.c($$9), byo.c(), byo.a(r)), byo.a($$9, "0"))), $$52.c($$9)), byo.a($$52.c($$7))), $$5 -> {
            d $$6 = $$5.b($$7, vt$d.a);
            e $$7 = $$5.b($$62, vt$e.a);
            String $$8 = (String)$$5.a($$9);
            if ($$8 != null) {
                return new c($$7, vt$b.b, $$8, $$6);
            }
            String $$9 = (String)$$5.a($$10);
            if ($$9 != null) {
                return new c($$7, vt$b.c, $$9, $$6);
            }
            String $$10 = (String)$$5.b($$8);
            return new c($$7, vt$b.a, $$10, $$6);
        });
        byc $$13 = byc.a("float_type_suffix");
        $$52.a($$13, byo.b(byo.a(byz.a('f', 'F'), byo.a($$13, vt$i.a)), byo.a(byz.a('d', 'D'), byo.a($$13, vt$i.b))), $$1 -> (i)((Object)((Object)$$1.b($$13))));
        byc $$14 = byc.a("float_exponent_part");
        $$52.a($$14, byo.a(byz.a('e', 'E'), byo.a($$52.c($$62)), $$52.c($$9)), $$2 -> new f<String>($$2.b($$62, vt$e.a), (String)$$2.b($$9)));
        byc $$15 = byc.a("float_whole_part");
        byc $$16 = byc.a("float_fraction_part");
        byc $$17 = byc.a("float_literal");
        $$52.a($$17, byo.a(byo.a($$52.c($$62)), byo.b(byo.a($$52.a($$9, $$15), byz.a('.'), byo.c(), byo.a($$52.a($$9, $$16)), byo.a($$52.c($$14)), byo.a($$52.c($$13))), byo.a(byz.a('.'), byo.c(), $$52.a($$9, $$16), byo.a($$52.c($$14)), byo.a($$52.c($$13))), byo.a($$52.a($$9, $$15), $$52.c($$14), byo.c(), byo.a($$52.c($$13))), byo.a($$52.a($$9, $$15), byo.a($$52.c($$14)), $$52.c($$13)))), $$6 -> {
            bym $$7 = $$6.a();
            e $$8 = $$7.b($$62, vt$e.a);
            String $$9 = (String)$$7.a($$15);
            String $$10 = (String)$$7.a($$16);
            f $$11 = (f)$$7.a($$14);
            i $$12 = (i)((Object)((Object)$$7.a($$13)));
            return vt.a($$0, $$8, $$9, $$10, $$11, $$12, $$6);
        });
        byc $$18 = byc.a("string_hex_2");
        $$52.a($$18, new h(2));
        byc $$19 = byc.a("string_hex_4");
        $$52.a($$19, new h(4));
        byc $$20 = byc.a("string_hex_8");
        $$52.a($$20, new h(8));
        byc $$21 = byc.a("string_unicode_name");
        $$52.a($$21, new byr(z, h));
        byc $$222 = byc.a("string_escape_sequence");
        $$52.a($$222, byo.b(byo.a(byz.a('b'), byo.a($$222, "\b")), byo.a(byz.a('s'), byo.a($$222, " ")), byo.a(byz.a('t'), byo.a($$222, "\t")), byo.a(byz.a('n'), byo.a($$222, "\n")), byo.a(byz.a('f'), byo.a($$222, "\f")), byo.a(byz.a('r'), byo.a($$222, "\r")), byo.a(byz.a('\\'), byo.a($$222, "\\")), byo.a(byz.a('\''), byo.a($$222, "'")), byo.a(byz.a('\"'), byo.a($$222, "\"")), byo.a(byz.a('x'), $$52.c($$18)), byo.a(byz.a('u'), $$52.c($$19)), byo.a(byz.a('U'), $$52.c($$20)), byo.a(byz.a('N'), byz.a('{'), $$52.c($$21), byz.a('}'))), $$5 -> {
            void $$13;
            bym $$6 = $$5.a();
            String $$7 = (String)$$6.b(new byc[]{$$222});
            if ($$7 != null) {
                return $$7;
            }
            String $$8 = (String)$$6.b($$18, $$19, $$20);
            if ($$8 != null) {
                int $$9 = HexFormat.fromHexDigits($$8);
                if (!Character.isValidCodePoint($$9)) {
                    $$5.b().a($$5.g(), byf.a(c, String.format(Locale.ROOT, "U+%08X", $$9)));
                    return null;
                }
                return Character.toString($$9);
            }
            String $$10 = (String)$$6.b($$21);
            try {
                int $$11 = Character.codePointOf($$10);
            }
            catch (IllegalArgumentException $$12) {
                $$5.b().a($$5.g(), h);
                return null;
            }
            return Character.toString((int)$$13);
        });
        byc $$23 = byc.a("string_plain_contents");
        $$52.a($$23, x);
        byc $$24 = byc.a("string_chunks");
        byc $$25 = byc.a("string_contents");
        byc $$26 = byc.a("single_quoted_string_chunk");
        byj $$27 = $$52.a($$26, byo.b($$52.a($$23, $$25), byo.a(byz.a('\\'), $$52.a($$222, $$25)), byo.a(byz.a('\"'), byo.a($$25, "\""))), $$1 -> (String)$$1.b($$25));
        byc $$28 = byc.a("single_quoted_string_contents");
        $$52.a($$28, byo.a($$27, $$24), $$1 -> vt.a((List)$$1.b($$24)));
        byc $$29 = byc.a("double_quoted_string_chunk");
        byj $$30 = $$52.a($$29, byo.b($$52.a($$23, $$25), byo.a(byz.a('\\'), $$52.a($$222, $$25)), byo.a(byz.a('\''), byo.a($$25, "'"))), $$1 -> (String)$$1.b($$25));
        byc $$31 = byc.a("double_quoted_string_contents");
        $$52.a($$31, byo.a($$30, $$24), $$1 -> vt.a((List)$$1.b($$24)));
        byc $$322 = byc.a("quoted_string_literal");
        $$52.a($$322, byo.b(byo.a(byz.a('\"'), byo.c(), byo.a($$52.a($$31, $$25)), byz.a('\"')), byo.a(byz.a('\''), byo.a($$52.a($$28, $$25)), byz.a('\''))), $$1 -> (String)$$1.b($$25));
        byc $$33 = byc.a("unquoted_string");
        $$52.a($$33, new bzb(1, k));
        byc $$34 = byc.a("literal");
        byc $$35 = byc.a("arguments");
        $$52.a($$35, byo.a($$52.b($$34), $$35, byz.a(',')), $$1 -> (List)$$1.b($$35));
        byc $$36 = byc.a("unquoted_string_or_builtin");
        $$52.a($$36, byo.a($$52.c($$33), byo.a(byo.a(byz.a('('), $$52.c($$35), byz.a(')')))), $$5 -> {
            bym $$6 = $$5.a();
            String $$7 = (String)$$6.b($$33);
            if ($$7.isEmpty() || !vt.b($$7.charAt(0))) {
                $$5.b().a($$5.g(), vu.d, j);
                return null;
            }
            List $$8 = (List)$$6.a($$35);
            if ($$8 != null) {
                vu.a $$9 = new vu.a($$7, $$8.size());
                vu.b $$10 = vu.c.get($$9);
                if ($$10 != null) {
                    return $$10.a($$0, $$8, $$5);
                }
                $$5.b().a($$5.g(), byf.a(d, $$9.toString()));
                return null;
            }
            if ($$7.equalsIgnoreCase("true")) {
                return $$12;
            }
            if ($$7.equalsIgnoreCase("false")) {
                return $$22;
            }
            return $$0.createString($$7);
        });
        byc $$37 = byc.a("map_key");
        $$52.a($$37, byo.b($$52.c($$322), $$52.c($$33)), $$2 -> (String)$$2.c($$322, $$33));
        byc $$38 = byc.a("map_entry");
        byj $$39 = $$52.a($$38, byo.a($$52.c($$37), byz.a(':'), $$52.c($$34)), $$2 -> {
            bym $$3 = $$2.a();
            String $$4 = (String)$$3.b($$37);
            if ($$4.isEmpty()) {
                $$2.b().a($$2.g(), q);
                return null;
            }
            Object $$5 = $$3.b($$34);
            return Map.entry($$4, $$5);
        });
        byc $$40 = byc.a("map_entries");
        $$52.a($$40, byo.a($$39, $$40, byz.a(',')), $$1 -> (List)$$1.b($$40));
        byc $$41 = byc.a("map_literal");
        $$52.a($$41, byo.a(byz.a('{'), $$52.c($$40), byz.a('}')), $$3 -> {
            List $$4 = (List)$$3.b($$40);
            if ($$4.isEmpty()) {
                return $$32;
            }
            ImmutableMap.Builder $$5 = ImmutableMap.builderWithExpectedSize((int)$$4.size());
            for (Map.Entry $$6 : $$4) {
                $$5.put($$0.createString((String)$$6.getKey()), $$6.getValue());
            }
            return $$0.createMap((Map)$$5.buildKeepingLast());
        });
        byc $$422 = byc.a("list_entries");
        $$52.a($$422, byo.a($$52.b($$34), $$422, byz.a(',')), $$1 -> (List)$$1.b($$422));
        byc $$43 = byc.a("array_prefix");
        $$52.a($$43, byo.b(byo.a(byz.a('B'), byo.a($$43, vt$a.a)), byo.a(byz.a('L'), byo.a($$43, vt$a.c)), byo.a(byz.a('I'), byo.a($$43, vt$a.b))), $$1 -> (a)((Object)((Object)$$1.b($$43))));
        byc $$44 = byc.a("int_array_entries");
        $$52.a($$44, byo.a($$122, $$44, byz.a(',')), $$1 -> (List)$$1.b($$44));
        byc $$45 = byc.a("list_literal");
        $$52.a($$45, byo.a(byz.a('['), byo.b(byo.a($$52.c($$43), byz.a(';'), $$52.c($$44)), $$52.c($$422)), byz.a(']')), $$5 -> {
            bym $$6 = $$5.a();
            a $$7 = (a)((Object)((Object)$$6.a($$43)));
            if ($$7 != null) {
                List $$8 = (List)$$6.b($$44);
                return $$8.isEmpty() ? $$7.a($$0) : $$7.a($$0, $$8, $$5);
            }
            List $$9 = (List)$$6.b($$422);
            return $$9.isEmpty() ? $$42 : $$0.createList($$9.stream());
        });
        byj $$46 = $$52.a($$34, byo.b(byo.a(byo.b(y), byo.b($$52.a($$17, $$34), $$52.c($$11))), byo.a(byo.b(byz.a('\"', '\'')), byo.c(), $$52.c($$322)), byo.a(byo.b(byz.a('{')), byo.c(), $$52.a($$41, $$34)), byo.a(byo.b(byz.a('[')), byo.c(), $$52.a($$45, $$34)), $$52.a($$36, $$34)), $$4 -> {
            bym $$5 = $$4.a();
            String $$6 = (String)$$5.a($$322);
            if ($$6 != null) {
                return $$0.createString($$6);
            }
            c $$7 = (c)$$5.a($$11);
            if ($$7 != null) {
                return $$7.a($$0, $$4);
            }
            return $$5.b($$34);
        });
        return new byq<Object>($$52, $$46);
    }

    static final class e
    extends Enum<e> {
        public static final /* enum */ e a = new e();
        public static final /* enum */ e b = new e();
        private static final /* synthetic */ e[] c;

        public static e[] values() {
            return (e[])c.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        public void a(StringBuilder $$0) {
            if (this == b) {
                $$0.append("-");
            }
        }

        private static /* synthetic */ e[] a() {
            return new e[]{a, b};
        }

        static {
            c = vt$e.a();
        }
    }

    static final class f<T>
    extends Record {
        private final e a;
        final T b;

        f(e $$0, T $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "sign;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "sign;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "sign;value", "a", "b"}, this, $$0);
        }

        public e a() {
            return this.a;
        }

        public T b() {
            return this.b;
        }
    }

    static final class i
    extends Enum<i> {
        public static final /* enum */ i a = new i();
        public static final /* enum */ i b = new i();
        public static final /* enum */ i c = new i();
        public static final /* enum */ i d = new i();
        public static final /* enum */ i e = new i();
        public static final /* enum */ i f = new i();
        private static final /* synthetic */ i[] g;

        public static i[] values() {
            return (i[])g.clone();
        }

        public static i valueOf(String $$0) {
            return Enum.valueOf(i.class, $$0);
        }

        private static /* synthetic */ i[] a() {
            return new i[]{a, b, c, d, e, f};
        }

        static {
            g = vt$i.a();
        }
    }

    static final class d
    extends Record {
        final @Nullable g b;
        final @Nullable i c;
        public static final d a = new d(null, null);

        d(@Nullable g $$0, @Nullable i $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "signed;type", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "signed;type", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "signed;type", "b", "c"}, this, $$0);
        }

        public @Nullable g a() {
            return this.b;
        }

        public @Nullable i b() {
            return this.c;
        }
    }

    static final class g
    extends Enum<g> {
        public static final /* enum */ g a = new g();
        public static final /* enum */ g b = new g();
        private static final /* synthetic */ g[] c;

        public static g[] values() {
            return (g[])c.clone();
        }

        public static g valueOf(String $$0) {
            return Enum.valueOf(g.class, $$0);
        }

        private static /* synthetic */ g[] a() {
            return new g[]{a, b};
        }

        static {
            c = vt$g.a();
        }
    }

    static class h
    extends bys {
        public h(int $$0) {
            super($$0, $$0, byf.a(b, String.valueOf($$0)));
        }

        @Override
        protected boolean a(char $$0) {
            return switch ($$0) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
                default -> false;
            };
        }
    }

    static abstract sealed class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(vt$i.c, new i[0]){
            private static final ByteBuffer d = ByteBuffer.wrap(new byte[0]);

            @Override
            public <T> T a(DynamicOps<T> $$0) {
                return (T)$$0.createByteList(d);
            }

            @Override
            public <T> @Nullable T a(DynamicOps<T> $$0, List<c> $$1, byk<?> $$2) {
                ByteArrayList $$3 = new ByteArrayList();
                for (c $$4 : $$1) {
                    Number $$5 = this.a($$4, $$2);
                    if ($$5 == null) {
                        return null;
                    }
                    $$3.add($$5.byteValue());
                }
                return (T)$$0.createByteList(ByteBuffer.wrap($$3.toByteArray()));
            }
        };
        public static final /* enum */ a b = new a(vt$i.e, new i[]{vt$i.c, vt$i.d}){

            @Override
            public <T> T a(DynamicOps<T> $$0) {
                return (T)$$0.createIntList(IntStream.empty());
            }

            @Override
            public <T> @Nullable T a(DynamicOps<T> $$0, List<c> $$1, byk<?> $$2) {
                IntStream.Builder $$3 = IntStream.builder();
                for (c $$4 : $$1) {
                    Number $$5 = this.a($$4, $$2);
                    if ($$5 == null) {
                        return null;
                    }
                    $$3.add($$5.intValue());
                }
                return (T)$$0.createIntList($$3.build());
            }
        };
        public static final /* enum */ a c = new a(vt$i.f, new i[]{vt$i.c, vt$i.d, vt$i.e}){

            @Override
            public <T> T a(DynamicOps<T> $$0) {
                return (T)$$0.createLongList(LongStream.empty());
            }

            @Override
            public <T> @Nullable T a(DynamicOps<T> $$0, List<c> $$1, byk<?> $$2) {
                LongStream.Builder $$3 = LongStream.builder();
                for (c $$4 : $$1) {
                    Number $$5 = this.a($$4, $$2);
                    if ($$5 == null) {
                        return null;
                    }
                    $$3.add($$5.longValue());
                }
                return (T)$$0.createLongList($$3.build());
            }
        };
        private final i d;
        private final Set<i> e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(i $$0, i ... $$1) {
            this.e = Set.of($$1);
            this.d = $$0;
        }

        public boolean a(i $$0) {
            return $$0 == this.d || this.e.contains((Object)$$0);
        }

        public abstract <T> T a(DynamicOps<T> var1);

        public abstract <T> @Nullable T a(DynamicOps<T> var1, List<c> var2, byk<?> var3);

        protected @Nullable Number a(c $$0, byk<?> $$1) {
            i $$2 = this.a($$0.d);
            if ($$2 == null) {
                $$1.b().a($$1.g(), i);
                return null;
            }
            return (Number)$$0.a(JavaOps.INSTANCE, $$2, $$1);
        }

        private @Nullable i a(d $$0) {
            i $$1 = $$0.b();
            if ($$1 == null) {
                return this.d;
            }
            if (!this.a($$1)) {
                return null;
            }
            return $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = vt$a.a();
        }
    }

    static final class c
    extends Record {
        private final e a;
        private final b b;
        private final String c;
        final d d;

        c(e $$0, b $$1, String $$2, d $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        private g e() {
            if (this.d.b != null) {
                return this.d.b;
            }
            return switch (this.b.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0, 2 -> vt$g.b;
                case 1 -> vt$g.a;
            };
        }

        private String a(e $$0) {
            boolean $$1 = vt.a(this.c);
            if ($$0 == vt$e.b || $$1) {
                StringBuilder $$2 = new StringBuilder();
                $$0.a($$2);
                vt.a($$2, this.c, $$1);
                return $$2.toString();
            }
            return this.c;
        }

        public <T> @Nullable T a(DynamicOps<T> $$0, byk<?> $$1) {
            return this.a($$0, Objects.requireNonNullElse(this.d.c, vt$i.e), $$1);
        }

        public <T> @Nullable T a(DynamicOps<T> $$0, i $$1, byk<?> $$2) {
            boolean $$3;
            boolean bl2 = $$3 = this.e() == vt$g.a;
            if (!$$3 && this.a == vt$e.b) {
                $$2.b().a($$2.g(), g);
                return null;
            }
            String $$4 = this.a(this.a);
            int $$5 = switch (this.b.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> 2;
                case 1 -> 10;
                case 2 -> 16;
            };
            try {
                if ($$3) {
                    return (T)(switch ($$1.ordinal()) {
                        case 2 -> $$0.createByte(Byte.parseByte($$4, $$5));
                        case 3 -> $$0.createShort(Short.parseShort($$4, $$5));
                        case 4 -> $$0.createInt(Integer.parseInt($$4, $$5));
                        case 5 -> $$0.createLong(Long.parseLong($$4, $$5));
                        default -> {
                            $$2.b().a($$2.g(), e);
                            yield null;
                        }
                    });
                }
                return (T)(switch ($$1.ordinal()) {
                    case 2 -> $$0.createByte(UnsignedBytes.parseUnsignedByte((String)$$4, (int)$$5));
                    case 3 -> $$0.createShort(vt.a($$4, $$5));
                    case 4 -> $$0.createInt(Integer.parseUnsignedInt($$4, $$5));
                    case 5 -> $$0.createLong(Long.parseUnsignedLong($$4, $$5));
                    default -> {
                        $$2.b().a($$2.g(), e);
                        yield null;
                    }
                });
            }
            catch (NumberFormatException $$6) {
                $$2.b().a($$2.g(), vt.a($$6));
                return null;
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "sign;base;digits;suffix", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "sign;base;digits;suffix", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "sign;base;digits;suffix", "a", "b", "c", "d"}, this, $$0);
        }

        public e a() {
            return this.a;
        }

        public b b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public d d() {
            return this.d;
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = vt$b.a();
        }
    }
}

