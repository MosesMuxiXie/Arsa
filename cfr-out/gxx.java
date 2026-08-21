/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gxx
extends gsb {
    private static final int b = 1;
    private static final int c = 210;
    private static final Logger d = LogUtils.getLogger();
    private static final String e = "mcworld-";
    static final yh f = yh.c("selectWorld.gameMode");
    static final yh t = yh.c("selectWorld.enterName");
    static final yh u = yh.c("selectWorld.experiments");
    static final yh v = yh.c("selectWorld.allowCommands.info");
    private static final yh w = yh.c("createWorld.preparing");
    private static final int x = 10;
    private static final int y = 8;
    public static final amo a = amo.b("textures/gui/tab_header_background.png");
    private final gou z = new gou(this);
    final gyj A;
    private final gmu B = new gmu($$1 -> {
        gjc cfr_ignored_0 = (gjc)this.c($$1);
    }, $$1 -> this.e((gmm)$$1));
    private boolean C;
    private final ftc D;
    private final gxw E;
    private final Runnable F;
    private @Nullable Path G;
    private @Nullable bak H;
    private @Nullable gmv I;

    public static void a(gfj $$02, Runnable $$12) {
        gxx.a($$02, $$12, (gxx $$0, jk<anc> $$1, fnm $$2, Path $$3) -> $$0.a((jk<anc>)$$1, (fnt)$$2));
    }

    public static void a(gfj $$02, Runnable $$12, gxw $$22) {
        gyi $$3 = ($$0, $$1, $$2) -> new gyh($$2.a(), $$1, $$0, $$2.b());
        Function<anr.a, evm> $$4 = $$0 -> new evm(evo.a(), ffe.a($$0.c()));
        gxx.a($$02, $$12, $$4, $$3, ffe.a, $$22);
    }

    public static void b(gfj $$02, Runnable $$12) {
        gyi $$22 = ($$0, $$1, $$2) -> new gyh($$2.a().a(), $$2.a().b(), $$1, $$0, $$2.b(), new gyc(gyj.a.c, new etx.a().a(eua.a, false).a(eua.b, false).a(eua.V, false).a(), fdq.h));
        Function<anr.a, evm> $$32 = $$0 -> new evm(evo.b(), ffe.c($$0.c()));
        gxx.a($$02, $$12, $$32, $$22, ffe.b, ($$0, $$1, $$2, $$3) -> $$0.a((jk<anc>)$$1, (fnt)$$2));
    }

    private static void a(gfj $$0, Runnable $$12, Function<anr.a, evm> $$22, gyi $$32, amt<ffd> $$42, gxw $$5) {
        gxx.a($$0, w);
        bak $$6 = new bak(new ban($$0.bf()));
        dxm $$7 = w.aX ? new dxm(new dwc(List.of("vanilla", "tests"), List.of()), dhb.h) : dxm.d;
        anr.c $$8 = gxx.a($$6, $$7);
        CompletableFuture<gyh> $$9 = anr.a($$8, (anr.a $$1) -> new anr.b<gxy>(new gxy((evm)$$22.apply($$1), $$1.b()), $$1.d()), (bap $$1, ane $$2, jk<anc> $$3, D $$4) -> {
            $$1.close();
            return $$32.apply($$2, $$3, (gxy)$$4);
        }, bhs.h(), $$0);
        $$0.b($$9::isDone);
        $$0.a(new gxx($$0, $$12, $$9.join(), Optional.of($$42), OptionalLong.empty(), $$5));
    }

    public static gxx a(gfj $$02, Runnable $$12, dws $$22, gyh $$32, @Nullable Path $$4) {
        gxx $$5 = new gxx($$02, $$12, $$32, ffe.a($$32.e()), OptionalLong.of($$32.c().c()), ($$0, $$1, $$2, $$3) -> $$0.a((jk<anc>)$$1, (fnt)$$2));
        $$5.C = true;
        $$5.A.a($$22.a());
        $$5.A.a($$22.e());
        $$5.A.a($$22.d());
        $$5.A.q().a($$22.f(), null);
        if ($$22.c()) {
            $$5.A.a(gyj.a.b);
        } else if ($$22.b().h()) {
            $$5.A.a(gyj.a.a);
        } else if ($$22.b().g()) {
            $$5.A.a(gyj.a.c);
        }
        $$5.G = $$4;
        return $$5;
    }

    private gxx(gfj $$0, Runnable $$12, gyh $$2, Optional<amt<ffd>> $$3, OptionalLong $$4, gxw $$5) {
        super(yh.c("selectWorld.create"));
        this.F = $$12;
        this.D = $$0.bf();
        this.E = $$5;
        this.A = new gyj($$0.q().c(), $$2, $$3, $$4);
    }

    public gyj o() {
        return this.A;
    }

    @Override
    protected void bg_() {
        this.I = gmv.a(this.B, this.o).a(new a(), new c(), new b()).a();
        this.c(this.I);
        goy $$02 = this.z.b(goy.e().a(8));
        $$02.a(gje.a(yh.c("selectWorld.create"), (gje $$0) -> this.F()).a());
        $$02.a(gje.a(yg.e, (gje $$0) -> this.p()).a());
        this.z.a($$0 -> {
            $$0.e(1);
            this.c($$0);
        });
        this.I.a(0, false);
        this.A.a();
        this.c();
    }

    @Override
    protected void aI_() {
    }

    @Override
    public void c() {
        if (this.I == null) {
            return;
        }
        this.I.a(this.o);
        this.I.h();
        int $$0 = this.I.aV_().c();
        gpm $$1 = new gpm(0, $$0, this.o, this.p - this.z.b() - $$0);
        this.B.a($$1);
        this.z.b($$0);
        this.z.a();
    }

    private static void a(gfj $$0, yh $$1) {
        $$0.c(new grm($$1));
    }

    private void F() {
        gyh $$0 = this.A.k();
        evl.b $$1 = $$0.e().a($$0.d());
        jk<anc> $$2 = $$0.f().a(anc.c, $$1.b());
        Lifecycle $$3 = dhb.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
        Lifecycle $$4 = $$2.a().d();
        Lifecycle $$5 = $$4.add($$3);
        boolean $$6 = !this.C && $$4 == Lifecycle.stable();
        dws $$7 = this.c($$1.d() == fnm.a.c);
        fnm $$8 = new fnm($$7, this.A.k().c(), $$1.d(), $$5);
        gyk.a(this.n, this, $$5, () -> this.a($$2, $$8), $$6);
    }

    private void a(jk<anc> $$0, fnm $$1) {
        boolean $$2 = this.E.create(this, $$0, $$1, this.G);
        this.J();
        if (!$$2) {
            this.p();
        }
    }

    private boolean a(jk<anc> $$0, fnt $$1) {
        String $$2 = this.A.c();
        gyh $$3 = this.A.k();
        gxx.a(this.n, w);
        Optional<fni.c> $$4 = gxx.a(this.n, $$2, this.G);
        if ($$4.isEmpty()) {
            gna.c(this.n, $$2);
            return false;
        }
        this.n.B().a($$4.get(), $$3.g(), $$0, $$1);
        return true;
    }

    private dws c(boolean $$0) {
        String $$1 = this.A.b().trim();
        if ($$0) {
            eua $$2 = new eua(dxm.d.b());
            $$2.a(eua.a, false, null);
            return new dws($$1, dwl.d, false, ccz.a, true, $$2, dxm.d);
        }
        return new dws($$1, this.A.d().e, this.A.f(), this.A.e(), this.A.g(), this.A.q(), this.A.k().h());
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.I.a($$0)) {
            return true;
        }
        if (super.a($$0)) {
            return true;
        }
        if ($$0.d()) {
            this.F();
            return true;
        }
        return false;
    }

    @Override
    public void aX_() {
        this.p();
    }

    public void p() {
        this.F.run();
        this.J();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, gsb.i, 0, this.p - this.z.b() - 2, 0.0f, 0.0f, this.o, 2, 32, 2);
    }

    @Override
    protected void a(gir $$0) {
        $$0.a(hpa.at, a, 0, 0, 0.0f, 0.0f, this.o, this.z.c(), 16, 16);
        this.a($$0, 0, this.z.c(), this.o, this.p);
    }

    private @Nullable Path I() {
        if (this.G == null) {
            try {
                this.G = Files.createTempDirectory(e, new FileAttribute[0]);
            }
            catch (IOException $$0) {
                d.warn("Failed to create temporary dir", (Throwable)$$0);
                gna.c(this.n, this.A.c());
                this.p();
            }
        }
        return this.G;
    }

    void a(dxm $$02) {
        Pair<Path, bak> $$1 = this.c($$02);
        if ($$1 != null) {
            this.n.a(new gyb(this, (bak)$$1.getSecond(), $$0 -> this.a((bak)$$0, false, this::a)));
        }
    }

    void b(dxm $$02) {
        Pair<Path, bak> $$1 = this.c($$02);
        if ($$1 != null) {
            this.n.a(new gwo((bak)$$1.getSecond(), $$0 -> this.a((bak)$$0, true, this::b), (Path)$$1.getFirst(), yh.c("dataPack.title")));
        }
    }

    private void a(bak $$0, boolean $$1, Consumer<dxm> $$2) {
        List $$4;
        ImmutableList $$32 = ImmutableList.copyOf($$0.e());
        dxm $$5 = new dxm(new dwc((List<String>)$$32, $$4 = (List)$$0.c().stream().filter(arg_0 -> gxx.a((List)$$32, arg_0)).collect(ImmutableList.toImmutableList())), this.A.k().h().b());
        if (this.A.a($$5)) {
            this.n.a(this);
            return;
        }
        dgz $$6 = $$0.f();
        if (dhb.a($$6) && $$1) {
            this.n.a(new gxv($$0.g(), $$3 -> {
                if ($$3) {
                    this.a($$0, $$5, $$2);
                } else {
                    $$2.accept(this.A.k().h());
                }
            }));
        } else {
            this.a($$0, $$5, $$2);
        }
    }

    private void a(bak $$03, dxm $$13, Consumer<dxm> $$22) {
        this.n.c(new grm(yh.c("dataPack.validation.working")));
        anr.c $$32 = gxx.a($$03, $$13);
        ((CompletableFuture)((CompletableFuture)anr.a($$32, (anr.a $$02) -> {
            if ($$02.c().e(mj.bD).c().findAny().isEmpty()) {
                throw new IllegalStateException("Needs at least one world preset to continue");
            }
            if ($$02.c().e(mj.aS).c().findAny().isEmpty()) {
                throw new IllegalStateException("Needs at least one biome continue");
            }
            gyh $$12 = this.A.k();
            ams $$2 = $$12.a().a(JsonOps.INSTANCE);
            DataResult $$3 = evm.a($$2, $$12.c(), $$12.e()).setLifecycle(Lifecycle.stable());
            ams $$4 = $$02.c().a(JsonOps.INSTANCE);
            evm $$5 = (evm)$$3.flatMap($$1 -> evm.a.parse($$4, $$1)).getOrThrow($$0 -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0));
            return new anr.b<gxy>(new gxy($$5, $$02.b()), $$02.d());
        }, (bap $$0, ane $$1, jk<anc> $$2, D $$3) -> {
            $$0.close();
            return new gyh($$3.a(), $$2, $$1, $$3.b());
        }, bhs.h(), this.n).thenApply($$0 -> {
            $$0.b();
            return $$0;
        })).thenAcceptAsync(this.A::a, (Executor)this.n)).handleAsync(($$12, $$2) -> {
            if ($$2 != null) {
                d.warn("Failed to validate datapack", $$2);
                this.n.a(new gra($$1 -> {
                    if ($$1) {
                        $$22.accept(this.A.k().h());
                    } else {
                        $$22.accept(dxm.d);
                    }
                }, yh.c("dataPack.validation.failed"), yg.a, yh.c("dataPack.validation.back"), yh.c("dataPack.validation.reset")));
            } else {
                this.n.a(this);
            }
            return null;
        }, (Executor)this.n);
    }

    private static anr.c a(bak $$0, dxm $$1) {
        anr.d $$2 = new anr.d($$0, $$1, false, true);
        return new anr.c($$2, ee.a.c, bbh.c);
    }

    private void J() {
        if (this.G != null && Files.exists(this.G, new LinkOption[0])) {
            try (Stream<Path> $$02 = Files.walk(this.G, new FileVisitOption[0]);){
                $$02.sorted(Comparator.reverseOrder()).forEach($$0 -> {
                    try {
                        Files.delete($$0);
                    }
                    catch (IOException $$1) {
                        d.warn("Failed to remove temporary file {}", $$0, (Object)$$1);
                    }
                });
            }
            catch (IOException $$1) {
                d.warn("Failed to list temporary dir {}", (Object)this.G);
            }
        }
        this.G = null;
    }

    private static void a(Path $$0, Path $$1, Path $$2) {
        try {
            bhs.b($$0, $$1, $$2);
        }
        catch (IOException $$3) {
            d.warn("Failed to copy datapack file from {} to {}", (Object)$$2, (Object)$$1);
            throw new UncheckedIOException($$3);
        }
    }

    /*
     * WARNING - bad return control flow
     */
    private static Optional<fni.c> a(gfj $$0, String $$12, @Nullable Path $$22) {
        Optional<fni.c> optional;
        block12: {
            fni.c $$3;
            block11: {
                $$3 = $$0.q().e($$12);
                if ($$22 != null) break block11;
                return Optional.of($$3);
            }
            Stream<Path> $$4 = Files.walk($$22, new FileVisitOption[0]);
            try {
                Path $$5 = $$3.a(fng.j);
                bfp.c($$5);
                $$4.filter($$1 -> !$$1.equals($$22)).forEach($$2 -> gxx.a($$22, $$5, $$2));
                optional = Optional.of($$3);
                if ($$4 == null) break block12;
            }
            catch (Throwable throwable) {
                try {
                    try {
                        if ($$4 != null) {
                            try {
                                $$4.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException | UncheckedIOException $$6) {
                        d.warn("Failed to copy datapacks to world {}", (Object)$$12, (Object)$$6);
                        $$3.close();
                    }
                }
                catch (IOException | UncheckedIOException $$7) {
                    d.warn("Failed to create access for {}", (Object)$$12, (Object)$$7);
                }
            }
            $$4.close();
        }
        return optional;
        return Optional.empty();
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    public static @Nullable Path a(Path $$0, gfj $$12) {
        @Nullable MutableObject $$22 = new MutableObject();
        try (Stream<Path> $$3 = Files.walk($$0, new FileVisitOption[0]);){
            $$3.filter($$1 -> !$$1.equals($$0)).forEach($$2 -> {
                Path $$3 = (Path)$$22.get();
                if ($$3 == null) {
                    try {
                        $$3 = Files.createTempDirectory(e, new FileAttribute[0]);
                    }
                    catch (IOException $$4) {
                        d.warn("Failed to create temporary dir");
                        throw new UncheckedIOException($$4);
                    }
                    $$22.setValue((Object)$$3);
                }
                gxx.a($$0, $$3, $$2);
            });
        }
        catch (IOException | UncheckedIOException $$4) {
            d.warn("Failed to copy datapacks from world {}", (Object)$$0, (Object)$$4);
            gna.c($$12, $$0.toString());
            return null;
        }
        return (Path)$$22.get();
    }

    private @Nullable Pair<Path, bak> c(dxm $$0) {
        Path $$1 = this.I();
        if ($$1 != null) {
            if (this.H == null) {
                this.H = ban.a($$1, this.D);
                this.H.a();
            }
            this.H.b($$0.a().a());
            return Pair.of((Object)$$1, (Object)this.H);
        }
        return null;
    }

    private static /* synthetic */ boolean a(List $$0, String $$1) {
        return !$$0.contains($$1);
    }

    class a
    extends gmr {
        private static final yh b = yh.c("createWorld.tab.game.title");
        private static final yh d = yh.c("selectWorld.allowCommands");
        private final gjn e;

        a() {
            super(b);
            got.b $$02 = this.c.b(8).d(1);
            gox $$12 = $$02.b();
            this.e = new gjn(gxx.this.q, 208, 20, yh.c("selectWorld.enterName"));
            this.e.a(gxx.this.A.b());
            this.e.b(gxx.this.A::a);
            gxx.this.A.a((gyj $$0) -> this.e.a(gks.a(yh.a("selectWorld.targetFolder", yh.b($$0.c()).a(l.u)))));
            gxx.this.b(this.e);
            $$02.a(goq.a(gxx.this.q, this.e, t), $$02.b().b());
            gjl<gyj.a> $$2 = $$02.a(gjl.a($$0 -> $$0.f, gxx.this.A.d()).a((gyj.a[])new gyj.a[]{gyj.a.a, gyj.a.b, gyj.a.c}).a(0, 0, 210, 20, f, ($$0, $$1) -> gxx.this.A.a((gyj.a)((Object)$$1))), $$12);
            gxx.this.A.a((gyj $$1) -> {
                $$2.a($$1.d());
                $$0.k = !$$1.l();
                $$2.a((gyj.a)((Object)gks.a($$1.d().a())));
            });
            gjl<ccz> $$3 = $$02.a(gjl.a(ccz::b, gxx.this.A.e()).a((ccz[])ccz.values()).a(0, 0, 210, 20, yh.c("options.difficulty"), ($$0, $$1) -> gxx.this.A.a((ccz)$$1)), $$12);
            gxx.this.A.a((gyj $$1) -> {
                $$3.a(gxx.this.A.e());
                $$0.k = !gxx.this.A.f();
                $$3.a((ccz)((Object)gks.a(gxx.this.A.e().d())));
            });
            gjl<Boolean> $$4 = $$02.a(gjl.a(gxx.this.A.g()).a((T $$0) -> gks.a(v)).a(0, 0, 210, 20, d, ($$0, $$1) -> gxx.this.A.a((boolean)$$1)));
            gxx.this.A.a((gyj $$1) -> {
                $$4.a(gxx.this.A.g());
                $$0.k = !gxx.this.A.l() && !gxx.this.A.f();
            });
            if (!w.b().f()) {
                $$02.a(gje.a(u, $$0 -> gxx.this.a(gxx.this.A.k().h())).a(210).a());
            }
        }
    }

    class c
    extends gmr {
        private static final yh b = yh.c("createWorld.tab.world.title");
        private static final yh d = yh.c("generator.minecraft.amplified.info");
        private static final yh e = yh.c("selectWorld.mapFeatures");
        private static final yh f = yh.c("selectWorld.mapFeatures.info");
        private static final yh g = yh.c("selectWorld.bonusItems");
        private static final yh h = yh.c("selectWorld.enterSeed");
        static final yh i = yh.c("selectWorld.seedInfo");
        private static final int j = 310;
        private final gjn k;
        private final gje l;

        c() {
            super(b);
            got.b $$02 = this.c.a(10).b(8).d(2);
            gjl<gyj.b> $$12 = $$02.a(gjl.a(gyj.b::a, gxx.this.A.m()).a(this.d()).a(c::a).a(0, 0, 150, 20, yh.c("selectWorld.mapType"), ($$0, $$1) -> gxx.this.A.a((gyj.b)$$1)));
            $$12.a(gxx.this.A.m());
            gxx.this.A.a((gyj $$1) -> {
                gyj.b $$2 = $$1.m();
                $$12.a($$2);
                if ($$2.b()) {
                    $$12.a((gyj.b)((Object)gks.a(d)));
                } else {
                    $$12.a((gyj.b)null);
                }
                $$0.k = gxx.this.A.m().c() != null;
            });
            this.l = $$02.a(gje.a(yh.c("selectWorld.customizeType"), (gje $$0) -> this.c()).a());
            gxx.this.A.a((gyj $$0) -> {
                this.l.k = !$$0.l() && $$0.n() != null;
            });
            this.k = new gjn(this, gxx.this.q, 308, 20, yh.c("selectWorld.enterSeed")){

                @Override
                protected yw f() {
                    return super.f().b(yg.v).b(i);
                }
            };
            this.k.c(i);
            this.k.a(gxx.this.A.h());
            this.k.b($$0 -> gxx.this.A.b(this.k.a()));
            $$02.a(goq.a(gxx.this.q, this.k, h), 2);
            gyg.a $$2 = gyg.a(310);
            $$2.a(e, gxx.this.A::i, gxx.this.A::b).a(() -> !gxx.this.A.l()).a(f);
            $$2.a(g, gxx.this.A::j, gxx.this.A::c).a(() -> !gxx.this.A.f() && !gxx.this.A.l());
            gyg $$3 = $$2.a();
            $$02.a($$3.a(), 2);
            gxx.this.A.a((gyj $$1) -> $$3.b());
        }

        private void c() {
            gye $$0 = gxx.this.A.n();
            if ($$0 != null) {
                gxx.this.n.a($$0.createEditScreen(gxx.this, gxx.this.A.k()));
            }
        }

        private gjl.e<gyj.b> d() {
            return new gjl.e<gyj.b>(){

                @Override
                public List<gyj.b> a() {
                    return gjl.a.getAsBoolean() ? gxx.this.A.p() : gxx.this.A.o();
                }

                @Override
                public List<gyj.b> b() {
                    return gxx.this.A.o();
                }
            };
        }

        private static yw a(gjl<gyj.b> $$0) {
            if ($$0.a().b()) {
                return yg.a(new yh[]{$$0.c(), d});
            }
            return $$0.c();
        }
    }

    class b
    extends gmr {
        private static final yh b = yh.c("createWorld.tab.more.title");
        private static final yh d = yh.c("selectWorld.gameRules");
        private static final yh e = yh.c("selectWorld.dataPacks");

        b() {
            super(b);
            got.b $$02 = this.c.b(8).d(1);
            $$02.a(gje.a(d, $$0 -> this.c()).a(210).a());
            $$02.a(gje.a(u, $$0 -> gxx.this.a(gxx.this.A.k().h())).a(210).a());
            $$02.a(gje.a(e, $$0 -> gxx.this.b(gxx.this.A.k().h())).a(210).a());
        }

        private void c() {
            gxx.this.n.a(new gxz(gxx.this.A.q().b(gxx.this.A.k().h().b()), $$0 -> {
                gxx.this.n.a(gxx.this);
                $$0.ifPresent(gxx.this.A::a);
            }));
        }
    }
}

