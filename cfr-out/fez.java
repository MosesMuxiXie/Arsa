/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class fez
extends fev {
    protected abstract int a(bgr var1, is var2);

    @Override
    public Stream<is> a_(fet $$0, bgr $$12, is $$2) {
        return IntStream.range(0, this.a($$12, $$2)).mapToObj($$1 -> $$2);
    }
}

