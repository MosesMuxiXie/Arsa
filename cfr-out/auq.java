/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import net.minecraft.server.MinecraftServer;

public class auq
implements aup {
    private final MinecraftServer a;
    private final atw b;

    public auq(MinecraftServer $$0, atw $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(bch $$0, avh $$1) {
        this.b.a($$1, "Add player '{}' to banlist. Reason: '{}'", $$0.f(), $$0.e().getString());
        this.a.aj().f().a($$0);
    }

    @Override
    public void a(bbx $$0, avh $$1) {
        this.b.a($$1, "Remove player '{}' from banlist", $$0);
        this.a.aj().f().c($$0);
    }

    @Override
    public void b(avh $$0) {
        this.a.aj().f().a();
    }

    @Override
    public Collection<bch> a() {
        return this.a.aj().f().e();
    }

    @Override
    public Collection<bbw> b() {
        return this.a.aj().g().e();
    }

    @Override
    public void a(bbw $$0, avh $$1) {
        this.b.a($$1, "Add ip '{}' to ban list", $$0.h());
        this.a.aj().g().a($$0);
    }

    @Override
    public void a(avh $$0) {
        this.b.a($$0, "Clear ip ban list", new Object[0]);
        this.a.aj().g().a();
    }

    @Override
    public void a(String $$0, avh $$1) {
        this.b.a($$1, "Remove ip '{}' from ban list", $$0);
        this.a.aj().g().b($$0);
    }
}

