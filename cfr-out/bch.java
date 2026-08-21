/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonObject;
import java.util.Date;
import org.jspecify.annotations.Nullable;

public class bch
extends bbt<bbx> {
    private static final yh g = yh.c("commands.banlist.entry.unknown");

    public bch(@Nullable bbx $$0) {
        this($$0, (Date)null, (String)null, (Date)null, (String)null);
    }

    public bch(@Nullable bbx $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    public bch(JsonObject $$0) {
        super(bbx.a($$0), $$0);
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.h() == null) {
            return;
        }
        ((bbx)this.h()).b($$0);
        super.a($$0);
    }

    @Override
    public yh f() {
        bbx $$0 = (bbx)this.h();
        return $$0 != null ? yh.b($$0.b()) : g;
    }
}

