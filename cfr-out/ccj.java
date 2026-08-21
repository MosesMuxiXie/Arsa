/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class ccj
implements cck {
    private final cck[] a;

    public ccj(cck ... $$0) {
        this.a = $$0;
    }

    @Override
    public float a(bgr $$0) {
        float $$1 = 1.0f;
        for (cck $$2 : this.a) {
            $$1 *= $$2.a($$0);
        }
        return $$1;
    }

    public String toString() {
        return "MultipliedFloats" + Arrays.toString(this.a);
    }
}

