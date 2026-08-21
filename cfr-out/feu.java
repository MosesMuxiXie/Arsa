/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

public abstract class feu
extends fev {
    @Override
    public final Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        if (this.a($$0, $$1, $$2)) {
            return Stream.of($$2);
        }
        return Stream.of(new is[0]);
    }

    protected abstract boolean a(fet var1, bgr var2, is var3);
}

