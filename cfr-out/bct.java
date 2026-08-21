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
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bct
extends bcq {
    private static final Logger d = LogUtils.getLogger();
    private final ServerSocket e;
    private final String f;
    private final List<bcs> g = Lists.newArrayList();
    private final ank h;

    private bct(ank $$0, ServerSocket $$1, String $$2) {
        super("RCON Listener");
        this.h = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    private void d() {
        this.g.removeIf($$0 -> !$$0.c());
    }

    @Override
    public void run() {
        try {
            while (this.a) {
                try {
                    Socket $$0 = this.e.accept();
                    bcs $$1 = new bcs(this.h, this.f, $$0);
                    $$1.a();
                    this.g.add($$1);
                    this.d();
                }
                catch (SocketTimeoutException $$2) {
                    this.d();
                }
                catch (IOException $$3) {
                    if (!this.a) continue;
                    d.info("IO exception: ", (Throwable)$$3);
                }
            }
        }
        finally {
            this.a(this.e);
        }
    }

    public static @Nullable bct a(ank $$0) {
        int $$3;
        arz $$1 = $$0.a();
        String $$2 = $$0.b();
        if ($$2.isEmpty()) {
            $$2 = "0.0.0.0";
        }
        if (0 >= ($$3 = $$1.C) || 65535 < $$3) {
            d.warn("Invalid rcon port {} found in server.properties, rcon disabled!", (Object)$$3);
            return null;
        }
        String $$4 = $$1.D;
        if ($$4.isEmpty()) {
            d.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
        }
        try {
            ServerSocket $$5 = new ServerSocket($$3, 0, InetAddress.getByName($$2));
            $$5.setSoTimeout(500);
            bct $$6 = new bct($$0, $$5, $$4);
            if (!$$6.a()) {
                return null;
            }
            d.info("RCON running on {}:{}", (Object)$$2, (Object)$$3);
            return $$6;
        }
        catch (IOException $$7) {
            d.warn("Unable to initialise RCON on {}:{}", new Object[]{$$2, $$3, $$7});
            return null;
        }
    }

    @Override
    public void b() {
        this.a = false;
        this.a(this.e);
        super.b();
        for (bcs $$0 : this.g) {
            if (!$$0.c()) continue;
            $$0.b();
        }
        this.g.clear();
    }

    private void a(ServerSocket $$0) {
        d.debug("closeSocket: {}", (Object)$$0);
        try {
            $$0.close();
        }
        catch (IOException $$1) {
            d.warn("Failed to close socket", (Throwable)$$1);
        }
    }
}

