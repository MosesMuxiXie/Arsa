/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gjg
extends giu {
    private static final amo a = amo.b("widget/checkbox_selected_highlighted");
    private static final amo b = amo.b("widget/checkbox_selected");
    private static final amo c = amo.b("widget/checkbox_highlighted");
    private static final amo d = amo.b("widget/checkbox");
    private static final int f = 4;
    private static final int n = 8;
    private boolean o;
    private final b p;
    private final gjz q;

    gjg(int $$0, int $$1, int $$2, yh $$3, gio $$4, boolean $$5, b $$6) {
        super($$0, $$1, 0, 0, $$3);
        this.q = new gjz($$3, $$4);
        this.q.b(2);
        this.g = this.a($$2, $$4);
        this.h = this.b($$4);
        this.o = $$5;
        this.p = $$6;
    }

    public int a(int $$0, gio $$1) {
        this.g = this.a($$0, this.B(), $$1);
        this.q.a(this.g);
        return this.g;
    }

    private int a(int $$0, yh $$1, gio $$2) {
        return Math.min(gjg.b($$1, $$2), $$0);
    }

    private int b(gio $$0) {
        return Math.max(gjg.a($$0), this.q.aR_());
    }

    static int b(yh $$0, gio $$1) {
        return gjg.a($$1) + 4 + $$1.a($$0);
    }

    public static a a(yh $$0, gio $$1) {
        return new a($$0, $$1);
    }

    public static int a(gio $$0) {
        return $$0.b + 8;
    }

    @Override
    public void a(gza $$0) {
        this.o = !this.o;
        this.p.onValueChange(this, this.o);
    }

    public boolean a() {
        return this.o;
    }

    @Override
    public void a(gpd $$0) {
        $$0.a(gpc.a, (yh)this.f());
        if (this.k) {
            if (this.aP_()) {
                $$0.a(gpc.d, (yh)yh.c(this.o ? "narration.checkbox.usage.focused.uncheck" : "narration.checkbox.usage.focused.check"));
            } else {
                $$0.a(gpc.d, (yh)yh.c(this.o ? "narration.checkbox.usage.hovered.uncheck" : "narration.checkbox.usage.hovered.check"));
            }
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        amo $$7;
        gfj $$4 = gfj.V();
        gio $$5 = $$4.g;
        if (this.o) {
            amo $$6 = this.aP_() ? a : b;
        } else {
            $$7 = this.aP_() ? c : d;
        }
        int $$8 = gjg.a($$5);
        $$0.a(hpa.at, $$7, this.aT_(), this.aU_(), $$8, $$8, bel.b(this.m));
        int $$9 = this.aT_() + $$8 + 4;
        int $$10 = this.aU_() + $$8 / 2 - this.q.aR_() / 2;
        this.q.c($$9, $$10);
        this.q.a($$0.a(this, gir.a.a(this.C())));
    }

    public static interface b {
        public static final b a = ($$0, $$1) -> {};

        public void onValueChange(gjg var1, boolean var2);
    }

    public static class a {
        private final yh a;
        private final gio b;
        private int c;
        private int d = 0;
        private int e = 0;
        private b f = gjg$b.a;
        private boolean g = false;
        private @Nullable gfn<Boolean> h = null;
        private @Nullable gks i = null;

        a(yh $$0, gio $$1) {
            this.a = $$0;
            this.b = $$1;
            this.c = gjg.b($$0, $$1);
        }

        public a a(int $$0, int $$1) {
            this.d = $$0;
            this.e = $$1;
            return this;
        }

        public a a(b $$0) {
            this.f = $$0;
            return this;
        }

        public a a(boolean $$0) {
            this.g = $$0;
            this.h = null;
            return this;
        }

        public a a(gfn<Boolean> $$0) {
            this.h = $$0;
            this.g = $$0.b();
            return this;
        }

        public a a(gks $$0) {
            this.i = $$0;
            return this;
        }

        public a a(int $$0) {
            this.c = $$0;
            return this;
        }

        public gjg a() {
            b $$02 = this.h == null ? this.f : ($$0, $$1) -> {
                this.h.a($$1);
                this.f.onValueChange($$0, $$1);
            };
            gjg $$12 = new gjg(this.d, this.e, this.c, this.a, this.b, this.g, $$02);
            $$12.a(this.i);
            return $$12;
        }
    }
}

