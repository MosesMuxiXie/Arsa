/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class gst
extends gsq<asl> {
    public gst(@Nullable gsb $$0, asl $$1, gsr $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected Stream<ase> a(asl $$0, gsr $$12) {
        return $$0.e().a().map($$1 -> gst.a($$0, $$1));
    }

    private static ase a(asl $$0, jd<asj> $$1) {
        return new ase(new asg($$1.a().A_().a(), $$0.f()), Optional.of(new asy(new yf.h($$1))));
    }
}

