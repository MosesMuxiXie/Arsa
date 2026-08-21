/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;

public class awm {
    public static final int a = awh.b + 2;
    private final List<Long2ObjectLinkedOpenHashMap<List<Runnable>>> b = IntStream.range(0, a).mapToObj($$0 -> new Long2ObjectLinkedOpenHashMap()).toList();
    private volatile int c = a;
    private final String d;

    public awm(String $$02) {
        this.d = $$02;
    }

    protected void a(int $$02, dvu $$1, int $$2) {
        if ($$02 >= a) {
            return;
        }
        Long2ObjectLinkedOpenHashMap<List<Runnable>> $$3 = this.b.get($$02);
        List $$4 = (List)$$3.remove($$1.b());
        if ($$02 == this.c) {
            while (this.b() && this.b.get(this.c).isEmpty()) {
                ++this.c;
            }
        }
        if ($$4 != null && !$$4.isEmpty()) {
            ((List)this.b.get($$2).computeIfAbsent($$1.b(), $$0 -> Lists.newArrayList())).addAll($$4);
            this.c = Math.min(this.c, $$2);
        }
    }

    protected void a(Runnable $$02, long $$1, int $$2) {
        ((List)this.b.get($$2).computeIfAbsent($$1, $$0 -> Lists.newArrayList())).add($$02);
        this.c = Math.min(this.c, $$2);
    }

    protected void a(long $$0, boolean $$1) {
        for (Long2ObjectLinkedOpenHashMap<List<Runnable>> $$2 : this.b) {
            List $$3 = (List)$$2.get($$0);
            if ($$3 == null) continue;
            if ($$1) {
                $$3.clear();
            }
            if (!$$3.isEmpty()) continue;
            $$2.remove($$0);
        }
        while (this.b() && this.b.get(this.c).isEmpty()) {
            ++this.c;
        }
    }

    public @Nullable a a() {
        if (!this.b()) {
            return null;
        }
        int $$0 = this.c;
        Long2ObjectLinkedOpenHashMap<List<Runnable>> $$1 = this.b.get($$0);
        long $$2 = $$1.firstLongKey();
        List $$3 = (List)$$1.removeFirst();
        while (this.b() && this.b.get(this.c).isEmpty()) {
            ++this.c;
        }
        return new a($$2, $$3);
    }

    public boolean b() {
        return this.c < a;
    }

    public String toString() {
        return this.d + " " + this.c + "...";
    }

    public record a(long a, List<Runnable> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chunkPos;tasks", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chunkPos;tasks", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chunkPos;tasks", "a", "b"}, this, $$0);
        }
    }
}

