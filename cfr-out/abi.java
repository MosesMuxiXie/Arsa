/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class abi
extends Record
implements aay<abg> {
    private final acd c;
    private static final int d = 0x100000;
    public static final aao<xq, abi> a = acd.a((amo $$0) -> ace.a($$0, 0x100000), bhs.a(Lists.newArrayList((Object[])new acd.c[]{new acd.c<wx, acc>(acc.b, acc.a)}), (? super T $$0) -> {})).a(abi::new, abi::b);
    public static final aao<wx, abi> b = acd.a((amo $$0) -> ace.a($$0, 0x100000), List.of(new acd.c<wx, acc>(acc.b, acc.a))).a(abi::new, abi::b);

    public abi(acd $$0) {
        this.c = $$0;
    }

    @Override
    public aba<abi> a() {
        return abu.b;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abi.class, "payload", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abi.class, "payload", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abi.class, "payload", "c"}, this, $$0);
    }

    public acd b() {
        return this.c;
    }
}

