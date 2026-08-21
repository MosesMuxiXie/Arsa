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
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class baf
implements bam {
    static final Logger a = LogUtils.getLogger();
    private static final azm b = new azm(false, bah.b.a, false);
    private final Path c;
    private final azn d;
    private final bal e;
    private final ftc f;

    public baf(Path $$0, azn $$1, bal $$2, ftc $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    private static String a(Path $$0) {
        return $$0.getFileName().toString();
    }

    @Override
    public void loadPacks(Consumer<bah> $$0) {
        try {
            bfp.c(this.c);
            baf.a(this.c, this.f, ($$1, $$2) -> {
                azk $$3 = this.b((Path)$$1);
                bah $$4 = bah.a($$3, $$2, this.d, b);
                if ($$4 != null) {
                    $$0.accept($$4);
                }
            });
        }
        catch (IOException $$12) {
            a.warn("Failed to list packs in {}", (Object)this.c, (Object)$$12);
        }
    }

    private azk b(Path $$0) {
        String $$1 = baf.a($$0);
        return new azk("file/" + $$1, yh.b($$1), this.e, Optional.empty());
    }

    public static void a(Path $$0, ftc $$1, BiConsumer<Path, bah.c> $$2) throws IOException {
        a $$3 = new a($$1);
        try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0);){
            for (Path $$5 : $$4) {
                try {
                    ArrayList<ftd> $$6 = new ArrayList<ftd>();
                    bah.c $$7 = (bah.c)$$3.a($$5, $$6);
                    if (!$$6.isEmpty()) {
                        a.warn("Ignoring potential pack entry: {}", (Object)ftb.a($$5, $$6));
                        continue;
                    }
                    if ($$7 != null) {
                        $$2.accept($$5, $$7);
                        continue;
                    }
                    a.info("Found non-pack entry '{}', ignoring", (Object)$$5);
                }
                catch (IOException $$8) {
                    a.warn("Failed to read properties of '{}', ignoring", (Object)$$5, (Object)$$8);
                }
            }
        }
    }

    static class a
    extends baj<bah.c> {
        protected a(ftc $$0) {
            super($$0);
        }

        protected @Nullable bah.c a(Path $$0) {
            FileSystem $$1 = $$0.getFileSystem();
            if ($$1 == FileSystems.getDefault() || $$1 instanceof azv) {
                return new azi.a($$0);
            }
            a.info("Can't open pack archive at {}", (Object)$$0);
            return null;
        }

        protected bah.c b(Path $$0) {
            return new azo.a($$0);
        }

        @Override
        protected /* synthetic */ Object c(Path path) throws IOException {
            return this.b(path);
        }

        @Override
        protected /* synthetic */ @Nullable Object d(Path path) throws IOException {
            return this.a(path);
        }
    }
}

