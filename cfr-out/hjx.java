/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Optional;
import org.slf4j.Logger;

@FunctionalInterface
public interface hjx {
    public static final Logger a = LogUtils.getLogger();
    public static final hjx b = $$0 -> {
        try {
            InetAddress $$1 = InetAddress.getByName($$0.a());
            return Optional.of(hjv.a(new InetSocketAddress($$1, $$0.b())));
        }
        catch (UnknownHostException $$2) {
            a.debug("Couldn't resolve server {} address", (Object)$$0.a(), (Object)$$2);
            return Optional.empty();
        }
    };

    public Optional<hjv> resolve(hjw var1);
}

