/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ipz
extends bbz {
    private static final Logger g = LogUtils.getLogger();
    private @Nullable uz h;

    public ipz(iqa $$0, jk<anc> $$1, fnl $$2) {
        super($$0, $$1, $$2, $$0.C());
        this.a(10);
    }

    @Override
    protected void a(axg $$0) {
        if (this.b().a($$0.gJ())) {
            try (bgp.j $$1 = new bgp.j($$0.es(), g);){
                fnp $$2 = fnp.a($$1, $$0.eo());
                $$0.d($$2);
                this.h = $$2.b();
            }
        }
        super.a($$0);
    }

    @Override
    public yh a(SocketAddress $$0, bbx $$1) {
        if (this.b().a($$1) && this.a($$1.b()) != null) {
            return yh.c("multiplayer.disconnect.name_taken");
        }
        return super.a($$0, $$1);
    }

    public iqa b() {
        return (iqa)super.c();
    }

    @Override
    public @Nullable uz r() {
        return this.h;
    }

    @Override
    public /* synthetic */ MinecraftServer c() {
        return this.b();
    }
}

