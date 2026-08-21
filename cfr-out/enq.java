/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class enq {
    static final String a = "server_data";
    static Codec<enq> b = RecordCodecBuilder.create($$02 -> $$02.group((App)jx.c.lenientOptionalFieldOf("rewarded_players", Set.of()).forGetter($$0 -> $$0.e), (App)Codec.LONG.lenientOptionalFieldOf("state_updating_resumes_at", (Object)0L).forGetter($$0 -> $$0.f), (App)dlt.b.listOf().lenientOptionalFieldOf("items_to_eject", List.of()).forGetter($$0 -> $$0.g), (App)Codec.INT.lenientOptionalFieldOf("total_ejections_needed", (Object)0).forGetter($$0 -> $$0.i)).apply((Applicative)$$02, enq::new));
    private static final int d = 128;
    private final Set<UUID> e = new ObjectLinkedOpenHashSet();
    private long f;
    private final List<dlt> g = new ObjectArrayList();
    private long h;
    private int i;
    boolean c;

    enq(Set<UUID> $$0, long $$1, List<dlt> $$2, int $$3) {
        this.e.addAll($$0);
        this.f = $$1;
        this.g.addAll($$2);
        this.i = $$3;
    }

    enq() {
    }

    void a(long $$0) {
        this.h = $$0;
    }

    long a() {
        return this.h;
    }

    Set<UUID> b() {
        return this.e;
    }

    boolean a(ddm $$0) {
        return this.e.contains($$0.cY());
    }

    @VisibleForTesting
    public void b(ddm $$0) {
        Iterator<UUID> $$1;
        this.e.add($$0.cY());
        if (this.e.size() > 128 && ($$1 = this.e.iterator()).hasNext()) {
            $$1.next();
            $$1.remove();
        }
        this.i();
    }

    long c() {
        return this.f;
    }

    void b(long $$0) {
        this.f = $$0;
        this.i();
    }

    List<dlt> d() {
        return this.g;
    }

    void e() {
        this.i = 0;
        this.i();
    }

    void a(List<dlt> $$0) {
        this.g.clear();
        this.g.addAll($$0);
        this.i = this.g.size();
        this.i();
    }

    dlt f() {
        if (this.g.isEmpty()) {
            return dlt.l;
        }
        return Objects.requireNonNullElse(this.g.get(this.g.size() - 1), dlt.l);
    }

    dlt g() {
        if (this.g.isEmpty()) {
            return dlt.l;
        }
        this.i();
        return Objects.requireNonNullElse(this.g.remove(this.g.size() - 1), dlt.l);
    }

    void a(enq $$0) {
        this.f = $$0.c();
        this.g.clear();
        this.g.addAll($$0.g);
        this.e.clear();
        this.e.addAll($$0.e);
    }

    private void i() {
        this.c = true;
    }

    public float h() {
        if (this.i == 1) {
            return 1.0f;
        }
        return 1.0f - bgj.f(this.d().size(), 1.0f, this.i);
    }
}

