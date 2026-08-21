/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public record af(List<List<String>> c) {
    private final List<List<String>> c;
    public static final Codec<af> a = Codec.STRING.listOf().listOf().xmap(af::new, af::d);
    public static final af b = new af(List.of());

    public af(wx $$02) {
        this($$02.a((? super wx $$0) -> $$0.a(wx::p)));
    }

    public void a(wx $$02) {
        $$02.a(this.c, ($$0, $$1) -> $$0.a($$1, wx::a));
    }

    public static af a(Collection<String> $$0) {
        return new af($$0.stream().map(List::of).toList());
    }

    public static af b(Collection<String> $$0) {
        return new af(List.of(List.copyOf($$0)));
    }

    public int a() {
        return this.c.size();
    }

    public boolean a(Predicate<String> $$0) {
        if (this.c.isEmpty()) {
            return false;
        }
        for (List<String> $$1 : this.c) {
            if (af.a($$1, $$0)) continue;
            return false;
        }
        return true;
    }

    public int b(Predicate<String> $$0) {
        int $$1 = 0;
        for (List<String> $$2 : this.c) {
            if (!af.a($$2, $$0)) continue;
            ++$$1;
        }
        return $$1;
    }

    private static boolean a(List<String> $$0, Predicate<String> $$1) {
        for (String $$2 : $$0) {
            if (!$$1.test($$2)) continue;
            return true;
        }
        return false;
    }

    public DataResult<af> a(Set<String> $$0) {
        ObjectOpenHashSet $$1 = new ObjectOpenHashSet();
        for (List<String> $$2 : this.c) {
            if ($$2.isEmpty() && $$0.isEmpty()) {
                return DataResult.error(() -> "Requirement entry cannot be empty");
            }
            $$1.addAll($$2);
        }
        if (!$$0.equals($$1)) {
            Sets.SetView $$3 = Sets.difference($$0, (Set)$$1);
            Sets.SetView $$4 = Sets.difference((Set)$$1, $$0);
            return DataResult.error(() -> af.a((Set)$$3, (Set)$$4));
        }
        return DataResult.success((Object)this);
    }

    public boolean b() {
        return this.c.isEmpty();
    }

    @Override
    public String toString() {
        return this.c.toString();
    }

    public Set<String> c() {
        ObjectOpenHashSet $$0 = new ObjectOpenHashSet();
        for (List<String> $$1 : this.c) {
            $$0.addAll($$1);
        }
        return $$0;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{af.class, "requirements", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{af.class, "requirements", "c"}, this, $$0);
    }

    public List<List<String>> d() {
        return this.c;
    }

    private static /* synthetic */ String a(Set $$0, Set $$1) {
        return "Advancement completion requirements did not exactly match specified criteria. Missing: " + String.valueOf($$0) + ". Unknown: " + String.valueOf($$1);
    }

    public static interface a {
        public static final a a = af::a;
        public static final a b = af::b;

        public af create(Collection<String> var1);
    }
}

