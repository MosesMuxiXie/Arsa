/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.joml.Vector2i
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;

public interface gml
extends gmm {
    public List<? extends gmm> aJ_();

    default public Optional<gmm> c(double $$0, double $$1) {
        for (gmm gmm2 : this.aJ_()) {
            if (!gmm2.a_($$0, $$1)) continue;
            return Optional.of(gmm2);
        }
        return Optional.empty();
    }

    @Override
    default public boolean a(gzc $$0, boolean $$1) {
        Optional<gmm> $$2 = this.c($$0.u(), $$0.v());
        if ($$2.isEmpty()) {
            return false;
        }
        gmm $$3 = $$2.get();
        if ($$3.a($$0, $$1) && $$3.H()) {
            this.a($$3);
            if ($$0.t() == 0) {
                this.c_(true);
            }
        }
        return true;
    }

    @Override
    default public boolean b(gzc $$0) {
        if ($$0.t() == 0 && this.aN_()) {
            this.c_(false);
            if (this.aO_() != null) {
                return this.aO_().b($$0);
            }
        }
        return false;
    }

    @Override
    default public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.aO_() != null && this.aN_() && $$0.t() == 0) {
            return this.aO_().a($$0, $$1, $$2);
        }
        return false;
    }

    public boolean aN_();

    public void c_(boolean var1);

    @Override
    default public boolean a(double $$0, double $$1, double $$2, double $$3) {
        return this.c($$0, $$1).filter($$4 -> $$4.a($$0, $$1, $$2, $$3)).isPresent();
    }

    @Override
    default public boolean a(gzb $$0) {
        return this.aO_() != null && this.aO_().a($$0);
    }

    @Override
    default public boolean b(gzb $$0) {
        return this.aO_() != null && this.aO_().b($$0);
    }

    @Override
    default public boolean a(gyy $$0) {
        return this.aO_() != null && this.aO_().a($$0);
    }

    public @Nullable gmm aO_();

    public void a(@Nullable gmm var1);

    @Override
    default public void b(boolean $$0) {
    }

    @Override
    default public boolean aP_() {
        return this.aO_() != null;
    }

    @Override
    default public @Nullable gin aQ_() {
        gmm $$0 = this.aO_();
        if ($$0 != null) {
            return gin.a(this, $$0.aQ_());
        }
        return null;
    }

    @Override
    default public @Nullable gin a(gpi $$0) {
        gin $$2;
        gmm $$1 = this.aO_();
        if ($$1 != null && ($$2 = $$1.a($$0)) != null) {
            return gin.a(this, $$2);
        }
        if ($$0 instanceof gpi.c) {
            gpi.c $$3 = (gpi.c)$$0;
            return this.a($$3);
        }
        if ($$0 instanceof gpi.a) {
            gpi.a $$4 = (gpi.a)$$0;
            return this.a($$4);
        }
        return null;
    }

    private @Nullable gin a(gpi.c $$02) {
        Supplier<gmm> $$10;
        BooleanSupplier $$9;
        int $$7;
        boolean $$1 = $$02.b();
        gmm $$2 = this.aO_();
        ArrayList<? extends gmm> $$3 = new ArrayList<gmm>(this.aJ_());
        Collections.sort($$3, Comparator.comparingInt($$0 -> $$0.G()));
        int $$4 = $$3.indexOf($$2);
        if ($$2 != null && $$4 >= 0) {
            int $$5 = $$4 + ($$1 ? 1 : 0);
        } else if ($$1) {
            boolean $$6 = false;
        } else {
            $$7 = $$3.size();
        }
        ListIterator $$8 = $$3.listIterator($$7);
        BooleanSupplier booleanSupplier = $$1 ? $$8::hasNext : ($$9 = $$8::hasPrevious);
        Supplier<gmm> supplier = $$1 ? $$8::next : ($$10 = $$8::previous);
        while ($$9.getAsBoolean()) {
            gmm $$11 = $$10.get();
            gin $$12 = $$11.a($$02);
            if ($$12 == null) continue;
            return gin.a(this, $$12);
        }
        return null;
    }

    private @Nullable gin a(gpi.a $$0) {
        gmm $$1 = this.aO_();
        if ($$1 == null) {
            gpk $$2 = $$0.b();
            gpm $$3 = this.a_($$2.b());
            return gin.a(this, this.a($$3, $$2, null, $$0));
        }
        gpm $$4 = $$1.aV_();
        return gin.a(this, this.a($$4, $$0.b(), $$1, $$0));
    }

    private @Nullable gin a(gpm $$0, gpk $$12, @Nullable gmm $$2, gpi $$3) {
        gpj $$4 = $$12.a();
        gpj $$5 = $$4.a();
        gpk $$6 = $$5.b();
        int $$7 = $$0.b($$12.b());
        ArrayList<gmm> $$8 = new ArrayList<gmm>();
        for (gmm gmm2 : this.aJ_()) {
            gpm $$10;
            if (gmm2 == $$2 || !($$10 = gmm2.aV_()).a($$0, $$5)) continue;
            int $$11 = $$10.b($$12.b());
            if ($$12.a($$11, $$7)) {
                $$8.add(gmm2);
                continue;
            }
            if ($$11 != $$7 || !$$12.a($$10.b($$12), $$0.b($$12))) continue;
            $$8.add(gmm2);
        }
        Comparator<gmm> $$122 = Comparator.comparing($$1 -> $$1.aV_().b($$12.b()), $$12.d());
        Comparator<gmm> comparator = Comparator.comparing($$1 -> $$1.aV_().b($$6.b()), $$6.d());
        $$8.sort($$122.thenComparing(comparator));
        for (gmm $$14 : $$8) {
            gin $$15 = $$14.a($$3);
            if ($$15 == null) continue;
            return $$15;
        }
        return this.b($$0, $$12, $$2, $$3);
    }

    private @Nullable gin b(gpm $$0, gpk $$1, @Nullable gmm $$2, gpi $$3) {
        gpj $$4 = $$1.a();
        gpj $$5 = $$4.a();
        ArrayList<Pair> $$6 = new ArrayList<Pair>();
        gpl $$7 = gpl.a($$4, $$0.b($$1), $$0.b($$5));
        for (gmm gmm2 : this.aJ_()) {
            gpm $$9;
            gpl $$10;
            if (gmm2 == $$2 || !$$1.a(($$10 = gpl.a($$4, ($$9 = gmm2.aV_()).b($$1.b()), $$9.b($$5))).a($$4), $$7.a($$4))) continue;
            long $$11 = Vector2i.distanceSquared((int)$$7.a(), (int)$$7.b(), (int)$$10.a(), (int)$$10.b());
            $$6.add(Pair.of((Object)gmm2, (Object)$$11));
        }
        $$6.sort(Comparator.comparingDouble(Pair::getSecond));
        for (Pair pair : $$6) {
            gin $$13 = ((gmm)pair.getFirst()).a($$3);
            if ($$13 == null) continue;
            return $$13;
        }
        return null;
    }
}

