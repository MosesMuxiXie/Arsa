/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.timeout.ReadTimeoutException
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.ReadTimeoutException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class atr
extends SimpleChannelInboundHandler<JsonElement> {
    private static final Logger a = LogUtils.getLogger();
    private static final AtomicInteger b = new AtomicInteger(0);
    private final atw c;
    private final avh d;
    private final aty e;
    private final Channel f;
    private final auo g;
    private final AtomicInteger h = new AtomicInteger();
    private final Int2ObjectMap<aub<?>> i = Int2ObjectMaps.synchronize((Int2ObjectMap)new Int2ObjectOpenHashMap());

    public atr(Channel $$0, aty $$1, auo $$2, atw $$3) {
        this.d = avh.a(b.incrementAndGet());
        this.e = $$1;
        this.g = $$2;
        this.f = $$0;
        this.c = $$3;
    }

    public void a() {
        long $$0 = bhs.c();
        this.i.int2ObjectEntrySet().removeIf($$1 -> {
            boolean $$2 = ((aub)$$1.getValue()).a($$0);
            if ($$2) {
                ((aub)$$1.getValue()).b().completeExceptionally((Throwable)new ReadTimeoutException("RPC method " + String.valueOf(((aub)$$1.getValue()).a().h().a()) + " timed out waiting for response"));
            }
            return $$2;
        });
    }

    public void channelActive(ChannelHandlerContext $$0) throws Exception {
        this.c.a(this.d, "Management connection opened for {}", this.f.remoteAddress());
        super.channelActive($$0);
        this.e.a(this);
    }

    public void channelInactive(ChannelHandlerContext $$0) throws Exception {
        this.c.a(this.d, "Management connection closed for {}", this.f.remoteAddress());
        super.channelInactive($$0);
        this.e.b(this);
    }

    public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) throws Exception {
        if ($$1.getCause() instanceof JsonParseException) {
            this.f.writeAndFlush((Object)atu.a.a($$1.getMessage()));
            return;
        }
        super.exceptionCaught($$0, $$1);
        this.f.close().awaitUninterruptibly();
    }

    protected void a(ChannelHandlerContext $$0, JsonElement $$1) {
        if ($$1.isJsonObject()) {
            JsonObject $$2 = this.a($$1.getAsJsonObject());
            if ($$2 != null) {
                this.f.writeAndFlush((Object)$$2);
            }
        } else if ($$1.isJsonArray()) {
            this.f.writeAndFlush((Object)this.a($$1.getAsJsonArray().asList()));
        } else {
            this.f.writeAndFlush((Object)atu.b.a((String)null));
        }
    }

    private JsonArray a(List<JsonElement> $$02) {
        JsonArray $$1 = new JsonArray();
        $$02.stream().map($$0 -> this.a($$0.getAsJsonObject())).filter(Objects::nonNull).forEach(arg_0 -> ((JsonArray)$$1).add(arg_0));
        return $$1;
    }

    public void a(jd.c<? extends atz<Void, ?>> $$0) {
        this.a($$0, null, false);
    }

    public <Params> void a(jd.c<? extends atz<Params, ?>> $$0, Params $$1) {
        this.a($$0, $$1, false);
    }

    public <Result> CompletableFuture<Result> b(jd.c<? extends atz<Void, Result>> $$0) {
        return this.a($$0, null, true);
    }

    public <Params, Result> CompletableFuture<Result> b(jd.c<? extends atz<Params, Result>> $$0, Params $$1) {
        return this.a($$0, $$1, true);
    }

    @Contract(value="_,_,false->null;_,_,true->!null")
    private <Params, Result> @Nullable CompletableFuture<Result> a(jd.c<? extends atz<Params, ? extends Result>> $$0, @Nullable Params $$1, boolean $$2) {
        List<JsonElement> $$3;
        List<JsonElement> list = $$3 = $$1 != null ? List.of(Objects.requireNonNull($$0.a().a($$1))) : List.of();
        if ($$2) {
            CompletableFuture $$4 = new CompletableFuture();
            int $$5 = this.h.incrementAndGet();
            long $$6 = bhs.c.get(TimeUnit.MILLISECONDS);
            this.i.put($$5, new aub($$0, $$4, $$6 + 5000L));
            this.f.writeAndFlush((Object)atv.a($$5, $$0.h().a(), $$3));
            return $$4;
        }
        this.f.writeAndFlush((Object)atv.a(null, $$0.h().a(), $$3));
        return null;
    }

    @VisibleForTesting
    @Nullable JsonObject a(JsonObject $$0) {
        try {
            JsonElement $$1 = atv.a($$0);
            String $$2 = atv.b($$0);
            JsonElement $$3 = atv.d($$0);
            JsonElement $$4 = atv.c($$0);
            JsonObject $$5 = atv.e($$0);
            if ($$2 != null && $$3 == null && $$5 == null) {
                if ($$1 != null && !atr.a($$1)) {
                    return atu.b.a("Invalid request id - only String, Number and NULL supported");
                }
                return this.a($$1, $$2, $$4);
            }
            if ($$2 == null && $$3 != null && $$5 == null && $$1 != null) {
                if (atr.b($$1)) {
                    this.a($$1.getAsInt(), $$3);
                } else {
                    a.warn("Received respose {} with id {} we did not request", (Object)$$3, (Object)$$1);
                }
                return null;
            }
            if ($$2 == null && $$3 == null && $$5 != null) {
                return this.a($$1, $$5);
            }
            return atu.b.a((JsonElement)Objects.requireNonNullElse($$1, JsonNull.INSTANCE));
        }
        catch (Exception $$6) {
            a.error("Error while handling rpc request", (Throwable)$$6);
            return atu.e.a("Unknown error handling request - check server logs for stack trace");
        }
    }

    private static boolean a(JsonElement $$0) {
        return $$0.isJsonNull() || bfv.b($$0) || bfv.a($$0);
    }

    private static boolean b(JsonElement $$0) {
        return bfv.b($$0);
    }

    private @Nullable JsonObject a(@Nullable JsonElement $$0, String $$1, @Nullable JsonElement $$2) {
        boolean $$3 = $$0 != null;
        try {
            JsonElement $$4 = this.a($$1, $$2);
            if ($$4 == null || !$$3) {
                return null;
            }
            return atv.a($$0, $$4);
        }
        catch (avl $$5) {
            a.debug("Invalid parameter invocation {}: {}, {}", new Object[]{$$1, $$2, $$5.getMessage()});
            return $$3 ? atu.d.a($$0, $$5.getMessage()) : null;
        }
        catch (avj $$6) {
            a.error("Failed to encode json rpc response {}: {}", (Object)$$1, (Object)$$6.getMessage());
            return $$3 ? atu.e.a($$0, $$6.getMessage()) : null;
        }
        catch (avm $$7) {
            return $$3 ? atu.b.a($$0, $$7.getMessage()) : null;
        }
        catch (avp $$8) {
            return $$3 ? atu.c.a($$0, $$8.getMessage()) : null;
        }
        catch (Exception $$9) {
            a.error("Error while dispatching rpc method {}", (Object)$$1, (Object)$$9);
            return $$3 ? atu.e.a($$0) : null;
        }
    }

    public @Nullable JsonElement a(String $$0, @Nullable JsonElement $$1) {
        amo $$2 = amo.c($$0);
        if ($$2 == null) {
            throw new avm("Failed to parse method value: " + $$0);
        }
        Optional<ats<?, ?>> $$3 = mi.aC.b($$2);
        if ($$3.isEmpty()) {
            throw new avp("Method not found: " + $$0);
        }
        if ($$3.get().b().a()) {
            try {
                return this.g.a(() -> ((ats)$$3.get()).a(this.g, $$1, this.d)).join();
            }
            catch (CompletionException $$4) {
                Throwable throwable = $$4.getCause();
                if (throwable instanceof RuntimeException) {
                    RuntimeException $$5 = (RuntimeException)throwable;
                    throw $$5;
                }
                throw $$4;
            }
        }
        return $$3.get().a(this.g, $$1, this.d);
    }

    private void a(int $$0, JsonElement $$1) {
        aub $$2 = (aub)this.i.remove($$0);
        if ($$2 == null) {
            a.warn("Received unknown response (id: {}): {}", (Object)$$0, (Object)$$1);
        } else {
            $$2.a($$1);
        }
    }

    private @Nullable JsonObject a(@Nullable JsonElement $$0, JsonObject $$1) {
        aub $$2;
        if ($$0 != null && atr.b($$0) && ($$2 = (aub)this.i.remove($$0.getAsInt())) != null) {
            $$2.b().completeExceptionally(new avs($$0, $$1));
        }
        a.error("Received error (id: {}): {}", (Object)$$0, (Object)$$1);
        return null;
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.a(channelHandlerContext, (JsonElement)object);
    }
}

