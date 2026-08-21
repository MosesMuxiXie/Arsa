/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gyb
extends gsb {
    private static final yh a = yh.c("selectWorld.experiments");
    private static final yh b = yh.c("selectWorld.experiments.info").a(l.m);
    private static final int c = 310;
    private static final int d = 130;
    private final gou e = new gou(this);
    private final gsb f;
    private final bak t;
    private final Consumer<bak> u;
    private final Object2BooleanMap<bah> v = new Object2BooleanLinkedOpenHashMap();
    private @Nullable gkk w;

    public gyb(gsb $$0, bak $$1, Consumer<bak> $$2) {
        super(a);
        this.f = $$0;
        this.t = $$1;
        this.u = $$2;
        for (bah $$3 : $$1.d()) {
            if ($$3.l() != bal.d) continue;
            this.v.put((Object)$$3, $$1.g().contains($$3));
        }
    }

    @Override
    protected void bg_() {
        this.e.a(a, this.q);
        goy $$02 = this.e.c(goy.d());
        $$02.a(new gjz(b, this.q).a(310), (gox $$0) -> $$0.e(15));
        gyg.a $$13 = gyg.a(299).a(2, true).b(4);
        this.v.forEach(($$12, $$2) -> $$13.a(gyb.a($$12), () -> this.v.getBoolean($$12), $$1 -> this.v.put($$12, $$1.booleanValue())).a($$12.c()));
        gov $$22 = $$13.a().a();
        this.w = new gkk(this.n, $$22, 130);
        this.w.a(310);
        $$02.a(this.w);
        goy $$3 = this.e.b(goy.e().a(8));
        $$3.a(gje.a(yg.d, (gje $$0) -> this.o()).a());
        $$3.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a());
        this.e.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    private static yh a(bah $$0) {
        String $$1 = "dataPack." + $$0.g() + ".name";
        return imu.a($$1) ? yh.c($$1) : $$0.b();
    }

    @Override
    protected void c() {
        this.w.b(130);
        this.e.a();
        int $$0 = this.p - this.e.b() - this.w.aV_().c();
        this.w.b(this.w.aR_() + $$0);
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), b});
    }

    @Override
    public void aX_() {
        this.n.a(this.f);
    }

    private void o() {
        ArrayList<bah> $$0 = new ArrayList<bah>(this.t.g());
        ArrayList $$1 = new ArrayList();
        this.v.forEach(($$2, $$3) -> {
            $$0.remove($$2);
            if ($$3) {
                $$1.add($$2);
            }
        });
        $$0.addAll(Lists.reverse($$1));
        this.t.b($$0.stream().map(bah::g).toList());
        this.u.accept(this.t);
    }
}

