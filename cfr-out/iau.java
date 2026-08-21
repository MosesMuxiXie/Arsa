/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class iau {
    private static final int a = 0;
    private final inq b;
    private final Function<a, amo> c;
    private final Function<b, ilp> d;

    public iau(inq $$02, ilo $$12) {
        this.b = $$02;
        this.c = bhs.b($$0 -> $$0.b.a($$0.a));
        this.d = bhs.b($$1 -> $$12.a($$1.a()));
    }

    public <S> void a(inr.d $$0, amt<dul> $$1, gzp<? super S> $$2, S $$3, dlt $$4, fzm $$5, hpo $$6, int $$7, int $$8) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, null, $$8, 1);
    }

    public <S> void a(inr.d $$0, amt<dul> $$1, gzp<? super S> $$2, S $$3, dlt $$4, fzm $$5, hpo $$6, int $$7, @Nullable amo $$8, int $$9, int $$10) {
        List<inr.c> $$11 = this.b.a($$1).a($$0);
        if ($$11.isEmpty()) {
            return;
        }
        int $$12 = doj.a($$4, 0);
        boolean $$13 = $$4.C();
        int $$14 = $$10;
        for (inr.c $$15 : $$11) {
            int $$16 = iau.a($$15, $$12);
            if ($$16 == 0) continue;
            amo $$17 = $$15.c() && $$8 != null ? $$8 : this.c.apply(new a($$0, $$15));
            $$6.a($$14++).a($$2, $$3, $$5, ijt.a($$17), $$7, ilg.d, $$16, null, $$9, null);
            if ($$13) {
                $$6.a($$14++).a($$2, $$3, $$5, ijt.f(), $$7, ilg.d, $$16, null, $$9, null);
            }
            $$13 = false;
        }
        dup $$18 = $$4.a(ki.ad);
        if ($$18 != null) {
            ilp $$19 = this.d.apply(new b($$18, $$0, $$1));
            ijs $$20 = hpj.a($$18.b().a().c());
            $$6.a($$14++).a($$2, $$3, $$5, $$20, $$7, ilg.d, -1, $$19, $$9, null);
        }
    }

    private static int a(inr.c $$0, int $$1) {
        Optional<inr.b> $$2 = $$0.b();
        if ($$2.isPresent()) {
            int $$3 = $$2.get().a().map(bel::g).orElse(0);
            return $$1 != 0 ? $$1 : $$3;
        }
        return -1;
    }

    static final class a
    extends Record {
        final inr.d a;
        final inr.c b;

        a(inr.d $$0, inr.c $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "layerType;layer", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "layerType;layer", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "layerType;layer", "a", "b"}, this, $$0);
        }

        public inr.d a() {
            return this.a;
        }

        public inr.c b() {
            return this.b;
        }
    }

    record b(dup a, inr.d b, amt<dul> c) {
        private final dup a;
        private final inr.d b;
        private final amt<dul> c;

        public amo a() {
            return this.a.a(this.b.a(), this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "trim;layerType;equipmentAssetId", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "trim;layerType;equipmentAssetId", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "trim;layerType;equipmentAssetId", "a", "b", "c"}, this, $$0);
        }

        public dup b() {
            return this.a;
        }

        public inr.d c() {
            return this.b;
        }

        public amt<dul> d() {
            return this.c;
        }
    }
}

