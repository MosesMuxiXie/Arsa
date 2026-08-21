/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class hjr
implements AutoCloseable {
    private final Long2ObjectOpenHashMap<a> a = new Long2ObjectOpenHashMap();
    private int b;
    private boolean c;

    public void a(is $$0, eoh $$1, hnh $$22) {
        this.a.compute($$0.a(), ($$2, $$3) -> {
            if ($$3 != null) {
                return $$3.a(this.b);
            }
            return new a(this.b, $$1, $$22.dI());
        });
    }

    public boolean a(is $$0, eoh $$1) {
        a $$2 = (a)this.a.get($$0.a());
        if ($$2 == null) {
            return false;
        }
        $$2.a($$1);
        return true;
    }

    public void a(int $$0, hif $$1) {
        ObjectIterator $$2 = this.a.long2ObjectEntrySet().iterator();
        while ($$2.hasNext()) {
            Long2ObjectMap.Entry $$3 = (Long2ObjectMap.Entry)$$2.next();
            a $$4 = (a)$$3.getValue();
            if ($$4.b > $$0) continue;
            is $$5 = is.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
        }
    }

    public hjr a() {
        ++this.b;
        this.c = true;
        return this;
    }

    @Override
    public void close() {
        this.c = false;
    }

    public int b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    static class a {
        final ftm a;
        int b;
        eoh c;

        a(int $$0, eoh $$1, ftm $$2) {
            this.b = $$0;
            this.c = $$1;
            this.a = $$2;
        }

        a a(int $$0) {
            this.b = $$0;
            return this;
        }

        void a(eoh $$0) {
            this.c = $$0;
        }
    }
}

