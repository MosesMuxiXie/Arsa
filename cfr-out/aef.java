/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aef
extends Record
implements aay<adb> {
    private final long[] b;
    private final bxo c;
    public static final aao<wx, aef> a = aay.a(aef::a, aef::new);

    private aef(wx $$0) {
        this($$0.d(), $$0.b(bxo.class));
    }

    public aef(long[] $$0, bxo $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<aef> a() {
        return ahz.D;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aef.class, "sample;debugSampleType", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aef.class, "sample;debugSampleType", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aef.class, "sample;debugSampleType", "b", "c"}, this, $$0);
    }

    public long[] b() {
        return this.b;
    }

    public bxo e() {
        return this.c;
    }
}

