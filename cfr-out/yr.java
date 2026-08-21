/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class yr {
    private final int a;
    private final ObjectList<ys> b = new ObjectArrayList();
    private @Nullable yu c;

    public yr(int $$0) {
        this.a = $$0;
        for (int $$1 = 0; $$1 < $$0; ++$$1) {
            this.b.add(null);
        }
    }

    public void a(yu $$0) {
        if (!$$0.equals(this.c)) {
            this.b.add((Object)new ys($$0, true));
            this.c = $$0;
        }
    }

    public int a() {
        return this.b.size();
    }

    public void a(int $$0) throws a {
        int $$1 = this.b.size() - this.a;
        if ($$0 < 0 || $$0 > $$1) {
            throw new a("Advanced last seen window by " + $$0 + " messages, but expected at most " + $$1);
        }
        this.b.removeElements(0, $$0);
    }

    public yp a(yp.b $$0) throws a {
        this.a($$0.a());
        ObjectArrayList $$1 = new ObjectArrayList($$0.b().cardinality());
        if ($$0.b().length() > this.a) {
            throw new a("Last seen update contained " + $$0.b().length() + " messages, but maximum window size is " + this.a);
        }
        for (int $$2 = 0; $$2 < this.a; ++$$2) {
            boolean $$3 = $$0.b().get($$2);
            ys $$4 = (ys)this.b.get($$2);
            if ($$3) {
                if ($$4 == null) {
                    throw new a("Last seen update acknowledged unknown or previously ignored message at index " + $$2);
                }
                this.b.set($$2, (Object)$$4.a());
                $$1.add((Object)$$4.b());
                continue;
            }
            if ($$4 != null && !$$4.c()) {
                throw new a("Last seen update ignored previously acknowledged message at index " + $$2 + " and signature " + String.valueOf($$4.b()));
            }
            this.b.set($$2, null);
        }
        yp $$5 = new yp((List<yu>)$$1);
        if (!$$0.a($$5)) {
            throw new a("Checksum mismatch on last seen update: the client and server must have desynced");
        }
        return $$5;
    }

    public static class a
    extends Exception {
        public a(String $$0) {
            super($$0);
        }
    }
}

