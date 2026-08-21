/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.PeekingIterator
 */
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class ipv<T>
extends AbstractIterator<T> {
    private final PeekingIterator<T> a;
    private final PeekingIterator<T> b;
    private final Comparator<T> c;

    public ipv(Iterator<T> $$0, Iterator<T> $$1, Comparator<T> $$2) {
        this.a = Iterators.peekingIterator($$0);
        this.b = Iterators.peekingIterator($$1);
        this.c = $$2;
    }

    protected T computeNext() {
        boolean $$1;
        boolean $$0 = !this.a.hasNext();
        boolean bl2 = $$1 = !this.b.hasNext();
        if ($$0 && $$1) {
            return (T)this.endOfData();
        }
        if ($$0) {
            return (T)this.b.next();
        }
        if ($$1) {
            return (T)this.a.next();
        }
        int $$2 = this.c.compare(this.a.peek(), this.b.peek());
        if ($$2 == 0) {
            this.b.next();
        }
        return (T)($$2 <= 0 ? this.a.next() : this.b.next());
    }
}

