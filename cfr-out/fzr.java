/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.google.common.primitives.Floats;
import it.unimi.dsi.fastutil.ints.IntArrays;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface fzr {
    public static final fzr a = fzr.a(0.0f, 0.0f, 0.0f);
    public static final fzr b = fzr.a((Vector3f $$0) -> -$$0.z());

    public static fzr a(float $$0, float $$1, float $$2) {
        return fzr.a((Vector3fc)new Vector3f($$0, $$1, $$2));
    }

    public static fzr a(Vector3fc $$0) {
        return fzr.a(arg_0 -> ((Vector3fc)$$0).distanceSquared(arg_0));
    }

    public static fzr a(a $$0) {
        return $$12 -> {
            Vector3f $$22 = new Vector3f();
            float[] $$3 = new float[$$12.a()];
            int[] $$4 = new int[$$12.a()];
            for (int $$5 = 0; $$5 < $$12.a(); ++$$5) {
                $$3[$$5] = $$0.apply($$12.a($$5, $$22));
                $$4[$$5] = $$5;
            }
            IntArrays.mergeSort((int[])$$4, ($$1, $$2) -> Floats.compare((float)$$3[$$2], (float)$$3[$$1]));
            return $$4;
        };
    }

    public int[] sort(fzj var1);

    @FunctionalInterface
    public static interface a {
        public float apply(Vector3f var1);
    }
}

