/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.UserApiService
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class hjn {
    private static final int a = 1024;
    private final hje b;
    private final hjk c;
    private final hiz d;
    private @Nullable hjj e;

    public hjn(hje $$0, hjk $$1, hiz $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public static hjn a(hjk $$0, UserApiService $$1) {
        hiz $$2 = new hiz(1024);
        hje $$3 = hje.a($$0, $$1);
        return new hjn($$3, $$0, $$2);
    }

    public void a(gfj $$0, gsb $$1, Runnable $$2, boolean $$3) {
        if (this.e != null) {
            hjj $$42 = this.e.b();
            $$0.a(new gra($$4 -> {
                this.a((hjj)null);
                if ($$4) {
                    $$0.a($$42.a($$1, this));
                } else {
                    $$2.run();
                }
            }, yh.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"), yh.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"), yh.c("gui.abuseReport.draft.edit"), yh.c("gui.abuseReport.draft.discard")));
        } else {
            $$2.run();
        }
    }

    public hje a() {
        return this.b;
    }

    public hiz b() {
        return this.d;
    }

    public boolean a(hjk $$0) {
        return Objects.equals(this.c, $$0);
    }

    public void a(@Nullable hjj $$0) {
        this.e = $$0;
    }

    public boolean c() {
        return this.e != null;
    }

    public boolean a(UUID $$0) {
        return this.c() && this.e.a($$0);
    }
}

