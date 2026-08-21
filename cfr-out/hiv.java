/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class hiv {
    private static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("multiplayer.status.cannot_connect").b(-65536);
    private final List<wu> c = Collections.synchronizedList(Lists.newArrayList());

    public void a(final hit $$0, final Runnable $$1, final Runnable $$2, final axw $$3) throws UnknownHostException {
        final hjw $$4 = hjw.a($$0.b);
        Optional<InetSocketAddress> $$5 = hjy.a.a($$4).map(hjv::d);
        if ($$5.isEmpty()) {
            this.a(grb.b, $$0);
            return;
        }
        final InetSocketAddress $$6 = $$5.get();
        final wu $$7 = wu.a($$6, $$3, null);
        this.c.add($$7);
        $$0.d = yh.c("multiplayer.status.pinging");
        $$0.i = Collections.emptyList();
        alo $$8 = new alo(){
            private boolean i;
            private boolean j;
            private long k;

            @Override
            public void a(alp $$02) {
                if (this.j) {
                    $$7.a(yh.c("multiplayer.status.unrequested"));
                    return;
                }
                this.j = true;
                alq $$12 = $$02.b();
                $$0.d = $$12.a();
                $$12.c().ifPresentOrElse($$1 -> {
                    $$02.h = yh.b($$1.b());
                    $$02.g = $$1.c();
                }, () -> {
                    $$02.h = yh.c("multiplayer.status.old");
                    $$02.g = 0;
                });
                $$12.b().ifPresentOrElse($$1 -> {
                    $$02.c = hiv.a($$1.b(), $$1.a());
                    $$02.e = $$1;
                    if (!$$1.c().isEmpty()) {
                        ArrayList<yh> $$22 = new ArrayList<yh>($$1.c().size());
                        for (bbx $$32 : $$1.c()) {
                            yw $$5;
                            if ($$32.equals(MinecraftServer.f)) {
                                yw $$42 = yh.c("multiplayer.status.anonymous_player");
                            } else {
                                $$5 = yh.b($$32.b());
                            }
                            $$22.add($$5);
                        }
                        if ($$1.c().size() < $$1.b()) {
                            $$22.add(yh.a("multiplayer.status.and_more", $$1.b() - $$1.c().size()));
                        }
                        $$02.i = $$22;
                    } else {
                        $$02.i = List.of();
                    }
                }, () -> {
                    $$02.c = yh.c("multiplayer.status.unknown").a(l.i);
                });
                $$12.d().ifPresent($$2 -> {
                    if (!Arrays.equals($$2.a(), $$0.c())) {
                        $$0.a(hit.b($$2.a()));
                        $$1.run();
                    }
                });
                this.k = bhs.c();
                $$7.a(new alm(this.k));
                this.i = true;
            }

            @Override
            public void a(alj $$02) {
                long $$12 = this.k;
                long $$22 = bhs.c();
                $$0.f = $$22 - $$12;
                $$7.a(yh.c("multiplayer.status.finished"));
                $$2.run();
            }

            @Override
            public void a(ww $$02) {
                if (!this.i) {
                    hiv.this.a($$02.a(), $$0);
                    hiv.this.a($$6, $$4, $$0, $$3);
                }
            }

            @Override
            public boolean c() {
                return $$7.i();
            }
        };
        try {
            $$7.a($$4.a(), $$4.b(), $$8);
            $$7.a(als.a);
        }
        catch (Throwable $$9) {
            a.error("Failed to ping server {}", (Object)$$4, (Object)$$9);
        }
    }

    void a(yh $$0, hit $$1) {
        a.error("Can't ping {}: {}", (Object)$$1.b, (Object)$$0.getString());
        $$1.d = b;
        $$1.c = yg.a;
    }

    void a(InetSocketAddress $$0, final hjw $$1, final hit $$2, axw $$3) {
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group($$3.c())).handler((ChannelHandler)new ChannelInitializer<Channel>(this){

            protected void initChannel(Channel $$0) {
                try {
                    $$0.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                }
                catch (ChannelException channelException) {
                    // empty catch block
                }
                $$0.pipeline().addLast(new ChannelHandler[]{new him($$1, ($$1, $$2, $$3, $$4, $$5) -> {
                    $$2.a(hit.b.d);
                    $$0.h = yh.b($$2);
                    $$0.d = yh.b($$3);
                    $$0.c = hiv.a($$4, $$5);
                    $$0.e = new alq.b($$5, $$4, List.of());
                })});
            }
        })).channel($$3.d())).connect($$0.getAddress(), $$0.getPort());
    }

    public static yh a(int $$0, int $$1) {
        yw $$2 = yh.b(Integer.toString($$0)).a(l.h);
        yw $$3 = yh.b(Integer.toString($$1)).a(l.h);
        return yh.a("multiplayer.status.player_count", $$2, $$3).a(l.i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List<wu> list = this.c;
        synchronized (list) {
            Iterator<wu> $$0 = this.c.iterator();
            while ($$0.hasNext()) {
                wu $$1 = $$0.next();
                if ($$1.i()) {
                    $$1.b();
                    continue;
                }
                $$0.remove();
                $$1.n();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        List<wu> list = this.c;
        synchronized (list) {
            Iterator<wu> $$0 = this.c.iterator();
            while ($$0.hasNext()) {
                wu $$1 = $$0.next();
                if (!$$1.i()) continue;
                $$0.remove();
                $$1.a(yh.c("multiplayer.status.cancelled"));
            }
        }
    }
}

