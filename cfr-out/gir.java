/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fStack
 *  org.joml.Matrix3x2fc
 *  org.joml.Quaternionf
 *  org.joml.Vector2ic
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Quaternionf;
import org.joml.Vector2ic;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class gir {
    private static final int a = 2;
    final gfj b;
    private final Matrix3x2fStack c;
    private final c d = new c();
    private final inu e;
    private final ilo f;
    final gqg g;
    private fym h = fym.a;
    final int i;
    final int j;
    private @Nullable Runnable k;
    @Nullable zf l;
    @Nullable zf m;

    private gir(gfj $$0, Matrix3x2fStack $$1, gqg $$2, int $$3, int $$4) {
        this.b = $$0;
        this.c = $$1;
        this.i = $$3;
        this.j = $$4;
        inl $$5 = $$0.aL();
        this.e = $$5;
        this.f = $$5.a(ml.h);
        this.g = $$2;
    }

    public gir(gfj $$0, gqg $$1, int $$2, int $$3) {
        this($$0, new Matrix3x2fStack(16), $$1, $$2, $$3);
    }

    public void a(fym $$0) {
        this.h = $$0;
    }

    public void a(fyk $$0) {
        $$0.a(this.h);
    }

    public int a() {
        return this.b.aR().o();
    }

    public int b() {
        return this.b.aR().p();
    }

    public void c() {
        this.g.a();
    }

    public void d() {
        this.g.b();
    }

    public Matrix3x2fStack e() {
        return this.c;
    }

    public void a(int $$0, int $$1, int $$2, int $$3) {
        if ($$1 < $$0) {
            int $$4 = $$0;
            $$0 = $$1;
            $$1 = $$4;
        }
        this.a($$0, $$2, $$1 + 1, $$2 + 1, $$3);
    }

    public void b(int $$0, int $$1, int $$2, int $$3) {
        if ($$2 < $$1) {
            int $$4 = $$1;
            $$1 = $$2;
            $$2 = $$4;
        }
        this.a($$0, $$1 + 1, $$0 + 1, $$2, $$3);
    }

    public void c(int $$0, int $$1, int $$2, int $$3) {
        gpm $$4 = new gpm($$0, $$1, $$2 - $$0, $$3 - $$1).a((Matrix3x2fc)this.c);
        this.d.a($$4);
    }

    public void f() {
        this.d.a();
    }

    public boolean a(int $$0, int $$1) {
        return this.d.a($$0, $$1);
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        this.a(hpa.aq, $$0, $$1, $$2, $$3, $$4);
    }

    public void a(RenderPipeline $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        if ($$1 < $$3) {
            int $$6 = $$1;
            $$1 = $$3;
            $$3 = $$6;
        }
        if ($$2 < $$4) {
            int $$7 = $$2;
            $$2 = $$4;
            $$4 = $$7;
        }
        this.a($$0, gpq.a(), $$1, $$2, $$3, $$4, $$5, null);
    }

    public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a(hpa.aq, gpq.a(), $$0, $$1, $$2, $$3, $$4, (Integer)$$5);
    }

    public void a(RenderPipeline $$0, gpq $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, -1, null);
    }

    private void a(RenderPipeline $$0, gpq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, @Nullable Integer $$7) {
        this.g.a(new gqc($$0, $$1, (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.c), $$2, $$3, $$4, $$5, $$6, $$7 != null ? $$7 : $$6, this.d.b()));
    }

    public void a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
        if ($$4) {
            this.a(hpa.ar, $$0, $$1, $$2, $$3, -1);
        }
        this.a(hpa.as, $$0, $$1, $$2, $$3, -16776961);
    }

    public void a(gio $$0, String $$1, int $$2, int $$3, int $$4) {
        this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
    }

    public void a(gio $$0, yh $$1, int $$2, int $$3, int $$4) {
        bfr $$5 = $$1.g();
        this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
    }

    public void a(gio $$0, bfr $$1, int $$2, int $$3, int $$4) {
        this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
    }

    public void b(gio $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
        this.a($$0, $$1, $$2, $$3, $$4, true);
    }

    public void a(gio $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$1 == null) {
            return;
        }
        this.a($$0, uu.a().a(yn.e($$1)), $$2, $$3, $$4, $$5);
    }

    public void b(gio $$0, bfr $$1, int $$2, int $$3, int $$4) {
        this.a($$0, $$1, $$2, $$3, $$4, true);
    }

    public void a(gio $$0, bfr $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if (bel.b($$4) == 0) {
            return;
        }
        this.g.a(new gqh($$0, $$1, (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.c), $$2, $$3, $$4, 0, $$5, false, this.d.b()));
    }

    public void b(gio $$0, yh $$1, int $$2, int $$3, int $$4) {
        this.a($$0, $$1, $$2, $$3, $$4, true);
    }

    public void a(gio $$0, yh $$1, int $$2, int $$3, int $$4, boolean $$5) {
        this.a($$0, $$1.g(), $$2, $$3, $$4, $$5);
    }

    public void a(gio $$0, yn $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, true);
    }

    public void a(gio $$0, yn $$1, int $$2, int $$3, int $$4, int $$5, boolean $$6) {
        for (bfr $$7 : $$0.c($$1, $$4)) {
            this.a($$0, $$7, $$2, $$3, $$5, $$6);
            $$3 += $$0.b;
        }
    }

    public void a(gio $$0, yh $$1, int $$2, int $$3, int $$4, int $$5) {
        int $$6 = this.b.k.b(0.0f);
        if ($$6 != 0) {
            int $$7 = 2;
            this.a($$2 - 2, $$3 - 2, $$2 + $$4 + 2, $$3 + $$0.b + 2, bel.a($$6, $$5));
        }
        this.a($$0, $$1, $$2, $$3, $$5, true);
    }

    public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
        this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
        this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
        this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
        this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, bel.b($$6));
    }

    private static ine a(ilp $$0) {
        return $$0.e().a(ind.c).orElse(ind.a).a();
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        ine $$8;
        ilp $$7 = this.f.a($$1);
        ine ine2 = $$8 = gir.a($$7);
        Objects.requireNonNull(ine2);
        ine ine3 = ine2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ine.b.class, ine.c.class, ine.a.class}, (Object)ine3, n2)) {
            case 0: {
                ine.b $$9 = (ine.b)ine3;
                this.a($$0, $$7, $$2, $$3, $$4, $$5, $$6);
                break;
            }
            case 1: {
                ine.c $$10 = (ine.c)ine3;
                this.a($$0, $$7, $$2, $$3, $$4, $$5, 0, 0, $$10.b(), $$10.c(), $$10.b(), $$10.c(), $$6);
                break;
            }
            case 2: {
                ine.a $$11 = (ine.a)ine3;
                this.a($$0, $$7, $$11, $$2, $$3, $$4, $$5, $$6);
                break;
            }
        }
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, -1);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
        ilp $$11 = this.f.a($$1);
        ine $$12 = gir.a($$11);
        if ($$12 instanceof ine.b) {
            this.a($$0, $$11, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
        } else {
            this.c($$6, $$7, $$6 + $$8, $$7 + $$9);
            this.a($$0, $$1, $$6 - $$4, $$7 - $$5, $$2, $$3, $$10);
            this.f();
        }
    }

    public void a(RenderPipeline $$0, ilp $$1, int $$2, int $$3, int $$4, int $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
    }

    public void a(RenderPipeline $$0, ilp $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        if ($$4 == 0 || $$5 == 0) {
            return;
        }
        this.a($$0, $$1.h(), $$2, $$2 + $$4, $$3, $$3 + $$5, $$1.c(), $$1.d(), $$1.f(), $$1.g(), $$6);
    }

    private void a(RenderPipeline $$0, ilp $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
        if ($$8 == 0 || $$9 == 0) {
            return;
        }
        this.a($$0, $$1.h(), $$6, $$6 + $$8, $$7, $$7 + $$9, $$1.a((float)$$4 / (float)$$2), $$1.a((float)($$4 + $$8) / (float)$$2), $$1.b((float)$$5 / (float)$$3), $$1.b((float)($$5 + $$9) / (float)$$3), $$10);
    }

    private void a(RenderPipeline $$0, ilp $$1, ine.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        ine.a.a $$8 = $$2.d();
        int $$9 = Math.min($$8.a(), $$5 / 2);
        int $$10 = Math.min($$8.c(), $$5 / 2);
        int $$11 = Math.min($$8.b(), $$6 / 2);
        int $$12 = Math.min($$8.d(), $$6 / 2);
        if ($$5 == $$2.b() && $$6 == $$2.c()) {
            this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$6, $$7);
            return;
        }
        if ($$6 == $$2.c()) {
            this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$6, $$7);
            this.a($$0, $$2, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$6, $$9, 0, $$2.b() - $$10 - $$9, $$2.c(), $$2.b(), $$2.c(), $$7);
            this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$6, $$7);
            return;
        }
        if ($$5 == $$2.b()) {
            this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$11, $$7);
            this.a($$0, $$2, $$1, $$3, $$4 + $$11, $$5, $$6 - $$12 - $$11, 0, $$11, $$2.b(), $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
            this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$5, $$12, $$7);
            return;
        }
        this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$11, $$7);
        this.a($$0, $$2, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$11, $$9, 0, $$2.b() - $$10 - $$9, $$11, $$2.b(), $$2.c(), $$7);
        this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$11, $$7);
        this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$9, $$12, $$7);
        this.a($$0, $$2, $$1, $$3 + $$9, $$4 + $$6 - $$12, $$5 - $$10 - $$9, $$12, $$9, $$2.c() - $$12, $$2.b() - $$10 - $$9, $$12, $$2.b(), $$2.c(), $$7);
        this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, $$2.c() - $$12, $$3 + $$5 - $$10, $$4 + $$6 - $$12, $$10, $$12, $$7);
        this.a($$0, $$2, $$1, $$3, $$4 + $$11, $$9, $$6 - $$12 - $$11, 0, $$11, $$9, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
        this.a($$0, $$2, $$1, $$3 + $$9, $$4 + $$11, $$5 - $$10 - $$9, $$6 - $$12 - $$11, $$9, $$11, $$2.b() - $$10 - $$9, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
        this.a($$0, $$2, $$1, $$3 + $$5 - $$10, $$4 + $$11, $$10, $$6 - $$12 - $$11, $$2.b() - $$10, $$11, $$10, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
    }

    private void a(RenderPipeline $$0, ine.a $$1, ilp $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12, int $$13) {
        if ($$5 <= 0 || $$6 <= 0) {
            return;
        }
        if ($$1.e()) {
            this.a($$0, $$2.h(), $$3, $$3 + $$5, $$4, $$4 + $$6, $$2.a((float)$$7 / (float)$$11), $$2.a((float)($$7 + $$9) / (float)$$11), $$2.b((float)$$8 / (float)$$12), $$2.b((float)($$8 + $$10) / (float)$$12), $$13);
        } else {
            this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
        }
    }

    private void a(RenderPipeline $$0, ilp $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
        if ($$4 <= 0 || $$5 <= 0) {
            return;
        }
        if ($$8 <= 0 || $$9 <= 0) {
            throw new IllegalArgumentException("Tile size must be positive, got " + $$8 + "x" + $$9);
        }
        ikz $$13 = this.b.af().b($$1.h());
        GpuTextureView $$14 = $$13.b();
        this.a($$0, $$14, $$13.c(), $$8, $$9, $$2, $$3, $$2 + $$4, $$3 + $$5, $$1.a((float)$$6 / (float)$$10), $$1.a((float)($$6 + $$8) / (float)$$10), $$1.b((float)$$7 / (float)$$11), $$1.b((float)($$7 + $$9) / (float)$$11), $$12);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9, $$10);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, -1);
    }

    public void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
        this.a($$0, $$1, $$2, $$2 + $$6, $$3, $$3 + $$7, ($$4 + 0.0f) / (float)$$10, ($$4 + (float)$$8) / (float)$$10, ($$5 + 0.0f) / (float)$$11, ($$5 + (float)$$9) / (float)$$11, $$12);
    }

    public void a(amo $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6, float $$7, float $$8) {
        this.a(hpa.at, $$0, $$1, $$3, $$2, $$4, $$5, $$6, $$7, $$8, -1);
    }

    private void a(RenderPipeline $$0, amo $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
        ikz $$11 = this.b.af().b($$1);
        this.a($$0, $$11.b(), $$11.c(), $$2, $$4, $$3, $$5, $$6, $$7, $$8, $$9, $$10);
    }

    private void a(RenderPipeline $$0, GpuTextureView $$1, fzf $$2, int $$3, int $$4, int $$5, int $$6, float $$7, float $$8, float $$9, float $$10, int $$11) {
        this.g.a((gqe)new gqb($$0, gpq.a($$1, $$2), new Matrix3x2f((Matrix3x2fc)this.c), $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, this.d.b()));
    }

    private void a(RenderPipeline $$0, GpuTextureView $$1, fzf $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, float $$9, float $$10, float $$11, float $$12, int $$13) {
        this.g.a(new gqj($$0, gpq.a($$1, $$2), new Matrix3x2f((Matrix3x2fc)this.c), $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13, this.d.b()));
    }

    public void a(dlt $$0, int $$1, int $$2) {
        this.a(this.b.s, this.b.r, $$0, $$1, $$2, 0);
    }

    public void a(dlt $$0, int $$1, int $$2, int $$3) {
        this.a(this.b.s, this.b.r, $$0, $$1, $$2, $$3);
    }

    public void b(dlt $$0, int $$1, int $$2) {
        this.b($$0, $$1, $$2, 0);
    }

    public void b(dlt $$0, int $$1, int $$2, int $$3) {
        this.a(null, this.b.r, $$0, $$1, $$2, $$3);
    }

    public void a(chl $$0, dlt $$1, int $$2, int $$3, int $$4) {
        this.a($$0, $$0.ao(), $$1, $$2, $$3, $$4);
    }

    private void a(@Nullable chl $$0, @Nullable dwo $$1, dlt $$2, int $$3, int $$4, int $$5) {
        if ($$2.f()) {
            return;
        }
        ihs $$6 = new ihs();
        this.b.bh().a($$6, $$2, dlr.g, $$1, $$0, $$5);
        try {
            this.g.a(new gqf($$2.h().l().toString(), new Matrix3x2f((Matrix3x2fc)this.c), $$6, $$3, $$4, this.d.b()));
        }
        catch (Throwable $$7) {
            m $$8 = m.a($$7, "Rendering item");
            n $$9 = $$8.a("Item being rendered");
            $$9.a("Item Type", () -> String.valueOf($$2.h()));
            $$9.a("Item Components", () -> String.valueOf($$2.a()));
            $$9.a("Item Foil", () -> String.valueOf($$2.C()));
            throw new v($$8);
        }
    }

    public void a(gio $$0, dlt $$1, int $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, null);
    }

    public void a(gio $$0, dlt $$1, int $$2, int $$3, @Nullable String $$4) {
        if ($$1.f()) {
            return;
        }
        this.c.pushMatrix();
        this.c($$1, $$2, $$3);
        this.d($$1, $$2, $$3);
        this.b($$0, $$1, $$2, $$3, $$4);
        this.c.popMatrix();
    }

    public void a(yh $$0, int $$1, int $$2) {
        this.a(List.of($$0.g()), $$1, $$2);
    }

    public void a(List<bfr> $$0, int $$1, int $$2) {
        this.a(this.b.g, $$0, gvk.a, $$1, $$2, false);
    }

    public void b(gio $$0, dlt $$1, int $$2, int $$3) {
        this.a($$0, gsb.a(this.b, $$1), $$1.b(), $$2, $$3, $$1.a(ki.K));
    }

    public void a(gio $$0, List<yh> $$1, Optional<djs> $$2, int $$3, int $$4) {
        this.a($$0, $$1, $$2, $$3, $$4, null);
    }

    public void a(gio $$0, List<yh> $$12, Optional<djs> $$2, int $$3, int $$4, @Nullable amo $$5) {
        List<gvi> $$6 = $$12.stream().map(yh::g).map(gvi::a).collect(bhs.b());
        $$2.ifPresent($$1 -> $$6.add($$6.isEmpty() ? 0 : 1, gvi.a($$1)));
        this.a($$0, $$6, $$3, $$4, gvk.a, $$5, false);
    }

    public void a(gio $$0, yh $$1, int $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, null);
    }

    public void a(gio $$0, yh $$1, int $$2, int $$3, @Nullable amo $$4) {
        this.b($$0, List.of($$1.g()), $$2, $$3, $$4);
    }

    public void a(gio $$0, List<yh> $$1, int $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, null);
    }

    public void a(gio $$0, List<yh> $$1, int $$2, int $$3, @Nullable amo $$4) {
        this.a($$0, $$1.stream().map(yh::g).map(gvi::a).toList(), $$2, $$3, gvk.a, $$4, false);
    }

    public void b(gio $$0, List<? extends bfr> $$1, int $$2, int $$3) {
        this.b($$0, $$1, $$2, $$3, null);
    }

    public void b(gio $$0, List<? extends bfr> $$1, int $$2, int $$3, @Nullable amo $$4) {
        this.a($$0, $$1.stream().map(gvi::a).collect(Collectors.toList()), $$2, $$3, gvk.a, $$4, false);
    }

    public void a(gio $$0, List<bfr> $$1, gvj $$2, int $$3, int $$4, boolean $$5) {
        this.a($$0, $$1.stream().map(gvi::a).collect(Collectors.toList()), $$3, $$4, $$2, null, $$5);
    }

    private void a(gio $$0, List<gvi> $$1, int $$2, int $$3, gvj $$4, @Nullable amo $$5, boolean $$6) {
        if ($$1.isEmpty()) {
            return;
        }
        if (this.k == null || $$6) {
            this.k = () -> this.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    public void a(gio $$0, List<gvi> $$1, int $$2, int $$3, gvj $$4, @Nullable amo $$5) {
        int $$6 = 0;
        int $$7 = $$1.size() == 1 ? -2 : 0;
        for (gvi $$8 : $$1) {
            int $$9 = $$8.b($$0);
            if ($$9 > $$6) {
                $$6 = $$9;
            }
            $$7 += $$8.a($$0);
        }
        int $$10 = $$6;
        int $$11 = $$7;
        Vector2ic $$12 = $$4.a(this.a(), this.b(), $$2, $$3, $$10, $$11);
        int $$13 = $$12.x();
        int $$14 = $$12.y();
        this.c.pushMatrix();
        gvm.a(this, $$13, $$14, $$10, $$11, $$5);
        int $$15 = $$14;
        for (int $$16 = 0; $$16 < $$1.size(); ++$$16) {
            gvi $$17 = $$1.get($$16);
            $$17.a(this, $$0, $$13, $$15);
            $$15 += $$17.a($$0) + ($$16 == 0 ? 2 : 0);
        }
        $$15 = $$14;
        for (int $$18 = 0; $$18 < $$1.size(); ++$$18) {
            gvi $$19 = $$1.get($$18);
            $$19.a($$0, $$13, $$15, $$10, $$11, this);
            $$15 += $$19.a($$0) + ($$18 == 0 ? 2 : 0);
        }
        this.c.popMatrix();
    }

    public void g() {
        if (this.l != null) {
            this.a(this.b.g, this.l, this.i, this.j);
        }
        if (this.m != null && this.m.i() != null) {
            this.a(fyn.d);
        }
        if (this.k != null) {
            this.c();
            this.k.run();
            this.k = null;
        }
    }

    private void c(dlt $$0, int $$1, int $$2) {
        if ($$0.s()) {
            int $$3 = $$1 + 2;
            int $$4 = $$2 + 13;
            this.a(hpa.aq, $$3, $$4, $$3 + 13, $$4 + 2, -16777216);
            this.a(hpa.aq, $$3, $$4, $$3 + $$0.t(), $$4 + 1, bel.g($$0.u()));
        }
    }

    private void b(gio $$0, dlt $$1, int $$2, int $$3, @Nullable String $$4) {
        if ($$1.N() != 1 || $$4 != null) {
            String $$5 = $$4 == null ? String.valueOf($$1.N()) : $$4;
            this.a($$0, $$5, $$2 + 19 - 2 - $$0.b($$5), $$3 + 6 + 3, -1, true);
        }
    }

    private void d(dlt $$0, int $$1, int $$2) {
        float $$4;
        hnh $$3 = this.b.s;
        float f2 = $$4 = $$3 == null ? 0.0f : $$3.hh().a($$0, this.b.aD().a(true));
        if ($$4 > 0.0f) {
            int $$5 = $$2 + bgj.b(16.0f * (1.0f - $$4));
            int $$6 = $$5 + bgj.d(16.0f * $$4);
            this.a(hpa.aq, $$1, $$5, $$1 + 16, $$6, Integer.MAX_VALUE);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(gio $$0, @Nullable zf $$1, int $$2, int $$3) {
        if ($$1 == null) {
            return;
        }
        if ($$1.j() == null) return;
        yo yo2 = $$1.j();
        Objects.requireNonNull(yo2);
        yo yo3 = yo2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{yo.d.class, yo.c.class, yo.e.class}, (Object)yo3, n2)) {
            case 0: {
                yo.d d2 = (yo.d)yo3;
                try {
                    dlt dlt2;
                    dlt $$4 = dlt2 = d2.b();
                    this.b($$0, $$4, $$2, $$3);
                    return;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                yo.c c2 = (yo.c)yo3;
                {
                    yo.b b2;
                    yo.b $$5 = b2 = c2.b();
                    if (!this.b.k.k) return;
                    this.a($$0, $$5.a(), $$2, $$3);
                    return;
                }
            }
            case 2: {
                yo.e e2 = (yo.e)yo3;
                {
                    yh yh2;
                    yh $$6 = yh2 = e2.b();
                    this.b($$0, $$0.c($$6, Math.max(this.a() / 2, 200)), $$2, $$3);
                    return;
                }
            }
        }
    }

    public void a(ikr $$0) {
        gfj $$1 = gfj.V();
        ilr $$2 = $$1.af();
        ikz $$3 = $$2.b($$0.a);
        this.a(hpa.at, $$3.b(), $$3.c(), 0, 0, 128, 128, 0.0f, 1.0f, 0.0f, 1.0f, -1);
        for (ikr.a $$4 : $$0.b) {
            if (!$$4.e) continue;
            this.c.pushMatrix();
            this.c.translate((float)$$4.b / 2.0f + 64.0f, (float)$$4.c / 2.0f + 64.0f);
            this.c.rotate((float)Math.PI / 180 * (float)$$4.d * 360.0f / 16.0f);
            this.c.scale(4.0f, 4.0f);
            this.c.translate(-0.125f, 0.125f);
            ilp $$5 = $$4.a;
            if ($$5 != null) {
                ikz $$6 = $$2.b($$5.h());
                this.a(hpa.at, $$6.b(), $$6.c(), -1, -1, 1, 1, $$5.c(), $$5.d(), $$5.g(), $$5.f(), -1);
            }
            this.c.popMatrix();
            if ($$4.f == null) continue;
            gio $$7 = $$1.g;
            float $$8 = $$7.a($$4.f);
            float f2 = 25.0f / $$8;
            Objects.requireNonNull($$7);
            float $$9 = bgj.a(f2, 0.0f, 6.0f / 9.0f);
            this.c.pushMatrix();
            this.c.translate((float)$$4.b / 2.0f + 64.0f - $$8 * $$9 / 2.0f, (float)$$4.c / 2.0f + 64.0f + 4.0f);
            this.c.scale($$9, $$9);
            this.g.a(new gqh($$7, $$4.f.g(), (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.c), 0, 0, -1, Integer.MIN_VALUE, false, false, this.d.b()));
            this.c.popMatrix();
        }
    }

    public void a(idf $$0, float $$1, Vector3f $$2, Quaternionf $$3, @Nullable Quaternionf $$4, int $$5, int $$6, int $$7, int $$8) {
        this.g.a(new gqn($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$1, this.d.b()));
    }

    public void a(hht $$0, amo $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
        this.g.a(new gqq($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$2, this.d.b()));
    }

    public void a(hgr $$0, amo $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8) {
        this.g.a(new gqm($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8, $$2, this.d.b()));
    }

    public void a(hgi $$0, dkr $$1, ekr $$2, int $$3, int $$4, int $$5, int $$6) {
        this.g.a(new gql($$0, $$1, $$2, $$3, $$4, $$5, $$6, this.d.b()));
    }

    public void a(gzp.a $$0, float $$1, epw $$2, int $$3, int $$4, int $$5, int $$6) {
        this.g.a(new gqp($$0, $$2, $$3, $$4, $$5, $$6, $$1, this.d.b()));
    }

    public void a(List<bzo> $$0, int $$1, int $$2, int $$3, int $$4) {
        this.g.a(new gqo($$0, $$1, $$2, $$3, $$4, this.d.b()));
    }

    public ilp a(ins $$0) {
        return this.e.a($$0);
    }

    public gil a(gjc $$0, a $$1) {
        return new b(this.a($$0.A()), $$1, null);
    }

    public gil h() {
        return this.a(gir$a.b);
    }

    public gil a(a $$0) {
        return this.a($$0, null);
    }

    public gil a(a $$0, @Nullable Consumer<zf> $$1) {
        return new b(this.a(1.0f), $$0, $$1);
    }

    private gil.b a(float $$0) {
        return new gil.b((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.c), $$0, this.d.b());
    }

    static class c {
        private final Deque<gpm> a = new ArrayDeque<gpm>();

        c() {
        }

        public gpm a(gpm $$0) {
            gpm $$1 = this.a.peekLast();
            if ($$1 != null) {
                gpm $$2 = Objects.requireNonNullElse($$0.b($$1), gpm.a());
                this.a.addLast($$2);
                return $$2;
            }
            this.a.addLast($$0);
            return $$0;
        }

        public @Nullable gpm a() {
            if (this.a.isEmpty()) {
                throw new IllegalStateException("Scissor stack underflow");
            }
            this.a.removeLast();
            return this.a.peekLast();
        }

        public @Nullable gpm b() {
            return this.a.peekLast();
        }

        public boolean a(int $$0, int $$1) {
            if (this.a.isEmpty()) {
                return true;
            }
            return this.a.peek().a($$0, $$1);
        }
    }

    class b
    implements gil,
    Consumer<zf> {
        private gil.b d;
        private final a e;
        private final @Nullable Consumer<zf> f;

        b(gil.b $$0, @Nullable a $$1, Consumer<zf> $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        @Override
        public gil.b a() {
            return this.d;
        }

        @Override
        public void a(gil.b $$0) {
            this.d = $$0;
        }

        public void a(zf $$0) {
            if (this.e.d && $$0.j() != null) {
                gir.this.l = $$0;
            }
            if (this.e.e && $$0.i() != null) {
                gir.this.m = $$0;
            }
            if (this.f != null) {
                this.f.accept($$0);
            }
        }

        @Override
        public void a(git $$0, int $$1, int $$2, gil.b $$3, bfr $$4) {
            boolean $$5 = this.e.e || this.e.d || this.f != null;
            int $$6 = $$0.a($$1, gir.this.b.g, $$4);
            gqh $$7 = new gqh(gir.this.b.g, $$4, $$3.a(), $$6, $$2, bel.b($$3.b()), 0, true, $$5, $$3.c());
            if (bel.d($$3.b()) != 0) {
                gir.this.g.a($$7);
            }
            if ($$5) {
                gil.a($$7, gir.this.i, gir.this.j, this);
            }
        }

        @Override
        public void a(yh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, gil.b $$6) {
            int $$7 = gir.this.b.g.a($$0);
            int $$8 = gir.this.b.g.b;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$6);
        }

        @Override
        public /* synthetic */ void accept(Object object) {
            this.a((zf)object);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false, false);
        public static final /* enum */ a b = new a(true, false);
        public static final /* enum */ a c = new a(true, true);
        public final boolean d;
        public final boolean e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public static a a(boolean $$0) {
            return $$0 ? b : a;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = gir$a.a();
        }
    }
}

