/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ilr
implements bat,
AutoCloseable {
    private static final Logger b = LogUtils.getLogger();
    public static final amo a = amo.b("");
    private final Map<amo, ikz> c = new HashMap<amo, ikz>();
    private final Set<ils> d = new HashSet<ils>();
    private final baz e;

    public ilr(baz $$0) {
        this.e = $$0;
        fyh $$1 = ilf.a();
        this.a(ilf.c(), new ilc(() -> "(intentionally-)Missing Texture", $$1));
    }

    public void a(amo $$0, ilh $$1) {
        try {
            $$1.a(this.b($$0, $$1));
        }
        catch (Throwable $$2) {
            m $$3 = m.a($$2, "Uploading texture");
            n $$4 = $$3.a("Uploaded texture");
            $$4.a("Resource location", $$1.d());
            $$4.a("Texture id", $$0);
            throw new v($$3);
        }
        this.a($$0, (ikz)$$1);
    }

    private ilq b(amo $$0, ilh $$1) {
        try {
            return ilr.a(this.e, $$0, $$1);
        }
        catch (Exception $$2) {
            b.error("Failed to load texture {} into slot {}", new Object[]{$$1.d(), $$0, $$2});
            return ilq.a();
        }
    }

    public void a(amo $$0) {
        this.a($$0, (ikz)new ili($$0));
    }

    public void a(amo $$0, ikz $$1) {
        ikz $$2 = this.c.put($$0, $$1);
        if ($$2 != $$1) {
            if ($$2 != null) {
                this.b($$0, $$2);
            }
            if ($$1 instanceof ils) {
                ils $$3 = (ils)((Object)$$1);
                this.d.add($$3);
            }
        }
    }

    private void b(amo $$0, ikz $$1) {
        this.d.remove($$1);
        try {
            $$1.close();
        }
        catch (Exception $$2) {
            b.warn("Failed to close texture {}", (Object)$$0, (Object)$$2);
        }
    }

    public ikz b(amo $$0) {
        ikz $$1 = this.c.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        ili $$2 = new ili($$0);
        this.a($$0, $$2);
        return $$2;
    }

    public void a() {
        for (ils $$0 : this.d) {
            $$0.e();
        }
    }

    public void c(amo $$0) {
        ikz $$1 = this.c.remove($$0);
        if ($$1 != null) {
            this.b($$0, $$1);
        }
    }

    @Override
    public void close() {
        this.c.forEach(this::b);
        this.c.clear();
        this.d.clear();
    }

    @Override
    public CompletableFuture<Void> reload(bat.b $$0, Executor $$12, bat.a $$2, Executor $$32) {
        baz $$42 = $$0.a();
        ArrayList $$5 = new ArrayList();
        this.c.forEach(($$3, $$4) -> {
            if ($$4 instanceof ilh) {
                ilh $$5 = (ilh)$$4;
                $$5.add(ilr.a($$42, $$3, $$5, $$12));
            }
        });
        return ((CompletableFuture)CompletableFuture.allOf((CompletableFuture[])$$5.stream().map(a::b).toArray(CompletableFuture[]::new)).thenCompose($$2::wait)).thenAcceptAsync($$1 -> {
            gcm.a(this.e);
            for (a $$2 : $$5) {
                $$2.a.a($$2.b.join());
            }
        }, $$32);
    }

    public void a(Path $$0) {
        try {
            Files.createDirectories($$0, new FileAttribute[0]);
        }
        catch (IOException $$12) {
            b.error("Failed to create directory {}", (Object)$$0, (Object)$$12);
            return;
        }
        this.c.forEach(($$1, $$2) -> {
            if ($$2 instanceof ilb) {
                ilb $$3 = (ilb)((Object)$$2);
                try {
                    $$3.a((amo)$$1, $$0);
                }
                catch (Exception $$4) {
                    b.error("Failed to dump texture {}", $$1, (Object)$$4);
                }
            }
        });
    }

    private static ilq a(baz $$0, amo $$1, ilh $$2) throws IOException {
        try {
            return $$2.a($$0);
        }
        catch (FileNotFoundException $$3) {
            if ($$1 != a) {
                b.warn("Missing resource {} referenced from {}", (Object)$$2.d(), (Object)$$1);
            }
            return ilq.a();
        }
    }

    private static a a(baz $$0, amo $$1, ilh $$2, Executor $$3) {
        return new a($$2, CompletableFuture.supplyAsync(() -> {
            try {
                return ilr.a($$0, $$1, $$2);
            }
            catch (IOException $$3) {
                throw new UncheckedIOException($$3);
            }
        }, $$3));
    }

    static final class a
    extends Record {
        final ilh a;
        final CompletableFuture<ilq> b;

        a(ilh $$0, CompletableFuture<ilq> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "texture;newContents", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "texture;newContents", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "texture;newContents", "a", "b"}, this, $$0);
        }

        public ilh a() {
            return this.a;
        }

        public CompletableFuture<ilq> b() {
            return this.b;
        }
    }
}

