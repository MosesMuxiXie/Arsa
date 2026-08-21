/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ah {
    private static final Logger a = LogUtils.getLogger();
    private final Map<amo, ad> b = new Object2ObjectOpenHashMap();
    private final Set<ad> c = new ObjectLinkedOpenHashSet();
    private final Set<ad> d = new ObjectLinkedOpenHashSet();
    private @Nullable a e;

    private void a(ad $$0) {
        for (ad $$1 : $$0.e()) {
            this.a($$1);
        }
        a.info("Forgot about advancement {}", (Object)$$0.b());
        this.b.remove($$0.b().a());
        if ($$0.c() == null) {
            this.c.remove($$0);
            if (this.e != null) {
                this.e.b($$0);
            }
        } else {
            this.d.remove($$0);
            if (this.e != null) {
                this.e.d($$0);
            }
        }
    }

    public void a(Set<amo> $$0) {
        for (amo $$1 : $$0) {
            ad $$2 = this.b.get($$1);
            if ($$2 == null) {
                a.warn("Told to remove advancement {} but I don't know what that is", (Object)$$1);
                continue;
            }
            this.a($$2);
        }
    }

    public void a(Collection<ac> $$0) {
        ArrayList<ac> $$1 = new ArrayList<ac>($$0);
        while (!$$1.isEmpty()) {
            if ($$1.removeIf(this::b)) continue;
            a.error("Couldn't load advancements: {}", $$1);
            break;
        }
        a.info("Loaded {} advancements", (Object)this.b.size());
    }

    private boolean b(ac $$0) {
        Optional<amo> $$1 = $$0.b().b();
        ad $$2 = $$1.map(this.b::get).orElse(null);
        if ($$2 == null && $$1.isPresent()) {
            return false;
        }
        ad $$3 = new ad($$0, $$2);
        if ($$2 != null) {
            $$2.b($$3);
        }
        this.b.put($$0.a(), $$3);
        if ($$2 == null) {
            this.c.add($$3);
            if (this.e != null) {
                this.e.a($$3);
            }
        } else {
            this.d.add($$3);
            if (this.e != null) {
                this.e.c($$3);
            }
        }
        return true;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
        if (this.e != null) {
            this.e.a();
        }
    }

    public Iterable<ad> b() {
        return this.c;
    }

    public Collection<ad> c() {
        return this.b.values();
    }

    public @Nullable ad a(amo $$0) {
        return this.b.get($$0);
    }

    public @Nullable ad a(ac $$0) {
        return this.b.get($$0.a());
    }

    public void a(@Nullable a $$0) {
        this.e = $$0;
        if ($$0 != null) {
            for (ad $$1 : this.c) {
                $$0.a($$1);
            }
            for (ad $$2 : this.d) {
                $$0.c($$2);
            }
        }
    }

    public static interface a {
        public void a(ad var1);

        public void b(ad var1);

        public void c(ad var1);

        public void d(ad var1);

        public void a();
    }
}

