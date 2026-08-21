/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.hash.Hashing
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gwo
extends gsb {
    static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("pack.available.title");
    private static final yh c = yh.c("pack.selected.title");
    private static final yh d = yh.c("pack.openFolder");
    private static final yh e = yh.c("gui.packSelection.search").c(gjn.e);
    private static final int f = 200;
    private static final int t = 4;
    private static final int u = 15;
    private static final yh v = yh.c("pack.dropInfo").a(l.h);
    private static final yh w = yh.c("pack.folderInfo");
    private static final int x = 20;
    private static final amo y = amo.b("textures/misc/unknown_pack.png");
    private final gou z = new gou(this);
    private final gwn A;
    private @Nullable a B;
    private long C;
    private @Nullable gwp D;
    private @Nullable gwp E;
    private @Nullable gjn F;
    private final Path G;
    private @Nullable gje H;
    private final Map<String, amo> I = Maps.newHashMap();

    public gwo(bak $$0, Consumer<bak> $$1, Path $$2, yh $$3) {
        super($$3);
        this.A = new gwn(this::a, this::a, $$0, $$1);
        this.G = $$2;
        this.B = gwo$a.a($$2);
    }

    @Override
    public void aX_() {
        this.A.c();
        this.o();
    }

    private void o() {
        if (this.B != null) {
            try {
                this.B.close();
                this.B = null;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    protected void bg_() {
        this.z.b(4 + this.q.b + 4 + this.q.b + 4 + 15 + 4);
        goy $$02 = this.z.a(goy.d().a(4));
        $$02.c().b();
        $$02.a(new gko(this.q(), this.q));
        $$02.a(new gko(v, this.q));
        this.F = $$02.a(new gjn(this.q, 0, 0, 200, 15, yh.i()));
        this.F.c(e);
        this.F.b(this::a);
        this.D = this.z.c(new gwp(this.n, this, 200, this.p - 66, b));
        this.E = this.z.c(new gwp(this.n, this, 200, this.p - 66, c));
        goy $$12 = this.z.b(goy.e().a(8));
        $$12.a(gje.a(d, (gje $$0) -> bhs.n().a(this.G)).a(gks.a(w)).a());
        this.H = $$12.a(gje.a(yg.d, (gje $$0) -> this.aX_()).a());
        this.z.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
        this.p();
    }

    @Override
    protected void aI_() {
        if (this.F != null) {
            this.b(this.F);
        } else {
            super.aI_();
        }
    }

    private void a(String $$0) {
        this.a($$0, this.A.b(), this.E);
        this.a($$0, this.A.a(), this.D);
    }

    private void a(String $$0, Stream<gwn.a> $$1, @Nullable gwp $$22) {
        if ($$22 == null) {
            return;
        }
        String $$3 = $$0.toLowerCase(Locale.ROOT);
        Stream<gwn.a> $$4 = $$1.filter($$2 -> $$0.isBlank() || $$2.c().toLowerCase(Locale.ROOT).contains($$3) || $$2.d().getString().toLowerCase(Locale.ROOT).contains($$3) || $$2.e().getString().toLowerCase(Locale.ROOT).contains($$3));
        $$22.a($$4, null);
    }

    @Override
    protected void c() {
        this.z.a();
        if (this.D != null) {
            this.D.a(200, this.z.d(), this.o / 2 - 15 - 200, this.z.c());
        }
        if (this.E != null) {
            this.E.a(200, this.z.d(), this.o / 2 + 15, this.z.c());
        }
    }

    @Override
    public void e() {
        if (this.B != null) {
            try {
                if (this.B.a()) {
                    this.C = 20L;
                }
            }
            catch (IOException $$0) {
                a.warn("Failed to poll for directory {} changes, stopping", (Object)this.G);
                this.o();
            }
        }
        if (this.C > 0L && --this.C == 0L) {
            this.p();
        }
    }

    private void a(@Nullable gwn.b $$0) {
        if (this.E != null) {
            this.E.a(this.A.b(), $$0);
        }
        if (this.D != null) {
            this.D.a(this.A.a(), $$0);
        }
        if (this.F != null) {
            this.a(this.F.a());
        }
        if (this.H != null) {
            this.H.k = !this.E.aJ_().isEmpty();
        }
    }

    private void p() {
        this.A.d();
        this.a((gwn.b)null);
        this.C = 0L;
        this.I.clear();
    }

    protected static void a(gfj $$0, List<Path> $$1, Path $$22) {
        MutableBoolean $$3 = new MutableBoolean();
        $$1.forEach($$2 -> {
            try (Stream<Path> $$32 = Files.walk($$2, new FileVisitOption[0]);){
                $$32.forEach($$3 -> {
                    try {
                        bhs.b($$2.getParent(), $$22, $$3);
                    }
                    catch (IOException $$4) {
                        a.warn("Failed to copy datapack file  from {} to {}", new Object[]{$$3, $$22, $$4});
                        $$3.setTrue();
                    }
                });
            }
            catch (IOException $$4) {
                a.warn("Failed to copy datapack file from {} to {}", $$2, (Object)$$22);
                $$3.setTrue();
            }
        });
        if ($$3.isTrue()) {
            gna.c($$0, $$22.toString());
        }
    }

    @Override
    public void a(List<Path> $$0) {
        String $$12 = gwo.a($$0).collect(Collectors.joining(", "));
        this.n.a(new gra($$1 -> {
            if ($$1) {
                ArrayList<Path> $$2 = new ArrayList<Path>($$0.size());
                HashSet<Path> $$3 = new HashSet<Path>($$0);
                baj<Path> $$4 = new baj<Path>(this, this.n.bf()){

                    protected Path a(Path $$0) {
                        return $$0;
                    }

                    protected Path b(Path $$0) {
                        return $$0;
                    }

                    @Override
                    protected /* synthetic */ Object c(Path path) throws IOException {
                        return this.b(path);
                    }

                    @Override
                    protected /* synthetic */ Object d(Path path) throws IOException {
                        return this.a(path);
                    }
                };
                ArrayList<ftd> $$5 = new ArrayList<ftd>();
                for (Path $$6 : $$0) {
                    try {
                        Path $$7 = (Path)$$4.a($$6, $$5);
                        if ($$7 == null) {
                            a.warn("Path {} does not seem like pack", (Object)$$6);
                            continue;
                        }
                        $$2.add($$7);
                        $$3.remove($$7);
                    }
                    catch (IOException $$8) {
                        a.warn("Failed to check {} for packs", (Object)$$6, (Object)$$8);
                    }
                }
                if (!$$5.isEmpty()) {
                    this.n.a(gru.b(() -> this.n.a(this)));
                    return;
                }
                if (!$$2.isEmpty()) {
                    gwo.a(this.n, $$2, this.G);
                    this.p();
                }
                if (!$$3.isEmpty()) {
                    String $$9 = gwo.a($$3).collect(Collectors.joining(", "));
                    this.n.a(new gqv(() -> this.n.a(this), yh.c("pack.dropRejected.title"), (yh)yh.a("pack.dropRejected.message", new Object[]{$$9})));
                    return;
                }
            }
            this.n.a(this);
        }, yh.c("pack.dropConfirm"), (yh)yh.b($$12)));
    }

    private static Stream<String> a(Collection<Path> $$0) {
        return $$0.stream().map(Path::getFileName).map(Path::toString);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private amo a(ilr $$0, bah $$1) {
        try (azl $$2 = $$1.f();){
            amo amo2;
            block16: {
                bar<InputStream> $$3 = $$2.a("pack.png");
                if ($$3 == null) {
                    amo amo3 = y;
                    return amo3;
                }
                String $$4 = $$1.g();
                amo $$5 = amo.b("pack/" + bhs.a($$4, amo::b) + "/" + String.valueOf(Hashing.sha1().hashUnencodedChars((CharSequence)$$4)) + "/icon");
                InputStream $$6 = $$3.get();
                try {
                    fyh $$7 = fyh.a($$6);
                    $$0.a($$5, new ilc($$5::toString, $$7));
                    amo2 = $$5;
                    if ($$6 == null) break block16;
                }
                catch (Throwable throwable) {
                    if ($$6 != null) {
                        try {
                            $$6.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                $$6.close();
            }
            return amo2;
        }
        catch (Exception $$8) {
            a.warn("Failed to load icon from pack {}", (Object)$$1.g(), (Object)$$8);
            return y;
        }
    }

    private amo a(bah $$0) {
        return this.I.computeIfAbsent($$0.g(), $$1 -> this.a(this.n.af(), $$0));
    }

    static class a
    implements AutoCloseable {
        private final WatchService a;
        private final Path b;

        public a(Path $$0) throws IOException {
            this.b = $$0;
            this.a = $$0.getFileSystem().newWatchService();
            try {
                this.b($$0);
                try (DirectoryStream<Path> $$1 = Files.newDirectoryStream($$0);){
                    for (Path $$2 : $$1) {
                        if (!Files.isDirectory($$2, LinkOption.NOFOLLOW_LINKS)) continue;
                        this.b($$2);
                    }
                }
            }
            catch (Exception $$3) {
                this.a.close();
                throw $$3;
            }
        }

        public static @Nullable a a(Path $$0) {
            try {
                return new a($$0);
            }
            catch (IOException $$1) {
                a.warn("Failed to initialize pack directory {} monitoring", (Object)$$0, (Object)$$1);
                return null;
            }
        }

        private void b(Path $$0) throws IOException {
            $$0.register(this.a, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
        }

        public boolean a() throws IOException {
            WatchKey $$1;
            boolean $$0 = false;
            while (($$1 = this.a.poll()) != null) {
                List<WatchEvent<?>> $$2 = $$1.pollEvents();
                for (WatchEvent<?> $$3 : $$2) {
                    Path $$4;
                    $$0 = true;
                    if ($$1.watchable() != this.b || $$3.kind() != StandardWatchEventKinds.ENTRY_CREATE || !Files.isDirectory($$4 = this.b.resolve((Path)$$3.context()), LinkOption.NOFOLLOW_LINKS)) continue;
                    this.b($$4);
                }
                $$1.reset();
            }
            return $$0;
        }

        @Override
        public void close() throws IOException {
            this.a.close();
        }
    }
}

