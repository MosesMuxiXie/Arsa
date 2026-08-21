/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Locale;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class aon {
    static final Logger a = LogUtils.getLogger();
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.debug.notRunning"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.debug.alreadyRunning"));
    static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.debug.function.noRecursion"));
    static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.debug.function.noReturnRun"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("debug").requires(ee.a(ee.e))).then(ee.b("start").executes($$0 -> aon.a((ed)$$0.getSource())))).then(ee.b("stop").executes($$0 -> aon.b((ed)$$0.getSource())))).then(((LiteralArgumentBuilder)ee.b("function").requires(ee.a(ee.e))).then(ee.a("name", go.a()).suggests(apd.b).executes((Command)new a()))));
    }

    private static int a(ed $$0) throws CommandSyntaxException {
        MinecraftServer $$1 = $$0.m();
        if ($$1.bi()) {
            throw c.create();
        }
        $$1.bj();
        $$0.a(() -> yh.c("commands.debug.started"), true);
        return 0;
    }

    private static int b(ed $$0) throws CommandSyntaxException {
        MinecraftServer $$1 = $$0.m();
        if (!$$1.bi()) {
            throw b.create();
        }
        bzk $$2 = $$1.bk();
        double $$3 = (double)$$2.g() / (double)bhn.a;
        double $$4 = (double)$$2.f() / $$3;
        $$0.a(() -> yh.a("commands.debug.stopped", new Object[]{String.format(Locale.ROOT, "%.2f", $$3), $$2.f(), String.format(Locale.ROOT, "%.2f", $$4)}), true);
        return (int)$$4;
    }

    static class a
    extends hd.b<ed>
    implements hd.a<ed> {
        a() {
        }

        @Override
        public void a(ed $$0, ContextChain<ed> $$1, hb $$2, hh<ed> $$3) throws CommandSyntaxException {
            if ($$2.c()) {
                throw e.create();
            }
            if ($$3.a() != null) {
                throw d.create();
            }
            CommandContext $$42 = $$1.getTopContext();
            Collection<ht<ed>> $$52 = go.a((CommandContext<ed>)$$42, "name");
            MinecraftServer $$6 = $$0.m();
            String $$7 = "debug-trace-" + bhs.f() + ".txt";
            CommandDispatcher<ed> $$8 = $$0.m().aC().a();
            int $$9 = 0;
            try {
                Path $$10 = $$6.c("debug");
                Files.createDirectories($$10, new FileAttribute[0]);
                final PrintWriter $$11 = new PrintWriter(Files.newBufferedWriter($$10.resolve($$7), StandardCharsets.UTF_8, new OpenOption[0]));
                b $$12 = new b($$11);
                $$3.a($$12);
                for (final ht<ed> $$13 : $$52) {
                    try {
                        ed $$14 = $$0.a($$12).b(bbh.c);
                        hv<ed> $$15 = $$13.a(null, $$8);
                        $$3.a(new hn<ed>(this, $$15, ea.a, false){

                            @Override
                            public void a(ed $$0, hg<ed> $$1, hi $$2) {
                                $$11.println($$13.a());
                                super.a($$0, $$1, $$2);
                            }

                            @Override
                            public /* synthetic */ void execute(Object object, hg hg2, hi hi2) {
                                this.a((ed)object, (hg<ed>)hg2, hi2);
                            }
                        }.bind($$14));
                        $$9 += $$15.b().size();
                    }
                    catch (eg $$16) {
                        $$0.b($$16.a());
                    }
                }
            }
            catch (IOException | UncheckedIOException $$17) {
                a.warn("Tracing failed", (Throwable)$$17);
                $$0.b(yh.c("commands.debug.function.traceFailed"));
            }
            int $$18 = $$9;
            $$3.a(($$4, $$5) -> {
                if ($$52.size() == 1) {
                    $$0.a(() -> yh.a("commands.debug.function.success.single", $$18, yh.a(((ht)$$52.iterator().next()).a()), $$7), true);
                } else {
                    $$0.a(() -> yh.a("commands.debug.function.success.multiple", $$18, $$52.size(), $$7), true);
                }
            });
        }

        @Override
        public /* synthetic */ void b(ef ef2, ContextChain contextChain, hb hb2, hh hh2) throws CommandSyntaxException {
            this.a((ed)ef2, (ContextChain<ed>)contextChain, hb2, (hh<ed>)hh2);
        }
    }

    static class b
    implements ec,
    hj {
        public static final int b = 1;
        private final PrintWriter c;
        private int d;
        private boolean e;

        b(PrintWriter $$0) {
            this.c = $$0;
        }

        private void a(int $$0) {
            this.b($$0);
            this.d = $$0;
        }

        private void b(int $$0) {
            for (int $$1 = 0; $$1 < $$0 + 1; ++$$1) {
                this.c.write("    ");
            }
        }

        private void e() {
            if (this.e) {
                this.c.println();
                this.e = false;
            }
        }

        @Override
        public void a(int $$0, String $$1) {
            this.e();
            this.a($$0);
            this.c.print("[C] ");
            this.c.print($$1);
            this.e = true;
        }

        @Override
        public void a(int $$0, String $$1, int $$2) {
            if (this.e) {
                this.c.print(" -> ");
                this.c.println($$2);
                this.e = false;
            } else {
                this.a($$0);
                this.c.print("[R = ");
                this.c.print($$2);
                this.c.print("] ");
                this.c.println($$1);
            }
        }

        @Override
        public void a(int $$0, amo $$1, int $$2) {
            this.e();
            this.a($$0);
            this.c.print("[F] ");
            this.c.print($$1);
            this.c.print(" size=");
            this.c.println($$2);
        }

        @Override
        public void a(String $$0) {
            this.e();
            this.a(this.d + 1);
            this.c.print("[E] ");
            this.c.print($$0);
        }

        @Override
        public void a(yh $$0) {
            this.e();
            this.b(this.d + 1);
            this.c.print("[M] ");
            this.c.println($$0.getString());
        }

        @Override
        public boolean x_() {
            return true;
        }

        @Override
        public boolean y_() {
            return true;
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public boolean o_() {
            return true;
        }

        @Override
        public void close() {
            IOUtils.closeQuietly((Writer)this.c);
        }
    }
}

