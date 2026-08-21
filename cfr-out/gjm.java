/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.mojang.datafixers.DataFixUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Strings;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public class gjm {
    private static final float a = 0.01f;
    private static final int b = 36;
    private static final int c = 2;
    private static final int d = 2;
    private static final int e = 2;
    private final gfj f;
    private final gio g;
    private final GpuBuffer h;
    private final RenderSystem.a i = RenderSystem.getSequentialBuffer(VertexFormat.b.a);
    private @Nullable dvu j;
    private @Nullable eqq k;
    private @Nullable CompletableFuture<eqq> l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final bxn p = new bxn(1);
    private final bxn q = new bxn(bxs.values().length);
    private final bxn r = new bxn(1);
    private final bxn s = new bxn(1);
    private final Map<bxo, bxn> t = Map.of(bxo.a, this.q);
    private final gmf u;
    private final gmi v;
    private final gmg w;
    private final gme x;
    private final gmh y;

    public gjm(gfj $$0) {
        this.f = $$0;
        this.g = $$0.g;
        this.u = new gmf(this.g, this.p);
        this.v = new gmi(this.g, this.q, () -> Float.valueOf($$0.r == null ? 0.0f : $$0.r.y().g()));
        this.w = new gmg(this.g, this.r);
        this.x = new gme(this.g, this.s);
        this.y = new gmh(this.g);
        try (fzi $$1 = fzi.a(fzk.o.getVertexSize() * 12 * 2);){
            fzh $$2 = new fzh($$1, VertexFormat.b.a, fzk.o);
            $$2.a(0.0f, 0.0f, 0.0f).a(-16777216).b(1.0f, 0.0f, 0.0f).a(4.0f);
            $$2.a(1.0f, 0.0f, 0.0f).a(-16777216).b(1.0f, 0.0f, 0.0f).a(4.0f);
            $$2.a(0.0f, 0.0f, 0.0f).a(-16777216).b(0.0f, 1.0f, 0.0f).a(4.0f);
            $$2.a(0.0f, 1.0f, 0.0f).a(-16777216).b(0.0f, 1.0f, 0.0f).a(4.0f);
            $$2.a(0.0f, 0.0f, 0.0f).a(-16777216).b(0.0f, 0.0f, 1.0f).a(4.0f);
            $$2.a(0.0f, 0.0f, 1.0f).a(-16777216).b(0.0f, 0.0f, 1.0f).a(4.0f);
            $$2.a(0.0f, 0.0f, 0.0f).a(-65536).b(1.0f, 0.0f, 0.0f).a(2.0f);
            $$2.a(1.0f, 0.0f, 0.0f).a(-65536).b(1.0f, 0.0f, 0.0f).a(2.0f);
            $$2.a(0.0f, 0.0f, 0.0f).a(-16711936).b(0.0f, 1.0f, 0.0f).a(2.0f);
            $$2.a(0.0f, 1.0f, 0.0f).a(-16711936).b(0.0f, 1.0f, 0.0f).a(2.0f);
            $$2.a(0.0f, 0.0f, 0.0f).a(-8421377).b(0.0f, 0.0f, 1.0f).a(2.0f);
            $$2.a(0.0f, 0.0f, 1.0f).a(-8421377).b(0.0f, 0.0f, 1.0f).a(2.0f);
            try (fzl $$3 = $$2.b();){
                this.h = RenderSystem.getDevice().createBuffer(() -> "Crosshair vertex buffer", 32, $$3.a());
            }
        }
    }

    public void a() {
        this.l = null;
        this.k = null;
    }

    public void a(gir $$0) {
        iqa $$34;
        ArrayList $$16;
        Object $$6;
        gfo $$1 = this.f.k;
        if (!this.f.f() || $$1.au && this.f.x == null) {
            return;
        }
        Collection<amo> $$2 = this.f.m.b();
        if ($$2.isEmpty()) {
            return;
        }
        $$0.c();
        bzm $$3 = bzl.a();
        $$3.a("debug");
        if (this.f.au() != null && this.f.r != null) {
            is $$4 = this.f.au().dK();
            dvu $$5 = new dvu($$4);
        } else {
            $$6 = null;
        }
        if (!Objects.equals(this.j, $$6)) {
            this.j = $$6;
            this.a();
        }
        final ArrayList<String> $$7 = new ArrayList<String>();
        final ArrayList<String> $$8 = new ArrayList<String>();
        final LinkedHashMap $$9 = new LinkedHashMap();
        final ArrayList $$10 = new ArrayList();
        glw $$11 = new glw(){

            @Override
            public void a(String $$0) {
                if ($$7.size() > $$8.size()) {
                    $$8.add($$0);
                } else {
                    $$7.add($$0);
                }
            }

            @Override
            public void b(String $$0) {
                $$10.add($$0);
            }

            @Override
            public void a(amo $$02, Collection<String> $$1) {
                $$9.computeIfAbsent($$02, $$0 -> new ArrayList()).addAll($$1);
            }

            @Override
            public void a(amo $$02, String $$1) {
                $$9.computeIfAbsent($$02, $$0 -> new ArrayList()).add($$1);
            }
        };
        dwo $$12 = this.o();
        for (amo $$13 : $$2) {
            gly $$14 = glx.a($$13);
            if ($$14 == null) continue;
            $$14.a($$11, $$12, this.q(), this.p());
        }
        if (!$$7.isEmpty()) {
            $$7.add("");
        }
        if (!$$8.isEmpty()) {
            $$8.add("");
        }
        if (!$$10.isEmpty()) {
            int $$15 = ($$10.size() + 1) / 2;
            $$7.addAll($$10.subList(0, $$15));
            $$8.addAll($$10.subList($$15, $$10.size()));
            $$7.add("");
            if ($$15 < $$10.size()) {
                $$8.add("");
            }
        }
        if (!($$16 = new ArrayList($$9.values())).isEmpty()) {
            int $$17 = ($$16.size() + 1) / 2;
            for (int $$18 = 0; $$18 < $$16.size(); ++$$18) {
                Collection $$19 = (Collection)$$16.get($$18);
                if ($$19.isEmpty()) continue;
                if ($$18 < $$17) {
                    $$7.addAll($$19);
                    $$7.add("");
                    continue;
                }
                $$8.addAll($$19);
                $$8.add("");
            }
        }
        if (this.f.m.d()) {
            $$7.add("");
            boolean $$20 = this.f.aa() != null;
            gfh $$21 = $$1.X;
            String $$22 = $$21.n().getString();
            String $$23 = "[" + (String)($$21.m() ? "" : $$22 + "+");
            String $$24 = $$23 + $$1.ao.n().getString() + "]";
            String $$25 = $$23 + $$1.ap.n().getString() + "]";
            String $$26 = $$23 + $$1.aq.n().getString() + "]";
            $$7.add("Debug charts: " + $$24 + " Profiler " + (this.m ? "visible" : "hidden") + "; " + $$25 + " " + ($$20 ? "FPS + TPS " : "FPS ") + (this.n ? "visible" : "hidden") + "; " + $$26 + " " + (!this.f.Y() ? "Bandwidth + Ping" : "Ping") + (this.o ? " visible" : " hidden"));
            String $$27 = $$23 + $$1.ah.n().getString() + "]";
            $$7.add("To edit: press " + $$27);
        }
        this.a($$0, $$7, true);
        this.a($$0, $$8, false);
        $$0.c();
        this.y.a(10);
        if (this.e()) {
            int $$28 = $$0.a();
            int $$29 = $$28 / 2;
            this.u.a($$0, 0, this.u.a($$29));
            if (this.q.d() > 0) {
                int $$30 = this.v.a($$29);
                this.v.a($$0, $$28 - $$30, $$30);
            }
            this.y.a(this.v.a());
        }
        if (this.d() && this.f.R() != null) {
            int $$31 = $$0.a();
            int $$32 = $$31 / 2;
            if (!this.f.Y()) {
                this.x.a($$0, 0, this.x.a($$32));
            }
            int $$33 = this.w.a($$32);
            this.w.a($$0, $$31 - $$33, $$33);
            this.y.a(this.w.a());
        }
        if (this.f.m.b(glx.K) && ($$34 = this.f.aa()) != null && this.f.s != null) {
            axp $$35 = $$34.a(16 + awh.a);
            $$35.a(this.f.s.ao().aq(), this.f.s.dM());
            grp.a($$0, $$0.a() / 2, $$0.b() / 2, 4, 1, $$35);
        }
        try (bzr $$36 = $$3.d("profilerPie");){
            this.y.a($$0);
        }
        $$3.c();
    }

    private void a(gir $$0, List<String> $$1, boolean $$2) {
        int $$3 = this.g.b;
        for (int $$4 = 0; $$4 < $$1.size(); ++$$4) {
            String $$5 = $$1.get($$4);
            if (Strings.isNullOrEmpty((String)$$5)) continue;
            int $$6 = this.g.b($$5);
            int $$7 = $$2 ? 2 : $$0.a() - 2 - $$6;
            int $$8 = 2 + $$3 * $$4;
            $$0.a($$7 - 1, $$8 - 1, $$7 + $$6 + 1, $$8 + $$3 - 1, -1873784752);
        }
        for (int $$9 = 0; $$9 < $$1.size(); ++$$9) {
            String $$10 = $$1.get($$9);
            if (Strings.isNullOrEmpty((String)$$10)) continue;
            int $$11 = this.g.b($$10);
            int $$12 = $$2 ? 2 : $$0.a() - 2 - $$11;
            int $$13 = 2 + $$3 * $$9;
            $$0.a(this.g, $$10, $$12, $$13, -2039584, false);
        }
    }

    private @Nullable axf n() {
        if (this.f.r == null) {
            return null;
        }
        iqa $$0 = this.f.aa();
        if ($$0 != null) {
            return $$0.a(this.f.r.aq());
        }
        return null;
    }

    private @Nullable dwo o() {
        if (this.f.r == null) {
            return null;
        }
        return (dwo)DataFixUtils.orElse(Optional.ofNullable(this.f.aa()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.r.aq()))), (Object)this.f.r);
    }

    private @Nullable eqq p() {
        if (this.f.r == null || this.j == null) {
            return null;
        }
        if (this.l == null) {
            axf $$02 = this.n();
            if ($$02 == null) {
                return null;
            }
            this.l = $$02.p().b(this.j.h, this.j.i, erj.n, false).thenApply($$0 -> $$0.b(null));
        }
        return this.l.getNow(null);
    }

    private @Nullable eqq q() {
        if (this.f.r == null || this.j == null) {
            return null;
        }
        if (this.k == null) {
            this.k = this.f.r.d(this.j.h, this.j.i);
        }
        return this.k;
    }

    public boolean b() {
        glz $$0 = this.f.m;
        return !(!$$0.d() && $$0.b().isEmpty() || this.f.k.au && this.f.x == null);
    }

    public boolean c() {
        return this.f.m.d() && this.m;
    }

    public boolean d() {
        return this.f.m.d() && this.o;
    }

    public boolean e() {
        return this.f.m.d() && this.n;
    }

    public void f() {
        boolean bl2 = this.o = !this.f.m.d() || !this.o;
        if (this.o) {
            this.f.m.a(true);
            this.n = false;
        }
    }

    public void g() {
        boolean bl2 = this.n = !this.f.m.d() || !this.n;
        if (this.n) {
            this.f.m.a(true);
            this.o = false;
        }
    }

    public void h() {
        boolean bl2 = this.m = !this.f.m.d() || !this.m;
        if (this.m) {
            this.f.m.a(true);
        }
    }

    public void a(long $$0) {
        this.p.a($$0);
    }

    public bxn i() {
        return this.q;
    }

    public bxn j() {
        return this.r;
    }

    public bxn k() {
        return this.s;
    }

    public gmh l() {
        return this.y;
    }

    public void a(long[] $$0, bxo $$1) {
        bxn $$2 = this.t.get((Object)$$1);
        if ($$2 != null) {
            $$2.a($$0);
        }
    }

    public void m() {
        this.q.e();
        this.r.e();
        this.s.e();
    }

    public void a(ger $$0) {
        Matrix4fStack $$1 = RenderSystem.getModelViewStack();
        $$1.pushMatrix();
        $$1.translate(0.0f, 0.0f, -1.0f);
        $$1.rotateX($$0.e() * ((float)Math.PI / 180));
        $$1.rotateY($$0.f() * ((float)Math.PI / 180));
        float $$2 = 0.01f * (float)this.f.aR().s();
        $$1.scale(-$$2, $$2, -$$2);
        RenderPipeline $$3 = hpa.Z;
        fxt $$4 = gfj.V().l();
        GpuTextureView $$5 = $$4.d();
        GpuTextureView $$6 = $$4.f();
        GpuBuffer $$7 = this.i.b(36);
        GpuBufferSlice $$8 = RenderSystem.getDynamicUniforms().a((Matrix4fc)$$1, (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass $$9 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "3d crosshair", $$5, OptionalInt.empty(), $$6, OptionalDouble.empty());){
            $$9.setPipeline($$3);
            RenderSystem.bindDefaultUniforms($$9);
            $$9.setVertexBuffer(0, this.h);
            $$9.setIndexBuffer($$7, this.i.a());
            $$9.setUniform("DynamicTransforms", $$8);
            $$9.drawIndexed(0, 0, 36, 1);
        }
        $$1.popMatrix();
    }
}

