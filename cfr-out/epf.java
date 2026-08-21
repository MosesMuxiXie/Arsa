/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class epf<T extends Enum<T>>
extends epk<T> {
    private final List<T> a;
    private final Map<String, T> b;
    private final int[] c;

    private epf(String $$0, Class<T> $$1, List<T> $$2) {
        super($$0, $$1);
        if ($$2.isEmpty()) {
            throw new IllegalArgumentException("Trying to make empty EnumProperty '" + $$0 + "'");
        }
        this.a = List.copyOf($$2);
        Enum[] $$3 = (Enum[])$$1.getEnumConstants();
        this.c = new int[$$3.length];
        for (Enum $$4 : $$3) {
            this.c[$$4.ordinal()] = $$2.indexOf($$4);
        }
        ImmutableMap.Builder $$5 = ImmutableMap.builder();
        for (Enum $$6 : $$2) {
            String $$7 = ((bhh)((Object)$$6)).c();
            $$5.put((Object)$$7, (Object)$$6);
        }
        this.b = $$5.buildOrThrow();
    }

    @Override
    public List<T> a() {
        return this.a;
    }

    @Override
    public Optional<T> b(String $$0) {
        return Optional.ofNullable((Enum)this.b.get($$0));
    }

    public String a(T $$0) {
        return ((bhh)$$0).c();
    }

    public int b(T $$0) {
        return this.c[((Enum)$$0).ordinal()];
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof epf) {
            epf $$1 = (epf)$$0;
            if (super.equals($$0)) {
                return this.a.equals($$1.a);
            }
        }
        return false;
    }

    @Override
    public int b() {
        int $$0 = super.b();
        $$0 = 31 * $$0 + this.a.hashCode();
        return $$0;
    }

    public static <T extends Enum<T>> epf<T> a(String $$02, Class<T> $$1) {
        return epf.a($$02, $$1, (T $$0) -> true);
    }

    public static <T extends Enum<T>> epf<T> a(String $$0, Class<T> $$1, Predicate<T> $$2) {
        return epf.a($$0, $$1, Arrays.stream((Enum[])$$1.getEnumConstants()).filter($$2).collect(Collectors.toList()));
    }

    @SafeVarargs
    public static <T extends Enum<T>> epf<T> a(String $$0, Class<T> $$1, T ... $$2) {
        return epf.a($$0, $$1, List.of($$2));
    }

    public static <T extends Enum<T>> epf<T> a(String $$0, Class<T> $$1, List<T> $$2) {
        return new epf<T>($$0, $$1, $$2);
    }

    @Override
    public /* synthetic */ int a(Comparable comparable) {
        return this.b((Enum)((Object)comparable));
    }

    @Override
    public /* synthetic */ String b(Comparable comparable) {
        return this.a((Enum)((Object)comparable));
    }
}

