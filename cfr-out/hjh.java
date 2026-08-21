/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class hjh {
    final int a;
    private final List<a> b = new ArrayList<a>();

    public hjh(int $$0) {
        this.a = $$0;
    }

    public void a(hiz $$0, IntCollection $$1, b $$2) {
        IntRBTreeSet $$3 = new IntRBTreeSet($$1);
        for (int $$4 = $$3.lastInt(); $$4 >= $$0.a() && (this.a() || !$$3.isEmpty()); --$$4) {
            hjb hjb2 = $$0.b($$4);
            if (!(hjb2 instanceof hjc.a)) continue;
            hjc.a $$5 = (hjc.a)hjb2;
            boolean $$6 = this.b($$5.g());
            if ($$3.remove($$4)) {
                this.a($$5.g());
                $$2.accept($$4, $$5);
                continue;
            }
            if (!$$6) continue;
            $$2.accept($$4, $$5);
        }
    }

    public void a(yy $$0) {
        this.b.add(new a($$0));
    }

    public boolean b(yy $$0) {
        boolean $$1 = false;
        Iterator<a> $$2 = this.b.iterator();
        while ($$2.hasNext()) {
            a $$3 = $$2.next();
            if (!$$3.a($$0)) continue;
            $$1 = true;
            if (!$$3.a()) continue;
            $$2.remove();
        }
        return $$1;
    }

    public boolean a() {
        return !this.b.isEmpty();
    }

    public static interface b {
        public void accept(int var1, hjc.a var2);
    }

    class a {
        private final Set<yu> b;
        private yy c;
        private boolean d = true;
        private int e;

        a(yy $$0) {
            this.b = new ObjectOpenHashSet($$0.m().d().b());
            this.c = $$0;
        }

        boolean a(yy $$0) {
            if ($$0.equals(this.c)) {
                return false;
            }
            boolean $$1 = this.b.remove($$0.l());
            if (this.d && this.c.g().equals($$0.g())) {
                if (this.c.k().a($$0.k())) {
                    $$1 = true;
                    this.c = $$0;
                } else {
                    this.d = false;
                }
            }
            if ($$1) {
                ++this.e;
            }
            return $$1;
        }

        boolean a() {
            return this.e >= hjh.this.a || !this.d && this.b.isEmpty();
        }
    }
}

