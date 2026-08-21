/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aby(acd b) implements aay<abv>
{
    private static final int c = Short.MAX_VALUE;
    public static final aao<wx, aby> a = acd.a((amo $$0) -> ace.a($$0, Short.MAX_VALUE), bhs.a(Lists.newArrayList((Object[])new acd.c[]{new acd.c<wx, acc>(acc.b, acc.a)}), (? super T $$0) -> {})).a(aby::new, aby::b);

    @Override
    public aba<aby> a() {
        return abu.o;
    }

    @Override
    public void a(abv $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aby.class, "payload", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aby.class, "payload", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aby.class, "payload", "b"}, this, $$0);
    }
}

