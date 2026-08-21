/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gyl
extends gkb<b> {
    public static final DateTimeFormatter a = bhs.a(FormatStyle.SHORT);
    static final amo f = amo.b("world_list/error_highlighted");
    static final amo n = amo.b("world_list/error");
    static final amo o = amo.b("world_list/marked_join_highlighted");
    static final amo p = amo.b("world_list/marked_join");
    static final amo q = amo.b("world_list/warning_highlighted");
    static final amo r = amo.b("world_list/warning");
    static final amo s = amo.b("world_list/join_highlighted");
    static final amo t = amo.b("world_list/join");
    static final Logger u = LogUtils.getLogger();
    static final yh v = yh.c("selectWorld.tooltip.fromNewerVersion1").a(l.m);
    static final yh w = yh.c("selectWorld.tooltip.fromNewerVersion2").a(l.m);
    static final yh x = yh.c("selectWorld.tooltip.snapshot1").a(l.g);
    static final yh y = yh.c("selectWorld.tooltip.snapshot2").a(l.g);
    static final yh z = yh.c("selectWorld.locked").a(l.m);
    static final yh A = yh.c("selectWorld.conversion.tooltip").a(l.m);
    static final yh B = yh.c("selectWorld.incompatible.tooltip").a(l.m);
    static final yh C = yh.c("selectWorld.experimental");
    private final gsb D;
    private CompletableFuture<List<fnj>> E;
    private @Nullable List<fnj> F;
    private final d G;
    final c H;
    private String I;
    private boolean J;
    private final @Nullable Consumer<fnj> K;
    final @Nullable Consumer<f> L;

    gyl(gsb $$0, gfj $$1, int $$2, int $$3, String $$4, @Nullable gyl $$5, @Nullable Consumer<fnj> $$6, @Nullable Consumer<f> $$7, c $$8) {
        super($$1, $$2, $$3, 0, 36);
        this.D = $$0;
        this.G = new d($$1);
        this.I = $$4;
        this.K = $$6;
        this.L = $$7;
        this.H = $$8;
        this.E = $$5 != null ? $$5.E : this.M();
        this.c(this.G);
        this.b(this.L());
    }

    @Override
    protected void s() {
        this.aJ_().forEach(b::close);
        super.s();
    }

    private @Nullable List<fnj> L() {
        try {
            List<fnj> $$0 = this.E.getNow(null);
            if (this.H == gyl$c.b) {
                if ($$0 != null && !this.J) {
                    this.J = true;
                    $$0 = $$0.stream().filter(fnj::v).toList();
                } else {
                    return null;
                }
            }
            return $$0;
        }
        catch (CancellationException | CompletionException $$1) {
            return null;
        }
    }

    public void d() {
        this.E = this.M();
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        List<fnj> $$4 = this.L();
        if ($$4 != this.F) {
            this.b($$4);
        }
        super.a_($$0, $$1, $$2, $$3);
    }

    @Override
    private void b(@Nullable List<fnj> $$0) {
        if ($$0 == null) {
            return;
        }
        if ($$0.isEmpty()) {
            switch (this.H.ordinal()) {
                case 0: {
                    gxx.a(this.c, () -> this.c.a((gsb)null));
                    break;
                }
                case 1: {
                    this.s();
                    this.c(new e(yh.c("mco.upload.select.world.none"), this.D.C()));
                }
            }
        } else {
            this.a(this.I, $$0);
            this.F = $$0;
        }
    }

    @Override
    public void a(String $$0) {
        if (this.F != null && !$$0.equals(this.I)) {
            this.a($$0, this.F);
        }
        this.I = $$0;
    }

    /*
     * WARNING - void declaration
     */
    private CompletableFuture<List<fnj>> M() {
        void $$2;
        try {
            fni.a $$02 = this.c.q().b();
        }
        catch (fnh $$1) {
            u.error("Couldn't load level list", (Throwable)$$1);
            this.c($$1.a());
            return CompletableFuture.completedFuture(List.of());
        }
        return this.c.q().a((fni.a)$$2).exceptionally($$0 -> {
            this.c.a(m.a($$0, "Couldn't load level list"));
            return List.of();
        });
    }

    private void a(String $$02, List<fnj> $$12) {
        ArrayList<f> $$2 = new ArrayList<f>();
        Optional<f> $$3 = this.I();
        f $$4 = null;
        for (fnj $$5 : $$12.stream().filter($$1 -> this.a($$02.toLowerCase(Locale.ROOT), (fnj)$$1)).toList()) {
            f $$6 = new f(this, $$5);
            if ($$3.isPresent() && $$3.get().b().a().equals($$6.b().a())) {
                $$4 = $$6;
            }
            $$2.add($$6);
        }
        this.a(this.aJ_().stream().filter($$1 -> !$$2.contains($$1)).toList());
        $$2.forEach($$0 -> {
            if (!this.aJ_().contains($$0)) {
                this.c($$0);
            }
        });
        this.a($$4);
        this.N();
    }

    private boolean a(String $$0, fnj $$1) {
        return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
    }

    private void N() {
        this.i();
        this.D.d(true);
    }

    private void c(yh $$0) {
        this.c.a(new grk(yh.c("selectWorld.unable_to_load"), $$0));
    }

    @Override
    public int a() {
        return 270;
    }

    @Override
    public void a(@Nullable b $$0) {
        super.a($$0);
        if (this.K != null) {
            fnj fnj2;
            if ($$0 instanceof f) {
                f $$1 = (f)$$0;
                fnj2 = $$1.f;
            } else {
                fnj2 = null;
            }
            this.K.accept(fnj2);
        }
    }

    public Optional<f> I() {
        b $$0 = (b)this.q();
        if ($$0 instanceof f) {
            f $$1 = (f)$$0;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public void J() {
        this.d();
        this.c.a(this.D);
    }

    public gsb K() {
        return this.D;
    }

    @Override
    public void a(gpd $$0) {
        if (this.aJ_().contains(this.G)) {
            this.G.b($$0);
            return;
        }
        super.a($$0);
    }

    public static class d
    extends b {
        private static final yh a = yh.c("selectWorld.loading_list");
        private final gfj b;

        public d(gfj $$0) {
            this.b = $$0;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = (this.b.x.o - this.b.g.a(a)) / 2;
            int $$6 = this.h() + (this.i() - this.b.g.b) / 2;
            $$0.b(this.b.g, a, $$5, $$6, -1);
            String $$7 = grq.a(bhs.c());
            int $$8 = (this.b.x.o - this.b.g.b($$7)) / 2;
            int $$9 = $$6 + this.b.g.b;
            $$0.b(this.b.g, $$7, $$8, $$9, -8355712);
        }

        @Override
        public yh a() {
            return a;
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        private static final /* synthetic */ c[] c;

        public static c[] values() {
            return (c[])c.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b};
        }

        static {
            c = gyl$c.a();
        }
    }

    public static final class e
    extends b {
        private final gko a;

        public e(yh $$0, gio $$1) {
            this.a = new gko($$0, $$1);
        }

        @Override
        public yh a() {
            return this.a.B();
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.a.c(this.m() - this.a.aS_() / 2, this.j() - this.a.aR_() / 2);
            this.a.a($$0, $$1, $$2, $$4);
        }
    }

    public final class f
    extends b
    implements gkl {
        private static final int b = 32;
        private final gyl c;
        private final gfj d;
        private final gsb e;
        final fnj f;
        private final grl g;
        private final gko i;
        private final gko j;
        private final gko k;
        private @Nullable Path l;

        public f(gyl $$1, fnj $$2) {
            this.c = $$1;
            this.d = $$1.c;
            this.e = $$1.K();
            this.f = $$2;
            this.g = grl.a(this.d.af(), $$2.a());
            this.l = $$2.c();
            int $$3 = $$1.a() - this.y() - 2;
            yw $$4 = yh.b($$2.b());
            this.i = new gko($$4, this.d.g);
            this.i.a($$3);
            if (this.d.g.a($$4) > $$3) {
                this.i.a(gks.a($$4));
            }
            Object $$5 = $$2.a();
            long $$6 = $$2.f();
            if ($$6 != -1L) {
                ZonedDateTime $$7 = ZonedDateTime.ofInstant(Instant.ofEpochMilli($$6), ZoneId.systemDefault());
                $$5 = (String)$$5 + " (" + a.format($$7) + ")";
            }
            yw $$8 = yh.b((String)$$5).b(-8355712);
            this.j = new gko($$8, this.d.g);
            this.j.a($$3);
            if (this.d.g.b((String)$$5) > $$3) {
                this.j.a(gks.a($$8));
            }
            yh $$9 = yk.a($$2.s(), zf.a.a(-8355712));
            this.k = new gko($$9, this.d.g);
            this.k.a($$3);
            if (this.d.g.a($$9) > $$3) {
                this.k.a(gks.a($$9));
            }
            this.x();
            this.B();
        }

        private void x() {
            if (this.l == null) {
                return;
            }
            try {
                BasicFileAttributes $$0 = Files.readAttributes(this.l, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
                if ($$0.isSymbolicLink()) {
                    List<ftd> $$1 = this.d.bf().a(this.l);
                    if (!$$1.isEmpty()) {
                        u.warn("{}", (Object)ftb.a(this.l, $$1));
                        this.l = null;
                    } else {
                        $$0 = Files.readAttributes(this.l, BasicFileAttributes.class, new LinkOption[0]);
                    }
                }
                if (!$$0.isRegularFile()) {
                    this.l = null;
                }
            }
            catch (NoSuchFileException $$2) {
                this.l = null;
            }
            catch (IOException $$3) {
                u.error("could not validate symlink", (Throwable)$$3);
                this.l = null;
            }
        }

        @Override
        public yh a() {
            yw $$0 = yh.a("narrator.select.world_info", new Object[]{this.f.b(), yh.a(new Date(this.f.f())), this.f.s()});
            if (this.f.p()) {
                $$0 = yg.a(new yh[]{$$0, z});
            }
            if (this.f.e()) {
                $$0 = yg.a(new yh[]{$$0, C});
            }
            return yh.a("narrator.select", $$0);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = this.y();
            this.i.c($$5, this.h() + 1);
            this.i.a($$0, $$1, $$2, $$4);
            this.j.c($$5, this.h() + this.d.g.b + 3);
            this.j.a($$0, $$1, $$2, $$4);
            this.k.c($$5, this.h() + this.d.g.b + this.d.g.b + 3);
            this.k.a($$0, $$1, $$2, $$4);
            $$0.a(hpa.at, this.g.b(), this.d(), this.h(), 0.0f, 0.0f, 32, 32, 32, 32);
            if (this.c.H == gyl$c.a && (this.d.k.an().b().booleanValue() || $$3)) {
                amo $$12;
                $$0.a(this.d(), this.h(), this.d() + 32, this.h() + 32, -1601138544);
                int $$6 = $$1 - this.d();
                int $$7 = $$2 - this.h();
                boolean $$8 = this.a($$6, $$7, 32);
                amo $$9 = $$8 ? s : t;
                amo $$10 = $$8 ? q : r;
                amo $$11 = $$8 ? f : n;
                amo amo2 = $$12 = $$8 ? o : p;
                if (this.f instanceof fnj.c || this.f instanceof fnj.b) {
                    $$0.a(hpa.at, $$11, this.d(), this.h(), 32, 32);
                    $$0.a(hpa.at, $$12, this.d(), this.h(), 32, 32);
                    return;
                }
                if (this.f.p()) {
                    $$0.a(hpa.at, $$11, this.d(), this.h(), 32, 32);
                    if ($$8) {
                        $$0.a(this.d.g.c(z, 175), $$1, $$2);
                    }
                } else if (this.f.d()) {
                    $$0.a(hpa.at, $$11, this.d(), this.h(), 32, 32);
                    if ($$8) {
                        $$0.a(this.d.g.c(A, 175), $$1, $$2);
                    }
                } else if (!this.f.r()) {
                    $$0.a(hpa.at, $$11, this.d(), this.h(), 32, 32);
                    if ($$8) {
                        $$0.a(this.d.g.c(B, 175), $$1, $$2);
                    }
                } else if (this.f.m()) {
                    $$0.a(hpa.at, $$12, this.d(), this.h(), 32, 32);
                    if (this.f.n()) {
                        $$0.a(hpa.at, $$11, this.d(), this.h(), 32, 32);
                        if ($$8) {
                            $$0.a((List<bfr>)ImmutableList.of((Object)v.g(), (Object)w.g()), $$1, $$2);
                        }
                    } else if (!w.b().f()) {
                        $$0.a(hpa.at, $$10, this.d(), this.h(), 32, 32);
                        if ($$8) {
                            $$0.a((List<bfr>)ImmutableList.of((Object)x.g(), (Object)y.g()), $$1, $$2);
                        }
                    }
                    if ($$8) {
                        gyl.this.d($$0);
                    }
                } else {
                    $$0.a(hpa.at, $$9, this.d(), this.h(), 32, 32);
                    if ($$8) {
                        gyl.this.d($$0);
                    }
                }
            }
        }

        private int y() {
            return this.d() + 32 + 3;
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            if (this.c()) {
                int $$2 = (int)$$0.u() - this.d();
                int $$3 = (int)$$0.v() - this.h();
                if ($$1 || this.a($$2, $$3, 32) && this.c.H == gyl$c.a) {
                    this.d.ap().a(iph.a(bda.DJ, 1.0f));
                    Consumer<f> $$4 = this.c.L;
                    if ($$4 != null) {
                        $$4.accept(this);
                        return true;
                    }
                }
            }
            return super.a($$0, $$1);
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.c() && this.c()) {
                this.d.ap().a(iph.a(bda.DJ, 1.0f));
                Consumer<f> $$1 = this.c.L;
                if ($$1 != null) {
                    $$1.accept(this);
                    return true;
                }
            }
            return super.a($$0);
        }

        public boolean c() {
            return this.f.u() || this.c.H == gyl$c.b;
        }

        public void e() {
            if (!this.f.u()) {
                return;
            }
            if (this.f instanceof fnj.c) {
                this.d.a(gru.a(() -> this.d.a(this.e)));
                return;
            }
            this.d.B().a(this.f.a(), this.c::J);
        }

        public void f() {
            this.d.a(new gra($$0 -> {
                if ($$0) {
                    this.d.a(new grz(true));
                    this.t();
                }
                this.c.J();
            }, yh.c("selectWorld.deleteQuestion"), yh.a("selectWorld.deleteWarning", new Object[]{this.f.b()}), yh.c("selectWorld.deleteButton"), yg.e));
        }

        public void t() {
            fni $$0 = this.d.q();
            String $$1 = this.f.a();
            try (fni.c $$2 = $$0.e($$1);){
                $$2.k();
            }
            catch (IOException $$3) {
                gna.b(this.d, $$1);
                u.error("Failed to delete world {}", (Object)$$1, (Object)$$3);
            }
        }

        /*
         * WARNING - void declaration
         */
        public void u() {
            void $$7;
            void $$4;
            this.z();
            String $$0 = this.f.a();
            try {
                fni.c $$1 = this.d.q().d($$0);
            }
            catch (IOException $$2) {
                gna.a(this.d, $$0);
                u.error("Failed to access level {}", (Object)$$0, (Object)$$2);
                this.c.d();
                return;
            }
            catch (ftb $$3) {
                u.warn("{}", (Object)$$3.getMessage());
                this.d.a(gru.a(() -> this.d.a(this.e)));
                return;
            }
            try {
                gya $$5 = gya.a(this.d, (fni.c)$$4, arg_0 -> this.a((fni.c)$$4, arg_0));
            }
            catch (IOException | vk | vr $$6) {
                $$4.c();
                gna.a(this.d, $$0);
                u.error("Failed to load world data {}", (Object)$$0, (Object)$$6);
                this.c.d();
                return;
            }
            this.d.a((gsb)$$7);
        }

        public void v() {
            this.z();
            try (fni.c $$0 = this.d.q().d(this.f.a());){
                Pair<dws, gyh> $$1 = this.d.B().a($$0);
                dws $$2 = (dws)$$1.getFirst();
                gyh $$32 = (gyh)$$1.getSecond();
                Path $$4 = gxx.a($$0.a(fng.j), this.d);
                $$32.b();
                if ($$32.c().f()) {
                    this.d.a(new gra($$3 -> this.d.a($$3 ? gxx.a(this.d, this.c::J, $$2, $$32, $$4) : this.e), yh.c("selectWorld.recreate.customized.title"), yh.c("selectWorld.recreate.customized.text"), yg.i, yg.e));
                } else {
                    this.d.a(gxx.a(this.d, this.c::J, $$2, $$32, $$4));
                }
            }
            catch (ftb $$5) {
                u.warn("{}", (Object)$$5.getMessage());
                this.d.a(gru.a(() -> this.d.a(this.e)));
            }
            catch (Exception $$6) {
                u.error("Unable to recreate world", (Throwable)$$6);
                this.d.a(new gqv(() -> this.d.a(this.e), yh.c("selectWorld.recreate.error.title"), (yh)yh.c("selectWorld.recreate.error.text")));
            }
        }

        private void z() {
            this.d.c(new grm(yh.c("selectWorld.data_read")));
        }

        private void B() {
            boolean $$0;
            boolean bl2 = $$0 = this.l != null && Files.isRegularFile(this.l, new LinkOption[0]);
            if ($$0) {
                try (InputStream $$1 = Files.newInputStream(this.l, new OpenOption[0]);){
                    this.g.a(fyh.a($$1));
                }
                catch (Throwable $$2) {
                    u.error("Invalid icon for world {}", (Object)this.f.a(), (Object)$$2);
                    this.l = null;
                }
            } else {
                this.g.a();
            }
        }

        @Override
        public void close() {
            if (!this.g.c()) {
                this.g.close();
            }
        }

        public String w() {
            return this.f.b();
        }

        @Override
        public fnj b() {
            return this.f;
        }

        private /* synthetic */ void a(fni.c $$0, boolean $$1) {
            $$0.c();
            this.c.J();
        }
    }

    public static abstract class b
    extends gkb.a<b>
    implements AutoCloseable {
        @Override
        public void close() {
        }

        public @Nullable fnj b() {
            return null;
        }
    }

    public static class a {
        private final gfj a;
        private final gsb b;
        private int c;
        private int d;
        private String e = "";
        private c f = gyl$c.a;
        private @Nullable gyl g = null;
        private @Nullable Consumer<fnj> h = null;
        private @Nullable Consumer<f> i = null;

        public a(gfj $$0, gsb $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(int $$0) {
            this.c = $$0;
            return this;
        }

        public a b(int $$0) {
            this.d = $$0;
            return this;
        }

        public a a(String $$0) {
            this.e = $$0;
            return this;
        }

        public a a(@Nullable gyl $$0) {
            this.g = $$0;
            return this;
        }

        public a a(Consumer<fnj> $$0) {
            this.h = $$0;
            return this;
        }

        public a b(Consumer<f> $$0) {
            this.i = $$0;
            return this;
        }

        public a a() {
            this.f = gyl$c.b;
            return this;
        }

        public gyl b() {
            return new gyl(this.b, this.a, this.c, this.d, this.e, this.g, this.h, this.i, this.f);
        }
    }
}

