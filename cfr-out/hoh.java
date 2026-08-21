/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.SortedSet;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;

public class hoh
implements bba,
AutoCloseable {
    private static final amo f = amo.b("transparency");
    private static final amo g = amo.b("entity_outline");
    public static final int a = 16;
    public static final int b = 8;
    public static final int c = 32;
    private static final int h = 15;
    private static final float i = 0.3f;
    private final gfj j;
    private final hwo k;
    private final hrh l;
    private final hoz m;
    private @Nullable hpk n;
    private final hnv o = new hnv();
    private final hpu p = new hpu();
    private final hpt q = new hpt();
    private final ikt r = new ikt();
    public final hug d = new hug();
    public final huk e = new huk();
    private @Nullable hif s;
    private final hpf t = new hpf();
    private final ObjectArrayList<hts.a> u = new ObjectArrayList(10000);
    private final ObjectArrayList<hts.a> v = new ObjectArrayList(50);
    private @Nullable hpr w;
    private int x;
    private final Int2ObjectMap<awe> y = new Int2ObjectOpenHashMap();
    private final Long2ObjectMap<SortedSet<awe>> z = new Long2ObjectOpenHashMap();
    private @Nullable fxt A;
    private final hoi B = new hoi();
    private int C = Integer.MIN_VALUE;
    private int D = Integer.MIN_VALUE;
    private int E = Integer.MIN_VALUE;
    private double F = Double.MIN_VALUE;
    private double G = Double.MIN_VALUE;
    private double H = Double.MIN_VALUE;
    private double I = Double.MIN_VALUE;
    private double J = Double.MIN_VALUE;
    private @Nullable hts K;
    private int L = -1;
    private boolean M;
    private @Nullable htx N;
    private @Nullable is O;
    private int P;
    private final ikq Q;
    private final hpp R;
    private final ige S;
    private @Nullable fzf T;
    private final uq U = new uq();
    private b V = new b(new ihb(), new ihb());

    public hoh(gfj $$0, hwo $$1, hrh $$2, hoz $$3, ikq $$4, ige $$5) {
        this.j = $$0;
        this.k = $$1;
        this.l = $$2;
        this.m = $$3;
        this.R = $$5.c();
        this.Q = $$4;
        this.S = $$5;
    }

    @Override
    public void close() {
        if (this.A != null) {
            this.A.a();
        }
        if (this.n != null) {
            this.n.close();
        }
        if (this.T != null) {
            this.T.close();
        }
        this.o.close();
    }

    @Override
    public void a(baz $$0) {
        this.a();
        if (this.n != null) {
            this.n.close();
        }
        this.n = new hpk(this.j.af(), this.j.aL());
    }

    public void a() {
        if (this.A != null) {
            this.A.a();
        }
        this.A = new fxu("Entity Outline", this.j.aR().k(), this.j.aR().l(), true);
    }

    private @Nullable hov B() {
        if (!gfj.T()) {
            return null;
        }
        hov $$0 = this.j.ag().a(f, hoi.j);
        if ($$0 == null) {
            this.j.k.p().a(false);
            this.j.k.aQ();
        }
        return $$0;
    }

    public void b() {
        if (this.c()) {
            this.A.a(this.j.l().d());
        }
    }

    protected boolean c() {
        return !this.j.i.f() && this.A != null && this.j.s != null;
    }

    public void a(@Nullable hif $$0) {
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.E = Integer.MIN_VALUE;
        this.s = $$0;
        if ($$0 != null) {
            this.d();
        } else {
            this.k.a();
            if (this.w != null) {
                this.w.a();
                this.w = null;
            }
            if (this.K != null) {
                this.K.d();
            }
            this.K = null;
            this.t.a((hpr)null);
            this.C();
        }
        this.e.a();
    }

    private void C() {
        this.u.clear();
        this.v.clear();
    }

    public void d() {
        if (this.s == null) {
            return;
        }
        this.s.h();
        if (this.K == null) {
            this.K = new hts(this.s, this, bhs.h(), this.m, this.j.ax(), this.j.az());
        } else {
            this.K.a(this.s);
        }
        this.o.a();
        hoe.a(this.j.k.n().b());
        eei.a(this.j.k.n().b());
        this.L = this.j.k.aY();
        if (this.w != null) {
            this.w.a();
        }
        this.K.b();
        this.w = new hpr(this.K, this.s, this.j.k.aY(), this);
        this.t.a(this.w);
        this.C();
        ger $$0 = this.j.i.p();
        this.w.a(jw.a($$0.b()));
    }

    public void a(int $$0, int $$1) {
        this.p();
        if (this.A != null) {
            this.A.a($$0, $$1);
        }
    }

    public @Nullable String e() {
        if (this.w == null) {
            return null;
        }
        int $$0 = this.w.f.length;
        int $$1 = this.i();
        return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.j.z ? "(s) " : "", this.L, this.K == null ? "null" : this.K.e());
    }

    public @Nullable hts f() {
        return this.K;
    }

    public double g() {
        return this.w == null ? 0.0 : (double)this.w.f.length;
    }

    public double h() {
        return this.L;
    }

    public int i() {
        int $$0 = 0;
        for (hts.a $$1 : this.u) {
            if (!$$1.d().a()) continue;
            ++$$0;
        }
        return $$0;
    }

    public void j() {
        if (this.T != null) {
            this.T.close();
        }
        this.T = null;
    }

    public @Nullable String k() {
        if (this.s == null) {
            return null;
        }
        return "E: " + this.Q.b.size() + "/" + this.s.i() + ", SD: " + this.s.n();
    }

    private void a(ger $$0, htx $$1, boolean $$2) {
        ftm $$3 = $$0.b();
        if (this.j.k.aY() != this.L) {
            this.d();
        }
        bzm $$4 = bzl.a();
        $$4.a("repositionCamera");
        int $$5 = jw.a($$3.a());
        int $$6 = jw.a($$3.b());
        int $$7 = jw.a($$3.c());
        if (this.C != $$5 || this.D != $$6 || this.E != $$7) {
            this.C = $$5;
            this.D = $$6;
            this.E = $$7;
            this.w.a(jw.a($$3));
            this.p.a();
        }
        this.K.a($$3);
        double $$8 = Math.floor($$3.g / 8.0);
        double $$9 = Math.floor($$3.h / 8.0);
        double $$10 = Math.floor($$3.i / 8.0);
        if ($$8 != this.F || $$9 != this.G || $$10 != this.H) {
            this.t.a();
        }
        this.F = $$8;
        this.G = $$9;
        this.H = $$10;
        $$4.c();
        if (this.N == null) {
            boolean $$11 = this.j.z;
            if ($$2 && this.s.a_($$0.d()).s()) {
                $$11 = false;
            }
            $$4.a("updateSOG");
            this.t.a($$11, $$0, $$1, (List<hts.a>)this.u, this.s.j().a());
            $$4.c();
            double $$12 = Math.floor($$0.e() / 2.0f);
            double $$13 = Math.floor($$0.f() / 2.0f);
            if (this.t.b() || $$12 != this.I || $$13 != this.J) {
                $$4.a("applyFrustum");
                this.b(hoh.a($$1));
                $$4.c();
                this.I = $$12;
                this.J = $$13;
            }
        }
    }

    public static htx a(htx $$0) {
        return new htx($$0).a(8);
    }

    private void b(htx $$0) {
        if (!gfj.V().bK()) {
            throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
        }
        this.C();
        this.t.a($$0, (List<hts.a>)this.u, (List<hts.a>)this.v);
    }

    public void a(hts.a $$0) {
        this.t.a($$0);
    }

    private htx a(Matrix4f $$0, Matrix4f $$1, ftm $$2) {
        htx $$4;
        if (this.N != null && !this.M) {
            htx $$3 = this.N;
        } else {
            $$4 = new htx($$0, $$1);
            $$4.a($$2.a(), $$2.b(), $$2.c());
        }
        if (this.M) {
            this.N = $$4;
            this.M = false;
        }
        return $$4;
    }

    public void a(fyt $$0, gez $$1, boolean $$2, ger $$3, Matrix4f $$4, Matrix4f $$5, Matrix4f $$6, GpuBufferSlice $$7, Vector4f $$8, boolean $$9) {
        int $$23;
        float $$10 = $$1.a(false);
        this.Q.j = this.s.au();
        this.l.a($$3);
        this.k.a($$3, this.j.t);
        final bzm $$11 = bzl.a();
        $$11.a("populateLightUpdates");
        this.s.d();
        $$11.b("runLightUpdates");
        this.s.j().r().a();
        $$11.b("prepareCullFrustum");
        ftm $$12 = $$3.b();
        htx $$13 = this.a($$4, $$6, $$12);
        $$11.b("cullTerrain");
        this.a($$3, $$13, this.j.s.au());
        $$11.b("compileSections");
        this.c($$3);
        $$11.b("extract");
        $$11.a("entities");
        this.a($$3, $$13, $$1, this.Q);
        $$11.b("blockEntities");
        this.a($$3, $$10, this.Q);
        $$11.b("blockOutline");
        this.b($$3, this.Q);
        $$11.b("blockBreaking");
        this.a($$3, this.Q);
        $$11.b("weather");
        this.q.a((dwo)this.s, this.x, $$10, $$12, this.Q.g);
        $$11.b("sky");
        this.n.a(this.s, $$10, $$3, this.Q.i);
        $$11.b("border");
        this.p.a(this.s.w(), $$10, $$12, this.j.k.aY() * 16, this.Q.h);
        $$11.c();
        $$11.b("debug");
        this.d.a($$13, $$12.g, $$12.h, $$12.i, $$1.a(false));
        this.e.b();
        $$11.b("setupFrameGraph");
        Matrix4fStack $$14 = RenderSystem.getModelViewStack();
        $$14.pushMatrix();
        $$14.mul((Matrix4fc)$$4);
        fwv $$15 = new fwv();
        this.B.k = $$15.a("main", this.j.l());
        int $$16 = this.j.l().c;
        int $$17 = this.j.l().d;
        fyu $$18 = new fyu($$16, $$17, true, 0);
        hov $$19 = this.B();
        if ($$19 != null) {
            this.B.l = $$15.a("translucent", $$18);
            this.B.m = $$15.a("item_entity", $$18);
            this.B.n = $$15.a("particles", $$18);
            this.B.o = $$15.a("weather", $$18);
            this.B.p = $$15.a("clouds", $$18);
        }
        if (this.A != null) {
            this.B.q = $$15.a("entity_outline", this.A);
        }
        fww $$20 = $$15.a("clear");
        this.B.k = $$20.b(this.B.k);
        $$20.a(() -> {
            fxt $$1 = this.j.l();
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$1.c(), bel.a(0.0f, $$0.x, $$0.y, $$0.z), $$1.e(), 1.0);
        });
        if ($$9) {
            this.a($$15, $$3, $$7);
        }
        this.a($$15, $$13, $$4, $$7, $$2, this.Q, $$1, $$11);
        hov $$21 = this.j.ag().a(g, hoi.i);
        if (this.Q.d && $$21 != null) {
            $$21.a($$15, $$16, $$17, this.B);
        }
        this.j.f.a(this.r, new htx($$13).a(-3.0f), $$3, $$10);
        this.a($$15, $$7);
        gev $$22 = this.j.k.aT();
        if ($$22 != gev.a && bel.b($$23 = $$3.k().a(ceg.k, $$10).intValue()) > 0) {
            float $$24 = $$3.k().a(ceg.l, $$10).floatValue();
            this.a($$15, $$22, this.Q.a.b, this.Q.j, $$10, $$23, $$24);
        }
        this.b($$15, $$7);
        if ($$19 != null) {
            $$19.a($$15, $$16, $$17, this.B);
        }
        this.a($$15, this.Q.a, $$7, $$4);
        $$11.b("executeFrameGraph");
        $$15.a($$0, new fwv.c(){

            @Override
            public void c(String $$0) {
                $$11.a($$0);
            }

            @Override
            public void d(String $$0) {
                $$11.c();
            }
        });
        this.B.a();
        $$14.popMatrix();
        $$11.c();
        this.Q.a();
    }

    private void a(fwv $$0, htx $$1, Matrix4f $$2, GpuBufferSlice $$3, boolean $$4, ikq $$5, gez $$6, bzm $$7) {
        fww $$8 = $$0.a("main");
        this.B.k = $$8.b(this.B.k);
        if (this.B.l != null) {
            this.B.l = $$8.b(this.B.l);
        }
        if (this.B.m != null) {
            this.B.m = $$8.b(this.B.m);
        }
        if (this.B.o != null) {
            this.B.o = $$8.b(this.B.o);
        }
        if ($$5.d && this.B.q != null) {
            this.B.q = $$8.b(this.B.q);
        }
        fyw<fxt> $$9 = this.B.k;
        fyw<fxt> $$10 = this.B.l;
        fyw<fxt> $$11 = this.B.m;
        fyw<fxt> $$12 = this.B.q;
        $$8.a(() -> {
            RenderSystem.setShaderFog($$3);
            ftm $$9 = $$1.a.b;
            double $$10 = $$9.a();
            double $$11 = $$9.b();
            double $$12 = $$9.c();
            $$7.a("terrain");
            if (this.T == null) {
                int $$13 = this.j.k.N().b() == gfv.c ? this.j.k.M() : 1;
                this.T = RenderSystem.getDevice().createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, $$13, OptionalDouble.empty());
            }
            htj $$14 = this.a((Matrix4fc)$$2, $$10, $$11, $$12);
            $$14.a(hti.a, this.T);
            this.j.i.t().a(fyd.a.a);
            if ($$11 != null) {
                ((fxt)$$11.get()).a(this.j.l());
            }
            if (this.c() && $$12 != null) {
                fxt $$15 = (fxt)$$12.get();
                RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$15.c(), 0, $$15.e(), 1.0);
            }
            fzm $$16 = new fzm();
            hon.a $$17 = this.m.c();
            hon.a $$18 = this.m.d();
            $$7.b("submitEntities");
            this.a($$16, $$5, (hpo)this.R);
            $$7.b("submitBlockEntities");
            this.a($$16, $$5, this.R);
            $$7.b("renderFeatures");
            this.S.a();
            $$17.a();
            this.a($$16);
            $$17.b(ijt.a());
            $$17.b(ijt.p());
            $$17.b(ijt.q());
            $$17.b(hpj.h());
            $$17.b(hpj.i());
            $$17.b(hpj.c());
            $$17.b(hpj.d());
            $$17.b(hpj.e());
            $$17.b(hpj.f());
            $$17.b(hpj.g());
            this.m.e().a();
            if ($$4) {
                this.a($$17, $$16, false, $$5);
            }
            $$7.c();
            this.E();
            this.V.a().a($$16, $$17, $$1.a, $$2);
            $$17.a();
            this.a($$16);
            $$17.b(hpj.j());
            $$17.b(hpj.a());
            $$17.b(hpj.b());
            $$17.b(ijt.f());
            $$17.b(ijt.h());
            $$17.b(ijt.g());
            $$17.b(ijt.i());
            $$7.a("destroyProgress");
            this.a($$16, $$18, $$5);
            $$18.b();
            $$7.c();
            this.a($$16);
            $$17.b(ijt.e());
            $$17.b();
            if ($$10 != null) {
                ((fxt)$$10.get()).a((fxt)$$9.get());
            }
            $$7.a("translucent");
            $$14.a(hti.b, this.T);
            $$7.b("string");
            $$14.a(hti.c, this.T);
            if ($$4) {
                this.a($$17, $$16, true, $$5);
            }
            $$17.b();
            $$7.c();
        });
    }

    private void a(fwv $$0, GpuBufferSlice $$1) {
        fww $$2 = $$0.a("particles");
        if (this.B.n != null) {
            this.B.n = $$2.b(this.B.n);
            $$2.a(this.B.k);
        } else {
            this.B.k = $$2.b(this.B.k);
        }
        fyw<fxt> $$3 = this.B.k;
        fyw<fxt> $$4 = this.B.n;
        $$2.a(() -> {
            RenderSystem.setShaderFog($$1);
            if ($$4 != null) {
                ((fxt)$$4.get()).a((fxt)$$3.get());
            }
            this.r.a(this.R, this.Q.a);
            this.S.a();
            this.r.a();
        });
    }

    private void a(fwv $$0, gev $$1, ftm $$2, long $$3, float $$4, int $$5, float $$6) {
        fww $$7 = $$0.a("clouds");
        if (this.B.p != null) {
            this.B.p = $$7.b(this.B.p);
        } else {
            this.B.k = $$7.b(this.B.k);
        }
        $$7.a(() -> this.o.a($$5, $$1, $$6, $$2, $$3, $$4));
    }

    private void b(fwv $$0, GpuBufferSlice $$1) {
        int $$2 = this.j.k.aY() * 16;
        float $$3 = this.j.i.l();
        fww $$4 = $$0.a("weather");
        if (this.B.o != null) {
            this.B.o = $$4.b(this.B.o);
        } else {
            this.B.k = $$4.b(this.B.k);
        }
        $$4.a(() -> {
            RenderSystem.setShaderFog($$1);
            hon.a $$3 = this.m.c();
            ikp $$4 = this.Q.a;
            this.q.a($$3, $$4.b, this.Q.g);
            this.p.a(this.Q.h, $$4.b, $$2, $$3);
            $$3.b();
        });
    }

    private void a(fwv $$0, ikp $$1, GpuBufferSlice $$2, Matrix4f $$3) {
        fww $$4 = $$0.a("late_debug");
        this.B.k = $$4.b(this.B.k);
        if (this.B.m != null) {
            this.B.m = $$4.b(this.B.m);
        }
        fyw<fxt> $$5 = this.B.k;
        $$4.a(() -> {
            RenderSystem.setShaderFog($$2);
            fzm $$4 = new fzm();
            hon.a $$5 = this.m.c();
            RenderSystem.outputColorTextureOverride = ((fxt)$$5.get()).d();
            RenderSystem.outputDepthTextureOverride = ((fxt)$$5.get()).f();
            if (!this.V.b().a()) {
                fxt $$6 = gfj.V().l();
                RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$6.e(), 1.0);
                this.V.b().a($$4, $$5, $$1, $$3);
                $$5.a();
            }
            RenderSystem.outputColorTextureOverride = null;
            RenderSystem.outputDepthTextureOverride = null;
            this.a($$4);
        });
    }

    private void a(ger $$0, htx $$1, gez $$2, ikq $$3) {
        ftm $$4 = $$0.b();
        double $$5 = $$4.a();
        double $$6 = $$4.b();
        double $$7 = $$4.c();
        cdo $$8 = this.j.r.y();
        boolean $$9 = this.c();
        cgk.c(bgj.a((double)this.j.k.aY() / 8.0, 1.0, 2.5) * this.j.k.g().b());
        for (cgk $$10 : this.s.f()) {
            is $$11;
            if (!this.k.a($$10, $$1, $$5, $$6, $$7) && !$$10.B(this.j.s) || !this.s.e(($$11 = $$10.dK()).v()) && !this.a($$11) || $$10 == $$0.h() && !$$0.j() && (!($$0.h() instanceof chl) || !((chl)$$0.h()).gr()) || $$10 instanceof hnh && $$0.h() != $$10) continue;
            if ($$10.at == 0) {
                $$10.ao = $$10.dP();
                $$10.ap = $$10.dR();
                $$10.aq = $$10.dV();
            }
            float $$12 = $$2.a(!$$8.a($$10));
            idf $$13 = this.a($$10, $$12);
            $$3.b.add($$13);
            if (!$$13.d() || !$$9) continue;
            $$3.d = true;
        }
    }

    private void a(fzm $$0, ikq $$1, hpo $$2) {
        ftm $$3 = $$1.a.b;
        double $$4 = $$3.a();
        double $$5 = $$3.b();
        double $$6 = $$3.c();
        for (idf $$7 : $$1.b) {
            if (!$$1.d) {
                $$7.U = 0;
            }
            this.k.a($$7, $$1.a, $$7.I - $$4, $$7.J - $$5, $$7.K - $$6, $$0, $$2);
        }
    }

    private void a(ger $$0, float $$1, ikq $$2) {
        ftm $$3 = $$0.b();
        double $$4 = $$3.a();
        double $$5 = $$3.b();
        double $$6 = $$3.c();
        fzm $$7 = new fzm();
        for (hts.a $$8 : this.u) {
            List<elb> $$9 = $$8.d().b();
            if ($$9.isEmpty() || $$8.a(bhs.c()) < 0.3f) continue;
            for (elb $$10 : $$9) {
                Object $$15;
                igi.a $$14;
                is $$11 = $$10.aD_();
                SortedSet $$12 = (SortedSet)this.z.get($$11.a());
                if ($$12 == null || $$12.isEmpty()) {
                    Object $$13 = null;
                } else {
                    $$7.a();
                    $$7.a((double)$$11.u() - $$4, (double)$$11.v() - $$5, (double)$$11.w() - $$6);
                    $$14 = new igi.a(((awe)$$12.last()).c(), $$7.c());
                    $$7.b();
                }
                if (($$15 = this.l.a($$10, $$1, $$14)) == null) continue;
                $$2.c.add((hsm)$$15);
            }
        }
        Iterator<elb> $$16 = this.s.a().iterator();
        while ($$16.hasNext()) {
            elb $$17 = $$16.next();
            if ($$17.p()) {
                $$16.remove();
                continue;
            }
            Object $$18 = this.l.a($$17, $$1, null);
            if ($$18 == null) continue;
            $$2.c.add((hsm)$$18);
        }
    }

    private void a(fzm $$0, ikq $$1, hpp $$2) {
        ftm $$3 = $$1.a.b;
        double $$4 = $$3.a();
        double $$5 = $$3.b();
        double $$6 = $$3.c();
        for (hsm $$7 : $$1.c) {
            is $$8 = $$7.f;
            $$0.a();
            $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
            this.l.a($$7, $$0, $$2, $$1.a);
            $$0.b();
        }
    }

    private void a(ger $$0, ikq $$1) {
        ftm $$2 = $$0.b();
        double $$3 = $$2.a();
        double $$4 = $$2.b();
        double $$5 = $$2.c();
        $$1.f.clear();
        for (Long2ObjectMap.Entry $$6 : this.z.long2ObjectEntrySet()) {
            SortedSet $$8;
            is $$7 = is.d($$6.getLongKey());
            if ($$7.c($$3, $$4, $$5) > 1024.0 || ($$8 = (SortedSet)$$6.getValue()) == null || $$8.isEmpty()) continue;
            int $$9 = ((awe)$$8.last()).c();
            $$1.f.add(new ikn(this.s, $$7, $$9));
        }
    }

    private void a(fzm $$0, hon.a $$1, ikq $$2) {
        ftm $$3 = $$2.a.b;
        double $$4 = $$3.a();
        double $$5 = $$3.b();
        double $$6 = $$3.c();
        for (ikn $$7 : $$2.f) {
            $$0.a();
            is $$8 = $$7.b;
            $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
            fzm.a $$9 = $$0.c();
            fzn $$10 = new fzn($$1.a(inx.n.get($$7.f)), $$9, 1.0f);
            this.j.ax().a($$7.c, $$8, $$7, $$0, $$10);
            $$0.b();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void b(ger $$0, ikq $$1) {
        void $$3;
        $$1.e = null;
        ftk ftk2 = this.j.u;
        if (!(ftk2 instanceof fti)) {
            return;
        }
        fti $$2 = (fti)ftk2;
        if ($$3.d() == ftk.a.a) {
            return;
        }
        is $$4 = $$3.b();
        eoh $$5 = this.s.a_($$4);
        if (!$$5.l() && this.s.w().a($$4)) {
            boolean $$6 = hoe.a($$5).d();
            boolean $$7 = this.j.k.B().b();
            ftr $$8 = ftr.a($$0.h());
            fug $$9 = $$5.a((dvt)this.s, $$4, $$8);
            if (w.C) {
                fug $$10 = $$5.b((dvt)this.s, $$4, $$8);
                fug $$11 = $$5.h();
                fug $$12 = $$5.i(this.s, $$4);
                $$1.e = new iko($$4, $$6, $$7, $$9, $$10, $$11, $$12);
            } else {
                $$1.e = new iko($$4, $$6, $$7, $$9);
            }
        }
    }

    private void a(hon.a $$0, fzm $$1, boolean $$2, ikq $$3) {
        iko $$4 = $$3.e;
        if ($$4 == null) {
            return;
        }
        if ($$4.b() != $$2) {
            return;
        }
        ftm $$5 = $$3.a.b;
        if ($$4.c()) {
            fzp $$6 = $$0.a(ijt.t());
            this.a($$1, $$6, $$5.g, $$5.h, $$5.i, $$4, -16777216, 7.0f);
        }
        fzp $$7 = $$0.a(ijt.r());
        int $$8 = $$4.c() ? -11010079 : bel.j(102);
        this.a($$1, $$7, $$5.g, $$5.h, $$5.i, $$4, $$8, this.j.aR().v());
        $$0.a();
    }

    private void a(fzm $$0) {
        if (!$$0.d()) {
            throw new IllegalStateException("Pose stack not empty");
        }
    }

    private idf a(cgk $$0, float $$1) {
        return this.k.b($$0, $$1);
    }

    private void a(ftm $$0) {
        if (this.u.isEmpty()) {
            return;
        }
        is $$1 = is.a($$0);
        boolean $$2 = !$$1.equals(this.O);
        htt $$3 = new htt();
        for (hts.a $$4 : this.v) {
            this.a($$4, $$3, $$0, $$2, true);
        }
        this.P %= this.u.size();
        int $$5 = Math.max(this.u.size() / 8, 15);
        while ($$5-- > 0) {
            int $$6 = this.P++ % this.u.size();
            this.a((hts.a)this.u.get($$6), $$3, $$0, $$2, false);
        }
        this.O = $$1;
    }

    private void a(hts.a $$0, htt $$1, ftm $$2, boolean $$3, boolean $$4) {
        boolean $$6;
        $$1.b($$2, $$0.g());
        boolean $$5 = $$0.d().b($$1);
        boolean bl2 = $$6 = $$3 && ($$1.a() || $$4);
        if (($$6 || $$5) && !$$0.l() && $$0.k()) {
            $$0.a(this.K);
        }
    }

    private htj a(Matrix4fc $$0, double $$12, double $$22, double $$3) {
        ObjectListIterator $$4 = this.u.listIterator(0);
        EnumMap<hth, List<RenderPass.a<GpuBufferSlice[]>>> $$5 = new EnumMap<hth, List<RenderPass.a<GpuBufferSlice[]>>>(hth.class);
        int $$6 = 0;
        for (hth $$7 : hth.values()) {
            $$5.put($$7, new ArrayList());
        }
        ArrayList<hny.a> $$8 = new ArrayList<hny.a>();
        GpuTextureView $$9 = this.j.af().b(ilo.d).b();
        int $$10 = $$9.getWidth(0);
        int $$11 = $$9.getHeight(0);
        while ($$4.hasNext()) {
            hts.a $$122 = (hts.a)$$4.next();
            htr $$13 = $$122.d();
            is $$14 = $$122.f();
            long $$15 = bhs.c();
            int $$16 = -1;
            for (hth $$17 : hth.values()) {
                VertexFormat.a $$222;
                GpuBuffer $$21;
                hto $$18 = $$13.b($$17);
                if ($$18 == null) continue;
                if ($$16 == -1) {
                    $$16 = $$8.size();
                    $$8.add(new hny.a((Matrix4fc)new Matrix4f($$0), $$14.u(), $$14.v(), $$14.w(), $$122.a($$15), $$10, $$11));
                }
                if ($$18.b() == null) {
                    if ($$18.c() > $$6) {
                        $$6 = $$18.c();
                    }
                    Object $$19 = null;
                    Object $$20 = null;
                } else {
                    $$21 = $$18.b();
                    $$222 = $$18.d();
                }
                int $$23 = $$16;
                $$5.get((Object)$$17).add(new RenderPass.a<GpuBufferSlice[]>(0, $$18.a(), $$21, $$222, 0, $$18.c(), ($$1, $$2) -> $$2.upload("ChunkSection", $$1[$$23])));
            }
        }
        GpuBufferSlice[] $$24 = RenderSystem.getDynamicUniforms().a($$8.toArray(new hny.a[0]));
        return new htj($$9, $$5, $$6, $$24);
    }

    public void l() {
        this.o.b();
    }

    public void m() {
        this.M = true;
    }

    public void n() {
        this.N = null;
    }

    public void a(ger $$0) {
        if (this.s.y().i()) {
            ++this.x;
        }
        this.q.a(this.s, $$0, this.x, this.j.k.aJ().b(), this.j.k.m().b());
        this.D();
    }

    private void D() {
        if (this.x % 20 != 0) {
            return;
        }
        ObjectIterator $$0 = this.y.values().iterator();
        while ($$0.hasNext()) {
            awe $$1 = (awe)$$0.next();
            int $$2 = $$1.d();
            if (this.x - $$2 <= 400) continue;
            $$0.remove();
            this.a($$1);
        }
    }

    private void a(awe $$0) {
        long $$1 = $$0.b().a();
        Set $$2 = (Set)this.z.get($$1);
        $$2.remove($$0);
        if ($$2.isEmpty()) {
            this.z.remove($$1);
        }
    }

    private void a(fwv $$0, ger $$1, GpuBufferSlice $$2) {
        fld $$3 = $$1.m();
        if ($$3 == fld.c || $$3 == fld.a || this.b($$1)) {
            return;
        }
        ikv $$4 = this.Q.i;
        if ($$4.a == esh.c.a) {
            return;
        }
        hpk $$5 = this.n;
        if ($$5 == null) {
            return;
        }
        fww $$6 = $$0.a("sky");
        this.B.k = $$6.b(this.B.k);
        $$6.a(() -> {
            RenderSystem.setShaderFog($$2);
            if ($$1.a == esh.c.c) {
                $$5.b();
                if ($$1.k > 1.0E-5f) {
                    fzm $$3 = new fzm();
                    $$5.a($$3, $$1.k, $$1.l, $$1.m);
                }
                return;
            }
            fzm $$4 = new fzm();
            $$5.a($$1.j);
            $$5.a($$4, $$1.c, $$1.h);
            $$5.a($$4, $$1.c, $$1.d, $$1.e, $$1.i, $$1.f, $$1.g);
            if ($$1.b) {
                $$5.a();
            }
        });
    }

    private boolean b(ger $$0) {
        cgk cgk2 = $$0.h();
        if (cgk2 instanceof chl) {
            chl $$1 = (chl)cgk2;
            return $$1.d(cfo.o) || $$1.d(cfo.G);
        }
        return false;
    }

    private void c(ger $$0) {
        bzm $$1 = bzl.a();
        $$1.a("populateSectionsToCompile");
        htm $$2 = new htm();
        is $$3 = $$0.d();
        ArrayList $$4 = Lists.newArrayList();
        long $$5 = bgj.c(this.j.k.r().b() * 1000.0);
        for (hts.a $$6 : this.u) {
            if (!$$6.i() || $$6.d() == htl.a && !$$6.b()) continue;
            is $$7 = jw.a($$6.g()).k();
            double $$8 = $$7.j($$3);
            boolean $$9 = $$8 < 768.0;
            boolean $$10 = false;
            if (this.j.k.s().b() == gfq.c) {
                $$10 = $$9 || $$6.j();
            } else if (this.j.k.s().b() == gfq.b) {
                $$10 = $$6.j();
            }
            if ($$9 || $$6.a()) {
                $$6.b(0L);
            } else {
                $$6.b($$5);
            }
            $$6.a(false);
            if ($$10) {
                $$1.a("compileSectionSynchronously");
                this.K.a($$6, $$2);
                $$6.h();
                $$1.c();
                continue;
            }
            $$4.add($$6);
        }
        $$1.b("uploadSectionMeshes");
        this.K.a();
        $$1.b("scheduleAsyncCompile");
        for (hts.a $$11 : $$4) {
            $$11.b($$2);
            $$11.h();
        }
        $$1.b("scheduleTranslucentResort");
        this.a($$0.b());
        $$1.c();
    }

    private void a(fzm $$0, fzp $$1, double $$2, double $$3, double $$4, iko $$5, int $$6, float $$7) {
        is $$8 = $$5.a();
        if (w.C) {
            hpi.a($$0, $$1, $$5.d(), (double)$$8.u() - $$2, (double)$$8.v() - $$3, (double)$$8.w() - $$4, bel.a(1.0f, 1.0f, 1.0f, 1.0f), $$7);
            if ($$5.e() != null) {
                hpi.a($$0, $$1, $$5.e(), (double)$$8.u() - $$2, (double)$$8.v() - $$3, (double)$$8.w() - $$4, bel.a(0.4f, 0.0f, 0.0f, 0.0f), $$7);
            }
            if ($$5.f() != null) {
                hpi.a($$0, $$1, $$5.f(), (double)$$8.u() - $$2, (double)$$8.v() - $$3, (double)$$8.w() - $$4, bel.a(0.4f, 0.0f, 1.0f, 0.0f), $$7);
            }
            if ($$5.g() != null) {
                hpi.a($$0, $$1, $$5.g(), (double)$$8.u() - $$2, (double)$$8.v() - $$3, (double)$$8.w() - $$4, bel.a(0.4f, 0.0f, 0.0f, 1.0f), $$7);
            }
        } else {
            hpi.a($$0, $$1, $$5.d(), (double)$$8.u() - $$2, (double)$$8.v() - $$3, (double)$$8.w() - $$4, $$6, $$7);
        }
    }

    public void a(dvt $$0, is $$1, eoh $$2, eoh $$3, @dzq.b int $$4) {
        this.a($$1, ($$4 & 8) != 0);
    }

    private void a(is $$0, boolean $$1) {
        for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; ++$$2) {
            for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; ++$$3) {
                for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; ++$$4) {
                    this.a(jw.a($$3), jw.a($$4), jw.a($$2), $$1);
                }
            }
        }
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; ++$$6) {
            for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; ++$$7) {
                for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; ++$$8) {
                    this.b(jw.a($$7), jw.a($$8), jw.a($$6));
                }
            }
        }
    }

    public void a(is $$0, eoh $$1, eoh $$2) {
        if (this.j.aK().a($$1, $$2)) {
            this.a($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
        }
    }

    public void a(int $$0, int $$1, int $$2) {
        this.b($$0 - 1, $$1 - 1, $$2 - 1, $$0 + 1, $$1 + 1, $$2 + 1);
    }

    public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = $$2; $$6 <= $$5; ++$$6) {
            for (int $$7 = $$0; $$7 <= $$3; ++$$7) {
                for (int $$8 = $$1; $$8 <= $$4; ++$$8) {
                    this.b($$7, $$8, $$6);
                }
            }
        }
    }

    public void b(int $$0, int $$1, int $$2) {
        this.a($$0, $$1, $$2, false);
    }

    private void a(int $$0, int $$1, int $$2, boolean $$3) {
        this.w.a($$0, $$1, $$2, $$3);
    }

    public void a(long $$0) {
        hts.a $$1 = this.w.a($$0);
        if ($$1 != null) {
            this.t.a($$1);
            $$1.a(true);
        }
    }

    public void a(int $$02, is $$1, int $$2) {
        if ($$2 < 0 || $$2 >= 10) {
            awe $$3 = (awe)this.y.remove($$02);
            if ($$3 != null) {
                this.a($$3);
            }
        } else {
            awe $$4 = (awe)this.y.get($$02);
            if ($$4 != null) {
                this.a($$4);
            }
            if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
                $$4 = new awe($$02, $$1);
                this.y.put($$02, (Object)$$4);
            }
            $$4.a($$2);
            $$4.b(this.x);
            ((SortedSet)this.z.computeIfAbsent($$4.b().a(), $$0 -> Sets.newTreeSet())).add($$4);
        }
    }

    public boolean o() {
        return this.K.c();
    }

    public void a(dvu $$0) {
        this.t.a($$0);
    }

    public void p() {
        this.t.a();
        this.o.a();
    }

    public static int a(dvq $$0, is $$1) {
        return hoh.a(hoh$a.a, $$0, $$0.a_($$1), $$1);
    }

    public static int a(a $$0, dvq $$1, eoh $$2, is $$3) {
        int $$6;
        if ($$2.b($$1, $$3)) {
            return 0xF000F0;
        }
        int $$4 = $$0.packedBrightness($$1, $$3);
        int $$5 = hoj.a($$4);
        if ($$5 < ($$6 = $$2.k())) {
            int $$7 = hoj.b($$4);
            return hoj.a($$6, $$7);
        }
        return $$4;
    }

    public boolean a(is $$0) {
        hts.a $$1 = this.w.a($$0);
        if ($$1 == null || $$1.c.get() == htl.a) {
            return false;
        }
        return $$1.a(bhs.c()) >= 0.3f;
    }

    public @Nullable fxt q() {
        return this.B.q != null ? this.B.q.get() : null;
    }

    public @Nullable fxt r() {
        return this.B.l != null ? this.B.l.get() : null;
    }

    public @Nullable fxt s() {
        return this.B.m != null ? this.B.m.get() : null;
    }

    public @Nullable fxt t() {
        return this.B.n != null ? this.B.n.get() : null;
    }

    public @Nullable fxt u() {
        return this.B.o != null ? this.B.o.get() : null;
    }

    public @Nullable fxt v() {
        return this.B.p != null ? this.B.p.get() : null;
    }

    @bht
    public ObjectArrayList<hts.a> w() {
        return this.u;
    }

    @bht
    public hpf x() {
        return this.t;
    }

    public @Nullable htx y() {
        return this.N;
    }

    public hnv z() {
        return this.o;
    }

    public um.a A() {
        return um.a(this.U);
    }

    private void E() {
        ihb $$0 = new ihb();
        ihb $$1 = new ihb();
        this.U.a(this.j.bm());
        iqa $$2 = this.j.aa();
        if ($$2 != null) {
            this.U.a($$2.d());
        }
        long $$3 = bhs.c();
        for (uq.a $$4 : this.U.a()) {
            $$4.e().a($$4.c() ? $$1 : $$0, $$4.a($$3));
        }
        this.V = new b($$0, $$1);
    }

    record b(ihb a, ihb b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "standardPrimitives;alwaysOnTopPrimitives", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "standardPrimitives;alwaysOnTopPrimitives", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "standardPrimitives;alwaysOnTopPrimitives", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface a {
        public static final a a = ($$0, $$1) -> {
            int $$2 = $$0.a(dww.a, $$1);
            int $$3 = $$0.a(dww.b, $$1);
            return bet.a($$3, $$2);
        };

        public int packedBrightness(dvq var1, is var2);
    }
}

