/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import org.jspecify.annotations.Nullable;

public class hls {
    private static final List<hlv> b = List.of(hlv.a, hlv.b, hlv.c);
    protected hif a;
    private final Map<hlv, hlt<?>> c = Maps.newIdentityHashMap();
    private final Queue<hmu> d = Queues.newArrayDeque();
    private final Queue<hlq> e = Queues.newArrayDeque();
    private final Object2IntOpenHashMap<lv> f = new Object2IntOpenHashMap();
    private final hlw g;
    private final bgr h = bgr.a();

    public hls(hif $$0, hlw $$1) {
        this.a = $$0;
        this.g = $$1;
    }

    public void a(cgk $$0, lw $$1) {
        this.d.add(new hmu(this.a, $$0, $$1));
    }

    public void a(cgk $$0, lw $$1, int $$2) {
        this.d.add(new hmu(this.a, $$0, $$1, $$2));
    }

    public @Nullable hlq a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        hlq $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        if ($$7 != null) {
            this.a($$7);
            return $$7;
        }
        return null;
    }

    private <T extends lw> @Nullable hlq b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        hlu $$7 = (hlu)this.g.a().get(mi.j.a($$0.a()));
        if ($$7 == null) {
            return null;
        }
        return $$7.a($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6, this.h);
    }

    public void a(hlq $$0) {
        Optional<lv> $$1 = $$0.o();
        if ($$1.isPresent()) {
            if (this.a($$1.get())) {
                this.e.add($$0);
                this.a($$1.get(), 1);
            }
        } else {
            this.e.add($$0);
        }
    }

    public void a() {
        this.c.forEach(($$0, $$1) -> {
            bzl.a().a($$0.a());
            $$1.b();
            bzl.a().c();
        });
        if (!this.d.isEmpty()) {
            ArrayList $$02 = Lists.newArrayList();
            for (hmu $$12 : this.d) {
                $$12.a();
                if ($$12.m()) continue;
                $$02.add($$12);
            }
            this.d.removeAll($$02);
        }
        if (!this.e.isEmpty()) {
            hlq $$2;
            while (($$2 = this.e.poll()) != null) {
                this.c.computeIfAbsent($$2.bj_(), this::a).a($$2);
            }
        }
    }

    private hlt<?> a(hlv $$0) {
        if ($$0 == hlv.b) {
            return new hlk(this);
        }
        if ($$0 == hlv.c) {
            return new hkt(this);
        }
        if ($$0 == hlv.d) {
            return new hlo(this);
        }
        return new hlz(this, $$0);
    }

    protected void a(lv $$0, int $$1) {
        this.f.addTo((Object)$$0, $$1);
    }

    public void a(ikt $$0, htx $$1, ger $$2, float $$3) {
        for (hlv $$4 : b) {
            hlt<?> $$5 = this.c.get($$4);
            if ($$5 == null || $$5.a()) continue;
            $$0.a($$5.a($$1, $$2, $$3));
        }
    }

    public void a(@Nullable hif $$0) {
        this.a = $$0;
        this.c();
        this.d.clear();
    }

    public String b() {
        return String.valueOf(this.c.values().stream().mapToInt(hlt::c).sum());
    }

    private boolean a(lv $$0) {
        return this.f.getInt((Object)$$0) < $$0.a();
    }

    public void c() {
        this.c.clear();
        this.e.clear();
        this.d.clear();
        this.f.clear();
    }
}

