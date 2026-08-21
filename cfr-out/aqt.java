/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class aqt {
    private static final List<amt<dut>> a = List.of(duu.a, duu.b, duu.c, duu.d, duu.e, duu.f, duu.g, duu.h, duu.i, duu.j, duu.k, duu.l, duu.m, duu.n, duu.o, duu.p, duu.q, duu.r);
    private static final List<amt<dur>> b = List.of(dus.a, dus.b, dus.c, dus.d, dus.e, dus.f, dus.g, dus.h, dus.i, dus.j, dus.k);
    private static final ToIntFunction<amt<dut>> c = bhs.f(a);
    private static final ToIntFunction<amt<dur>> d = bhs.f(b);
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("Invalid pattern", $$0));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("spawn_armor_trims").requires(ee.a(ee.d))).then(ee.b("*_lag_my_game").executes($$0 -> aqt.a((ed)$$0.getSource(), ((ed)$$0.getSource()).i())))).then(ee.a("pattern", ff.a(mj.bA)).executes($$0 -> aqt.a((ed)$$0.getSource(), (ddm)((ed)$$0.getSource()).i(), ff.a((CommandContext<ed>)$$0, "pattern", mj.bA, e)))));
    }

    private static int a(ed $$0, ddm $$1) {
        return aqt.a($$0, $$1, $$0.m().bc().f(mj.bA).c());
    }

    private static int a(ed $$0, ddm $$1, amt<dut> $$2) {
        return aqt.a($$0, $$1, Stream.of((jd.c)$$0.m().bc().f(mj.bA).a($$2).orElseThrow()));
    }

    private static int a(ed $$02, ddm $$1, Stream<jd.c<dut>> $$2) {
        axf $$3 = $$02.f();
        List<jd.c> $$4 = $$2.sorted(Comparator.comparing($$0 -> c.applyAsInt($$0.h()))).toList();
        List<jd.c> $$5 = $$3.J_().f(mj.bz).c().sorted(Comparator.comparing($$0 -> d.applyAsInt($$0.h()))).toList();
        List<jd.c<dlp>> $$6 = aqt.a($$3.J_().f(mj.R));
        is $$7 = $$1.dK().a($$1.dg(), 5);
        double $$8 = 3.0;
        for (int $$9 = 0; $$9 < $$5.size(); ++$$9) {
            jd.c $$10 = $$5.get($$9);
            for (int $$11 = 0; $$11 < $$4.size(); ++$$11) {
                jd.c $$12 = $$4.get($$11);
                dup $$13 = new dup($$10, $$12);
                for (int $$14 = 0; $$14 < $$6.size(); ++$$14) {
                    jd.c<dlp> $$15 = $$6.get($$14);
                    double $$16 = (double)$$7.u() + 0.5 - (double)$$14 * 3.0;
                    double $$17 = (double)$$7.v() + 0.5 + (double)$$9 * 3.0;
                    double $$18 = (double)$$7.w() + 0.5 + (double)($$11 * 10);
                    cyy $$19 = new cyy($$3, $$16, $$17, $$18);
                    $$19.v(180.0f);
                    $$19.g(true);
                    dlt $$20 = new dlt($$15);
                    dun $$21 = Objects.requireNonNull($$20.a(ki.H));
                    $$20.b(ki.ad, $$13);
                    $$19.a($$21.b(), $$20);
                    if ($$14 == 0) {
                        $$19.b($$13.b().a().a($$13.a()).f().f(" & ").b($$13.a().a().b()));
                        $$19.p(true);
                    } else {
                        $$19.l(true);
                    }
                    $$3.b($$19);
                }
            }
        }
        $$02.a(() -> yh.b("Armorstands with trimmed armor spawned around you"), true);
        return 1;
    }

    private static List<jd.c<dlp>> a(jf<dlp> $$0) {
        ArrayList<jd.c<dlp>> $$12 = new ArrayList<jd.c<dlp>>();
        $$0.c().forEach($$1 -> {
            dun $$2 = ((dlp)$$1.a()).f().a(ki.H);
            if ($$2 != null && $$2.b().a() == cgv.a.b && $$2.d().isPresent()) {
                $$12.add((jd.c<dlp>)$$1);
            }
        });
        return $$12;
    }
}

