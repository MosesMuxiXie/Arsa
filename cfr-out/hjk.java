/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$ClientInfo
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$RealmInfo
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$ThirdPartyServerInfo
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public final class hjk
extends Record {
    private final String a;
    private final @Nullable a b;

    public hjk(String $$0, @Nullable a $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static hjk a() {
        return hjk.a(null);
    }

    public static hjk a(String $$0) {
        return hjk.a(new a.b($$0));
    }

    public static hjk a(gbg $$0) {
        return hjk.a(new a.a($$0));
    }

    public static hjk a(@Nullable a $$0) {
        return new hjk(hjk.g(), $$0);
    }

    public AbuseReportRequest.ClientInfo b() {
        return new AbuseReportRequest.ClientInfo(this.a, Locale.getDefault().toLanguageTag());
    }

    public // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable AbuseReportRequest.ThirdPartyServerInfo c() {
        a a2 = this.b;
        if (a2 instanceof a.b) {
            a.b $$0 = (a.b)a2;
            return new AbuseReportRequest.ThirdPartyServerInfo($$0.a);
        }
        return null;
    }

    public // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable AbuseReportRequest.RealmInfo d() {
        a a2 = this.b;
        if (a2 instanceof a.a) {
            a.a $$0 = (a.a)a2;
            return new AbuseReportRequest.RealmInfo(String.valueOf($$0.a()), $$0.b());
        }
        return null;
    }

    private static String g() {
        StringBuilder $$0 = new StringBuilder();
        $$0.append(w.b().b());
        if (gfj.i().a()) {
            $$0.append(" (modded)");
        }
        return $$0.toString();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hjk.class, "clientVersion;server", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hjk.class, "clientVersion;server", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hjk.class, "clientVersion;server", "a", "b"}, this, $$0);
    }

    public String e() {
        return this.a;
    }

    public @Nullable a f() {
        return this.b;
    }

    public static interface hjk$a {

        public record a(long a, int b) implements hjk$a
        {
            public a(gbg $$0) {
                this($$0.b, $$0.q);
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "realmId;slotId", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "realmId;slotId", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "realmId;slotId", "a", "b"}, this, $$0);
            }
        }

        public static final class b
        extends Record
        implements hjk$a {
            final String a;

            public b(String $$0) {
                this.a = $$0;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "ip", "a"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "ip", "a"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "ip", "a"}, this, $$0);
            }

            public String a() {
                return this.a;
            }
        }
    }
}

