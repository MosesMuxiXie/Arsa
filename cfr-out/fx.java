/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fx
implements Predicate<eol> {
    private static final Logger a = LogUtils.getLogger();
    private final eoh b;
    private final Set<epk<?>> c;
    private final @Nullable uz d;

    public fx(eoh $$0, Set<epk<?>> $$1, @Nullable uz $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public eoh a() {
        return this.b;
    }

    public Set<epk<?>> b() {
        return this.c;
    }

    public boolean a(eol $$0) {
        eoh $$1 = $$0.a();
        if (!$$1.a(this.b.b())) {
            return false;
        }
        for (epk<?> $$2 : this.c) {
            if ($$1.c($$2) == this.b.c($$2)) continue;
            return false;
        }
        if (this.d != null) {
            elb $$3 = $$0.b();
            return $$3 != null && vo.a((vz)this.d, $$3.b($$0.c().J_()), true);
        }
        return true;
    }

    public boolean a(axf $$0, is $$1) {
        return this.a(new eol($$0, $$1, false));
    }

    public boolean a(axf $$0, is $$1, @dzq.b int $$2) {
        elb $$5;
        eoh $$3;
        eoh eoh2 = $$3 = ($$2 & 0x10) != 0 ? this.b : dzq.b(this.b, (dwp)$$0, $$1);
        if ($$3.l()) {
            $$3 = this.b;
        }
        $$3 = this.a($$3);
        boolean $$4 = false;
        if ($$0.a($$1, $$3, $$2)) {
            $$4 = true;
        }
        if (this.d != null && ($$5 = $$0.c_($$1)) != null) {
            try (bgp.j $$6 = new bgp.j(a);){
                jr $$7 = $$0.J_();
                bgp $$8 = $$6.a($$5.v());
                fnp $$9 = fnp.a($$8.a(() -> "(before)"), $$7);
                $$5.e($$9);
                uz $$10 = $$9.b();
                $$5.b(fno.a((bgp)$$6, (jf.a)$$7, this.d));
                fnp $$11 = fnp.a($$8.a(() -> "(after)"), $$7);
                $$5.e($$11);
                uz $$12 = $$11.b();
                if (!$$12.equals($$10)) {
                    $$4 = true;
                    $$5.e();
                    $$0.p().a($$1);
                }
            }
        }
        return $$4;
    }

    private eoh a(eoh $$0) {
        if ($$0 == this.b) {
            return $$0;
        }
        for (epk<?> $$1 : this.c) {
            $$0 = fx.a($$0, this.b, $$1);
        }
        return $$0;
    }

    private static <T extends Comparable<T>> eoh a(eoh $$0, eoh $$1, epk<T> $$2) {
        return (eoh)$$0.c($$2, $$1.c($$2));
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((eol)object);
    }
}

