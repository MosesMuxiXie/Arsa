/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Date;

public interface aa {
    public fna a();

    public String b();

    public String c();

    public int d();

    public azz a(azn var1);

    public Date e();

    public boolean f();

    public record a(String a, String b, fna c, int d, azz e, azz f, Date g, boolean h) implements aa
    {
        private final String a;
        private final String b;
        private final fna c;
        private final azz e;
        private final azz f;
        private final Date g;
        private final boolean h;

        @Override
        public azz a(azn $$0) {
            return switch ($$0) {
                default -> throw new MatchException(null, null);
                case azn.a -> this.e;
                case azn.b -> this.f;
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        @Override
        public String b() {
            return this.a;
        }

        @Override
        public String c() {
            return this.b;
        }

        @Override
        public fna a() {
            return this.c;
        }

        public azz g() {
            return this.e;
        }

        public azz h() {
            return this.f;
        }

        @Override
        public Date e() {
            return this.g;
        }

        @Override
        public boolean f() {
            return this.h;
        }
    }
}

