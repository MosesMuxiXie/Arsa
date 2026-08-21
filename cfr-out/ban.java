/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ban
extends bae {
    private static final baa d = new baa(yh.c("dataPack.vanilla.description"), w.b().a(azn.b).a());
    private static final azh e = new azh(dhb.h);
    private static final azd f = azd.a(baa.b, d, azh.a, e);
    private static final azk g = new azk("vanilla", yh.c("dataPack.vanilla.name"), bal.c, Optional.of(c));
    private static final azm h = new azm(false, bah.b.b, false);
    private static final azm i = new azm(false, bah.b.a, false);
    private static final amo j = amo.b("datapacks");

    public ban(ftc $$0) {
        super(azn.b, ban.b(), j, $$0);
    }

    private static azk a(String $$0, yh $$1) {
        return new azk($$0, $$1, bal.d, Optional.of(bag.a($$0)));
    }

    @VisibleForTesting
    public static azp b() {
        return new azq().a(f).a("minecraft").b().a().a(g);
    }

    @Override
    protected yh a(String $$0) {
        return yh.b($$0);
    }

    @Override
    protected @Nullable bah a(azl $$0) {
        return bah.a(g, ban.b($$0), azn.b, h);
    }

    @Override
    protected @Nullable bah a(String $$0, bah.c $$1, yh $$2) {
        return bah.a(ban.a($$0, $$2), $$1, azn.b, i);
    }

    public static bak a(Path $$0, ftc $$1) {
        return new bak(new ban($$1), new baf($$0, azn.b, bal.e, $$1));
    }

    public static bak c() {
        return new bak(new ban(new ftc($$0 -> true)));
    }

    public static bak a(fni.c $$0) {
        return ban.a($$0.a(fng.j), $$0.d().e());
    }
}

