/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.OptionalInt;

public interface eha {
    public int b();

    public int c();

    default public OptionalInt a(fti $$02, iz $$1) {
        return eha.b($$02, $$1).map($$0 -> {
            int $$1 = eha.a(1.0f - $$0.k, this.b());
            int $$2 = eha.a($$0.j, this.c());
            return OptionalInt.of($$2 + $$1 * this.c());
        }).orElseGet(OptionalInt::empty);
    }

    private static Optional<ftl> b(fti $$0, iz $$1) {
        iz $$2 = $$0.c();
        if ($$1 != $$2) {
            return Optional.empty();
        }
        is $$3 = $$0.b().a($$2);
        ftm $$4 = $$0.g().a($$3.u(), (double)$$3.v(), (double)$$3.w());
        double $$5 = $$4.a();
        double $$6 = $$4.b();
        double $$7 = $$4.c();
        return switch ($$2) {
            default -> throw new MatchException(null, null);
            case iz.c -> Optional.of(new ftl((float)(1.0 - $$5), (float)$$6));
            case iz.d -> Optional.of(new ftl((float)$$5, (float)$$6));
            case iz.e -> Optional.of(new ftl((float)$$7, (float)$$6));
            case iz.f -> Optional.of(new ftl((float)(1.0 - $$7), (float)$$6));
            case iz.a, iz.b -> Optional.empty();
        };
    }

    private static int a(float $$0, int $$1) {
        float $$2 = $$0 * 16.0f;
        float $$3 = 16.0f / (float)$$1;
        return bgj.a(bgj.b($$2 / $$3), 0, $$1 - 1);
    }
}

