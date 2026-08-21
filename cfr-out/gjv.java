/*
 * Decompiled with CFR 0.152.
 */
public class gjv
extends gje {
    private boolean a;

    public gjv(int $$0, int $$1, gje.c $$2) {
        super($$0, $$1, 20, 20, yh.c("narrator.button.difficulty_lock"), $$2, r);
    }

    @Override
    protected yw f() {
        return yg.a(new yh[]{super.f(), this.a() ? yh.c("narrator.button.difficulty_lock.locked") : yh.c("narrator.button.difficulty_lock.unlocked")});
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean $$0) {
        this.a = $$0;
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        a $$6;
        if (!this.k) {
            a $$4 = this.a ? gjv$a.c : gjv$a.f;
        } else if (this.D()) {
            a $$5 = this.a ? gjv$a.b : gjv$a.e;
        } else {
            $$6 = this.a ? gjv$a.a : gjv$a.d;
        }
        $$0.a(hpa.at, $$6.g, this.aT_(), this.aU_(), this.g, this.h);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(amo.b("widget/locked_button"));
        public static final /* enum */ a b = new a(amo.b("widget/locked_button_highlighted"));
        public static final /* enum */ a c = new a(amo.b("widget/locked_button_disabled"));
        public static final /* enum */ a d = new a(amo.b("widget/unlocked_button"));
        public static final /* enum */ a e = new a(amo.b("widget/unlocked_button_highlighted"));
        public static final /* enum */ a f = new a(amo.b("widget/unlocked_button_disabled"));
        final amo g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(amo $$0) {
            this.g = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            h = gjv$a.a();
        }
    }
}

