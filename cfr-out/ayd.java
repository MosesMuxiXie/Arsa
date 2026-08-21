/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Comparators
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.Comparators;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.lang.invoke.LambdaMetafactory;
import java.util.Comparator;
import java.util.List;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import org.slf4j.Logger;

public class ayd {
    private static final Logger c = LogUtils.getLogger();
    public static final float a = 0.01f;
    public static final float b = 64.0f;
    private static final float d = 9.0f;
    private static final int e = 10;
    private final LongSet f = new LongOpenHashSet();
    private final boolean g;
    private float h = 9.0f;
    private float i;
    private int j;
    private int k = 1;

    public ayd(boolean $$0) {
        this.g = $$0;
    }

    public void a(eqq $$0) {
        this.f.add($$0.f().b());
    }

    public void a(axg $$0, dvu $$1) {
        if (!this.f.remove($$1.b()) && $$0.cb()) {
            $$0.g.b(new ael($$1));
        }
    }

    public void a(axg $$0) {
        if (this.j >= this.k) {
            return;
        }
        float $$1 = Math.max(1.0f, this.h);
        this.i = Math.min(this.i + this.h, $$1);
        if (this.i < 1.0f) {
            return;
        }
        if (this.f.isEmpty()) {
            return;
        }
        axf $$2 = $$0.A();
        awj $$3 = $$2.p().a;
        List<eqq> $$4 = this.a($$3, $$0.dM());
        if ($$4.isEmpty()) {
            return;
        }
        ayi $$5 = $$0.g;
        ++this.j;
        $$5.b(adp.a);
        for (eqq $$6 : $$4) {
            ayd.a($$5, $$2, $$6);
        }
        $$5.b(new ado($$4.size()));
        this.i -= (float)$$4.size();
    }

    private static void a(ayi $$0, axf $$1, eqq $$2) {
        $$0.b(new aer($$2, $$1.C_(), null, null));
        dvu $$3 = $$2.f();
        if (w.M) {
            c.debug("SEN {}", (Object)$$3);
        }
        $$1.W().a($$0.g, $$2.f());
    }

    /*
     * Unable to fully structure code
     */
    private List<eqq> a(awj $$0, dvu $$1) {
        $$2 = bgj.b(this.i);
        if (this.g) ** GOTO lbl7
        if (this.f.size() <= $$2) {
lbl7:
            // 2 sources

            $$3 = this.f.longStream().mapToObj((LongFunction<eqq>)LambdaMetafactory.metafactory(null, null, null, (J)Ljava/lang/Object;, f(long ), (J)Leqq;)((awj)$$0)).filter((Predicate<eqq>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nonNull(java.lang.Object ), (Leqq;)Z)()).sorted(Comparator.comparingInt((ToIntFunction<eqq>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, a(dvu eqq ), (Leqq;)I)((dvu)$$1))).toList();
        } else {
            $$4 = ((List)this.f.stream().collect(Comparators.least((int)$$2, Comparator.comparingInt((ToIntFunction<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, c(long ), (Ljava/lang/Long;)I)((dvu)$$1))))).stream().mapToLong((ToLongFunction<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)J, longValue(), (Ljava/lang/Long;)J)()).mapToObj((LongFunction<eqq>)LambdaMetafactory.metafactory(null, null, null, (J)Ljava/lang/Object;, f(long ), (J)Leqq;)((awj)$$0)).filter((Predicate<eqq>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nonNull(java.lang.Object ), (Leqq;)Z)()).toList();
        }
        for (eqq $$5 : $$4) {
            this.f.remove($$5.f().b());
        }
        return $$4;
    }

    public void a(float $$0) {
        --this.j;
        float f2 = this.h = Double.isNaN($$0) ? 0.01f : bgj.a($$0, 0.01f, 64.0f);
        if (this.j == 0) {
            this.i = 1.0f;
        }
        this.k = 10;
    }

    public boolean a(long $$0) {
        return this.f.contains($$0);
    }

    private static /* synthetic */ int a(dvu $$0, eqq $$1) {
        return $$0.b($$1.f());
    }
}

