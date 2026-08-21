/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class img
extends bae {
    private static final baa e = new baa(yh.c("resourcePack.vanilla.description"), w.b().a(azn.a).a());
    private static final azd f = azd.a(baa.a, e);
    public static final String d = "high_contrast";
    private static final Map<String, yh> g = Map.of("programmer_art", yh.c("resourcePack.programmer_art.name"), "high_contrast", yh.c("resourcePack.high_contrast.name"));
    private static final azk h = new azk("vanilla", yh.c("resourcePack.vanilla.name"), bal.c, Optional.of(c));
    private static final azm i = new azm(true, bah.b.b, false);
    private static final azm j = new azm(false, bah.b.a, false);
    private static final amo k = amo.b("resourcepacks");
    private final @Nullable Path l;

    public img(Path $$0, ftc $$1) {
        super(azn.a, img.b($$0), k, $$1);
        this.l = this.a($$0);
    }

    private static azk a(String $$0, yh $$1) {
        return new azk($$0, $$1, bal.c, Optional.of(bag.a($$0)));
    }

    private @Nullable Path a(Path $$0) {
        Path $$1;
        if (w.aX && $$0.getFileSystem() == FileSystems.getDefault() && Files.isDirectory($$1 = $$0.getParent().resolve("resourcepacks"), new LinkOption[0])) {
            return $$1;
        }
        return null;
    }

    private static azp b(Path $$0) {
        azq $$1 = new azq().a(f).a("minecraft", "realms");
        return $$1.b().a().a(azn.a, $$0).a(h);
    }

    @Override
    protected yh a(String $$0) {
        yh $$1 = g.get($$0);
        return $$1 != null ? $$1 : yh.b($$0);
    }

    @Override
    protected @Nullable bah a(azl $$0) {
        return bah.a(h, img.b($$0), azn.a, i);
    }

    @Override
    protected @Nullable bah a(String $$0, bah.c $$1, yh $$2) {
        return bah.a(img.a($$0, $$2), $$1, azn.a, j);
    }

    @Override
    protected void a(BiConsumer<String, Function<String, bah>> $$0) {
        super.a($$0);
        if (this.l != null) {
            this.a(this.l, $$0);
        }
    }
}

