/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class jj<T>
implements ji<T> {
    private int b;
    private final Reference2IntMap<T> c;
    private final List<T> d;

    public jj() {
        this(512);
    }

    public jj(int $$0) {
        this.d = Lists.newArrayListWithExpectedSize((int)$$0);
        this.c = new Reference2IntOpenHashMap($$0);
        this.c.defaultReturnValue(-1);
    }

    public void a(T $$0, int $$1) {
        this.c.put($$0, $$1);
        while (this.d.size() <= $$1) {
            this.d.add(null);
        }
        this.d.set($$1, $$0);
        if (this.b <= $$1) {
            this.b = $$1 + 1;
        }
    }

    public void b(T $$0) {
        this.a($$0, this.b);
    }

    @Override
    public int a(T $$0) {
        return this.c.getInt($$0);
    }

    @Override
    public final @Nullable T a(int $$0) {
        if ($$0 >= 0 && $$0 < this.d.size()) {
            return this.d.get($$0);
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.filter(this.d.iterator(), Objects::nonNull);
    }

    public boolean c(int $$0) {
        return this.a($$0) != null;
    }

    @Override
    public int d() {
        return this.c.size();
    }
}

