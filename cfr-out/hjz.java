/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Hashtable;
import java.util.Optional;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import org.slf4j.Logger;

@FunctionalInterface
public interface hjz {
    public static final Logger a = LogUtils.getLogger();
    public static final hjz b = $$0 -> Optional.empty();

    public Optional<hjw> lookupRedirect(hjw var1);

    /*
     * WARNING - void declaration
     */
    public static hjz createDnsSrvRedirectHandler() {
        void $$4;
        try {
            String $$0 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> $$1 = new Hashtable<String, String>();
            $$1.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            $$1.put("java.naming.provider.url", "dns:");
            $$1.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext $$2 = new InitialDirContext($$1);
        }
        catch (Throwable $$3) {
            a.error("Failed to initialize SRV redirect resolved, some servers might not work", $$3);
            return b;
        }
        return arg_0 -> hjz.a((DirContext)$$4, arg_0);
    }

    private static /* synthetic */ Optional a(DirContext $$0, hjw $$1) {
        if ($$1.b() == 25565) {
            try {
                Attributes $$2 = $$0.getAttributes("_minecraft._tcp." + $$1.a(), new String[]{"SRV"});
                Attribute $$3 = $$2.get("srv");
                if ($$3 != null) {
                    String[] $$4 = $$3.get().toString().split(" ", 4);
                    return Optional.of(new hjw($$4[3], hjw.c($$4[2])));
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return Optional.empty();
    }
}

