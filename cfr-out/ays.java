/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ays
implements axv {
    public static final axv.a a = new axv.a("server_resource_pack");
    private final MinecraftServer.b b;

    public ays(MinecraftServer.b $$0) {
        this.b = $$0;
    }

    @Override
    public void a(Consumer<aay<?>> $$0) {
        $$0.accept(new abo(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
    }

    @Override
    public axv.a b() {
        return a;
    }
}

