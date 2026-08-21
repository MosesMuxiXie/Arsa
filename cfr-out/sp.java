/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class sp {
    private static final Set<jd.c<tb>> a = Sets.newHashSet();

    public static Stream<jd.c<tb>> a() {
        return a.stream();
    }

    public static void a(jd.c<tb> $$0) {
        a.add($$0);
    }

    public static void b() {
        a.clear();
    }
}

