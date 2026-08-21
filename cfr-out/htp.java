/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class htp {
    private final hpw a;
    private final hrh b;

    public htp(hpw $$0, hrh $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public a a(jw $$0, htn $$1, fzr $$2, hpd $$3) {
        a $$4 = new a();
        is $$5 = $$0.j();
        is $$6 = $$5.b(15, 15, 15);
        htu $$7 = new htu();
        fzm $$8 = new fzm();
        hpy.a();
        EnumMap<hth, fzh> $$9 = new EnumMap<hth, fzh>(hth.class);
        bgr $$10 = bgr.a();
        ObjectArrayList $$11 = new ObjectArrayList();
        for (is is2 : is.c($$5, $$6)) {
            flb $$15;
            elb $$14;
            eoh $$13 = $$1.a_(is2);
            if ($$13.s()) {
                $$7.a(is2);
            }
            if ($$13.x() && ($$14 = $$1.c_(is2)) != null) {
                this.a($$4, $$14);
            }
            if (!($$15 = $$13.y()).c()) {
                hth $$16 = hoe.a($$15);
                fzh $$17 = this.a($$9, $$3, $$16);
                this.a.a(is2, $$1, $$17, $$13, $$15);
            }
            if ($$13.o() != egf.b) continue;
            hth $$18 = hoe.a($$13);
            fzh $$19 = this.a($$9, $$3, $$18);
            $$10.b($$13.b(is2));
            this.a.a($$13).a($$10, (List<hqg>)$$11);
            $$8.a();
            $$8.a(jw.b(is2.u()), jw.b(is2.v()), jw.b(is2.w()));
            this.a.a($$13, is2, $$1, $$8, $$19, true, (List<hqg>)$$11);
            $$8.b();
            $$11.clear();
        }
        for (Map.Entry entry : $$9.entrySet()) {
            hth $$21 = (hth)((Object)entry.getKey());
            fzl $$22 = ((fzh)entry.getValue()).a();
            if ($$22 == null) continue;
            if ($$21 == hth.c) {
                $$4.d = $$22.a($$3.a($$21), $$2);
            }
            $$4.b.put($$21, $$22);
        }
        hpy.b();
        $$4.c = $$7.a();
        return $$4;
    }

    private fzh a(Map<hth, fzh> $$0, hpd $$1, hth $$2) {
        fzh $$3 = $$0.get((Object)$$2);
        if ($$3 == null) {
            fzi $$4 = $$1.a($$2);
            $$3 = new fzh($$4, VertexFormat.b.h, fzk.b);
            $$0.put($$2, $$3);
        }
        return $$3;
    }

    private <E extends elb> void a(a $$0, E $$1) {
        hri $$2 = this.b.a($$1);
        if ($$2 != null && !$$2.bk_()) {
            $$0.a.add($$1);
        }
    }

    public static final class a {
        public final List<elb> a = new ArrayList<elb>();
        public final Map<hth, fzl> b = new EnumMap<hth, fzl>(hth.class);
        public htv c = new htv();
        public @Nullable fzl.b d;

        public void a() {
            this.b.values().forEach(fzl::close);
        }
    }
}

