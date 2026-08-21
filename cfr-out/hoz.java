/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class hoz {
    private final hpd a = new hpd();
    private final hpe b;
    private final hon.a c;
    private final hon.a d;
    private final hoq e;

    public hoz(int $$02) {
        this.b = hpe.a($$02);
        SequencedMap $$1 = (SequencedMap)bhs.a(new Object2ObjectLinkedOpenHashMap(), (? super T $$0) -> {
            $$0.put((Object)hpj.h(), (Object)this.a.a(hth.a));
            $$0.put((Object)hpj.i(), (Object)this.a.a(hth.b));
            $$0.put((Object)hpj.j(), (Object)this.a.a(hth.c));
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, hpj.k());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, hpj.b());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, hpj.c());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, hpj.d());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, hpj.e());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, hpj.f());
            $$0.put((Object)hpj.g(), (Object)new fzi(786432));
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, ijt.f());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, ijt.h());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, ijt.g());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, ijt.i());
            hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, ijt.e());
        });
        this.c = hon.a($$1, new fzi(786432));
        this.e = new hoq();
        SequencedMap $$2 = (SequencedMap)bhs.a(new Object2ObjectLinkedOpenHashMap(), (? super T $$0) -> inx.n.forEach($$1 -> hoz.a((Object2ObjectLinkedOpenHashMap<ijs, fzi>)$$0, $$1)));
        this.d = hon.a($$2, new fzi(0));
    }

    private static void a(Object2ObjectLinkedOpenHashMap<ijs, fzi> $$0, ijs $$1) {
        $$0.put((Object)$$1, (Object)new fzi($$1.a()));
    }

    public hpd a() {
        return this.a;
    }

    public hpe b() {
        return this.b;
    }

    public hon.a c() {
        return this.c;
    }

    public hon.a d() {
        return this.d;
    }

    public hoq e() {
        return this.e;
    }
}

