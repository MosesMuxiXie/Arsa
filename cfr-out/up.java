/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record up(ftm a, ftm b, ftm c, ftm d, ul e) implements uh
{
    public static up a(ftm $$0, ftm $$1, iz $$2, ul $$3) {
        return switch ($$2) {
            default -> throw new MatchException(null, null);
            case iz.a -> new up(new ftm($$0.g, $$0.h, $$0.i), new ftm($$1.g, $$0.h, $$0.i), new ftm($$1.g, $$0.h, $$1.i), new ftm($$0.g, $$0.h, $$1.i), $$3);
            case iz.b -> new up(new ftm($$0.g, $$1.h, $$0.i), new ftm($$0.g, $$1.h, $$1.i), new ftm($$1.g, $$1.h, $$1.i), new ftm($$1.g, $$1.h, $$0.i), $$3);
            case iz.c -> new up(new ftm($$0.g, $$0.h, $$0.i), new ftm($$0.g, $$1.h, $$0.i), new ftm($$1.g, $$1.h, $$0.i), new ftm($$1.g, $$0.h, $$0.i), $$3);
            case iz.d -> new up(new ftm($$0.g, $$0.h, $$1.i), new ftm($$1.g, $$0.h, $$1.i), new ftm($$1.g, $$1.h, $$1.i), new ftm($$0.g, $$1.h, $$1.i), $$3);
            case iz.e -> new up(new ftm($$0.g, $$0.h, $$0.i), new ftm($$0.g, $$0.h, $$1.i), new ftm($$0.g, $$1.h, $$1.i), new ftm($$0.g, $$1.h, $$0.i), $$3);
            case iz.f -> new up(new ftm($$1.g, $$0.h, $$0.i), new ftm($$1.g, $$1.h, $$0.i), new ftm($$1.g, $$1.h, $$1.i), new ftm($$1.g, $$0.h, $$1.i), $$3);
        };
    }

    @Override
    public void a(uj $$0, float $$1) {
        if (this.e.a()) {
            int $$2 = this.e.b($$1);
            $$0.a(this.a, this.b, this.c, this.d, $$2);
        }
        if (this.e.b()) {
            int $$3 = this.e.a($$1);
            $$0.a(this.a, this.b, $$3, this.e.d());
            $$0.a(this.b, this.c, $$3, this.e.d());
            $$0.a(this.c, this.d, $$3, this.e.d());
            $$0.a(this.d, this.a, $$3, this.e.d());
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{up.class, "a;b;c;d;style", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{up.class, "a;b;c;d;style", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{up.class, "a;b;c;d;style", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

