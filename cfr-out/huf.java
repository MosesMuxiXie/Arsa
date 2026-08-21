/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class huf
implements hug.a {
    private final gfj a;
    private double b = Double.MIN_VALUE;
    private List<fug> c = Collections.emptyList();

    public huf(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        double $$6 = bhs.d();
        if ($$6 - this.b > 1.0E8) {
            this.b = $$6;
            cgk $$7 = this.a.i.p().h();
            this.c = ImmutableList.copyOf($$7.ao().f($$7, $$7.dj().g(6.0)));
        }
        for (fug $$8 : this.c) {
            ul $$9 = ul.a(-1);
            for (fth $$10 : $$8.e()) {
                um.a($$10, $$9);
            }
        }
    }
}

