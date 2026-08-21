/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class irj {
    private boolean a;
    private @Nullable ird.b b;
    private @Nullable String c;
    private final @Nullable String d;

    public irj(@Nullable String $$0) {
        this.d = $$0;
    }

    public void a(ire.a $$0) {
        if (this.c != null) {
            $$0.a(ird.j, !this.c.equals("vanilla"));
        }
        $$0.a(ird.k, this.a());
    }

    private ird.c a() {
        hit $$0 = gfj.V().X();
        if ($$0 != null && $$0.e()) {
            return ird.c.a;
        }
        if (gfj.V().Z()) {
            return ird.c.b;
        }
        return ird.c.c;
    }

    public boolean a(ira $$02) {
        if (this.a || this.b == null || this.c == null) {
            return false;
        }
        this.a = true;
        $$02.send(irb.b, $$0 -> {
            $$0.a(ird.n, this.b);
            if (this.d != null) {
                $$0.a(ird.o, this.d);
            }
        });
        return true;
    }

    public void a(dwl $$0, boolean $$1) {
        this.b = switch ($$0) {
            default -> throw new MatchException(null, null);
            case dwl.a -> {
                if ($$1) {
                    yield ird.b.e;
                }
                yield ird.b.a;
            }
            case dwl.b -> ird.b.b;
            case dwl.c -> ird.b.c;
            case dwl.d -> ird.b.d;
        };
    }

    public void a(String $$0) {
        this.c = $$0;
    }
}

