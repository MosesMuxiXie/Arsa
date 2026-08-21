/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.slf4j.Logger;

public class bcs
extends bcq {
    private static final Logger d = LogUtils.getLogger();
    private static final int e = 3;
    private static final int f = 2;
    private static final int g = 0;
    private static final int h = 2;
    private static final int i = -1;
    private boolean j;
    private final Socket k;
    private final byte[] l = new byte[1460];
    private final String m;
    private final ank n;

    bcs(ank $$0, String $$1, Socket $$2) {
        super("RCON Client " + String.valueOf($$2.getInetAddress()));
        this.n = $$0;
        this.k = $$2;
        try {
            this.k.setSoTimeout(0);
        }
        catch (Exception $$3) {
            this.a = false;
        }
        this.m = $$1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            while (this.a) {
                BufferedInputStream $$0 = new BufferedInputStream(this.k.getInputStream());
                int $$1 = $$0.read(this.l, 0, 1460);
                if (10 > $$1) {
                    return;
                }
                int $$2 = 0;
                int $$3 = bcn.b(this.l, 0, $$1);
                if ($$3 != $$1 - 4) {
                    return;
                }
                int $$4 = bcn.b(this.l, $$2 += 4, $$1);
                int $$5 = bcn.a(this.l, $$2 += 4);
                $$2 += 4;
                switch ($$5) {
                    case 3: {
                        String $$6 = bcn.a(this.l, $$2, $$1);
                        $$2 += $$6.length();
                        if (!$$6.isEmpty() && $$6.equals(this.m)) {
                            this.j = true;
                            this.a($$4, 2, "");
                            break;
                        }
                        this.j = false;
                        this.d();
                        break;
                    }
                    case 2: {
                        if (this.j) {
                            String $$7 = bcn.a(this.l, $$2, $$1);
                            try {
                                this.a($$4, this.n.a($$7));
                            }
                            catch (Exception $$8) {
                                this.a($$4, "Error executing: " + $$7 + " (" + $$8.getMessage() + ")");
                            }
                            break;
                        }
                        this.d();
                        break;
                    }
                    default: {
                        this.a($$4, String.format(Locale.ROOT, "Unknown request %s", Integer.toHexString($$5)));
                    }
                }
            }
        }
        catch (IOException $$0) {
        }
        catch (Exception $$9) {
            d.error("Exception whilst parsing RCON input", (Throwable)$$9);
        }
        finally {
            this.e();
            d.info("Thread {} shutting down", (Object)this.b);
            this.a = false;
        }
    }

    private void a(int $$0, int $$1, String $$2) throws IOException {
        ByteArrayOutputStream $$3 = new ByteArrayOutputStream(1248);
        DataOutputStream $$4 = new DataOutputStream($$3);
        byte[] $$5 = $$2.getBytes(StandardCharsets.UTF_8);
        $$4.writeInt(Integer.reverseBytes($$5.length + 10));
        $$4.writeInt(Integer.reverseBytes($$0));
        $$4.writeInt(Integer.reverseBytes($$1));
        $$4.write($$5);
        $$4.write(0);
        $$4.write(0);
        this.k.getOutputStream().write($$3.toByteArray());
    }

    private void d() throws IOException {
        this.a(-1, 2, "");
    }

    private void a(int $$0, String $$1) throws IOException {
        int $$3;
        int $$2 = $$1.length();
        do {
            $$3 = 4096 <= $$2 ? 4096 : $$2;
            this.a($$0, 0, $$1.substring(0, $$3));
        } while (0 != ($$2 = ($$1 = $$1.substring($$3)).length()));
    }

    @Override
    public void b() {
        this.a = false;
        this.e();
        super.b();
    }

    private void e() {
        try {
            this.k.close();
        }
        catch (IOException $$0) {
            d.warn("Failed to close socket", (Throwable)$$0);
        }
    }
}

