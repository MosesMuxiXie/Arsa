/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;

public abstract class gac<T extends gac<T>> {
    protected HttpURLConnection a;
    private boolean c;
    protected String b;
    private static final int d = 60000;
    private static final int e = 5000;
    private static final String f = "Is-Prerelease";
    private static final String g = "Cookie";

    public gac(String $$0, int $$1, int $$2) {
        try {
            this.b = $$0;
            Proxy $$3 = gaa.a();
            this.a = $$3 != null ? (HttpURLConnection)new URL($$0).openConnection($$3) : (HttpURLConnection)new URL($$0).openConnection();
            this.a.setConnectTimeout($$1);
            this.a.setReadTimeout($$2);
        }
        catch (MalformedURLException $$4) {
            throw new gcd($$4.getMessage(), $$4);
        }
        catch (IOException $$5) {
            throw new gcd($$5.getMessage(), $$5);
        }
    }

    public void a(String $$0, String $$1) {
        gac.a(this.a, $$0, $$1);
    }

    public static void a(HttpURLConnection $$0, String $$1, String $$2) {
        String $$3 = $$0.getRequestProperty(g);
        if ($$3 == null) {
            $$0.setRequestProperty(g, $$1 + "=" + $$2);
        } else {
            $$0.setRequestProperty(g, $$3 + ";" + $$1 + "=" + $$2);
        }
    }

    public void a(boolean $$0) {
        this.a.addRequestProperty(f, String.valueOf($$0));
    }

    public int a() {
        return gac.a(this.a);
    }

    public static int a(HttpURLConnection $$0) {
        String $$1 = $$0.getHeaderField("Retry-After");
        try {
            return Integer.valueOf($$1);
        }
        catch (Exception $$2) {
            return 5;
        }
    }

    public int b() {
        try {
            this.d();
            return this.a.getResponseCode();
        }
        catch (Exception $$0) {
            throw new gcd($$0.getMessage(), $$0);
        }
    }

    public String c() {
        try {
            String $$1;
            this.d();
            if (this.b() >= 400) {
                String $$0 = this.a(this.a.getErrorStream());
            } else {
                $$1 = this.a(this.a.getInputStream());
            }
            this.f();
            return $$1;
        }
        catch (IOException $$2) {
            throw new gcd($$2.getMessage(), $$2);
        }
    }

    private String a(@Nullable InputStream $$0) throws IOException {
        if ($$0 == null) {
            return "";
        }
        InputStreamReader $$1 = new InputStreamReader($$0, StandardCharsets.UTF_8);
        StringBuilder $$2 = new StringBuilder();
        int $$3 = $$1.read();
        while ($$3 != -1) {
            $$2.append((char)$$3);
            $$3 = $$1.read();
        }
        return $$2.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void f() {
        byte[] $$0 = new byte[1024];
        try {
            InputStream $$1 = this.a.getInputStream();
            while ($$1.read($$0) > 0) {
            }
            $$1.close();
        }
        catch (Exception $$2) {
            InputStream $$3;
            block13: {
                $$3 = this.a.getErrorStream();
                if ($$3 != null) break block13;
                return;
            }
            try {
                while ($$3.read($$0) > 0) {
                }
                $$3.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        finally {
            if (this.a != null) {
                this.a.disconnect();
            }
        }
    }

    protected T d() {
        if (this.c) {
            return (T)this;
        }
        T $$0 = this.e();
        this.c = true;
        return $$0;
    }

    protected abstract T e();

    public static gac<?> a(String $$0) {
        return new b($$0, 5000, 60000);
    }

    public static gac<?> a(String $$0, int $$1, int $$2) {
        return new b($$0, $$1, $$2);
    }

    public static gac<?> b(String $$0, String $$1) {
        return new c($$0, $$1, 5000, 60000);
    }

    public static gac<?> a(String $$0, String $$1, int $$2, int $$3) {
        return new c($$0, $$1, $$2, $$3);
    }

    public static gac<?> b(String $$0) {
        return new a($$0, 5000, 60000);
    }

    public static gac<?> c(String $$0, String $$1) {
        return new d($$0, $$1, 5000, 60000);
    }

    public static gac<?> b(String $$0, String $$1, int $$2, int $$3) {
        return new d($$0, $$1, $$2, $$3);
    }

    public String c(String $$0) {
        return gac.a(this.a, $$0);
    }

    public static String a(HttpURLConnection $$0, String $$1) {
        try {
            return $$0.getHeaderField($$1);
        }
        catch (Exception $$2) {
            return "";
        }
    }

    public static class b
    extends gac<b> {
        public b(String $$0, int $$1, int $$2) {
            super($$0, $$1, $$2);
        }

        public b f() {
            try {
                this.a.setDoInput(true);
                this.a.setDoOutput(true);
                this.a.setUseCaches(false);
                this.a.setRequestMethod("GET");
                return this;
            }
            catch (Exception $$0) {
                throw new gcd($$0.getMessage(), $$0);
            }
        }

        @Override
        public /* synthetic */ gac e() {
            return this.f();
        }
    }

    public static class c
    extends gac<c> {
        private final String c;

        public c(String $$0, String $$1, int $$2, int $$3) {
            super($$0, $$2, $$3);
            this.c = $$1;
        }

        public c f() {
            try {
                if (this.c != null) {
                    this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                }
                this.a.setDoInput(true);
                this.a.setDoOutput(true);
                this.a.setUseCaches(false);
                this.a.setRequestMethod("POST");
                OutputStream $$0 = this.a.getOutputStream();
                OutputStreamWriter $$1 = new OutputStreamWriter($$0, StandardCharsets.UTF_8);
                $$1.write(this.c);
                $$1.close();
                $$0.flush();
                return this;
            }
            catch (Exception $$2) {
                throw new gcd($$2.getMessage(), $$2);
            }
        }

        @Override
        public /* synthetic */ gac e() {
            return this.f();
        }
    }

    public static class a
    extends gac<a> {
        public a(String $$0, int $$1, int $$2) {
            super($$0, $$1, $$2);
        }

        public a f() {
            try {
                this.a.setDoOutput(true);
                this.a.setRequestMethod("DELETE");
                this.a.connect();
                return this;
            }
            catch (Exception $$0) {
                throw new gcd($$0.getMessage(), $$0);
            }
        }

        @Override
        public /* synthetic */ gac e() {
            return this.f();
        }
    }

    public static class d
    extends gac<d> {
        private final String c;

        public d(String $$0, String $$1, int $$2, int $$3) {
            super($$0, $$2, $$3);
            this.c = $$1;
        }

        public d f() {
            try {
                if (this.c != null) {
                    this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                }
                this.a.setDoOutput(true);
                this.a.setDoInput(true);
                this.a.setRequestMethod("PUT");
                OutputStream $$0 = this.a.getOutputStream();
                OutputStreamWriter $$1 = new OutputStreamWriter($$0, StandardCharsets.UTF_8);
                $$1.write(this.c);
                $$1.close();
                $$0.flush();
                return this;
            }
            catch (Exception $$2) {
                throw new gcd($$2.getMessage(), $$2);
            }
        }

        @Override
        public /* synthetic */ gac e() {
            return this.f();
        }
    }
}

