/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Splitter
 *  com.google.common.base.Strings
 *  com.google.common.collect.Comparators
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Comparators;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class vo {
    private static final Comparator<vf> b = Comparator.comparingInt($$0 -> $$0.a(1, 0)).thenComparingInt($$0 -> $$0.a(0, 0)).thenComparingInt($$0 -> $$0.a(2, 0));
    private static final Comparator<vf> c = Comparator.comparingDouble($$0 -> $$0.a(1, 0.0)).thenComparingDouble($$0 -> $$0.a(0, 0.0)).thenComparingDouble($$0 -> $$0.a(2, 0.0));
    private static final Codec<amt<dzq>> d = amt.a(mj.i);
    public static final String a = "data";
    private static final char e = '{';
    private static final char f = '}';
    private static final String g = ",";
    private static final char h = ':';
    private static final Splitter i = Splitter.on((String)",");
    private static final Splitter j = Splitter.on((char)':').limit(2);
    private static final Logger k = LogUtils.getLogger();
    private static final int l = 2;
    private static final int m = -1;

    private vo() {
    }

    @VisibleForTesting
    public static boolean a(@Nullable vz $$0, @Nullable vz $$1, boolean $$2) {
        if ($$0 == $$1) {
            return true;
        }
        if ($$0 == null) {
            return true;
        }
        if ($$1 == null) {
            return false;
        }
        if (!$$0.getClass().equals($$1.getClass())) {
            return false;
        }
        if ($$0 instanceof uz) {
            uz $$3 = (uz)$$0;
            uz $$4 = (uz)$$1;
            if ($$4.i() < $$3.i()) {
                return false;
            }
            for (Map.Entry<String, vz> $$5 : $$3.g()) {
                vz $$6 = $$5.getValue();
                if (vo.a($$6, $$4.a($$5.getKey()), $$2)) continue;
                return false;
            }
            return true;
        }
        if ($$0 instanceof vf) {
            vf $$7 = (vf)$$0;
            if ($$2) {
                vf $$8 = (vf)$$1;
                if ($$7.isEmpty()) {
                    return $$8.isEmpty();
                }
                if ($$8.size() < $$7.size()) {
                    return false;
                }
                for (vz $$9 : $$7) {
                    boolean $$10 = false;
                    for (vz $$11 : $$8) {
                        if (!vo.a($$9, $$11, $$2)) continue;
                        $$10 = true;
                        break;
                    }
                    if ($$10) continue;
                    return false;
                }
                return true;
            }
        }
        return $$0.equals($$1);
    }

    public static eoh a(je<dzq> $$0, uz $$1) {
        Optional $$2 = $$1.a("Name", d).flatMap($$0::a);
        if ($$2.isEmpty()) {
            return dzs.a.m();
        }
        dzq $$3 = (dzq)((jd)$$2.get()).a();
        eoh $$4 = $$3.m();
        Optional<uz> $$5 = $$1.m("Properties");
        if ($$5.isPresent()) {
            eoi<dzq, eoh> $$6 = $$3.l();
            for (String $$7 : $$5.get().e()) {
                epk<?> $$8 = $$6.a($$7);
                if ($$8 == null) continue;
                $$4 = vo.a($$4, $$8, $$7, $$5.get(), $$1);
            }
        }
        return $$4;
    }

    private static <S extends eoj<?, S>, T extends Comparable<T>> S a(S $$0, epk<T> $$1, String $$2, uz $$3, uz $$4) {
        Optional $$5 = $$3.i($$2).flatMap($$1::b);
        if ($$5.isPresent()) {
            return (S)((eoj)$$0.b($$1, (Comparable)((Comparable)$$5.get())));
        }
        k.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{$$2, $$3.a($$2), $$4});
        return $$0;
    }

    public static uz a(eoh $$0) {
        uz $$1 = new uz();
        $$1.a("Name", mi.e.b($$0.b()).toString());
        Map<epk<?>, Comparable<?>> $$2 = $$0.G();
        if (!$$2.isEmpty()) {
            uz $$3 = new uz();
            for (Map.Entry<epk<?>, Comparable<?>> $$4 : $$2.entrySet()) {
                epk<?> $$5 = $$4.getKey();
                $$3.a($$5.f(), vo.a($$5, $$4.getValue()));
            }
            $$1.a("Properties", $$3);
        }
        return $$1;
    }

    public static uz a(flb $$0) {
        uz $$1 = new uz();
        $$1.a("Name", mi.c.b($$0.a()).toString());
        Map<epk<?>, Comparable<?>> $$2 = $$0.G();
        if (!$$2.isEmpty()) {
            uz $$3 = new uz();
            for (Map.Entry<epk<?>, Comparable<?>> $$4 : $$2.entrySet()) {
                epk<?> $$5 = $$4.getKey();
                $$3.a($$5.f(), vo.a($$5, $$4.getValue()));
            }
            $$1.a("Properties", $$3);
        }
        return $$1;
    }

    private static <T extends Comparable<T>> String a(epk<T> $$0, Comparable<?> $$1) {
        return $$0.b($$1);
    }

    public static String a(vz $$0) {
        return vo.a($$0, false);
    }

    public static String a(vz $$0, boolean $$1) {
        return vo.a(new StringBuilder(), $$0, 0, $$1).toString();
    }

    public static StringBuilder a(StringBuilder $$0, vz $$1, int $$2, boolean $$3) {
        vz vz2 = $$1;
        Objects.requireNonNull(vz2);
        vz vz3 = vz2;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{vq.class, vb.class, uw.class, vf.class, vd.class, uz.class, vg.class}, (Object)vz3, n2)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                vq $$4 = (vq)vz3;
                yield $$0.append($$4);
            }
            case 1 -> {
                vb $$5 = (vb)vz3;
                yield $$0;
            }
            case 2 -> {
                uw $$6 = (uw)vz3;
                byte[] $$7 = $$6.e();
                int $$8 = $$7.length;
                vo.a($$2, $$0).append("byte[").append($$8).append("] {\n");
                if ($$3) {
                    vo.a($$2 + 1, $$0);
                    for (int $$9 = 0; $$9 < $$7.length; ++$$9) {
                        if ($$9 != 0) {
                            $$0.append(',');
                        }
                        if ($$9 % 16 == 0 && $$9 / 16 > 0) {
                            $$0.append('\n');
                            if ($$9 < $$7.length) {
                                vo.a($$2 + 1, $$0);
                            }
                        } else if ($$9 != 0) {
                            $$0.append(' ');
                        }
                        $$0.append(String.format(Locale.ROOT, "0x%02X", $$7[$$9] & 0xFF));
                    }
                } else {
                    vo.a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
                }
                $$0.append('\n');
                vo.a($$2, $$0).append('}');
                yield $$0;
            }
            case 3 -> {
                vf $$10 = (vf)vz3;
                int $$11 = $$10.size();
                vo.a($$2, $$0).append("list").append("[").append($$11).append("] [");
                if ($$11 != 0) {
                    $$0.append('\n');
                }
                for (int $$12 = 0; $$12 < $$11; ++$$12) {
                    if ($$12 != 0) {
                        $$0.append(",\n");
                    }
                    vo.a($$2 + 1, $$0);
                    vo.a($$0, $$10.c($$12), $$2 + 1, $$3);
                }
                if ($$11 != 0) {
                    $$0.append('\n');
                }
                vo.a($$2, $$0).append(']');
                yield $$0;
            }
            case 4 -> {
                vd $$13 = (vd)vz3;
                int[] $$14 = $$13.g();
                int $$15 = 0;
                for (int $$16 : $$14) {
                    $$15 = Math.max($$15, String.format(Locale.ROOT, "%X", $$16).length());
                }
                int $$17 = $$14.length;
                vo.a($$2, $$0).append("int[").append($$17).append("] {\n");
                if ($$3) {
                    vo.a($$2 + 1, $$0);
                    for (int $$18 = 0; $$18 < $$14.length; ++$$18) {
                        if ($$18 != 0) {
                            $$0.append(',');
                        }
                        if ($$18 % 16 == 0 && $$18 / 16 > 0) {
                            $$0.append('\n');
                            if ($$18 < $$14.length) {
                                vo.a($$2 + 1, $$0);
                            }
                        } else if ($$18 != 0) {
                            $$0.append(' ');
                        }
                        $$0.append(String.format(Locale.ROOT, "0x%0" + $$15 + "X", $$14[$$18]));
                    }
                } else {
                    vo.a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
                }
                $$0.append('\n');
                vo.a($$2, $$0).append('}');
                yield $$0;
            }
            case 5 -> {
                uz $$19 = (uz)vz3;
                ArrayList $$20 = Lists.newArrayList($$19.e());
                Collections.sort($$20);
                vo.a($$2, $$0).append('{');
                if ($$0.length() - $$0.lastIndexOf("\n") > 2 * ($$2 + 1)) {
                    $$0.append('\n');
                    vo.a($$2 + 1, $$0);
                }
                int $$21 = $$20.stream().mapToInt(String::length).max().orElse(0);
                String $$22 = Strings.repeat((String)" ", (int)$$21);
                for (int $$23 = 0; $$23 < $$20.size(); ++$$23) {
                    if ($$23 != 0) {
                        $$0.append(",\n");
                    }
                    String $$24 = (String)$$20.get($$23);
                    vo.a($$2 + 1, $$0).append('\"').append($$24).append('\"').append($$22, 0, $$22.length() - $$24.length()).append(": ");
                    vo.a($$0, $$19.a($$24), $$2 + 1, $$3);
                }
                if (!$$20.isEmpty()) {
                    $$0.append('\n');
                }
                vo.a($$2, $$0).append('}');
                yield $$0;
            }
            case 6 -> {
                vg $$25 = (vg)vz3;
                long[] $$26 = $$25.g();
                long $$27 = 0L;
                for (long $$28 : $$26) {
                    $$27 = Math.max($$27, (long)String.format(Locale.ROOT, "%X", $$28).length());
                }
                long $$29 = $$26.length;
                vo.a($$2, $$0).append("long[").append($$29).append("] {\n");
                if ($$3) {
                    vo.a($$2 + 1, $$0);
                    for (int $$30 = 0; $$30 < $$26.length; ++$$30) {
                        if ($$30 != 0) {
                            $$0.append(',');
                        }
                        if ($$30 % 16 == 0 && $$30 / 16 > 0) {
                            $$0.append('\n');
                            if ($$30 < $$26.length) {
                                vo.a($$2 + 1, $$0);
                            }
                        } else if ($$30 != 0) {
                            $$0.append(' ');
                        }
                        $$0.append(String.format(Locale.ROOT, "0x%0" + $$27 + "X", $$26[$$30]));
                    }
                } else {
                    vo.a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
                }
                $$0.append('\n');
                vo.a($$2, $$0).append('}');
                yield $$0;
            }
        };
    }

    private static StringBuilder a(int $$0, StringBuilder $$1) {
        int $$2 = $$1.lastIndexOf("\n") + 1;
        int $$3 = $$1.length() - $$2;
        for (int $$4 = 0; $$4 < 2 * $$0 - $$3; ++$$4) {
            $$1.append(' ');
        }
        return $$1;
    }

    public static yh b(vz $$0) {
        return new we("").a($$0);
    }

    public static String a(uz $$0) {
        return new vv().a((vz)vo.b($$0));
    }

    public static uz a(String $$0) throws CommandSyntaxException {
        return vo.c(wa.a($$0));
    }

    @VisibleForTesting
    static uz b(uz $$02) {
        Optional<vf> $$6;
        vf $$3;
        Optional<vf> $$12 = $$02.o("palettes");
        if ($$12.isPresent()) {
            vf $$22 = $$12.get().f(0);
        } else {
            $$3 = $$02.p("palette");
        }
        vf $$4 = $$3.j().map(vo::d).map(vx::a).collect(Collectors.toCollection(vf::new));
        $$02.a("palette", $$4);
        if ($$12.isPresent()) {
            vf $$5 = new vf();
            $$12.get().stream().flatMap($$0 -> $$0.t_().stream()).forEach($$2 -> {
                uz $$3 = new uz();
                for (int $$4 = 0; $$4 < $$2.size(); ++$$4) {
                    $$3.a($$4.m($$4).orElseThrow(), vo.d($$2.a($$4).orElseThrow()));
                }
                $$5.add($$3);
            });
            $$02.a("palettes", $$5);
        }
        if (($$6 = $$02.o("entities")).isPresent()) {
            vf $$7 = $$6.get().j().sorted(Comparator.comparing($$0 -> $$0.o("pos"), Comparators.emptiesLast(c))).collect(Collectors.toCollection(vf::new));
            $$02.a("entities", $$7);
        }
        vf $$8 = $$02.o("blocks").stream().flatMap(vf::j).sorted(Comparator.comparing($$0 -> $$0.o("pos"), Comparators.emptiesLast(b))).peek($$1 -> $$1.a("state", $$4.m($$1.b("state", 0)).orElseThrow())).collect(Collectors.toCollection(vf::new));
        $$02.a(a, $$8);
        $$02.r("blocks");
        return $$02;
    }

    @VisibleForTesting
    static uz c(uz $$02) {
        vf $$1 = $$02.p("palette");
        Map $$2 = (Map)$$1.stream().flatMap($$0 -> $$0.p_().stream()).collect(ImmutableMap.toImmutableMap(Function.identity(), vo::b));
        Optional<vf> $$3 = $$02.o("palettes");
        if ($$3.isPresent()) {
            $$02.a("palettes", $$3.get().j().map($$12 -> $$2.keySet().stream().map($$1 -> $$12.i((String)$$1).orElseThrow()).map(vo::b).collect(Collectors.toCollection(vf::new))).collect(Collectors.toCollection(vf::new)));
            $$02.r("palette");
        } else {
            $$02.a("palette", $$2.values().stream().collect(Collectors.toCollection(vf::new)));
        }
        Optional<vf> $$4 = $$02.o(a);
        if ($$4.isPresent()) {
            Object2IntOpenHashMap $$5 = new Object2IntOpenHashMap();
            $$5.defaultReturnValue(-1);
            for (int $$6 = 0; $$6 < $$1.size(); ++$$6) {
                $$5.put((Object)$$1.m($$6).orElseThrow(), $$6);
            }
            vf $$7 = $$4.get();
            for (int $$8 = 0; $$8 < $$7.size(); ++$$8) {
                uz $$9 = $$7.a($$8).orElseThrow();
                String $$10 = $$9.i("state").orElseThrow();
                int $$11 = $$5.getInt((Object)$$10);
                if ($$11 == -1) {
                    throw new IllegalStateException("Entry " + $$10 + " missing from palette");
                }
                $$9.a("state", $$11);
            }
            $$02.a("blocks", $$7);
            $$02.r(a);
        }
        return $$02;
    }

    @VisibleForTesting
    static String d(uz $$0) {
        StringBuilder $$12 = new StringBuilder($$0.i("Name").orElseThrow());
        $$0.m("Properties").ifPresent($$1 -> {
            String $$2 = $$1.g().stream().sorted(Map.Entry.comparingByKey()).map($$0 -> (String)$$0.getKey() + ":" + ((vz)$$0.getValue()).p_().orElseThrow()).collect(Collectors.joining(g));
            $$12.append('{').append($$2).append('}');
        });
        return $$12.toString();
    }

    @VisibleForTesting
    static uz b(String $$0) {
        String $$6;
        uz $$1 = new uz();
        int $$22 = $$0.indexOf(123);
        if ($$22 >= 0) {
            String $$3 = $$0.substring(0, $$22);
            uz $$4 = new uz();
            if ($$22 + 2 <= $$0.length()) {
                String $$5 = $$0.substring($$22 + 1, $$0.indexOf(125, $$22));
                i.split((CharSequence)$$5).forEach($$2 -> {
                    List $$3 = j.splitToList((CharSequence)$$2);
                    if ($$3.size() == 2) {
                        $$4.a((String)$$3.get(0), (String)$$3.get(1));
                    } else {
                        k.error("Something went wrong parsing: '{}' -- incorrect gamedata!", (Object)$$0);
                    }
                });
                $$1.a("Properties", $$4);
            }
        } else {
            $$6 = $$0;
        }
        $$1.a("Name", $$6);
        return $$1;
    }

    public static uz e(uz $$0) {
        int $$1 = w.b().a().b();
        return vo.a($$0, $$1);
    }

    public static uz a(uz $$0, int $$1) {
        $$0.a("DataVersion", $$1);
        return $$0;
    }

    public static Dynamic<vz> a(Dynamic<vz> $$0) {
        int $$1 = w.b().a().b();
        return vo.a($$0, $$1);
    }

    public static Dynamic<vz> a(Dynamic<vz> $$0, int $$1) {
        return $$0.set("DataVersion", $$0.createInt($$1));
    }

    public static void a(fns $$0) {
        int $$1 = w.b().a().b();
        vo.a($$0, $$1);
    }

    public static void a(fns $$0, int $$1) {
        $$0.a("DataVersion", $$1);
    }

    public static int f(uz $$0) {
        return vo.b($$0, -1);
    }

    public static int b(uz $$0, int $$1) {
        return $$0.b("DataVersion", $$1);
    }

    public static int b(Dynamic<?> $$0, int $$1) {
        return $$0.get("DataVersion").asInt($$1);
    }
}

