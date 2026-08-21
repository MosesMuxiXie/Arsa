/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class idf {
    public static final int G = 0;
    public cgu<?> H;
    public double I;
    public double J;
    public double K;
    public float L;
    public float M;
    public float N;
    public float O;
    public double P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T = 0xF000F0;
    public int U = 0;
    public @Nullable ftm V;
    public @Nullable yh W;
    public @Nullable ftm X;
    public @Nullable List<a> Y;
    public float Z;
    public final List<b> aa = new ArrayList<b>();

    public boolean d() {
        return this.U != 0;
    }

    public void a(n $$0) {
        $$0.a("EntityRenderState", this.getClass().getCanonicalName());
        $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.I, this.J, this.K));
    }

    public record b(float a, float b, float c, fug d, float e) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "relativeX;relativeY;relativeZ;shapeBelow;alpha", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "relativeX;relativeY;relativeZ;shapeBelow;alpha", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "relativeX;relativeY;relativeZ;shapeBelow;alpha", "a", "b", "c", "d", "e"}, this, $$0);
        }
    }

    public static class a {
        public ftm a = ftm.c;
        public ftm b = ftm.c;
        public ftm c = ftm.c;
        public int d = 0;
        public int e = 0;
        public int f = 15;
        public int g = 15;
        public boolean h = true;
    }
}

