/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class gyp {
    static final amo b = amo.b("spectator/close");
    static final amo c = amo.b("spectator/scroll_left");
    static final amo d = amo.b("spectator/scroll_right");
    private static final gyr e = new a();
    private static final gyr f = new b(-1, true);
    private static final gyr g = new b(1, true);
    private static final gyr h = new b(1, false);
    private static final int i = 8;
    static final yh j = yh.c("spectatorMenu.close");
    static final yh k = yh.c("spectatorMenu.previous_page");
    static final yh l = yh.c("spectatorMenu.next_page");
    public static final gyr a = new gyr(){

        @Override
        public void a(gyp $$0) {
        }

        @Override
        public yh bh_() {
            return yg.a;
        }

        @Override
        public void a(gir $$0, float $$1, float $$2) {
        }

        @Override
        public boolean bi_() {
            return false;
        }
    };
    private final gys m;
    private gyq n = new gyo();
    private int o = -1;
    int p;

    public gyp(gys $$0) {
        this.m = $$0;
    }

    public gyr a(int $$0) {
        int $$1 = $$0 + this.p * 6;
        if (this.p > 0 && $$0 == 0) {
            return f;
        }
        if ($$0 == 7) {
            if ($$1 < this.n.a().size()) {
                return g;
            }
            return h;
        }
        if ($$0 == 8) {
            return e;
        }
        if ($$1 < 0 || $$1 >= this.n.a().size()) {
            return a;
        }
        return (gyr)MoreObjects.firstNonNull((Object)this.n.a().get($$1), (Object)a);
    }

    public List<gyr> a() {
        ArrayList $$0 = Lists.newArrayList();
        for (int $$1 = 0; $$1 <= 8; ++$$1) {
            $$0.add(this.a($$1));
        }
        return $$0;
    }

    public gyr b() {
        return this.a(this.o);
    }

    public gyq c() {
        return this.n;
    }

    public void b(int $$0) {
        gyr $$1 = this.a($$0);
        if ($$1 != a) {
            if (this.o == $$0 && $$1.bi_()) {
                $$1.a(this);
            } else {
                this.o = $$0;
            }
        }
    }

    public void d() {
        this.m.a(this);
    }

    public int e() {
        return this.o;
    }

    public void a(gyq $$0) {
        this.n = $$0;
        this.o = -1;
        this.p = 0;
    }

    public gyt f() {
        return new gyt(this.a(), this.o);
    }

    static class a
    implements gyr {
        a() {
        }

        @Override
        public void a(gyp $$0) {
            $$0.d();
        }

        @Override
        public yh bh_() {
            return j;
        }

        @Override
        public void a(gir $$0, float $$1, float $$2) {
            $$0.a(hpa.at, b, 0, 0, 16, 16, bel.a($$2, $$1, $$1, $$1));
        }

        @Override
        public boolean bi_() {
            return true;
        }
    }

    static class b
    implements gyr {
        private final int a;
        private final boolean b;

        public b(int $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void a(gyp $$0) {
            $$0.p += this.a;
        }

        @Override
        public yh bh_() {
            return this.a < 0 ? k : l;
        }

        @Override
        public void a(gir $$0, float $$1, float $$2) {
            int $$3 = bel.a($$2, $$1, $$1, $$1);
            if (this.a < 0) {
                $$0.a(hpa.at, c, 0, 0, 16, 16, $$3);
            } else {
                $$0.a(hpa.at, d, 0, 0, 16, 16, $$3);
            }
        }

        @Override
        public boolean bi_() {
            return this.b;
        }
    }
}

