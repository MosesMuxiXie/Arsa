/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dwj {
    public Optional<Float> a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4) {
        if ($$3.l() && $$4.c()) {
            return Optional.empty();
        }
        return Optional.of(Float.valueOf(Math.max($$3.b().e(), $$4.i())));
    }

    public boolean a(dwi $$0, dvt $$1, is $$2, eoh $$3, float $$4) {
        return true;
    }

    public boolean a(dwi $$0, cgk $$1) {
        return true;
    }

    public float a(cgk $$0) {
        return 1.0f;
    }

    public float a(dwi $$0, cgk $$1, float $$2) {
        float $$3 = $$0.e() * 2.0f;
        ftm $$4 = $$0.f();
        double $$5 = Math.sqrt($$1.g($$4)) / (double)$$3;
        double $$6 = (1.0 - $$5) * (double)$$2;
        return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * (double)$$3 + 1.0);
    }
}

