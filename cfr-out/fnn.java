/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public interface fnn
extends fnu {
    public String d();

    public void a(boolean var1);

    public int i();

    public void c(int var1);

    public void b(int var1);

    public int g();

    @Override
    default public void a(n $$0, dwq $$1) {
        fnu.super.a($$0, $$1);
        $$0.a("Level name", this::d);
        $$0.a("Level game mode", () -> String.format(Locale.ROOT, "Game mode: %s (ID %d). Hardcore: %b. Commands: %b", this.j().b(), this.j().a(), this.k(), this.l()));
        $$0.a("Level weather", () -> String.format(Locale.ROOT, "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.i(), this.h(), this.g(), this.f()));
    }

    public int e();

    public void a(int var1);

    public int s();

    public void d(int var1);

    public int t();

    public void e(int var1);

    public @Nullable UUID u();

    public void a(UUID var1);

    public dwl j();

    @Deprecated
    public Optional<eqa.c> o();

    @Deprecated
    public void a(Optional<eqa.c> var1);

    public boolean m();

    public void c(boolean var1);

    public boolean l();

    public void a(dwl var1);

    public fsz<MinecraftServer> r();

    public void a(long var1);

    public void b(long var1);

    public eua n();
}

