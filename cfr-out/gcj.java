/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gcj
implements Iterable<gbg> {
    private final gfj a;
    private final Set<gbg> b = new HashSet<gbg>();
    private List<gbg> c = List.of();

    public gcj(gfj $$0) {
        this.a = $$0;
    }

    public void a(List<gbg> $$0) {
        ArrayList<gbg> $$1 = new ArrayList<gbg>($$0);
        $$1.sort(new gbg.b(this.a.ac().c()));
        boolean $$2 = $$1.removeAll(this.b);
        if (!$$2) {
            this.b.clear();
        }
        this.c = $$1;
    }

    public void a(gbg $$0) {
        this.c.remove($$0);
        this.b.add($$0);
    }

    @Override
    public Iterator<gbg> iterator() {
        return this.c.iterator();
    }

    public boolean a() {
        return this.c.isEmpty();
    }
}

