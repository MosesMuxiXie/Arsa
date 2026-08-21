/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jspecify.annotations.Nullable;

public class egd
extends dzg {
    public static final MapCodec<egd> a = egd.b(egd::new);
    public static final eoy b = eox.u;
    private static final Map<dvt, List<a>> f = new WeakHashMap<dvt, List<a>>();
    public static final int c = 60;
    public static final int d = 8;
    public static final int e = 160;
    private static final int g = 2;

    public MapCodec<? extends egd> a() {
        return a;
    }

    protected egd(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, true));
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        this.b($$1, $$2, $$0);
    }

    private void b(dwo $$0, is $$1, eoh $$2) {
        fmj $$3 = this.a($$0, $$2);
        for (iz $$4 : iz.values()) {
            $$0.a($$1.a($$4), (dzq)this, fmf.a($$3, $$4));
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3) {
            this.b($$1, $$2, $$0);
        }
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(b).booleanValue() && iz.b != $$3) {
            return 15;
        }
        return 0;
    }

    protected boolean a(dwo $$0, is $$1, eoh $$2) {
        return $$0.b($$1.e(), iz.a);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        boolean $$4 = this.a((dwo)$$1, $$2, $$0);
        List<a> $$5 = f.get($$1);
        while ($$5 != null && !$$5.isEmpty() && $$1.au() - $$5.get((int)0).b > 60L) {
            $$5.remove(0);
        }
        if ($$0.c(b).booleanValue()) {
            if ($$4) {
                $$1.a($$2, (eoh)$$0.b(b, false), 3);
                if (egd.a((dwo)$$1, $$2, true)) {
                    $$1.c(1502, $$2, 0);
                    $$1.a($$2, $$1.a_($$2).b(), 160);
                }
            }
        } else if (!$$4 && !egd.a((dwo)$$1, $$2, false)) {
            $$1.a($$2, (eoh)$$0.b(b, true), 3);
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if ($$0.c(b).booleanValue() == this.a($$1, $$2, $$0) && !$$1.af().b($$2, this)) {
            $$1.a($$2, (dzq)this, 2);
        }
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$3 == iz.a) {
            return $$0.a($$1, $$2, $$3);
        }
        return 0;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
        double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
        double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
        $$1.a(ls.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    private static boolean a(dwo $$02, is $$1, boolean $$2) {
        List $$3 = f.computeIfAbsent($$02, $$0 -> Lists.newArrayList());
        if ($$2) {
            $$3.add(new a($$1.j(), $$02.au()));
        }
        int $$4 = 0;
        for (a $$5 : $$3) {
            if (!$$5.a.equals($$1) || ++$$4 < 8) continue;
            return true;
        }
        return false;
    }

    protected @Nullable fmj a(dwo $$0, eoh $$1) {
        return fmf.a($$0, null, iz.b);
    }

    public static class a {
        final is a;
        final long b;

        public a(is $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

