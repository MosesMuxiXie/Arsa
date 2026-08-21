/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.microsoft.aad.msal4j.ClientCredentialFactory
 *  com.microsoft.aad.msal4j.ClientCredentialParameters
 *  com.microsoft.aad.msal4j.ConfidentialClientApplication
 *  com.microsoft.aad.msal4j.ConfidentialClientApplication$Builder
 *  com.microsoft.aad.msal4j.IAuthenticationResult
 *  com.microsoft.aad.msal4j.IClientCertificate
 *  com.microsoft.aad.msal4j.IClientCredential
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCertificate;
import com.microsoft.aad.msal4j.IClientCredential;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.jspecify.annotations.Nullable;

public class aye
extends ayn {
    private final ConfidentialClientApplication b;
    private final ClientCredentialParameters c;
    private final Set<String> d;
    private final int e;

    private aye(URL $$0, ayn.b $$1, ayn.a $$2, ExecutorService $$3, ConfidentialClientApplication $$4, ClientCredentialParameters $$5, Set<String> $$6, int $$7) {
        super($$0, $$1, $$2, $$3);
        this.b = $$4;
        this.c = $$5;
        this.d = $$6;
        this.e = $$7;
    }

    /*
     * WARNING - void declaration
     */
    public static @Nullable ayn a(String $$0) {
        void $$29;
        void $$18;
        JsonObject $$12 = bfv.a($$0);
        URI $$22 = URI.create(bfv.i($$12, "apiServer"));
        String $$32 = bfv.i($$12, "apiPath");
        String $$4 = bfv.i($$12, "scope");
        String $$5 = bfv.a($$12, "serverId", "");
        String $$6 = bfv.i($$12, "applicationId");
        String $$7 = bfv.i($$12, "tenantId");
        String $$8 = bfv.a($$12, "roomId", "Java:Chat");
        String $$9 = bfv.i($$12, "certificatePath");
        String $$10 = bfv.a($$12, "certificatePassword", "");
        int $$11 = bfv.a($$12, "hashesToDrop", -1);
        int $$122 = bfv.a($$12, "maxConcurrentRequests", 7);
        JsonArray $$13 = bfv.v($$12, "fullyFilteredEvents");
        HashSet<String> $$14 = new HashSet<String>();
        $$13.forEach($$1 -> $$14.add(bfv.a($$1, "filteredEvent")));
        int $$15 = bfv.a($$12, "connectionReadTimeoutMs", 2000);
        try {
            URL $$16 = $$22.resolve($$32).toURL();
        }
        catch (MalformedURLException $$17) {
            throw new RuntimeException($$17);
        }
        ayn.b $$19 = ($$2, $$3) -> {
            JsonObject $$4 = new JsonObject();
            $$4.addProperty("userId", $$2.id().toString());
            $$4.addProperty("userDisplayName", $$2.name());
            $$4.addProperty("server", $$5);
            $$4.addProperty("room", $$8);
            $$4.addProperty("area", "JavaChatRealms");
            $$4.addProperty("data", $$3);
            $$4.addProperty("language", "*");
            return $$4;
        };
        ayn.a $$20 = ayn.a.select($$11);
        ExecutorService $$21 = aye.a($$122);
        try (InputStream $$222 = Files.newInputStream(Path.of($$9, new String[0]), new OpenOption[0]);){
            IClientCertificate $$23 = ClientCredentialFactory.createFromCertificate((InputStream)$$222, (String)$$10);
        }
        catch (Exception $$25) {
            a.warn("Failed to open certificate file");
            return null;
        }
        try {
            void $$26;
            ConfidentialClientApplication $$27 = ((ConfidentialClientApplication.Builder)((ConfidentialClientApplication.Builder)ConfidentialClientApplication.builder((String)$$6, (IClientCredential)$$26).sendX5c(true).executorService($$21)).authority(String.format(Locale.ROOT, "https://login.microsoftonline.com/%s/", $$7))).build();
        }
        catch (Exception $$28) {
            a.warn("Failed to create confidential client application");
            return null;
        }
        ClientCredentialParameters $$30 = ClientCredentialParameters.builder(Set.of($$4)).build();
        return new aye((URL)$$18, $$19, $$20, $$21, (ConfidentialClientApplication)$$29, $$30, $$14, $$15);
    }

    private IAuthenticationResult b() {
        return (IAuthenticationResult)this.b.acquireToken(this.c).join();
    }

    @Override
    protected void a(HttpURLConnection $$0) {
        IAuthenticationResult $$1 = this.b();
        $$0.setRequestProperty("Authorization", "Bearer " + $$1.accessToken());
    }

    @Override
    protected axy a(String $$0, ayn.a $$1, JsonObject $$2) {
        JsonObject $$3 = bfv.a($$2, "result", null);
        if ($$3 == null) {
            return axy.b($$0);
        }
        boolean $$4 = bfv.a($$3, "filtered", true);
        if (!$$4) {
            return axy.a($$0);
        }
        JsonArray $$5 = bfv.a($$3, "events", new JsonArray());
        for (JsonElement $$6 : $$5) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = bfv.a($$7, "id", "");
            if (!this.d.contains($$8)) continue;
            return axy.b($$0);
        }
        JsonArray $$9 = bfv.a($$3, "redactedTextIndex", new JsonArray());
        return new axy($$0, this.a($$0, $$9, $$1));
    }

    @Override
    protected int a() {
        return this.e;
    }
}

