/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.ints.IntIterator
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.NoSuchElementException;

public class c
implements IntIterator {
    private final int a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public c(int $$0, int $$1) {
        this.a = $$1;
        if ($$1 > 0) {
            this.b = $$0 / $$1;
            this.c = $$0 % $$1;
        } else {
            this.b = 0;
            this.c = 0;
        }
    }

    public boolean hasNext() {
        return this.d < this.a;
    }

    public int nextInt() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int $$0 = this.b;
        this.e += this.c;
        if (this.e >= this.a) {
            this.e -= this.a;
            ++$$0;
        }
        ++this.d;
        return $$0;
    }

    @VisibleForTesting
    public static Iterable<Integer> a(int $$0, int $$1) {
        return () -> new c($$0, $$1);
    }
}

