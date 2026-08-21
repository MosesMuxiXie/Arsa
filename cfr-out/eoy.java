/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public final class eoy
extends epk<Boolean> {
    private static final List<Boolean> a = List.of(Boolean.valueOf(true), Boolean.valueOf(false));
    private static final int b = 0;
    private static final int c = 1;

    private eoy(String $$0) {
        super($$0, Boolean.class);
    }

    @Override
    public List<Boolean> a() {
        return a;
    }

    public static eoy a(String $$0) {
        return new eoy($$0);
    }

    @Override
    public Optional<Boolean> b(String $$0) {
        return switch ($$0) {
            case "true" -> Optional.of(true);
            case "false" -> Optional.of(false);
            default -> Optional.empty();
        };
    }

    public String a(Boolean $$0) {
        return $$0.toString();
    }

    public int b(Boolean $$0) {
        return $$0 != false ? 0 : 1;
    }

    @Override
    public /* synthetic */ int a(Comparable comparable) {
        return this.b((Boolean)comparable);
    }

    @Override
    public /* synthetic */ String b(Comparable comparable) {
        return this.a((Boolean)comparable);
    }
}

