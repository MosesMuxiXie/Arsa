/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public interface gab {
    public static final yh a = yh.c("mco.errorMessage.noDetails");
    public static final Logger b = LogUtils.getLogger();

    public int a();

    public yh b();

    public String c();

    public static gab a(int $$0, String $$1) {
        if ($$0 == 429) {
            return gab$b.c;
        }
        if (Strings.isNullOrEmpty((String)$$1)) {
            return gab$b.b($$0);
        }
        try {
            JsonObject $$2 = bge.a($$1).getAsJsonObject();
            String $$3 = bfv.a($$2, "reason", null);
            String $$4 = bfv.a($$2, "errorMsg", null);
            int $$5 = bfv.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
                return new c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
        }
        catch (Exception $$6) {
            b.error("Could not parse RealmsError", (Throwable)$$6);
        }
        return new d($$0, $$1);
    }

    public static final class b
    extends Record
    implements gab {
        private final int g;
        private final @Nullable yh h;
        public static final b c = new b(429, yh.c("mco.errorMessage.serviceBusy"));
        public static final yh d = yh.c("mco.errorMessage.retry");
        public static final String e = "<body>";
        public static final String f = "</body>";

        public b(int $$0, @Nullable yh $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public static b a(String $$0) {
            return new b(500, yh.a("mco.errorMessage.realmsService.unknownCompatibility", new Object[]{$$0}));
        }

        public static b d() {
            return new b(500, yh.c("mco.errorMessage.realmsService.configurationError"));
        }

        public static b a(gcd $$0) {
            return new b(500, yh.a("mco.errorMessage.realmsService.connectivity", new Object[]{$$0.getMessage()}));
        }

        public static b a(int $$0) {
            return new b($$0, d);
        }

        public static b b(int $$0) {
            return new b($$0, null);
        }

        public static b b(int $$0, String $$1) {
            int $$2 = $$1.indexOf(e);
            int $$3 = $$1.indexOf(f);
            if ($$2 >= 0 && $$3 > $$2) {
                return new b($$0, yh.b($$1.substring($$2 + e.length(), $$3).trim()));
            }
            b.error("Got an error with an unreadable html body {}", (Object)$$1);
            return new b($$0, null);
        }

        @Override
        public int a() {
            return this.g;
        }

        @Override
        public yh b() {
            return this.h != null ? this.h : a;
        }

        @Override
        public String c() {
            if (this.h != null) {
                return String.format(Locale.ROOT, "Realms service error (%d) with message '%s'", this.g, this.h.getString());
            }
            return String.format(Locale.ROOT, "Realms service error (%d) with no payload", this.g);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "httpCode;payload", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "httpCode;payload", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "httpCode;payload", "g", "h"}, this, $$0);
        }

        public int e() {
            return this.g;
        }

        public @Nullable yh f() {
            return this.h;
        }
    }

    public record c(int c, int d, @Nullable String e, @Nullable String f) implements gab
    {
        private final int c;
        private final int d;
        private final @Nullable String e;
        private final @Nullable String f;

        @Override
        public int a() {
            return this.d;
        }

        @Override
        public yh b() {
            String $$1;
            String $$0 = "mco.errorMessage." + this.d;
            if (imu.a($$0)) {
                return yh.c($$0);
            }
            if (this.e != null && imu.a($$1 = "mco.errorReason." + this.e)) {
                return yh.c($$1);
            }
            return this.f != null ? yh.b(this.f) : a;
        }

        @Override
        public String c() {
            return String.format(Locale.ROOT, "Realms service error (%d/%d/%s) with message '%s'", this.c, this.d, this.e, this.f);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "httpCode;code;reason;message", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "httpCode;code;reason;message", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "httpCode;code;reason;message", "c", "d", "e", "f"}, this, $$0);
        }

        public int d() {
            return this.c;
        }

        public int e() {
            return this.d;
        }

        public @Nullable String f() {
            return this.e;
        }

        public @Nullable String g() {
            return this.f;
        }
    }

    public record d(int c, String d) implements gab
    {
        private final int c;
        private final String d;

        @Override
        public int a() {
            return this.c;
        }

        @Override
        public yh b() {
            return yh.b(this.d);
        }

        @Override
        public String c() {
            return String.format(Locale.ROOT, "Realms service error (%d) with raw payload '%s'", this.c, this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "httpCode;payload", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "httpCode;payload", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "httpCode;payload", "c", "d"}, this, $$0);
        }

        public int d() {
            return this.c;
        }

        public String e() {
            return this.d;
        }
    }

    public record a(String d) implements gab
    {
        public static final int c = 401;

        @Override
        public int a() {
            return 401;
        }

        @Override
        public yh b() {
            return yh.b(this.d);
        }

        @Override
        public String c() {
            return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "message", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "message", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "message", "d"}, this, $$0);
        }
    }
}

