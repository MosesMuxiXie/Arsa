/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ayg
extends ayf
implements acq,
xv {
    private static final Logger f = LogUtils.getLogger();
    private static final yh g = yh.c("multiplayer.disconnect.invalid_player_data");
    private static final yh h = yh.c("multiplayer.disconnect.configuration_error");
    private final GameProfile i;
    private final Queue<axv> j = new ConcurrentLinkedQueue<axv>();
    private @Nullable axv k;
    private awp l;
    private @Nullable ayt m;
    private @Nullable ayq n;

    public ayg(MinecraftServer $$0, wu $$1, axu $$2) {
        super($$0, $$1, $$2);
        this.i = $$2.a();
        this.l = $$2.c();
    }

    @Override
    protected GameProfile i() {
        return this.i;
    }

    @Override
    public void a(ww $$0) {
        f.info("{} ({}) lost connection: {}", new Object[]{this.i.name(), this.i.id(), $$0.a().getString()});
        if (this.n != null) {
            this.n.d();
            this.n = null;
        }
        super.a($$0);
    }

    @Override
    public boolean c() {
        return this.e.i();
    }

    public void l() {
        this.b(new abi(new acc(this.d.getServerModName())));
        anl $$02 = this.d.bt();
        if (!$$02.a()) {
            this.b(new abp($$02.b()));
        }
        jk<anc> $$1 = this.d.bd();
        List<bag> $$2 = this.d.bg().b().flatMap($$0 -> $$0.a().d().stream()).toList();
        this.b(new acn(dhb.e.b(this.d.bb().J())));
        this.m = new ayt($$2, $$1);
        this.j.add(this.m);
        this.n();
        this.m();
    }

    public void m() {
        this.n = new ayq(this.d, new bbx(this.i));
        this.j.add(this.n);
        this.j.add(new ayp());
        this.o();
    }

    private void n() {
        Map<String, String> $$02 = this.d.ab();
        if (!$$02.isEmpty()) {
            this.j.add(new ayr(() -> {
                String $$1 = (String)$$02.get(this.l.b().toLowerCase(Locale.ROOT));
                if ($$1 == null) {
                    $$1 = (String)$$02.get("en_us");
                }
                if ($$1 == null) {
                    $$1 = (String)$$02.values().iterator().next();
                }
                return $$1;
            }));
        }
        this.d.ac().ifPresent($$0 -> this.j.add(new ays((MinecraftServer.b)$$0)));
    }

    @Override
    public void a(abw $$0) {
        this.l = $$0.b();
    }

    @Override
    public void a(acb $$0) {
        super.a($$0);
        if ($$0.e().a()) {
            this.a(ays.a);
        }
    }

    @Override
    public void a(act $$0) {
        abb.a($$0, this, this.d.bv());
        if (this.m == null) {
            throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
        }
        this.m.a($$0.b(), this::b);
        this.a(ayt.a);
    }

    @Override
    public void a(acr $$0) {
        this.a(ayr.a);
    }

    @Override
    public void a(acs $$0) {
        abb.a($$0, this, this.d.bv());
        this.a(ayp.a);
        this.e.a(aia.c.a(xq.a(this.d.bc())));
        try {
            bbz $$1 = this.d.aj();
            if ($$1.b(this.i.id()) != null) {
                this.a(bbz.f);
                return;
            }
            yh $$2 = $$1.a(this.e.d(), new bbx(this.i));
            if ($$2 != null) {
                this.a($$2);
                return;
            }
            Objects.requireNonNull(this.n).a(this.e, this.a(this.l));
        }
        catch (Exception $$3) {
            f.error("Couldn't place player in world", (Throwable)$$3);
            this.a(g);
        }
    }

    @Override
    public void d() {
        this.e();
        axv $$0 = this.k;
        if ($$0 != null) {
            try {
                if ($$0.a()) {
                    this.a($$0.b());
                }
            }
            catch (Exception $$1) {
                f.error("Failed to tick configuration task {}", (Object)$$0.b(), (Object)$$1);
                this.a(h);
            }
        }
        if (this.n != null) {
            this.n.c();
        }
    }

    private void o() {
        if (this.k != null) {
            throw new IllegalStateException("Task " + this.k.b().a() + " has not finished yet");
        }
        if (!this.c()) {
            return;
        }
        axv $$0 = this.j.poll();
        if ($$0 != null) {
            this.k = $$0;
            try {
                $$0.a(this::b);
            }
            catch (Exception $$1) {
                f.error("Failed to start configuration task {}", (Object)$$0.b(), (Object)$$1);
                this.a(h);
            }
        }
    }

    private void a(axv.a $$0) {
        axv.a $$1;
        axv.a a2 = $$1 = this.k != null ? this.k.b() : null;
        if (!$$0.equals($$1)) {
            throw new IllegalStateException("Unexpected request for task finish, current task: " + String.valueOf($$1) + ", requested: " + String.valueOf($$0));
        }
        this.k = null;
        this.o();
    }
}

