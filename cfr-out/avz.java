/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SecureRandom;

public final class avz
extends Record {
    private final String a;
    private static final String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public avz(String $$0) {
        this.a = $$0;
    }

    public static boolean a(String $$0) {
        if ($$0.isEmpty()) {
            return false;
        }
        return $$0.matches("^[a-zA-Z0-9]{40}$");
    }

    public static String a() {
        SecureRandom $$0 = new SecureRandom();
        StringBuilder $$1 = new StringBuilder(40);
        for (int $$2 = 0; $$2 < 40; ++$$2) {
            $$1.append(b.charAt($$0.nextInt(b.length())));
        }
        return $$1.toString();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{avz.class, "secretKey", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{avz.class, "secretKey", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{avz.class, "secretKey", "a"}, this, $$0);
    }

    public String b() {
        return this.a;
    }
}

