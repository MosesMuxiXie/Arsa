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

public class ipu<T>
extends AbstractIterator<T> {
    private final PeekingIterator<T> a;
    private final PeekingIterator<T> b;
    private final Comparator<T> c;

    public ipu(Iterator<T> $$0, Iterator<T> $$1, Comparator<T> $$2) {
        this.a = Iterators.peekingIterator($$0);
        this.b = Iterators.peekingIterator($$1);
        this.c = $$2;
    }

    protected T computeNext() {
        while (this.a.hasNext() && this.b.hasNext()) {
            int $$0 = this.c.compare(this.a.peek(), this.b.peek());
            if ($$0 == 0) {
                this.b.next();
                return (T)this.a.next();
            }
            if ($$0 < 0) {
                this.a.next();
                continue;
            }
            this.b.next();
        }
        return (T)this.endOfData();
    }
}

