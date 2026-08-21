/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.runtime.SwitchBootstraps;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hob
implements fvr.f,
AutoCloseable {
    private static final amo g = amo.b("blur");
    public static final int a = 10;
    private static final Logger h = LogUtils.getLogger();
    public static final float b = 0.05f;
    public static final float c = 100.0f;
    private static final float i = 20.0f;
    private static final float j = 7.0f;
    private final gfj k;
    private final bgr l = bgr.a();
    private float m;
    public final hof d;
    private final hpc n;
    private final hoz o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private boolean v = true;
    private long w;
    private boolean x;
    private long y = bhs.c();
    private final hoj z;
    private final ilg A = new ilg();
    private @Nullable hos B;
    protected final hnw e = new hnw(amo.b("textures/gui/title/background/panorama"));
    protected final hor f = new hor(this.e);
    private final fys C = new fys(3);
    private final igq D = new igq();
    private final gpp E;
    final gqg F;
    private final ikq G = new ikq();
    private final hpp H;
    private final ige I;
    private @Nullable amo J;
    private boolean K;
    private final ger L = new ger();
    private final fyd M = new fyd();
    private final hoc N = new hoc();
    private final hot O = new hot("level");
    private final hnu P = new hnu("3d hud", 0.05f, 100.0f);

    public hob(gfj $$0, hof $$1, hoz $$2, hpw $$3) {
        this.k = $$0;
        this.d = $$1;
        this.z = new hoj(this, $$0);
        this.o = $$2;
        this.F = new gqg();
        hon.a $$4 = $$2.c();
        inl $$5 = $$0.aL();
        this.H = new hpp();
        this.I = new ige(this.H, $$3, $$4, $$5, $$2.e(), $$2.d(), $$0.g);
        this.E = new gpp(this.F, $$4, this.H, this.I, List.of(new gpu($$4, $$0.ay()), new gpx($$4), new gpt($$4), new gps($$4, $$5), new gpw($$4, $$5), new gpv($$4)));
        this.n = new hpc($$0, $$5, $$4);
    }

    @Override
    public void close() {
        this.N.close();
        this.z.close();
        this.A.close();
        this.C.close();
        this.E.close();
        this.O.close();
        this.P.close();
        this.M.close();
        this.e.close();
        this.D.close();
        this.I.close();
    }

    public hpp b() {
        return this.H;
    }

    public ige c() {
        return this.I;
    }

    public ikq d() {
        return this.G;
    }

    public void a(boolean $$0) {
        this.v = $$0;
    }

    public void a(@Nullable hos $$0) {
        this.B = $$0;
    }

    public @Nullable hos e() {
        return this.B;
    }

    public boolean f() {
        return this.B != null;
    }

    public void g() {
        this.J = null;
        this.K = false;
    }

    public void h() {
        this.K = !this.K;
    }

    public void a(@Nullable cgk $$0) {
        cgk cgk2 = $$0;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{czp.class, dcd.class, czs.class}, (Object)cgk2, n2)) {
            case 0: {
                czp $$1 = (czp)cgk2;
                this.a(amo.b("creeper"));
                break;
            }
            case 1: {
                dcd $$2 = (dcd)cgk2;
                this.a(amo.b("spider"));
                break;
            }
            case 2: {
                czs $$3 = (czs)cgk2;
                this.a(amo.b("invert"));
                break;
            }
            default: {
                this.g();
            }
        }
    }

    private void a(amo $$0) {
        this.J = $$0;
        this.K = true;
    }

    public void i() {
        hov $$0 = this.k.ag().a(g, hoi.h);
        if ($$0 != null) {
            $$0.a(this.k.l(), this.C);
        }
    }

    public void a(bbc $$0) {
        GpuDevice $$12 = RenderSystem.getDevice();
        fyy $$22 = ($$1, $$2) -> {
            String string;
            block8: {
                amo $$3 = $$2.idConverter().a($$1);
                BufferedReader $$4 = $$0.getResourceOrThrow($$3).e();
                try {
                    string = IOUtils.toString((Reader)$$4);
                    if ($$4 == null) break block8;
                }
                catch (Throwable throwable) {
                    try {
                        if ($$4 != null) {
                            try {
                                ((Reader)$$4).close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException $$5) {
                        h.error("Coudln't preload {} shader {}: {}", new Object[]{$$2, $$1, $$5});
                        return null;
                    }
                }
                ((Reader)$$4).close();
            }
            return string;
        };
        $$12.precompilePipeline(hpa.aq, $$22);
        $$12.precompilePipeline(hpa.at, $$22);
        if (TracyClient.isAvailable()) {
            $$12.precompilePipeline(hpa.aD, $$22);
        }
    }

    public void j() {
        this.v();
        this.z.b();
        hnh $$0 = this.k.s;
        if (this.k.au() == null) {
            this.k.a($$0);
        }
        this.L.c();
        this.d.a();
        float $$1 = $$0.k;
        float $$2 = $$0.a(cfo.i, 1.0f);
        if ($$1 > 0.0f || $$2 > 0.0f) {
            this.q = ($$1 * 20.0f + $$2 * 7.0f) / ($$1 + $$2);
            this.p += this.q;
        } else {
            this.q = 0.0f;
        }
        if (!this.k.r.y().i()) {
            return;
        }
        this.u = this.t;
        if (this.k.j.k().c()) {
            this.t += 0.05f;
            if (this.t > 1.0f) {
                this.t = 1.0f;
            }
        } else if (this.t > 0.0f) {
            this.t -= 0.0125f;
        }
        this.n.a();
        bzm $$3 = bzl.a();
        $$3.a("levelRenderer");
        this.k.e.a(this.L);
        $$3.c();
    }

    public @Nullable amo k() {
        return this.J;
    }

    public void a(int $$0, int $$1) {
        this.C.b();
        this.k.e.a($$0, $$1);
    }

    public void a(float $$0) {
        cgk cgk2;
        cgk $$1 = this.k.au();
        if ($$1 == null) {
            return;
        }
        if (this.k.r == null || this.k.s == null) {
            return;
        }
        bzl.a().a("pick");
        ftk ftk2 = this.k.u = this.k.s.a($$0, $$1);
        if (ftk2 instanceof ftj) {
            ftj $$2 = (ftj)ftk2;
            cgk2 = $$2.a();
        } else {
            cgk2 = null;
        }
        this.k.t = cgk2;
        bzl.a().c();
    }

    private void v() {
        float $$5;
        cgk cgk2 = this.k.au();
        if (cgk2 instanceof hne) {
            hne $$0 = (hne)cgk2;
            gfo $$1 = this.k.k;
            boolean $$2 = $$1.aV().a();
            float $$3 = $$1.aC().b().floatValue();
            float $$4 = $$0.a($$2, $$3);
        } else {
            $$5 = 1.0f;
        }
        this.s = this.r;
        this.r += ($$5 - this.r) * 0.5f;
        this.r = bgj.a(this.r, 0.1f, 1.5f);
    }

    private float a(ger $$0, float $$1, boolean $$2) {
        fld $$6;
        chl $$4;
        cgk cgk2;
        if (this.f()) {
            return 90.0f;
        }
        float $$3 = 70.0f;
        if ($$2) {
            $$3 = this.k.k.az().b().intValue();
            $$3 *= bgj.h($$1, this.s, this.r);
        }
        if ((cgk2 = $$0.h()) instanceof chl && ($$4 = (chl)cgk2).fa()) {
            float $$5 = Math.min((float)$$4.bw + $$1, 20.0f);
            $$3 /= (1.0f - 500.0f / ($$5 + 500.0f)) * 2.0f + 1.0f;
        }
        if (($$6 = $$0.m()) == fld.a || $$6 == fld.b) {
            float $$7 = this.k.k.aC().b().floatValue();
            $$3 *= bgj.h($$7, 1.0f, 0.85714287f);
        }
        return $$3;
    }

    private void a(fzm $$0, float $$1) {
        cgk cgk2 = this.k.au();
        if (cgk2 instanceof chl) {
            chl $$2 = (chl)cgk2;
            float $$3 = (float)$$2.bu - $$1;
            if ($$2.fa()) {
                float $$4 = Math.min((float)$$2.bw + $$1, 20.0f);
                $$0.a((Quaternionfc)a.f.rotationDegrees(40.0f - 8000.0f / ($$4 + 200.0f)));
            }
            if ($$3 < 0.0f) {
                return;
            }
            $$3 /= (float)$$2.bv;
            $$3 = bgj.a((double)($$3 * $$3 * $$3 * $$3 * (float)Math.PI));
            float $$5 = $$2.fg();
            $$0.a((Quaternionfc)a.d.rotationDegrees(-$$5));
            float $$6 = (float)((double)(-$$3) * 14.0 * this.k.k.aG().b());
            $$0.a((Quaternionfc)a.f.rotationDegrees($$6));
            $$0.a((Quaternionfc)a.d.rotationDegrees($$5));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void b(fzm $$0, float $$1) {
        void $$3;
        cgk cgk2 = this.k.au();
        if (!(cgk2 instanceof hne)) {
            return;
        }
        hne $$2 = (hne)cgk2;
        gii $$4 = $$3.b();
        float $$5 = $$4.g($$1);
        float $$6 = $$4.f($$1);
        $$0.a(bgj.a((double)($$5 * (float)Math.PI)) * $$6 * 0.5f, -Math.abs(bgj.b((double)($$5 * (float)Math.PI)) * $$6), 0.0f);
        $$0.a((Quaternionfc)a.f.rotationDegrees(bgj.a((double)($$5 * (float)Math.PI)) * $$6 * 3.0f));
        $$0.a((Quaternionfc)a.b.rotationDegrees(Math.abs(bgj.b((double)($$5 * (float)Math.PI - 0.2f)) * $$6) * 5.0f));
    }

    private void a(float $$0, boolean $$1, Matrix4f $$2) {
        if (this.f()) {
            return;
        }
        this.I.a();
        this.o.c().b();
        fzm $$3 = new fzm();
        $$3.a();
        $$3.a((Matrix4fc)$$2.invert(new Matrix4f()));
        Matrix4fStack $$4 = RenderSystem.getModelViewStack();
        $$4.pushMatrix().mul((Matrix4fc)$$2);
        this.a($$3, $$0);
        if (this.k.k.ap().b().booleanValue()) {
            this.b($$3, $$0);
        }
        if (this.k.k.aV().a() && !$$1 && !this.k.k.au && this.k.q.i() != dwl.d) {
            this.d.a($$0, $$3, this.k.i.b(), this.k.s, this.k.ay().a(this.k.s, $$0));
        }
        $$4.popMatrix();
        $$3.b();
    }

    public Matrix4f b(float $$0) {
        Matrix4f $$1 = new Matrix4f();
        return $$1.perspective($$0 * ((float)Math.PI / 180), (float)this.k.aR().k() / (float)this.k.aR().l(), 0.05f, this.l());
    }

    public float l() {
        return Math.max(this.m * 4.0f, (float)(this.k.k.l().b() * 16));
    }

    public static float a(chl $$0, float $$1) {
        cfm $$2 = $$0.e(cfo.p);
        if (!$$2.a(200)) {
            return 1.0f;
        }
        return 0.7f + bgj.a((double)(((float)$$2.d() - $$1) * (float)Math.PI * 0.2f)) * 0.3f;
    }

    public void a(gez $$0, boolean $$1) {
        if (this.k.aI() || !this.k.k.l || this.k.k.an().b().booleanValue() && this.k.n.d()) {
            this.y = bhs.c();
        } else if (bhs.c() - this.y > 500L) {
            this.k.b(false);
        }
        if (this.k.w) {
            return;
        }
        bzm $$2 = bzl.a();
        $$2.a("camera");
        this.a($$0);
        $$2.c();
        this.N.a(this.k.aR().k(), this.k.aR().l(), this.k.k.aF().b(), this.k.r == null ? 0L : this.k.r.au(), $$0, this.k.k.x(), this.L, this.k.k.N().b() == gfv.b);
        boolean $$3 = this.k.f();
        int $$4 = (int)this.k.n.b(this.k.aR());
        int $$5 = (int)this.k.n.c(this.k.aR());
        if ($$3 && $$1 && this.k.r != null) {
            hov $$6;
            $$2.a("world");
            this.b($$0);
            this.x();
            this.k.e.b();
            if (this.J != null && this.K && ($$6 = this.k.ag().a(this.J, hoi.h)) != null) {
                $$6.a(this.k.l(), this.C);
            }
            $$2.c();
        }
        this.D.a();
        fxt $$7 = this.k.l();
        RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$7.e(), 1.0);
        this.k.i.t().a(fyd.a.c);
        this.F.e();
        $$2.a("guiExtraction");
        gir $$8 = new gir(this.k, this.F, $$4, $$5);
        if ($$3 && $$1 && this.k.r != null) {
            this.k.j.a($$8, $$0);
        }
        if (this.k.aP() != null) {
            try {
                this.k.aP().a($$8, $$4, $$5, $$0.a());
            }
            catch (Throwable $$9) {
                m $$10 = m.a($$9, "Rendering overlay");
                n $$11 = $$10.a("Overlay render details");
                $$11.a("Overlay name", () -> this.k.aP().getClass().getCanonicalName());
                throw new v($$10);
            }
        }
        if ($$3 && this.k.x != null) {
            try {
                this.k.x.c($$8, $$4, $$5, $$0.a());
            }
            catch (Throwable $$12) {
                m $$13 = m.a($$12, "Rendering screen");
                n $$14 = $$13.a("Screen render details");
                $$14.a("Screen name", () -> this.k.x.getClass().getCanonicalName());
                this.k.n.a($$14, this.k.aR());
                throw new v($$13);
            }
            if (w.ak) {
                this.k.n.a(this.k.g, $$8);
            }
            try {
                if (this.k.x != null) {
                    this.k.x.z();
                }
            }
            catch (Throwable $$15) {
                m $$16 = m.a($$15, "Narrating screen");
                n $$17 = $$16.a("Screen details");
                $$17.a("Screen name", () -> this.k.x.getClass().getCanonicalName());
                throw new v($$16);
            }
        }
        if ($$3 && $$1 && this.k.r != null) {
            this.k.j.b($$8, $$0);
        }
        if ($$3) {
            try (bzr $$18 = $$2.d("toasts");){
                this.k.aG().a($$8);
            }
        }
        if (!(this.k.x instanceof gsn)) {
            this.k.j.a($$8);
        }
        this.k.j.b();
        if (w.aq) {
            this.w();
        }
        $$2.b("guiRendering");
        this.E.a(this.D.a(igq.a.a));
        this.E.a();
        $$2.c();
        $$8.a(this.k.aR());
        this.H.b();
        this.I.b();
        this.C.a();
    }

    private void w() {
        this.F.a();
        this.F.b((gqh $$0) -> $$0.a().a(new gio.b(){
            private int c;
            final /* synthetic */ gqh a;
            {
                this.a = gqh2;
            }

            @Override
            public void a(gnz.a $$0) {
                this.a($$0, false);
            }

            @Override
            public void a(gno $$0) {
                this.a($$0, true);
            }

            private void a(gnk $$0, boolean $$1) {
                int $$2 = ($$1 ? 128 : 255) - (this.c++ & 1) * 64;
                zf $$3 = $$0.a();
                int $$4 = $$3.i() != null ? $$2 : 0;
                int $$5 = $$3.j() != null ? $$2 : 0;
                int $$6 = $$4 == 0 || $$5 == 0 ? $$2 : 0;
                int $$7 = bel.b(128, $$4, $$5, $$6);
                hob.this.F.a(new gqc(hpa.aq, gpq.a(), this.a.c, (int)$$0.b(), (int)$$0.c(), (int)$$0.d(), (int)$$0.e(), $$7, $$7, this.a.j));
            }
        }));
    }

    private void x() {
        if (this.x || !this.k.Y()) {
            return;
        }
        long $$02 = bhs.c();
        if ($$02 - this.w < 1000L) {
            return;
        }
        this.w = $$02;
        iqa $$1 = this.k.aa();
        if ($$1 == null || $$1.ai()) {
            return;
        }
        $$1.F().ifPresent($$0 -> {
            if (Files.isRegularFile($$0, new LinkOption[0])) {
                this.x = true;
            } else {
                this.a((Path)$$0);
            }
        });
    }

    private void a(Path $$0) {
        if (this.k.e.i() > 10 && this.k.e.o()) {
            gfs.a(this.k.l(), (fyh $$1) -> bhs.i().execute(() -> {
                int $$2 = $$1.a();
                int $$3 = $$1.b();
                int $$4 = 0;
                int $$5 = 0;
                if ($$2 > $$3) {
                    $$4 = ($$2 - $$3) / 2;
                    $$2 = $$3;
                } else {
                    $$5 = ($$3 - $$2) / 2;
                    $$3 = $$2;
                }
                try (fyh $$6 = new fyh(64, 64, false);){
                    $$1.a($$4, $$5, $$2, $$3, $$6);
                    $$6.a($$0);
                }
                catch (IOException $$7) {
                    h.warn("Couldn't save auto screenshot", (Throwable)$$7);
                }
                finally {
                    $$1.close();
                }
            }));
        }
    }

    private boolean y() {
        boolean $$1;
        if (!this.v) {
            return false;
        }
        cgk $$0 = this.k.au();
        boolean bl2 = $$1 = $$0 instanceof ddm && !this.k.k.au;
        if ($$1 && !((ddm)$$0).gL().e) {
            dlt $$2 = ((chl)$$0).fx();
            ftk $$3 = this.k.u;
            if ($$3 != null && $$3.d() == ftk.a.b) {
                is $$4 = ((fti)$$3).b();
                eoh $$5 = this.k.r.a_($$4);
                if (this.k.q.i() == dwl.d) {
                    $$1 = $$5.a((dwo)this.k.r, $$4) != null;
                } else {
                    eol $$6 = new eol(this.k.r, $$4, false);
                    jq<dzq> $$7 = this.k.r.J_().f(mj.i);
                    $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
                }
            }
        }
        return $$1;
    }

    public void a(gez $$0) {
        float $$1 = $$0.a(true);
        hnh $$2 = this.k.s;
        if ($$2 == null || this.k.r == null) {
            return;
        }
        if (this.k.au() == null) {
            this.k.a($$2);
        }
        hnh $$3 = this.k.au() == null ? $$2 : this.k.au();
        float $$4 = this.k.r.y().a($$3) ? 1.0f : $$1;
        this.L.a(this.k.r, $$3, !this.k.k.aV().a(), this.k.k.aV().b(), $$4);
    }

    public void b(gez $$0) {
        float $$1 = $$0.a(true);
        hnh $$2 = this.k.s;
        this.z.a(1.0f);
        this.a($$1);
        bzm $$3 = bzl.a();
        boolean $$4 = this.y();
        this.d($$1);
        this.m = this.k.k.aY() * 16;
        $$3.a("matrices");
        float $$5 = this.a(this.L, $$1, true);
        Matrix4f $$6 = this.b($$5);
        fzm $$7 = new fzm();
        this.a($$7, this.L.r());
        if (this.k.k.ap().b().booleanValue()) {
            this.b($$7, this.L.r());
        }
        $$6.mul((Matrix4fc)$$7.c().a());
        float $$8 = this.k.k.aB().b().floatValue();
        float $$9 = bgj.h($$1, $$2.cB, $$2.k);
        float $$10 = $$2.a(cfo.i, $$1);
        float $$11 = Math.max($$9, $$10) * ($$8 * $$8);
        if ($$11 > 0.0f) {
            float $$12 = 5.0f / ($$11 * $$11 + 5.0f) - $$11 * 0.04f;
            $$12 *= $$12;
            Vector3f $$13 = new Vector3f(0.0f, bgj.g / 2.0f, bgj.g / 2.0f);
            float $$14 = (this.p + $$1 * this.q) * ((float)Math.PI / 180);
            $$6.rotate($$14, (Vector3fc)$$13);
            $$6.scale(1.0f / $$12, 1.0f, 1.0f);
            $$6.rotate(-$$14, (Vector3fc)$$13);
        }
        RenderSystem.setProjectionMatrix(this.O.a($$6), fwd.a);
        Quaternionf $$15 = this.L.g().conjugate(new Quaternionf());
        Matrix4f $$16 = new Matrix4f().rotation((Quaternionfc)$$15);
        $$3.b("fog");
        Vector4f $$17 = this.D.a(this.L, this.k.k.aY(), $$0, this.c($$1), this.k.r);
        GpuBufferSlice $$18 = this.D.a(igq.a.b);
        $$3.b("level");
        boolean $$19 = this.k.j.k().d();
        this.k.e.a(this.C, $$0, $$4, this.L, $$16, $$6, this.e($$5), $$18, $$17, !$$19);
        $$3.b("hand");
        boolean $$20 = this.k.au() instanceof chl && ((chl)this.k.au()).gr();
        RenderSystem.setProjectionMatrix(this.P.a(this.k.aR().k(), this.k.aR().l(), this.a(this.L, $$1, false)), fwd.a);
        RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.k.l().e(), 1.0);
        this.a($$1, $$20, $$16);
        $$3.b("screenEffects");
        hon.a $$21 = this.o.c();
        this.n.a($$20, $$1, (hpo)this.H);
        this.I.a();
        $$21.b();
        $$3.c();
        RenderSystem.setShaderFog(this.D.a(igq.a.a));
        if (this.k.m.b(glx.y) && this.k.k.aV().a() && !this.k.k.au) {
            this.k.aT().a(this.L);
        }
    }

    private void d(float $$0) {
        ikp $$1 = this.G.a;
        $$1.c = this.L.i();
        $$1.b = this.L.b();
        $$1.a = this.L.d();
        $$1.d = this.L.h().p($$0);
        $$1.e = new Quaternionf((Quaternionfc)this.L.g());
    }

    private Matrix4f e(float $$0) {
        float $$1 = Math.max($$0, (float)this.k.k.az().b().intValue());
        return this.b($$1);
    }

    public void m() {
        this.n.b();
        this.k.aM().a();
        this.L.q();
        this.x = false;
    }

    public void a(dlt $$0) {
        this.n.a($$0, this.l);
    }

    public gfj n() {
        return this.k;
    }

    public float c(float $$0) {
        return bgj.h($$0, this.u, this.t);
    }

    public float o() {
        return this.m;
    }

    public ger p() {
        return this.L;
    }

    public hoj q() {
        return this.z;
    }

    public ilg r() {
        return this.A;
    }

    @Override
    public ftm a(ftm $$0) {
        Matrix4f $$1 = this.b(this.a(this.L, 0.0f, true));
        Quaternionf $$2 = this.L.g().conjugate(new Quaternionf());
        Matrix4f $$3 = new Matrix4f().rotation((Quaternionfc)$$2);
        Matrix4f $$4 = $$1.mul((Matrix4fc)$$3);
        ftm $$5 = this.L.b();
        ftm $$6 = $$0.d($$5);
        Vector3f $$7 = $$4.transformProject($$6.m());
        return new ftm((Vector3fc)$$7);
    }

    @Override
    public double a() {
        float $$0 = this.L.e();
        if ($$0 <= -90.0f) {
            return Double.NEGATIVE_INFINITY;
        }
        if ($$0 >= 90.0f) {
            return Double.POSITIVE_INFINITY;
        }
        float $$1 = this.a(this.L, 0.0f, true);
        return Math.tan($$0 * ((float)Math.PI / 180)) / Math.tan($$1 / 2.0f * ((float)Math.PI / 180));
    }

    public hoc s() {
        return this.N;
    }

    public fyd t() {
        return this.M;
    }

    public void a(@Nullable hif $$0) {
        if ($$0 != null) {
            this.M.a($$0.F_().o());
        }
    }

    public hor u() {
        return this.f;
    }
}

