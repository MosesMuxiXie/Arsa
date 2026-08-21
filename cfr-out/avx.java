/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  io.netty.handler.codec.http.DefaultFullHttpResponse
 *  io.netty.handler.codec.http.HttpHeaderNames
 *  io.netty.handler.codec.http.HttpRequest
 *  io.netty.handler.codec.http.HttpResponse
 *  io.netty.handler.codec.http.HttpResponseStatus
 *  io.netty.handler.codec.http.HttpVersion
 *  io.netty.util.AttributeKey
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.AttributeKey;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@ChannelHandler.Sharable
public class avx
extends ChannelDuplexHandler {
    private final Logger b = LogUtils.getLogger();
    private static final AttributeKey<Boolean> c = AttributeKey.valueOf((String)"authenticated");
    private static final AttributeKey<Boolean> d = AttributeKey.valueOf((String)"websocket_auth_allowed");
    private static final String e = "minecraft-v1";
    private static final String f = "minecraft-v1,";
    public static final String a = "Bearer ";
    private final avz g;
    private final Set<String> h;

    public avx(avz $$0, String $$1) {
        this.g = $$0;
        this.h = Sets.newHashSet((Object[])$$1.split(","));
    }

    public void channelRead(ChannelHandlerContext $$0, Object $$1) throws Exception {
        Boolean $$5;
        String $$2 = this.a($$0);
        if ($$1 instanceof HttpRequest) {
            HttpRequest $$3 = (HttpRequest)$$1;
            a $$4 = this.a($$3);
            if ($$4.b()) {
                $$0.channel().attr(c).set((Object)true);
                if ($$4.d()) {
                    $$0.channel().attr(d).set((Object)Boolean.TRUE);
                }
            } else {
                this.b.debug("Authentication rejected for connection with ip {}: {}", (Object)$$2, (Object)$$4.c());
                $$0.channel().attr(c).set((Object)false);
                this.a($$0, $$4.c());
                return;
            }
        }
        if (Boolean.TRUE.equals($$5 = (Boolean)$$0.channel().attr(c).get())) {
            super.channelRead($$0, $$1);
        } else {
            this.b.debug("Dropping unauthenticated connection with ip {}", (Object)$$2);
            $$0.close();
        }
    }

    public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
        HttpResponse $$3;
        if ($$1 instanceof HttpResponse && ($$3 = (HttpResponse)$$1).status().code() == HttpResponseStatus.SWITCHING_PROTOCOLS.code() && $$0.channel().attr(d).get() != null && ((Boolean)$$0.channel().attr(d).get()).equals(Boolean.TRUE)) {
            $$3.headers().set((CharSequence)HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL, (Object)e);
        }
        super.write($$0, $$1, $$2);
    }

    private a a(HttpRequest $$0) {
        String $$1 = this.c($$0);
        if ($$1 != null) {
            if (this.a($$1)) {
                return avx$a.a();
            }
            return avx$a.a("Invalid API key");
        }
        String $$2 = this.d($$0);
        if ($$2 != null) {
            if (!this.b($$0)) {
                return avx$a.a("Origin Not Allowed");
            }
            if (this.a($$2)) {
                return avx$a.a(true);
            }
            return avx$a.a("Invalid API key");
        }
        return avx$a.a("Missing API key");
    }

    private boolean b(HttpRequest $$0) {
        String $$1 = $$0.headers().get((CharSequence)HttpHeaderNames.ORIGIN);
        if ($$1 == null || $$1.isEmpty()) {
            return false;
        }
        return this.h.contains($$1);
    }

    private @Nullable String c(HttpRequest $$0) {
        String $$1 = $$0.headers().get((CharSequence)HttpHeaderNames.AUTHORIZATION);
        if ($$1 != null && $$1.startsWith(a)) {
            return $$1.substring(a.length()).trim();
        }
        return null;
    }

    private @Nullable String d(HttpRequest $$0) {
        String $$1 = $$0.headers().get((CharSequence)HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL);
        if ($$1 != null && $$1.startsWith(f)) {
            return $$1.substring(f.length()).trim();
        }
        return null;
    }

    public boolean a(String $$0) {
        if ($$0.isEmpty()) {
            return false;
        }
        byte[] $$1 = $$0.getBytes(StandardCharsets.UTF_8);
        byte[] $$2 = this.g.b().getBytes(StandardCharsets.UTF_8);
        return MessageDigest.isEqual($$1, $$2);
    }

    private String a(ChannelHandlerContext $$0) {
        InetSocketAddress $$1 = (InetSocketAddress)$$0.channel().remoteAddress();
        return $$1.getAddress().getHostAddress();
    }

    private void a(ChannelHandlerContext $$0, String $$12) {
        String $$2 = "{\"error\":\"Unauthorized\",\"message\":\"" + $$12 + "\"}";
        byte[] $$3 = $$2.getBytes(StandardCharsets.UTF_8);
        DefaultFullHttpResponse $$4 = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.UNAUTHORIZED, Unpooled.wrappedBuffer((byte[])$$3));
        $$4.headers().set((CharSequence)HttpHeaderNames.CONTENT_TYPE, (Object)"application/json");
        $$4.headers().set((CharSequence)HttpHeaderNames.CONTENT_LENGTH, (Object)$$3.length);
        $$4.headers().set((CharSequence)HttpHeaderNames.CONNECTION, (Object)"close");
        $$0.writeAndFlush((Object)$$4).addListener($$1 -> $$0.close());
    }

    static class a {
        private final boolean a;
        private final String b;
        private final boolean c;

        private a(boolean $$0, String $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public static a a() {
            return new a(true, null, false);
        }

        public static a a(boolean $$0) {
            return new a(true, null, $$0);
        }

        public static a a(String $$0) {
            return new a(false, $$0, false);
        }

        public boolean b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }
    }
}

