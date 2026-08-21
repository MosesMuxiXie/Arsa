/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gck
extends gje {
    private static final amo u = amo.b("widget/slot_frame");
    public static final amo a = amo.b("textures/gui/realms/empty_frame.png");
    public static final amo b = amo.b("textures/gui/title/background/panorama_0.png");
    public static final amo c = amo.b("textures/gui/title/background/panorama_2.png");
    public static final amo d = amo.b("textures/gui/title/background/panorama_3.png");
    private static final yh v = yh.c("mco.configure.world.slot.tooltip.minigame");
    private static final yh w = yh.c("mco.configure.world.slot.tooltip");
    static final yh x = yh.c("mco.worldSlot.minigame");
    private static final int y = 64;
    private static final String z = "...";
    private final int A;
    private b B;

    public gck(int $$0, int $$1, int $$2, int $$3, int $$4, gbg $$5, gje.c $$6) {
        super($$0, $$1, $$2, $$3, yg.a, $$6, r);
        this.A = $$4;
        this.B = this.a($$5);
    }

    public b a() {
        return this.B;
    }

    public b a(gbg $$0) {
        this.B = new b($$0, this.A);
        this.a(this.B, $$0.r);
        return this.B;
    }

    private void a(b $$0, @Nullable String $$1) {
        yh $$2;
        switch ($$0.c.ordinal()) {
            case 1: {
                yh yh2;
                if ($$0.b) {
                    yh2 = v;
                    break;
                }
                yh2 = w;
                break;
            }
            default: {
                yh yh2 = $$2 = null;
            }
        }
        if ($$2 != null) {
            this.a(gks.a($$2));
        }
        yw $$3 = yh.b($$0.f);
        if ($$0.b && $$1 != null) {
            $$3 = $$3.b(yg.x).f($$1);
        }
        this.a_($$3);
    }

    static a a(boolean $$0, boolean $$1, boolean $$2) {
        if (!($$0 || $$1 && $$2)) {
            return gck$a.b;
        }
        return gck$a.a;
    }

    @Override
    public boolean b() {
        return this.B.c != gck$a.a && super.b();
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        Object $$16;
        gio $$15;
        amo $$13;
        int $$4 = this.aT_();
        int $$5 = this.aU_();
        boolean $$6 = this.D();
        if (this.B.b) {
            amo $$7 = gdy.a(String.valueOf(this.B.i), this.B.j);
        } else if (this.B.a) {
            amo $$8 = a;
        } else if (this.B.j != null && this.B.i != -1L) {
            amo $$9 = gdy.a(String.valueOf(this.B.i), this.B.j);
        } else if (this.A == 1) {
            amo $$10 = b;
        } else if (this.A == 2) {
            amo $$11 = c;
        } else if (this.A == 3) {
            amo $$12 = d;
        } else {
            $$13 = a;
        }
        int $$14 = -1;
        if (!this.B.e) {
            $$14 = bel.a(1.0f, 0.56f, 0.56f, 0.56f);
        }
        $$0.a(hpa.at, $$13, $$4 + 1, $$5 + 1, 0.0f, 0.0f, this.g - 2, this.h - 2, 74, 74, 74, 74, $$14);
        if ($$6 && this.B.c != gck$a.a) {
            $$0.a(hpa.at, u, $$4, $$5, this.g, this.h);
        } else if (this.B.e) {
            $$0.a(hpa.at, u, $$4, $$5, this.g, this.h, bel.a(1.0f, 0.8f, 0.8f, 0.8f));
        } else {
            $$0.a(hpa.at, u, $$4, $$5, this.g, this.h, bel.a(1.0f, 0.56f, 0.56f, 0.56f));
        }
        if (this.B.d) {
            $$0.a(hpa.at, fzu.a, $$4 + 3, $$5 + 4, 9, 8);
        }
        if (($$15 = gfj.V().g).b((String)($$16 = this.B.f)) > 64) {
            $$16 = $$15.a((String)$$16, 64 - $$15.b(z)) + z;
        }
        $$0.a($$15, (String)$$16, $$4 + this.g / 2, $$5 + this.h - 14, -1);
        if (this.B.e) {
            $$0.a($$15, fzu.a(this.B.g, this.B.h.a()), $$4 + this.g / 2, $$5 + this.h + 2, -1);
        }
    }

    public static class b {
        final String f;
        final String g;
        final gbg.a h;
        final long i;
        final @Nullable String j;
        public final boolean a;
        public final boolean b;
        public final a c;
        public final boolean d;
        public final boolean e;

        public b(gbg $$0, int $$1) {
            boolean bl2 = this.b = $$1 == 4;
            if (this.b) {
                this.f = x.getString();
                this.i = $$0.s;
                this.j = $$0.t;
                this.a = $$0.s == -1;
                this.g = "";
                this.h = gbg.a.a;
                this.d = false;
                this.e = $$0.j();
            } else {
                gbk $$2 = $$0.j.get($$1);
                this.f = $$2.b.a($$1);
                this.i = $$2.b.g;
                this.j = $$2.b.h;
                this.a = $$2.b.i;
                this.g = $$2.b.e;
                this.h = $$2.b.f;
                this.d = $$2.b();
                this.e = $$0.q == $$1 && !$$0.j();
            }
            this.c = gck.a(this.e, this.a, $$0.k);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = gck$a.a();
        }
    }
}

