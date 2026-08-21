/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class baj<T> {
    private final ftc a;

    protected baj(ftc $$0) {
        this.a = $$0;
    }

    public @Nullable T a(Path $$0, List<ftd> $$1) throws IOException {
        BasicFileAttributes $$5;
        Path $$2 = $$0;
        try {
            BasicFileAttributes $$3 = Files.readAttributes($$0, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        catch (NoSuchFileException $$4) {
            return null;
        }
        if ($$5.isSymbolicLink()) {
            this.a.a($$0, $$1);
            if (!$$1.isEmpty()) {
                return null;
            }
            $$2 = Files.readSymbolicLink($$0);
            $$5 = Files.readAttributes($$2, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        if ($$5.isDirectory()) {
            this.a.b($$2, $$1);
            if (!$$1.isEmpty()) {
                return null;
            }
            if (!Files.isRegularFile($$2.resolve("pack.mcmeta"), new LinkOption[0])) {
                return null;
            }
            return this.c($$2);
        }
        if ($$5.isRegularFile() && $$2.getFileName().toString().endsWith(".zip")) {
            return this.d($$2);
        }
        return null;
    }

    protected abstract @Nullable T d(Path var1) throws IOException;

    protected abstract @Nullable T c(Path var1) throws IOException;
}

