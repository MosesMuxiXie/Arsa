/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gwy
extends gjc {
    private static final amo a = amo.b("recipe_book/slot_many_craftable");
    private static final amo b = amo.b("recipe_book/slot_craftable");
    private static final amo c = amo.b("recipe_book/slot_many_uncraftable");
    private static final amo d = amo.b("recipe_book/slot_uncraftable");
    private static final float e = 15.0f;
    private static final int f = 25;
    private static final yh n = yh.c("gui.recipebook.moreRecipes");
    private gwz o = gwz.a;
    private List<a> p = List.of();
    private boolean q;
    private final gxc r;
    private float s;

    public gwy(gxc $$0) {
        super(0, 0, 25, 25, yg.a);
        this.r = $$0;
    }

    public void a(gwz $$0, boolean $$12, gww $$2, bhx $$3) {
        this.o = $$0;
        List<drz> $$4 = $$0.a($$12 ? gwz.a.b : gwz.a.a);
        this.p = $$4.stream().map($$1 -> new a($$1.a(), $$1.a($$3))).toList();
        this.q = gwy.a(this.p);
        List<dsa> $$5 = $$4.stream().map(drz::a).filter($$2.d()::b).toList();
        if (!$$5.isEmpty()) {
            $$5.forEach($$2::a);
            this.s = 15.0f;
        }
    }

    private static boolean a(List<a> $$02) {
        Iterator $$1 = $$02.stream().flatMap($$0 -> $$0.b().stream()).iterator();
        if (!$$1.hasNext()) {
            return true;
        }
        dlt $$2 = (dlt)$$1.next();
        while ($$1.hasNext()) {
            dlt $$3 = (dlt)$$1.next();
            if (dlt.c($$2, $$3)) continue;
            return false;
        }
        return true;
    }

    public gwz a() {
        return this.o;
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        boolean $$8;
        amo $$7;
        if (this.o.a()) {
            if (this.i()) {
                amo $$4 = a;
            } else {
                amo $$5 = b;
            }
        } else if (this.i()) {
            amo $$6 = c;
        } else {
            $$7 = d;
        }
        boolean bl2 = $$8 = this.s > 0.0f;
        if ($$8) {
            float $$9 = 1.0f + 0.1f * (float)Math.sin(this.s / 15.0f * (float)Math.PI);
            $$0.e().pushMatrix();
            $$0.e().translate((float)(this.aT_() + 8), (float)(this.aU_() + 12));
            $$0.e().scale($$9, $$9);
            $$0.e().translate((float)(-(this.aT_() + 8)), (float)(-(this.aU_() + 12)));
            this.s -= $$3;
        }
        $$0.a(hpa.at, $$7, this.aT_(), this.aU_(), this.g, this.h);
        dlt $$10 = this.h();
        int $$11 = 4;
        if (this.i() && this.q) {
            $$0.a($$10, this.aT_() + $$11 + 1, this.aU_() + $$11 + 1, 0);
            --$$11;
        }
        $$0.b($$10, this.aT_() + $$11, this.aU_() + $$11);
        if ($$8) {
            $$0.e().popMatrix();
        }
    }

    private boolean i() {
        return this.p.size() > 1;
    }

    public boolean d() {
        return this.p.size() == 1;
    }

    public dsa e() {
        int $$0 = this.r.currentIndex() % this.p.size();
        return this.p.get((int)$$0).a;
    }

    public dlt h() {
        int $$0 = this.r.currentIndex();
        int $$1 = this.p.size();
        int $$2 = $$0 / $$1;
        int $$3 = $$0 - $$1 * $$2;
        return this.p.get($$3).a($$2);
    }

    public List<yh> a(dlt $$0) {
        ArrayList<yh> $$1 = new ArrayList<yh>(gsb.a(gfj.V(), $$0));
        if (this.i()) {
            $$1.add(n);
        }
        return $$1;
    }

    @Override
    public void a(gpd $$0) {
        $$0.a(gpc.a, (yh)yh.a("narration.recipe", this.h().y()));
        if (this.i()) {
            $$0.a(gpc.d, yh.c("narration.button.usage.hovered"), yh.c("narration.recipe.usage.more"));
        } else {
            $$0.a(gpc.d, (yh)yh.c("narration.button.usage.hovered"));
        }
    }

    @Override
    public int aS_() {
        return 25;
    }

    @Override
    protected boolean a(gzd $$0) {
        return $$0.t() == 0 || $$0.t() == 1;
    }

    static final class a
    extends Record {
        final dsa a;
        private final List<dlt> b;

        a(dsa $$0, List<dlt> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public dlt a(int $$0) {
            if (this.b.isEmpty()) {
                return dlt.l;
            }
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;displayItems", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;displayItems", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;displayItems", "a", "b"}, this, $$0);
        }

        public dsa a() {
            return this.a;
        }

        public List<dlt> b() {
            return this.b;
        }
    }
}

