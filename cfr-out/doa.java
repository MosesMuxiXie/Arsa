/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class doa
implements dpe {
    public static final doa a = new doa(List.of());
    public static final Codec<doa> b = dlt.b.listOf().xmap(doa::new, $$0 -> $$0.d);
    public static final aao<xq, doa> c = dlt.j.a(aam.a()).a(doa::new, $$0 -> $$0.d);
    private final List<dlt> d;

    private doa(List<dlt> $$0) {
        this.d = $$0;
    }

    public static doa a(dlt $$0) {
        return new doa(List.of($$0.v()));
    }

    public static doa a(List<dlt> $$0) {
        return new doa(List.copyOf(Lists.transform($$0, dlt::v)));
    }

    public boolean a(dlp $$0) {
        for (dlt $$1 : this.d) {
            if (!$$1.a($$0)) continue;
            return true;
        }
        return false;
    }

    public List<dlt> a() {
        return Lists.transform(this.d, dlt::v);
    }

    public boolean b() {
        return this.d.isEmpty();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof doa)) return false;
        doa $$1 = (doa)$$0;
        if (!dlt.a(this.d, $$1.d)) return false;
        return true;
    }

    public int hashCode() {
        return dlt.a(this.d);
    }

    public String toString() {
        return "ChargedProjectiles[items=" + String.valueOf(this.d) + "]";
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        dlt $$4 = null;
        int $$5 = 0;
        for (dlt $$6 : this.d) {
            if ($$4 == null) {
                $$4 = $$6;
                $$5 = 1;
                continue;
            }
            if (dlt.a($$4, $$6)) {
                ++$$5;
                continue;
            }
            doa.a($$0, $$1, $$4, $$5);
            $$4 = $$6;
            $$5 = 1;
        }
        if ($$4 != null) {
            doa.a($$0, $$1, $$4, $$5);
        }
    }

    private static void a(dlp.b $$0, Consumer<yh> $$12, dlt $$2, int $$3) {
        if ($$3 == 1) {
            $$12.accept(yh.a("item.minecraft.crossbow.projectile.single", $$2.K()));
        } else {
            $$12.accept(yh.a("item.minecraft.crossbow.projectile.multiple", $$3, $$2.K()));
        }
        dpd $$4 = $$2.a(ki.t, dpd.c);
        $$2.a($$0, $$4, null, dnj.a, $$1 -> $$12.accept(yh.b("  ").b((yh)$$1).a(l.h)));
    }
}

