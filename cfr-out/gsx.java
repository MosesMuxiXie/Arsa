/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class gsx
extends gsq<asr> {
    public gsx(@Nullable gsb $$0, asr $$1, gsr $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected Stream<ase> a(asr $$0, gsr $$12) {
        return $$12.a().c().stream().map($$1 -> gsx.a($$0, $$1));
    }

    private static ase a(asr $$0, anl.a $$1) {
        return new ase(new asg($$1.a(), $$0.e()), Optional.of(new asy(new yf.f($$1.c()))));
    }
}

