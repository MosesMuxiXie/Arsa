/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dqr {
    public static final int a = -1;
    public static final dqr b = new dqr(List.of(), IntList.of());
    private final List<dqo> c;
    private final IntList d;

    private dqr(List<dqo> $$0, IntList $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static dqr a(dqo $$0) {
        if ($$0.b()) {
            return b;
        }
        return new dqr(List.of($$0), IntList.of((int)0));
    }

    public static dqr a(List<Optional<dqo>> $$0) {
        int $$1 = $$0.size();
        ArrayList<dqo> $$2 = new ArrayList<dqo>($$1);
        IntArrayList $$3 = new IntArrayList($$1);
        int $$4 = 0;
        for (Optional<dqo> $$5 : $$0) {
            if ($$5.isPresent()) {
                dqo $$6 = $$5.get();
                if ($$6.b()) {
                    return b;
                }
                $$2.add($$6);
                $$3.add($$4++);
                continue;
            }
            $$3.add(-1);
        }
        return new dqr($$2, (IntList)$$3);
    }

    public static dqr b(List<dqo> $$0) {
        int $$1 = $$0.size();
        IntArrayList $$2 = new IntArrayList($$1);
        for (int $$3 = 0; $$3 < $$1; ++$$3) {
            dqo $$4 = $$0.get($$3);
            if ($$4.b()) {
                return b;
            }
            $$2.add($$3);
        }
        return new dqr($$0, (IntList)$$2);
    }

    public IntList a() {
        return this.d;
    }

    public List<dqo> b() {
        return this.c;
    }

    public boolean c() {
        return this.d.isEmpty();
    }
}

