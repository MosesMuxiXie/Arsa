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

public class bbw
extends bbt<String> {
    public bbw(String $$0) {
        this($$0, (Date)null, (String)null, (Date)null, (String)null);
    }

    public bbw(String $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public yh f() {
        return yh.b(String.valueOf(this.h()));
    }

    public bbw(JsonObject $$0) {
        super(bbw.b($$0), $$0);
    }

    private static String b(JsonObject $$0) {
        return $$0.has("ip") ? $$0.get("ip").getAsString() : null;
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.h() == null) {
            return;
        }
        $$0.addProperty("ip", (String)this.h());
        super.a($$0);
    }
}

