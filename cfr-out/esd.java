/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class esd
implements AutoCloseable {
    private final ert a;
    private final DataFixer b;
    private final bhz c;
    private final Supplier<eru> d;

    public esd(esa $$0, Path $$1, DataFixer $$2, boolean $$3, bhz $$4) {
        this($$0, $$1, $$2, $$3, $$4, eru.a);
    }

    public esd(esa $$0, Path $$1, DataFixer $$2, boolean $$3, bhz $$4, Supplier<eru> $$5) {
        this.b = $$2;
        this.c = $$4;
        this.a = new ert($$0, $$1, $$3);
        this.d = Suppliers.memoize($$5::get);
    }

    public boolean b(dvu $$0, int $$1) {
        return this.a.a($$0, $$1);
    }

    public CompletableFuture<Optional<uz>> d(dvu $$0) {
        return this.a.a($$0);
    }

    public CompletableFuture<Void> a(dvu $$0, uz $$1) {
        return this.a($$0, () -> $$1);
    }

    public CompletableFuture<Void> a(dvu $$0, Supplier<uz> $$1) {
        this.e($$0);
        return this.a.a($$0, $$1);
    }

    public uz a(uz $$0, int $$1, @Nullable uz $$2) {
        int $$3 = vo.b($$0, $$1);
        if ($$3 == w.b().a().b()) {
            return $$0;
        }
        try {
            $$0 = this.d.get().applyFix($$0);
            esd.a($$0, $$2);
            $$0 = this.c.a(this.b, $$0, Math.max(this.d.get().targetDataVersion(), $$3));
            esd.a($$0);
            vo.e($$0);
            return $$0;
        }
        catch (Exception $$4) {
            m $$5 = m.a($$4, "Updated chunk");
            n $$6 = $$5.a("Updated chunk details");
            $$6.a("Data version", $$3);
            throw new v($$5);
        }
    }

    public uz a(uz $$0, int $$1) {
        return this.a($$0, $$1, null);
    }

    public Dynamic<vz> a(Dynamic<vz> $$0, int $$1) {
        return new Dynamic($$0.getOps(), (Object)this.a((uz)$$0.getValue(), $$1, null));
    }

    public static void a(uz $$0, @Nullable uz $$1) {
        if ($$1 != null) {
            $$0.a("__context", $$1);
        }
    }

    private static void a(uz $$0) {
        $$0.r("__context");
    }

    protected void e(dvu $$0) {
        this.d.get().markChunkDone($$0);
    }

    public CompletableFuture<Void> b(boolean $$0) {
        return this.a.a($$0);
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    public err m() {
        return this.a;
    }

    public esa n() {
        return this.a.a();
    }
}

