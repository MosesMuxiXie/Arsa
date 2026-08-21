/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 */
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class fkr {
    private final int a;
    private final LongLinkedOpenHashSet[] b;
    private int c;

    public fkr(int $$0, final int $$1) {
        this.a = $$0;
        this.b = new LongLinkedOpenHashSet[$$0];
        for (int $$2 = 0; $$2 < $$0; ++$$2) {
            this.b[$$2] = new LongLinkedOpenHashSet($$1, 0.5f){

                protected void rehash(int $$0) {
                    if ($$0 > $$1) {
                        super.rehash($$0);
                    }
                }
            };
        }
        this.c = $$0;
    }

    public long a() {
        LongLinkedOpenHashSet $$0 = this.b[this.c];
        long $$1 = $$0.removeFirstLong();
        if ($$0.isEmpty()) {
            this.a(this.a);
        }
        return $$1;
    }

    public boolean b() {
        return this.c >= this.a;
    }

    public void a(long $$0, int $$1, int $$2) {
        LongLinkedOpenHashSet $$3 = this.b[$$1];
        $$3.remove($$0);
        if ($$3.isEmpty() && this.c == $$1) {
            this.a($$2);
        }
    }

    public void a(long $$0, int $$1) {
        this.b[$$1].add($$0);
        if (this.c > $$1) {
            this.c = $$1;
        }
    }

    private void a(int $$0) {
        int $$1 = this.c;
        this.c = $$0;
        for (int $$2 = $$1 + 1; $$2 < $$0; ++$$2) {
            if (this.b[$$2].isEmpty()) continue;
            this.c = $$2;
            break;
        }
    }
}

