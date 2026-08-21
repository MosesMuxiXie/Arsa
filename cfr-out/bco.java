/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bco
implements ec {
    private static final String b = "Rcon";
    private static final yh c = yh.b("Rcon");
    private final StringBuffer d = new StringBuffer();
    private final MinecraftServer e;

    public bco(MinecraftServer $$0) {
        this.e = $$0;
    }

    public void e() {
        this.d.setLength(0);
    }

    public String f() {
        return this.d.toString();
    }

    public ed g() {
        axf $$0 = this.e.N();
        return new ed(this, ftm.a($$0.C().b()), ftl.a, $$0, bbh.e, b, c, this.e, null);
    }

    @Override
    public void a(yh $$0) {
        this.d.append($$0.getString());
    }

    @Override
    public boolean x_() {
        return true;
    }

    @Override
    public boolean y_() {
        return true;
    }

    @Override
    public boolean c() {
        return this.e.m();
    }
}

