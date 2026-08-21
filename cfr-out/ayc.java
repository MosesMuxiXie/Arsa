/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class ayc
implements akm {
    private final MinecraftServer b;
    private final wu c;

    public ayc(MinecraftServer $$0, wu $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void a(akj $$0) {
        if ($$0.g() != aki.b) {
            throw new UnsupportedOperationException("Invalid intention " + String.valueOf((Object)$$0.g()));
        }
        this.c.a(akv.b, new ayk(this.b, this.c, false));
        this.c.a(akv.d);
    }

    @Override
    public void a(ww $$0) {
    }

    @Override
    public boolean c() {
        return this.c.i();
    }
}

