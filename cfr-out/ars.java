/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ars {
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.data.merge.failed"));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("commands.data.get.invalid", $$0));
    private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("commands.data.get.unknown", $$0));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)yh.c("commands.data.get.multiple"));
    private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> yh.b("commands.data.modify.expected_object", $$0));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> yh.b("commands.data.modify.expected_value", $$0));
    private static final Dynamic2CommandExceptionType j = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.data.modify.invalid_substring", $$0, $$1));
    public static final List<Function<String, c>> a = ImmutableList.of(art.a, arq.a, aru.a);
    public static final List<c> b = (List)a.stream().map($$0 -> (c)$$0.apply("target")).collect(ImmutableList.toImmutableList());
    public static final List<c> c = (List)a.stream().map($$0 -> (c)$$0.apply("source")).collect(ImmutableList.toImmutableList());

    public static void a(CommandDispatcher<ed> $$0) {
        LiteralArgumentBuilder $$1 = (LiteralArgumentBuilder)ee.b("data").requires(ee.a(ee.d));
        for (c $$2 : b) {
            ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then($$2.a((ArgumentBuilder<ed, ?>)ee.b("merge"), $$12 -> $$12.then(ee.a("nbt", en.a()).executes($$1 -> ars.a((ed)$$1.getSource(), $$2.a((CommandContext<ed>)$$1), en.a($$1, "nbt"))))))).then($$2.a((ArgumentBuilder<ed, ?>)ee.b("get"), $$12 -> $$12.executes($$1 -> ars.a((ed)$$1.getSource(), $$2.a((CommandContext<ed>)$$1))).then(((RequiredArgumentBuilder)ee.a("path", ex.a()).executes($$1 -> ars.b((ed)$$1.getSource(), $$2.a((CommandContext<ed>)$$1), ex.a((CommandContext<ed>)$$1, "path")))).then(ee.a("scale", DoubleArgumentType.doubleArg()).executes($$1 -> ars.a((ed)$$1.getSource(), $$2.a((CommandContext<ed>)$$1), ex.a((CommandContext<ed>)$$1, "path"), DoubleArgumentType.getDouble((CommandContext)$$1, (String)"scale")))))))).then($$2.a((ArgumentBuilder<ed, ?>)ee.b("remove"), $$12 -> $$12.then(ee.a("path", ex.a()).executes($$1 -> ars.a((ed)$$1.getSource(), $$2.a((CommandContext<ed>)$$1), ex.a((CommandContext<ed>)$$1, "path"))))))).then(ars.a((ArgumentBuilder<ed, ?> $$02, b $$12) -> $$02.then(ee.b("insert").then(ee.a("index", IntegerArgumentType.integer()).then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a(IntegerArgumentType.getInteger((CommandContext)$$0, (String)"index"), $$1, $$3))))).then(ee.b("prepend").then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a(0, $$1, $$3)))).then(ee.b("append").then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a(-1, $$1, $$3)))).then(ee.b("set").then($$12.create(($$0, $$1, $$2, $$3) -> $$2.a((vz)$$1, (vz)Iterables.getLast((Iterable)$$3))))).then(ee.b("merge").then($$12.create(($$0, $$1, $$2, $$3) -> {
                uz $$4 = new uz();
                for (vz $$5 : $$3) {
                    if (ex.g.a($$5, 0)) {
                        throw ex.b.create();
                    }
                    if ($$5 instanceof uz) {
                        uz $$6 = (uz)$$5;
                        $$4.a($$6);
                        continue;
                    }
                    throw h.create((Object)$$5);
                }
                List<vz> $$7 = $$2.a((vz)$$1, uz::new);
                int $$8 = 0;
                for (vz $$9 : $$7) {
                    void $$11;
                    if (!($$9 instanceof uz)) {
                        throw h.create((Object)$$9);
                    }
                    uz $$10 = (uz)$$9;
                    uz $$12 = $$11.l();
                    $$11.a($$4);
                    $$8 += $$12.equals($$11) ? 0 : 1;
                }
                return $$8;
            })))));
        }
        $$0.register($$1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String a(vz $$0) throws CommandSyntaxException {
        vz vz2 = $$0;
        Objects.requireNonNull(vz2);
        vz vz3 = vz2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{vx.class, vq.class}, (Object)vz3, n2)) {
            case 0: {
                String string;
                vx vx2 = (vx)vz3;
                try {
                    String string2;
                    String $$1;
                    string = $$1 = (string2 = vx2.k());
                    return string;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                vq $$2 = (vq)vz3;
                String string = $$2.toString();
                return string;
            }
        }
        throw i.create((Object)$$0);
    }

    private static List<vz> a(List<vz> $$0, d $$1) throws CommandSyntaxException {
        ArrayList<vz> $$2 = new ArrayList<vz>($$0.size());
        for (vz $$3 : $$0) {
            String $$4 = ars.a($$3);
            $$2.add(vx.a($$1.process($$4)));
        }
        return $$2;
    }

    private static ArgumentBuilder<ed, ?> a(BiConsumer<ArgumentBuilder<ed, ?>, b> $$0) {
        LiteralArgumentBuilder<ed> $$1 = ee.b("modify");
        for (c $$2 : b) {
            $$2.a((ArgumentBuilder<ed, ?>)$$1, $$22 -> {
                RequiredArgumentBuilder<ed, ex.g> $$3 = ee.a("targetPath", ex.a());
                for (c $$4 : c) {
                    $$0.accept((ArgumentBuilder<ed, ?>)$$3, $$2 -> $$4.a((ArgumentBuilder<ed, ?>)ee.b("from"), $$32 -> $$32.executes($$3 -> ars.a((CommandContext<ed>)$$3, $$2, $$2, ars.a((CommandContext<ed>)$$3, $$4))).then(ee.a("sourcePath", ex.a()).executes($$3 -> ars.a((CommandContext<ed>)$$3, $$2, $$2, ars.b((CommandContext<ed>)$$3, $$4))))));
                    $$0.accept((ArgumentBuilder<ed, ?>)$$3, $$2 -> $$4.a((ArgumentBuilder<ed, ?>)ee.b("string"), $$32 -> $$32.executes($$3 -> ars.a((CommandContext<ed>)$$3, $$2, $$2, ars.a(ars.a((CommandContext<ed>)$$3, $$4), (String $$0) -> $$0))).then(((RequiredArgumentBuilder)ee.a("sourcePath", ex.a()).executes($$3 -> ars.a((CommandContext<ed>)$$3, $$2, $$2, ars.a(ars.b((CommandContext<ed>)$$3, $$4), (String $$0) -> $$0)))).then(((RequiredArgumentBuilder)ee.a("start", IntegerArgumentType.integer()).executes($$3 -> ars.a((CommandContext<ed>)$$3, $$2, $$2, ars.a(ars.b((CommandContext<ed>)$$3, $$4), (String $$1) -> ars.a($$1, IntegerArgumentType.getInteger((CommandContext)$$3, (String)"start")))))).then(ee.a("end", IntegerArgumentType.integer()).executes($$3 -> ars.a((CommandContext<ed>)$$3, $$2, $$2, ars.a(ars.b((CommandContext<ed>)$$3, $$4), (String $$1) -> ars.b($$1, IntegerArgumentType.getInteger((CommandContext)$$3, (String)"start"), IntegerArgumentType.getInteger((CommandContext)$$3, (String)"end"))))))))));
                }
                $$0.accept((ArgumentBuilder<ed, ?>)$$3, $$1 -> ee.b("value").then(ee.a("value", ey.a()).executes($$2 -> {
                    List<vz> $$3 = Collections.singletonList(ey.a($$2, "value"));
                    return ars.a((CommandContext<ed>)$$2, $$2, $$1, $$3);
                })));
                return $$22.then($$3);
            });
        }
        return $$1;
    }

    private static String a(String $$0, int $$1, int $$2) throws CommandSyntaxException {
        if ($$1 < 0 || $$2 > $$0.length() || $$1 > $$2) {
            throw j.create((Object)$$1, (Object)$$2);
        }
        return $$0.substring($$1, $$2);
    }

    private static String b(String $$0, int $$1, int $$2) throws CommandSyntaxException {
        int $$3 = $$0.length();
        int $$4 = ars.a($$1, $$3);
        int $$5 = ars.a($$2, $$3);
        return ars.a($$0, $$4, $$5);
    }

    private static String a(String $$0, int $$1) throws CommandSyntaxException {
        int $$2 = $$0.length();
        return ars.a($$0, ars.a($$1, $$2), $$2);
    }

    private static int a(int $$0, int $$1) {
        return $$0 >= 0 ? $$0 : $$1 + $$0;
    }

    private static List<vz> a(CommandContext<ed> $$0, c $$1) throws CommandSyntaxException {
        arr $$2 = $$1.a($$0);
        return Collections.singletonList($$2.a());
    }

    private static List<vz> b(CommandContext<ed> $$0, c $$1) throws CommandSyntaxException {
        arr $$2 = $$1.a($$0);
        ex.g $$3 = ex.a($$0, "sourcePath");
        return $$3.a($$2.a());
    }

    private static int a(CommandContext<ed> $$0, c $$1, a $$2, List<vz> $$3) throws CommandSyntaxException {
        arr $$4 = $$1.a($$0);
        ex.g $$5 = ex.a($$0, "targetPath");
        uz $$6 = $$4.a();
        int $$7 = $$2.modify($$0, $$6, $$5, $$3);
        if ($$7 == 0) {
            throw d.create();
        }
        $$4.a($$6);
        ((ed)$$0.getSource()).a(() -> $$4.b(), true);
        return $$7;
    }

    private static int a(ed $$0, arr $$1, ex.g $$2) throws CommandSyntaxException {
        uz $$3 = $$1.a();
        int $$4 = $$2.c($$3);
        if ($$4 == 0) {
            throw d.create();
        }
        $$1.a($$3);
        $$0.a(() -> $$1.b(), true);
        return $$4;
    }

    public static vz a(ex.g $$0, arr $$1) throws CommandSyntaxException {
        List<vz> $$2 = $$0.a($$1.a());
        Iterator $$3 = $$2.iterator();
        vz $$4 = (vz)$$3.next();
        if ($$3.hasNext()) {
            throw g.create();
        }
        return $$4;
    }

    /*
     * Loose catch block
     */
    private static int b(ed $$0, arr $$1, ex.g $$2) throws CommandSyntaxException {
        vz $$3;
        vz vz2 = $$3 = ars.a($$2, $$1);
        Objects.requireNonNull(vz2);
        vz vz3 = vz2;
        int n2 = 0;
        int $$9 = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{vp.class, uy.class, uz.class, vx.class, vb.class}, (Object)vz3, n2)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                vp $$4 = (vp)vz3;
                yield bgj.c($$4.k());
            }
            case 1 -> {
                uy $$5 = (uy)vz3;
                yield $$5.size();
            }
            case 2 -> {
                uz $$6 = (uz)vz3;
                yield $$6.i();
            }
            case 3 -> {
                String var12_11;
                vx var10_10 = (vx)vz3;
                String $$7 = var12_11 = var10_10.k();
                yield $$7.length();
            }
            case 4 -> {
                vb $$8 = (vb)vz3;
                throw f.create((Object)$$2.toString());
            }
        };
        $$0.a(() -> $$3.a($$3), false);
        return $$9;
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    private static int a(ed $$0, arr $$1, ex.g $$2, double $$3) throws CommandSyntaxException {
        vz $$4 = ars.a($$2, $$1);
        if (!($$4 instanceof vp)) {
            throw e.create((Object)$$2.toString());
        }
        int $$5 = bgj.c(((vp)$$4).k() * $$3);
        $$0.a(() -> $$1.a($$2, $$3, $$5), false);
        return $$5;
    }

    private static int a(ed $$0, arr $$1) throws CommandSyntaxException {
        uz $$2 = $$1.a();
        $$0.a(() -> $$1.a((vz)$$2), false);
        return 1;
    }

    private static int a(ed $$0, arr $$1, uz $$2) throws CommandSyntaxException {
        uz $$3 = $$1.a();
        if (ex.g.a($$2, 0)) {
            throw ex.b.create();
        }
        uz $$4 = $$3.l().a($$2);
        if ($$3.equals($$4)) {
            throw d.create();
        }
        $$1.a($$4);
        $$0.a(() -> $$1.b(), true);
        return 1;
    }

    public static interface c {
        public arr a(CommandContext<ed> var1) throws CommandSyntaxException;

        public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> var1, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> var2);
    }

    @FunctionalInterface
    static interface d {
        public String process(String var1) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface a {
        public int modify(CommandContext<ed> var1, uz var2, ex.g var3, List<vz> var4) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface b {
        public ArgumentBuilder<ed, ?> create(a var1);
    }
}

