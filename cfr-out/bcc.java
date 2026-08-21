/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class bcc
extends bce<bbx> {
    private final bbh a;
    private final boolean b;

    public bcc(bbx $$0, bbh $$1, boolean $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    public bcc(JsonObject $$0) {
        super(bbx.a($$0));
        bbl $$1 = $$0.has("level") ? bbl.a($$0.get("level").getAsInt()) : bbl.a;
        this.a = bbh.a($$1);
        this.b = $$0.has("bypassesPlayerLimit") && $$0.get("bypassesPlayerLimit").getAsBoolean();
    }

    public bbh a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.h() == null) {
            return;
        }
        ((bbx)this.h()).b($$0);
        $$0.addProperty("level", (Number)this.a.a().a());
        $$0.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.b));
    }
}

