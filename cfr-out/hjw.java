/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.HostAndPort
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.net.HostAndPort;
import com.mojang.logging.LogUtils;
import java.net.IDN;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class hjw {
    private static final Logger a = LogUtils.getLogger();
    private final HostAndPort b;
    private static final hjw c = new hjw(HostAndPort.fromParts((String)"server.invalid", (int)25565));

    public hjw(String $$0, int $$1) {
        this(HostAndPort.fromParts((String)$$0, (int)$$1));
    }

    private hjw(HostAndPort $$0) {
        this.b = $$0;
    }

    public String a() {
        try {
            return IDN.toASCII(this.b.getHost());
        }
        catch (IllegalArgumentException $$0) {
            return "";
        }
    }

    public int b() {
        return this.b.getPort();
    }

    public static hjw a(@Nullable String $$0) {
        if ($$0 == null) {
            return c;
        }
        try {
            HostAndPort $$1 = HostAndPort.fromString((String)$$0).withDefaultPort(25565);
            if ($$1.getHost().isEmpty()) {
                return c;
            }
            return new hjw($$1);
        }
        catch (IllegalArgumentException $$2) {
            a.info("Failed to parse URL {}", (Object)$$0, (Object)$$2);
            return c;
        }
    }

    public static boolean b(String $$0) {
        try {
            HostAndPort $$1 = HostAndPort.fromString((String)$$0);
            String $$2 = $$1.getHost();
            if (!$$2.isEmpty()) {
                IDN.toASCII($$2);
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return false;
    }

    static int c(String $$0) {
        try {
            return Integer.parseInt($$0.trim());
        }
        catch (Exception exception) {
            return 25565;
        }
    }

    public String toString() {
        return this.b.toString();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof hjw) {
            return this.b.equals((Object)((hjw)$$0).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}

