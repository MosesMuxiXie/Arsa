/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gaf {
    private static final Logger a = LogUtils.getLogger();

    public static void a(gfj $$0, gsb $$1, gsb $$2, int $$3, gbg $$4, @Nullable gej $$5) {
        gxx.a($$0, () -> $$0.a($$1), (gxx $$62, jk<anc> $$7, fnm $$8, Path $$9) -> {
            void $$12;
            try {
                Path $$10 = gaf.a($$7, $$8, $$9);
            }
            catch (IOException $$11) {
                a.warn("Failed to create temporary world folder.");
                $$0.a(new gcs(yh.c("mco.create.world.failed"), $$2));
                return true;
            }
            gbn $$13 = gbn.a($$8.I(), w.b().c());
            gbk $$14 = new gbk($$3, $$13, List.of(gbj.a($$8.I().c())));
            gam $$15 = new gam((Path)$$12, $$14, $$0.ac(), $$3.b, gan.f());
            $$0.c(new gqv($$15::b, yh.c("mco.create.world.reset.title"), yh.i(), yg.e, false));
            if ($$5 != null) {
                $$5.run();
            }
            $$15.a().handleAsync(($$5, $$6) -> {
                if ($$6 != null) {
                    if ($$6 instanceof CompletionException) {
                        jk $$7 = (CompletionException)$$6;
                        $$6 = $$7.getCause();
                    }
                    if ($$6 instanceof gag) {
                        $$0.c($$2);
                    } else {
                        if ($$6 instanceof gai) {
                            gai $$8 = (gai)$$6;
                            a.warn("Failed to create realms world {}", (Object)$$8.a());
                        } else {
                            a.warn("Failed to create realms world {}", (Object)$$6.getMessage());
                        }
                        $$0.c(new gcs(yh.c("mco.create.world.failed"), $$2));
                    }
                } else {
                    if ($$1 instanceof gdi) {
                        gdi $$9 = (gdi)$$1;
                        $$9.a($$3.b);
                    }
                    if ($$5 != null) {
                        fzu.a($$4, $$1, true);
                    } else {
                        $$0.c($$1);
                    }
                    fzu.g();
                }
                return null;
            }, (Executor)$$0);
            return true;
        });
    }

    private static Path a(jk<anc> $$0, fnm $$1, @Nullable Path $$2) throws IOException {
        Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload", new FileAttribute[0]);
        if ($$2 != null) {
            Files.move($$2, $$3.resolve("datapacks"), new CopyOption[0]);
        }
        uz $$4 = $$1.a($$0.a(), null);
        uz $$5 = new uz();
        $$5.a("Data", $$4);
        Path $$6 = Files.createFile($$3.resolve("level.dat"), new FileAttribute[0]);
        vm.a($$5, $$6);
        return $$3;
    }
}

