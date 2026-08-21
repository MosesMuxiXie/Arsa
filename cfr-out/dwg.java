/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dwg
extends dwj {
    private final cgk a;

    public dwg(cgk $$0) {
        this.a = $$0;
    }

    @Override
    public Optional<Float> a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4) {
        return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> Float.valueOf(this.a.a($$0, $$1, $$2, $$3, $$4, $$5.floatValue())));
    }

    @Override
    public boolean a(dwi $$0, dvt $$1, is $$2, eoh $$3, float $$4) {
        return this.a.a($$0, $$1, $$2, $$3, $$4);
    }
}

