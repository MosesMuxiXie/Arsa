/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;

public record ny(jf.a a) implements no
{
    @Override
    public void generate(BiConsumer<amt<fof>, fof.a> $$0) {
        $$0.accept(fnv.aV, fof.b().a(foe.a().a(fsf.a(1.0f)).a(fon.a(dlx.pR))));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ny.class, "registries", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ny.class, "registries", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ny.class, "registries", "a"}, this, $$0);
    }
}

