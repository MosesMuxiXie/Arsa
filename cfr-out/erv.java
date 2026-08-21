/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  org.apache.commons.io.FileUtils
 */
import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.apache.commons.io.FileUtils;

public class erv
extends esd {
    private final ert a;
    private final Path b;

    public erv(esa $$0, Path $$1, esa $$2, Path $$3, DataFixer $$4, boolean $$5, bhz $$6, Supplier<eru> $$7) {
        super($$0, $$1, $$4, $$5, $$6, $$7);
        this.b = $$3;
        this.a = new ert($$2, $$3, $$5);
    }

    @Override
    public CompletableFuture<Void> a(dvu $$0, Supplier<uz> $$1) {
        this.e($$0);
        return this.a.a($$0, $$1);
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.a.close();
        if (this.b.toFile().exists()) {
            FileUtils.deleteDirectory((File)this.b.toFile());
        }
    }
}

