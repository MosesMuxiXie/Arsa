/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ClosedByInterruptException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class anz {
    private static final Logger a = LogUtils.getLogger();
    private final String b;
    private final int c;
    private final bbz d;
    private final int e;
    private volatile boolean f;
    private @Nullable ServerSocket g;
    private final CopyOnWriteArrayList<Socket> h = new CopyOnWriteArrayList();

    public anz(String $$0, int $$1, bbz $$2, int $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public void a() throws IOException {
        if (this.g != null && !this.g.isClosed()) {
            a.warn("Remote control server was asked to start, but it is already running. Will ignore.");
            return;
        }
        this.f = true;
        this.g = new ServerSocket(this.c, 50, InetAddress.getByName(this.b));
        Thread $$0 = new Thread(this::d, "chase-server-acceptor");
        $$0.setDaemon(true);
        $$0.start();
        Thread $$1 = new Thread(this::c, "chase-server-sender");
        $$1.setDaemon(true);
        $$1.start();
    }

    private void c() {
        a $$0 = null;
        while (this.f) {
            if (!this.h.isEmpty()) {
                a $$1 = this.e();
                if ($$1 != null && !$$1.equals($$0)) {
                    $$0 = $$1;
                    byte[] $$2 = $$1.g().getBytes(StandardCharsets.US_ASCII);
                    for (Socket $$3 : this.h) {
                        if ($$3.isClosed()) continue;
                        bhs.i().execute(() -> {
                            try {
                                OutputStream $$2 = $$3.getOutputStream();
                                $$2.write($$2);
                                $$2.flush();
                            }
                            catch (IOException $$3) {
                                a.info("Remote control client socket got an IO exception and will be closed", (Throwable)$$3);
                                IOUtils.closeQuietly((Socket)$$3);
                            }
                        });
                    }
                }
                List $$4 = this.h.stream().filter(Socket::isClosed).collect(Collectors.toList());
                this.h.removeAll($$4);
            }
            if (!this.f) continue;
            try {
                Thread.sleep(this.e);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public void b() {
        this.f = false;
        IOUtils.closeQuietly((ServerSocket)this.g);
        this.g = null;
    }

    private void d() {
        try {
            while (this.f) {
                if (this.g == null) continue;
                a.info("Remote control server is listening for connections on port {}", (Object)this.c);
                Socket $$0 = this.g.accept();
                a.info("Remote control server received client connection on port {}", (Object)$$0.getPort());
                this.h.add($$0);
            }
        }
        catch (ClosedByInterruptException $$1) {
            if (this.f) {
                a.info("Remote control server closed by interrupt");
            }
        }
        catch (IOException $$2) {
            if (this.f) {
                a.error("Remote control server closed because of an IO exception", (Throwable)$$2);
            }
        }
        finally {
            IOUtils.closeQuietly((ServerSocket)this.g);
        }
        a.info("Remote control server is now stopped");
        this.f = false;
    }

    private @Nullable a e() {
        List<axg> $$0 = this.d.t();
        if ($$0.isEmpty()) {
            return null;
        }
        axg $$1 = $$0.get(0);
        String $$2 = (String)aoh.a.inverse().get($$1.A().aq());
        if ($$2 == null) {
            return null;
        }
        return new a($$2, $$1.dP(), $$1.dR(), $$1.dV(), $$1.ec(), $$1.ee());
    }

    record a(String a, double b, double c, double d, float e, float f) {
        String g() {
            return String.format(Locale.ROOT, "t %s %.2f %.2f %.2f %.2f %.2f\n", this.a, this.b, this.c, this.d, Float.valueOf(this.e), Float.valueOf(this.f));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "dimensionName;x;y;z;yRot;xRot", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "dimensionName;x;y;z;yRot;xRot", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "dimensionName;x;y;z;yRot;xRot", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }
    }
}

