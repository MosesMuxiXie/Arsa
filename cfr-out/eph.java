/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntImmutableList
 */
import it.unimi.dsi.fastutil.ints.IntImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public final class eph
extends epk<Integer> {
    private final IntImmutableList a;
    private final int b;
    private final int c;

    private eph(String $$0, int $$1, int $$2) {
        super($$0, Integer.class);
        if ($$1 < 0) {
            throw new IllegalArgumentException("Min value of " + $$0 + " must be 0 or greater");
        }
        if ($$2 <= $$1) {
            throw new IllegalArgumentException("Max value of " + $$0 + " must be greater than min (" + $$1 + ")");
        }
        this.b = $$1;
        this.c = $$2;
        this.a = IntImmutableList.toList((IntStream)IntStream.range($$1, $$2 + 1));
    }

    @Override
    public List<Integer> a() {
        return this.a;
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof eph) {
            eph $$1 = (eph)$$0;
            if (super.equals($$0)) {
                return this.a.equals($$1.a);
            }
        }
        return false;
    }

    @Override
    public int b() {
        return 31 * super.b() + this.a.hashCode();
    }

    public static eph a(String $$0, int $$1, int $$2) {
        return new eph($$0, $$1, $$2);
    }

    @Override
    public Optional<Integer> b(String $$0) {
        try {
            int $$1 = Integer.parseInt($$0);
            return $$1 >= this.b && $$1 <= this.c ? Optional.of($$1) : Optional.empty();
        }
        catch (NumberFormatException $$2) {
            return Optional.empty();
        }
    }

    public String a(Integer $$0) {
        return $$0.toString();
    }

    public int b(Integer $$0) {
        if ($$0 <= this.c) {
            return $$0 - this.b;
        }
        return -1;
    }

    @Override
    public /* synthetic */ int a(Comparable comparable) {
        return this.b((Integer)comparable);
    }

    @Override
    public /* synthetic */ String b(Comparable comparable) {
        return this.a((Integer)comparable);
    }
}

