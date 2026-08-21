/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class grr
extends grw {
    public static final amo a = amo.b("textures/gui/title/mojangstudios.png");
    private static final int d = bel.b(255, 239, 50, 61);
    private static final int e = bel.b(255, 0, 0, 0);
    private static final IntSupplier f = () -> gfj.V().k.a().b() != false ? e : d;
    private static final int g = 240;
    private static final float h = 60.0f;
    private static final int i = 60;
    private static final int j = 120;
    private static final float k = 0.0625f;
    private static final float l = 0.95f;
    public static final long b = 1000L;
    public static final long c = 500L;
    private final gfj m;
    private final bav n;
    private final Consumer<Optional<Throwable>> o;
    private final boolean p;
    private float q;
    private long r = -1L;
    private long s = -1L;

    public grr(gfj $$0, bav $$1, Consumer<Optional<Throwable>> $$2, boolean $$3) {
        this.m = $$0;
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
    }

    public static void a(ilr $$0) {
        $$0.a(a, new a());
    }

    private static int a(int $$0, int $$1) {
        return $$0 & 0xFFFFFF | $$1 << 24;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        float $$14;
        float $$8;
        int $$4 = $$0.a();
        int $$5 = $$0.b();
        long $$6 = bhs.c();
        if (this.p && this.s == -1L) {
            this.s = $$6;
        }
        float $$7 = this.r > -1L ? (float)($$6 - this.r) / 1000.0f : -1.0f;
        float f2 = $$8 = this.s > -1L ? (float)($$6 - this.s) / 500.0f : -1.0f;
        if ($$7 >= 1.0f) {
            if (this.m.x != null) {
                this.m.x.c($$0, 0, 0, $$3);
            } else {
                this.m.j.b();
            }
            int $$9 = bgj.d((1.0f - bgj.a($$7 - 1.0f, 0.0f, 1.0f)) * 255.0f);
            $$0.c();
            $$0.a(0, 0, $$4, $$5, grr.a(f.getAsInt(), $$9));
            float $$10 = 1.0f - bgj.a($$7 - 1.0f, 0.0f, 1.0f);
        } else if (this.p) {
            if (this.m.x != null && $$8 < 1.0f) {
                this.m.x.c($$0, $$1, $$2, $$3);
            } else {
                this.m.j.b();
            }
            int $$11 = bgj.e(bgj.a((double)$$8, 0.15, 1.0) * 255.0);
            $$0.c();
            $$0.a(0, 0, $$4, $$5, grr.a(f.getAsInt(), $$11));
            float $$12 = bgj.a($$8, 0.0f, 1.0f);
        } else {
            int $$13 = f.getAsInt();
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.m.l().c(), $$13);
            $$14 = 1.0f;
        }
        int $$15 = (int)((double)$$0.a() * 0.5);
        int $$16 = (int)((double)$$0.b() * 0.5);
        double $$17 = Math.min((double)$$0.a() * 0.75, (double)$$0.b()) * 0.25;
        int $$18 = (int)($$17 * 0.5);
        double $$19 = $$17 * 4.0;
        int $$20 = (int)($$19 * 0.5);
        int $$21 = bel.b($$14);
        $$0.a(hpa.aB, a, $$15 - $$20, $$16 - $$18, -0.0625f, 0.0f, $$20, (int)$$17, 120, 60, 120, 120, $$21);
        $$0.a(hpa.aB, a, $$15, $$16 - $$18, 0.0625f, 60.0f, $$20, (int)$$17, 120, 60, 120, 120, $$21);
        int $$22 = (int)((double)$$0.b() * 0.8325);
        float $$23 = this.n.b();
        this.q = bgj.a(this.q * 0.95f + $$23 * 0.050000012f, 0.0f, 1.0f);
        if ($$7 < 1.0f) {
            this.a($$0, $$4 / 2 - $$20, $$22 - 5, $$4 / 2 + $$20, $$22 + 5, 1.0f - bgj.a($$7, 0.0f, 1.0f));
        }
        if ($$7 >= 2.0f) {
            this.m.a((grw)null);
        }
    }

    @Override
    public void a() {
        if (this.r == -1L && this.n.c() && this.c()) {
            try {
                this.n.d();
                this.o.accept(Optional.empty());
            }
            catch (Throwable $$0) {
                this.o.accept(Optional.of($$0));
            }
            this.r = bhs.c();
            if (this.m.x != null) {
                fyk $$1 = this.m.aR();
                this.m.x.b($$1.o(), $$1.p());
            }
        }
    }

    private boolean c() {
        return !this.p || this.s > -1L && bhs.c() - this.s >= 1000L;
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
        int $$6 = bgj.d((float)($$3 - $$1 - 2) * this.q);
        int $$7 = Math.round($$5 * 255.0f);
        int $$8 = bel.b($$7, 255, 255, 255);
        $$0.a($$1 + 2, $$2 + 2, $$1 + $$6, $$4 - 2, $$8);
        $$0.a($$1 + 1, $$2, $$3 - 1, $$2 + 1, $$8);
        $$0.a($$1 + 1, $$4, $$3 - 1, $$4 - 1, $$8);
        $$0.a($$1, $$2, $$1 + 1, $$4, $$8);
        $$0.a($$3, $$2, $$3 - 1, $$4, $$8);
    }

    @Override
    public boolean b() {
        return true;
    }

    static class a
    extends ilh {
        public a() {
            super(a);
        }

        @Override
        public ilq a(baz $$0) throws IOException {
            bbc $$1 = gfj.V().aj().d();
            try (InputStream $$2 = $$1.open(a);){
                ilq ilq2 = new ilq(fyh.a($$2), new inj(true, true, ile.b, 0.0f));
                return ilq2;
            }
        }
    }
}

