/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class iqc {
    static final AtomicInteger a = new AtomicInteger(0);
    static final Logger b = LogUtils.getLogger();

    public static class a
    extends Thread {
        private final b a;
        private final InetAddress b;
        private final MulticastSocket c;

        public a(b $$0) throws IOException {
            super("LanServerDetector #" + a.incrementAndGet());
            this.a = $$0;
            this.setDaemon(true);
            this.setUncaughtExceptionHandler(new p(b));
            this.c = new MulticastSocket(4445);
            this.b = InetAddress.getByName("224.0.2.60");
            this.c.setSoTimeout(5000);
            this.c.joinGroup(this.b);
        }

        @Override
        public void run() {
            byte[] $$0 = new byte[1024];
            while (!this.isInterrupted()) {
                DatagramPacket $$1 = new DatagramPacket($$0, $$0.length);
                try {
                    this.c.receive($$1);
                }
                catch (SocketTimeoutException $$2) {
                    continue;
                }
                catch (IOException $$3) {
                    b.error("Couldn't ping server", (Throwable)$$3);
                    break;
                }
                String $$4 = new String($$1.getData(), $$1.getOffset(), $$1.getLength(), StandardCharsets.UTF_8);
                b.debug("{}: {}", (Object)$$1.getAddress(), (Object)$$4);
                this.a.a($$4, $$1.getAddress());
            }
            try {
                this.c.leaveGroup(this.b);
            }
            catch (IOException iOException) {
                // empty catch block
            }
            this.c.close();
        }
    }

    public static class b {
        private final List<iqb> a = Lists.newArrayList();
        private boolean b;

        public synchronized @Nullable List<iqb> a() {
            if (this.b) {
                List<iqb> $$0 = List.copyOf(this.a);
                this.b = false;
                return $$0;
            }
            return null;
        }

        public synchronized void a(String $$0, InetAddress $$1) {
            String $$2 = iqd.a($$0);
            Object $$3 = iqd.b($$0);
            if ($$3 == null) {
                return;
            }
            $$3 = $$1.getHostAddress() + ":" + (String)$$3;
            boolean $$4 = false;
            for (iqb $$5 : this.a) {
                if (!$$5.b().equals($$3)) continue;
                $$5.c();
                $$4 = true;
                break;
            }
            if (!$$4) {
                this.a.add(new iqb($$2, (String)$$3));
                this.b = true;
            }
        }
    }
}

