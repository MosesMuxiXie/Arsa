/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class eol {
    private final dwr a;
    private final is b;
    private final boolean c;
    private @Nullable eoh d;
    private @Nullable elb e;
    private boolean f;

    public eol(dwr $$0, is $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1.j();
        this.c = $$2;
    }

    public eoh a() {
        if (this.d == null && (this.c || this.a.H(this.b))) {
            this.d = this.a.a_(this.b);
        }
        return this.d;
    }

    public @Nullable elb b() {
        if (this.e == null && !this.f) {
            this.e = this.a.c_(this.b);
            this.f = true;
        }
        return this.e;
    }

    public dwr c() {
        return this.a;
    }

    public is d() {
        return this.b;
    }

    public static Predicate<@Nullable eol> a(Predicate<eoh> $$0) {
        return $$1 -> $$1 != null && $$0.test($$1.a());
    }
}

