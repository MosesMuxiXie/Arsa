/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class etw
extends Record {
    private final amo h;
    private static final List<etw> i = new ArrayList<etw>();
    public static final etw a = etw.a("player");
    public static final etw b = etw.a("mobs");
    public static final etw c = etw.a("spawning");
    public static final etw d = etw.a("drops");
    public static final etw e = etw.a("updates");
    public static final etw f = etw.a("chat");
    public static final etw g = etw.a("misc");

    public etw(amo $$0) {
        this.h = $$0;
    }

    public amo a() {
        return this.h;
    }

    private static etw a(String $$0) {
        return etw.a(amo.b($$0));
    }

    public static etw a(amo $$0) {
        etw $$1 = new etw($$0);
        if (i.contains($$1)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Category '%s' is already registered.", $$0));
        }
        i.add($$1);
        return $$1;
    }

    public yw b() {
        return yh.c(this.h.h("gamerule.category"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{etw.class, "id", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{etw.class, "id", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{etw.class, "id", "h"}, this, $$0);
    }

    public amo c() {
        return this.h;
    }
}

