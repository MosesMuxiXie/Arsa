/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.function.Consumer;

public class ark {
    private static final yh a = yh.c("commands.version.header");
    private static final yh b = yh.c("commands.version.stable.yes");
    private static final yh c = yh.c("commands.version.stable.no");

    public static void a(CommandDispatcher<ed> $$02, boolean $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("version").requires(ee.a($$1 ? ee.d : ee.b))).executes($$0 -> {
            ed $$1 = (ed)$$0.getSource();
            $$1.a(a);
            ark.a($$1::a);
            return 1;
        }));
    }

    public static void a(Consumer<yh> $$0) {
        aa $$1 = w.b();
        $$0.accept(yh.a("commands.version.id", new Object[]{$$1.b()}));
        $$0.accept(yh.a("commands.version.name", new Object[]{$$1.c()}));
        $$0.accept(yh.a("commands.version.data", $$1.a().b()));
        $$0.accept(yh.a("commands.version.series", new Object[]{$$1.a().c()}));
        $$0.accept(yh.a("commands.version.protocol", $$1.d(), "0x" + Integer.toHexString($$1.d())));
        $$0.accept(yh.a("commands.version.build_time", yh.a($$1.e())));
        $$0.accept(yh.a("commands.version.pack.resource", new Object[]{$$1.a(azn.a).toString()}));
        $$0.accept(yh.a("commands.version.pack.data", new Object[]{$$1.a(azn.b).toString()}));
        $$0.accept($$1.f() ? b : c);
    }
}

