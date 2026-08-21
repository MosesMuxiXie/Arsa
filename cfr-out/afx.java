/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class afx
extends Record
implements aay<adb> {
    private final String b;
    private final @Nullable String c;
    public static final aao<wx, afx> a = aay.a(afx::a, afx::new);

    private afx(wx $$0) {
        this($$0.p(), $$0.c(wx::p));
    }

    public afx(String $$0, @Nullable String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c, wx::a);
    }

    @Override
    public aba<afx> a() {
        return ahz.cw;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afx.class, "owner;objectiveName", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afx.class, "owner;objectiveName", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afx.class, "owner;objectiveName", "b", "c"}, this, $$0);
    }

    public String b() {
        return this.b;
    }

    public @Nullable String e() {
        return this.c;
    }
}

