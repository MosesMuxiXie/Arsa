/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public class ew
implements fm<a> {
    private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
    static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.message.too_long", $$0, $$1));

    public static ew a() {
        return new ew();
    }

    public static yh a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        a $$2 = (a)$$0.getArgument($$1, a.class);
        return $$2.a((ed)$$0.getSource());
    }

    public static void a(CommandContext<ed> $$0, String $$1, Consumer<yy> $$2) throws CommandSyntaxException {
        a $$3 = (a)$$0.getArgument($$1, a.class);
        ed $$4 = (ed)$$0.getSource();
        yh $$5 = $$3.a($$4);
        eb $$6 = $$4.o();
        yy $$7 = $$6.a($$1);
        if ($$7 != null) {
            ew.a($$2, $$4, $$7.a($$5));
        } else {
            ew.b($$2, $$4, yy.a($$3.a).a($$5));
        }
    }

    private static void a(Consumer<yy> $$0, ed $$1, yy $$2) {
        MinecraftServer $$32 = $$1.m();
        CompletableFuture<axy> $$4 = ew.a($$1, $$2);
        yh $$5 = $$32.bm().decorate($$1.j(), $$2.d());
        $$1.p().append($$4, $$3 -> {
            yy $$4 = $$2.a($$5).a($$3.e());
            $$0.accept($$4);
        });
    }

    private static void b(Consumer<yy> $$0, ed $$1, yy $$2) {
        yc $$3 = $$1.m().bm();
        yh $$4 = $$3.decorate($$1.j(), $$2.d());
        $$0.accept($$2.a($$4));
    }

    private static CompletableFuture<axy> a(ed $$0, yy $$1) {
        axg $$2 = $$0.j();
        if ($$2 != null && $$1.a($$2.cY())) {
            return $$2.Y().a($$1.c());
        }
        return CompletableFuture.completedFuture(axy.a($$1.c()));
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        return ew$a.a($$0, true);
    }

    public <S> a a(StringReader $$0, @Nullable S $$1) throws CommandSyntaxException {
        return ew$a.a($$0, gw.a($$1));
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader, @Nullable Object object) throws CommandSyntaxException {
        return this.a(stringReader, object);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static final class a
    extends Record {
        final String a;
        private final b[] b;

        public a(String $$0, b[] $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        yh a(ed $$0) throws CommandSyntaxException {
            return this.a($$0, $$0.d().hasPermission(bbr.e));
        }

        public yh a(ed $$0, boolean $$1) throws CommandSyntaxException {
            if (this.b.length == 0 || !$$1) {
                return yh.b(this.a);
            }
            yw $$2 = yh.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();
            for (b $$4 : this.b) {
                yh $$5 = $$4.a($$0);
                if ($$3 < $$4.a()) {
                    $$2.f(this.a.substring($$3, $$4.a()));
                }
                $$2.b($$5);
                $$3 = $$4.b();
            }
            if ($$3 < this.a.length()) {
                $$2.f(this.a.substring($$3));
            }
            return $$2;
        }

        /*
         * WARNING - void declaration
         */
        public static a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
            if ($$0.getRemainingLength() > 256) {
                throw b.create((Object)$$0.getRemainingLength(), (Object)256);
            }
            String $$2 = $$0.getRemaining();
            if (!$$1) {
                $$0.setCursor($$0.getTotalLength());
                return new a($$2, new b[0]);
            }
            ArrayList $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();
            while ($$0.canRead()) {
                if ($$0.peek() == '@') {
                    void $$9;
                    int $$5 = $$0.getCursor();
                    try {
                        gw $$6 = new gw($$0, true);
                        gv $$7 = $$6.t();
                    }
                    catch (CommandSyntaxException $$8) {
                        if ($$8.getType() == gw.h || $$8.getType() == gw.f) {
                            $$0.setCursor($$5 + 1);
                            continue;
                        }
                        throw $$8;
                    }
                    $$3.add(new b($$5 - $$4, $$0.getCursor() - $$4, (gv)$$9));
                    continue;
                }
                $$0.skip();
            }
            return new a($$2, $$3.toArray(new b[0]));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "text;parts", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "text;parts", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "text;parts", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public b[] b() {
            return this.b;
        }
    }

    public record b(int a, int b, gv c) {
        public yh a(ed $$0) throws CommandSyntaxException {
            return gv.a(this.c.b($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "start;end;selector", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "start;end;selector", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "start;end;selector", "a", "b", "c"}, this, $$0);
        }
    }
}

