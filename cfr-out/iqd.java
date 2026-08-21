/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class iqd
extends Thread {
    private static final AtomicInteger c = new AtomicInteger(0);
    private static final Logger d = LogUtils.getLogger();
    public static final String a = "224.0.2.60";
    public static final int b = 4445;
    private static final long e = 1500L;
    private final String f;
    private final DatagramSocket g;
    private boolean h = true;
    private final String i;

    public iqd(String $$0, String $$1) throws IOException {
        super("LanServerPinger #" + c.incrementAndGet());
        this.f = $$0;
        this.i = $$1;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler(new p(d));
        this.g = new DatagramSocket();
    }

    @Override
    public void run() {
        String $$0 = iqd.a(this.f, this.i);
        byte[] $$1 = $$0.getBytes(StandardCharsets.UTF_8);
        while (!this.isInterrupted() && this.h) {
            try {
                InetAddress $$2 = InetAddress.getByName(a);
                DatagramPacket $$3 = new DatagramPacket($$1, $$1.length, $$2, 4445);
                this.g.send($$3);
            }
            catch (IOException $$4) {
                d.warn("LanServerPinger: {}", (Object)$$4.getMessage());
                break;
            }
            try {
                iqd.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.h = false;
    }

    public static String a(String $$0, String $$1) {
        return "[MOTD]" + $$0 + "[/MOTD][AD]" + $$1 + "[/AD]";
    }

    public static String a(String $$0) {
        int $$1 = $$0.indexOf("[MOTD]");
        if ($$1 < 0) {
            return "missing no";
        }
        int $$2 = $$0.indexOf("[/MOTD]", $$1 + "[MOTD]".length());
        if ($$2 < $$1) {
            return "missing no";
        }
        return $$0.substring($$1 + "[MOTD]".length(), $$2);
    }

    public static @Nullable String b(String $$0) {
        int $$1 = $$0.indexOf("[/MOTD]");
        if ($$1 < 0) {
            return null;
        }
        int $$2 = $$0.indexOf("[/MOTD]", $$1 + "[/MOTD]".length());
        if ($$2 >= 0) {
            return null;
        }
        int $$3 = $$0.indexOf("[AD]", $$1 + "[/MOTD]".length());
        if ($$3 < 0) {
            return null;
        }
        int $$4 = $$0.indexOf("[/AD]", $$3 + "[AD]".length());
        if ($$4 < $$3) {
            return null;
        }
        return $$0.substring($$3 + "[AD]".length(), $$4);
    }
}

