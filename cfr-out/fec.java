/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record fec(euu.c[] a) implements euu.c
{
    @Override
    public @Nullable eoh calculate(euj.b $$0) {
        for (euu.c $$1 : this.a) {
            eoh $$2 = $$1.calculate($$0);
            if ($$2 == null) continue;
            return $$2;
        }
        return null;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fec.class, "materialRuleList", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fec.class, "materialRuleList", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fec.class, "materialRuleList", "a"}, this, $$0);
    }
}

