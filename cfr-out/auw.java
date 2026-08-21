/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class auw
implements auv {
    private final MinecraftServer a;
    private final atw b;

    public auw(MinecraftServer $$0, atw $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public Collection<bcc> a() {
        return this.a.aj().k().e();
    }

    @Override
    public void a(bbx $$0, Optional<bbl> $$1, Optional<Boolean> $$2, avh $$3) {
        this.b.a($$3, "Op '{}'", $$0);
        this.a.aj().a($$0, $$1.map(bbh::a), $$2);
    }

    @Override
    public void a(bbx $$0, avh $$1) {
        this.b.a($$1, "Op '{}'", $$0);
        this.a.aj().d($$0);
    }

    @Override
    public void b(bbx $$0, avh $$1) {
        this.b.a($$1, "Deop '{}'", $$0);
        this.a.aj().e($$0);
    }

    @Override
    public void a(avh $$0) {
        this.b.a($$0, "Clear operator list", new Object[0]);
        this.a.aj().k().a();
    }
}

