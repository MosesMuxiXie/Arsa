/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class pe
implements mq {
    private static final Logger d = LogUtils.getLogger();
    private final Iterable<Path> e;
    private final ms f;

    public pe(ms $$0, Collection<Path> $$1) {
        this.e = $$1;
        this.f = $$0;
    }

    @Override
    public CompletableFuture<?> a(mo $$02) {
        Path $$1 = this.f.a();
        ArrayList<CompletionStage> $$2 = new ArrayList<CompletionStage>();
        for (Path $$3 : this.e) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
                CompletableFuture<Void> completableFuture;
                block8: {
                    Stream<Path> $$32 = Files.walk($$3, new FileVisitOption[0]);
                    try {
                        completableFuture = CompletableFuture.allOf((CompletableFuture[])$$32.filter($$0 -> $$0.toString().endsWith(".nbt")).map($$3 -> CompletableFuture.runAsync(() -> pe.a($$02, $$3, pe.a($$3, $$3), $$1), bhs.i())).toArray(CompletableFuture[]::new));
                        if ($$32 == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if ($$32 != null) {
                                try {
                                    $$32.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (IOException $$4) {
                            d.error("Failed to read structure input directory", (Throwable)$$4);
                            return CompletableFuture.completedFuture(null);
                        }
                    }
                    $$32.close();
                }
                return completableFuture;
            }, bhs.h().a("NbtToSnbt")).thenCompose($$0 -> $$0));
        }
        return CompletableFuture.allOf((CompletableFuture[])$$2.toArray(CompletableFuture[]::new));
    }

    @Override
    public final String a() {
        return "NBT -> SNBT";
    }

    private static String a(Path $$0, Path $$1) {
        String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
        return $$2.substring(0, $$2.length() - ".nbt".length());
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static @Nullable Path a(mo $$0, Path $$1, String $$2, Path $$3) {
        try (InputStream $$4 = Files.newInputStream($$1, new OpenOption[0]);){
            Path path;
            try (bfn $$5 = new bfn($$4);){
                Path $$6 = $$3.resolve($$2 + ".snbt");
                pe.a($$0, $$6, vo.a(vm.a($$5, vi.c())));
                d.info("Converted {} from NBT to SNBT", (Object)$$2);
                path = $$6;
            }
            return path;
        }
        catch (IOException $$7) {
            d.error("Couldn't convert {} from NBT to SNBT at {}", new Object[]{$$2, $$1, $$7});
            return null;
        }
    }

    public static void a(mo $$0, Path $$1, String $$2) throws IOException {
        ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
        HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), (OutputStream)$$3);
        $$4.write($$2.getBytes(StandardCharsets.UTF_8));
        $$4.write(10);
        $$0.writeIfNeeded($$1, $$3.toByteArray(), $$4.hash());
    }
}

