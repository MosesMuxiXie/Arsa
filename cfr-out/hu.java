/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

class hu<T extends ef<T>> {
    private @Nullable List<hk<T>> a = new ArrayList<hk<T>>();
    private @Nullable List<hw.a<T>> b;
    private final List<String> c = new ArrayList<String>();

    hu() {
    }

    public void a(hk<T> $$0) {
        if (this.b != null) {
            this.b.add(new hw.c<T>($$0));
        } else {
            this.a.add($$0);
        }
    }

    private int a(String $$0) {
        int $$1 = this.c.indexOf($$0);
        if ($$1 == -1) {
            $$1 = this.c.size();
            this.c.add($$0);
        }
        return $$1;
    }

    private IntList a(List<String> $$0) {
        IntArrayList $$1 = new IntArrayList($$0.size());
        for (String $$2 : $$0) {
            $$1.add(this.a($$2));
        }
        return $$1;
    }

    /*
     * WARNING - void declaration
     */
    public void a(String $$0, int $$1, T $$2) {
        void $$5;
        try {
            hy $$3 = hy.a($$0);
        }
        catch (Exception $$4) {
            throw new IllegalArgumentException("Can't parse function line " + $$1 + ": '" + $$0 + "'", $$4);
        }
        if (this.a != null) {
            this.b = new ArrayList<hw.a<T>>(this.a.size() + 1);
            for (hk<T> $$6 : this.a) {
                this.b.add(new hw.c<T>($$6));
            }
            this.a = null;
        }
        this.b.add(new hw.b<T>((hy)$$5, this.a($$5.b()), $$2));
    }

    public ht<T> a(amo $$0) {
        if (this.b != null) {
            return new hw<T>($$0, this.b, this.c);
        }
        return new hx<T>($$0, this.a);
    }
}

