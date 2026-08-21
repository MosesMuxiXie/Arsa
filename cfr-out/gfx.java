/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UndashedUuid
 */
import com.mojang.util.UndashedUuid;
import java.util.Optional;
import java.util.UUID;

public class gfx {
    private final String a;
    private final UUID b;
    private final String c;
    private final Optional<String> d;
    private final Optional<String> e;

    public gfx(String $$0, UUID $$1, String $$2, Optional<String> $$3, Optional<String> $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public String a() {
        return "token:" + this.c + ":" + UndashedUuid.toString((UUID)this.b);
    }

    public UUID b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public Optional<String> e() {
        return this.e;
    }

    public Optional<String> f() {
        return this.d;
    }
}

