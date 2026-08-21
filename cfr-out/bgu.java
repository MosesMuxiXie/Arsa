/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.Queues
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public final class bgu<T>
extends AbstractIterator<T> {
    private static final int a = Integer.MIN_VALUE;
    private @Nullable Deque<T> b = null;
    private int c = Integer.MIN_VALUE;
    private final Int2ObjectMap<Deque<T>> d = new Int2ObjectOpenHashMap();

    public void a(T $$02, int $$1) {
        if ($$1 == this.c && this.b != null) {
            this.b.addLast($$02);
            return;
        }
        Deque $$2 = (Deque)this.d.computeIfAbsent($$1, $$0 -> Queues.newArrayDeque());
        $$2.addLast($$02);
        if ($$1 >= this.c) {
            this.b = $$2;
            this.c = $$1;
        }
    }

    protected @Nullable T computeNext() {
        if (this.b == null) {
            return (T)this.endOfData();
        }
        T $$0 = this.b.removeFirst();
        if ($$0 == null) {
            return (T)this.endOfData();
        }
        if (this.b.isEmpty()) {
            this.a();
        }
        return $$0;
    }

    private void a() {
        int $$0 = Integer.MIN_VALUE;
        Deque $$1 = null;
        for (Int2ObjectMap.Entry $$2 : Int2ObjectMaps.fastIterable(this.d)) {
            Deque $$3 = (Deque)$$2.getValue();
            int $$4 = $$2.getIntKey();
            if ($$4 <= $$0 || $$3.isEmpty()) continue;
            $$0 = $$4;
            $$1 = $$3;
            if ($$4 != this.c - 1) continue;
            break;
        }
        this.c = $$0;
        this.b = $$1;
    }
}

