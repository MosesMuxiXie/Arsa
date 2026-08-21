/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public sealed interface uy
extends Iterable<vz>,
vz
permits vf, uw, vd, vg {
    public void clear();

    public boolean a(int var1, vz var2);

    public boolean b(int var1, vz var2);

    public vz d(int var1);

    public vz c(int var1);

    public int size();

    default public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    default public Iterator<vz> iterator() {
        return new Iterator<vz>(){
            private int b;

            @Override
            public boolean hasNext() {
                return this.b < uy.this.size();
            }

            public vz a() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return uy.this.c(this.b++);
            }

            @Override
            public /* synthetic */ Object next() {
                return this.a();
            }
        };
    }

    default public Stream<vz> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }
}

