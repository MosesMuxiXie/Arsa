/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hashing
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UndashedUuid
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class iom
implements AutoCloseable {
    private static final yh a = yh.c("resourcePack.server.name");
    private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
    static final Logger c = LogUtils.getLogger();
    private static final bam d = $$0 -> {};
    private static final azm e = new azm(true, bah.b.a, true);
    private static final ioo f = new ioo(){

        @Override
        public void a(UUID $$0, ioo.b $$1) {
            c.debug("Downloaded pack {} changed state to {}", (Object)$$0, (Object)$$1);
        }

        @Override
        public void a(UUID $$0, ioo.a $$1) {
            c.debug("Downloaded pack {} finished with state {}", (Object)$$0, (Object)$$1);
        }
    };
    final gfj g;
    private bam h = d;
    private @Nullable iop.a i;
    final ioq j;
    private final azg k;
    private bal l = bal.f;
    ioo m = f;
    private int n;

    public iom(gfj $$0, Path $$1, gzf.i $$2) {
        this.g = $$0;
        try {
            this.k = new azg($$1);
        }
        catch (IOException $$3) {
            throw new UncheckedIOException("Failed to open download queue in directory " + String.valueOf($$1), $$3);
        }
        Executor $$4 = $$0::a_;
        this.j = new ioq(this.a(this.k, $$4, $$2.a, $$2.b), new ioo(){

            @Override
            public void a(UUID $$0, ioo.b $$1) {
                iom.this.m.a($$0, $$1);
            }

            @Override
            public void a(UUID $$0, ioo.a $$1) {
                iom.this.m.a($$0, $$1);
            }
        }, this.j(), this.a($$4), ioq.c.a);
    }

    bfx.a a(final int $$0) {
        return new bfx.a(){
            private final gna.a c = new gna.a();
            private yh d = yh.i();
            private @Nullable yh e = null;
            private int f;
            private int g;
            private OptionalLong h = OptionalLong.empty();

            private void b() {
                iom.this.g.execute(() -> gna.b(iom.this.g.aG(), this.c, this.d, this.e));
            }

            private void b(long $$02) {
                this.e = this.h.isPresent() ? yh.a("download.pack.progress.percent", $$02 * 100L / this.h.getAsLong()) : yh.a("download.pack.progress.bytes", new Object[]{fzv.b($$02)});
                this.b();
            }

            @Override
            public void a() {
                ++this.f;
                this.d = yh.a("download.pack.title", this.f, $$0);
                this.b();
                c.debug("Starting pack {}/{} download", (Object)this.f, (Object)$$0);
            }

            @Override
            public void a(OptionalLong $$02) {
                c.debug("File size = {} bytes", (Object)$$02);
                this.h = $$02;
                this.b(0L);
            }

            @Override
            public void a(long $$02) {
                c.debug("Progress for pack {}: {} bytes", (Object)this.f, (Object)$$02);
                this.b($$02);
            }

            @Override
            public void a(boolean $$02) {
                if (!$$02) {
                    c.info("Pack {} failed to download", (Object)this.f);
                    ++this.g;
                } else {
                    c.debug("Download ended for pack {}", (Object)this.f);
                }
                if (this.f == $$0) {
                    if (this.g > 0) {
                        this.d = yh.a("download.pack.failed", this.g, $$0);
                        this.e = null;
                        this.b();
                    } else {
                        gna.a(iom.this.g.aG(), this.c);
                    }
                }
            }
        };
    }

    private ion a(final azg $$0, final Executor $$1, final gfx $$2, final Proxy $$3) {
        return new ion(){
            private static final int f = 0xFA00000;
            private static final HashFunction g = Hashing.sha1();

            private Map<String, String> a() {
                aa $$02 = w.b();
                return Map.of("X-Minecraft-Username", $$2.c(), "X-Minecraft-UUID", UndashedUuid.toString((UUID)$$2.b()), "X-Minecraft-Version", $$02.c(), "X-Minecraft-Version-ID", $$02.b(), "X-Minecraft-Pack-Format", String.valueOf($$02.a(azn.a)), "User-Agent", "Minecraft Java/" + $$02.c());
            }

            @Override
            public void a(Map<UUID, azg.c> $$02, Consumer<azg.b> $$12) {
                $$0.a(new azg.a(g, 0xFA00000, this.a(), $$3, iom.this.a($$02.size())), $$02).thenAcceptAsync((Consumer)$$12, $$1);
            }
        };
    }

    private Runnable a(final Executor $$0) {
        return new Runnable(){
            private boolean c;
            private boolean d;

            @Override
            public void run() {
                this.d = true;
                if (!this.c) {
                    this.c = true;
                    $$0.execute(this::a);
                }
            }

            private void a() {
                while (this.d) {
                    this.d = false;
                    iom.this.j.e();
                }
                this.c = false;
            }
        };
    }

    private iop j() {
        return this::a;
    }

    private @Nullable List<bah> a(List<iop.b> $$0) {
        ArrayList<bah> $$1 = new ArrayList<bah>($$0.size());
        for (iop.b $$2 : Lists.reverse($$0)) {
            azz $$7;
            azi.a $$6;
            String $$3 = String.format(Locale.ROOT, "server/%08X/%s", this.n++, $$2.a());
            Path $$4 = $$2.b();
            azk $$5 = new azk($$3, a, this.l, Optional.empty());
            bah.a $$8 = bah.a($$5, (bah.c)($$6 = new azi.a($$4)), $$7 = w.b().a(azn.a), azn.a);
            if ($$8 == null) {
                c.warn("Invalid pack metadata in {}, ignoring all", (Object)$$4);
                return null;
            }
            $$1.add(new bah($$5, $$6, $$8, e));
        }
        return $$1;
    }

    public bam a() {
        return $$0 -> this.h.loadPacks($$0);
    }

    private static bam b(List<bah> $$0) {
        if ($$0.isEmpty()) {
            return d;
        }
        return $$0::forEach;
    }

    private void a(iop.a $$0) {
        this.i = $$0;
        List<iop.b> $$1 = $$0.b();
        List<bah> $$2 = this.a($$1);
        if ($$2 == null) {
            $$0.a(false);
            List<iop.b> $$3 = $$0.b();
            $$2 = this.a($$3);
            if ($$2 == null) {
                c.warn("Double failure in loading server packs");
                $$2 = List.of();
            }
        }
        this.h = iom.b($$2);
        this.g.p();
    }

    public void b() {
        if (this.i != null) {
            this.i.a(false);
            List<bah> $$0 = this.a(this.i.b());
            if ($$0 == null) {
                c.warn("Double failure in loading server packs");
                $$0 = List.of();
            }
            this.h = iom.b($$0);
        }
    }

    public void c() {
        if (this.i != null) {
            this.i.a(true);
            this.i = null;
            this.h = d;
        }
    }

    public void d() {
        if (this.i != null) {
            this.i.a();
            this.i = null;
        }
    }

    private static @Nullable HashCode a(@Nullable String $$0) {
        if ($$0 != null && b.matcher($$0).matches()) {
            return HashCode.fromString((String)$$0.toLowerCase(Locale.ROOT));
        }
        return null;
    }

    public void a(UUID $$0, URL $$1, @Nullable String $$2) {
        HashCode $$3 = iom.a($$2);
        this.j.a($$0, $$1, $$3);
    }

    public void a(UUID $$0, Path $$1) {
        this.j.a($$0, $$1);
    }

    public void a(UUID $$0) {
        this.j.a($$0);
    }

    public void e() {
        this.j.a();
    }

    private static ioo a(final wu $$0) {
        return new ioo(){

            @Override
            public void a(UUID $$02, ioo.b $$1) {
                c.debug("Pack {} changed status to {}", (Object)$$02, (Object)$$1);
                acb.a $$2 = switch ($$1) {
                    default -> throw new MatchException(null, null);
                    case ioo.b.a -> acb.a.d;
                    case ioo.b.b -> acb.a.e;
                };
                $$0.a(new acb($$02, $$2));
            }

            @Override
            public void a(UUID $$02, ioo.a $$1) {
                c.debug("Pack {} changed status to {}", (Object)$$02, (Object)$$1);
                acb.a $$2 = switch ($$1) {
                    default -> throw new MatchException(null, null);
                    case ioo.a.b -> acb.a.a;
                    case ioo.a.d -> acb.a.c;
                    case ioo.a.a -> acb.a.b;
                    case ioo.a.c -> acb.a.h;
                    case ioo.a.e -> acb.a.g;
                };
                $$0.a(new acb($$02, $$2));
            }
        };
    }

    public void a(wu $$0, ioq.c $$1) {
        this.l = bal.f;
        this.m = iom.a($$0);
        switch ($$1) {
            case b: {
                this.j.b();
                break;
            }
            case c: {
                this.j.c();
                break;
            }
            case a: {
                this.j.d();
            }
        }
    }

    public void f() {
        this.l = bal.e;
        this.m = f;
        this.j.b();
    }

    public void g() {
        this.j.b();
    }

    public void h() {
        this.j.c();
    }

    public CompletableFuture<Void> b(final UUID $$0) {
        final CompletableFuture<Void> $$1 = new CompletableFuture<Void>();
        final ioo $$2 = this.m;
        this.m = new ioo(){

            @Override
            public void a(UUID $$02, ioo.b $$12) {
                $$2.a($$02, $$12);
            }

            @Override
            public void a(UUID $$02, ioo.a $$12) {
                if ($$0.equals($$02)) {
                    iom.this.m = $$2;
                    if ($$12 == ioo.a.b) {
                        $$1.complete(null);
                    } else {
                        $$1.completeExceptionally(new IllegalStateException("Failed to apply pack " + String.valueOf($$02) + ", reason: " + String.valueOf((Object)$$12)));
                    }
                }
                $$2.a($$02, $$12);
            }
        };
        return $$1;
    }

    public void i() {
        this.j.a();
        this.m = f;
        this.j.d();
    }

    @Override
    public void close() throws IOException {
        this.k.close();
    }
}

