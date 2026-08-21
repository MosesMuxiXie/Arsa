/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class aqv {
    private static final int a = 10000;
    private static final Dynamic4CommandExceptionType b = new Dynamic4CommandExceptionType(($$0, $$1, $$2, $$3) -> yh.b("commands.spreadplayers.failed.teams", $$0, $$1, $$2, $$3));
    private static final Dynamic4CommandExceptionType c = new Dynamic4CommandExceptionType(($$0, $$1, $$2, $$3) -> yh.b("commands.spreadplayers.failed.entities", $$0, $$1, $$2, $$3));
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.spreadplayers.failed.invalid.height", $$0, $$1));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("spreadplayers").requires(ee.a(ee.d))).then(ee.a("center", gi.a()).then(ee.a("spreadDistance", FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)ee.a("maxRange", FloatArgumentType.floatArg((float)1.0f)).then(ee.a("respectTeams", BoolArgumentType.bool()).then(ee.a("targets", eq.b()).executes($$0 -> aqv.a((ed)$$0.getSource(), gi.a((CommandContext<ed>)$$0, "center"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"maxRange"), ((ed)$$0.getSource()).f().aw() + 1, BoolArgumentType.getBool((CommandContext)$$0, (String)"respectTeams"), eq.b((CommandContext<ed>)$$0, "targets")))))).then(ee.b("under").then(ee.a("maxHeight", IntegerArgumentType.integer()).then(ee.a("respectTeams", BoolArgumentType.bool()).then(ee.a("targets", eq.b()).executes($$0 -> aqv.a((ed)$$0.getSource(), gi.a((CommandContext<ed>)$$0, "center"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"maxRange"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"maxHeight"), BoolArgumentType.getBool((CommandContext)$$0, (String)"respectTeams"), eq.b((CommandContext<ed>)$$0, "targets")))))))))));
    }

    private static int a(ed $$0, ftl $$1, float $$2, float $$3, int $$4, boolean $$5, Collection<? extends cgk> $$6) throws CommandSyntaxException {
        axf $$7 = $$0.f();
        int $$8 = $$7.K_();
        if ($$4 < $$8) {
            throw d.create((Object)$$4, (Object)$$8);
        }
        bgr $$9 = bgr.a();
        double $$10 = $$1.j - $$3;
        double $$11 = $$1.k - $$3;
        double $$12 = $$1.j + $$3;
        double $$13 = $$1.k + $$3;
        a[] $$14 = aqv.a($$9, $$5 ? aqv.a($$6) : $$6.size(), $$10, $$11, $$12, $$13);
        aqv.a($$1, $$2, $$7, $$9, $$10, $$11, $$12, $$13, $$4, $$14, $$5);
        double $$15 = aqv.a($$6, $$7, $$14, $$4, $$5);
        $$0.a(() -> yh.a("commands.spreadplayers.success." + ($$5 ? "teams" : "entities"), $$14.length, Float.valueOf($$2.j), Float.valueOf($$2.k), String.format(Locale.ROOT, "%.2f", $$15)), true);
        return $$14.length;
    }

    private static int a(Collection<? extends cgk> $$0) {
        HashSet $$1 = Sets.newHashSet();
        for (cgk cgk2 : $$0) {
            if (cgk2 instanceof ddm) {
                $$1.add(cgk2.cI());
                continue;
            }
            $$1.add(null);
        }
        return $$1.size();
    }

    private static void a(ftl $$0, double $$1, axf $$2, bgr $$3, double $$4, double $$5, double $$6, double $$7, int $$8, a[] $$9, boolean $$10) throws CommandSyntaxException {
        int $$13;
        boolean $$11 = true;
        double $$12 = 3.4028234663852886E38;
        for ($$13 = 0; $$13 < 10000 && $$11; ++$$13) {
            $$11 = false;
            $$12 = 3.4028234663852886E38;
            for (int $$14 = 0; $$14 < $$9.length; ++$$14) {
                a $$15 = $$9[$$14];
                int $$16 = 0;
                a $$17 = new a();
                for (int $$18 = 0; $$18 < $$9.length; ++$$18) {
                    if ($$14 == $$18) continue;
                    a $$19 = $$9[$$18];
                    double $$20 = $$15.a($$19);
                    $$12 = Math.min($$20, $$12);
                    if (!($$20 < $$1)) continue;
                    ++$$16;
                    $$17.a += $$19.a - $$15.a;
                    $$17.b += $$19.b - $$15.b;
                }
                if ($$16 > 0) {
                    $$17.a /= (double)$$16;
                    $$17.b /= (double)$$16;
                    double $$21 = $$17.b();
                    if ($$21 > 0.0) {
                        $$17.a();
                        $$15.b($$17);
                    } else {
                        $$15.a($$3, $$4, $$5, $$6, $$7);
                    }
                    $$11 = true;
                }
                if (!$$15.a($$4, $$5, $$6, $$7)) continue;
                $$11 = true;
            }
            if ($$11) continue;
            for (a $$22 : $$9) {
                if ($$22.b($$2, $$8)) continue;
                $$22.a($$3, $$4, $$5, $$6, $$7);
                $$11 = true;
            }
        }
        if ($$12 == 3.4028234663852886E38) {
            $$12 = 0.0;
        }
        if ($$13 >= 10000) {
            if ($$10) {
                throw b.create((Object)$$9.length, (Object)Float.valueOf($$0.j), (Object)Float.valueOf($$0.k), (Object)String.format(Locale.ROOT, "%.2f", $$12));
            }
            throw c.create((Object)$$9.length, (Object)Float.valueOf($$0.j), (Object)Float.valueOf($$0.k), (Object)String.format(Locale.ROOT, "%.2f", $$12));
        }
    }

    private static double a(Collection<? extends cgk> $$0, axf $$1, a[] $$2, int $$3, boolean $$4) {
        double $$5 = 0.0;
        int $$6 = 0;
        HashMap $$7 = Maps.newHashMap();
        for (cgk cgk2 : $$0) {
            a $$11;
            if ($$4) {
                fum $$9;
                fum fum2 = $$9 = cgk2 instanceof ddm ? cgk2.cI() : null;
                if (!$$7.containsKey($$9)) {
                    $$7.put($$9, $$2[$$6++]);
                }
                a $$10 = (a)$$7.get($$9);
            } else {
                $$11 = $$2[$$6++];
            }
            cgk2.a($$1, (double)bgj.c($$11.a) + 0.5, $$11.a($$1, $$3), (double)bgj.c($$11.b) + 0.5, Set.of(), cgk2.ec(), cgk2.ee(), true);
            double $$12 = Double.MAX_VALUE;
            for (a $$13 : $$2) {
                if ($$11 == $$13) continue;
                double $$14 = $$11.a($$13);
                $$12 = Math.min($$14, $$12);
            }
            $$5 += $$12;
        }
        if ($$0.size() < 2) {
            return 0.0;
        }
        return $$5 /= (double)$$0.size();
    }

    private static a[] a(bgr $$0, int $$1, double $$2, double $$3, double $$4, double $$5) {
        a[] $$6 = new a[$$1];
        for (int $$7 = 0; $$7 < $$6.length; ++$$7) {
            a $$8 = new a();
            $$8.a($$0, $$2, $$3, $$4, $$5);
            $$6[$$7] = $$8;
        }
        return $$6;
    }

    static class a {
        double a;
        double b;

        a() {
        }

        double a(a $$0) {
            double $$1 = this.a - $$0.a;
            double $$2 = this.b - $$0.b;
            return Math.sqrt($$1 * $$1 + $$2 * $$2);
        }

        void a() {
            double $$0 = this.b();
            this.a /= $$0;
            this.b /= $$0;
        }

        double b() {
            return Math.sqrt(this.a * this.a + this.b * this.b);
        }

        public void b(a $$0) {
            this.a -= $$0.a;
            this.b -= $$0.b;
        }

        public boolean a(double $$0, double $$1, double $$2, double $$3) {
            boolean $$4 = false;
            if (this.a < $$0) {
                this.a = $$0;
                $$4 = true;
            } else if (this.a > $$2) {
                this.a = $$2;
                $$4 = true;
            }
            if (this.b < $$1) {
                this.b = $$1;
                $$4 = true;
            } else if (this.b > $$3) {
                this.b = $$3;
                $$4 = true;
            }
            return $$4;
        }

        public int a(dvt $$0, int $$1) {
            is.a $$2 = new is.a(this.a, (double)($$1 + 1), this.b);
            boolean $$3 = $$0.a_($$2).l();
            $$2.c(iz.a);
            boolean $$4 = $$0.a_($$2).l();
            while ($$2.v() > $$0.K_()) {
                $$2.c(iz.a);
                boolean $$5 = $$0.a_($$2).l();
                if (!$$5 && $$4 && $$3) {
                    return $$2.v() + 1;
                }
                $$3 = $$4;
                $$4 = $$5;
            }
            return $$1 + 1;
        }

        public boolean b(dvt $$0, int $$1) {
            is $$2 = is.a(this.a, (double)(this.a($$0, $$1) - 1), this.b);
            eoh $$3 = $$0.a_($$2);
            return $$2.v() < $$1 && !$$3.n() && !$$3.a(bdp.aY);
        }

        public void a(bgr $$0, double $$1, double $$2, double $$3, double $$4) {
            this.a = bgj.a($$0, $$1, $$3);
            this.b = bgj.a($$0, $$2, $$4);
        }
    }
}

