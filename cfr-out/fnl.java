/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.time.ZonedDateTime;
import java.util.Optional;
import org.slf4j.Logger;

public class fnl {
    private static final Logger b = LogUtils.getLogger();
    private final File c;
    protected final DataFixer a;

    public fnl(fni.c $$0, DataFixer $$1) {
        this.a = $$1;
        this.c = $$0.a(fng.c).toFile();
        this.c.mkdirs();
    }

    public void a(ddm $$0) {
        try (bgp.j $$1 = new bgp.j($$0.es(), b);){
            fnp $$2 = fnp.a($$1, $$0.eo());
            $$0.d($$2);
            Path $$3 = this.c.toPath();
            Path $$4 = Files.createTempFile($$3, $$0.cZ() + "-", ".dat", new FileAttribute[0]);
            uz $$5 = $$2.b();
            vm.a($$5, $$4);
            Path $$6 = $$3.resolve($$0.cZ() + ".dat");
            Path $$7 = $$3.resolve($$0.cZ() + ".dat_old");
            bhs.a($$6, $$4, $$7);
        }
        catch (Exception $$8) {
            b.warn("Failed to save player data for {}", (Object)$$0.aq());
        }
    }

    private void a(bbx $$0, String $$1) {
        Path $$2 = this.c.toPath();
        String $$3 = $$0.a().toString();
        Path $$4 = $$2.resolve($$3 + $$1);
        Path $$5 = $$2.resolve($$3 + "_corrupted_" + ZonedDateTime.now().format(fnd.a) + $$1);
        if (!Files.isRegularFile($$4, new LinkOption[0])) {
            return;
        }
        try {
            Files.copy($$4, $$5, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        }
        catch (Exception $$6) {
            b.warn("Failed to copy the player.dat file for {}", (Object)$$0.b(), (Object)$$6);
        }
    }

    private Optional<uz> b(bbx $$0, String $$1) {
        File $$2 = new File(this.c, String.valueOf($$0.a()) + $$1);
        if ($$2.exists() && $$2.isFile()) {
            try {
                return Optional.of(vm.a($$2.toPath(), vi.c()));
            }
            catch (Exception $$3) {
                b.warn("Failed to load player data for {}", (Object)$$0.b());
            }
        }
        return Optional.empty();
    }

    public Optional<uz> a(bbx $$02) {
        Optional<uz> $$1 = this.b($$02, ".dat");
        if ($$1.isEmpty()) {
            this.a($$02, ".dat");
        }
        return $$1.or(() -> this.b($$02, ".dat_old")).map($$0 -> {
            int $$1 = vo.f($$0);
            $$0 = bhz.c.a(this.a, (uz)$$0, $$1);
            return $$0;
        });
    }
}

