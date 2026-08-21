/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bcr
extends bcq {
    private static final Logger d = LogUtils.getLogger();
    private static final String e = "SMP";
    private static final String f = "MINECRAFT";
    private static final long g = 30000L;
    private static final long h = 5000L;
    private long i;
    private final int j;
    private final int k;
    private final int l;
    private final String m;
    private final String n;
    private DatagramSocket o;
    private final byte[] p = new byte[1460];
    private String q;
    private String r;
    private final Map<SocketAddress, a> s;
    private final bcm t;
    private long u;
    private final ank v;

    private bcr(ank $$0, int $$1) {
        super("Query Listener");
        this.v = $$0;
        this.j = $$1;
        this.r = $$0.b();
        this.k = $$0.d();
        this.m = $$0.h();
        this.l = $$0.r();
        this.n = $$0.j();
        this.u = 0L;
        this.q = "0.0.0.0";
        if (this.r.isEmpty() || this.q.equals(this.r)) {
            this.r = "0.0.0.0";
            try {
                InetAddress $$2 = InetAddress.getLocalHost();
                this.q = $$2.getHostAddress();
            }
            catch (UnknownHostException $$3) {
                d.warn("Unable to determine local host IP, please set server-ip in server.properties", (Throwable)$$3);
            }
        } else {
            this.q = this.r;
        }
        this.t = new bcm(1460);
        this.s = Maps.newHashMap();
    }

    public static @Nullable bcr a(ank $$0) {
        int $$1 = $$0.a().A;
        if (0 >= $$1 || 65535 < $$1) {
            d.warn("Invalid query port {} found in server.properties (queries disabled)", (Object)$$1);
            return null;
        }
        bcr $$2 = new bcr($$0, $$1);
        if (!$$2.a()) {
            return null;
        }
        return $$2;
    }

    private void a(byte[] $$0, DatagramPacket $$1) throws IOException {
        this.o.send(new DatagramPacket($$0, $$0.length, $$1.getSocketAddress()));
    }

    private boolean a(DatagramPacket $$0) throws IOException {
        byte[] $$1 = $$0.getData();
        int $$2 = $$0.getLength();
        SocketAddress $$3 = $$0.getSocketAddress();
        d.debug("Packet len {} [{}]", (Object)$$2, (Object)$$3);
        if (3 > $$2 || -2 != $$1[0] || -3 != $$1[1]) {
            d.debug("Invalid packet [{}]", (Object)$$3);
            return false;
        }
        d.debug("Packet '{}' [{}]", (Object)bcn.a($$1[2]), (Object)$$3);
        switch ($$1[2]) {
            case 9: {
                this.d($$0);
                d.debug("Challenge [{}]", (Object)$$3);
                return true;
            }
            case 0: {
                if (!this.c($$0).booleanValue()) {
                    d.debug("Invalid challenge [{}]", (Object)$$3);
                    return false;
                }
                if (15 == $$2) {
                    this.a(this.b($$0), $$0);
                    d.debug("Rules [{}]", (Object)$$3);
                    break;
                }
                bcm $$4 = new bcm(1460);
                $$4.a(0);
                $$4.a(this.a($$0.getSocketAddress()));
                $$4.a(this.m);
                $$4.a(e);
                $$4.a(this.n);
                $$4.a(Integer.toString(this.v.R()));
                $$4.a(Integer.toString(this.l));
                $$4.a((short)this.k);
                $$4.a(this.q);
                this.a($$4.a(), $$0);
                d.debug("Status [{}]", (Object)$$3);
            }
        }
        return true;
    }

    private byte[] b(DatagramPacket $$0) throws IOException {
        String[] $$4;
        long $$1 = bhs.c();
        if ($$1 < this.u + 5000L) {
            byte[] $$2 = this.t.a();
            byte[] $$3 = this.a($$0.getSocketAddress());
            $$2[1] = $$3[0];
            $$2[2] = $$3[1];
            $$2[3] = $$3[2];
            $$2[4] = $$3[3];
            return $$2;
        }
        this.u = $$1;
        this.t.b();
        this.t.a(0);
        this.t.a(this.a($$0.getSocketAddress()));
        this.t.a("splitnum");
        this.t.a(128);
        this.t.a(0);
        this.t.a("hostname");
        this.t.a(this.m);
        this.t.a("gametype");
        this.t.a(e);
        this.t.a("game_id");
        this.t.a(f);
        this.t.a("version");
        this.t.a(this.v.Q());
        this.t.a("plugins");
        this.t.a(this.v.s());
        this.t.a("map");
        this.t.a(this.n);
        this.t.a("numplayers");
        this.t.a("" + this.v.R());
        this.t.a("maxplayers");
        this.t.a("" + this.l);
        this.t.a("hostport");
        this.t.a("" + this.k);
        this.t.a("hostip");
        this.t.a(this.q);
        this.t.a(0);
        this.t.a(1);
        this.t.a("player_");
        this.t.a(0);
        for (String $$5 : $$4 = this.v.S()) {
            this.t.a($$5);
        }
        this.t.a(0);
        return this.t.a();
    }

    private byte[] a(SocketAddress $$0) {
        return this.s.get($$0).c();
    }

    private Boolean c(DatagramPacket $$0) {
        SocketAddress $$1 = $$0.getSocketAddress();
        if (!this.s.containsKey($$1)) {
            return false;
        }
        byte[] $$2 = $$0.getData();
        return this.s.get($$1).a() == bcn.c($$2, 7, $$0.getLength());
    }

    private void d(DatagramPacket $$0) throws IOException {
        a $$1 = new a($$0);
        this.s.put($$0.getSocketAddress(), $$1);
        this.a($$1.b(), $$0);
    }

    private void d() {
        if (!this.a) {
            return;
        }
        long $$0 = bhs.c();
        if ($$0 < this.i + 30000L) {
            return;
        }
        this.i = $$0;
        this.s.values().removeIf($$1 -> $$1.a($$0));
    }

    @Override
    public void run() {
        d.info("Query running on {}:{}", (Object)this.r, (Object)this.j);
        this.i = bhs.c();
        DatagramPacket $$0 = new DatagramPacket(this.p, this.p.length);
        try {
            while (this.a) {
                try {
                    this.o.receive($$0);
                    this.d();
                    this.a($$0);
                }
                catch (SocketTimeoutException $$1) {
                    this.d();
                }
                catch (PortUnreachableException $$1) {
                }
                catch (IOException $$2) {
                    this.a($$2);
                }
            }
        }
        finally {
            d.debug("closeSocket: {}:{}", (Object)this.r, (Object)this.j);
            this.o.close();
        }
    }

    @Override
    public boolean a() {
        if (this.a) {
            return true;
        }
        if (!this.e()) {
            return false;
        }
        return super.a();
    }

    private void a(Exception $$0) {
        if (!this.a) {
            return;
        }
        d.warn("Unexpected exception", (Throwable)$$0);
        if (!this.e()) {
            d.error("Failed to recover from exception, shutting down!");
            this.a = false;
        }
    }

    private boolean e() {
        try {
            this.o = new DatagramSocket(this.j, InetAddress.getByName(this.r));
            this.o.setSoTimeout(500);
            return true;
        }
        catch (Exception $$0) {
            d.warn("Unable to initialise query system on {}:{}", new Object[]{this.r, this.j, $$0});
            return false;
        }
    }

    static class a {
        private final long a = new Date().getTime();
        private final int b;
        private final byte[] c;
        private final byte[] d;
        private final String e;

        public a(DatagramPacket $$0) {
            byte[] $$1 = $$0.getData();
            this.c = new byte[4];
            this.c[0] = $$1[3];
            this.c[1] = $$1[4];
            this.c[2] = $$1[5];
            this.c[3] = $$1[6];
            this.e = new String(this.c, StandardCharsets.UTF_8);
            this.b = bgr.a().a(0x1000000);
            this.d = String.format(Locale.ROOT, "\t%s%d\u0000", this.e, this.b).getBytes(StandardCharsets.UTF_8);
        }

        public Boolean a(long $$0) {
            return this.a < $$0;
        }

        public int a() {
            return this.b;
        }

        public byte[] b() {
            return this.d;
        }

        public byte[] c() {
            return this.c;
        }

        public String d() {
            return this.e;
        }
    }
}

