/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.ListIterator;
import org.jspecify.annotations.Nullable;

public class htk {
    private static final int a = 2;
    private int b = 2;
    private final List<hts.a.a> c = new ObjectArrayList();

    public synchronized void a(hts.a.a $$0) {
        this.c.add($$0);
    }

    public synchronized @Nullable hts.a.a a(ftm $$0) {
        boolean $$10;
        int $$1 = -1;
        int $$2 = -1;
        double $$3 = Double.MAX_VALUE;
        double $$4 = Double.MAX_VALUE;
        ListIterator<hts.a.a> $$5 = this.c.listIterator();
        while ($$5.hasNext()) {
            int $$6 = $$5.nextIndex();
            hts.a.a $$7 = $$5.next();
            if ($$7.a.get()) {
                $$5.remove();
                continue;
            }
            double $$8 = $$7.d().b($$0);
            if (!$$7.c() && $$8 < $$3) {
                $$3 = $$8;
                $$1 = $$6;
            }
            if (!$$7.c() || !($$8 < $$4)) continue;
            $$4 = $$8;
            $$2 = $$6;
        }
        boolean $$9 = $$2 >= 0;
        boolean bl2 = $$10 = $$1 >= 0;
        if ($$9 && (!$$10 || this.b > 0 && $$4 < $$3)) {
            --this.b;
            return this.a($$2);
        }
        this.b = 2;
        return this.a($$1);
    }

    public int a() {
        return this.c.size();
    }

    private @Nullable hts.a.a a(int $$0) {
        if ($$0 >= 0) {
            return this.c.remove($$0);
        }
        return null;
    }

    public synchronized void b() {
        for (hts.a.a $$0 : this.c) {
            $$0.a();
        }
        this.c.clear();
    }
}

