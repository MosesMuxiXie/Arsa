/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public class fto
extends fug {
    private final DoubleList b;
    private final DoubleList c;
    private final DoubleList d;

    protected fto(ftv $$0, double[] $$1, double[] $$2, double[] $$3) {
        this($$0, (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf($$1, $$0.b() + 1)), (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf($$2, $$0.c() + 1)), (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf($$3, $$0.d() + 1)));
    }

    fto(ftv $$0, DoubleList $$1, DoubleList $$2, DoubleList $$3) {
        super($$0);
        int $$4 = $$0.b() + 1;
        int $$5 = $$0.c() + 1;
        int $$6 = $$0.d() + 1;
        if ($$4 != $$1.size() || $$5 != $$2.size() || $$6 != $$3.size()) {
            throw bhs.b(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
        }
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    @Override
    public DoubleList a(iz.a $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case iz.a.a -> this.b;
            case iz.a.b -> this.c;
            case iz.a.c -> this.d;
        };
    }
}

