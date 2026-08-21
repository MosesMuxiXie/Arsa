/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class fuz<T>
implements fvf<T>,
fvh<T> {
    private final Queue<fve<T>> a = new PriorityQueue(fve.a);
    private @Nullable List<fvd<T>> b;
    private final Set<fve<?>> c = new ObjectOpenCustomHashSet(fve.c);
    private @Nullable BiConsumer<fuz<T>, fve<T>> d;

    public fuz() {
    }

    public fuz(List<fvd<T>> $$0) {
        this.b = $$0;
        for (fvd<T> $$1 : $$0) {
            this.c.add(fve.a($$1.a(), $$1.b()));
        }
    }

    public void a(@Nullable BiConsumer<fuz<T>, fve<T>> $$0) {
        this.d = $$0;
    }

    public @Nullable fve<T> b() {
        return this.a.peek();
    }

    public @Nullable fve<T> c() {
        fve<T> $$0 = this.a.poll();
        if ($$0 != null) {
            this.c.remove($$0);
        }
        return $$0;
    }

    @Override
    public void a(fve<T> $$0) {
        if (this.c.add($$0)) {
            this.b($$0);
        }
    }

    private void b(fve<T> $$0) {
        this.a.add($$0);
        if (this.d != null) {
            this.d.accept(this, $$0);
        }
    }

    @Override
    public boolean a(is $$0, T $$1) {
        return this.c.contains(fve.a($$1, $$0));
    }

    @Override
    public void a(Predicate<fve<T>> $$0) {
        Iterator $$1 = this.a.iterator();
        while ($$1.hasNext()) {
            fve $$2 = (fve)$$1.next();
            if (!$$0.test($$2)) continue;
            $$1.remove();
            this.c.remove($$2);
        }
    }

    public Stream<fve<T>> d() {
        return this.a.stream();
    }

    @Override
    public int a() {
        return this.a.size() + (this.b != null ? this.b.size() : 0);
    }

    @Override
    public List<fvd<T>> a(long $$0) {
        ArrayList<fvd<T>> $$1 = new ArrayList<fvd<T>>(this.a.size());
        if (this.b != null) {
            $$1.addAll(this.b);
        }
        for (fve fve2 : this.a) {
            $$1.add(fve2.a($$0));
        }
        return $$1;
    }

    public void b(long $$0) {
        if (this.b != null) {
            int $$1 = -this.b.size();
            for (fvd<T> $$2 : this.b) {
                this.b($$2.a($$0, $$1++));
            }
        }
        this.b = null;
    }
}

