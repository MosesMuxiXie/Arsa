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
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class gwu
implements gki,
gmm {
    private static final amo b = amo.b("recipe_book/overlay_recipe");
    private static final int c = 4;
    private static final int d = 5;
    private static final float e = 0.375f;
    public static final int a = 25;
    private final List<b> f = Lists.newArrayList();
    private boolean g;
    private int h;
    private int i;
    private gwz j = gwz.a;
    private @Nullable dsa k;
    final gxc l;
    private final boolean m;

    public gwu(gxc $$0, boolean $$1) {
        this.l = $$0;
        this.m = $$1;
    }

    public void a(gwz $$0, bhx $$1, boolean $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
        float $$19;
        float $$18;
        float $$17;
        float $$16;
        float $$15;
        this.j = $$0;
        List<drz> $$8 = $$0.a(gwz.a.b);
        List $$9 = $$2 ? Collections.emptyList() : $$0.a(gwz.a.c);
        int $$10 = $$8.size();
        int $$11 = $$10 + $$9.size();
        int $$12 = $$11 <= 16 ? 4 : 5;
        int $$13 = (int)Math.ceil((float)$$11 / (float)$$12);
        this.h = $$3;
        this.i = $$4;
        float $$14 = this.h + Math.min($$11, $$12) * 25;
        if ($$14 > ($$15 = (float)($$5 + 50))) {
            this.h = (int)((float)this.h - $$7 * (float)((int)(($$14 - $$15) / $$7)));
        }
        if (($$16 = (float)(this.i + $$13 * 25)) > ($$17 = (float)($$6 + 50))) {
            this.i = (int)((float)this.i - $$7 * (float)bgj.d(($$16 - $$17) / $$7));
        }
        if (($$18 = (float)this.i) < ($$19 = (float)($$6 - 100))) {
            this.i = (int)((float)this.i - $$7 * (float)bgj.d(($$18 - $$19) / $$7));
        }
        this.g = true;
        this.f.clear();
        for (int $$20 = 0; $$20 < $$11; ++$$20) {
            boolean $$21 = $$20 < $$10;
            drz $$22 = $$21 ? $$8.get($$20) : (drz)$$9.get($$20 - $$10);
            int $$23 = this.h + 4 + 25 * ($$20 % $$12);
            int $$24 = this.i + 5 + 25 * ($$20 / $$12);
            if (this.m) {
                this.f.add(new c(this, $$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
                continue;
            }
            this.f.add(new a(this, $$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
        }
        this.k = null;
    }

    public gwz a() {
        return this.j;
    }

    public @Nullable dsa b() {
        return this.k;
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if ($$0.t() != 0) {
            return false;
        }
        for (b $$2 : this.f) {
            if (!$$2.a($$0, $$1)) continue;
            this.k = $$2.b;
            return true;
        }
        return false;
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return false;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        if (!this.g) {
            return;
        }
        int $$4 = this.f.size() <= 16 ? 4 : 5;
        int $$5 = Math.min(this.f.size(), $$4);
        int $$6 = bgj.d((float)this.f.size() / (float)$$4);
        int $$7 = 4;
        $$0.a(hpa.at, b, this.h, this.i, $$5 * 25 + 8, $$6 * 25 + 8);
        for (b $$8 : this.f) {
            $$8.a($$0, $$1, $$2, $$3);
        }
    }

    public void a(boolean $$0) {
        this.g = $$0;
    }

    public boolean c() {
        return this.g;
    }

    @Override
    public void b(boolean $$0) {
    }

    @Override
    public boolean aP_() {
        return false;
    }

    class c
    extends b {
        private static final amo b = amo.b("recipe_book/furnace_overlay");
        private static final amo c = amo.b("recipe_book/furnace_overlay_highlighted");
        private static final amo d = amo.b("recipe_book/furnace_overlay_disabled");
        private static final amo e = amo.b("recipe_book/furnace_overlay_disabled_highlighted");

        public c(gwu gwu2, int $$0, int $$1, dsa $$2, dry $$3, bhx $$4, boolean $$5) {
            super($$0, $$1, $$2, $$5, gwu$c.a($$3, $$4));
        }

        private static List<b.a> a(dry $$0, bhx $$1) {
            drx $$2;
            List<dlt> $$3;
            if ($$0 instanceof drx && !($$3 = ($$2 = (drx)$$0).b().a($$1)).isEmpty()) {
                return List.of(gwu$c.a(1, 1, $$3));
            }
            return List.of();
        }

        @Override
        protected amo a(boolean $$0) {
            if ($$0) {
                return this.D() ? c : b;
            }
            return this.D() ? e : d;
        }
    }

    class a
    extends b {
        private static final amo b = amo.b("recipe_book/crafting_overlay");
        private static final amo c = amo.b("recipe_book/crafting_overlay_highlighted");
        private static final amo d = amo.b("recipe_book/crafting_overlay_disabled");
        private static final amo e = amo.b("recipe_book/crafting_overlay_disabled_highlighted");
        private static final int f = 3;
        private static final int n = 3;

        public a(gwu gwu2, int $$0, int $$1, dsa $$2, dry $$3, bhx $$4, boolean $$5) {
            super($$0, $$1, $$2, $$5, gwu$a.a($$3, $$4));
        }

        private static List<b.a> a(dry $$0, bhx $$1) {
            ArrayList<b.a> $$22 = new ArrayList<b.a>();
            dry dry2 = $$0;
            Objects.requireNonNull(dry2);
            dry dry3 = dry2;
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{dsc.class, dsd.class}, (Object)dry3, n2)) {
                case 0: {
                    dsc $$32 = (dsc)dry3;
                    ame.a(3, 3, $$32.b(), $$32.c(), $$32.f(), ($$2, $$3, $$4, $$5) -> {
                        List<dlt> $$6 = $$2.a($$1);
                        if (!$$6.isEmpty()) {
                            $$22.add(gwu$a.a($$4, $$5, $$6));
                        }
                    });
                    break;
                }
                case 1: {
                    dsd $$42 = (dsd)dry3;
                    List<dse> $$52 = $$42.b();
                    for (int $$6 = 0; $$6 < $$52.size(); ++$$6) {
                        List<dlt> $$7 = $$52.get($$6).a($$1);
                        if ($$7.isEmpty()) continue;
                        $$22.add(gwu$a.a($$6 % 3, $$6 / 3, $$7));
                    }
                    break;
                }
            }
            return $$22;
        }

        @Override
        protected amo a(boolean $$0) {
            if ($$0) {
                return this.D() ? c : b;
            }
            return this.D() ? e : d;
        }
    }

    abstract class b
    extends gjc {
        final dsa b;
        private final boolean c;
        private final List<a> d;

        public b(int $$0, int $$1, dsa $$2, boolean $$3, List<a> $$4) {
            super($$0, $$1, 24, 24, yg.a);
            this.d = $$4;
            this.b = $$2;
            this.c = $$3;
        }

        protected static a a(int $$0, int $$1, List<dlt> $$2) {
            return new a(3 + $$0 * 7, 3 + $$1 * 7, $$2);
        }

        protected abstract amo a(boolean var1);

        @Override
        public void a(gpd $$0) {
            this.c($$0);
        }

        @Override
        public void a_(gir $$0, int $$1, int $$2, float $$3) {
            $$0.a(hpa.at, this.a(this.c), this.aT_(), this.aU_(), this.g, this.h);
            float $$4 = this.aT_() + 2;
            float $$5 = this.aU_() + 2;
            for (a $$6 : this.d) {
                $$0.e().pushMatrix();
                $$0.e().translate($$4 + (float)$$6.a, $$5 + (float)$$6.b);
                $$0.e().scale(0.375f, 0.375f);
                $$0.e().translate(-8.0f, -8.0f);
                $$0.a($$6.a(gwu.this.l.currentIndex()), 0, 0);
                $$0.e().popMatrix();
            }
        }

        protected static final class a
        extends Record {
            final int a;
            final int b;
            private final List<dlt> c;

            public a(int $$0, int $$1, List<dlt> $$2) {
                if ($$2.isEmpty()) {
                    throw new IllegalArgumentException("Ingredient list must be non-empty");
                }
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            public dlt a(int $$0) {
                return this.c.get($$0 % this.c.size());
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "x;y;ingredients", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "x;y;ingredients", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "x;y;ingredients", "a", "b", "c"}, this, $$0);
            }

            public int a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }

            public List<dlt> c() {
                return this.c;
            }
        }
    }
}

