/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.datafixers.util.Either
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableInt;

public class apa {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.pos.unloaded"));
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.fillbiome.toobig", $$0, $$1));

    public static void a(CommandDispatcher<ed> $$03, dz $$1) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("fillbiome").requires(ee.a(ee.d))).then(ee.a("from", gc.a()).then(ee.a("to", gc.a()).then(((RequiredArgumentBuilder)ee.a("biome", fe.a($$1, mj.aS)).executes($$02 -> apa.a((ed)$$02.getSource(), gc.a((CommandContext<ed>)$$02, "from"), gc.a((CommandContext<ed>)$$02, "to"), fe.a((CommandContext<ed>)$$02, "biome", mj.aS), (jd<dxo> $$0) -> true))).then(ee.b("replace").then(ee.a("filter", fh.a($$1, mj.aS)).executes($$0 -> apa.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "from"), gc.a((CommandContext<ed>)$$0, "to"), fe.a((CommandContext<ed>)$$0, "biome", mj.aS), fh.a((CommandContext<ed>)$$0, "filter", mj.aS)))))))));
    }

    private static int a(int $$0) {
        return jo.c(jo.a($$0));
    }

    private static is a(is $$0) {
        return new is(apa.a($$0.u()), apa.a($$0.v()), apa.a($$0.w()));
    }

    private static dxr a(MutableInt $$0, eqf $$1, ffg $$2, jd<dxo> $$3, Predicate<jd<dxo>> $$4) {
        return ($$5, $$6, $$7, $$8) -> {
            int $$9 = jo.c($$5);
            int $$10 = jo.c($$6);
            int $$11 = jo.c($$7);
            jd<dxo> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
            if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
                $$0.increment();
                return $$3;
            }
            return $$12;
        };
    }

    public static Either<Integer, CommandSyntaxException> a(axf $$02, is $$1, is $$2, jd<dxo> $$3) {
        return apa.a($$02, $$1, $$2, $$3, $$0 -> true, $$0 -> {});
    }

    public static Either<Integer, CommandSyntaxException> a(axf $$0, is $$1, is $$2, jd<dxo> $$3, Predicate<jd<dxo>> $$4, Consumer<Supplier<yh>> $$5) {
        int $$10;
        is $$7;
        is $$6 = apa.a($$1);
        ffg $$8 = ffg.a((jy)$$6, (jy)($$7 = apa.a($$2)));
        int $$9 = $$8.d() * $$8.e() * $$8.f();
        if ($$9 > ($$10 = $$0.U().a(eua.x).intValue())) {
            return Either.right((Object)((Object)b.create((Object)$$10, (Object)$$9)));
        }
        ArrayList<eqf> $$11 = new ArrayList<eqf>();
        for (int $$12 = jw.a($$8.j()); $$12 <= jw.a($$8.m()); ++$$12) {
            for (int $$13 = jw.a($$8.h()); $$13 <= jw.a($$8.k()); ++$$13) {
                eqf $$14 = $$0.a($$13, $$12, erj.n, false);
                if ($$14 == null) {
                    return Either.right((Object)((Object)a.create()));
                }
                $$11.add($$14);
            }
        }
        MutableInt $$15 = new MutableInt(0);
        for (eqf $$16 : $$11) {
            $$16.a(apa.a($$15, $$16, $$8, $$3, $$4), $$0.p().i().b());
            $$16.i();
        }
        $$0.p().a.b($$11);
        $$5.accept(() -> yh.a("commands.fillbiome.success.count", $$15.intValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
        return Either.left((Object)$$15.intValue());
    }

    private static int a(ed $$0, is $$12, is $$2, jd.c<dxo> $$3, Predicate<jd<dxo>> $$4) throws CommandSyntaxException {
        Either<Integer, CommandSyntaxException> $$5 = apa.a($$0.f(), $$12, $$2, $$3, $$4, $$1 -> $$0.a((Supplier<yh>)$$1, true));
        Optional $$6 = $$5.right();
        if ($$6.isPresent()) {
            throw (CommandSyntaxException)((Object)$$6.get());
        }
        return (Integer)$$5.left().get();
    }
}

