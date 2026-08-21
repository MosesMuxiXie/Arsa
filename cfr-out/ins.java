/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class ins {
    public static final Comparator<ins> a = Comparator.comparing(ins::a).thenComparing(ins::b);
    private final amo b;
    private final amo c;
    private @Nullable ijs d;

    public ins(amo $$0, amo $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public amo a() {
        return this.b;
    }

    public amo b() {
        return this.c;
    }

    public ijs a(Function<amo, ijs> $$0) {
        if (this.d == null) {
            this.d = $$0.apply(this.b);
        }
        return this.d;
    }

    public fzp a(inu $$0, hon $$1, Function<amo, ijs> $$2) {
        return $$0.a(this).a($$1.a(this.a($$2)));
    }

    public fzp a(inu $$0, hon $$1, Function<amo, ijs> $$2, boolean $$3, boolean $$4) {
        return $$0.a(this).a(hxp.a($$1, this.a($$2), $$3, $$4));
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        ins $$1 = (ins)$$0;
        return this.b.equals($$1.b) && this.c.equals($$1.c);
    }

    public int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public String toString() {
        return "Material{atlasLocation=" + String.valueOf(this.b) + ", texture=" + String.valueOf(this.c) + "}";
    }
}

