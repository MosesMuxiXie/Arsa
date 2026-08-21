/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ani {
    private static final Logger a = LogUtils.getLogger();
    private static final amo b = amo.b("tick");
    private static final amo c = amo.b("load");
    private final MinecraftServer d;
    private List<ht<ed>> e = ImmutableList.of();
    private boolean f;
    private anh g;

    public ani(MinecraftServer $$0, anh $$1) {
        this.d = $$0;
        this.g = $$1;
        this.b($$1);
    }

    public CommandDispatcher<ed> a() {
        return this.d.aF().a();
    }

    public void b() {
        if (!this.d.aR().i()) {
            return;
        }
        if (this.f) {
            this.f = false;
            List<ht<ed>> $$0 = this.g.b(c);
            this.a($$0, c);
        }
        this.a(this.e, b);
    }

    private void a(Collection<ht<ed>> $$0, amo $$1) {
        bzl.a().a($$1::toString);
        for (ht<ed> $$2 : $$0) {
            this.a($$2, this.c());
        }
        bzl.a().c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ht<ed> $$0, ed $$1) {
        bzm $$22 = bzl.a();
        $$22.a(() -> "function " + String.valueOf($$0.a()));
        try {
            hv<ed> $$3 = $$0.a(null, this.a());
            ee.a($$1, $$2 -> hg.a($$2, $$3, $$1, ea.a));
        }
        catch (eg $$3) {
        }
        catch (Exception $$4) {
            a.warn("Failed to execute function {}", (Object)$$0.a(), (Object)$$4);
        }
        finally {
            $$22.c();
        }
    }

    public void a(anh $$0) {
        this.g = $$0;
        this.b($$0);
    }

    private void b(anh $$0) {
        this.e = List.copyOf($$0.b(b));
        this.f = true;
    }

    public ed c() {
        return this.d.aG().a(bbh.c).a();
    }

    public Optional<ht<ed>> a(amo $$0) {
        return this.g.a($$0);
    }

    public List<ht<ed>> b(amo $$0) {
        return this.g.b($$0);
    }

    public Iterable<amo> d() {
        return this.g.a().keySet();
    }

    public Iterable<amo> e() {
        return this.g.b();
    }
}

