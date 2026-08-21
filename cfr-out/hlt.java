/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.EvictingQueue
 */
import com.google.common.collect.EvictingQueue;
import java.util.Iterator;
import java.util.Queue;

public abstract class hlt<P extends hlq> {
    private static final int c = 16384;
    protected final hls a;
    protected final Queue<P> b = EvictingQueue.create((int)16384);

    public hlt(hls $$0) {
        this.a = $$0;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public void b() {
        if (!this.b.isEmpty()) {
            Iterator $$02 = this.b.iterator();
            while ($$02.hasNext()) {
                hlq $$1 = (hlq)$$02.next();
                this.b($$1);
                if ($$1.m()) continue;
                $$1.o().ifPresent($$0 -> this.a.a((lv)$$0, -1));
                $$02.remove();
            }
        }
    }

    private void b(hlq $$0) {
        try {
            $$0.a();
        }
        catch (Throwable $$1) {
            m $$2 = m.a($$1, "Ticking Particle");
            n $$3 = $$2.a("Particle being ticked");
            $$3.a("Particle", $$0::toString);
            $$3.a("Particle Type", $$0.bj_()::toString);
            throw new v($$2);
        }
    }

    public void a(hlq $$0) {
        this.b.add($$0);
    }

    public int c() {
        return this.b.size();
    }

    public abstract iks a(htx var1, ger var2, float var3);

    public Queue<P> d() {
        return this.b;
    }
}

