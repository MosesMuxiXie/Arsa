/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class enr {
    static final String a = "shared_data";
    static Codec<enr> b = RecordCodecBuilder.create($$02 -> $$02.group((App)dlt.a("display_item").forGetter($$0 -> $$0.d), (App)jx.c.lenientOptionalFieldOf("connected_players", Set.of()).forGetter($$0 -> $$0.e), (App)Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", (Object)enp.b.d()).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, enr::new));
    private dlt d = dlt.l;
    private Set<UUID> e = new ObjectLinkedOpenHashSet();
    private double f = enp.b.d();
    boolean c;

    enr(dlt $$0, Set<UUID> $$1, double $$2) {
        this.d = $$0;
        this.e.addAll($$1);
        this.f = $$2;
    }

    enr() {
    }

    public dlt a() {
        return this.d;
    }

    public boolean b() {
        return !this.d.f();
    }

    public void a(dlt $$0) {
        if (dlt.a(this.d, $$0)) {
            return;
        }
        this.d = $$0.v();
        this.f();
    }

    boolean c() {
        return !this.e.isEmpty();
    }

    Set<UUID> d() {
        return this.e;
    }

    double e() {
        return this.f;
    }

    void a(axf $$0, is $$12, enq $$2, enp $$3, double $$4) {
        Set $$5 = $$3.a().detect($$0, $$3.g(), $$12, $$4, false).stream().filter($$1 -> !$$2.b().contains($$1)).collect(Collectors.toSet());
        if (!this.e.equals($$5)) {
            this.e = $$5;
            this.f();
        }
    }

    private void f() {
        this.c = true;
    }

    void a(enr $$0) {
        this.d = $$0.d;
        this.e = $$0.e;
        this.f = $$0.f;
    }
}

