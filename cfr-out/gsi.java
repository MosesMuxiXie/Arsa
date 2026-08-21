/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class gsi
extends Enum<gsi> {
    public static final /* enum */ gsi a = new gsi(new a(amo.b("advancements/tab_above_left_selected"), amo.b("advancements/tab_above_middle_selected"), amo.b("advancements/tab_above_right_selected")), new a(amo.b("advancements/tab_above_left"), amo.b("advancements/tab_above_middle"), amo.b("advancements/tab_above_right")), 28, 32, 8);
    public static final /* enum */ gsi b = new gsi(new a(amo.b("advancements/tab_below_left_selected"), amo.b("advancements/tab_below_middle_selected"), amo.b("advancements/tab_below_right_selected")), new a(amo.b("advancements/tab_below_left"), amo.b("advancements/tab_below_middle"), amo.b("advancements/tab_below_right")), 28, 32, 8);
    public static final /* enum */ gsi c = new gsi(new a(amo.b("advancements/tab_left_top_selected"), amo.b("advancements/tab_left_middle_selected"), amo.b("advancements/tab_left_bottom_selected")), new a(amo.b("advancements/tab_left_top"), amo.b("advancements/tab_left_middle"), amo.b("advancements/tab_left_bottom")), 32, 28, 5);
    public static final /* enum */ gsi d = new gsi(new a(amo.b("advancements/tab_right_top_selected"), amo.b("advancements/tab_right_middle_selected"), amo.b("advancements/tab_right_bottom_selected")), new a(amo.b("advancements/tab_right_top"), amo.b("advancements/tab_right_middle"), amo.b("advancements/tab_right_bottom")), 32, 28, 5);
    private final a e;
    private final a f;
    private final int g;
    private final int h;
    private final int i;
    private static final /* synthetic */ gsi[] j;

    public static gsi[] values() {
        return (gsi[])j.clone();
    }

    public static gsi valueOf(String $$0) {
        return Enum.valueOf(gsi.class, $$0);
    }

    private gsi(a $$0, a $$1, int $$2, int $$3, int $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public void a(gir $$0, int $$1, int $$2, boolean $$3, int $$4) {
        amo $$8;
        a $$5;
        a a2 = $$5 = $$3 ? this.e : this.f;
        if ($$4 == 0) {
            amo $$6 = $$5.a();
        } else if ($$4 == this.i - 1) {
            amo $$7 = $$5.c();
        } else {
            $$8 = $$5.b();
        }
        $$0.a(hpa.at, $$8, $$1, $$2, this.g, this.h);
    }

    public void a(gir $$0, int $$1, int $$2, int $$3, dlt $$4) {
        int $$5 = $$1 + this.a($$3);
        int $$6 = $$2 + this.b($$3);
        switch (this.ordinal()) {
            case 0: {
                $$5 += 6;
                $$6 += 9;
                break;
            }
            case 1: {
                $$5 += 6;
                $$6 += 6;
                break;
            }
            case 2: {
                $$5 += 10;
                $$6 += 5;
                break;
            }
            case 3: {
                $$5 += 6;
                $$6 += 5;
            }
        }
        $$0.b($$4, $$5, $$6);
    }

    public int a(int $$0) {
        switch (this.ordinal()) {
            case 0: {
                return (this.g + 4) * $$0;
            }
            case 1: {
                return (this.g + 4) * $$0;
            }
            case 2: {
                return -this.g + 4;
            }
            case 3: {
                return 248;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + String.valueOf((Object)this));
    }

    public int b(int $$0) {
        switch (this.ordinal()) {
            case 0: {
                return -this.h + 4;
            }
            case 1: {
                return 136;
            }
            case 2: {
                return this.h * $$0;
            }
            case 3: {
                return this.h * $$0;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + String.valueOf((Object)this));
    }

    public boolean a(int $$0, int $$1, int $$2, double $$3, double $$4) {
        int $$5 = $$0 + this.a($$2);
        int $$6 = $$1 + this.b($$2);
        return $$3 > (double)$$5 && $$3 < (double)($$5 + this.g) && $$4 > (double)$$6 && $$4 < (double)($$6 + this.h);
    }

    private static /* synthetic */ gsi[] d() {
        return new gsi[]{a, b, c, d};
    }

    static {
        j = gsi.d();
    }

    record a(amo a, amo b, amo c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "first;middle;last", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "first;middle;last", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "first;middle;last", "a", "b", "c"}, this, $$0);
        }
    }
}

