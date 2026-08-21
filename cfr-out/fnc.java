/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Iterables;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fnc
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private final Map<fmo<?>, Optional<fmn>> b = new HashMap();
    private final DataFixer c;
    private final jf.a d;
    private final Path e;
    private CompletableFuture<?> f = CompletableFuture.completedFuture(null);

    public fnc(Path $$0, DataFixer $$1, jf.a $$2) {
        this.c = $$1;
        this.e = $$0;
        this.d = $$2;
    }

    private Path a(String $$0) {
        return this.e.resolve($$0 + ".dat");
    }

    public <T extends fmn> T a(fmo<T> $$0) {
        T $$1 = this.b($$0);
        if ($$1 != null) {
            return $$1;
        }
        fmn $$2 = (fmn)$$0.b().get();
        this.a($$0, $$2);
        return (T)$$2;
    }

    public <T extends fmn> @Nullable T b(fmo<T> $$0) {
        Optional<fmn> $$1 = this.b.get($$0);
        if ($$1 == null) {
            $$1 = Optional.ofNullable(this.c($$0));
            this.b.put($$0, $$1);
        }
        return (T)((fmn)$$1.orElse(null));
    }

    private <T extends fmn> @Nullable T c(fmo<T> $$0) {
        try {
            Path $$12 = this.a($$0.a());
            if (Files.exists($$12, new LinkOption[0])) {
                uz $$2 = this.a($$0.a(), $$0.d(), w.b().a().b());
                ams<vz> $$3 = this.d.a(vn.a);
                return (T)((fmn)$$0.c().parse($$3, (Object)$$2.a("data")).resultOrPartial($$1 -> a.error("Failed to parse saved data for '{}': {}", (Object)$$0, $$1)).orElse(null));
            }
        }
        catch (Exception $$4) {
            a.error("Error loading saved data: {}", $$0, (Object)$$4);
        }
        return null;
    }

    public <T extends fmn> void a(fmo<T> $$0, T $$1) {
        this.b.put($$0, Optional.of($$1));
        $$1.u();
    }

    /*
     * WARNING - void declaration
     */
    public uz a(String $$0, bhz $$1, int $$2) throws IOException {
        try (InputStream $$3 = Files.newInputStream(this.a($$0), new OpenOption[0]);){
            uz uz2;
            try (PushbackInputStream $$4 = new PushbackInputStream(new bfn($$3), 2);){
                void $$8;
                if (this.a($$4)) {
                    uz $$5 = vm.a($$4, vi.c());
                } else {
                    try (DataInputStream $$6 = new DataInputStream($$4);){
                        uz $$7 = vm.a($$6);
                    }
                }
                int $$9 = vo.b((uz)$$8, 1343);
                uz2 = $$1.a(this.c, (uz)$$8, $$9, $$2);
            }
            return uz2;
        }
    }

    private boolean a(PushbackInputStream $$0) throws IOException {
        int $$4;
        byte[] $$1 = new byte[2];
        boolean $$2 = false;
        int $$3 = $$0.read($$1, 0, 2);
        if ($$3 == 2 && ($$4 = ($$1[1] & 0xFF) << 8 | $$1[0] & 0xFF) == 35615) {
            $$2 = true;
        }
        if ($$3 != 0) {
            $$0.unread($$1, 0, $$3);
        }
        return $$2;
    }

    public CompletableFuture<?> a() {
        Map<fmo<?>, uz> $$0 = this.c();
        if ($$0.isEmpty()) {
            return CompletableFuture.completedFuture(null);
        }
        int $$12 = bhs.g();
        int $$2 = $$0.size();
        this.f = $$2 > $$12 ? this.f.thenCompose($$3 -> {
            ArrayList<CompletableFuture<Void>> $$4 = new ArrayList<CompletableFuture<Void>>($$12);
            int $$5 = bgj.f($$2, $$12);
            for (List $$6 : Iterables.partition($$0.entrySet(), (int)$$5)) {
                $$4.add(CompletableFuture.runAsync(() -> {
                    for (Map.Entry $$1 : $$6) {
                        this.a((fmo)$$1.getKey(), (uz)$$1.getValue());
                    }
                }, bhs.i()));
            }
            return CompletableFuture.allOf((CompletableFuture[])$$4.toArray(CompletableFuture[]::new));
        }) : this.f.thenCompose($$1 -> CompletableFuture.allOf((CompletableFuture[])$$0.entrySet().stream().map($$0 -> CompletableFuture.runAsync(() -> this.a((fmo)$$0.getKey(), (uz)$$0.getValue()), bhs.i())).toArray(CompletableFuture[]::new)));
        return this.f;
    }

    private Map<fmo<?>, uz> c() {
        Object2ObjectArrayMap $$0 = new Object2ObjectArrayMap();
        ams<vz> $$1 = this.d.a(vn.a);
        this.b.forEach((arg_0, arg_1) -> this.a((Map)$$0, $$1, arg_0, arg_1));
        return $$0;
    }

    private <T extends fmn> uz a(fmo<T> $$0, fmn $$1, ams<vz> $$2) {
        Codec<T> $$3 = $$0.c();
        uz $$4 = new uz();
        $$4.a("data", (vz)$$3.encodeStart($$2, (Object)$$1).getOrThrow());
        vo.e($$4);
        return $$4;
    }

    private void a(fmo<?> $$0, uz $$1) {
        Path $$2 = this.a($$0.a());
        try {
            vm.a($$1, $$2);
        }
        catch (IOException $$3) {
            a.error("Could not save data to {}", (Object)$$2.getFileName(), (Object)$$3);
        }
    }

    public void b() {
        this.a().join();
    }

    @Override
    public void close() {
        this.b();
    }

    private /* synthetic */ void a(Map $$0, ams $$1, fmo $$2, Optional $$32) {
        $$32.filter(fmn::O_).ifPresent($$3 -> {
            $$0.put($$2, this.a($$2, (fmn)$$3, $$1));
            $$3.a(false);
        });
    }
}

