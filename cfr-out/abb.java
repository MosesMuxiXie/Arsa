/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class abb {
    private static final Logger a = LogUtils.getLogger();

    public static <T extends xk> void a(aay<T> $$0, T $$1, axf $$2) throws anf {
        abb.a($$0, $$1, $$2.s().bv());
    }

    public static <T extends xk> void a(aay<T> $$0, T $$1, xl $$2) throws anf {
        if (!$$2.a()) {
            $$2.a($$1, $$0);
            throw anf.a;
        }
    }

    public static <T extends xk> v a(Exception $$0, aay<T> $$1, T $$2) {
        if ($$0 instanceof v) {
            v $$3 = (v)$$0;
            abb.a($$3.a(), $$2, $$1);
            return $$3;
        }
        m $$4 = m.a($$0, "Main thread packet handler");
        abb.a($$4, $$2, $$1);
        return new v($$4);
    }

    public static <T extends xk> void a(m $$0, T $$1, @Nullable aay<T> $$2) {
        if ($$2 != null) {
            n $$3 = $$0.a("Incoming Packet");
            $$3.a("Type", () -> $$2.a().toString());
            $$3.a("Is Terminal", () -> Boolean.toString($$2.d()));
            $$3.a("Is Skippable", () -> Boolean.toString($$2.c()));
        }
        $$1.a($$0);
    }
}

