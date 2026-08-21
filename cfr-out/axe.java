/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface axe
extends dwh {
    public axf a();

    default public @Nullable ddm a(csk $$0, chl $$1) {
        return this.a(this.E(), $$0, $$1, $$1.dP(), $$1.dR(), $$1.dV());
    }

    default public @Nullable ddm a(csk $$0, chl $$1, double $$2, double $$3, double $$4) {
        return this.a(this.E(), $$0, $$1, $$2, $$3, $$4);
    }

    default public @Nullable ddm a(csk $$0, double $$1, double $$2, double $$3) {
        return this.a(this.E(), $$0, null, $$1, $$2, $$3);
    }

    default public <T extends chl> @Nullable T a(Class<? extends T> $$02, csk $$1, @Nullable chl $$2, double $$3, double $$4, double $$5, fth $$6) {
        return (T)this.a(this.a($$02, $$6, (? super T $$0) -> true), $$1, $$2, $$3, $$4, $$5);
    }

    default public @Nullable chl a(bef<cgu<?>> $$0, csk $$12, @Nullable chl $$2, double $$3, double $$4, double $$5, fth $$6) {
        double $$7 = Double.MAX_VALUE;
        chl $$8 = null;
        for (chl $$9 : this.a(chl.class, $$6, (? super T $$1) -> $$1.ay().a($$0))) {
            double $$10;
            if (!$$12.a(this.a(), $$2, $$9) || !(($$10 = $$9.h($$3, $$4, $$5)) < $$7)) continue;
            $$7 = $$10;
            $$8 = $$9;
        }
        return $$8;
    }

    default public <T extends chl> @Nullable T a(List<? extends T> $$0, csk $$1, @Nullable chl $$2, double $$3, double $$4, double $$5) {
        double $$6 = -1.0;
        chl $$7 = null;
        for (chl $$8 : $$0) {
            if (!$$1.a(this.a(), $$2, $$8)) continue;
            double $$9 = $$8.h($$3, $$4, $$5);
            if ($$6 != -1.0 && !($$9 < $$6)) continue;
            $$6 = $$9;
            $$7 = $$8;
        }
        return (T)$$7;
    }

    default public List<ddm> a(csk $$0, chl $$1, fth $$2) {
        ArrayList<ddm> $$3 = new ArrayList<ddm>();
        for (ddm ddm2 : this.E()) {
            if (!$$2.e(ddm2.dP(), ddm2.dR(), ddm2.dV()) || !$$0.a(this.a(), $$1, ddm2)) continue;
            $$3.add(ddm2);
        }
        return $$3;
    }

    default public <T extends chl> List<T> a(Class<T> $$02, csk $$1, chl $$2, fth $$3) {
        List<chl> $$4 = this.a($$02, $$3, (? super T $$0) -> true);
        ArrayList<chl> $$5 = new ArrayList<chl>();
        for (chl $$6 : $$4) {
            if (!$$1.a(this.a(), $$2, $$6)) continue;
            $$5.add($$6);
        }
        return $$5;
    }
}

