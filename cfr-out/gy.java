/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class gy {
    private static final Logger i = LogUtils.getLogger();
    private static final Map<String, b> j = Maps.newHashMap();
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.options.unknown", $$0));
    public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.options.inapplicable", $$0));
    public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("argument.entity.options.distance.negative"));
    public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("argument.entity.options.level.negative"));
    public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("argument.entity.options.limit.toosmall"));
    public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.options.sort.irreversible", $$0));
    public static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.options.mode.invalid", $$0));
    public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> yh.b("argument.entity.options.type.invalid", $$0));

    private static void a(String $$0, a $$1, Predicate<gw> $$2, yh $$3) {
        j.put($$0, new b($$1, $$2, $$3));
    }

    public static void a() {
        if (!j.isEmpty()) {
            return;
        }
        gy.a("name", $$0 -> {
            int $$1 = $$0.g().getCursor();
            boolean $$22 = $$0.e();
            String $$3 = $$0.g().readString();
            if ($$0.w() && !$$22) {
                $$0.g().setCursor($$1);
                throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)"name");
            }
            if ($$22) {
                $$0.c(true);
            } else {
                $$0.b(true);
            }
            $$0.a($$2 -> $$2.aq().equals($$3) != $$22);
        }, $$0 -> !$$0.v(), yh.c("argument.entity.options.name.description"));
        gy.a("distance", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cq.b $$2 = cq.b.a($$0.g());
            if ($$2.b().isPresent() && (Double)$$2.b().get() < 0.0 || $$2.c().isPresent() && (Double)$$2.c().get() < 0.0) {
                $$0.g().setCursor($$1);
                throw c.createWithContext((ImmutableStringReader)$$0.g());
            }
            $$0.a($$2);
            $$0.h();
        }, $$0 -> $$0.i() == null, yh.c("argument.entity.options.distance.description"));
        gy.a("level", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cq.d $$2 = cq.d.a($$0.g());
            if ($$2.b().isPresent() && (Integer)$$2.b().get() < 0 || $$2.c().isPresent() && (Integer)$$2.c().get() < 0) {
                $$0.g().setCursor($$1);
                throw d.createWithContext((ImmutableStringReader)$$0.g());
            }
            $$0.a($$2);
            $$0.a(false);
        }, $$0 -> $$0.j() == null, yh.c("argument.entity.options.level.description"));
        gy.a("x", $$0 -> {
            $$0.h();
            $$0.a($$0.g().readDouble());
        }, $$0 -> $$0.m() == null, yh.c("argument.entity.options.x.description"));
        gy.a("y", $$0 -> {
            $$0.h();
            $$0.b($$0.g().readDouble());
        }, $$0 -> $$0.n() == null, yh.c("argument.entity.options.y.description"));
        gy.a("z", $$0 -> {
            $$0.h();
            $$0.c($$0.g().readDouble());
        }, $$0 -> $$0.o() == null, yh.c("argument.entity.options.z.description"));
        gy.a("dx", $$0 -> {
            $$0.h();
            $$0.d($$0.g().readDouble());
        }, $$0 -> $$0.p() == null, yh.c("argument.entity.options.dx.description"));
        gy.a("dy", $$0 -> {
            $$0.h();
            $$0.e($$0.g().readDouble());
        }, $$0 -> $$0.q() == null, yh.c("argument.entity.options.dy.description"));
        gy.a("dz", $$0 -> {
            $$0.h();
            $$0.f($$0.g().readDouble());
        }, $$0 -> $$0.r() == null, yh.c("argument.entity.options.dz.description"));
        gy.a("x_rotation", $$0 -> $$0.a(cq.c.a($$0.g())), $$0 -> $$0.k() == null, yh.c("argument.entity.options.x_rotation.description"));
        gy.a("y_rotation", $$0 -> $$0.b(cq.c.a($$0.g())), $$0 -> $$0.l() == null, yh.c("argument.entity.options.y_rotation.description"));
        gy.a("limit", $$0 -> {
            int $$1 = $$0.g().getCursor();
            int $$2 = $$0.g().readInt();
            if ($$2 < 1) {
                $$0.g().setCursor($$1);
                throw e.createWithContext((ImmutableStringReader)$$0.g());
            }
            $$0.a($$2);
            $$0.d(true);
        }, $$0 -> !$$0.u() && !$$0.x(), yh.c("argument.entity.options.limit.description"));
        gy.a("sort", $$02 -> {
            int $$12 = $$02.g().getCursor();
            String $$2 = $$02.g().readUnquotedString();
            $$02.a(($$0, $$1) -> ei.b(Arrays.asList("nearest", "furthest", "random", "arbitrary"), $$0));
            $$02.a(switch ($$2) {
                case "nearest" -> gw.k;
                case "furthest" -> gw.l;
                case "random" -> gw.m;
                case "arbitrary" -> gv.b;
                default -> {
                    $$02.g().setCursor($$12);
                    throw f.createWithContext((ImmutableStringReader)$$02.g(), (Object)$$2);
                }
            });
            $$02.e(true);
        }, $$0 -> !$$0.u() && !$$0.y(), yh.c("argument.entity.options.sort.description"));
        gy.a("gamemode", $$0 -> {
            $$0.a(($$1, $$2) -> {
                String $$3 = $$1.getRemaining().toLowerCase(Locale.ROOT);
                boolean $$4 = !$$0.A();
                boolean $$5 = true;
                if (!$$3.isEmpty()) {
                    if ($$3.charAt(0) == '!') {
                        $$4 = false;
                        $$3 = $$3.substring(1);
                    } else {
                        $$5 = false;
                    }
                }
                for (dwl $$6 : dwl.values()) {
                    if (!$$6.b().toLowerCase(Locale.ROOT).startsWith($$3)) continue;
                    if ($$5) {
                        $$1.suggest("!" + $$6.b());
                    }
                    if (!$$4) continue;
                    $$1.suggest($$6.b());
                }
                return $$1.buildFuture();
            });
            int $$12 = $$0.g().getCursor();
            boolean $$22 = $$0.e();
            if ($$0.A() && !$$22) {
                $$0.g().setCursor($$12);
                throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)"gamemode");
            }
            String $$3 = $$0.g().readUnquotedString();
            dwl $$4 = dwl.a($$3, null);
            if ($$4 == null) {
                $$0.g().setCursor($$12);
                throw g.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$3);
            }
            $$0.a(false);
            $$0.a($$2 -> {
                if ($$2 instanceof axg) {
                    axg $$3 = (axg)$$2;
                    dwl $$4 = $$3.a();
                    return $$4 == $$4 ^ $$22;
                }
                return false;
            });
            if ($$22) {
                $$0.g(true);
            } else {
                $$0.f(true);
            }
        }, $$0 -> !$$0.z(), yh.c("argument.entity.options.gamemode.description"));
        gy.a("team", $$0 -> {
            boolean $$1 = $$0.e();
            String $$22 = $$0.g().readUnquotedString();
            $$0.a($$2 -> {
                fum $$3 = $$2.cI();
                String $$4 = $$3 == null ? "" : ((fut)$$3).c();
                return $$4.equals($$22) != $$1;
            });
            if ($$1) {
                $$0.i(true);
            } else {
                $$0.h(true);
            }
        }, $$0 -> !$$0.B(), yh.c("argument.entity.options.team.description"));
        gy.a("type", $$0 -> {
            $$0.a(($$1, $$2) -> {
                ei.a(mi.g.i(), $$1, String.valueOf('!'));
                ei.a(mi.g.l().map($$0 -> $$0.h().b()), $$1, "!#");
                if (!$$0.F()) {
                    ei.a(mi.g.i(), $$1);
                    ei.a(mi.g.l().map($$0 -> $$0.h().b()), $$1, String.valueOf('#'));
                }
                return $$1.buildFuture();
            });
            int $$12 = $$0.g().getCursor();
            boolean $$22 = $$0.e();
            if ($$0.F() && !$$22) {
                $$0.g().setCursor($$12);
                throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)"type");
            }
            if ($$22) {
                $$0.D();
            }
            if ($$0.f()) {
                bef<cgu<?>> $$3 = bef.a(mj.F, amo.a($$0.g()));
                $$0.a($$2 -> $$2.ay().a($$3) != $$22);
            } else {
                amo $$4 = amo.a($$0.g());
                cgu $$5 = (cgu)mi.g.b($$4).orElseThrow(() -> {
                    $$0.g().setCursor($$12);
                    return h.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$4.toString());
                });
                if (Objects.equals(cgu.cb, $$5) && !$$22) {
                    $$0.a(false);
                }
                $$0.a($$2 -> Objects.equals($$5, $$2.ay()) != $$22);
                if (!$$22) {
                    $$0.a($$5);
                }
            }
        }, $$0 -> !$$0.E(), yh.c("argument.entity.options.type.description"));
        gy.a("tag", $$0 -> {
            boolean $$1 = $$0.e();
            String $$22 = $$0.g().readUnquotedString();
            $$0.a($$2 -> {
                if ("".equals($$22)) {
                    return $$2.aB().isEmpty() != $$1;
                }
                return $$2.aB().contains($$22) != $$1;
            });
        }, $$0 -> true, yh.c("argument.entity.options.tag.description"));
        gy.a("nbt", $$0 -> {
            boolean $$1 = $$0.e();
            uz $$22 = wa.c($$0.g());
            $$0.a($$2 -> {
                try (bgp.j $$3 = new bgp.j($$2.es(), i);){
                    axg $$5;
                    dlt $$6;
                    fnp $$4 = fnp.a($$3, $$2.eo());
                    $$2.d($$4);
                    if ($$2 instanceof axg && !($$6 = ($$5 = (axg)$$2).gK().h()).f()) {
                        $$4.a("SelectedItem", dlt.b, $$6);
                    }
                    boolean bl2 = vo.a((vz)$$22, $$4.b(), true) != $$1;
                    return bl2;
                }
            });
        }, $$0 -> true, yh.c("argument.entity.options.nbt.description"));
        gy.a("scores", $$0 -> {
            StringReader $$12 = $$0.g();
            HashMap $$2 = Maps.newHashMap();
            $$12.expect('{');
            $$12.skipWhitespace();
            while ($$12.canRead() && $$12.peek() != '}') {
                $$12.skipWhitespace();
                String $$3 = $$12.readUnquotedString();
                $$12.skipWhitespace();
                $$12.expect('=');
                $$12.skipWhitespace();
                cq.d $$4 = cq.d.a($$12);
                $$2.put($$3, $$4);
                $$12.skipWhitespace();
                if (!$$12.canRead() || $$12.peek() != ',') continue;
                $$12.skip();
            }
            $$12.expect('}');
            if (!$$2.isEmpty()) {
                $$0.a($$1 -> {
                    anm $$2 = $$1.ao().s().aK();
                    for (Map.Entry $$3 : $$2.entrySet()) {
                        fuj $$4 = $$2.a((String)$$3.getKey());
                        if ($$4 == null) {
                            return false;
                        }
                        fun $$5 = $$2.d((fuq)$$1, $$4);
                        if ($$5 == null) {
                            return false;
                        }
                        if (((cq.d)$$3.getValue()).d($$5.a())) continue;
                        return false;
                    }
                    return true;
                });
            }
            $$0.j(true);
        }, $$0 -> !$$0.G(), yh.c("argument.entity.options.scores.description"));
        gy.a("advancements", $$0 -> {
            StringReader $$12 = $$0.g();
            HashMap $$2 = Maps.newHashMap();
            $$12.expect('{');
            $$12.skipWhitespace();
            while ($$12.canRead() && $$12.peek() != '}') {
                $$12.skipWhitespace();
                amo $$3 = amo.a($$12);
                $$12.skipWhitespace();
                $$12.expect('=');
                $$12.skipWhitespace();
                if ($$12.canRead() && $$12.peek() == '{') {
                    HashMap $$4 = Maps.newHashMap();
                    $$12.skipWhitespace();
                    $$12.expect('{');
                    $$12.skipWhitespace();
                    while ($$12.canRead() && $$12.peek() != '}') {
                        $$12.skipWhitespace();
                        String $$5 = $$12.readUnquotedString();
                        $$12.skipWhitespace();
                        $$12.expect('=');
                        $$12.skipWhitespace();
                        boolean $$6 = $$12.readBoolean();
                        $$4.put($$5, $$1 -> $$1.a() == $$6);
                        $$12.skipWhitespace();
                        if (!$$12.canRead() || $$12.peek() != ',') continue;
                        $$12.skip();
                    }
                    $$12.skipWhitespace();
                    $$12.expect('}');
                    $$12.skipWhitespace();
                    $$2.put($$3, $$1 -> {
                        for (Map.Entry $$2 : $$4.entrySet()) {
                            al $$3 = $$1.c((String)$$2.getKey());
                            if ($$3 != null && ((Predicate)$$2.getValue()).test($$3)) continue;
                            return false;
                        }
                        return true;
                    });
                } else {
                    boolean $$7 = $$12.readBoolean();
                    $$2.put($$3, $$1 -> $$1.a() == $$7);
                }
                $$12.skipWhitespace();
                if (!$$12.canRead() || $$12.peek() != ',') continue;
                $$12.skip();
            }
            $$12.expect('}');
            if (!$$2.isEmpty()) {
                $$0.a($$1 -> {
                    void $$3;
                    if (!($$1 instanceof axg)) {
                        return false;
                    }
                    axg $$2 = (axg)$$1;
                    anb $$4 = $$3.U();
                    ang $$5 = $$3.A().s().aB();
                    for (Map.Entry $$6 : $$2.entrySet()) {
                        ac $$7 = $$5.a((amo)$$6.getKey());
                        if ($$7 != null && ((Predicate)$$6.getValue()).test($$4.b($$7))) continue;
                        return false;
                    }
                    return true;
                });
                $$0.a(false);
            }
            $$0.k(true);
        }, $$0 -> !$$0.H(), yh.c("argument.entity.options.advancements.description"));
        gy.a("predicate", $$0 -> {
            boolean $$1 = $$0.e();
            amt<frm> $$22 = amt.a(mj.bI, amo.a($$0.g()));
            $$0.a($$2 -> {
                void $$5;
                dwo $$3 = $$2.ao();
                if (!($$3 instanceof axf)) {
                    return false;
                }
                axf $$4 = (axf)$$3;
                Optional<frm> $$6 = $$5.s().be().a().c($$22).map(jd::a);
                if ($$6.isEmpty()) {
                    return false;
                }
                fod $$7 = new fod.a((axf)$$5).a(fqx.a, $$2).a(fqx.h, $$2.dI()).a(fqw.e);
                fnz $$8 = new fnz.b($$7).a(Optional.empty());
                $$8.b(fnz.a($$6.get()));
                return $$1 ^ $$6.get().test($$8);
            });
        }, $$0 -> true, yh.c("argument.entity.options.predicate.description"));
    }

    public static a a(gw $$0, String $$1, int $$2) throws CommandSyntaxException {
        b $$3 = j.get($$1);
        if ($$3 != null) {
            if ($$3.b.test($$0)) {
                return $$3.a;
            }
            throw b.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$1);
        }
        $$0.g().setCursor($$2);
        throw a.createWithContext((ImmutableStringReader)$$0.g(), (Object)$$1);
    }

    public static void a(gw $$0, SuggestionsBuilder $$1) {
        String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);
        for (Map.Entry<String, b> $$3 : j.entrySet()) {
            if (!$$3.getValue().b.test($$0) || !$$3.getKey().toLowerCase(Locale.ROOT).startsWith($$2)) continue;
            $$1.suggest($$3.getKey() + "=", (Message)$$3.getValue().c);
        }
    }

    static final class b
    extends Record {
        final a a;
        final Predicate<gw> b;
        final yh c;

        b(a $$0, Predicate<gw> $$1, yh $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "modifier;canUse;description", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "modifier;canUse;description", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "modifier;canUse;description", "a", "b", "c"}, this, $$0);
        }

        public a a() {
            return this.a;
        }

        public Predicate<gw> b() {
            return this.b;
        }

        public yh c() {
            return this.c;
        }
    }

    @FunctionalInterface
    public static interface a {
        public void handle(gw var1) throws CommandSyntaxException;
    }
}

