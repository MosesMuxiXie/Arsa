/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.Quantiles
 *  com.google.common.math.Quantiles$ScaleAndIndexes
 *  it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap
 *  it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap
 *  it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps
 */
import com.google.common.math.Quantiles;
import it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import java.util.Comparator;
import java.util.Map;

public class bzv {
    public static final Quantiles.ScaleAndIndexes a = Quantiles.scale((int)100).indexes(new int[]{50, 75, 90, 99});

    private bzv() {
    }

    public static Map<Integer, Double> a(long[] $$0) {
        return $$0.length == 0 ? Map.of() : bzv.a(a.compute($$0));
    }

    public static Map<Integer, Double> a(int[] $$0) {
        return $$0.length == 0 ? Map.of() : bzv.a(a.compute($$0));
    }

    public static Map<Integer, Double> a(double[] $$0) {
        return $$0.length == 0 ? Map.of() : bzv.a(a.compute($$0));
    }

    private static Map<Integer, Double> a(Map<Integer, Double> $$0) {
        Int2DoubleSortedMap $$12 = (Int2DoubleSortedMap)bhs.a(new Int2DoubleRBTreeMap(Comparator.reverseOrder()), (? super T $$1) -> $$1.putAll($$0));
        return Int2DoubleSortedMaps.unmodifiable((Int2DoubleSortedMap)$$12);
    }
}

