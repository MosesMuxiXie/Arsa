/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gkp
implements iqq {
    private static final long a = 3000L;
    private final gfj b;
    private final List<b> c = Lists.newArrayList();
    private boolean d;
    private final List<b> e = new ArrayList<b>();

    public gkp(gfj $$0) {
        this.b = $$0;
    }

    public void a(gir $$0) {
        iqr $$1 = this.b.ap();
        if (!this.d && this.b.k.ak().b().booleanValue()) {
            $$1.a(this);
            this.d = true;
        } else if (this.d && !this.b.k.ak().b().booleanValue()) {
            $$1.b(this);
            this.d = false;
        }
        if (!this.d) {
            return;
        }
        fwj $$2 = $$1.b();
        ftm $$3 = $$2.b();
        ftm $$4 = $$2.c();
        ftm $$5 = $$2.a();
        this.e.clear();
        for (b $$6 : this.c) {
            if (!$$6.c($$3)) continue;
            this.e.add($$6);
        }
        if (this.e.isEmpty()) {
            return;
        }
        int $$7 = 0;
        int $$8 = 0;
        double $$9 = this.b.k.J().b();
        Iterator<b> $$10 = this.e.iterator();
        while ($$10.hasNext()) {
            b $$11 = $$10.next();
            $$11.a(3000.0 * $$9);
            if (!$$11.b()) {
                $$10.remove();
                continue;
            }
            $$8 = Math.max($$8, this.b.g.a($$11.a()));
        }
        $$8 += this.b.g.b("<") + this.b.g.b(" ") + this.b.g.b(">") + this.b.g.b(" ");
        if (!this.e.isEmpty()) {
            $$0.c();
        }
        for (b $$12 : this.e) {
            int $$13 = 255;
            yh $$14 = $$12.a();
            a $$15 = $$12.a($$3);
            if ($$15 == null) continue;
            ftm $$16 = $$15.a.d($$3).d();
            double $$17 = $$5.b($$16);
            double $$18 = $$4.b($$16);
            boolean $$19 = $$18 > 0.5;
            int $$20 = $$8 / 2;
            int $$21 = this.b.g.b;
            int $$22 = $$21 / 2;
            float $$23 = 1.0f;
            int $$24 = this.b.g.a($$14);
            int $$25 = bgj.b(bgj.b((float)(bhs.c() - $$15.b) / (float)(3000.0 * $$9), 255.0f, 75.0f));
            $$0.e().pushMatrix();
            $$0.e().translate((float)$$0.a() - (float)$$20 * 1.0f - 2.0f, (float)($$0.b() - 35) - (float)($$7 * ($$21 + 1)) * 1.0f);
            $$0.e().scale(1.0f, 1.0f);
            $$0.a(-$$20 - 1, -$$22 - 1, $$20 + 1, $$22 + 1, this.b.k.b(0.8f));
            int $$26 = bel.b(255, $$25, $$25, $$25);
            if (!$$19) {
                if ($$17 > 0.0) {
                    $$0.b(this.b.g, ">", $$20 - this.b.g.b(">"), -$$22, $$26);
                } else if ($$17 < 0.0) {
                    $$0.b(this.b.g, "<", -$$20, -$$22, $$26);
                }
            }
            $$0.b(this.b.g, $$14, -$$24 / 2, -$$22, $$26);
            $$0.e().popMatrix();
            ++$$7;
        }
    }

    @Override
    public void a(ipm $$0, iqt $$1, float $$2) {
        if ($$1.a() == null) {
            return;
        }
        yh $$3 = $$1.a();
        if (!this.c.isEmpty()) {
            for (b $$4 : this.c) {
                if (!$$4.a().equals($$3)) continue;
                $$4.b(new ftm($$0.h(), $$0.i(), $$0.j()));
                return;
            }
        }
        this.c.add(new b($$3, $$2, new ftm($$0.h(), $$0.i(), $$0.j())));
    }

    static class b {
        private final yh a;
        private final float b;
        private final List<a> c = new ArrayList<a>();

        public b(yh $$0, float $$1, ftm $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c.add(new a($$2, bhs.c()));
        }

        public yh a() {
            return this.a;
        }

        public @Nullable a a(ftm $$0) {
            if (this.c.isEmpty()) {
                return null;
            }
            if (this.c.size() == 1) {
                return this.c.getFirst();
            }
            return this.c.stream().min(Comparator.comparingDouble($$1 -> $$1.a().f($$0))).orElse(null);
        }

        public void b(ftm $$0) {
            this.c.removeIf($$1 -> $$0.equals($$1.a()));
            this.c.add(new a($$0, bhs.c()));
        }

        public boolean c(ftm $$0) {
            if (Float.isInfinite(this.b)) {
                return true;
            }
            if (this.c.isEmpty()) {
                return false;
            }
            a $$1 = this.a($$0);
            if ($$1 == null) {
                return false;
            }
            return $$0.a((jn)$$1.a, (double)this.b);
        }

        public void a(double $$0) {
            long $$1 = bhs.c();
            this.c.removeIf($$2 -> (double)($$1 - $$2.b()) > $$0);
        }

        public boolean b() {
            return !this.c.isEmpty();
        }
    }

    static final class a
    extends Record {
        final ftm a;
        final long b;

        a(ftm $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "location;time", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "location;time", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "location;time", "a", "b"}, this, $$0);
        }

        public ftm a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }
    }
}

