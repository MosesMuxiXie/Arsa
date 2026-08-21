/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class hiq {
    private final GameProfile a;
    private @Nullable Supplier<ddq> b;
    private dwl c = dwl.e;
    private int d;
    private @Nullable yh e;
    private boolean f = true;
    private @Nullable yz g;
    private ze h;
    private int i;

    public hiq(GameProfile $$0, boolean $$1) {
        this.a = $$0;
        this.h = hiq.c($$1);
    }

    private static Supplier<ddq> a(GameProfile $$0) {
        gfj $$1 = gfj.V();
        boolean $$2 = !$$1.b($$0.id());
        return $$1.at().a($$0, $$2);
    }

    public GameProfile a() {
        return this.a;
    }

    public @Nullable yz b() {
        return this.g;
    }

    public ze c() {
        return this.h;
    }

    public boolean d() {
        return this.g != null;
    }

    protected void a(yz $$0) {
        this.g = $$0;
        this.h = $$0.a(dds.b);
    }

    protected void a(boolean $$0) {
        this.g = null;
        this.h = hiq.c($$0);
    }

    private static ze c(boolean $$0) {
        return $$0 ? ze.c : ze.b;
    }

    public dwl e() {
        return this.c;
    }

    protected void a(dwl $$0) {
        this.c = $$0;
    }

    public int f() {
        return this.d;
    }

    protected void a(int $$0) {
        this.d = $$0;
    }

    public ddq g() {
        if (this.b == null) {
            this.b = hiq.a(this.a);
        }
        return this.b.get();
    }

    public @Nullable fum h() {
        return gfj.V().r.ab().e(this.a().name());
    }

    public void a(@Nullable yh $$0) {
        this.e = $$0;
    }

    public @Nullable yh i() {
        return this.e;
    }

    public void b(boolean $$0) {
        this.f = $$0;
    }

    public boolean j() {
        return this.f;
    }

    public void b(int $$0) {
        this.i = $$0;
    }

    public int k() {
        return this.i;
    }
}

