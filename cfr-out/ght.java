/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record ght(List<epk.a<?>> b) {
    public static final ght a = new ght(List.of());
    private static final Comparator<epk.a<?>> c = Comparator.comparing($$0 -> $$0.a().f());

    public ght a(epk.a<?> $$0) {
        return new ght(bhs.a(this.b, $$0));
    }

    public ght a(ght $$0) {
        return new ght((List<epk.a<?>>)ImmutableList.builder().addAll(this.b).addAll($$0.b).build());
    }

    public static ght a(epk.a<?> ... $$0) {
        return new ght(List.of($$0));
    }

    public String a() {
        return this.b.stream().sorted(c).map(epk.a::toString).collect(Collectors.joining(","));
    }

    @Override
    public String toString() {
        return this.a();
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ght.class, "values", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ght.class, "values", "b"}, this, $$0);
    }
}

