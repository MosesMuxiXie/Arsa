/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category(value={"Minecraft", "Network"})
@StackTrace(value=false)
@Enabled(value=false)
public abstract class caa
extends Event {
    @Name(value="protocolId")
    @Label(value="Protocol Id")
    public final String protocolId;
    @Name(value="packetDirection")
    @Label(value="Packet Direction")
    public final String packetDirection;
    @Name(value="packetId")
    @Label(value="Packet Id")
    public final String packetId;
    @Name(value="remoteAddress")
    @Label(value="Remote Address")
    public final String remoteAddress;
    @Name(value="bytes")
    @Label(value="Bytes")
    @DataAmount
    public final int bytes;

    public caa(String $$0, String $$1, String $$2, SocketAddress $$3, int $$4) {
        this.protocolId = $$0;
        this.packetDirection = $$1;
        this.packetId = $$2;
        this.remoteAddress = $$3.toString();
        this.bytes = $$4;
    }

    public static final class a {
        public static final String a = "remoteAddress";
        public static final String b = "protocolId";
        public static final String c = "packetDirection";
        public static final String d = "packetId";
        public static final String e = "bytes";

        private a() {
        }
    }
}

