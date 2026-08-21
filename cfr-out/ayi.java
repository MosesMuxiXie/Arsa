/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Floats
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ayi
extends ayf
implements aia.a,
aib,
ayl,
xv {
    static final Logger i = LogUtils.getLogger();
    private static final int j = -1;
    private static final int k = 4096;
    private static final int l = 80;
    private static final int m = 5;
    public static final int f = 60;
    private static final yh n = yh.c("multiplayer.disconnect.chat_validation_failed");
    private static final yh o = yh.c("chat.disabled.invalid_command_signature").a(l.m);
    private static final int p = 1000;
    public axg g;
    public final ayd h;
    private int q;
    private int r = -1;
    private final bhl s = new bhl(20, 200);
    private final bhl t = new bhl(20, 1480);
    private double u;
    private double v;
    private double w;
    private double x;
    private double y;
    private double z;
    private @Nullable cgk A;
    private double B;
    private double C;
    private double D;
    private double E;
    private double F;
    private double G;
    private @Nullable ftm H;
    private int I;
    private int J;
    private boolean K;
    private int L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private @Nullable yz R;
    private zc.b S;
    private final yr T = new yr(20);
    private int U;
    private final yv V = yv.a();
    private final bft W;
    private boolean X;
    private boolean Y;
    private int Z;

    public ayi(MinecraftServer $$0, wu $$1, axg $$2, axu $$3) {
        super($$0, $$1, $$3);
        this.y();
        this.h = new ayd($$1.e());
        this.g = $$2;
        $$2.g = this;
        $$2.Y().a();
        this.S = zc.b.unsigned($$2.cY(), $$0::ay);
        this.W = new bft($$0);
    }

    @Override
    public void d() {
        if (this.r > -1) {
            this.b(new adf(this.r));
            this.r = -1;
        }
        if (!this.d.I() && this.t()) {
            return;
        }
        this.e();
        this.s.b();
        this.t.b();
        if (this.g.P() > 0L && this.d.aq() > 0 && bhs.c() - this.g.P() > TimeUnit.MINUTES.toMillis(this.d.aq()) && !this.g.k) {
            this.a(yh.c("multiplayer.disconnect.idling"));
        }
    }

    private boolean t() {
        this.m();
        this.g.Y = this.g.dP();
        this.g.Z = this.g.dR();
        this.g.aa = this.g.dV();
        this.g.h();
        this.g.a(this.u, this.v, this.w, this.g.ec(), this.g.ee());
        ++this.q;
        this.P = this.O;
        if (this.K && !this.g.gr() && !this.g.cq() && !this.g.fa()) {
            if (++this.L > this.a(this.g)) {
                i.warn("{} was kicked for floating too long!", (Object)this.g.aq());
                this.a(yh.c("multiplayer.disconnect.flying"));
                return true;
            }
        } else {
            this.K = false;
            this.L = 0;
        }
        this.A = this.g.du();
        if (this.A == this.g || this.A.dl() != this.g) {
            this.A = null;
            this.M = false;
            this.N = 0;
        } else {
            this.B = this.A.dP();
            this.C = this.A.dR();
            this.D = this.A.dV();
            this.E = this.A.dP();
            this.F = this.A.dR();
            this.G = this.A.dV();
            if (this.M && this.A.dl() == this.g) {
                if (++this.N > this.a(this.A)) {
                    i.warn("{} was kicked for floating a vehicle too long!", (Object)this.g.aq());
                    this.a(yh.c("multiplayer.disconnect.flying"));
                    return true;
                }
            } else {
                this.M = false;
                this.N = 0;
            }
        }
        return false;
    }

    private int a(cgk $$0) {
        double $$1 = $$0.bt();
        if ($$1 < (double)1.0E-5f) {
            return Integer.MAX_VALUE;
        }
        double $$2 = 0.08 / $$1;
        return bgj.e(80.0 * Math.max($$2, 1.0));
    }

    public void l() {
        this.L = 0;
        this.N = 0;
    }

    public void m() {
        this.u = this.g.dP();
        this.v = this.g.dR();
        this.w = this.g.dV();
        this.x = this.g.dP();
        this.y = this.g.dR();
        this.z = this.g.dV();
    }

    @Override
    public boolean c() {
        return this.e.i() && !this.X;
    }

    @Override
    public boolean a(aay<?> $$0) {
        if (super.a($$0)) {
            return true;
        }
        return this.X && this.e.i() && $$0 instanceof aiq;
    }

    @Override
    protected GameProfile i() {
        return this.g.gI();
    }

    private <T, R> CompletableFuture<R> a(T $$02, BiFunction<ayo, T, CompletableFuture<R>> $$1) {
        return $$1.apply(this.g.Y(), (ayo)$$02).thenApply($$0 -> {
            if (!this.c()) {
                i.debug("Ignoring packet due to disconnection");
                throw new CancellationException("disconnected");
            }
            return $$0;
        });
    }

    private CompletableFuture<axy> a(String $$0) {
        return this.a($$0, ayo::a);
    }

    private CompletableFuture<List<axy>> a(List<String> $$0) {
        return this.a($$0, ayo::a);
    }

    @Override
    public void a(ajk $$0) {
        abb.a($$0, this, this.g.A());
        this.g.a($$0.b());
        if (this.q()) {
            this.g.J();
            this.g.h($$0.b().f());
        }
    }

    private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
        return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite((float)$$4) || !Floats.isFinite((float)$$3);
    }

    private static double a(double $$0) {
        return bgj.a($$0, -3.0E7, 3.0E7);
    }

    private static double b(double $$0) {
        return bgj.a($$0, -2.0E7, 2.0E7);
    }

    @Override
    public void a(ajc $$0) {
        abb.a($$0, this, this.g.A());
        if (ayi.b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
            this.a(yh.c("multiplayer.disconnect.invalid_vehicle_movement"));
            return;
        }
        if (this.u() || !this.q()) {
            return;
        }
        cgk $$1 = this.g.du();
        if ($$1 != this.g && $$1.dl() == this.g && $$1 == this.A) {
            chl $$18;
            axf $$2 = this.g.A();
            double $$3 = $$1.dP();
            double $$4 = $$1.dR();
            double $$5 = $$1.dV();
            double $$6 = ayi.a($$0.b().a());
            double $$7 = ayi.b($$0.b().b());
            double $$8 = ayi.a($$0.b().c());
            float $$9 = bgj.f($$0.e());
            float $$10 = bgj.f($$0.f());
            double $$11 = $$6 - this.B;
            double $$12 = $$7 - this.C;
            double $$13 = $$8 - this.D;
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            double $$14 = $$1.dN().h();
            if ($$15 - $$14 > 100.0 && !this.h()) {
                i.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.aq(), this.g.aq(), $$11, $$12, $$13});
                this.b(afc.a($$1));
                return;
            }
            fth $$16 = $$1.dj();
            $$11 = $$6 - this.E;
            $$12 = $$7 - this.F;
            $$13 = $$8 - this.G;
            boolean $$17 = $$1.af;
            if ($$1 instanceof chl && ($$18 = (chl)$$1).fl()) {
                $$18.l();
            }
            $$1.a(chp.b, new ftm($$11, $$12, $$13));
            double $$19 = $$12;
            $$11 = $$6 - $$1.dP();
            $$12 = $$7 - $$1.dR();
            if ($$12 > -0.5 || $$12 < 0.5) {
                $$12 = 0.0;
            }
            $$13 = $$8 - $$1.dV();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
                $$20 = true;
                i.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.aq(), this.g.aq(), Math.sqrt($$15)});
            }
            if ($$20 && $$2.a($$1, $$16) || this.a($$2, $$1, $$16, $$6, $$7, $$8)) {
                $$1.a($$3, $$4, $$5, $$9, $$10);
                this.b(afc.a($$1));
                $$1.aX();
                return;
            }
            $$1.a($$6, $$7, $$8, $$9, $$10);
            this.g.A().p().a(this.g);
            ftm $$21 = new ftm($$1.dP() - $$3, $$1.dR() - $$4, $$1.dV() - $$5);
            this.a($$21);
            $$1.a($$0.g(), $$21);
            $$1.a($$21.g, $$21.h, $$21.i, $$0.g());
            this.g.a($$21.g, $$21.h, $$21.i);
            this.M = $$19 >= -0.03125 && !$$17 && !this.d.ag() && !$$1.em() && !$$1.br() && this.b($$1);
            this.E = $$1.dP();
            this.F = $$1.dR();
            this.G = $$1.dV();
        }
    }

    private boolean b(cgk $$0) {
        return $$0.ao().a($$0.dj().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(eog.a::l);
    }

    @Override
    public void a(aid $$0) {
        abb.a($$0, this, this.g.A());
        if ($$0.b() == this.I) {
            if (this.H == null) {
                this.a(yh.c("multiplayer.disconnect.invalid_player_movement"));
                return;
            }
            this.g.a(this.H.g, this.H.h, this.H.i, this.g.ec(), this.g.ee());
            this.x = this.H.g;
            this.y = this.H.h;
            this.z = this.H.i;
            this.g.T();
            this.H = null;
        }
    }

    @Override
    public void a(ajl $$0) {
        abb.a($$0, this, this.g.A());
        this.x();
    }

    @Override
    public void a(ajn $$0) {
        abb.a($$0, this, this.g.A());
        dqz.d $$1 = this.d.aJ().a($$0.b());
        if ($$1 != null) {
            this.g.L().d($$1.b().a());
        }
    }

    @Override
    public void a(ajq $$0) {
        abb.a($$0, this, this.g.A());
        this.g.cn.a($$0.b(), $$0.e());
    }

    @Override
    public void a(ajm $$0) {
        abb.a($$0, this, this.g.A());
        this.g.L().a($$0.b(), $$0.e(), $$0.f());
    }

    @Override
    public void a(ajp $$0) {
        abb.a($$0, this, this.g.A());
        if ($$0.e() == ajp.a.a) {
            amo $$1 = Objects.requireNonNull($$0.f());
            ac $$2 = this.d.aB().a($$1);
            if ($$2 != null) {
                this.g.U().a($$2);
            }
        }
    }

    @Override
    public void a(aip $$0) {
        abb.a($$0, this, this.g.A());
        StringReader $$12 = new StringReader($$0.e());
        if ($$12.canRead() && $$12.peek() == '/') {
            $$12.skip();
        }
        ParseResults $$2 = this.d.aF().a().parse($$12, (Object)this.g.C());
        this.d.aF().a().getCompletionSuggestions($$2).thenAccept($$1 -> {
            Suggestions $$2 = $$1.getList().size() <= 1000 ? $$1 : new Suggestions($$1.getRange(), $$1.getList().subList(0, 1000));
            this.b(new ads($$0.b(), $$2));
        });
    }

    @Override
    public void a(aju $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.hi()) {
            this.g.a(yh.c("advMode.notAllowed"));
            return;
        }
        dvo $$1 = null;
        elm $$2 = null;
        is $$3 = $$0.b();
        elb $$4 = this.g.A().c_($$3);
        if ($$4 instanceof elm) {
            elm $$5;
            $$2 = $$5 = (elm)$$4;
            $$1 = $$2.a();
        }
        String $$6 = $$0.e();
        boolean $$7 = $$0.f();
        if ($$1 != null) {
            elm.a $$8 = $$2.l();
            eoh $$9 = this.g.A().a_($$3);
            iz $$10 = $$9.c(eba.b);
            eoh $$11 = switch ($$0.i()) {
                case elm.a.a -> dzs.lD.m();
                case elm.a.b -> dzs.lC.m();
                default -> dzs.gC.m();
            };
            eoh $$12 = (eoh)((eoh)$$11.b(eba.b, $$10)).b(eba.c, $$0.g());
            if ($$12 != $$9) {
                this.g.A().a($$3, $$12, 2);
                $$4.c($$12);
                this.g.A().q($$3).a($$4);
            }
            $$1.a($$6);
            $$1.a($$7);
            if (!$$7) {
                $$1.b((yh)null);
            }
            $$2.b($$0.h());
            if ($$8 != $$0.i()) {
                $$2.f();
            }
            if (this.g.A().Y()) {
                $$1.a(this.g.A());
            }
            if (!bhi.b($$6)) {
                this.g.a(yh.a(this.g.A().Y() ? "advMode.setCommand.success" : "advMode.setCommand.disabled", new Object[]{$$6}));
            }
        }
    }

    @Override
    public void a(ajv $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.hi()) {
            this.g.a(yh.c("advMode.notAllowed"));
            return;
        }
        dvo $$1 = $$0.a(this.g.A());
        if ($$1 != null) {
            boolean $$3;
            String $$2 = $$0.b();
            $$1.a($$2);
            $$1.a($$0.e());
            if (!$$0.e()) {
                $$1.b((yh)null);
            }
            if ($$3 = this.g.A().Y()) {
                $$1.a(this.g.A());
            }
            if (!bhi.b($$2)) {
                this.g.a(yh.a($$3 ? "advMode.setCommand.success" : "advMode.setCommand.disabled", new Object[]{$$2}));
            }
        }
    }

    @Override
    public void a(aje $$0) {
        boolean $$4;
        axf $$1 = this.g.A();
        abb.a($$0, this, $$1);
        is $$2 = $$0.b();
        if (!this.g.a($$2, 1.0)) {
            return;
        }
        if (!$$1.t($$2)) {
            return;
        }
        eoh $$3 = $$1.a_($$2);
        dlt $$5 = $$3.a((dwr)$$1, $$2, $$4 = this.g.gv() && $$0.e());
        if ($$5.f()) {
            return;
        }
        if ($$4) {
            ayi.a($$3, $$1, $$2, $$5);
        }
        this.a($$5);
    }

    private static void a(eoh $$0, axf $$1, is $$2, dlt $$3) {
        elb $$4;
        elb elb2 = $$4 = $$0.x() ? $$1.c_($$2) : null;
        if ($$4 != null) {
            try (bgp.j $$5 = new bgp.j($$4.v(), i);){
                fnp $$6 = fnp.a($$5, $$1.J_());
                $$4.f($$6);
                $$4.b($$6);
                dkb.a($$3, $$4.s(), $$6);
                $$3.b($$4.t());
            }
        }
    }

    @Override
    public void a(ajf $$0) {
        axf $$1 = this.g.A();
        abb.a($$0, this, $$1);
        cgk $$2 = $$1.b($$0.b());
        if ($$2 == null || !this.g.b($$2, 3.0)) {
            return;
        }
        dlt $$3 = $$2.dZ();
        if ($$3 != null && !$$3.f()) {
            this.a($$3);
        }
    }

    private void a(dlt $$0) {
        if (!$$0.a(this.g.A().Q())) {
            return;
        }
        ddl $$1 = this.g.gK();
        int $$2 = $$1.d($$0);
        if ($$2 != -1) {
            if (ddl.f($$2)) {
                $$1.d($$2);
            } else {
                $$1.e($$2);
            }
        } else if (this.g.gv()) {
            $$1.c($$0);
        }
        this.b(new agv($$1.g()));
        this.g.cm.d();
    }

    @Override
    public void a(ajo $$0) {
        abb.a($$0, this, this.g.A());
        dhi dhi2 = this.g.cn;
        if (dhi2 instanceof dhm) {
            dhm $$1 = (dhm)dhi2;
            if (!$$1.b(this.g)) {
                i.debug("Player {} interacted with invalid menu {}", (Object)this.g, (Object)$$1);
                return;
            }
            $$1.a($$0.b());
        }
    }

    @Override
    public void a(ajs $$0) {
        abb.a($$0, this, this.g.A());
        dhi dhi2 = this.g.cn;
        if (dhi2 instanceof dho) {
            dho $$1 = (dho)dhi2;
            if (!this.g.cn.b(this.g)) {
                i.debug("Player {} interacted with invalid menu {}", (Object)this.g, (Object)this.g.cn);
                return;
            }
            $$1.a($$0.b(), $$0.e());
        }
    }

    @Override
    public void a(ajy $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.hi()) {
            return;
        }
        is $$1 = $$0.b();
        eoh $$2 = this.g.A().a_($$1);
        elb $$3 = this.g.A().c_($$1);
        if ($$3 instanceof emx) {
            emx $$4 = (emx)$$3;
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.a($$0.k());
            $$4.b($$0.l());
            $$4.a($$0.m());
            $$4.b($$0.n());
            $$4.e($$0.o());
            $$4.f($$0.p());
            $$4.a($$0.q());
            $$4.a($$0.r());
            if ($$4.f()) {
                String $$5 = $$4.d();
                if ($$0.e() == emx.a.b) {
                    if ($$4.D()) {
                        this.g.a(yh.a("structure_block.save_success", new Object[]{$$5}), false);
                    } else {
                        this.g.a(yh.a("structure_block.save_failure", new Object[]{$$5}), false);
                    }
                } else if ($$0.e() == emx.a.c) {
                    if (!$$4.F()) {
                        this.g.a(yh.a("structure_block.load_not_found", new Object[]{$$5}), false);
                    } else if ($$4.a(this.g.A())) {
                        this.g.a(yh.a("structure_block.load_success", new Object[]{$$5}), false);
                    } else {
                        this.g.a(yh.a("structure_block.load_prepare", new Object[]{$$5}), false);
                    }
                } else if ($$0.e() == emx.a.d) {
                    if ($$4.C()) {
                        this.g.a(yh.a("structure_block.size_success", new Object[]{$$5}), false);
                    } else {
                        this.g.a(yh.c("structure_block.size_failure"), false);
                    }
                }
            } else {
                this.g.a(yh.a("structure_block.invalid_structure_name", new Object[]{$$0.g()}), false);
            }
            $$4.e();
            this.g.A().a($$1, $$2, $$2, 3);
        }
    }

    @Override
    public void a(ajz $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.hi()) {
            return;
        }
        is $$1 = $$0.b();
        eoh $$2 = this.g.A().a_($$1);
        elb $$3 = this.g.A().c_($$1);
        if ($$3 instanceof emy) {
            emy $$4 = (emy)$$3;
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.e();
            this.g.A().a($$1, $$2, $$4.o(), 3);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(akd $$02) {
        elb elb2;
        abb.a($$02, this, this.g.A());
        is $$1 = $$02.b();
        if (!this.g.hi() || !((elb2 = this.g.A().c_($$1)) instanceof emz)) {
            return;
        }
        emz $$2 = (emz)elb2;
        if ($$02.e() == akd.a.b || $$02.e() == akd.a.a) {
            Optional<jy> $$9;
            yw $$7;
            jq<tb> $$4 = this.g.eo().f(mj.bv);
            Optional $$5 = $$02.f().a().flatMap($$4::a);
            if ($$5.isPresent()) {
                yh $$6 = ((tb)((jd.c)$$5.get()).a()).c();
            } else {
                $$7 = yh.c("test_instance.description.no_test").a(l.m);
            }
            if ($$02.e() == akd.a.b) {
                Optional $$8 = $$02.f().a().flatMap($$0 -> emz.a(this.g.A(), $$0));
            } else {
                $$9 = Optional.empty();
            }
            this.e.a(new ahp($$7, $$9));
        } else {
            void $$3;
            $$3.a($$02.f());
            if ($$02.e() == akd.a.d) {
                $$3.a(this.g::a);
            } else if ($$02.e() == akd.a.e) {
                $$3.b(this.g::a);
            } else if ($$02.e() == akd.a.f) {
                $$3.c(this.g::a);
            } else if ($$02.e() == akd.a.g) {
                $$3.d(this.g::a);
            }
            eoh $$10 = this.g.A().a_($$1);
            this.g.A().a($$1, dzs.a.m(), $$10, 3);
        }
    }

    @Override
    public void a(ajx $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.hi()) {
            return;
        }
        is $$1 = $$0.b();
        eoh $$2 = this.g.A().a_($$1);
        elb $$3 = this.g.A().c_($$1);
        if ($$3 instanceof emg) {
            emg $$4 = (emg)$$3;
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(amt.a(mj.bt, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.g.A().a($$1, $$2, $$2, 3);
        }
    }

    @Override
    public void a(aiz $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.hi()) {
            return;
        }
        is $$1 = $$0.b();
        elb $$2 = this.g.A().c_($$1);
        if ($$2 instanceof emg) {
            emg $$3 = (emg)$$2;
            $$3.a(this.g.A(), $$0.e(), $$0.f());
        }
    }

    @Override
    public void a(ajr $$0) {
        abb.a($$0, this, this.g.A());
        int $$1 = $$0.b();
        dhi dhi2 = this.g.cn;
        if (dhi2 instanceof diu) {
            diu $$2 = (diu)dhi2;
            if (!$$2.b(this.g)) {
                i.debug("Player {} interacted with invalid menu {}", (Object)this.g, (Object)$$2);
                return;
            }
            $$2.e($$1);
            $$2.h($$1);
        }
    }

    @Override
    public void a(aiw $$0) {
        int $$12 = $$0.b();
        if (!ddl.f($$12) && $$12 != 40) {
            return;
        }
        ArrayList $$2 = Lists.newArrayList();
        Optional<String> $$3 = $$0.f();
        $$3.ifPresent($$2::add);
        $$2.addAll($$0.e());
        Consumer<List> $$4 = $$3.isPresent() ? $$1 -> this.a((axy)$$1.get(0), $$1.subList(1, $$1.size()), $$12) : $$1 -> this.a((List<axy>)$$1, $$12);
        this.a($$2).thenAcceptAsync($$4, (Executor)this.d);
    }

    private void a(List<axy> $$0, int $$1) {
        dlt $$2 = this.g.gK().a($$1);
        if (!$$2.c(ki.ab)) {
            return;
        }
        List<axx<String>> $$3 = $$0.stream().map(this::a).toList();
        $$2.b(ki.ab, new dpk($$3));
    }

    private void a(axy $$02, List<axy> $$1, int $$2) {
        dlt $$3 = this.g.gK().a($$2);
        if (!$$3.c(ki.ab)) {
            return;
        }
        dlt $$4 = $$3.a((dwn)dlx.wl);
        $$4.e(ki.ab);
        List<axx<yh>> $$5 = $$1.stream().map($$0 -> this.a((axy)$$0).a(yh::b)).toList();
        $$4.b(ki.ac, new dpl(this.a($$02), this.g.aq(), 0, $$5, true));
        this.g.gK().a($$2, $$4);
    }

    private axx<String> a(axy $$0) {
        if (this.g.Z()) {
            return axx.a($$0.b());
        }
        return axx.a($$0);
    }

    @Override
    public void a(aix $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.I().hasPermission(bbr.b)) {
            return;
        }
        cgk $$1 = this.g.A().a($$0.e());
        if ($$1 != null) {
            try (bgp.j $$2 = new bgp.j($$1.es(), i);){
                fnp $$3 = fnp.a($$2, $$1.eo());
                $$1.d($$3);
                uz $$4 = $$3.b();
                this.b(new ahm($$0.b(), $$4));
            }
        }
    }

    @Override
    public void a(aiu $$0) {
        dhz $$1;
        abb.a($$0, this, this.g.A());
        if (this.g.au() || $$0.e() != this.g.cn.l) {
            return;
        }
        Object object = this.g.cn;
        if (object instanceof dhz && (object = ($$1 = (dhz)object).m()) instanceof elr) {
            elr $$2 = (elr)object;
            $$2.a($$0.b(), $$0.f());
        }
    }

    @Override
    public void a(aie $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.I().hasPermission(bbr.b)) {
            return;
        }
        elb $$1 = this.g.A().c_($$0.e());
        uz $$2 = $$1 != null ? $$1.c(this.g.eo()) : null;
        this.b(new ahm($$0.b(), $$2));
    }

    @Override
    public void a(ajb $$0) {
        boolean $$19;
        abb.a($$0, this, this.g.A());
        if (ayi.b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0f), $$0.b(0.0f))) {
            this.a(yh.c("multiplayer.disconnect.invalid_player_movement"));
            return;
        }
        axf $$1 = this.g.A();
        if (this.g.k) {
            return;
        }
        if (this.q == 0) {
            this.m();
        }
        if (!this.q()) {
            return;
        }
        float $$2 = bgj.f($$0.a(this.g.ec()));
        float $$3 = bgj.f($$0.b(this.g.ee()));
        if (this.u()) {
            this.g.b($$2, $$3);
            return;
        }
        double $$4 = ayi.a($$0.a(this.g.dP()));
        double $$5 = ayi.b($$0.b(this.g.dR()));
        double $$6 = ayi.a($$0.c(this.g.dV()));
        if (this.g.cq()) {
            this.g.a(this.g.dP(), this.g.dR(), this.g.dV(), $$2, $$3);
            this.g.A().p().a(this.g);
            return;
        }
        double $$7 = this.g.dP();
        double $$8 = this.g.dR();
        double $$9 = this.g.dV();
        double $$10 = $$4 - this.u;
        double $$11 = $$5 - this.v;
        double $$12 = $$6 - this.w;
        double $$13 = this.g.dN().h();
        double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
        if (this.g.gr()) {
            if ($$14 > 1.0) {
                this.a(this.g.dP(), this.g.dR(), this.g.dV(), $$2, $$3);
            }
            return;
        }
        boolean $$15 = this.g.gj();
        if ($$1.y().i()) {
            ++this.O;
            int $$16 = this.O - this.P;
            if ($$16 > 5) {
                i.debug("{} is sending move packets too frequently ({} packets since last tick)", (Object)this.g.aq(), (Object)$$16);
                $$16 = 1;
            }
            if (this.a($$15)) {
                float $$17;
                float f2 = $$17 = $$15 ? 300.0f : 100.0f;
                if ($$14 - $$13 > (double)($$17 * (float)$$16)) {
                    i.warn("{} moved too quickly! {},{},{}", new Object[]{this.g.aq(), $$10, $$11, $$12});
                    this.a(this.g.dP(), this.g.dR(), this.g.dV(), this.g.ec(), this.g.ee());
                    return;
                }
            }
        }
        fth $$18 = this.g.dj();
        $$10 = $$4 - this.x;
        $$11 = $$5 - this.y;
        $$12 = $$6 - this.z;
        boolean bl2 = $$19 = $$11 > 0.0;
        if (this.g.aV() && !$$0.b() && $$19) {
            this.g.u();
        }
        boolean $$20 = this.g.af;
        this.g.a(chp.b, new ftm($$10, $$11, $$12));
        double $$21 = $$11;
        $$10 = $$4 - this.g.dP();
        $$11 = $$5 - this.g.dR();
        if ($$11 > -0.5 || $$11 < 0.5) {
            $$11 = 0.0;
        }
        $$12 = $$6 - this.g.dV();
        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
        boolean $$22 = false;
        if (!(this.g.S() || !($$14 > 0.0625) || this.g.gr() || this.g.ha() || this.g.au() || this.g.hq())) {
            $$22 = true;
            i.warn("{} moved wrongly!", (Object)this.g.aq());
        }
        if (!this.g.ar && !this.g.gr() && ($$22 && $$1.a((cgk)this.g, $$18) || this.a($$1, this.g, $$18, $$4, $$5, $$6))) {
            this.a($$7, $$8, $$9, $$2, $$3);
            this.g.a(this.g.dP() - $$7, this.g.dR() - $$8, this.g.dV() - $$9, $$0.b());
            this.g.aX();
            return;
        }
        this.g.a($$4, $$5, $$6, $$2, $$3);
        boolean $$23 = this.g.fW();
        this.K = $$21 >= -0.03125 && !$$20 && !this.g.au() && !this.d.ag() && !this.g.gL().c && !this.g.d(cfo.y) && !$$15 && !$$23 && this.b(this.g);
        this.g.A().p().a(this.g);
        ftm $$24 = new ftm(this.g.dP() - $$7, this.g.dR() - $$8, this.g.dV() - $$9);
        this.g.a($$0.b(), $$0.e(), $$24);
        this.g.a($$24.g, $$24.h, $$24.i, $$0.b());
        this.a($$24);
        if ($$19) {
            this.g.l();
        }
        if ($$0.b() || this.g.ez() || this.g.fl() || this.g.au() || $$15 || $$23) {
            this.g.hp();
        }
        this.g.a(this.g.dP() - $$7, this.g.dR() - $$8, this.g.dV() - $$9);
        this.x = this.g.dP();
        this.y = this.g.dR();
        this.z = this.g.dV();
    }

    private boolean a(boolean $$0) {
        if (this.h()) {
            return false;
        }
        if (this.g.S()) {
            return false;
        }
        eua $$1 = this.g.A().U();
        if (!$$1.a(eua.H).booleanValue()) {
            return false;
        }
        return !$$0 || $$1.a(eua.i) != false;
    }

    private boolean u() {
        if (this.H != null) {
            if (this.q - this.J > 20) {
                this.J = this.q;
                this.a(this.H.g, this.H.h, this.H.i, this.g.ec(), this.g.ee());
            }
            return true;
        }
        this.J = this.q;
        return false;
    }

    private boolean a(dwr $$0, cgk $$1, fth $$2, double $$3, double $$4, double $$5) {
        fth $$6 = $$1.dj().d($$3 - $$1.dP(), $$4 - $$1.dR(), $$5 - $$1.dV());
        Iterable<fug> $$7 = $$0.a($$1, $$6.h(1.0E-5f), $$2.g());
        fug $$8 = fud.a($$2.h(1.0E-5f));
        for (fug $$9 : $$7) {
            if (fud.c($$9, $$8, ftq.i)) continue;
            return true;
        }
        return false;
    }

    public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
        this.a(new chy(new ftm($$0, $$1, $$2), ftm.c, $$3, $$4), Collections.emptySet());
    }

    public void a(chy $$0, Set<chz> $$1) {
        this.J = this.q;
        if (++this.I == Integer.MAX_VALUE) {
            this.I = 0;
        }
        this.g.a($$0, $$1);
        this.H = this.g.dI();
        this.b(afp.a(this.I, $$0, $$1));
    }

    @Override
    public void a(aji $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.q()) {
            return;
        }
        is $$1 = $$0.b();
        this.g.J();
        aji.a $$2 = $$0.f();
        switch ($$2) {
            case h: {
                if (this.g.au()) {
                    return;
                }
                dlt $$3 = this.g.b(cdb.a);
                if (this.g.c($$3, 5)) {
                    return;
                }
                dow $$4 = $$3.a(ki.N);
                if ($$4 != null) {
                    $$4.a(this.g, cgv.a);
                }
                return;
            }
            case g: {
                if (!this.g.au()) {
                    dlt $$5 = this.g.b(cdb.b);
                    this.g.a(cdb.b, this.g.b(cdb.a));
                    this.g.a(cdb.a, $$5);
                    this.g.gf();
                }
                return;
            }
            case e: {
                if (!this.g.au()) {
                    this.g.a(false);
                }
                return;
            }
            case d: {
                if (!this.g.au()) {
                    this.g.a(true);
                }
                return;
            }
            case f: {
                this.g.ge();
                return;
            }
            case a: 
            case b: 
            case c: {
                this.g.h.a($$1, $$2, $$0.e(), this.g.A().aw(), $$0.g());
                this.a($$0.g());
                return;
            }
        }
        throw new IllegalArgumentException("Invalid player action");
    }

    private static boolean a(axg $$0, dlt $$1) {
        dkh $$3;
        if ($$1.f()) {
            return false;
        }
        dlp $$2 = $$1.h();
        return ($$2 instanceof dkb || $$2 instanceof dkh && ($$3 = (dkh)$$2).a() != flc.a) && !$$0.hh().a($$1);
    }

    @Override
    public void a(ake $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.q()) {
            return;
        }
        this.a($$0.f());
        axf $$1 = this.g.A();
        cdb $$2 = $$0.b();
        dlt $$3 = this.g.b($$2);
        if (!$$3.a($$1.Q())) {
            return;
        }
        fti $$4 = $$0.e();
        ftm $$5 = $$4.g();
        is $$6 = $$4.b();
        if (!this.g.a($$6, 1.0)) {
            return;
        }
        ftm $$7 = $$5.d(ftm.b($$6));
        double $$8 = 1.0000001;
        if (!(Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001)) {
            i.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.g.gI().name(), $$5, $$6});
            return;
        }
        iz $$9 = $$4.c();
        this.g.J();
        int $$10 = this.g.A().aw();
        if ($$6.v() <= $$10) {
            if (this.H == null && $$1.a((cgk)this.g, $$6)) {
                cdc.d $$13;
                cdc $$11 = this.g.h.a(this.g, $$1, $$3, $$2, $$4);
                if ($$11.a()) {
                    aj.Q.a(this.g, $$4.b(), $$3.v());
                }
                if ($$9 == iz.b && !$$11.a() && $$6.v() >= $$10 && ayi.a(this.g, $$3)) {
                    yw $$12 = yh.a("build.tooHigh", $$10).a(l.m);
                    this.g.b($$12, true);
                } else if ($$11 instanceof cdc.d && ($$13 = (cdc.d)$$11).e() == cdc.e.c) {
                    this.g.a($$2, true);
                }
            }
        } else {
            yw $$14 = yh.a("build.tooHigh", $$10).a(l.m);
            this.g.b($$14, true);
        }
        this.b(new adj($$1, $$6));
        this.b(new adj($$1, $$6.a($$9)));
    }

    @Override
    public void a(akf $$0) {
        cdc.d $$7;
        cdc $$6;
        abb.a($$0, this, this.g.A());
        if (!this.q()) {
            return;
        }
        this.a($$0.e());
        axf $$1 = this.g.A();
        cdb $$2 = $$0.b();
        dlt $$3 = this.g.b($$2);
        this.g.J();
        if ($$3.f() || !$$3.a($$1.Q())) {
            return;
        }
        float $$4 = bgj.f($$0.f());
        float $$5 = bgj.f($$0.g());
        if ($$5 != this.g.ee() || $$4 != this.g.ec()) {
            this.g.b($$4, $$5);
        }
        if (($$6 = this.g.h.a(this.g, $$1, $$3, $$2)) instanceof cdc.d && ($$7 = (cdc.d)$$6).e() == cdc.e.c) {
            this.g.a($$2, true);
        }
    }

    @Override
    public void a(akc $$0) {
        abb.a($$0, this, this.g.A());
        if (this.g.au()) {
            for (axf $$1 : this.d.P()) {
                cgk $$2 = $$0.a($$1);
                if ($$2 == null) continue;
                this.g.a($$1, $$2.dP(), $$2.dR(), $$2.dV(), Set.of(), $$2.ec(), $$2.ee(), true);
                return;
            }
        }
    }

    @Override
    public void a(ajd $$0) {
        abb.a($$0, this, this.g.A());
        cgk $$1 = this.g.dA();
        if ($$1 instanceof dgb) {
            dgb $$2 = (dgb)$$1;
            $$2.a($$0.b(), $$0.e());
        }
    }

    @Override
    public void a(ww $$0) {
        i.info("{} lost connection: {}", (Object)this.g.aq(), (Object)$$0.a().getString());
        this.v();
        super.a($$0);
    }

    private void v() {
        this.W.close();
        this.d.at();
        this.d.aj().a(yh.a("multiplayer.player.left", this.g.R_()).a(l.o), false);
        this.g.v();
        this.d.aj().b(this.g);
        this.g.Y().b();
    }

    public void a(int $$0) {
        if ($$0 < 0) {
            throw new IllegalArgumentException("Expected packet sequence nr >= 0");
        }
        this.r = Math.max($$0, this.r);
    }

    @Override
    public void a(ajt $$0) {
        abb.a($$0, this, this.g.A());
        if ($$0.b() < 0 || $$0.b() >= ddl.i()) {
            i.warn("{} tried to set an invalid carried item", (Object)this.g.aq());
            return;
        }
        if (this.g.gK().g() != $$0.b() && this.g.ga() == cdb.a) {
            this.g.gf();
        }
        this.g.gK().d($$0.b());
        this.g.J();
    }

    @Override
    public void a(aik $$0) {
        Optional<yp> $$1 = this.a($$0.h());
        if ($$1.isEmpty()) {
            return;
        }
        this.a($$0.b(), false, () -> {
            void $$4;
            try {
                yy $$2 = this.a($$0, (yp)$$1.get());
            }
            catch (zc.a $$3) {
                this.a($$3);
                return;
            }
            CompletableFuture<axy> $$5 = this.a($$4.c());
            yh $$6 = this.d.bm().decorate(this.g, $$4.d());
            this.W.append($$5, arg_0 -> this.a((yy)$$4, $$6, arg_0));
        });
    }

    @Override
    public void a(aii $$0) {
        this.a($$0.b(), true, () -> {
            this.b($$0.b());
            this.w();
        });
    }

    private void b(String $$0) {
        ParseResults<ed> $$1 = this.c($$0);
        if (this.d.ay() && za.a($$1)) {
            i.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", (Object)this.g.gI().name(), (Object)$$0);
            this.g.a(o);
            return;
        }
        this.d.aF().a($$1, $$0);
    }

    @Override
    public void a(aij $$0) {
        Optional<yp> $$1 = this.a($$0.h());
        if ($$1.isEmpty()) {
            return;
        }
        this.a($$0.b(), true, () -> {
            this.a($$0, (yp)$$1.get());
            this.w();
        });
    }

    /*
     * WARNING - void declaration
     */
    private void a(aij $$0, yp $$12) {
        void $$5;
        ParseResults<ed> $$2 = this.c($$0.b());
        try {
            Map<String, yy> $$3 = this.a($$0, za.b($$2), $$12);
        }
        catch (zc.a $$4) {
            this.a($$4);
            return;
        }
        eb.a $$6 = new eb.a((Map<String, yy>)$$5);
        $$2 = ee.a($$2, $$1 -> $$1.a($$6, this.W));
        this.d.aF().a($$2, $$0.b());
    }

    private void a(zc.a $$0) {
        i.warn("Failed to update secure chat state for {}: '{}'", (Object)this.g.gI().name(), (Object)$$0.a().getString());
        this.g.a($$0.a().f().a(l.m));
    }

    private <S> Map<String, yy> a(aij $$0, za<S> $$1, yp $$2) throws zc.a {
        List<ek.a> $$3 = $$0.g().a();
        List<za.a<S>> $$4 = $$1.a();
        if ($$3.isEmpty()) {
            return this.b($$4);
        }
        Object2ObjectOpenHashMap $$5 = new Object2ObjectOpenHashMap();
        for (ek.a a2 : $$3) {
            za.a<S> $$7 = $$1.a(a2.a());
            if ($$7 == null) {
                this.S.setChainBroken();
                throw ayi.a($$0.b(), $$3, $$4);
            }
            zb $$8 = new zb($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.S.unpack(a2.b(), $$8));
        }
        for (za.a a3 : $$4) {
            if ($$5.containsKey(a3.a())) continue;
            throw ayi.a($$0.b(), $$3, $$4);
        }
        return $$5;
    }

    private <S> Map<String, yy> b(List<za.a<S>> $$0) throws zc.a {
        HashMap<String, yy> $$1 = new HashMap<String, yy>();
        for (za.a<S> $$2 : $$0) {
            zb $$3 = zb.a($$2.c());
            $$1.put($$2.a(), this.S.unpack(null, $$3));
        }
        return $$1;
    }

    private static <S> zc.a a(String $$0, List<ek.a> $$1, List<za.a<S>> $$2) {
        String $$3 = $$1.stream().map(ek.a::a).collect(Collectors.joining(", "));
        String $$4 = $$2.stream().map(za.a::a).collect(Collectors.joining(", "));
        i.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
        return new zc.a(o);
    }

    private ParseResults<ed> c(String $$0) {
        CommandDispatcher<ed> $$1 = this.d.aF().a();
        return $$1.parse($$0, (Object)this.g.C());
    }

    private void a(String $$0, boolean $$1, Runnable $$2) {
        if (ayi.d($$0)) {
            this.a(yh.c("multiplayer.disconnect.illegal_characters"));
            return;
        }
        if (!$$1 && this.g.G() == ddj.c) {
            this.b(new ahk(yh.c("chat.disabled.options").a(l.m), false));
            return;
        }
        this.g.J();
        this.d.execute($$2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Optional<yp> a(yp.b $$0) {
        yr yr2 = this.T;
        synchronized (yr2) {
            try {
                yp $$1 = this.T.a($$0);
                return Optional.of($$1);
            }
            catch (yr.a $$2) {
                i.error("Failed to validate message acknowledgements from {}: {}", (Object)this.g.aq(), (Object)$$2.getMessage());
                this.a(n);
                return Optional.empty();
            }
        }
    }

    private static boolean d(String $$0) {
        for (int $$1 = 0; $$1 < $$0.length(); ++$$1) {
            if (bhi.a($$0.charAt($$1))) continue;
            return true;
        }
        return false;
    }

    private yy a(aik $$0, yp $$1) throws zc.a {
        zb $$2 = new zb($$0.b(), $$0.e(), $$0.f(), $$1);
        return this.S.unpack($$0.g(), $$2);
    }

    private void a(yy $$0) {
        this.d.aj().a($$0, this.g, yd.a(yd.e, this.g));
        this.w();
    }

    private void w() {
        this.s.a();
        if (!(this.s.c() || this.d.aj().f(this.g.gJ()) || this.d.a(this.g.gJ()))) {
            this.a(yh.c("disconnect.spam"));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(aih $$0) {
        yr yr2 = this.T;
        synchronized (yr2) {
            try {
                this.T.a($$0.b());
            }
            catch (yr.a $$1) {
                i.error("Failed to validate message acknowledgement offset from {}: {}", (Object)this.g.aq(), (Object)$$1.getMessage());
                this.a(n);
            }
        }
    }

    @Override
    public void a(akb $$0) {
        abb.a($$0, this, this.g.A());
        this.g.J();
        this.g.a($$0.b());
    }

    @Override
    public void a(ajj $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.q()) {
            return;
        }
        this.g.J();
        switch ($$0.e()) {
            case b: {
                this.g.i(true);
                break;
            }
            case c: {
                this.g.i(false);
                break;
            }
            case a: {
                if (!this.g.gr()) break;
                this.g.a(false, true);
                this.H = this.g.dI();
                break;
            }
            case d: {
                cgk cgk2 = this.g.dA();
                if (!(cgk2 instanceof chv)) break;
                chv $$1 = (chv)((Object)cgk2);
                int $$2 = $$0.f();
                if (!$$1.a() || $$2 <= 0) break;
                $$1.b($$2);
                break;
            }
            case e: {
                cgk cgk3 = this.g.dA();
                if (!(cgk3 instanceof chv)) break;
                chv $$3 = (chv)((Object)cgk3);
                $$3.b();
                break;
            }
            case f: {
                cgk cgk4 = this.g.dz();
                if (!(cgk4 instanceof cha)) break;
                cha $$4 = (cha)((Object)cgk4);
                $$4.b(this.g);
                break;
            }
            case g: {
                if (this.g.gR()) break;
                this.g.fK();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void a(yy $$0, yd.a $$1) {
        void $$4;
        this.b(new afi(this.U++, $$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.V), $$0.n(), $$0.o(), $$1));
        yu $$2 = $$0.l();
        if ($$2 == null) {
            return;
        }
        this.V.a($$0.m(), $$0.l());
        yr yr2 = this.T;
        synchronized (yr2) {
            this.T.a($$2);
            int $$3 = this.T.a();
        }
        if ($$4 > 4096) {
            this.a(yh.c("multiplayer.disconnect.too_many_pending_chats"));
        }
    }

    public void a(yh $$0, yd.a $$1) {
        this.b(new aeh($$0, $$1));
    }

    public SocketAddress n() {
        return this.e.d();
    }

    public void o() {
        this.X = true;
        this.v();
        this.b(ahi.a);
        this.e.a(acp.d);
    }

    @Override
    public void a(alm $$0) {
        this.e.a(new alj($$0.b()));
    }

    @Override
    public void a(aiy $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.q()) {
            return;
        }
        final axf $$1 = this.g.A();
        final cgk $$2 = $$0.a($$1);
        this.g.J();
        this.g.h($$0.b());
        if ($$2 != null) {
            if (!$$1.w().a($$2.dK())) {
                return;
            }
            fth $$3 = $$2.dj();
            if ($$0.a(this.g, $$3, 3.0)) {
                $$0.a(new aiy.c(){

                    private void a(cdb $$0, a $$12) {
                        dlt $$22 = ayi.this.g.b($$0);
                        if (!$$22.a($$1.Q())) {
                            return;
                        }
                        dlt $$3 = $$22.v();
                        cdc $$4 = $$12.run(ayi.this.g, $$2, $$0);
                        if ($$4 instanceof cdc.d) {
                            cdc.d $$5 = (cdc.d)$$4;
                            dlt $$6 = $$5.c() ? $$3 : dlt.l;
                            aj.U.a(ayi.this.g, $$6, $$2);
                            if ($$5.e() == cdc.e.c) {
                                ayi.this.g.a($$0, true);
                            }
                        }
                    }

                    @Override
                    public void a(cdb $$0) {
                        this.a($$0, ddm::a);
                    }

                    @Override
                    public void a(cdb $$0, ftm $$12) {
                        this.a($$0, (axg $$1, cgk $$2, cdb $$3) -> $$2.a($$1, $$12, $$3));
                    }

                    @Override
                    public void a() {
                        deh $$0;
                        if ($$2 instanceof czl || $$2 instanceof cgz || $$2 == ayi.this.g || $$2 instanceof deh && !($$0 = (deh)$$2).cT()) {
                            ayi.this.a(yh.c("multiplayer.disconnect.invalid_entity_attacked"));
                            i.warn("Player {} tried to attack an invalid entity", (Object)ayi.this.g.aq());
                            return;
                        }
                        dlt $$12 = ayi.this.g.b(cdb.a);
                        if (!$$12.a($$1.Q())) {
                            return;
                        }
                        if (ayi.this.g.c($$12, 5)) {
                            return;
                        }
                        ayi.this.g.e($$2);
                    }
                });
            }
        }
    }

    @Override
    public void a(ain $$0) {
        abb.a($$0, this, this.g.A());
        this.g.J();
        ain.a $$1 = $$0.b();
        switch ($$1) {
            case a: {
                if (this.g.k) {
                    this.g.k = false;
                    this.g = this.d.aj().a(this.g, true, cgk.e.e);
                    this.m();
                    this.y();
                    aj.w.a(this.g, dwo.j, dwo.h);
                    break;
                }
                if (this.g.eZ() > 0.0f) {
                    return;
                }
                this.g = this.d.aj().a(this.g, false, cgk.e.a);
                this.m();
                this.y();
                if (!this.d.v_()) break;
                this.g.a(dwl.d);
                this.g.A().U().a(eua.ab, false, this.d);
                break;
            }
            case b: {
                this.g.K().a(this.g);
            }
        }
    }

    @Override
    public void a(ait $$0) {
        abb.a($$0, this, this.g.A());
        this.g.s();
    }

    @Override
    public void a(ais $$0) {
        abb.a($$0, this, this.g.A());
        this.g.J();
        if (this.g.cn.l != $$0.b()) {
            return;
        }
        if (this.g.au()) {
            this.g.cn.b();
            return;
        }
        if (!this.g.cn.b(this.g)) {
            i.debug("Player {} interacted with invalid menu {}", (Object)this.g, (Object)this.g.cn);
            return;
        }
        short $$1 = $$0.f();
        if (!this.g.cn.a($$1)) {
            i.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.g.aq(), (int)$$1, this.g.cn.k.size()});
            return;
        }
        boolean $$2 = $$0.e() != this.g.cn.j();
        this.g.cn.h();
        this.g.cn.a($$1, (int)$$0.g(), $$0.h(), this.g);
        for (Int2ObjectMap.Entry $$3 : Int2ObjectMaps.fastIterable($$0.i())) {
            this.g.cn.a($$3.getIntKey(), (xa)$$3.getValue());
        }
        this.g.cn.a($$0.j());
        this.g.cn.i();
        if ($$2) {
            this.g.cn.e();
        } else {
            this.g.cn.d();
        }
    }

    @Override
    public void a(ajg $$0) {
        abb.a($$0, this, this.g.A());
        this.g.J();
        if (this.g.au() || this.g.cn.l != $$0.b()) {
            return;
        }
        if (!this.g.cn.b(this.g)) {
            i.debug("Player {} interacted with invalid menu {}", (Object)this.g, (Object)this.g.cn);
            return;
        }
        dqz.d $$1 = this.d.aJ().a($$0.e());
        if ($$1 == null) {
            return;
        }
        dqx<?> $$2 = $$1.b();
        if (!this.g.L().b($$2.a())) {
            return;
        }
        dhi dhi2 = this.g.cn;
        if (dhi2 instanceof diz) {
            diz $$3 = (diz)dhi2;
            if ($$2.b().aq_().c()) {
                i.debug("Player {} tried to place impossible recipe {}", (Object)this.g, (Object)$$2.a().a());
                return;
            }
            diz.a $$4 = $$3.a($$0.f(), this.g.ha(), $$2, this.g.A(), this.g.gK());
            if ($$4 == diz.a.b) {
                this.b(new afg(this.g.cn.l, $$1.a().b()));
            }
        }
    }

    @Override
    public void a(air $$0) {
        abb.a($$0, this, this.g.A());
        this.g.J();
        if (this.g.cn.l != $$0.b() || this.g.au()) {
            return;
        }
        if (!this.g.cn.b(this.g)) {
            i.debug("Player {} interacted with invalid menu {}", (Object)this.g, (Object)this.g.cn);
            return;
        }
        boolean $$1 = this.g.cn.a((ddm)this.g, $$0.e());
        if ($$1) {
            this.g.cn.d();
        }
    }

    @Override
    public void a(ajw $$0) {
        abb.a($$0, this, this.g.A());
        if (this.g.gv()) {
            boolean $$4;
            boolean $$1 = $$0.b() < 0;
            dlt $$2 = $$0.e();
            if (!$$2.a(this.g.A().Q())) {
                return;
            }
            boolean $$3 = $$0.b() >= 1 && $$0.b() <= 45;
            boolean bl2 = $$4 = $$2.f() || $$2.N() <= $$2.k();
            if ($$3 && $$4) {
                this.g.cm.b($$0.b()).e($$2);
                this.g.cm.a((int)$$0.b(), $$2);
                this.g.cm.d();
            } else if ($$1 && $$4) {
                if (this.t.c()) {
                    this.t.a();
                    this.g.a($$2, true);
                } else {
                    i.warn("Player {} was dropping items too fast in creative mode, ignoring.", (Object)this.g.aq());
                }
            }
        }
    }

    @Override
    public void a(aka $$0) {
        List<String> $$12 = Stream.of($$0.f()).map(l::a).collect(Collectors.toList());
        this.a($$12).thenAcceptAsync($$1 -> this.a($$0, (List<axy>)$$1), (Executor)this.d);
    }

    /*
     * WARNING - void declaration
     */
    private void a(aka $$0, List<axy> $$1) {
        this.g.J();
        axf $$2 = this.g.A();
        is $$3 = $$0.b();
        if ($$2.H($$3)) {
            void $$6;
            elb $$4 = $$2.c_($$3);
            if (!($$4 instanceof ems)) {
                return;
            }
            ems $$5 = (ems)$$4;
            $$6.a((ddm)this.g, $$0.e(), $$1);
        }
    }

    @Override
    public void a(ajh $$0) {
        abb.a($$0, this, this.g.A());
        this.g.gL().b = $$0.b() && this.g.gL().c;
    }

    @Override
    public void a(abw $$0) {
        abb.a($$0, this, this.g.A());
        boolean $$1 = this.g.a(ddo.g);
        this.g.a($$0.b());
        if (this.g.a(ddo.g) != $$1) {
            this.d.aj().a(new afn(afn.a.h, this.g));
        }
    }

    @Override
    public void a(aif $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.I().hasPermission(bbr.b) && !this.h()) {
            i.warn("Player {} tried to change difficulty to {} without required permissions", (Object)this.g.gI().name(), (Object)$$0.b().b());
            return;
        }
        this.d.a($$0.b(), false);
    }

    @Override
    public void a(aig $$0) {
        abb.a($$0, this, this.g.A());
        if (!ape.a.a(this.g.I())) {
            i.warn("Player {} tried to change game mode to {} without required permissions", (Object)this.g.gI().name(), (Object)$$0.b().e().getString());
            return;
        }
        ape.a(this.g, $$0.b());
    }

    @Override
    public void a(aja $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.g.I().hasPermission(bbr.b) && !this.h()) {
            return;
        }
        this.d.c($$0.b());
    }

    @Override
    public void a(ail $$0) {
        abb.a($$0, this, this.g.A());
        yz.a $$1 = $$0.b();
        dds.a $$2 = this.R != null ? this.R.d().b() : null;
        dds.a $$3 = $$1.b();
        if (Objects.equals($$2, $$3)) {
            return;
        }
        if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(dds.a);
            return;
        }
        try {
            bgw $$4 = this.d.ar().a();
            if ($$4 == null) {
                i.warn("Ignoring chat session from {} due to missing Services public key", (Object)this.g.gI().name());
                return;
            }
            this.a($$1.a(this.g.gI(), $$4));
        }
        catch (dds.b $$5) {
            i.error("Failed to validate profile key: {}", (Object)$$5.getMessage());
            this.a($$5.a());
        }
    }

    @Override
    public void a(aiq $$0) {
        if (!this.X) {
            throw new IllegalStateException("Client acknowledged config, but none was requested");
        }
        this.e.a(acp.b, new ayg(this.d, this.e, this.a(this.g.E())));
    }

    @Override
    public void a(aim $$0) {
        abb.a($$0, this, this.g.A());
        this.h.a($$0.b());
    }

    @Override
    public void a(aiv $$0) {
        abb.a($$0, this, this.g.A());
        this.g.a($$0.b());
    }

    private void a(yz $$0) {
        this.R = $$0;
        this.S = $$0.a(this.g.cY());
        this.W.append(() -> {
            this.g.a($$0);
            this.d.aj().a(new afn(EnumSet.of(afn.a.b), List.of(this.g)));
        });
    }

    @Override
    public void a(aby $$0) {
    }

    @Override
    public void a(aio $$0) {
        abb.a($$0, this, this.g.A());
        if (!this.Q) {
            this.g.a(ftm.c);
        }
        this.Q = false;
    }

    private void a(ftm $$0) {
        if ($$0.h() > (double)1.0E-5f) {
            this.g.J();
        }
        this.g.a($$0);
        this.Q = true;
    }

    @Override
    public boolean a() {
        return this.g.gv();
    }

    @Override
    public axg p() {
        return this.g;
    }

    public boolean q() {
        return !this.Y && this.Z <= 0;
    }

    public void r() {
        if (this.Z > 0) {
            --this.Z;
        }
    }

    private void x() {
        this.Z = 0;
    }

    public void s() {
        this.Y = true;
    }

    private void y() {
        this.Y = false;
        this.Z = 60;
    }

    private /* synthetic */ void a(yy $$0, yh $$1, axy $$2) {
        yy $$3 = $$0.a($$1).a($$2.e());
        this.a($$3);
    }

    @FunctionalInterface
    static interface a {
        public cdc run(axg var1, cgk var2, cdb var3);
    }
}

