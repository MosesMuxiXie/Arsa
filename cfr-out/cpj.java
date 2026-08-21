/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class cpj<T extends dfi>
extends cop {
    private static final int a = 20;
    private static final float b = 1.0f;
    private final T c;
    private int d;

    public cpj(T $$0) {
        this.c = $$0;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        return ((chn)this.c).ag_() == null && !((cgk)this.c).dm() && ((dfi)this.c).hh() && !((dfi)this.c).he().a() && !cpj.a(((cgk)this.c).ao()).e(((cgk)this.c).dK());
    }

    @Override
    public boolean c() {
        return ((dfi)this.c).hh() && !((dfi)this.c).he().a() && !cpj.a(((cgk)this.c).ao()).e(((cgk)this.c).dK());
    }

    @Override
    public void a() {
        if (((dfi)this.c).hh()) {
            ftm $$1;
            dfh $$0 = ((dfi)this.c).he();
            if (((dfi)this.c).at > this.d) {
                this.d = ((dfi)this.c).at + 20;
                this.a($$0);
            }
            if (!((cht)this.c).gL() && ($$1 = cso.a(this.c, 15, 4, ftm.c($$0.q()), 1.5707963705062866)) != null) {
                ((chn)this.c).N().a($$1.g, $$1.h, $$1.i, 1.0);
            }
        }
    }

    private void a(dfh $$02) {
        if ($$02.r()) {
            axf $$1 = cpj.a(((cgk)this.c).ao());
            HashSet $$2 = Sets.newHashSet();
            List<dfi> $$3 = $$1.a(dfi.class, ((cgk)this.c).dj().g(16.0), $$0 -> !$$0.hh() && dfj.a($$0));
            $$2.addAll($$3);
            for (dfi $$4 : $$2) {
                $$02.a($$1, $$02.j(), $$4, null, true);
            }
        }
    }
}

