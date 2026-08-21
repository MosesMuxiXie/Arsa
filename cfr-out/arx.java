/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arx
extends bbz {
    private static final Logger g = LogUtils.getLogger();

    public arx(ary $$0, jk<anc> $$1, fnl $$2) {
        super($$0, $$1, $$2, $$0.C());
        this.a($$0.bx());
        this.b($$0.by());
        this.z();
        this.x();
        this.y();
        this.w();
        this.A();
        this.C();
        this.B();
        if (!this.i().c().exists()) {
            this.D();
        }
    }

    @Override
    public void a() {
        this.C();
    }

    private void w() {
        try {
            this.g().f();
        }
        catch (IOException $$0) {
            g.warn("Failed to save ip banlist: ", (Throwable)$$0);
        }
    }

    private void x() {
        try {
            this.f().f();
        }
        catch (IOException $$0) {
            g.warn("Failed to save user banlist: ", (Throwable)$$0);
        }
    }

    private void y() {
        try {
            this.g().g();
        }
        catch (IOException $$0) {
            g.warn("Failed to load ip banlist: ", (Throwable)$$0);
        }
    }

    private void z() {
        try {
            this.f().g();
        }
        catch (IOException $$0) {
            g.warn("Failed to load user banlist: ", (Throwable)$$0);
        }
    }

    private void A() {
        try {
            this.k().g();
        }
        catch (Exception $$0) {
            g.warn("Failed to load operators list: ", (Throwable)$$0);
        }
    }

    private void B() {
        try {
            this.k().f();
        }
        catch (Exception $$0) {
            g.warn("Failed to save operators list: ", (Throwable)$$0);
        }
    }

    private void C() {
        try {
            this.i().g();
        }
        catch (Exception $$0) {
            g.warn("Failed to load white-list: ", (Throwable)$$0);
        }
    }

    private void D() {
        try {
            this.i().f();
        }
        catch (Exception $$0) {
            g.warn("Failed to save white-list: ", (Throwable)$$0);
        }
    }

    @Override
    public boolean a(bbx $$0) {
        return !this.o() || this.f($$0) || this.i().a($$0);
    }

    public ary b() {
        return (ary)super.c();
    }

    @Override
    public boolean b(bbx $$0) {
        return this.k().b($$0);
    }

    @Override
    public /* synthetic */ MinecraftServer c() {
        return this.b();
    }
}

