/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Multimap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class cip {
    private final Map<jd<cin>, cio> a = new Object2ObjectOpenHashMap();
    private final Set<cio> b = new ObjectOpenHashSet();
    private final Set<cio> c = new ObjectOpenHashSet();
    private final cir d;

    public cip(cir $$0) {
        this.d = $$0;
    }

    private void a(cio $$0) {
        this.c.add($$0);
        if ($$0.a().a().b()) {
            this.b.add($$0);
        }
    }

    public Set<cio> a() {
        return this.b;
    }

    public Set<cio> b() {
        return this.c;
    }

    public Collection<cio> c() {
        return this.a.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
    }

    public @Nullable cio a(jd<cin> $$02) {
        return this.a.computeIfAbsent($$02, $$0 -> this.d.a(this::a, (jd<cin>)$$0));
    }

    public boolean b(jd<cin> $$0) {
        return this.a.get($$0) != null || this.d.c($$0);
    }

    public boolean a(jd<cin> $$0, amo $$1) {
        cio $$2 = this.a.get($$0);
        return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
    }

    public double c(jd<cin> $$0) {
        cio $$1 = this.a.get($$0);
        return $$1 != null ? $$1.g() : this.d.a($$0);
    }

    public double d(jd<cin> $$0) {
        cio $$1 = this.a.get($$0);
        return $$1 != null ? $$1.b() : this.d.b($$0);
    }

    public double b(jd<cin> $$0, amo $$1) {
        cio $$2 = this.a.get($$0);
        return $$2 != null ? $$2.a($$1).b() : this.d.a($$0, $$1);
    }

    public void a(Multimap<jd<cin>, ciq> $$02) {
        $$02.forEach(($$0, $$1) -> {
            cio $$2 = this.a((jd<cin>)$$0);
            if ($$2 != null) {
                $$2.c($$1.a());
                $$2.b((ciq)$$1);
            }
        });
    }

    public void b(Multimap<jd<cin>, ciq> $$02) {
        $$02.asMap().forEach(($$0, $$12) -> {
            cio $$2 = this.a.get($$0);
            if ($$2 != null) {
                $$12.forEach($$1 -> $$2.c($$1.a()));
            }
        });
    }

    public void a(cip $$02) {
        $$02.a.values().forEach($$0 -> {
            cio $$1 = this.a($$0.a());
            if ($$1 != null) {
                $$1.a((cio)$$0);
            }
        });
    }

    public void b(cip $$02) {
        $$02.a.values().forEach($$0 -> {
            cio $$1 = this.a($$0.a());
            if ($$1 != null) {
                $$1.a($$0.b());
            }
        });
    }

    public void c(cip $$02) {
        $$02.a.values().forEach($$0 -> {
            cio $$1 = this.a($$0.a());
            if ($$1 != null) {
                $$1.a($$0.d());
            }
        });
    }

    public boolean e(jd<cin> $$0) {
        if (!this.d.c($$0)) {
            return false;
        }
        cio $$1 = this.a.get($$0);
        if ($$1 != null) {
            $$1.a(this.d.b($$0));
        }
        return true;
    }

    public List<cio.a> d() {
        ArrayList<cio.a> $$0 = new ArrayList<cio.a>(this.a.values().size());
        for (cio $$1 : this.a.values()) {
            $$0.add($$1.h());
        }
        return $$0;
    }

    public void a(List<cio.a> $$0) {
        for (cio.a $$1 : $$0) {
            cio $$2 = this.a($$1.a());
            if ($$2 == null) continue;
            $$2.a($$1);
        }
    }
}

